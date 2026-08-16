package nesquik.mytheria.framework.objects.gradient.impl;

import a.eb;
import nesquik.mytheria.framework.objects.gradient.Gradient;

public class VerticalGradient extends Gradient {
   public VerticalGradient(eb startColor, eb endColor) {
      super(startColor, endColor, startColor, endColor);
   }

   public VerticalGradient rotate() {
      return new VerticalGradient(this.bottomRightColor, this.topLeftColor);
   }
}
