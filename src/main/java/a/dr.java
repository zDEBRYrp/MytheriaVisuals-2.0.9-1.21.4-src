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
import a.dr;
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
import a.eo;
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
import a.h;
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
import a.eb;
import a.uc.fE;
import a.uc.bK;
import a.uc.cF;
import a.uc.bF;
import a.en;
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
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Font;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.utility.animation.base.Easing;
import ru.kotopushka.compiler.sdk.annotations.Compile;

public class dr extends fw {
   private final String a;
   private final String b;
   private final boolean c;
   private final float d;
   private final Runnable e;
   private final dZ f = new dZ(250L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
   private static final eb g = new eb(200.0F, 200.0F, 210.0F, 255.0F);
   private static final eb h = new eb(255.0F, 255.0F, 255.0F, 60.0F);

   public dr(String preview, String label, boolean large, float previewAspect, Runnable onClick) {
      this.a = preview;
      this.b = label;
      this.c = large;
      this.d = previewAspect;
      this.e = onClick;
   }

   @Compile
   public void draw(UIContext context) {
      boolean var2 = this.hovered(context.getMouseX(), context.getMouseY());
      if (var2) {
         eo.set(en.HAND);
      }

      this.f.update(var2);
      float var3 = this.f.getValue();
      if (this.c) {
         this.a(context, var3);
      } else {
         this.b(context, var3);
      }
   }

   private void a(UIContext context, float hover) {
      float var3 = 3.0F;
      context.drawRoundedRect(this.x, this.y, this.width, this.height, BorderRadius.all(var3), new eb(30.0F, 28.0F, 42.0F, 235.0F));
      float var4 = this.height * 0.35F;
      float var5 = this.height - var4;
      if (Fonts.isInitialized()) {
         Font var6 = Fonts.MEDIUM.getFont(10.0F);
         float var7 = this.y + var4 / 2.0F - var6.height() / 2.0F;
         context.drawCenteredText(var6, this.b, this.x + this.width / 2.0F, var7, g);
      }

      float var14 = this.width;
      float var15 = var14 / var5;
      float var8;
      float var9;
      float var10;
      float var11;
      if (this.d > var15) {
         float var12 = var15 / this.d;
         float var13 = (1.0F - var12) / 2.0F;
         var8 = var13;
         var9 = 0.0F;
         var10 = 1.0F - var13;
         var11 = 1.0F;
      } else {
         float var16 = this.d / var15;
         float var17 = (1.0F - var16) / 2.0F;
         var8 = 0.0F;
         var9 = var17;
         var10 = 1.0F;
         var11 = 1.0F - var17;
      }

      context.drawRoundedTextureWithUV(
         Mytheria.id(this.a), this.x, this.y + var4, var14, var5, new BorderRadius(0.0F, 0.0F, var3, var3), eb.WHITE, var8, var9, var10, var11
      );
      if (hover > 0.01F) {
         context.drawRoundedRect(this.x, this.y, this.width, this.height, BorderRadius.all(var3), new eb(255.0F, 255.0F, 255.0F, (int)(12.0F * hover)));
      }

      context.drawRoundedBorder(this.x, this.y, this.width, this.height, 1.0F, BorderRadius.all(var3), h);
   }

   private void b(UIContext context, float hover) {
      float var3 = 3.0F;
      context.drawRoundedRect(this.x, this.y, this.width, this.height, BorderRadius.all(var3), new eb(28.0F, 26.0F, 38.0F, 220.0F));
      context.drawRoundedBorder(this.x, this.y, this.width, this.height, 1.0F, BorderRadius.all(var3), h);
      if (hover > 0.01F) {
         context.drawRoundedRect(this.x, this.y, this.width, this.height, BorderRadius.all(var3), new eb(255.0F, 255.0F, 255.0F, (int)(12.0F * hover)));
      }

      if (Fonts.isInitialized()) {
         Font var4 = Fonts.MEDIUM.getFont(10.0F);
         float var5 = this.y + this.height / 2.0F - var4.height() / 2.0F;
         context.drawCenteredText(var4, this.b, this.x + this.width / 2.0F, var5, g);
      }
   }

   @Compile
   public void click(double mouseX, double mouseY, int button) {
      if (this.hovered(mouseX, mouseY) && button == 0) {
         this.e.run();
      }
   }

   @Generated
   public dZ getActiveAnim() {
      return this.f;
   }

   public String getLabel() {
      return this.b;
   }
}
