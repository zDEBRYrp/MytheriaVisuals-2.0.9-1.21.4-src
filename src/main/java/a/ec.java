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
import a.ct;
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
import a.ec;
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

import nesquik.mytheria.Mytheria;

public final class ec {
   public static final eb RED = new eb(255.0F, 0.0F, 0.0F);
   public static final eb GREEN = new eb(0.0F, 255.0F, 0.0F);
   public static final eb BLUE = new eb(0.0F, 0.0F, 255.0F);
   public static final eb WHITE = new eb(255.0F, 255.0F, 255.0F);
   public static final eb BLACK = new eb(0.0F, 0.0F, 0.0F);
   public static final eb ACCENT = new eb(151.0F, 71.0F, 255.0F);
   private static final ea a = new ea(500L);
   private static final ea b = new ea(500L);
   private static final ea c = new ea(500L);
   private static final ea d = new ea(500L);
   private static final ea e = new ea(500L);
   private static final ea f = new ea(500L);

   private static ct a() {
      return Mytheria.getInstance().getThemeManager().getCurrentTheme();
   }

   public static eb getBackgroundColor() {
      return a(a, a().getBackgroundColor());
   }

   public static eb getAdditionalColor() {
      return a(b, a().getAdditionalColor());
   }

   public static eb getTextColor() {
      return a(c, a().getTextColor());
   }

   public static eb getOutlineColor() {
      return a(d, a().getOutlineColor());
   }

   public static eb getFlatColor() {
      return a(e, a().getFlatColor());
   }

   public static eb getSeparatorColor() {
      return eb.BLACK.withAlpha(255.0F * (a() == ct.DARK ? 0.08F : 0.05F));
   }

   public static eb getAccentColor() {
      bJ var0 = Mytheria.getInstance().getModuleManager().getModule(bJ.class);
      if (var0 == null) {
         return ACCENT;
      } else if (var0.getMinimalism().isSelected()) {
         eb var2 = var0.getClientColor().getColor();
         return a(f, var2);
      } else if (var0.getLiquidGlass().isSelected()) {
         eb var1 = var0.getClientColor().getColor();
         return a(f, var1);
      } else {
         return ACCENT;
      }
   }

   public static eb getHudTextColor() {
      return getTextColor();
   }

   public static eb getLiquidGlassColor() {
      bJ var0 = Mytheria.getInstance().getModuleManager().getModule(bJ.class);
      return var0 != null && var0.getLiquidGlassColor() != null ? var0.getLiquidGlassColor().getColor() : eb.WHITE;
   }

   private static eb a(ea animation, eb color) {
      animation.update(color);
      return animation.getColor();
   }
}
