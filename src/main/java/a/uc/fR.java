package a.uc;

import a.ax;
import a.ch;
import nesquik.mytheria.systems.setting.settings.SliderSetting;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@nesquik.mytheria.systems.modules.api.ModuleInfo(name = "Auction Helper", category = ax.VISUALS, desc = "modules.descriptions.auction_helper")
public class fR extends aJ {
    private static fR instance;

    private static final long MAX_REASONABLE_PRICE = 10_000_000_000L;
    private static final String[] PRICE_TRIGGERS = {"\u0446\u0435\u043d\u0430", "price", "\u0441\u0442\u043e\u0438\u043c\u043e\u0441\u0442\u044c"};

    public final ch showStats = new ch(this, "modules.settings.auction_helper.show_stats").enabled(true);
    public final ch showIdentical = new ch(this, "modules.settings.auction_helper.show_identical").enabled(false);
    public final SliderSetting topCount = new SliderSetting(this, "modules.settings.auction_helper.top_count").min(1.0F).max(15.0F).step(1.0F).currentValue(3.0F);

    private static final int COLOR_GREEN = 0xFF00CC00;
    private static final int COLOR_ORANGE = 0xFFCC8800;
    private static final int COLOR_YELLOW = 0xFFCCCC00;
    private static final int COLOR_RED = 0xFFCC0000;
    private static final int BORDER_GREEN = 0xCC00CC00;
    private static final int BORDER_ORANGE = 0xCCCC8800;
    private static final int BORDER_YELLOW = 0xCCCCCC00;
    private static final int BORDER_RED = 0xCCCC0000;

    private List<AuctionEntry> topEntries = List.of();
    private final Map<String, Integer> fpToBestRank = new LinkedHashMap<>();
    private AuctionStats cachedStats = null;

    private List<ItemGroup> itemGroups = List.of();
    private final Map<String, Integer> groupColors = new LinkedHashMap<>();

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

    public boolean isIdenticalMode() {
        return isEnabled() && showIdentical.isEnabled();
    }

    public int getTopCount() {
        return (int) topCount.getCurrentValue();
    }

    public List<AuctionEntry> getTopEntries() {
        return topEntries;
    }

    public List<ItemGroup> getItemGroups() {
        return itemGroups;
    }

    public AuctionStats getCachedStats() {
        return cachedStats;
    }

    public int getRankForSlot(Slot slot) {
        String fp = fingerprint(slot.getStack());
        return fpToBestRank.getOrDefault(fp, -1);
    }

    public int getGroupColor(Slot slot) {
        String fp = fingerprint(slot.getStack());
        Integer color = groupColors.get(fp);
        return color != null ? color : 0xFFFFFFFF;
    }

    public int getGroupBorderColor(Slot slot) {
        return getGroupColor(slot) | 0xCC000000;
    }

    public int getGroupFillColor(Slot slot) {
        return (getGroupColor(slot) & 0x00FFFFFF) | 0x30000000;
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
            groupColors.clear();
            cachedStats = null;
            lastScreen = screen;
            isAuctionScreen = false;
        }

