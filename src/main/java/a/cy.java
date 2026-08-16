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
import a.u;
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
import a.v;
import a.g;
import a.uc.fD;
import a.uc.eX;
import a.z;
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
import a.cy;
import a.uc.aC;
import a.uc.aL;
import a.uc.bQ;
import a.uc.eE;
import a.uc.eT;
import a.k;
import a.uc.cB;
import a.uc.bT;
import a.w;
import a.uc.eL;
import a.uc.bP;
import a.uc.aD;
import a.uc.fI;
import a.t;
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
import a.s;
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
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.framework.objects.gradient.Gradient;
import nesquik.mytheria.framework.objects.gradient.impl.HorizontalGradient;
import nesquik.mytheria.utility.animation.base.Easing;
import nesquik.mytheria.utility.interfaces.IScaledResolution;
import nesquik.mytheria.utility.interfaces.IWindow;
import net.minecraft.client.gui.screen.Screen;
import ru.kotopushka.compiler.sdk.annotations.Compile;

public class cy extends CustomComponent implements IScaledResolution, IWindow {
   private final dZ a = new dZ(300L, 0.0F, Easing.BAKEK_SIZE);
   private final dZ b = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
   protected final dZ dragAnim = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
   private final dZ c = new dZ(300L, 0.0F, Easing.BAKEK_SIZE);
   private final ea d = new ea(300L);
   private final ea e = new ea(200L);
   private final String f;
   private boolean g;
   private float h;
   private boolean i;
   private boolean j;
   private float k;
   private float l;
   private boolean m;
   private boolean n;
   private boolean o;
   private final boolean p;
   private final dZ q = new dZ(500L, Easing.BAKEK_PAGES);
   private final dZ r = new dZ(500L, Easing.BAKEK_PAGES);
   private final dZ s = new dZ(500L, Easing.BAKEK_PAGES);
   private final dZ t = new dZ(500L, Easing.BAKEK_PAGES);
   private float u;
   private float v;
   private float w;
   private float z;
   public static final List<cy.a> COLOR_PRESETS = new ArrayList<>(
      List.of(
         new cy.a(new eb(0.0F, 122.0F, 255.0F)),
         new cy.a(new eb(52.0F, 199.0F, 89.0F)),
         new cy.a(new eb(255.0F, 204.0F, 0.0F)),
         new cy.a(new eb(255.0F, 59.0F, 48.0F)),
         new cy.a(new eb(151.0F, 71.0F, 255.0F))
      )
   );

   public cy(float x, float y, float offsetFactor, boolean enableAlpha, eb color, String title) {
      super(x, y, 143.0F, enableAlpha ? 160.0F : 136.0F);
      this.h = offsetFactor;
      this.p = enableAlpha;
      this.g = true;
      this.e.setColor(color);
      this.f = title;
      this.update(color);
   }

   public static void setColorPresets(List<cy.a> newPresets) {
      COLOR_PRESETS.clear();
      COLOR_PRESETS.addAll(newPresets);
   }

