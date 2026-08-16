package a.uc;
import a.b;
import a.by;
import a.cc;
import a.ew;
import a.fo;
import a.cn;
import a.l;
import a.dr;
import a.er;
import a.az;
import a.dx;
import a.r;
import a.as;
import a.ed;
import a.dd;
import a.ab;
import a.cj;
import a.cx;
import a.eg;
import a.ae;
import a.de;
import a.m;
import a.dw;
import a.d;
import a.bw;
import a.fj;
import a.v;
import a.g;
import a.bs;
import a.ce;
import a.at;
import a.dh;
import a.br;
import a.em;
import a.ct;
import a.cr;
import a.ci;
import a.aq;
import a.cg;
import a.j;
import a.bc;
import a.ag;
import a.ei;
import a.ao;
import a.cp;
import a.di;
import a.ak;
import a.aj;
import a.o;
import a.ef;
import a.dy;
import a.cd;
import a.eh;
import a.eb;
import a.fe;
import a.bk;
import a.ap;
import a.fp;
import a.ft;
import a.cf;
import a.bf;
import a.en;
import a.bi;
import a.dc;
import a.fq;
import a.au;
import a.bh;
import a.af;
import a.a;
import a.fm;
import a.bn;
import a.ah;
import a.bd;
import a.z;
import a.i;
import a.fd;
import a.ch;
import a.da;
import a.fb;
import a.df;
import a.av;
import a.ek;
import a.es;
import a.al;
import a.bq;
import a.ee;
import a.n;
import a.k;
import a.cb;
import a.el;
import a.eo;
import a.bp;
import a.ad;
import a.ck;
import a.doItem;
import a.t;
import a.db;
import a.fs;
import a.an;
import a.bt;
import a.fy;
import a.ey;
import a.dj;
import a.ff;
import a.fk;
import a.bg;
import a.fg;
import a.p;
import a.dv;
import a.y;
import a.fr;
import a.bu;
import a.dt;
import a.et;
import a.cl;
import a.cs;
import a.ec;
import a.dg;
import a.x;
import a.fl;
import a.aw;
import a.bl;
import a.cu;
import a.cw;
import a.w;
import a.fx;
import a.bo;
import a.dl;
import a.c;
import a.fu;
import a.f;
import a.fa;
import a.be;
import a.dk;
import a.bm;
import a.aa;
import a.ez;
import a.cy;
import a.bx;
import a.cq;
import a.ej;
import a.ex;
import a.du;
import a.s;
import a.dm;
import a.dn;
import a.dO;
import a.fc;
import a.ea;
import a.e;
import a.fw;
import a.dq;
import a.ds;
import a.fn;
import a.fi;
import a.ax;
import a.h;
import a.ep;
import a.cv;
import a.ca;
import a.bv;
import a.fv;
import a.q;
import a.fz;
import a.cz;
import a.ay;
import a.eq;
import a.dz;
import a.ev;
import a.ba;
import a.u;
import a.eu;
import a.ai;
import a.ac;
import a.bj;
import a.ar;
import a.am;
import a.bb;
import a.fh;
import a.dp;
import a.co;
import a.cm;
import a.bz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.framework.objects.gradient.impl.VerticalGradient;
import nesquik.mytheria.utility.animation.base.Easing;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import nesquik.mytheria.utility.interfaces.IScaledResolution;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import ru.kotopushka.compiler.sdk.annotations.Compile;

public class dR extends dt implements IMinecraft, IScaledResolution {
   private final fw a;
   private final es b = new es();
   private final List<dU> c = new ArrayList<>();
   private final List<dV> d = new LinkedList<>();
   private final List<dS> e = new LinkedList<>();
   private final cK f;
   private String g = "";
   private dU h;
   private final dZ i = new dZ(300L, Easing.BAKEK);
   private List<dW> j = new ArrayList<>();
   private List<dT> k = new ArrayList<>();
   private boolean l = true;

   public dR() {
      float var1 = 450.0F;
      float var2 = 320.0F;
      this.a = new fw(sr.getScaledWidth() / 2.0F - var1 / 2.0F, sr.getScaledHeight() / 2.0F - var2 / 2.0F, var1, var2);
      this.c.add(new dU("Visuals", du.VISUALS));
      this.c.add(new dU("HUD", null));
      this.c.add(new dU("Utilities", null));
      this.h = this.c.get(0);
      this.f = new cK(Fonts.REGULAR.getFont(9.0F));
      this.f.setPreview("Search");
   }

