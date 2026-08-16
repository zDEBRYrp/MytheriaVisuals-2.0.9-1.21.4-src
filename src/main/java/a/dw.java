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
import a.dw;
import a.h;
import a.j;
import a.uc.Q;
import a.uc.N;
import a.uc.bW;
import a.uc.P;
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
import a.ct;
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
import a.uc.O;
import a.av;
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
import a.cy;
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
import a.dt;
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.systems.modules.Module;
import nesquik.mytheria.utility.animation.base.Easing;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import nesquik.mytheria.utility.interfaces.IScaledResolution;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.util.InputUtil;
import ru.kotopushka.compiler.sdk.annotations.Compile;

public class dw extends dt implements IMinecraft, IScaledResolution {
   private final dZ a = new dZ(300L, Easing.BAKEK);
   private final dZ b = new dZ(300L, Easing.BAKEK);
   private boolean c;
   private List<dx> d = new ArrayList<>();
   private float e;
   private float f;
   private String g = "";
   private cB h;
   private final List<cy> i = new ArrayList<>();
   private cK j;

   @Compile
   protected void init() {
      this.h = new cB(Fonts.REGULAR.getFont(10.0F), 10.0F, 300L, Easing.BAKEK).centered();
      this.c = false;
      this.e = 115.0F;
      this.f = 240.0F;
      this.d = Arrays.stream(du.values()).map(dx::new).toList();

      for (dx var2 : this.d) {
         var2.setWidth(this.e);
         var2.setHeight(this.f);
         var2.onInit();
      }

      this.j = new cK(Fonts.REGULAR.getFont(12.0F));
      HashMap var5 = new HashMap();

      for (Module var3 : Mytheria.getInstance().getModuleManager().getModules()) {
         if (!var3.isHidden()) {
            cJ var4 = new cJ(
               () -> {
                  boolean var2x = this.d
                     .stream()
                     .anyMatch(
                        panel -> panel.getCategory().getCategory().equals(var3.getCategory())
                           && panel.getModuleComponents().stream().anyMatch(component -> component.getModule() == var3)
                     );
                  if (var2x) {
                     var3.toggle();
                  }
               },
               () -> this.d.forEach(panelx -> panelx.getModuleComponents().stream().filter(component -> component.getModule() == var3).forEach(dy::open))
            );
            var5.put(var3.getName().replace(" ", ""), var4);
            var5.put(var3.getName(), var4);
         }
      }

      this.j.setAppend(var5);
      super.init();
   }

   public void tick() {
      this.a();
      super.tick();
   }

