package nesquik.mytheria.framework.objects.gradient.impl;

import a.eb;
import nesquik.mytheria.framework.objects.gradient.Gradient;

public class HorizontalGradient extends Gradient {
   public HorizontalGradient(eb startColor, eb endColor) {
      super(startColor, startColor, endColor, endColor);
   }

   public HorizontalGradient rotate() {
      return new HorizontalGradient(this.bottomRightColor, this.topLeftColor);
   }
}
