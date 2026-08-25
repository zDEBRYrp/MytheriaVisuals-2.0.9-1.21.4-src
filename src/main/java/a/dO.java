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
import a.j;
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
import a.x;
import a.uc.fC;
import a.uc.aT;
import a.uc.dH;
import a.uc.fP;
import a.uc.eM;
import a.ct;
import a.uc.bA;
import a.es;
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
import a.uc.O;
import a.av;
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
import a.uc.cZ;
import a.uc.eU;
import a.uc.bJ;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.CustomComponent;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Font;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.systems.setting.Setting;
import nesquik.mytheria.utility.animation.base.Easing;

public class dO extends CustomComponent {
   private final dN a;
   private List<dz> b = new ArrayList<>();
   private final dZ c = new dZ(300L, 0.0F, Easing.BAKEK_SIZE);
   private boolean d;
   private final es e = new es();
   private float f;
   private float g;
   private boolean h;
   private final dZ i = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
   private final dZ j = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
   private final dZ k = new dZ(300L, Easing.BAKEK);
   private final ea l = new ea(300L, new eb(24.0F, 24.0F, 27.0F), Easing.FIGMA_EASE_IN_OUT);

   public dO(dN module, float x, float y, float width) {
      this.a = module;
      this.x = x;
      this.y = y;
      this.width = width;
      this.d = true;

      for (Setting var6 : module.getModule().getSettings()) {
         dz var7 = er.settinge(var6, this);
         if (var7 != null) {
            this.b.add(var7);
         }
      }
   }

   @Override
   public void renderComponent(UIContext context) {
      this.c.setDuration(this.d ? 500L : 300L);
      this.c.update(this.d && (mc.currentScreen instanceof dM || mc.currentScreen instanceof dP));
      this.e.update();
      if (this.h) {
         this.x = context.getMouseX() - this.f;
         this.y = context.getMouseY() - this.g;
      }

      float var2 = Math.min(1.0F, this.c.getValue());
      boolean var3 = Mytheria.getInstance().getMenuScreen().getMenuAnimation().getValue()
         == Mytheria.getInstance().getMenuScreen().getMenuAnimation().getTargetValue();
      boolean var4 = Mytheria.getInstance().getThemeManager().getCurrentTheme() == ct.DARK;
      this.c.setEasing(this.d ? Easing.QUARTIC_OUT : Easing.BAKEK_BACK);
      float var5 = eI.interpolate(this.a.getX(), this.x, var2);
      float var6 = eI.interpolate(this.a.getY(), this.y, var2);
      float var7 = eI.interpolate(this.a.getWidth(), this.width, var2);
      float var8 = eI.interpolate(this.a.getHeight(), this.height, var2);
      if (!this.d || !var3 || !(mc.currentScreen instanceof dM) && !(mc.currentScreen instanceof dP)) {
         var5 = this.x;
         var6 = this.y;
         var7 = this.width;
         var8 = this.height;
      }

      if (!this.d || !var3) {
         fl.scale(context.getMatrices(), var5 + var7 / 2.0F, var6 + var8 / 2.0F, 0.5F + 0.5F * this.c.getValue());
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var2);
      }

      if (bJ.showGlass()) {
         context.drawLiquidGlass(
            var5,
            var6,
            var7,
            var8,
            bJ.getGlassBlur(),
            bJ.getDistortion(),
            BorderRadius.all(6.0F + 5.0F * var2),
            ec.getLiquidGlassColor().withAlpha(255.0F * var2 * bJ.getGlassAlpha())
         );
         context.drawRoundedRect(
            var5, var6, var7, var8, BorderRadius.all(6.0F + 5.0F * var2), ec.getBackgroundColor().withAlpha(255.0F * (0.8F - 0.6F * bJ.glass()) * var2)
         );
      } else {
         if (bJ.showMinimalizm()) {
            context.drawBlurredRect(
               var5, var6, var7, var8, 11.25F, 5.0F, BorderRadius.all(6.0F + 5.0F * var2), eb.WHITE.withAlpha(255.0F * var2 * bJ.minimalizm())
            );
         }

         context.drawRoundedRect(var5, var6, var7, var8, BorderRadius.all(6.0F + 5.0F * var2), bJ.getBackgroundColor());
      }

