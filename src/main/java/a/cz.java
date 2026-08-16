package a;
import a.b;
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
import a.uc.cN;
import a.l;
import a.uc.dR;
import a.uc.eY;
import a.uc.cK;
import a.uc.cO;
import a.uc.aZ;
import a.uc.eK;
import a.uc.dZ;
import a.uc.dX;
import a.r;
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
import a.m;
import a.uc.dW;
import a.h;
import a.j;
import a.q;
import a.n;
import a.uc.bW;
import a.p;
import a.uc.fJ;
import a.uc.V;
import a.g;
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
import a.ct;
import a.uc.bA;
import a.uc.eS;
import a.uc.cR;
import a.uc.aN;
import a.uc.cI;
import a.uc.cG;
import a.uc.bC;
import a.i;
import a.uc.bE;
import a.uc.aG;
import a.uc.dI;
import a.uc.aK;
import a.uc.aJ;
import a.o;
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
import a.ea;
import a.uc.bM;
import a.uc.aF;
import a.a;
import a.uc.cL;
import a.fm;
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
import a.k;
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
import a.ec;
import a.fl;
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
import a.cz;
import a.uc.eU;
import a.uc.bJ;

import com.mojang.blaze3d.systems.RenderSystem;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.CustomComponent;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.framework.objects.gradient.Gradient;
import nesquik.mytheria.utility.animation.base.Easing;

public class cz extends CustomComponent {
   private float a = 0.0F;
   private float b = 1.0F;
   private float c = 1.0F;
   private boolean d = false;
   private float e;
   private float f;
   private boolean g = false;
   private boolean h = false;
   private final dZ i = new dZ(300L, 0.0F, Easing.BAKEK);
   private final dZ j = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
   private final dZ k = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
   private final dZ l = new dZ(300L, 1.0F, Easing.FIGMA_EASE_IN_OUT);
   private final dZ m = new dZ(300L, 1.0F, Easing.FIGMA_EASE_IN_OUT);
   private final ea n = new ea(300L, eb.WHITE, Easing.FIGMA_EASE_IN_OUT);
   private boolean o = true;
   private boolean p = false;
   private boolean q = false;
   private final String r;

   public cz(float x, float y, eb initialColor, String title) {
      super(x, y, 200.0F, 220.0F);
      this.r = title;
      this.a = initialColor.getHue();
      this.b = initialColor.getSaturation();
      this.c = initialColor.getBrightness();
   }

