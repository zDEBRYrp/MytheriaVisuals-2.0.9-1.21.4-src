package a.uc;

import a.ax;
import a.ch;
import nesquik.mytheria.systems.setting.settings.SliderSetting;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@nesquik.mytheria.systems.modules.api.ModuleInfo(name = "Auction Helper", category = ax.VISUALS, desc = "modules.descriptions.auction_helper")
public class fR extends aJ {
    private static fR instance;

    private static final long MAX_REASONABLE_PRICE = 10_000_000_000L;
    private static final Pattern STRIPFormatting = Pattern.compile("\u00a7.");

    public final ch showTopPrices = new ch(this, "modules.settings.auction_helper.show_top_prices").enabled(true);
    public final ch showIdentical = new ch(this, "modules.settings.auction_helper.show_identical").enabled(false);
    public final ch showStats = new ch(this, "modules.settings.auction_helper.show_stats").enabled(true);
    public final SliderSetting topCount = new SliderSetting(this, "modules.settings.auction_helper.top_count").min(1.0F).max(15.0F).step(1.0F).currentValue(3.0F);

    private static final int COLOR_GREEN  = 0xFF00CC00;
    private static final int COLOR_ORANGE = 0xFFFFAA00;
    private static final int COLOR_YELLOW = 0xFFCCCC00;
    private static final int COLOR_RED    = 0xFFFF4444;
    private static final int COLOR_CYAN   = 0xFF00CCCC;
    private static final int COLOR_PURPLE = 0xFFCC44FF;
    private static final int COLOR_PINK   = 0xFFFF66AA;
    private static final int COLOR_LIME   = 0xFF88FF44;
    private static final int COLOR_BLUE   = 0xFF4488FF;
    private static final int COLOR_WHITE  = 0xFFFFFFFF;
    private static final int[] GROUP_PALETTE = {
        0xFF00CC00, 0xFFFFAA00, 0xFF4488FF, 0xFFFF44AA,
        0xFFCCCC00, 0xFF00CCCC, 0xFFFF4444, 0xFF88FF44,
        0xFFCC44FF, 0xFFFF8844, 0xFF44CCFF, 0xFFFF4488
    };

    private List<AuctionEntry> topEntries = List.of();
    private final Map<String, Integer> fpToBestRank = new LinkedHashMap<>();
    private AuctionStats cachedStats = null;

    private List<ItemGroup> itemGroups = List.of();
    private final Map<String, Integer> groupColorMap = new LinkedHashMap<>();

    private HandledScreen<?> lastScreen = null;
    private boolean isAuctionScreen = false;

    public fR() { instance = this; }
    public static fR getInstance() { return instance; }

    public boolean isAuctionDetected() { return isAuctionScreen; }
    public boolean isIdenticalMode() { return isEnabled() && showIdentical.isEnabled(); }
    public boolean isTopPricesMode() { return isEnabled() && showTopPrices.isEnabled(); }
    public int getTopCount() { return (int) topCount.getCurrentValue(); }
    public List<AuctionEntry> getTopEntries() { return topEntries; }
    public List<ItemGroup> getItemGroups() { return itemGroups; }
    public AuctionStats getCachedStats() { return cachedStats; }

    public int getRankForSlot(Slot slot) {
        String fp = fingerprint(slot.getStack());
        return fpToBestRank.getOrDefault(fp, -1);
    }

    public int getGroupColorForSlot(Slot slot) {
        String fp = fingerprint(slot.getStack());
        Integer c = groupColorMap.get(fp);
        return c != null ? c : COLOR_WHITE;
    }

    public int getGroupCount(Slot slot) {
        String fp = fingerprint(slot.getStack());
        for (ItemGroup g : itemGroups) {
            if (g.fingerprint().equals(fp)) return g.count();
        }
        return 0;
    }