   @Override
   public void renderComponent(UIContext context) {
      if (this.m) {
         this.u = er.getSliderValue(0.0F, 1.0F, this.y + 22.0F, 66.0F, context.getMouseY());
      }

      if (this.n) {
         this.v = 1.0F - er.getSliderValue(0.0F, 1.0F, this.x + 6.0F, 114.0F, context.getMouseX());
         this.w = 1.0F - er.getSliderValue(0.0F, 1.0F, this.y + 20.0F, 70.0F, context.getMouseY());
      }

      if (this.o) {
         this.z = er.getSliderValue(0.0F, 1.0F, this.x + 7.0F, 88.0F, context.getMouseX());
      }

      if (this.i) {
         this.x = context.getMouseX() - this.k;
         this.y = context.getMouseY() - this.l;
      }

      COLOR_PRESETS.removeIf(preset -> preset.c.getValue() == 0.0F && !preset.d);
      this.c.setEasing(this.j ? Easing.BAKEK : Easing.BAKEK_BACK);
      this.c.update(this.j);
      this.a.setEasing(this.g ? Easing.BAKEK : Easing.BAKEK_BACK);
      this.a.update(this.g);
      this.b.update(this.a.getValue() >= 0.6F);
      this.dragAnim.update(this.i);
      this.q.update(this.u);
      this.r.update(1.0F - this.v);
      this.s.update(1.0F - this.w);
      this.t.update(this.z);
      this.d.update(eb.fromHSB(this.u, 1.0F, 1.0F));
      boolean var2 = Mytheria.getInstance().getThemeManager().getCurrentTheme() == ct.DARK;
      eb var3 = ec.getBackgroundColor().withAlpha(255.0F * (var2 ? 0.9F - 0.6F * bJ.glass() : 0.7F));
      eb var4 = eb.fromHSB(this.u, this.v, this.w);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, Math.min(1.0F, this.a.getValue()));
      fl.scale(context.getMatrices(), this.x + this.width / this.h, this.y + this.height / this.h, 0.5F + this.a.getValue() * 0.5F);
      fm.push(context.getMatrices(), this.x + 1.0F, this.y + 1.0F, this.width - 2.0F, this.height - 2.0F);
      context.drawShadow(
         this.x - 5.0F,
         this.y - 5.0F,
         this.width + 10.0F,
         this.height + 10.0F,
         15.0F,
         BorderRadius.all(6.0F),
         eb.BLACK.withAlpha(255.0F * (0.1F + 0.15F * this.dragAnim.getValue()))
      );
      fm.pop();
      if (bJ.showMinimalizm()) {
         context.drawBlurredRect(
            this.x, this.y, this.width, this.height, 11.25F, 7.0F, BorderRadius.all(6.0F), eb.WHITE.withAlpha(255.0F * this.a.getValue() * bJ.minimalizm())
         );
      }

      if (bJ.showGlass()) {
         context.drawLiquidGlass(
            this.x,
            this.y,
            this.width,
            this.height,
            7.0F,
            0.05F - 0.03F * this.dragAnim.getValue(),
            BorderRadius.all(6.0F),
            ec.getLiquidGlassColor().withAlpha(255.0F * this.a.getValue() * bJ.glass())
         );
      }

      context.drawRoundedRect(this.x, this.y, this.width, this.height, BorderRadius.all(6.0F), var3);
      fm.push(context.getMatrices(), this.x, this.y, this.width, this.height);
      context.drawCenteredText(Fonts.MEDIUM.getFont(7.0F), this.f, this.x + this.width / 2.0F, this.y + 7.0F, ec.getTextColor());
      context.drawTexture(Mytheria.id("icons/colorpicker/pipette.png"), this.x + 7.0F, this.y + 6.0F, 8.0F, 8.0F);
      if (er.isHovered(this.x + 7.0F, this.y + 6.0F, 8.0, 8.0, context.getMouseX(), context.getMouseY())) {
         eo.set(en.HAND);
      }

      context.drawRoundedRect(this.x + this.width - 15.0F, this.y + 5.0F, 10.0F, 10.0F, BorderRadius.all(5.0F), ec.getAdditionalColor());
      context.drawTexture(Mytheria.id("icons/colorpicker/xmark.png"), this.x + this.width - 15.0F, this.y + 5.0F, 10.0F, 10.0F);
      if (er.isHovered(this.x + this.width - 15.0F, this.y + 5.0F, 10.0, 10.0, context.getMouseX(), context.getMouseY())) {
         eo.set(en.HAND);
      }

      context.drawRoundedTexture(Mytheria.id("textures/hue.png"), this.x + this.width - 18.0F, this.y + 20.0F, 12.0F, 70.0F, BorderRadius.all(4.0F));
      context.drawRoundedRect(this.x + this.width - 16.0F, this.y + 22.0F + 64.0F * this.q.getValue(), 8.0F, 2.0F, BorderRadius.all(0.2F), ec.WHITE);
      if (er.isHovered(this.x + this.width - 18.0F, this.y + 20.0F, 12.0, 70.0, context) || this.m) {
         eo.set(en.ARROW_VERTICAL);
      }

