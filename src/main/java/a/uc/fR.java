package a.uc;

import a.ax;
import a.ch;
import a.ck;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@nesquik.mytheria.systems.modules.api.ModuleInfo(name = "Auction Helper", category = ax.VISUALS, desc = "modules.descriptions.auction_helper")
public class fR extends aJ {
    private static fR instance;

    private static final Pattern PRICE_PATTERN = Pattern.compile("(\\d[\\d\\s,._]{0,20})");
    private static final String[] BUY_TRIGGERS = {"купить", "buy", "auction"};
    private static final String[] PRICE_TRIGGERS = {"цена", "price", "стоимость"};
    private static final long MAX_REASONABLE_PRICE = 10_000_000_000L;

    public final ch a = new ch(this, "modules.settings.auction_helper.show_highlights").enabled(true);
    public final ch b = new ch(this, "modules.settings.auction_helper.show_stats").enabled(true);

    public static final int RANK_1_COLOR = 0xFF00AA00;
    public static final int RANK_2_COLOR = 0xFF5555FF;
    public static final int RANK_3_COLOR = 0xFFFFAA00;

    public static final int RANK_1_BORDER = 0xCC00AA00;
    public static final int RANK_2_BORDER = 0xCC5555FF;
    public static final int RANK_3_BORDER = 0xCCFFAA00;

    private final Map<Slot, AuctionEntry> cachedEntries = new HashMap<>();
    private List<AuctionEntry> topEntries = List.of();
    private AuctionStats cachedStats = null;
    private HandledScreen<?> lastScreen = null;

    public fR() {
        instance = this;
    }

    public static fR getInstance() {
        return instance;
    }

    public static boolean isHighlightsEnabled() {
        return instance != null && instance.isEnabled() && instance.a.isEnabled();
    }

    public static boolean isStatsEnabled() {
        return instance != null && instance.isEnabled() && instance.b.isEnabled();
    }

    public List<AuctionEntry> getTopEntries() {
        return topEntries;
    }

    public AuctionStats getCachedStats() {
        return cachedStats;
    }

    public void refresh(HandledScreen<?> screen) {
        if (screen == null || screen.getScreenHandler() == null) return;
        if (!isEnabled()) return;

        if (lastScreen != screen) {
            cachedEntries.clear();
            topEntries = List.of();
            cachedStats = null;
            lastScreen = screen;
        }

        cachedEntries.clear();
        List<AuctionEntry> allEntries = new ArrayList<>();

        for (Slot slot : screen.getScreenHandler().slots) {
            if (slot == null || slot.getStack().isEmpty()) continue;
            if (slot.getStack().getItem() == net.minecraft.item.Items.AIR) continue;

            List<Text> tooltip = getTooltipLines(slot.getStack());
            if (tooltip == null) continue;

            long price = detectPrice(tooltip);
            if (price < 0 || price > MAX_REASONABLE_PRICE) continue;

            int count = slot.getStack().getCount();
            double unitPrice = count > 0 ? (double) price / count : price;

            AuctionEntry entry = new AuctionEntry(slot, price, unitPrice, count);
            cachedEntries.put(slot, entry);
            allEntries.add(entry);
        }

        if (allEntries.isEmpty()) {
            topEntries = List.of();
            cachedStats = null;
            return;
        }

        allEntries.sort(Comparator.comparingDouble(AuctionEntry::unitPrice)
                .thenComparingLong(AuctionEntry::totalPrice)
                .thenComparingInt(AuctionEntry::count));

        topEntries = allEntries.size() <= 3
                ? List.copyOf(allEntries)
                : List.copyOf(allEntries.subList(0, 3));

        long minTotal = allEntries.stream().mapToLong(AuctionEntry::totalPrice).min().orElse(0);
        long minUnit = allEntries.stream().mapToLong(e -> Math.round(e.unitPrice())).min().orElse(0);
        long avgTotal = (long) allEntries.stream().mapToLong(AuctionEntry::totalPrice).average().orElse(0);
        long avgUnit = (long) allEntries.stream().mapToDouble(AuctionEntry::unitPrice).average().orElse(0);

        cachedStats = new AuctionStats(allEntries.size(), minTotal, minUnit, avgTotal, avgUnit);
    }

    private boolean detectAuctionItem(List<Text> tooltip) {
        for (Text line : tooltip) {
            String text = line.getString().toLowerCase(java.util.Locale.ROOT);
            for (String trigger : BUY_TRIGGERS) {
                if (text.contains(trigger)) return true;
            }
            for (String trigger : PRICE_TRIGGERS) {
                if (text.contains(trigger)) return true;
            }
        }
        return false;
    }

    private long detectPrice(List<Text> tooltip) {
        for (Text line : tooltip) {
            String text = line.getString().toLowerCase(java.util.Locale.ROOT);
            boolean hasPriceTrigger = false;
            for (String trigger : PRICE_TRIGGERS) {
                if (text.contains(trigger)) { hasPriceTrigger = true; break; }
            }
            for (String trigger : BUY_TRIGGERS) {
                if (text.contains(trigger)) { hasPriceTrigger = true; break; }
            }

            if (hasPriceTrigger) {
                Matcher matcher = PRICE_PATTERN.matcher(line.getString().replaceAll("[^\\d\\s,.\\d]", ""));
                if (matcher.find()) {
                    String priceStr = matcher.group(1).replaceAll("[\\s,.\\s_]", "");
                    try {
                        return Long.parseLong(priceStr);
                    } catch (NumberFormatException ignored) {}
                }
            }

            String raw = line.getString().replaceAll("[^\\d]", "");
            if (!raw.isEmpty() && raw.length() <= 11) {
                try {
                    long val = Long.parseLong(raw);
                    if (val > 0 && val < MAX_REASONABLE_PRICE && text.length() < 20) {
                        return val;
                    }
                } catch (NumberFormatException ignored) {}
            }
        }
        return -1;
    }

    private List<Text> getTooltipLines(net.minecraft.item.ItemStack stack) {
        try {
            return stack.getTooltip(
                net.minecraft.item.Item.TooltipContext.DEFAULT,
                net.minecraft.client.MinecraftClient.getInstance().player,
                net.minecraft.item.tooltip.TooltipType.BASIC
            );
        } catch (Exception e) {
            return null;
        }
    }

    public int getRankForSlot(Slot slot) {
        for (int i = 0; i < topEntries.size(); i++) {
            if (topEntries.get(i).slot() == slot) return i;
        }
        return -1;
    }

    public static int rankBorderColor(int rank) {
        return switch (rank) {
            case 0 -> RANK_1_BORDER;
            case 1 -> RANK_2_BORDER;
            default -> RANK_3_BORDER;
        };
    }

    public static int rankFillColor(int rank) {
        return switch (rank) {
            case 0 -> (RANK_1_COLOR & 0x00FFFFFF) | 0x20000000;
            case 1 -> (RANK_2_COLOR & 0x00FFFFFF) | 0x20000000;
            default -> (RANK_3_COLOR & 0x00FFFFFF) | 0x20000000;
        };
    }

    public record AuctionEntry(Slot slot, long totalPrice, double unitPrice, int count) {}
    public record AuctionStats(int auctionItems, long minTotalPrice, long minUnitPrice, long avgTotalPrice, long avgUnitPrice) {}
}