   @Override
   public void renderComponent(UIContext context) {
      if (this.d) {
         this.x = context.getMouseX() - this.e;
         this.y = context.getMouseY() - this.f;
      }

      if (this.g) {
         this.a = er.getSliderValue(0.0F, 1.0F, this.y + 30.0F, 100.0F, context.getMouseY());
      }

      if (this.h) {
         this.c = 1.0F - er.getSliderValue(0.0F, 1.0F, this.x + 10.0F, 168.0F, context.getMouseX());
         this.b = 1.0F - er.getSliderValue(0.0F, 1.0F, this.y + 30.0F, 100.0F, context.getMouseY());
      }

      this.i.update(this.o);
      this.j.update(this.d);
      this.k.update(this.a);
      this.l.update(1.0F - this.c);
      this.m.update(1.0F - this.b);
      this.n.update(eb.fromHSB(this.a, 1.0F, 1.0F));
      boolean var2 = Mytheria.getInstance().getThemeManager().getCurrentTheme() == ct.DARK;
      eb var3 = ec.getBackgroundColor().withAlpha(255.0F * (var2 ? 0.9F : 0.7F));
      float var4 = Math.min(1.0F, this.i.getValue());
      fl.scale(context.getMatrices(), this.x + this.width / 2.0F, this.y + this.height / 2.0F, 0.5F + 0.5F * this.i.getValue());
      fm.push(context.getMatrices(), this.x + 1.0F, this.y + 1.0F, this.width - 2.0F, this.height - 2.0F);
      context.drawShadow(
         this.x - 5.0F,
         this.y - 5.0F,
         this.width + 10.0F,
         this.height + 10.0F,
         15.0F,
         BorderRadius.all(12.0F),
         eb.BLACK.withAlpha(255.0F * (0.1F + 0.15F * this.j.getValue()))
      );
      fm.pop();
      if (bJ.showGlass()) {
         context.drawLiquidGlass(
            this.x, this.y, this.width, this.height, 5.0F, bJ.getDistortion(), BorderRadius.all(12.0F), ec.getLiquidGlassColor().mulAlpha(var4 * bJ.glass())
         );
         context.drawRoundedRect(this.x, this.y, this.width, this.height, BorderRadius.all(12.0F), var3.mulAlpha(var4 * (0.8F - 0.6F * bJ.glass())));
      } else {
         if (bJ.showMinimalizm()) {
            context.drawBlurredRect(this.x, this.y, this.width, this.height, 11.25F, BorderRadius.all(12.0F), ec.WHITE.mulAlpha(var4 * bJ.minimalizm()));
         }

         context.drawRoundedRect(this.x, this.y, this.width, this.height, BorderRadius.all(12.0F), var3.mulAlpha(var4));
      }

      context.drawText(Fonts.MEDIUM.getFont(7.0F), this.r, this.x + 10.0F, this.y + 10.0F, ec.getTextColor());
      fm.push(context.getMatrices(), this.x, this.y, this.width, this.height);
      float var5 = this.x + 10.0F;
      float var6 = this.y + 30.0F;
      float var7 = 168.0F;
      float var8 = 100.0F;
      context.drawRoundedRect(var5, var6, var7, var8, BorderRadius.all(6.0F), Gradient.of(this.n.getColor(), eb.BLACK, ec.WHITE, eb.BLACK));
      float var9 = var5 + var7 * this.l.getValue();
      float var10 = var6 + var8 * this.m.getValue();
      context.drawRoundedRect(var9 - 3.5F, var10 - 3.5F, 7.0F, 7.0F, BorderRadius.all(2.5F), ec.WHITE);
      context.drawRoundedRect(var9 - 2.5F, var10 - 2.5F, 5.0F, 5.0F, BorderRadius.all(1.5F), this.getBuiltColor());
      context.drawRoundedTexture(Mytheria.id("textures/hue.png"), this.x + this.width - 18.0F, this.y + 30.0F, 12.0F, 100.0F, BorderRadius.all(4.0F));
      context.drawRoundedRect(this.x + this.width - 16.0F, this.y + 30.0F + 98.0F * this.k.getValue(), 8.0F, 2.0F, BorderRadius.all(0.2F), ec.WHITE);
      if (er.isHovered(this.x + this.width - 18.0F, this.y + 30.0F, 12.0, 100.0, context) || this.g) {
         eo.set(en.ARROW_VERTICAL);
      }

      float var11 = 30.0F;
      float var12 = this.x + 10.0F;
      float var13 = this.y + 140.0F;
      context.drawRoundedRect(var12, var13, var11, var11, BorderRadius.all(6.0F), this.getBuiltColor());
      float var14 = 85.0F;
      float var15 = 25.0F;
      float var16 = this.y + this.height - var15 - 10.0F;
      float var17 = this.x + 10.0F;
      float var18 = this.x + this.width - var14 - 10.0F;
      context.drawRoundedRect(var17, var16, var14, var15, BorderRadius.all(6.0F), ec.getAdditionalColor().withAlpha(100.0F));
      context.drawCenteredText(
         Fonts.MEDIUM.getFont(6.5F), "Отмена", var17 + var14 / 2.0F, var16 + var15 / 2.0F - Fonts.MEDIUM.getFont(6.5F).height() / 2.0F, ec.getTextColor()
      );
      if (er.isHovered(var17, var16, var14, var15, context)) {
         eo.set(en.HAND);
      }

      context.drawRoundedRect(var18, var16, var14, var15, BorderRadius.all(6.0F), ec.getAccentColor());
      context.drawCenteredText(
         Fonts.MEDIUM.getFont(6.5F), "Подтвердить", var18 + var14 / 2.0F, var16 + var15 / 2.0F - Fonts.MEDIUM.getFont(6.5F).height() / 2.0F, ec.WHITE
      );
      if (er.isHovered(var18, var16, var14, var15, context)) {
         eo.set(en.HAND);
      }

      if (er.isHovered(var5, var6, var7, var8, context)) {
         eo.set(en.HAND);
      }

      fm.pop();
      fl.end(context.getMatrices());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      if (button == MouseButton.LEFT) {
         float var6 = this.x + 10.0F;
         float var7 = this.y + 30.0F;
         float var8 = 168.0F;
         float var9 = 100.0F;
         if (er.isHovered(var6, var7, var8, var9, mouseX, mouseY)) {
            this.h = true;
         } else if (er.isHovered(this.x + this.width - 18.0F, this.y + 30.0F, 12.0, 100.0, mouseX, mouseY)) {
            this.g = true;
         } else {
            float var10 = 85.0F;
            float var11 = 25.0F;
            float var12 = this.y + this.height - var11 - 10.0F;
            float var13 = this.x + 10.0F;
            float var14 = this.x + this.width - var10 - 10.0F;
            if (er.isHovered(var13, var12, var10, var11, mouseX, mouseY)) {
               this.q = true;
               this.o = false;
            } else if (er.isHovered(var14, var12, var10, var11, mouseX, mouseY)) {
               this.p = true;
               this.o = false;
            } else {
               if (this.isHovered(mouseX, mouseY) && mouseY < this.y + 25.0F) {
                  this.d = true;
                  this.e = (float)(mouseX - this.x);
                  this.f = (float)(mouseY - this.y);
               }
            }
         }
      }
   }

   @Override
   public void onMouseReleased(double mouseX, double mouseY, MouseButton button) {
      this.d = false;
      this.g = false;
      this.h = false;
   }

   public eb getBuiltColor() {
      return eb.fromHSB(this.a, this.c, this.b);
   }

   public boolean isShowing() {
      return this.o;
   }

   public void setShowing(boolean showing) {
      this.o = showing;
   }

   public dZ getAnimation() {
      return this.i;
   }

   public boolean isConfirmed() {
      return this.p;
   }

   public boolean isCancelled() {
      return this.q;
   }
}