        if (showIdentical.isEnabled()) {
            refreshIdentical(screen);
        } else {
            refreshPrice(screen);
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

        groupColors.clear();
        for (int i = 0; i < itemGroups.size(); i++) {
            groupColors.put(itemGroups.get(i).fingerprint(), groupColor(i, itemGroups.size()));
        }

        isAuctionScreen = !itemGroups.isEmpty();

        if (!isAuctionScreen) {
            cachedStats = null;
            return;
        }

        int totalItems = itemGroups.stream().mapToInt(ItemGroup::count).sum();
        cachedStats = new AuctionStats(totalItems, 0, 0, 0, 0);
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
        List<Text> tooltip;
        try {
            tooltip = stack.getTooltip(
                net.minecraft.item.Item.TooltipContext.DEFAULT,
                net.minecraft.client.MinecraftClient.getInstance().player,
                net.minecraft.item.tooltip.TooltipType.BASIC
            );
        } catch (Exception e) {
            return -1;
        }
        if (tooltip == null) return -1;

        for (Text line : tooltip) {
            String text = line.getString().toLowerCase(java.util.Locale.ROOT);
            boolean hasTrigger = false;
            for (String trigger : PRICE_TRIGGERS) {
                if (text.contains(trigger)) {
                    hasTrigger = true;
                    break;
                }
            }
            if (!hasTrigger) continue;

            String digits = text.replaceAll("[^\\d]", "");
            if (digits.isEmpty()) continue;
            try {
                long val = Long.parseLong(digits);
                if (val > 0 && val < MAX_REASONABLE_PRICE) return val;
            } catch (NumberFormatException ignored) {}
        }
        return -1;
    }

    private static String fingerprint(ItemStack stack) {
        StringBuilder sb = new StringBuilder();
        sb.append(stack.getItem().toString());
        sb.append("|").append(stack.getCount());
        var enchants = stack.get(net.minecraft.component.DataComponentTypes.ENCHANTMENTS);
        if (enchants != null) {
            var entries = new ArrayList<>(enchants.getEnchantmentEntries());
            entries.sort(Comparator.comparingInt(e -> e.getKey().value().toString().hashCode()));
            for (var entry : entries) {
                sb.append("|e:").append(entry.getKey().value()).append(":").append(entry.getIntValue());
            }
        }
        var storedEnchants = stack.get(net.minecraft.component.DataComponentTypes.STORED_ENCHANTMENTS);
        if (storedEnchants != null) {
            var entries = new ArrayList<>(storedEnchants.getEnchantmentEntries());
            entries.sort(Comparator.comparingInt(e -> e.getKey().value().toString().hashCode()));
            for (var entry : entries) {
                sb.append("|se:").append(entry.getKey().value()).append(":").append(entry.getIntValue());
            }
        }
        var lore = stack.get(net.minecraft.component.DataComponentTypes.LORE);
        if (lore != null) {
            for (Text line : lore.styledLines()) {
                sb.append("|l:").append(line.getString());
            }
        }
        return sb.toString();
    }

    private static int groupColor(int index, int total) {
        if (total <= 0) return COLOR_GREEN;
        float hue = (float) index / total;
        float s = 0.75f;
        float b = 0.95f;
        int r, g, bl;
        if (s == 0) {
            r = g = bl = (int) (b * 255 + 0.5f);
        } else {
            float q = b < 0.5f ? b * (1 + s) : b + s - b * s;
            float p = 2 * b - q;
            r = (int) (hueToRgb(p, q, hue + 1f / 3) * 255 + 0.5f);
            g = (int) (hueToRgb(p, q, hue) * 255 + 0.5f);
            bl = (int) (hueToRgb(p, q, hue - 1f / 3) * 255 + 0.5f);
        }
        return 0xFF000000 | (r << 16) | (g << 8) | bl;
    }

    private static float hueToRgb(float p, float q, float t) {
        if (t < 0) t += 1;
        if (t > 1) t -= 1;
        if (t < 1f / 6) return p + (q - p) * 6 * t;
        if (t < 0.5f) return q;
        if (t < 2f / 3) return p + (q - p) * (2f / 3 - t) * 6;
        return p;
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
        return getRankColors(rank, topEntries.size())[1];
    }

    public int rankFillColor(int rank) {
        int base = getRankColors(rank, topEntries.size())[0];
        return (base & 0x00FFFFFF) | 0x20000000;
    }

    public record AuctionEntry(Slot slot, long totalPrice, double unitPrice, int count) {}
    public record AuctionStats(int auctionItems, long minTotalPrice, long minUnitPrice, long avgTotalPrice, long avgUnitPrice) {}
    public record ItemGroup(String fingerprint, List<Slot> slots, int count) {}
}