      if (this.d && var3) {
         context.drawRoundedRect(
            var5 + var7 - 25.0F,
            var6 + 10.5F + 20.0F * var2,
            14.5F,
            7.0F,
            BorderRadius.all(3.0F),
            ec.getAdditionalColor().mix(ec.getAccentColor(), this.a.getModule().isEnabled() ? 1.0F : 0.0F).mulAlpha(1.0F - var2)
         );
         context.drawRoundedRect(
            var5 + var7 - 25.0F + 1.0F + 5 * (this.a.getModule().isEnabled() ? 1 : 0),
            var6 + 11.5F + 20.0F * var2,
            7.5F,
            5.0F,
            BorderRadius.all(1.75F),
            ec.WHITE.mulAlpha(1.0F - var2)
         );
         context.drawFadeoutText(
            Fonts.REGULAR.getFont(6.0F),
            this.a.getModule().getDescription(),
            var5 + 7.0F,
            var6 + 16.0F + 5.0F * var2,
            ec.getTextColor().mulAlpha(0.5F).mulAlpha(1.0F - var2),
            0.9F,
            1.0F,
            var7 - 30.0F
         );
      }

      if (this.d) {
         context.drawText(
            Fonts.MEDIUM.getFont(7.0F + 2.0F * var2), this.a.getModule().getName(), var5 + 7.0F + 2.0F * var2, var6 + 8.0F + 2.0F * var2, ec.getTextColor()
         );
      } else {
         context.drawText(Fonts.MEDIUM.getFont(9.0F), this.a.getModule().getName(), var5 + 9.0F, var6 + 10.0F, ec.getTextColor());
      }

      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var2);
      context.drawTexture(Mytheria.id("icons/close.png"), var5 + var7 - 17.0F, var6 + 9.0F, 8.0F, 8.0F, ec.getTextColor());
      if (er.isHovered(var5 + var7 - 17.0F, var6 + 9.0F, 8.0, 8.0, context)) {
         eo.set(en.HAND);
      }

      if (bJ.showMinimalizm()) {
         context.drawRect(var5, var6 + 24.0F, var7, 4.0F, ec.getSeparatorColor().withAlpha(ec.getSeparatorColor().getAlpha() * bJ.minimalizm()));
      }

      float var9 = 28.0F;
      float var10 = 0.0F;
       fm.push(context.getMatrices(), var5, var6 + 28.0F, var7, var8 - 28.0F);
      this.j.update(this.a.getModule().isEnabled() ? 1.0F : 0.75F);
      this.k.update(this.a.getModule().isEnabled() ? 1.0F : 0.0F);
      this.l.update(this.a.getModule().isEnabled() ? a() : Mytheria.getInstance().getThemeManager().getCurrentTheme().getAdditionalColor().mix(eb.BLACK, 0.3F));
      this.i.update(this.isHovered(context.getMouseX(), context.getMouseY()));
      if (this.isHovered(context.getMouseX(), context.getMouseY())) {
         eo.set(en.HAND);
      }

      float var11 = (float)(var6 + 28.0F - this.e.getValue());
      float var12 = 13.0F;
      float var13 = 8.0F;
      Font var14 = Fonts.REGULAR.getFont(8.0F);
      float var15 = 10.0F;
      float var16 = 19.0F;
      String var17 = av.translate("enabled");
      context.drawFadeoutText(
         var14,
         var17.substring(0, 1).toUpperCase() + var17.substring(1),
         var5 + var15,
         var11 + er.getMiddleOfBox(var14.height(), var16) - 0.5F,
         ec.getTextColor().withAlpha(255.0F * (0.75F + 0.25F * this.k.getValue() + 0.25F * this.i.getValue())),
         0.7F,
         0.99F,
         var7 - var12 - 20.0F
      );
      context.drawRoundedRect(
         var5 + var7 - var12 - 9.0F,
         var11 + 5.0F,
         var12,
         var13,
         BorderRadius.all(3.0F),
         this.l.getColor().withAlpha(!this.a.getModule().isEnabled() ? 255.0F - 100.0F * bJ.glass() : 255.0F)
      );
      context.drawRoundedRect(
         var5 + var7 - var12 - 8.0F + 5.0F * this.k.getValue(),
         var11 + 6.0F,
         6.0F,
         6.0F,
         BorderRadius.all(4.0F),
         new eb(255.0F, 255.0F, 255.0F).withAlpha(this.j.getValue() * 255.0F)
      );
      float var18 = 0.5F;
      context.drawRect(var5, var11 + 18.0F, var7, var18, ec.getTextColor().withAlpha(5.1F));
      var10 += 18.0F;

      for (dz var20 : this.b) {
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var20.getOpacity() * var2);
         var20.getVisibilityAnimation().update(var20.getSetting().isVisible() ? 1.0F : 0.0F);
         var20.setX(var5);
         var20.setY((float)(var6 + var9 + var10 - this.e.getValue()));
         var20.setWidth(var7);
          context.pushMatrix();
          context.getMatrices().translate(0.0F, (-var20.getHeight() + var20.getHeight() * var20.getOpacity()) / 2.0F, 0.0F);
          var20.render(context);
          context.popMatrix();

         var10 += var20.getHeight() * var20.getOpacity();
      }

      fm.pop();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var2);
      this.height = Math.min(200.0F, var10 + 28.0F + 5.0F);
       this.e.setMax(Math.max(0.0F, var10 - (var8 - 24.0F - 4.0F - 5.0F)));
      if (!this.d || !var3) {
         fl.end(context.getMatrices());
      }

      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      for (dz var7 : this.b) {
         if (var7.getOpacity() != 0.0F && (this.isHovered(mouseX, mouseY) || button != MouseButton.LEFT)) {
            var7.onMouseClicked(mouseX, mouseY, button);
         }
      }

      float var9 = this.y + 24.0F - (float)this.e.getValue();
      float var10 = this.y + 28.0F;
      float var8 = this.y + this.height - 5.0F;
      if (er.isHovered(this.x, var9, this.width, 18.0, mouseX, mouseY) && button == MouseButton.LEFT && var9 >= var10 - 18.0F && var9 <= var8) {
         this.a.getModule().toggle();
      }

      if (er.isHovered(this.x, this.y, this.width, 24.0, mouseX, mouseY)) {
         this.h = true;
         this.f = (float)(mouseX - this.x);
         this.g = (float)(mouseY - this.y);
      }

      if (er.isHovered(this.x + this.width - 17.0F, this.y + 9.0F, 8.0, 8.0, mouseX, mouseY)) {
         this.d = false;
      }

      super.onMouseClicked(mouseX, mouseY, button);
   }

   @Override
   public void onMouseReleased(double mouseX, double mouseY, MouseButton button) {
      for (dz var7 : this.b) {
         if (var7.getOpacity() != 0.0F) {
            var7.onMouseReleased(mouseX, mouseY, button);
         }
      }

      this.h = false;
      super.onMouseReleased(mouseX, mouseY, button);
   }

   @Override
   public void onScroll(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      for (dz var10 : this.b) {
         if (var10.getOpacity() != 0.0F) {
            var10.onScroll(mouseX, mouseY, horizontalAmount, verticalAmount);
         }
      }

      if (this.isHovered(mouseX, mouseY)) {
         this.e.scroll(verticalAmount);
      }

      super.onScroll(mouseX, mouseY, horizontalAmount, verticalAmount);
   }

   @Override
   public void onKeyPressed(int keyCode, int scanCode, int modifiers) {
      for (dz var5 : this.b) {
         if (var5.getOpacity() != 0.0F) {
            var5.onKeyPressed(keyCode, scanCode, modifiers);
         }
      }

      super.onKeyPressed(keyCode, scanCode, modifiers);
   }

   @Override
   public boolean charTyped(char chr, int modifiers) {
      for (dz var4 : this.b) {
         if (var4.getOpacity() != 0.0F) {
            var4.charTyped(chr, modifiers);
         }
      }

      return super.charTyped(chr, modifiers);
   }

   @Override
   public float getHeight() {
      float var1 = 18.0F;

      for (dz var3 : this.b) {
         var1 += var3.getHeight() * var3.getOpacity();
      }

      return this.height = Math.min(200.0F, var1 + 28.0F + 5.0F);
   }

   @Generated
   public dN getModule() {
      return this.a;
   }

   @Generated
   public List<dz> getComponents() {
      return this.b;
   }

   @Generated
   public dZ getAnimation() {
      return this.c;
   }

   @Generated
   public boolean isShowing() {
      return this.d;
   }

   @Generated
   public es getScrollHandler() {
      return this.e;
   }

   @Generated
   public float getDragX() {
      return this.f;
   }

   @Generated
   public float getDragY() {
      return this.g;
   }

   @Generated
   public boolean isDrag() {
      return this.h;
   }

   @Generated
   public dZ getHoverAnimation() {
      return this.i;
   }

   @Generated
   public dZ getCircleOpacityAnimation() {
      return this.j;
   }

   @Generated
   public dZ getEnableAnimation() {
      return this.k;
   }

   @Generated
   public ea getBackgroundColorAnimation() {
      return this.l;
   }

   @Generated
   public void setShowing(boolean showing) {
      this.d = showing;
   }

   private static eb a() {
      eb var0 = ec.getAccentColor();
      return new eb(var0.getRed() * 0.6F + 102.0F, var0.getGreen() * 0.6F + 102.0F, var0.getBlue() * 0.6F + 102.0F, 255.0F);
   }
}
