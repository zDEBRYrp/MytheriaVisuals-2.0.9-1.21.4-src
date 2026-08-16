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
import a.l;
import a.uc.dR;
import a.uc.eY;
import a.uc.cK;
import a.uc.cO;
import a.uc.aZ;
import a.uc.eK;
import a.uc.dZ;
import a.dx;
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
import a.m;
import a.dw;
import a.h;
import a.j;
import a.q;
import a.n;
import a.uc.bW;
import a.p;
import a.fj;
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
import a.ba;
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
import a.ej;
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
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.systems.modules.Module;
import nesquik.mytheria.systems.setting.Setting;
import nesquik.mytheria.utility.animation.base.Easing;

public class dy extends CustomComponent {
   private final Module a;
   private final dx b;
   private final dZ c = new dZ(300L, Easing.FIGMA_EASE_IN_OUT);
   private final dZ d = new dZ(300L, Easing.FIGMA_EASE_IN_OUT);
   private final dZ e = new dZ(100L, Easing.FIGMA_EASE_IN_OUT);
   private final dZ f = new dZ(500L, Easing.FIGMA_EASE_IN_OUT);
   private final ea g = new ea(500L, eb.WHITE, Easing.FIGMA_EASE_IN_OUT);
   private boolean h;
   private boolean i;
   private final fA j;
   private final fA k;
   private fA l;
   private boolean m;
   private Font n;
   private float o;
   private final List<dz<?>> p = new ArrayList<>();
   private boolean q;

   public dy(Module module, dx parent) {
      this.a = module;
      this.b = parent;
      this.j = new fA(Mytheria.id("penises/check_enable.penis"));
      this.k = new fA(Mytheria.id("penises/check_disable.penis"));
      this.m = module.isEnabled();
      this.l = this.m ? this.j : this.k;
      if (this.m) {
         this.j.playOnce();
         this.l = this.j;
      } else {
         this.k.setFrame(0);
         this.k.stop();
         this.l = this.k;
      }
   }

   @Override
   public void onInit() {
      this.n = Fonts.REGULAR.getFont(8.0F);
      this.o = 20.0F;
      this.p.clear();

      for (Setting var2 : this.a.getSettings()) {
         dz var3 = er.settinge(var2, this);
         if (var3 != null) {
            this.p.add(var3);
         }
      }

      this.p.forEach(dz::onInit);

      for (dz var5 : this.p) {
         var5.getVisibilityAnimation().setValue(var5.getSetting().isVisible() ? 1.0F : 0.0F);
      }

      super.onInit();
   }

   @Override
   public void renderComponent(UIContext context) {
      this.d.update(this.a.isEnabled() ? 1.0F : 0.0F);
      boolean var2 = this.a.isEnabled();
      if (var2 != this.m) {
         if (var2) {
            this.l = this.j;
         } else {
            this.l = this.k;
         }

         this.l.playOnce();
         this.m = var2;
      }

      this.l.update();
      this.f.update(this.h);
      this.g.update(this.h ? new eb(255.0F, 150.0F, 150.0F) : Mytheria.getInstance().getThemeManager().getCurrentTheme().getTextColor());
      this.e.update(this.h ? (this.i ? 1.0F : -1.0F) : 0.0F);
      if (this.f.getValue() == 1.0F) {
         this.h = false;
      }

      if (this.e.getValue() == 1.0F) {
         this.i = false;
      }

      if (this.e.getValue() == -1.0F) {
         this.i = true;
      }

      if (this.b.isHovered(context) && this.isHovered(context)) {
         eo.set(en.HAND);
         if (Mytheria.getInstance().getMenuScreen() instanceof dw var3) {
            var3.setDesc(this.a.getDescription());
         }
      }
   }

   public void drawRegular8(UIContext context) {
      float var2 = 10.0F + 2.0F * this.d.getValue();
      float var3 = this.n.height();
      int var4 = this.a.getKey();
      this.c.update(this.isHovered(context.getMouseX(), context.getMouseY()));
      String var5;
      if (var4 == -1) {
         var5 = av.translate("menu.binding");
      } else {
         var5 = av.translate("key") + ": " + ej.getKeyName(var4);
      }

      context.drawText(
         this.n,
         this.q && this.b.getSelectedModuleComponent() == null ? var5 : this.a.getName(),
         this.x + var2 + this.e.getValue(),
         this.y + er.getMiddleOfBox(var3, this.o) - 0.5F,
         this.g.getColor().withAlpha(RenderSystem.getShaderColor()[3] * 255.0F * (0.75F + 0.25F * this.d.getValue() + 0.25F * this.c.getValue()))
      );
   }

