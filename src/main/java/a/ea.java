package a;
import a.b;
import a.uc.bZ;
import a.uc.eF;
import a.uc.bY;
import a.uc.cC;
import a.uc.bN;
import a.uc.bR;
import a.uc.aQ;
import a.uc.eR;
import a.uc.eW;
import a.uc.fO;
import a.uc.dY;
import a.uc.eP;
import a.uc.cN;
import a.uc.L;
import a.uc.dR;
import a.uc.eY;
import a.uc.cK;
import a.uc.cO;
import a.uc.aZ;
import a.uc.eK;
import a.uc.dZ;
import a.uc.dX;
import a.uc.R;
import a.uc.aS;
import a.uc.cD;
import a.uc.U;
import a.d;
import a.uc.aP;
import a.uc.dS;
import a.uc.aH;
import a.uc.eD;
import a.uc.aW;
import a.uc.dD;
import a.uc.bB;
import a.uc.eO;
import a.uc.cP;
import a.uc.fK;
import a.uc.aB;
import a.uc.cJ;
import a.uc.cX;
import a.uc.eG;
import a.uc.dA;
import a.uc.eI;
import a.uc.aE;
import a.uc.dE;
import a.uc.M;
import a.uc.dW;
import a.uc.H;
import a.uc.J;
import a.uc.Q;
import a.uc.N;
import a.uc.bW;
import a.uc.P;
import a.uc.fJ;
import a.uc.V;
import a.uc.G;
import a.uc.fD;
import a.uc.eX;
import a.uc.Z;
import a.uc.bS;
import a.uc.aO;
import a.uc.cE;
import a.uc.X;
import a.uc.fC;
import a.uc.aT;
import a.uc.dH;
import a.uc.fP;
import a.uc.eM;
import a.uc.cT;
import a.uc.bA;
import a.uc.eS;
import a.uc.cR;
import a.uc.aN;
import a.uc.cI;
import a.uc.cG;
import a.uc.bC;
import a.uc.I;
import a.uc.bE;
import a.uc.aG;
import a.uc.dI;
import a.uc.aK;
import a.uc.aJ;
import a.uc.O;
import a.uc.aV;
import a.uc.eH;
import a.eb;
import a.uc.fE;
import a.uc.bK;
import a.uc.cF;
import a.uc.bF;
import a.uc.eN;
import a.uc.bI;
import a.uc.dC;
import a.uc.cU;
import a.uc.aU;
import a.uc.bH;
import a.ea;
import a.uc.bM;
import a.uc.aF;
import a.a;
import a.uc.cL;
import a.uc.fM;
import a.uc.dM;
import a.uc.cA;
import a.uc.bD;
import a.uc.bX;
import a.uc.cH;
import a.uc.bG;
import a.uc.fB;
import a.uc.fA;
import a.uc.dF;
import a.uc.bU;
import a.uc.cY;
import a.uc.aC;
import a.uc.aL;
import a.uc.bQ;
import a.uc.eE;
import a.uc.eT;
import a.uc.K;
import a.uc.cB;
import a.uc.bT;
import a.uc.W;
import a.uc.eL;
import a.uc.bP;
import a.uc.aD;
import a.uc.fI;
import a.uc.T;
import a.uc.dB;
import a.uc.cV;
import a.c;
import a.uc.aY;
import a.uc.dT;
import a.uc.dJ;
import a.uc.fF;
import a.uc.aR;
import a.uc.fG;
import a.uc.dV;
import a.uc.aX;
import a.uc.dG;
import a.e;
import a.uc.dP;
import a.uc.Y;
import a.uc.cM;
import a.uc.eQ;
import a.uc.eV;
import a.uc.cS;
import a.uc.bO;
import a.uc.eC;
import a.uc.fL;
import a.uc.bL;
import a.uc.aI;
import a.uc.cW;
import a.uc.dL;
import a.uc.aM;
import a.uc.eJ;
import a.uc.bV;
import a.f;
import a.uc.cQ;
import a.uc.dQ;
import a.uc.dK;
import a.uc.aA;
import a.uc.eZ;
import a.uc.S;
import a.uc.fH;
import a.uc.dU;
import a.uc.dN;
import a.uc.fN;
import a.uc.cZ;
import a.uc.eU;
import a.uc.bJ;

import lombok.NonNull;
import nesquik.mytheria.utility.animation.base.Easing;

public class ea {
   private static final Easing a = Easing.CUBIC_IN_OUT;
   private final long b;
   private final dZ c;
   private final dZ d;
   private final dZ e;
   private final dZ f;

   public ea(long duration, Easing easing) {
      this.b = duration;
      this.c = new dZ(duration, easing);
      this.d = new dZ(duration, easing);
      this.e = new dZ(duration, easing);
      this.f = new dZ(duration, easing);
   }

   public ea(long duration) {
      this(duration, a);
   }

   public ea(long duration, eb initalColor, Easing easing) {
      this.b = duration;
      this.c = new dZ(duration, initalColor.getRed(), easing);
      this.d = new dZ(duration, initalColor.getGreen(), easing);
      this.e = new dZ(duration, initalColor.getBlue(), easing);
      this.f = new dZ(duration, initalColor.getAlpha(), easing);
   }

   public ea(long duration, eb initalColor) {
      this(duration, initalColor, a);
   }

   public void update(@NonNull eb targetColor) {
      if (targetColor == null) {
         throw new NullPointerException("targetColor is marked non-null but is null");
      }

      this.c.update(targetColor.getRed());
      this.d.update(targetColor.getGreen());
      this.e.update(targetColor.getBlue());
      this.f.update(targetColor.getAlpha());
   }

   public eb getColor() {
      return new eb((int)this.c.getValue(), (int)this.d.getValue(), (int)this.e.getValue(), (int)this.f.getValue());
   }

   public void setEasing(Easing easing) {
      this.c.setEasing(easing);
      this.d.setEasing(easing);
      this.e.setEasing(easing);
      this.f.setEasing(easing);
   }

   public void setDuration(long duration) {
      this.c.setDuration(duration);
      this.d.setDuration(duration);
      this.e.setDuration(duration);
      this.f.setDuration(duration);
   }

   public void setColor(@NonNull eb color) {
      if (color == null) {
         throw new NullPointerException("color is marked non-null but is null");
      }

      this.c.setValue(color.getRed());
      this.d.setValue(color.getGreen());
      this.e.setValue(color.getBlue());
      this.f.setValue(color.getAlpha());
   }
}