   @Compile
   protected void init() {
      this.closing = false;

      for (dU var2 : this.c) {
         var2.init();
      }

      super.init();
   }

   public void tick() {
      this.b();
      super.tick();
   }

   @Override
   public void render(UIContext context) {
      this.menuAnimation.update(this.closing ? 0.0F : 1.0F);
      this.menuAnimation.setEasing(!this.closing ? Easing.BAKEK : Easing.BAKEK_BACK);
      this.menuAnimation.setDuration(400L);
      this.b.update();
      String var2 = this.f.getBuiltText();
      if (!var2.equals(this.g)) {
         this.b.setValue(0.0);
         this.g = var2;
         this.l = true;
      }

      if (this.l) {
         this.a();
         this.l = false;
      }

      float var3 = Math.min(1.0F, this.menuAnimation.getValue());
      boolean var4 = Mytheria.getInstance().getThemeManager().getCurrentTheme() == ct.DARK;
      fl.scale(
         context.getMatrices(),
         this.a.getX() + this.a.getWidth() / 2.0F,
         this.a.getY() + this.a.getHeight() / 2.0F,
         0.5F + 0.5F * this.menuAnimation.getValue()
      );
      context.drawBlurredRect(
         this.a.getX(), this.a.getY(), this.a.getWidth(), this.a.getHeight(), 45.0F, 5.0F, BorderRadius.all(16.0F), ec.WHITE.withAlpha(255.0F * var3)
      );
      eb var5 = new eb(15.0F, 15.0F, 20.0F).withAlpha(255.0F * var3);
      context.drawRoundedRect(this.a.getX(), this.a.getY(), this.a.getWidth(), this.a.getHeight(), BorderRadius.all(16.0F), var5);
      context.drawRoundedRect(
         this.a.getX(),
         this.a.getY(),
         this.a.getWidth(),
         this.a.getHeight(),
         BorderRadius.all(16.0F),
         new VerticalGradient(new eb(20.0F, 30.0F, 120.0F).withAlpha(40.0F * var3), new eb(40.0F, 20.0F, 80.0F).withAlpha(60.0F * var3))
      );
      float var6 = this.a.getX();
      float var7 = this.a.getY();
      this.a(context, var6, var7, var3, var4);
      this.b(context, var6, var7, var3, var4);
      this.c(context, var6, var7, var3, var4);
      fl.end(context.getMatrices());

      for (dV var9 : this.d) {
         var9.render(context);
      }

      for (dS var11 : this.e) {
         var11.render(context);
      }

      this.d.removeIf(window -> window.getAnimation().getValue() == 0.0F && !window.isShowing());
      this.e.removeIf(window -> window.getAnimation().getValue() == 0.0F && !window.isShowing());
   }

   private void a(UIContext context, float x, float y, float alpha, boolean dark) {
      float var6 = 80.0F;
      float var7 = 25.0F;
      float var8 = 8.0F;
      float var9 = x + 20.0F;
      int var10 = this.c.indexOf(this.h);
      float var11 = var9 + var10 * (var6 + var8);
      this.i.update(var11);
      float var12 = 60.0F;
      float var13 = 2.0F;
      float var14 = y + 35.0F;
      context.drawRoundedRect(this.i.getValue() + (var6 - var12) / 2.0F, var14, var12, var13, BorderRadius.all(1.0F), ec.WHITE.withAlpha(255.0F * alpha));

      for (int var15 = 0; var15 < this.c.size(); var15++) {
         dU var16 = this.c.get(var15);
         float var17 = var9 + var15 * (var6 + var8);
         boolean var18 = var16 == this.h;
         var16.getSelectedAnimation().update(var18);
         eb var19 = var18 ? ec.WHITE.withAlpha(255.0F * alpha) : new eb(120.0F, 120.0F, 130.0F).withAlpha(255.0F * alpha);
         context.drawText(Fonts.MEDIUM.getFont(9.0F), var16.getName(), var17, y + 18.0F, var19);
         if (var15 < this.c.size() - 1) {
            float var20 = var17 + var6 + var8 / 2.0F - 1.0F;
            context.drawRect(var20, y + 15.0F, 1.0F, 20.0F, new eb(60.0F, 60.0F, 70.0F).withAlpha(255.0F * alpha));
         }
      }
   }

