package nesquik.mytheria.framework.objects.gradient.impl;

import a.eb;
import nesquik.mytheria.framework.objects.gradient.Gradient;

class DiagonalGradient extends Gradient {
   public DiagonalGradient(eb startColor, eb endColor) {
      super(startColor, endColor, endColor, startColor);
   }

   public DiagonalGradient rotate() {
      return new DiagonalGradient(this.topRightColor, this.bottomLeftColor);
   }
}
