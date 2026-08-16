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
import a.x;
import a.uc.fC;
import a.uc.aT;
import a.uc.dH;
import a.uc.fP;
import a.uc.eM;
import a.uc.cT;
import a.uc.bA;
import a.es;
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
import a.uc.eB;
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
import a.uc.eA;
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
import a.y;
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
import a.uc.F;
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

import lombok.Generated;
import nesquik.mytheria.utility.animation.base.Easing;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.client.util.math.MatrixStack;

public class es implements IMinecraft {
   private double a;
   private double b;
   private double c;
   private double d;
   public static final double SCROLLBAR_THICKNESS = 1.0;
   private final dZ e = new dZ(100L, Easing.BAKEK);

   public es() {
      this.b = 0.0;
      this.c = 0.0;
      this.d = 20.0;
   }

   public void update() {
      this.e.setDuration(300L);
      this.c = Math.min(Math.max(this.c, this.a), 0.0);
      double var1 = this.c - this.b;
      this.b += var1;
      if (var1 > 0.0) {
         this.e.setEasing(Math.abs(var1) > 21.0 ? Easing.QUARTIC_OUT : Easing.BAKEK);
      }

      this.e.update((float)this.b);
   }

   public double getValue() {
      return -this.e.getValue();
   }

   public void reset() {
      this.b = 0.0;
      this.c = 0.0;
      this.e.reset();
   }

   public void scroll(double amount) {
      this.c = this.c + amount * this.d;
   }

   public void onKeyPressed(int keyCode) {
      if (keyCode == 265) {
         this.scroll(1.0);
      } else if (keyCode == 264) {
         this.scroll(-1.0);
      }
   }

   public void renderScrollbar(MatrixStack matrixStack, double x, double y, double width, double height, double contentHeight) {
      if (!(contentHeight <= height)) {
         double var12 = 50.0;
         double var14 = y + this.b / this.a * (height - var12);
      }
   }

   @Generated
   public double getMax() {
      return this.a;
   }

   @Generated
   public double getTargetValue() {
      return this.c;
   }

   @Generated
   public double getSpeed() {
      return this.d;
   }

   @Generated
   public dZ getScrollAnimation() {
      return this.e;
   }

   @Generated
   public void setMax(double max) {
      this.a = max;
   }

   @Generated
   public void setValue(double value) {
      this.b = value;
   }

   @Generated
   public void setTargetValue(double targetValue) {
      this.c = targetValue;
   }

   @Generated
   public void setSpeed(double speed) {
      this.d = speed;
   }
}
