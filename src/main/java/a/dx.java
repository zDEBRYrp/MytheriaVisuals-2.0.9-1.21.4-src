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
import a.dy;
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
import a.dx;
import a.uc.R;
import a.as;
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
import a.dw;
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
import a.ct;
import a.ba;
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
import a.du;
import a.uc.dN;
import a.uc.fN;
import a.uc.cZ;
import a.uc.eU;
import a.uc.bJ;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.CustomComponent;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Font;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.systems.modules.Module;
import nesquik.mytheria.utility.animation.base.Easing;
import nesquik.mytheria.utility.interfaces.IScaledResolution;

public class dx extends CustomComponent implements IScaledResolution {
   private final du a;
   private final dZ b = new dZ(500L, Easing.BAKEK_PAGES);
   private final dZ c = new dZ(500L, Easing.BAKEK_SMALLER);
   private final List<dy> d = new ArrayList<>();
   private final es e = new es();
   private final es f = new es();
   private Font g;
   private dy h;
   private dy i;

   public dx(du category) {
      this.a = category;
   }

   @Override
   public void onInit() {
      for (Module var2 : Mytheria.getInstance()
         .getModuleManager()
         .getModules()
         .stream()
         .sorted(Comparator.comparing(Module::getName))
         .filter(modulex -> modulex.getCategory().equals(this.a.getCategory()))
         .filter(modulex -> !modulex.isHidden())
         .toList()) {
         dy var3 = new dy(var2, this);
         var3.setWidth(this.width);
         var3.setHeight(20.0F);
         this.d.add(var3);
         var3.onInit();
      }

      this.g = Fonts.SEMIBOLD.getFont(9.0F);
      this.e.reset();
      this.f.reset();
      super.onInit();
   }

   @Override
   public void update(UIContext context) {
      super.update(context);
   }

   private void a(UIContext context) {
      if (bJ.glassSelected()) {
         this.c.setEasing(Easing.BAKEK_MANY);
      } else {
         this.c.setEasing(Easing.BAKEK_SMALLER);
      }

      this.c.setDuration(500L);
      this.c
         .update(
            Mytheria.getInstance().getMenuScreen().isClosing()
               ? 2.0F
               : (
                  Math.abs(sr.getScaledWidth() / 2.0F - this.x) / 1500.0F * 3.0F < Mytheria.getInstance().getMenuScreen().getMenuAnimation().getValue()
                     ? 1.0F
                     : 0.0F
               )
         );
   }

   public void scale(UIContext context) {
      if (bJ.glassSelected()) {
         fl.scale(context.getMatrices(), sr.getScaledWidth() / 2.0F, this.y + this.height / 2.0F, 2.0F - this.c.getValue());
      } else {
         fl.scale(context.getMatrices(), this.x + this.width / 2.0F, this.y + this.height / 2.0F, 2.0F - this.c.getValue());
      }
   }

   public void renderBackground(UIContext context) {
      float var2 = Mytheria.getInstance().getMenuScreen().isClosing()
         ? Mytheria.getInstance().getMenuScreen().getMenuAnimation().getValue()
         : this.c.getValue();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var2);
      this.scale(context);
      context.drawRoundedRect(
         this.x + 1.0F,
         this.y + 1.0F,
         this.width - 2.0F,
         this.height - 2.0F,
         BorderRadius.all(10.0F),
         ec.getBackgroundColor().withAlpha(255.0F * (Mytheria.getInstance().getThemeManager().getCurrentTheme() == ct.DARK ? 0.55F : 0.7F))
      );
      fl.end(context.getMatrices());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public void renderShadow(UIContext context) {
      float var2 = Mytheria.getInstance().getMenuScreen().isClosing()
         ? Mytheria.getInstance().getMenuScreen().getMenuAnimation().getValue()
         : this.c.getValue();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var2);
      this.scale(context);
      context.drawShadow(this.x, this.y, this.width, this.height, 25.0F, BorderRadius.all(10.0F), eb.BLACK.withAlpha(51.0F));
      fl.end(context.getMatrices());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public void renderBlur(UIContext context) {
      float var2 = Mytheria.getInstance().getMenuScreen().isClosing() ? 2.0F - this.c.getValue() : this.c.getValue();
      this.scale(context);
      if (bJ.showMinimalizm()) {
         context.drawBlurredRect(this.x, this.y, this.width, this.height, 11.25F, 10.0F, BorderRadius.all(10.0F), eb.WHITE.withAlpha(255.0F * var2));
      }

      if (bJ.showGlass()) {
         context.drawLiquidGlass(
            this.x, this.y, this.width, this.height, 10.0F, bJ.getDistortion(), BorderRadius.all(10.0F), ec.getLiquidGlassColor().withAlpha(255.0F * var2)
         );
      }

      fl.end(context.getMatrices());
   }

