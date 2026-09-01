package a.uc;

import a.ax;
import nesquik.mytheria.systems.setting.settings.SliderSetting;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@nesquik.mytheria.systems.modules.api.ModuleInfo(name = "Auction Helper", category = ax.VISUALS, desc = "modules.descriptions.auction_helper")
public class fR extends aJ {
    private static fR instance;

    private static final long MAX_REASONABLE_PRICE = 10_000_000_000L;
    private static final String[] PRICE_TRIGGERS = {"цена", "price", "стоимость", "купить", "buy", "auction"};

    public final SliderSetting topCount = new SliderSetting(this, "modules.settings.auction_helper.top_count").min(1.0F).max(15.0F).step(1.0F).currentValue(3.0F);

    private static final int COLOR_GREEN = 0xFF00CC00;
    private static final int COLOR_ORANGE = 0xFFCC8800;
    private static final int COLOR_YELLOW = 0xFFCCCC00;
    private static final int COLOR_RED = 0xFFCC0000;

    private static final int BORDER_GREEN = 0xCC00CC00;
    private static final int BORDER_ORANGE = 0xCCCC8800;
    private static final int BORDER_YELLOW = 0xCCCCCC00;
    private static final int BORDER_RED = 0xCCCC0000;

    private final Map<Slot, AuctionEntry> cachedEntries = new HashMap<>();
    private List<AuctionEntry> topEntries = List.of();
    private AuctionStats cachedStats = null;
    private HandledScreen<?> lastScreen = null;
    private boolean isAuctionScreen = false;

    public fR() {
        instance = this;
    }

    public static fR getInstance() {
        return instance;
    }

    public boolean isAuctionDetected() {
        return isAuctionScreen;
    }

    public int getTopCount() {
        return (int) topCount.getCurrentValue();
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
            isAuctionScreen = false;
        }

        cachedEntries.clear();
        List<AuctionEntry> allEntries = new ArrayList<>();

        for (Slot slot : screen.getScreenHandler().slots) {
            if (slot == null || slot.getStack().isEmpty()) continue;

            List<Text> tooltip = getTooltipLines(slot.getStack());
            if (tooltip == null) continue;

            long price = detectPrice(tooltip);
            if (price <= 0 || price > MAX_REASONABLE_PRICE) continue;

            int count = slot.getStack().getCount();
            double unitPrice = count > 0 ? (double) price / count : price;

            AuctionEntry entry = new AuctionEntry(slot, price, unitPrice, count);
            cachedEntries.put(slot, entry);
            allEntries.add(entry);
        }

        isAuctionScreen = !allEntries.isEmpty();

        if (allEntries.isEmpty()) {
            topEntries = List.of();
            cachedStats = null;
            return;
        }

        allEntries.sort(Comparator.comparingDouble(AuctionEntry::unitPrice)
                .thenComparingLong(AuctionEntry::totalPrice)
                .thenComparingInt(AuctionEntry::count));

        int limit = getTopCount();
        topEntries = allEntries.size() <= limit
                ? List.copyOf(allEntries)
                : List.copyOf(allEntries.subList(0, limit));

        long minTotal = allEntries.stream().mapToLong(AuctionEntry::totalPrice).min().orElse(0);
        long minUnit = allEntries.stream().mapToLong(e -> Math.round(e.unitPrice())).min().orElse(0);
        long avgTotal = (long) allEntries.stream().mapToLong(AuctionEntry::totalPrice).average().orElse(0);
        long avgUnit = (long) allEntries.stream().mapToDouble(AuctionEntry::unitPrice).average().orElse(0);

        cachedStats = new AuctionStats(allEntries.size(), minTotal, minUnit, avgTotal, avgUnit);
    }

    private long detectPrice(List<Text> tooltip) {
        for (Text line : tooltip) {
            String text = line.getString().toLowerCase(java.util.Locale.ROOT);
            boolean hasPriceTrigger = false;
            for (String trigger : PRICE_TRIGGERS) {
                if (text.contains(trigger)) {
                    hasPriceTrigger = true;
                    break;
                }
            }
            if (!hasPriceTrigger) continue;

            String raw = line.getString().replaceAll("[^\\d]", "");
            if (raw.length() >= 2 && raw.length() <= 15) {
                try {
                    long val = Long.parseLong(raw);
                    if (val > 0 && val < MAX_REASONABLE_PRICE) {
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

    private static int[] getRankColors(int rank, int total) {
        if (total <= 3) {
            return switch (rank) {
                case 0 -> new int[]{COLOR_GREEN, BORDER_GREEN};
                case 1 -> new int[]{COLOR_YELLOW, BORDER_YELLOW};
                default -> new int[]{COLOR_RED, BORDER_RED};
            };
        }
        int orangeThreshold = Math.max(1, total / 4);
        if (rank == 0) return new int[]{COLOR_GREEN, BORDER_GREEN};
        if (rank < orangeThreshold) return new int[]{COLOR_ORANGE, BORDER_ORANGE};
        if (rank < total - Math.max(1, total / 4)) return new int[]{COLOR_YELLOW, BORDER_YELLOW};
        return new int[]{COLOR_RED, BORDER_RED};
    }

    public int rankBorderColor(int rank) {
        int total = topEntries.size();
        return getRankColors(rank, total)[1];
    }

    public int rankFillColor(int rank) {
        int total = topEntries.size();
        int base = getRankColors(rank, total)[0];
        return (base & 0x00FFFFFF) | 0x20000000;
    }

    public record AuctionEntry(Slot slot, long totalPrice, double unitPrice, int count) {}
    public record AuctionStats(int auctionItems, long minTotalPrice, long minUnitPrice, long avgTotalPrice, long avgUnitPrice) {}
}