      context.drawRoundedRect(
         this.x + 6.0F, this.y + 20.0F, 114.0F, 70.0F, BorderRadius.all(4.0F), Gradient.of(this.d.getColor(), ec.BLACK, ec.WHITE, ec.BLACK)
      );
      context.drawRoundedRect(
         this.x + 6.0F + 114.0F * this.r.getValue() - 3.5F, this.y + 20.0F + 70.0F * this.s.getValue() - 3.5F, 7.0F, 7.0F, BorderRadius.all(2.5F), ec.WHITE
      );
      context.drawRoundedRect(
         this.x + 7.0F + 114.0F * this.r.getValue() - 3.5F, this.y + 21.0F + 70.0F * this.s.getValue() - 3.5F, 5.0F, 5.0F, BorderRadius.all(1.5F), var4
      );
      if (er.isHovered(this.x + 6.0F, this.y + 20.0F, 114.0, 70.0, context) || this.n) {
         eo.set(en.CROSSHAIR);
      }

      if (this.p) {
         context.drawText(
            Fonts.MEDIUM.getFont(5.0F), av.translate("colorpicker.opacity").toUpperCase(), this.x + 6.0F, this.y + 95.0F, ec.getTextColor().withAlpha(191.25F)
         );
         context.drawRoundedTexture(Mytheria.id("textures/empty.png"), this.x + 6.0F, this.y + 102.0F, 100.0F, 12.0F, BorderRadius.all(5.0F));
         context.drawRoundedRect(
            this.x + 6.0F - 0.5F, this.y + 102.0F - 0.5F, 101.0F, 13.0F, BorderRadius.all(5.0F), new HorizontalGradient(var4.withAlpha(0.0F), var4)
         );
         context.drawRoundedRect(this.x + this.width - 32.0F, this.y + 102.0F, 26.0F, 12.0F, BorderRadius.all(2.0F), ec.getAdditionalColor().withAlpha(255.0F));
         context.drawCenteredText(
            Fonts.MEDIUM.getFont(6.0F), (int)(this.z * 100.0F) + "%", this.x + this.width - 32.0F + 13.0F, this.y + 106.0F, ec.getTextColor()
         );
         context.drawRoundedBorder(this.x + 7.0F + 88.0F * this.t.getValue(), this.y + 103.0F, 10.0F, 10.0F, 0.5F, BorderRadius.all(4.0F), ec.WHITE);
         context.drawRoundedRect(this.x + 8.0F + 88.0F * this.t.getValue(), this.y + 104.0F, 8.0F, 8.0F, BorderRadius.all(3.0F), this.built());
         if (er.isHovered(this.x + 6.0F, this.y + 102.0F, 100.0, 12.0, context) || this.o) {
            eo.set(en.ARROW_HORIZONTAL);
         }
      }

      context.drawRoundedRect(this.x + 6.0F, this.y + this.height - 36.0F, 29.0F, 29.0F, BorderRadius.all(5.0F), this.built());
      float var5 = 0.0F;
      float var6 = 0.0F;

      for (cy.a var8 : COLOR_PRESETS) {
         var8.c.update(var8.d);
         var8.b.update(var8.a.getHue() == this.u && var8.a.getSaturation() == this.w && var8.a.getBrightness() == this.v);
         if (var8.b.getValue() > 0.0F) {
            float var9 = var8.b.getValue();
            context.drawRoundedRect(
               this.x + 45.0F + var5, this.y + this.height - 36.0F + var6, 11.0F, 11.0F, BorderRadius.all(4.5F), var8.a.withAlpha(255.0F * var8.c.getValue())
            );
            context.drawRoundedBorder(
               this.x + 45.0F + var5 - 1.0F + 2.0F * var9,
               this.y + this.height - 36.0F + var6 - 1.0F + 2.0F * var9,
               13.0F - 4.0F * var9,
               13.0F - 4.0F * var9,
               0.5F,
               BorderRadius.all(6.5F - 2.0F * var9),
               ec.WHITE.withAlpha(255.0F * var8.c.getValue() * var8.b.getValue())
            );
         } else {
            context.drawRoundedRect(
               this.x + 45.0F + var5, this.y + this.height - 36.0F + var6, 11.0F, 11.0F, BorderRadius.all(4.5F), var8.a.withAlpha(255.0F * var8.c.getValue())
            );
         }

         if (er.isHovered(this.x + 45.0F + var5, this.y + this.height - 36.0F + var6, 11.0, 11.0, context)) {
            eo.set(en.HAND);
         }

         var5 += 20.0F * var8.c.getValue();
         if (45.0F + var5 > this.width) {
            var5 = 0.0F;
            var6 += 18.0F * var8.c.getValue();
         }
      }