   public void drawIcons(UIContext context) {
      float var2 = this.d.getValue() * RenderSystem.getShaderColor()[3];
      if (this.d.getValue() > 0.0F || this.l.isPlaying()) {
         fj.drawAnimationSprite(
            context.getMatrices(),
            this.l.getCurrentSprite(),
            this.x + this.width - 15.0F - this.d.getValue() * 2.0F,
            this.y + 7.0F,
            6.0F,
            6.0F,
            ec.getTextColor().mulAlpha(0.1F + 0.9F * var2)
         );
      }
   }

   public void drawSplit(UIContext context) {
      float var2 = 0.5F;
      context.drawRect(this.x, this.y + this.height, this.width, var2, ec.getTextColor().withAlpha(RenderSystem.getShaderColor()[3] * 255.0F * 0.02F));
   }

   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      if (this.isHovered(mouseX, mouseY)) {
         if (this.q && button != MouseButton.LEFT && button != MouseButton.RIGHT) {
            this.a.setKey(button.getButtonIndex());
            this.q = false;
         } else {
            switch (button) {
               case LEFT:
                  this.a.toggle();
                  break;
               case MIDDLE:
                  for (dy var7 : this.b.getModuleComponents()) {
                     var7.setBindingMode(false);
                  }

                  this.q = true;
                  break;
               case RIGHT:
                  this.open();
            }

            super.onMouseClicked(mouseX, mouseY, button);
         }
      }
   }

   public void open() {
      if (this.a.getSettings().isEmpty()) {
         if (Mytheria.getInstance().getModuleManager().getModule(ba.class).isEnabled() && !this.h) {
            fL.CRITICAL.play(1.0F, 1.0F);
         }

         this.h = true;
         this.i = true;
      } else {
         this.b.setSelectedModuleComponent(this);
         this.onInit();
         if (Mytheria.getInstance().getModuleManager().getModule(ba.class).isEnabled()) {
            fL.CLICKGUI_OPEN.play(0.8F, 1.3F);
         }
      }
   }

   @Override
   public void onKeyPressed(int keyCode, int scanCode, int modifiers) {
      if (this.q) {
         if (keyCode != 256 && keyCode != 261) {
            this.a.setKey(keyCode);
         } else {
            this.a.setKey(-1);
         }

         this.q = false;
         if (Mytheria.getInstance().getMenuScreen() instanceof dw var4) {
            var4.getSearchField().setFocused(false);
         }
      }

      super.onKeyPressed(keyCode, scanCode, modifiers);
   }

   @Generated
   public Module getModule() {
      return this.a;
   }

   @Generated
   public dx getParent() {
      return this.b;
   }

   @Generated
   public dZ getHoverAnimation() {
      return this.c;
   }

   @Generated
   public dZ getEnableAnimation() {
      return this.d;
   }

   @Generated
   public dZ getShakeAnimation() {
      return this.e;
   }

   @Generated
   public dZ getBlockingAnimation() {
      return this.f;
   }

   @Generated
   public ea getBlockingColorAnimation() {
      return this.g;
   }

   @Generated
   public boolean isBlocking() {
      return this.h;
   }

   @Generated
   public boolean isShakeValue() {
      return this.i;
   }

   @Generated
   public fA getEnablePenis() {
      return this.j;
   }

   @Generated
   public fA getDisablePenis() {
      return this.k;
   }

   @Generated
   public fA getCurrentPenis() {
      return this.l;
   }

   @Generated
   public boolean isLastModuleState() {
      return this.m;
   }

   @Generated
   public Font getNameFont() {
      return this.n;
   }

   @Generated
   public float getHeaderHeight() {
      return this.o;
   }

   @Generated
   public List<dz<?>> getSettingComponents() {
      return this.p;
   }

   @Generated
   public boolean isBindingMode() {
      return this.q;
   }

   @Generated
   public void setBindingMode(boolean bindingMode) {
      this.q = bindingMode;
   }
}