    public void refresh(HandledScreen<?> screen) {
        if (screen == null || screen.getScreenHandler() == null) return;
        if (!isEnabled()) return;

        if (lastScreen != screen) {
            topEntries = List.of();
            fpToBestRank.clear();
            itemGroups = List.of();
            groupColorMap.clear();
            cachedStats = null;
            lastScreen = screen;
            isAuctionScreen = false;
        }

        if (showIdentical.isEnabled()) {
            refreshIdentical(screen);
        } else if (showTopPrices.isEnabled()) {
            refreshPrice(screen);
        } else {
            topEntries = List.of();
            fpToBestRank.clear();
            isAuctionScreen = false;
            cachedStats = null;
        }
    }

    private void refreshIdentical(HandledScreen<?> screen) {
        Map<String, List<Slot>> groups = new HashMap<>();
        for (Slot slot : screen.getScreenHandler().slots) {
            if (slot == null || slot.getStack().isEmpty()) continue;
            String fp = fingerprint(slot.getStack());
            groups.computeIfAbsent(fp, k -> new ArrayList<>()).add(slot);
        }

        itemGroups = groups.entrySet().stream()
                .filter(e -> e.getValue().size() >= 2)
                .sorted(Comparator.<Map.Entry<String, List<Slot>>, Integer>comparing(e -> e.getValue().size()).reversed())
                .map(e -> new ItemGroup(e.getKey(), List.copyOf(e.getValue()), e.getValue().size()))
                .toList();

        groupColorMap.clear();
        for (int i = 0; i < itemGroups.size(); i++) {
            int color = GROUP_PALETTE[i % GROUP_PALETTE.length];
            for (String fp = itemGroups.get(i).fingerprint(); !groupColorMap.containsKey(fp); ) {
                groupColorMap.put(fp, color);
                break;
            }
        }

        isAuctionScreen = !itemGroups.isEmpty();
        if (!isAuctionScreen) {
            cachedStats = null;
        } else {
            int totalItems = itemGroups.stream().mapToInt(ItemGroup::count).sum();
            cachedStats = new AuctionStats(totalItems, 0, 0, 0, 0);
        }
    }

