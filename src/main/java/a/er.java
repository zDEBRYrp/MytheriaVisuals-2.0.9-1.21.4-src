package a;
import a.uc.B;
import a.uc.bZ;
import a.uc.eF;
import a.uc.bY;
import a.uc.cC;
import a.uc.bN;
import a.uc.bR;
import a.uc.aQ;
import a.er;
import a.uc.eW;
import a.uc.fO;
import a.uc.dY;
import a.uc.eP;
import a.cn;
import a.uc.L;
import a.uc.dR;
import a.uc.eY;
import a.ck;
import a.co;
import a.uc.aZ;
import a.uc.eK;
import a.dz;
import a.uc.dX;
import a.uc.R;
import a.uc.aS;
import a.uc.cD;
import a.uc.U;
import a.uc.D;
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
import a.cj;
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
import a.uc.eS;
import a.uc.cR;
import a.uc.aN;
import a.ci;
import a.cg;
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
import a.cf;
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
import a.cl;
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
import a.uc.C;
import a.uc.aY;
import a.uc.dT;
import a.uc.dJ;
import a.uc.fF;
import a.uc.aR;
import a.uc.fG;
import a.uc.dV;
import a.uc.aX;
import a.uc.dG;
import a.uc.E;
import a.uc.dP;
import a.y;
import a.cm;
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

import nesquik.mytheria.framework.base.CustomComponent;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.systems.setting.Setting;
import nesquik.mytheria.systems.setting.settings.SliderSetting;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.client.util.math.Vector2f;

public final class er {
   public static float getMiddleOfBox(float objectHeight, float boxHeight) {
      return (float)Math.ceil(boxHeight / 2.0F - objectHeight / 2.0F);
   }

   public static double getMiddleOfBox(double objectHeight, double boxHeight) {
      return Math.ceil(boxHeight / 2.0 - objectHeight / 2.0);
   }

   public static boolean isHovered(double x, double y, double width, double height, int mouseX, int mouseY) {
      return mouseX >= x && mouseX < x + width && mouseY >= y && mouseY < y + height;
   }

   public static boolean isHovered(double x, double y, double width, double height, UIContext context) {
      return isHovered(x, y, width, height, context.getMouseX(), context.getMouseY());
   }

   public static boolean isHovered(fw rect, double mouseX, double mouseY) {
      return isHovered(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight(), mouseX, mouseY);
   }

   public static boolean isHovered(CustomComponent rect, double mouseX, double mouseY) {
      return isHovered(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight(), mouseX, mouseY);
   }

   public static boolean isHovered(double x, double y, double width, double height, double mouseX, double mouseY) {
      return mouseX >= x && mouseX < x + width && mouseY >= y && mouseY < y + height;
   }

   public static float getSliderValue(float min, float max, float start, float size, double mouse) {
      return (float)(Math.min(1.0, Math.max(0.0, (mouse - start) / size)) * (max - min)) + min;
   }

   public static float getSliderValueWithoutClamp(float min, float max, float start, float size, double mouse) {
      return (float)((mouse - start) / size * (max - min)) + min;
   }

   public static float getPercent(float value, float min, float max) {
      return (value - min) / (max - min);
   }

   public static Vector2f getMouse() {
      double var0 = IMinecraft.mc.getWindow().getScaleFactor();
      return new Vector2f((float)(IMinecraft.mc.mouse.getX() / 2.0), (float)(IMinecraft.mc.mouse.getY() / 2.0));
   }

   public static dz settinge(Setting setting, CustomComponent parent) {
      dz var2 = null;
      if (setting instanceof ch var3) {
         var2 = new dC(var3, parent);
      } else if (setting instanceof cg var4) {
         var2 = new dB(var4, parent);
      } else if (setting instanceof cj var5) {
         var2 = new dE(var5, parent);
      } else if (setting instanceof ck var6) {
         var2 = new dF(var6, parent);
      } else if (setting instanceof cm var7) {
         var2 = new dH(var7, parent);
      } else if (setting instanceof cf var8) {
         var2 = new dA(var8, parent);
      } else if (setting instanceof ci var9) {
         var2 = new dD(var9, parent);
      } else if (setting instanceof cn var10) {
         var2 = new dI(var10, parent);
      } else if (setting instanceof SliderSetting var11) {
         var2 = new dJ(var11, parent);
      } else if (setting instanceof co var12) {
         var2 = new dK(var12, parent);
      } else if (setting instanceof cl var13) {
         var2 = new dG(var13, parent);
      }

      if (var2 != null) {
         var2.onInit();
      }

      return var2;
   }
}