   private void b(UIContext context, float x, float y, float alpha, boolean dark) {
      float var6 = 120.0F;
      float var7 = 22.0F;
      float var8 = x + this.a.getWidth() - var6 - 15.0F;
      float var9 = y + 13.0F;
      context.drawRoundedRect(
         var8, var9, var6, var7, BorderRadius.all(5.0F), dark ? ec.getAdditionalColor().mulAlpha(0.6F * alpha) : ec.getBackgroundColor().mulAlpha(0.6F * alpha)
      );
      this.f.set(var8 + 8.0F, var9 + 2.0F, var6 - 16.0F, var7 - 4.0F);
      this.f.setTextColor(ec.getTextColor().withAlpha(255.0F * alpha));
      this.f.setAlpha(alpha);
      this.f.render(context);
   }

   private void a() {
      String var1 = this.f.getBuiltText().toLowerCase().trim();
      if (this.h.isHudCategory()) {
         this.k.clear();

         for (dT var3 : this.h.getHudToggles()) {
            if (var1.isEmpty() || av.translate(var3.getElement().getName()).toLowerCase().contains(var1)) {
               this.k.add(var3);
            }
         }
      } else {
         this.j.clear();

         for (dW var5 : this.h.getToggles()) {
            if (var1.isEmpty() || av.translate(var5.getModule().getName()).toLowerCase().contains(var1)) {
               this.j.add(var5);
            }
         }
      }
   }

   private void c(UIContext context, float x, float y, float alpha, boolean dark) {
      float var6 = x + 15.0F;
      float var7 = y + 50.0F;
      float var8 = this.a.getWidth() - 30.0F;
      float var9 = this.a.getHeight() - 65.0F;
      fm.push(context.getMatrices(), var6, var7, var8, var9);
      float var10 = (float)(-this.b.getValue());
      float var11 = var10;
      float var12 = (var8 - 10.0F) / 2.0F;
      float var13 = 32.0F;
      float var14 = 8.0F;
      if (this.h.isHudCategory()) {
         for (dT var16 : this.h.getHudToggles()) {
            var16.set(-1000.0F, -1000.0F, 0.0F, 0.0F);
         }

         for (int var21 = 0; var21 < this.k.size(); var21++) {
            dT var26 = this.k.get(var21);
            int var17 = var21 % 2;
            int var18 = var21 / 2;
            float var19 = var6 + var17 * (var12 + var14);
            float var20 = var7 + var11 + var18 * (var13 + var14);
            var26.set(var19, var20, var12, var13);
            var26.render(context, alpha);
         }

         float var22 = (this.k.size() + 1) / 2 * (var13 + var14);
         float var27 = -Math.max(0.0F, var22 - var9);
         this.b.setMax(var27);
      } else {
         for (dW var28 : this.h.getToggles()) {
            var28.set(-1000.0F, -1000.0F, 0.0F, 0.0F);
         }

         for (int var24 = 0; var24 < this.j.size(); var24++) {
            dW var29 = this.j.get(var24);
            int var31 = var24 % 2;
            int var32 = var24 / 2;
            float var33 = var6 + var31 * (var12 + var14);
            float var34 = var7 + var11 + var32 * (var13 + var14);
            var29.set(var33, var34, var12, var13);
            var29.render(context, alpha);
         }

         float var25 = (this.j.size() + 1) / 2 * (var13 + var14);
         float var30 = -Math.max(0.0F, var25 - var9);
         this.b.setMax(var30);
      }

      fm.pop();
   }