   @Compile
   @Override
   public void render(UIContext context) {
      this.menuAnimation.setEasing(Easing.LINEAR);
      this.menuAnimation.update(this.isClosing() ? 0.0F : 1.0F);
      this.menuAnimation.setDuration(this.isClosing() ? 300L : 500L);
      this.g = "";
      float var2 = 10.0F;
      float var3 = (sr.getScaledWidth() - (this.e + var2) * this.d.size() + var2) / 2.0F;
      float var4 = (sr.getScaledHeight() - this.f) / 2.0F;
      context.pushMatrix();
      float var5 = 0.0F;

      for (dx var7 : this.d) {
         var7.setX(eI.interpolate(var3 + var5, sr.getScaledWidth() / 2.0F - this.e / 2.0F, this.c ? 1.0F - this.menuAnimation.getValue() : 0.0));
         var7.setY(var4);
         var7.setWidth(this.e);
         var7.setHeight(this.f);
         var5 += this.e + var2;
      }

      if (bJ.showGlass()) {
         fj.updateBuffer();
      }

      for (dx var13 : this.d) {
         var13.renderBlur(context);
         var5 += this.e + var2;
      }

      for (dx var14 : this.d) {
         var14.render(context);
      }

      fr var12 = new fr(VertexFormats.POSITION_TEXTURE_COLOR, context.getMatrices());

      for (dx var8 : this.d) {
         var8.drawType(context);
      }

      var12.draw();

      for (dx var18 : this.d) {
         this.a(context, var18, () -> {
            fq var2x = new fq(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.REGULAR);
            var18.drawRegular8(context);
            var2x.draw();
            fr var3x = new fr(VertexFormats.POSITION_TEXTURE_COLOR, context.getMatrices());
            var18.drawIcons(context);
            var3x.draw();
            fs var4x = new fs(VertexFormats.POSITION_COLOR, context.getMatrices());
            var18.drawSplit(context);
            var4x.draw();
         });
      }

      context.popMatrix();
      if (this.menuAnimation.getValue() < 0.5F) {
         this.g = "";
      }

      this.a.update(this.j.isFocused());
      float var17 = this.menuAnimation.getValue() * this.a.getValue();
      if (var17 > 0.0F) {
         if (bJ.showMinimalizm()) {
            context.drawBlurredRect(
               this.j.getX(), this.j.getY(), this.j.getWidth(), this.j.getHeight(), 45.0F, BorderRadius.all(6.0F), eb.WHITE.withAlpha(255.0F * var17)
            );
         }

         if (bJ.showGlass()) {
            context.drawLiquidGlass(
               this.j.getX(), this.j.getY(), this.j.getWidth(), this.j.getHeight(), 2.0F, 0.08F, BorderRadius.all(6.0F), eb.WHITE.withAlpha(255.0F * var17)
            );
         }

         boolean var19 = Mytheria.getInstance().getThemeManager().getCurrentTheme() == ct.DARK;
         context.drawRoundedRect(
            this.j.getX(),
            this.j.getY(),
            this.j.getWidth(),
            this.j.getHeight(),
            BorderRadius.all(6.0F),
            ec.getBackgroundColor().withAlpha(255.0F * (var19 ? 0.9F - 0.7F * bJ.glass() : 0.7F) * var17)
         );
         this.j.set(sr.getScaledWidth() / 2.0F - this.j.getWidth() / 2.0F, sr.getScaledHeight() - 20.0F - 20.0F * var17, 100.0F, 20.0F);
         this.j.setAlpha(var17);
         this.j.setTextColor(ec.getTextColor());
         this.j.render(context);
         this.b.update(!this.j.getAppending().isBlank());
         context.drawCenteredText(
            Fonts.MEDIUM.getFont(11.0F),
            av.translate("search.tooltip.tab"),
            sr.getScaledWidth() / 2.0F,
            sr.getScaledHeight() - 65.0F - 10.0F * var17 * this.b.getValue(),
            eb.WHITE.withAlpha(150.0F * var17 * this.b.getValue())
         );
         context.drawCenteredText(
            Fonts.MEDIUM.getFont(11.0F),
            av.translate("search.tooltip.enter"),
            sr.getScaledWidth() / 2.0F,
            sr.getScaledHeight() - 50.0F - 10.0F * var17 * this.b.getValue(),
            eb.WHITE.withAlpha(150.0F * var17 * this.b.getValue())
         );
      } else {
         this.j.clear();
      }

      context.drawCenteredText(
         Fonts.MEDIUM.getFont(11.0F),
         av.translate("search.tooltip"),
         sr.getScaledWidth() / 2.0F,
         sr.getScaledHeight() - 20.0F - 10.0F * this.menuAnimation.getValue() * (1.0F - this.a.getValue()),
         eb.WHITE.withAlpha(150.0F * this.menuAnimation.getValue() * (1.0F - this.a.getValue()))
      );
      this.h.pos(sr.getScaledWidth() / 2.0F, sr.getScaledHeight() / 2.0F - 150.0F);
      if (!this.g.contains(".description")) {
         this.h.update(this.g);
         this.h.render(context);
      }

      for (cy var9 : this.i) {
         var9.render(context);
         if (!(mc.currentScreen instanceof dw)) {
            var9.setShowing(false);
         }
      }

      this.i.removeIf(popup -> popup.getAnimation().getValue() == 0.0F && !popup.isShowing());
   }

   @Compile
   private void a() {
      if (mc.player != null && !this.b()) {
         long var1 = mc.getWindow().getHandle();
         KeyBinding[] var3 = new KeyBinding[]{
            mc.options.forwardKey, mc.options.backKey, mc.options.leftKey, mc.options.rightKey, mc.options.jumpKey
         };

         for (KeyBinding var7 : var3) {
            int var8 = InputUtil.fromTranslationKey(var7.getBoundKeyTranslationKey()).getCode();
            var7.setPressed(InputUtil.isKeyPressed(var1, var8));
         }

         if (mc.player.getAbilities().flying) {
            int var9 = InputUtil.fromTranslationKey(mc.options.sneakKey.getBoundKeyTranslationKey()).getCode();
            mc.options.sneakKey.setPressed(InputUtil.isKeyPressed(var1, var9));
         }
      }
   }

   private boolean b() {
      return mc.currentScreen != null && cK.LAST_FIELD != null && cK.LAST_FIELD.isFocused();
   }

   public boolean isBindingModule() {
      return this.d.stream().flatMap(panel -> panel.getModuleComponents().stream()).anyMatch(dy::isBindingMode);
   }

