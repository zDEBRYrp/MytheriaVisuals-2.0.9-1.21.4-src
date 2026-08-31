package a;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;

public class TextFormatUtils {

    public static class Segment {
        public final String text;
        public final int color;
        public final boolean bold;
        public final boolean italic;
        public final boolean underline;
        public final boolean strikethrough;
        public final boolean obfuscated;

        public Segment(String text, int color, boolean bold, boolean italic, boolean underline, boolean strikethrough, boolean obfuscated) {
            this.text = text;
            this.color = color;
            this.bold = bold;
            this.italic = italic;
            this.underline = underline;
            this.strikethrough = strikethrough;
            this.obfuscated = obfuscated;
        }
    }

    public static List<Segment> extractSegments(Text text) {
        List<Segment> segments = new ArrayList<>();
        text.visit((style, string) -> {
            if (!string.isEmpty()) {
                int color = -1;
                TextColor tc = style.getColor();
                if (tc != null) {
                    color = tc.getRgb();
                }
                segments.add(new Segment(
                    string, color,
                    style.isBold(), style.isItalic(), style.isUnderlined(),
                    style.isStrikethrough(), style.isObfuscated()
                ));
            }
            return java.util.Optional.empty();
        }, Style.EMPTY);
        return segments;
    }

    public static List<Segment> extractSegments(OrderedText orderedText) {
        List<Segment> segments = new ArrayList<>();
        int[] holder = {-1, 0, 0, 0, 0, 0, 0};
        StringBuilder currentText = new StringBuilder();

        orderedText.accept((index, style, codePoint) -> {
            int color = -1;
            TextColor tc = style.getColor();
            if (tc != null) {
                color = tc.getRgb();
            }
            int bold = style.isBold() ? 1 : 0;
            int italic = style.isItalic() ? 1 : 0;
            int underline = style.isUnderlined() ? 1 : 0;
            int strikethrough = style.isStrikethrough() ? 1 : 0;
            int obfuscated = style.isObfuscated() ? 1 : 0;

            if (holder[6] == 1 && color == holder[0] && bold == holder[1] && italic == holder[2]
                    && underline == holder[3] && strikethrough == holder[4] && obfuscated == holder[5]) {
                currentText.appendCodePoint(codePoint);
            } else {
                if (holder[6] == 1 && !currentText.isEmpty()) {
                    segments.add(new Segment(currentText.toString(), holder[0],
                            holder[1] == 1, holder[2] == 1, holder[3] == 1, holder[4] == 1, holder[5] == 1));
                }
                currentText.setLength(0);
                currentText.appendCodePoint(codePoint);
                holder[0] = color;
                holder[1] = bold;
                holder[2] = italic;
                holder[3] = underline;
                holder[4] = strikethrough;
                holder[5] = obfuscated;
                holder[6] = 1;
            }
            return true;
        });

        if (holder[6] == 1 && !currentText.isEmpty()) {
            segments.add(new Segment(currentText.toString(), holder[0],
                    holder[1] == 1, holder[2] == 1, holder[3] == 1, holder[4] == 1, holder[5] == 1));
        }
        return segments;
    }

    private static void appendFormatting(StringBuilder sb, Segment seg) {
        if (seg.bold) sb.append("&l");
        if (seg.italic) sb.append("&o");
        if (seg.underline) sb.append("&n");
        if (seg.strikethrough) sb.append("&m");
        if (seg.obfuscated) sb.append("&k");
    }

    public static String toFormat1(Text text) {
        return toFormat1(extractSegments(text));
    }

    public static String toFormat1(OrderedText text) {
        return toFormat1(extractSegments(text));
    }

    private static String toFormat1(List<Segment> segments) {
        StringBuilder sb = new StringBuilder();
        for (Segment seg : segments) {
            if (seg.color != -1) {
                sb.append(String.format("&#%06X", seg.color));
            }
            appendFormatting(sb, seg);
            sb.append(seg.text);
        }
        return sb.toString();
    }

    public static String toFormat2(Text text) {
        return toFormat2(extractSegments(text));
    }

    public static String toFormat2(OrderedText text) {
        return toFormat2(extractSegments(text));
    }

    private static String toFormat2(List<Segment> segments) {
        StringBuilder sb = new StringBuilder();
        for (Segment seg : segments) {
            if (seg.color != -1) {
                sb.append(String.format("<#%06X>", seg.color));
            }
            appendFormatting(sb, seg);
            sb.append(seg.text);
        }
        return sb.toString();
    }

    public static String toFormat3(Text text) {
        return toFormat3(extractSegments(text));
    }

    public static String toFormat3(OrderedText text) {
        return toFormat3(extractSegments(text));
    }

    private static String toFormat3(List<Segment> segments) {
        StringBuilder sb = new StringBuilder();
        for (Segment seg : segments) {
            if (seg.color != -1) {
                String hex = String.format("%06X", seg.color);
                sb.append("&x");
                for (char c : hex.toCharArray()) {
                    sb.append("&").append(c);
                }
            }
            appendFormatting(sb, seg);
            sb.append(seg.text);
        }
        return sb.toString();
    }

    public static String toFormat4(Text text) {
        return toFormat4(extractSegments(text));
    }

    public static String toFormat4(OrderedText text) {
        return toFormat4(extractSegments(text));
    }

    private static String toFormat4(List<Segment> segments) {
        StringBuilder sb = new StringBuilder();
        for (Segment seg : segments) {
            if (seg.color != -1) {
                String hex = String.format("%06X", seg.color).toLowerCase(java.util.Locale.ROOT);
                sb.append("&x");
                for (char c : hex.toCharArray()) {
                    sb.append("&").append(c);
                }
            }
            appendFormatting(sb, seg);
            sb.append(seg.text);
        }
        return sb.toString();
    }

    public static String format(Text text, int formatIndex) {
        return switch (formatIndex) {
            case 0 -> toFormat1(text);
            case 1 -> toFormat2(text);
            case 2 -> toFormat3(text);
            case 3 -> toFormat4(text);
            case 4 -> toPlain(text);
            default -> toFormat1(text);
        };
    }

    public static String format(OrderedText text, int formatIndex) {
        return switch (formatIndex) {
            case 0 -> toFormat1(text);
            case 1 -> toFormat2(text);
            case 2 -> toFormat3(text);
            case 3 -> toFormat4(text);
            case 4 -> toPlain(text);
            default -> toFormat1(text);
        };
    }

    public static String toPlain(Text text) {
        return text.getString();
    }

    public static String toPlain(OrderedText text) {
        StringBuilder sb = new StringBuilder();
        text.accept((index, style, codePoint) -> {
            sb.appendCodePoint(codePoint);
            return true;
        });
        return sb.toString();
    }
}