   public void push(UIContext context) {
      float var2 = 24.0F;
      float var3 = 4.0F;
      float var4 = bJ.glass() * 2.0F;
      if (this.i != null) {
         fm.push(
            context.getMatrices(),
            this.x + var4,
            this.y + var2 * 2.0F + var3 + var4,
            this.width - var4 * 2.0F,
            this.height - var2 * 2.0F - var3 - 0.5F - var4 * 2.0F
         );
      } else {
         fm.push(context.getMatrices(), this.x + var4, this.y + var2 + var3 + var4, this.width - var4 * 2.0F, this.height - var2 - var3 - 0.5F - var4 * 2.0F);
      }
   }

   @Override
   public void renderComponent(UIContext context) {
      this.e.update();
      this.f.update();
      float var2 = 24.0F;
      this.a(context);
      float var3 = Mytheria.getInstance().getMenuScreen().isClosing() ? 2.0F - this.c.getValue() : this.c.getValue();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var3);
      this.scale(context);
      boolean var4 = Mytheria.getInstance().getThemeManager().getCurrentTheme() == ct.DARK;
      context.drawRoundedRect(
         this.x, this.y, this.width, this.height, BorderRadius.all(10.0F), ec.getBackgroundColor().withAlpha(255.0F * (var4 ? 0.9F - 0.7F * bJ.glass() : 0.7F))
      );
      float var5 = 4.0F;
      float var6 = 10.0F;
      float var7 = this.g.height();
      context.drawText(this.g, this.a.getName(), this.x + var6, this.y + er.getMiddleOfBox(var7, var2) + 0.5F, ec.getTextColor());
      if (bJ.showMinimalizm()) {
         context.drawRect(this.x, this.y + var2, this.width, var5, ec.getSeparatorColor().withAlpha(ec.getSeparatorColor().getAlpha() * bJ.minimalizm()));
      }

      if (this.i != null) {
         this.h = this.i;
      }

      this.b.update(this.i != null ? 1.0F : 0.0F);
      if (this.b.getValue() != 1.0F) {
         float var8 = this.x + -this.width * this.b.getValue();
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var3 * (1.0F - this.b.getValue()));
         fm.push(context.getMatrices(), this.x, this.y + var2 + var5, this.width, this.height - var2 - var5 - 0.5F);
         float var9 = 0.0F;

         for (dy var11 : this.d) {
            if (!this.a(var11) && !var11.getModule().isHidden()) {
               var11.setX(var8);
               var11.setY((float)(this.y + var9 - this.e.getValue()) + var2 + var5 - 1.0F);
               var11.render(context);
               var9 += var11.getHeight();
               this.e.setMax(-var9 + this.height - var2 - var5);
            }
         }