   private void a(UIContext context, dx panel, Runnable runnable) {
      panel.scale(context);
      panel.push(context);
      runnable.run();
      fm.pop();
      fl.end(context.getMatrices());
   }

   @Compile
   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      if (!Mytheria.getInstance().getHud().getIsland().handleClick((float)mouseX, (float)mouseY, button.getButtonIndex())) {
         for (cy var7 : this.i) {
            boolean var8 = var7.isPick();
            var7.onMouseClicked(mouseX, mouseY, button);
            if (var7.isHovered(mouseX, mouseY) || var8) {
               return;
            }

            var7.setShowing(false);
         }

         for (dx var10 : this.d) {
            if (var10.isHovered(mouseX, mouseY)) {
               var10.onMouseClicked(mouseX, mouseY, button);
            }
         }

         if (this.j.isFocused() && button != MouseButton.MIDDLE) {
            this.j.onMouseClicked(mouseX, mouseY, button);
         }

         super.onMouseClicked(mouseX, mouseY, button);
      }
   }

   @Compile
   @Override
   public void onMouseReleased(double mouseX, double mouseY, MouseButton button) {
      for (cy var7 : this.i) {
         var7.onMouseReleased(mouseX, mouseY, button);
      }

      for (dx var9 : this.d) {
         var9.onMouseReleased(mouseX, mouseY, button);
      }

      if (this.j.isFocused()) {
         this.j.onMouseReleased(mouseX, mouseY, button);
      }

      super.onMouseReleased(mouseX, mouseY, button);
   }

   @Override
   public boolean onMouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      for (dx var10 : this.d) {
         var10.onScroll(mouseX, mouseY, horizontalAmount, verticalAmount);
      }

      return true;
   }

   @Compile
   public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
      for (cy var5 : this.i) {
         var5.onKeyPressed(keyCode, scanCode, modifiers);
      }

      if (this.j != null && !this.j.isFocused() && Screen.hasControlDown() && keyCode == 70) {
         this.j.setFocused(true);
      }

      for (dx var7 : this.d) {
         var7.onKeyPressed(keyCode, scanCode, modifiers);
      }

      if (this.j.isFocused() && !this.isBindingModule()) {
         this.j.onKeyPressed(keyCode, scanCode, modifiers);
      }

      return super.keyPressed(keyCode, scanCode, modifiers);
   }

   @Compile
   public boolean charTyped(char chr, int modifiers) {
      if (this.j.isFocused() && !this.isBindingModule()) {
         this.j.charTyped(chr, modifiers);
      }

      for (dx var4 : this.d) {
         var4.charTyped(chr, modifiers);
      }

      return super.charTyped(chr, modifiers);
   }

   @Compile
   public void close() {
      this.c = true;
      Mytheria.getInstance().getModuleManager().getModule(bN.class).disable();
      ba var1 = Mytheria.getInstance().getModuleManager().getModule(ba.class);
      if (var1.isEnabled()) {
         fL.CLICKGUI_OPEN.play(var1.getVolume().getCurrentValue(), 1.0F);
      }

      Mytheria.getInstance().getFileManager().writeFile("client");
      if (cK.LAST_FIELD != null) {
         cK.LAST_FIELD.setFocused(false);
      }

      super.close();
   }

   public boolean shouldPause() {
      return false;
   }

   public void renderBackground(DrawContext context, int mouseX, int mouseY, float delta) {
   }

   public boolean shouldCloseOnEsc() {
      return true;
   }

   @Generated
   public dZ getSearchAnimation() {
      return this.a;
   }

   @Generated
   public dZ getAppendingAnim() {
      return this.b;
   }

   @Generated
   @Override
   public boolean isClosing() {
      return this.c;
   }

   @Generated
   public List<dx> getPanels() {
      return this.d;
   }

   @Generated
   public float getPanelWidth() {
      return this.e;
   }

   @Generated
   public float getPanelHeight() {
      return this.f;
   }

   @Generated
   public String getDesc() {
      return this.g;
   }

   @Generated
   public cB getDescText() {
      return this.h;
   }

   @Generated
   public List<cy> getColorPickers() {
      return this.i;
   }

   @Generated
   @Override
   public void setClosing(boolean closing) {
      this.c = closing;
   }

   @Generated
   public void setDesc(String desc) {
      this.g = desc;
   }

   @Generated
   public cK getSearchField() {
      return this.j;
   }

   static {
      new dx(null);
      new dA(null, null);
      new dB(null, null);
      new dC(null, null);
      new dF(null, null);
      new dD(null, null);
      new dE(null, null);
      new dK(null, null);
      new dH(null, null);
      new dJ(null, null);
   }
}
