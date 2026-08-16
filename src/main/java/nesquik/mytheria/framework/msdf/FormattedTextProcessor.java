package nesquik.mytheria.framework.msdf;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import lombok.Generated;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;

public class FormattedTextProcessor {
   public static List<FormattedTextProcessor.TextSegment> processText(Text text, int defaultColor) {
      ArrayList var2 = new ArrayList();
      text.visit((style, string) -> {
         if (!string.isEmpty()) {
            int var4 = extractColor(style, defaultColor);
            boolean var5 = style.isBold();
            boolean var6 = style.isItalic();
            boolean var7 = style.isUnderlined();
            boolean var8 = style.isStrikethrough();
            var2.add(new FormattedTextProcessor.TextSegment(string, var4, var5, var6, var7, var8));
         }

         return Optional.empty();
      }, Style.EMPTY);
      return var2;
   }

   private static int extractColor(Style style, int defaultColor) {
      TextColor var2 = style.getColor();
      return var2 != null ? var2.getRgb() | 0xFF000000 : defaultColor;
   }

   public static class TextSegment {
      public final String text;
      public final int color;
      public final boolean bold;
      public final boolean italic;
      public final boolean underlined;
      public final boolean strikethrough;

      @Generated
      public TextSegment(String text, int color, boolean bold, boolean italic, boolean underlined, boolean strikethrough) {
         this.text = text;
         this.color = color;
         this.bold = bold;
         this.italic = italic;
         this.underlined = underlined;
         this.strikethrough = strikethrough;
      }

      @Generated
      public String getText() {
         return this.text;
      }

      @Generated
      public int getColor() {
         return this.color;
      }

      @Generated
      public boolean isBold() {
         return this.bold;
      }

      @Generated
      public boolean isItalic() {
         return this.italic;
      }

      @Generated
      public boolean isUnderlined() {
         return this.underlined;
      }

      @Generated
      public boolean isStrikethrough() {
         return this.strikethrough;
      }

      @Generated
      @Override
      public boolean equals(Object o) {
         if (o == this) {
            return true;
         }

         if (o instanceof FormattedTextProcessor.TextSegment var2) {
            if (!var2.canEqual(this)) {
               return false;
            }

            if (this.getColor() != var2.getColor()) {
               return false;
            }

            if (this.isBold() != var2.isBold()) {
               return false;
            }

            if (this.isItalic() != var2.isItalic()) {
               return false;
            }

            if (this.isUnderlined() != var2.isUnderlined()) {
               return false;
            }

            if (this.isStrikethrough() != var2.isStrikethrough()) {
               return false;
            }

            String var3 = this.getText();
            String var4 = var2.getText();
            return var3 == null ? var4 == null : var3.equals(var4);
         } else {
            return false;
         }
      }

      @Generated
      protected boolean canEqual(Object other) {
         return other instanceof FormattedTextProcessor.TextSegment;
      }

      @Generated
      @Override
      public int hashCode() {
         byte var1 = 59;
         int var2 = 1;
         var2 = var2 * 59 + this.getColor();
         var2 = var2 * 59 + (this.isBold() ? 79 : 97);
         var2 = var2 * 59 + (this.isItalic() ? 79 : 97);
         var2 = var2 * 59 + (this.isUnderlined() ? 79 : 97);
         var2 = var2 * 59 + (this.isStrikethrough() ? 79 : 97);
         String var3 = this.getText();
         return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      }

      @Generated
      @Override
      public String toString() {
         return "FormattedTextProcessor.TextSegment(text="
            + this.getText()
            + ", color="
            + this.getColor()
            + ", bold="
            + this.isBold()
            + ", italic="
            + this.isItalic()
            + ", underlined="
            + this.isUnderlined()
            + ", strikethrough="
            + this.isStrikethrough()
            + ")";
      }
   }
}
