package a;
import a.b;
import a.uc.bZ;
import a.uc.eF;
import a.by;
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
import a.g;
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
import a.ch;
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
import a.ax;
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

import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import nesquik.mytheria.utility.animation.base.Easing;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.option.Perspective;

@ModuleInfo(name = "Better Minecraft", category = ax.VISUALS, desc = "modules.descriptions.better_minecraft")
public class by extends aJ implements IMinecraft {
   private final ch a = new ch(this, "modules.settings.better_minecraft.smooth_tab").enabled(true);
   private final ch b = new ch(this, "modules.settings.better_minecraft.smooth_screens").enabled(true);
   private final ch c = new ch(this, "modules.settings.better_minecraft.smooth_f5").enabled(true);
   private static dZ d = null;
   private static dZ e = null;
   private static dZ f = null;
   private static Perspective g = null;

   public static void onSetScreen(Screen screen) {
      by var1 = a();
      if (var1 == null || !var1.isEnabled() || !var1.b.isEnabled()) {
         d = null;
      } else if (screen == null) {
         d = null;
      } else {
         d = new dZ(160L, 0.0F, Easing.BAKEK);
         d.update(1.0F);
      }
   }

   public static float screenProgress() {
      return d == null ? 1.0F : d.update(1.0F);
   }

   public static boolean smoothScreensEnabled() {
      by var0 = a();
      return var0 != null && var0.isEnabled() && var0.b.isEnabled();
   }

   public static boolean smoothF5Enabled() {
      by var0 = a();
      return var0 != null && var0.isEnabled() && var0.c.isEnabled();
   }

   public static void onTabVisible(boolean visible) {
      by var1 = a();
      if (var1 != null && var1.isEnabled() && var1.a.isEnabled()) {
         if (e == null) {
            e = new dZ(160L, visible ? 1.0F : 0.0F, Easing.BAKEK);
         }

         e.update(visible ? 1.0F : 0.0F);
      }
   }

   public static float tabProgress() {
      return e == null ? 0.0F : e.getValue();
   }

   public static void tickPerspective() {
      by var0 = a();
      if (var0 != null && var0.isEnabled() && var0.c.isEnabled()) {
         MinecraftClient var1 = MinecraftClient.getInstance();
         if (var1 != null && var1.options != null) {
            Perspective var2 = var1.options.getPerspective();
            if (g == null) {
               g = var2;
            } else if (var2 != g) {
               g = var2;
               f = new dZ(160L, 0.0F, Easing.BAKEK);
               f.update(1.0F);
            }
         }
      }
   }

   public static float f5Progress() {
      return f == null ? 1.0F : f.update(1.0F);
   }

   public static boolean isThirdPerson() {
      MinecraftClient var0 = MinecraftClient.getInstance();
      if (var0 != null && var0.options != null) {
         Perspective var1 = var0.options.getPerspective();
         return var1 != null && !var1.isFirstPerson();
      } else {
         return false;
      }
   }

   private static by a() {
      try {
         return Mytheria.getInstance().getModuleManager().getModule(by.class);
      } catch (Exception var1) {
         return null;
      }
   }

   @Generated
   public ch getSmoothTab() {
      return this.a;
   }

   @Generated
   public ch getSmoothScreens() {
      return this.b;
   }

   @Generated
   public ch getSmoothF5() {
      return this.c;
   }
}
