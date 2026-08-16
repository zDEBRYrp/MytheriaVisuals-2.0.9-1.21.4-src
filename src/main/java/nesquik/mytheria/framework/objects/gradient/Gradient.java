package nesquik.mytheria.framework.objects.gradient;

import a.eb;
import lombok.Generated;

public class Gradient {
   protected final eb topLeftColor;
   protected final eb bottomLeftColor;
   protected final eb topRightColor;
   protected final eb bottomRightColor;

   public Gradient(eb topLeftColor, eb bottomLeftColor, eb topRightColor, eb bottomRightColor) {
      this.topLeftColor = topLeftColor;
      this.bottomLeftColor = bottomLeftColor;
      this.topRightColor = topRightColor;
      this.bottomRightColor = bottomRightColor;
   }

   public static Gradient of(eb topLeftColor, eb bottomLeftColor, eb topRightColor, eb bottomRightColor) {
      return new Gradient(topLeftColor, bottomLeftColor, topRightColor, bottomRightColor);
   }

   public Gradient rotate() {
      return this;
   }

   @Generated
   public eb getTopLeftColor() {
      return this.topLeftColor;
   }

   @Generated
   public eb getBottomLeftColor() {
      return this.bottomLeftColor;
   }

   @Generated
   public eb getTopRightColor() {
      return this.topRightColor;
   }

   @Generated
   public eb getBottomRightColor() {
      return this.bottomRightColor;
   }
}