   @Compile
   private void b() {
      if (mc.player != null && !this.c()) {
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

   private boolean c() {
      return mc.currentScreen != null && cK.LAST_FIELD != null && cK.LAST_FIELD.isFocused();
   }

   @Compile
   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      if (!Mytheria.getInstance().getHud().getIsland().handleClick((float)mouseX, (float)mouseY, button.getButtonIndex())) {
         for (dV var7 : this.d) {
            var7.onMouseClicked(mouseX, mouseY, button);
            if (var7.isHovered(mouseX, mouseY)) {
               return;
            }

            if (!er.isHovered(this.a, mouseX, mouseY)) {
               boolean var8 = true;

               for (dV var10 : this.d) {
                  if (er.isHovered(var10, mouseX, mouseY)) {
                     var8 = false;
                  }
               }

               if (var8) {
                  var7.setShowing(false);
               }
            }
         }

         for (dS var16 : this.e) {
            var16.onMouseClicked(mouseX, mouseY, button);
            if (var16.isHovered(mouseX, mouseY)) {
               return;
            }

            if (!er.isHovered(this.a, mouseX, mouseY)) {
               boolean var18 = true;

               for (dS var22 : this.e) {
                  if (er.isHovered(var22, mouseX, mouseY)) {
                     var18 = false;
                  }
               }

               if (var18) {
                  var16.setShowing(false);
               }
            }
         }

         float var15 = 80.0F;
         float var17 = 25.0F;
         float var19 = 8.0F;
         float var21 = this.a.getX() + 20.0F;
         float var23 = this.a.getY();

         for (int var11 = 0; var11 < this.c.size(); var11++) {
            dU var12 = this.c.get(var11);
            float var13 = var21 + var11 * (var15 + var19);
            if (er.isHovered(var13 - 5.0F, var23 + 12.0F, var15, var17, mouseX, mouseY)) {
               this.h = var12;
               this.b.setValue(0.0);
               this.l = true;
               return;
            }
         }

         if (this.h.isHudCategory()) {
            for (dT var27 : this.k) {
               if (var27.getWidth() > 0.0F && var27.getHeight() > 0.0F && var27.isHovered(mouseX, mouseY)) {
                  var27.onMouseClicked(mouseX, mouseY, button, this);
                  return;
               }
            }
         } else {
            for (dW var26 : this.j) {
               if (var26.getWidth() > 0.0F && var26.getHeight() > 0.0F && var26.isHovered(mouseX, mouseY)) {
                  var26.onMouseClicked(mouseX, mouseY, button, this);
                  return;
               }
            }
         }

         if (button != MouseButton.MIDDLE) {
            this.f.onMouseClicked(mouseX, mouseY, button);
         }

         super.onMouseClicked(mouseX, mouseY, button);
      }
   }

   @Compile
   @Override
   public void onMouseReleased(double mouseX, double mouseY, MouseButton button) {
      for (dV var7 : this.d) {
         var7.onMouseReleased(mouseX, mouseY, button);
      }

      for (dS var11 : this.e) {
         var11.onMouseReleased(mouseX, mouseY, button);
      }

      if (this.h.isHudCategory()) {
         for (dT var12 : this.k) {
            var12.onMouseReleased(mouseX, mouseY, button);
         }
      } else {
         for (dW var13 : this.j) {
            var13.onMouseReleased(mouseX, mouseY, button);
         }
      }

      if (this.f.isFocused()) {
         this.f.onMouseReleased(mouseX, mouseY, button);
      }

      super.onMouseReleased(mouseX, mouseY, button);
   }

   @Compile
   @Override
   public boolean onMouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      for (dV var10 : this.d) {
         var10.onScroll(mouseX, mouseY, horizontalAmount, verticalAmount);
      }

      for (dS var12 : this.e) {
         var12.onScroll(mouseX, mouseY, horizontalAmount, verticalAmount);
      }

      if (er.isHovered(this.a, mouseX, mouseY)) {
         this.b.scroll(verticalAmount);
      }

      return true;
   }

   @Compile
   public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
      for (dV var5 : this.d) {
         var5.onKeyPressed(keyCode, scanCode, modifiers);
      }

      for (dS var7 : this.e) {
         var7.onKeyPressed(keyCode, scanCode, modifiers);
      }

      if (this.f.isFocused()) {
         this.f.onKeyPressed(keyCode, scanCode, modifiers);
      }

      this.b.onKeyPressed(keyCode);
      return super.keyPressed(keyCode, scanCode, modifiers);
   }

   @Compile
   public boolean charTyped(char chr, int modifiers) {
      for (dV var4 : this.d) {
         var4.charTyped(chr, modifiers);
      }

      for (dS var6 : this.e) {
         var6.charTyped(chr, modifiers);
      }

      if (this.f.isFocused()) {
         this.f.charTyped(chr, modifiers);
      }

      return super.charTyped(chr, modifiers);
   }

   @Compile
   public void close() {
      this.closing = true;
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
   public fw getMenuWindow() {
      return this.a;
   }

   @Generated
   public es getScrollHandler() {
      return this.b;
   }

   @Generated
   public List<dU> getCategories() {
      return this.c;
   }

   @Generated
   public cK getSearchField() {
      return this.f;
   }

   @Generated
   public dU getCurrentCategory() {
      return this.h;
   }

   @Generated
   public List<dV> getWindows() {
      return this.d;
   }

   @Generated
   public List<dS> getHudWindows() {
      return this.e;
   }
}