    private void refreshPrice(HandledScreen<?> screen) {
        List<AuctionEntry> allEntries = new ArrayList<>();

        for (Slot slot : screen.getScreenHandler().slots) {
            if (slot == null || slot.getStack().isEmpty()) continue;
            long price = detectPrice(slot.getStack());
            if (price <= 0 || price > MAX_REASONABLE_PRICE) continue;
            int count = slot.getStack().getCount();
            double unitPrice = count > 0 ? (double) price / count : price;
            allEntries.add(new AuctionEntry(slot, price, unitPrice, count));
        }

        isAuctionScreen = !allEntries.isEmpty();
        if (allEntries.isEmpty()) {
            topEntries = List.of();
            fpToBestRank.clear();
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

        fpToBestRank.clear();
        for (int i = 0; i < topEntries.size(); i++) {
            String fp = fingerprint(topEntries.get(i).slot().getStack());
            fpToBestRank.putIfAbsent(fp, i);
        }

        long minTotal = allEntries.stream().mapToLong(AuctionEntry::totalPrice).min().orElse(0);
        long minUnit = allEntries.stream().mapToLong(e -> Math.round(e.unitPrice())).min().orElse(0);
        long avgTotal = (long) allEntries.stream().mapToLong(AuctionEntry::totalPrice).average().orElse(0);
        long avgUnit = (long) allEntries.stream().mapToDouble(AuctionEntry::unitPrice).average().orElse(0);
        cachedStats = new AuctionStats(allEntries.size(), minTotal, minUnit, avgTotal, avgUnit);
    }

    private long detectPrice(ItemStack stack) {
        List<Text> lines = new ArrayList<>();
        try {
            List<Text> tooltip = stack.getTooltip(
                net.minecraft.item.Item.TooltipContext.DEFAULT,
                net.minecraft.client.MinecraftClient.getInstance().player,
                net.minecraft.item.tooltip.TooltipType.BASIC
            );
            if (tooltip != null) lines.addAll(tooltip);
        } catch (Exception ignored) {}

        try {
            var lore = stack.get(DataComponentTypes.LORE);
            if (lore != null) lines.addAll(lore.styledLines());
        } catch (Exception ignored) {}

        for (Text line : lines) {
            String text = STRIPFormatting.matcher(line.getString()).replaceAll("");
            String lower = text.toLowerCase(java.util.Locale.ROOT);
            if (hasTrigger(lower) || hasDollarPrice(text)) {
                return extractPrice(lower);
            }
        }
        return -1;
    }

    private static boolean hasTrigger(String lower) {
        String alpha = lower.replaceAll("[^a-zA-Z\\u0400-\\u04FF]", "");
        return alpha.contains("\u0446\u0435\u043d\u0430") || alpha.contains("price") || alpha.contains("\u0441\u0442\u043e\u0438\u043c\u043e\u0441\u0442\u044c");
    }

    private static boolean hasDollarPrice(String text) {
        return text.contains("$") && text.replaceAll("[^\\d]", "").length() >= 2;
    }

    private static long extractPrice(String text) {
        String digits = text.replaceAll("[^\\d]", "");
        if (digits.isEmpty()) return -1;
        try {
            long val = Long.parseLong(digits);
            return (val > 0 && val < MAX_REASONABLE_PRICE) ? val : -1;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static String fingerprint(ItemStack stack) {
        StringBuilder sb = new StringBuilder();
        sb.append(stack.getItem().toString());
        sb.append("|").append(stack.getCount());
        try {
            var enchants = stack.get(DataComponentTypes.ENCHANTMENTS);
            if (enchants != null) {
                var entries = new ArrayList<>(enchants.getEnchantmentEntries());
                entries.sort(Comparator.comparingInt(e -> e.getKey().value().toString().hashCode()));
                for (var entry : entries) {
                    sb.append("|e:").append(entry.getKey().value()).append(":").append(entry.getIntValue());
                }
            }
            var storedEnchants = stack.get(DataComponentTypes.STORED_ENCHANTMENTS);
            if (storedEnchants != null) {
                var entries = new ArrayList<>(storedEnchants.getEnchantmentEntries());
                entries.sort(Comparator.comparingInt(e -> e.getKey().value().toString().hashCode()));
                for (var entry : entries) {
                    sb.append("|se:").append(entry.getKey().value()).append(":").append(entry.getIntValue());
                }
            }
            var lore = stack.get(DataComponentTypes.LORE);
            if (lore != null) {
                for (Text line : lore.styledLines()) {
                    sb.append("|l:").append(line.getString());
                }
            }
        } catch (Exception ignored) {}
        return sb.toString();
    }

    private static int[] getRankColors(int rank, int total) {
        if (total <= 3) {
            return switch (rank) {
                case 0 -> new int[]{COLOR_GREEN, 0xCC00CC00};
                case 1 -> new int[]{COLOR_YELLOW, 0xCCCCCC00};
                default -> new int[]{COLOR_RED, 0xCCCC0000};
            };
        }
        int orangeThreshold = Math.max(1, total / 4);
        if (rank == 0) return new int[]{COLOR_GREEN, 0xCC00CC00};
        if (rank < orangeThreshold) return new int[]{COLOR_ORANGE, 0xCCCC8800};
        if (rank < total - Math.max(1, total / 4)) return new int[]{COLOR_YELLOW, 0xCCCCCC00};
        return new int[]{COLOR_RED, 0xCCCC0000};
    }

    public int rankBorderColor(int rank) { return getRankColors(rank, topEntries.size())[1]; }
    public int rankFillColor(int rank) { return (getRankColors(rank, topEntries.size())[0] & 0x00FFFFFF) | 0x20000000; }

    public record AuctionEntry(Slot slot, long totalPrice, double unitPrice, int count) {}
    public record AuctionStats(int auctionItems, long minTotalPrice, long minUnitPrice, long avgTotalPrice, long avgUnitPrice) {}
    public record ItemGroup(String fingerprint, List<Slot> slots, int count) {}
}