      if (COLOR_PRESETS.size() < 10) {
         context.drawRoundedRect(this.x + 45.0F + var5, this.y + this.height - 36.0F + var6, 11.0F, 11.0F, BorderRadius.all(4.5F), ec.getAdditionalColor());
         context.drawTexture(Mytheria.id("icons/colorpicker/plus.png"), this.x + 45.0F + var5, this.y + this.height - 36.0F + var6, 11.0F, 11.0F);
         if (er.isHovered(this.x + 45.0F + var5, this.y + this.height - 36.0F + var6, 11.0, 11.0, context)) {
            eo.set(en.HAND);
         }
      }

      fm.pop();
      fl.end(context.getMatrices());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      if (this.c.getValue() > 0.0F) {
         fw var10 = new fw(
            context.getMouseX(), context.getMouseY() + 10, 45.0F + Fonts.REGULAR.getFont(6.0F).width(av.translate("colorpicker.click_to_sample")), 30.0F
         );
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, Math.min(1.0F, this.c.getValue()));
         fl.scale(context.getMatrices(), var10.getX() + var10.getWidth() / 2.0F, var10.getY() + var10.getHeight() / 2.0F, 0.5F + this.c.getValue() * 0.5F);
         context.drawBlurredRect(
            var10.getX(),
            var10.getY(),
            var10.getWidth(),
            var10.getHeight(),
            45.0F,
            7.0F,
            BorderRadius.all(6.0F),
            eb.WHITE.withAlpha(255.0F * this.c.getValue())
         );
         context.drawRoundedRect(
            var10.getX(),
            var10.getY(),
            var10.getWidth(),
            var10.getHeight(),
            BorderRadius.all(6.0F),
            ec.getBackgroundColor().withAlpha(255.0F * (var2 ? 0.8F : 0.7F))
         );
         eb var11 = eb.fromPixel((float)(context.getMouseX() * sr.getScaleFactor()), (float)(mw.getHeight() - context.getMouseY() * sr.getScaleFactor()));
         context.drawRoundedRect(var10.getX() + 5.0F, var10.getY() + 5.0F, var10.getHeight() - 10.0F, var10.getHeight() - 10.0F, BorderRadius.all(5.0F), var11);
         context.drawTexture(Mytheria.id("icons/colorpicker/click.png"), var10.getX() + var10.getHeight(), var10.getY() + 16.0F, 6.0F, 6.0F);
         context.drawText(
            Fonts.REGULAR.getFont(6.0F),
            String.format("RGB %s %s %s", (int)var11.getRed(), (int)var11.getGreen(), (int)var11.getBlue()),
            var10.getX() + var10.getHeight(),
            var10.getY() + 8.0F,
            ec.getTextColor()
         );
         context.drawText(
            Fonts.REGULAR.getFont(6.0F),
            av.translate("colorpicker.click_to_sample"),
            var10.getX() + var10.getHeight() + 8.0F,
            var10.getY() + 17.0F,
            ec.getTextColor().withAlpha(200.0F)
         );
         fl.end(context.getMatrices());
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      }
   }

   public eb built() {
      this.e.update(eb.fromHSB(this.u, this.v, this.w).withAlpha(this.p ? 255.0F * this.z : 255.0F));
      return this.e.getColor();
   }

   @Compile
   @Override
   public void onKeyPressed(int keyCode, int scanCode, int modifiers) {
      if (Screen.isCopy(keyCode)) {
         mc.keyboard.setClipboard(this.built().toHex());
      } else if (Screen.isPaste(keyCode)) {
         String var4 = mc.keyboard.getClipboard();

         try {
            this.update(eb.fromHex(var4));
         } catch (Exception var6) {
         }
      }

      super.onKeyPressed(keyCode, scanCode, modifiers);
   }

   @Compile
   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      boolean var6 = COLOR_PRESETS.size() < 10;
      float var7 = 0.0F;
      float var8 = 0.0F;

      for (cy.a var10 : COLOR_PRESETS) {
         if (er.isHovered(this.x + 45.0F + var7, this.y + this.height - 36.0F + var8, 11.0, 11.0, mouseX, mouseY)) {
            if (button.getButtonIndex() != 0) {
               var10.d = false;
               Mytheria.getInstance().getFileManager().writeFile("client");
            } else {
               this.update(var10.a);
            }

            return;
         }

         if (var10.a.getHue() == this.u && var10.a.getSaturation() == this.w && var10.a.getBrightness() == this.v) {
            var6 = false;
         }

         var7 += 20.0F;
         if (45.0F + var7 > this.width) {
            var7 = 0.0F;
            var8 += 18.0F;
         }
      }

      if (er.isHovered(this.x + 45.0F + var7, this.y + this.height - 36.0F + var8, 11.0, 11.0, mouseX, mouseY) && var6) {
         COLOR_PRESETS.add(new cy.a(this.built()));
         Mytheria.getInstance().getFileManager().writeFile("client");
      } else if (button.getButtonIndex() != 0) {
         this.j = false;
      } else {
         if (this.j) {
            eb var11 = eb.fromPixel((float)(mouseX * sr.getScaleFactor()), (float)(mw.getHeight() - mouseY * sr.getScaleFactor()));
            this.update(var11);
            this.j = false;
         }

         if (er.isHovered(this.x + 7.0F, this.y + 6.0F, 8.0, 8.0, mouseX, mouseY)) {
            this.j = true;
         } else if (er.isHovered(this.x + this.width - 15.0F, this.y + 5.0F, 10.0, 10.0, mouseX, mouseY)) {
            this.g = false;
            this.h = 2.0F;
         } else if (er.isHovered(this.x + this.width - 18.0F, this.y + 20.0F, 12.0, 70.0, mouseX, mouseY)) {
            this.m = true;
         } else if (er.isHovered(this.x + 6.0F, this.y + 20.0F, 114.0, 70.0, mouseX, mouseY)) {
            this.n = true;
         } else if (er.isHovered(this.x + 6.0F, this.y + 102.0F, 100.0, 12.0, mouseX, mouseY)) {
            this.o = true;
         } else if (this.isHovered(mouseX, mouseY)) {
            this.i = true;
            this.k = (float)(mouseX - this.x);
            this.l = (float)(mouseY - this.y);
         }
      }
   }

   @Override
   public void onMouseReleased(double mouseX, double mouseY, MouseButton button) {
      this.i = false;
      this.n = false;
      this.m = false;
      this.o = false;
   }

   public void update(eb color) {
      this.u = color.getHue();
      this.v = color.getBrightness();
      this.w = color.getSaturation();
      this.z = color.getAlpha() / 255.0F;
      this.e.update(color);
   }

   @Generated
   public dZ getAnimation() {
      return this.a;
   }

   @Generated
   public boolean isShowing() {
      return this.g;
   }

   @Generated
   public void setShowing(boolean showing) {
      this.g = showing;
   }

   @Generated
   public boolean isDrag() {
      return this.i;
   }

   @Generated
   public boolean isPick() {
      return this.j;
   }

   public static class a {
      final eb a;
      final dZ b = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
      final dZ c = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
      boolean d = true;

      @Generated
      public a(eb color) {
         this.a = color;
      }

      @Generated
      public eb getColor() {
         return this.a;
      }

      @Generated
      public dZ getSelected() {
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
   }
}