         fm.pop();
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var3);
      }

      if (this.b.getValue() != 0.0F) {
         float var16 = this.x + this.width * (1.0F - this.b.getValue());
         float var17 = this.y + var2 + var5;
         float var18 = 6.0F;
         float var19 = 8.0F;
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var3 * this.b.getValue());
         fm.push(context.getMatrices(), this.x, this.y, this.width, this.height);
         if (er.isHovered(var16, this.y + 28.0F, this.width, 20.0, context.getMouseX(), context.getMouseY())) {
            eo.set(en.HAND);
         }

         context.drawTexture(Mytheria.id("icons/arrow.png"), var16 + var18, var17 + er.getMiddleOfBox(var19, var2) - 2.0F, var19, var19, ec.getTextColor());
         context.drawText(
            Fonts.REGULAR.getFont(8.0F),
            this.h.getModule().getName(),
            var16 + var19 + 8.0F,
            var17 + er.getMiddleOfBox(var19, var2) - 1.0F,
            ec.getTextColor().withAlpha(255.0F)
         );
         if (bJ.showMinimalizm()) {
            context.drawRect(
               var16, var17 + var2 - var5, this.width, var5, ec.getSeparatorColor().withAlpha(ec.getSeparatorColor().getAlpha() * bJ.minimalizm())
            );
         }

         fm.pop();
         fm.push(context.getMatrices(), this.x, var17 + var2, this.width, this.height - var2 * 2.0F - var5 - 0.5F - bJ.glass() * 5.0F);
         float var12 = var17 + var2;
         float var13 = 0.0F;

         for (dz var15 : this.h.getSettingComponents()) {
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var15.getOpacity() * this.b.getValue());
            var15.getVisibilityAnimation().update(var15.getSetting().isVisible() ? 1.0F : 0.0F);
            var15.setX(var16);
            var15.setY((float)(var12 + var13 - this.f.getValue()));
            var15.setWidth(this.width);
            context.pushMatrix();
            context.getMatrices().translate(0.0F, (-var15.getHeight() + var15.getHeight() * var15.getOpacity()) / 2.0F, 0.0F);
            var15.render(context);
            context.popMatrix();
            var13 += var15.getHeight() * var15.getOpacity();
         }

         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var3);
         this.f.setMax(-var13 + this.height - var2 * 2.0F - var5 - (bJ.glassSelected() ? 5 : 0));
         fm.pop();
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var3);
      }

      fl.end(context.getMatrices());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public void drawRegular8(UIContext context) {
      float var2 = 24.0F;
      float var3 = Mytheria.getInstance().getMenuScreen().isClosing() ? 2.0F - this.c.getValue() : this.c.getValue();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var3);
      float var4 = 4.0F;
      if (this.i != null) {
         this.h = this.i;
      }

      if (this.b.getValue() != 1.0F) {
         float var5 = this.x + -this.width * this.b.getValue();

         for (dy var7 : this.d) {
            if (!this.a(var7)
               && !var7.getModule().isHidden()
               && (
                  er.isHovered(var5, this.y, this.width, this.height, var7.getX(), var7.getY())
                     || er.isHovered(var5, this.y, this.width, this.height, var7.getX(), var7.getY() + var7.getHeight())
               )) {
               var7.drawRegular8(context);
            }
         }
      }

      if (this.b.getValue() != 0.0F) {
         float var9 = this.x + this.width * (1.0F - this.b.getValue());
         float var10 = this.y + var2 + var4;

         for (dz var8 : this.h.getSettingComponents()) {
            if (var8.getSetting().isVisible()
               && (
                  er.isHovered(var9, var10, this.width, this.height, var8.getX(), var8.getY())
                     || er.isHovered(var9, var10, this.width, this.height, var8.getX(), var8.getY() + var8.getHeight())
               )) {
               var8.drawRegular8(context);
            }
         }
      }

      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public void drawIcons(UIContext context) {
      float var2 = Mytheria.getInstance().getMenuScreen().isClosing() ? 2.0F - this.c.getValue() : this.c.getValue();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var2);
      if (this.i != null) {
         this.h = this.i;
      }

      if (this.b.getValue() != 1.0F) {
         float var3 = this.x + -this.width * this.b.getValue();

         for (dy var5 : this.d) {
            if (!this.a(var5)
               && !var5.getModule().isHidden()
               && (
                  er.isHovered(var3, this.y, this.width, this.height, var5.getX(), var5.getY())
                     || er.isHovered(var3, this.y, this.width, this.height, var5.getX(), var5.getY() + var5.getHeight())
               )) {
               var5.drawIcons(context);
            }
         }
      }

      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public void drawType(UIContext context) {
      float var2 = 24.0F;
      float var3 = Mytheria.getInstance().getMenuScreen().isClosing() ? 2.0F - this.c.getValue() : this.c.getValue();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var3);
      this.scale(context);
      float var4 = 8.0F;
      float var5 = 10.0F;
      context.drawSprite(
         this.a.getMenuSprite(),
         this.x + this.width - var5 - var4,
         this.y + er.getMiddleOfBox(var4, var2) + 0.5F,
         var4,
         var4,
         ec.getTextColor().withAlpha(255.0F * var3)
      );
      fl.end(context.getMatrices());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public void drawSplit(UIContext context) {
      float var2 = 24.0F;
      float var3 = Mytheria.getInstance().getMenuScreen().isClosing() ? 2.0F - this.c.getValue() : this.c.getValue();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var3);
      float var4 = 4.0F;
      if (this.i != null) {
         this.h = this.i;
      }

      if (this.b.getValue() != 1.0F) {
         float var5 = this.x + -this.width * this.b.getValue();

         for (dy var7 : this.d) {
            if (!this.a(var7)
               && !var7.getModule().isHidden()
               && (
                  er.isHovered(var5, this.y, this.width, this.height, var7.getX(), var7.getY())
                     || er.isHovered(var5, this.y, this.width, this.height, var7.getX(), var7.getY() + var7.getHeight())
               )) {
               var7.drawSplit(context);
            }
         }
      }

      if (this.b.getValue() != 0.0F) {
         float var9 = this.x + this.width * (1.0F - this.b.getValue());
         float var10 = this.y + var2 + var4;

         for (dz var8 : this.h.getSettingComponents()) {
            if (var8.getSetting().isVisible()
               && (
                  er.isHovered(var9, var10, this.width, this.height, var8.getX(), var8.getY())
                     || er.isHovered(var9, var10, this.width, this.height, var8.getX(), var8.getY() + var8.getHeight())
               )) {
               var8.drawSplit(context);
            }
         }
      }

      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      if (this.i != null) {
         if (er.isHovered(this.x, this.y + 52.0F, this.width, this.height - 52.0F, mouseX, mouseY)) {
            for (dz var7 : this.i.getSettingComponents()) {
               if (var7.getSetting().isVisible()) {
                  var7.onMouseClicked(mouseX, mouseY, button);
               }
            }
         }

         float var8 = this.y + 28.0F;
         if (er.isHovered(this.x, var8, this.width, 20.0, mouseX, mouseY) && button == MouseButton.LEFT) {
            this.i = null;
            if (Mytheria.getInstance().getModuleManager().getModule(ba.class).isEnabled()) {
               fL.CLICKGUI_OPEN.play(0.8F, 1.2F);
            }
         }
      } else if (er.isHovered(this.x, this.y + 28.0F, this.width, this.height - 28.0F, mouseX, mouseY)) {
         for (dy var11 : this.d) {
            if (!this.a(var11) && !var11.getModule().isHidden()) {
               var11.onMouseClicked(mouseX, mouseY, button);
            }
         }
      }

      if (er.isHovered(this.x, this.y, this.width, this.height, mouseX, mouseY)
         && Mytheria.getInstance().getFileManager().getClientFile("client") instanceof as var12) {
         var12.setLastMenuCategory(this.a.name());
      }

      super.onMouseClicked(mouseX, mouseY, button);
   }

   @Override
   public void onMouseReleased(double mouseX, double mouseY, MouseButton button) {
      if (this.i != null) {
         for (dz var7 : this.i.getSettingComponents()) {
            if (var7.getSetting().isVisible()) {
               var7.onMouseReleased(mouseX, mouseY, button);
            }
         }
      } else {
         for (dy var9 : this.d) {
            var9.onMouseReleased(mouseX, mouseY, button);
         }
      }

      super.onMouseReleased(mouseX, mouseY, button);
   }

   @Override
   public void onKeyPressed(int keyCode, int scanCode, int modifiers) {
      if (this.isHovered(er.getMouse().getX(), er.getMouse().getY())) {
         if (this.i != null) {
            this.f.onKeyPressed(keyCode);
         } else {
            this.e.onKeyPressed(keyCode);
         }
      }

      if (this.i != null) {
         for (dz var5 : this.i.getSettingComponents()) {
            if (var5.getSetting().isVisible()) {
               var5.onKeyPressed(keyCode, scanCode, modifiers);
            }
         }
      } else {
         for (dy var7 : this.d) {
            var7.onKeyPressed(keyCode, scanCode, modifiers);
         }
      }

      super.onKeyPressed(keyCode, scanCode, modifiers);
   }

   @Override
   public boolean charTyped(char chr, int modifiers) {
      if (this.i != null) {
         for (dz var4 : this.i.getSettingComponents()) {
            if (var4.getSetting().isVisible()) {
               var4.charTyped(chr, modifiers);
            }
         }
      }

      return super.charTyped(chr, modifiers);
   }

   private boolean a(dy component) {
      if (!(Mytheria.getInstance().getMenuScreen() instanceof dw var2)) {
         return true;
      } else {
         cK var4 = var2.getSearchField();
         return var4 != null
            && !var4.getBuiltText().isBlank()
            && !component.getModule().getName().toLowerCase().contains(var4.getBuiltText().toLowerCase())
            && !component.getModule().getName().replace(" ", "").toLowerCase().contains(var4.getBuiltText().toLowerCase());
      }
   }

   @Override
   public void onScroll(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      if (this.isHovered(mouseX, mouseY)) {
         if (this.i != null) {
            this.f.scroll(verticalAmount);
         } else {
            this.e.scroll(verticalAmount);
         }
      }
   }

   @Generated
   public du getCategory() {
      return this.a;
   }

   @Generated
   public dZ getSwapping() {
      return this.b;
   }

   @Generated
   public dZ getSizing() {
      return this.c;
   }

   @Generated
   public List<dy> getModuleComponents() {
      return this.d;
   }

   @Generated
   public es getModulesScroll() {
      return this.e;
   }

   @Generated
   public es getSettingsScroll() {
      return this.f;
   }

   @Generated
   public Font getTitleFont() {
      return this.g;
   }

   @Generated
   public dy getLastSelected() {
      return this.h;
   }

   @Generated
   public dy getSelectedModuleComponent() {
      return this.i;
   }

   @Generated
   public void setTitleFont(Font titleFont) {
      this.g = titleFont;
   }

   @Generated
   public void setLastSelected(dy lastSelected) {
      this.h = lastSelected;
   }

   @Generated
   public void setSelectedModuleComponent(dy selectedModuleComponent) {
      this.i = selectedModuleComponent;
   }
}
