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

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
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

public class dM extends dt implements IMinecraft, IScaledResolution {
   private final fw b;
   private float c;
   private float d;
   private boolean e;
   private final es f = new es();
   private du g = du.COMBAT;
   private final List<cy> h = new LinkedList<>();
   private final List<dL> i = new ArrayList<>();
   private final List<dO> j = new LinkedList<>();
   private final dZ k = new dZ(300L, Easing.BAKEK_SMALLER);
   private final cK l;
   private final fA m;
   private boolean n;
   fO a = new fO();

   public dM() {
      float var1 = 500.0F;
      float var2 = 343.0F;
      this.b = new fw(sr.getScaledWidth() / 2.0F - var1 / 2.0F, sr.getScaledHeight() / 2.0F - var2 / 2.0F, var1, var2);
      this.i.clear();

      for (du var6 : du.values()) {
         LinkedList var7 = new LinkedList();
         dL var8 = new dL(var6, var7);

         try {
            var8.setPenis(new fA(Mytheria.id("penises/" + var6.getName().toLowerCase() + ".penis")));
         } catch (RuntimeException var10) {
         }

         this.i.add(var8);
         var7.addAll(
            Mytheria.getInstance()
               .getModuleManager()
               .getModules()
               .stream()
               .sorted(Comparator.comparing(Module::getName))
               .filter(module -> module.getCategory().equals(var6.getCategory()))
               .filter(module -> !module.isHidden())
               .map(module -> new dN(module, var8))
               .toList()
         );
      }

      this.l = new cK(Fonts.MEDIUM.getFont(6.0F));
      HashMap var11 = new HashMap();

      for (Module var13 : Mytheria.getInstance().getModuleManager().getModules()) {
         if (!var13.isHidden()) {
            cJ var14 = new cJ(() -> {
               dL var2x = this.i.stream().filter(cat -> cat.getCategory().equals(this.g)).findFirst().orElse(null);
               if (var2x != null) {
                  boolean var3 = var2x.getModules().stream().anyMatch(component -> component.getModule() == var13);
                  if (var3) {
                     var13.toggle();
                  }
               }
            }, () -> this.i.forEach(panel -> panel.getModules().stream().filter(component -> component.getModule() == var13).forEach(modernModule -> {})));
            var11.put(var13.getName().replace(" ", ""), var14);
            var11.put(var13.getName(), var14);
         }
      }

      this.l.setAppend(var11);
      this.l.setPreview("Поиск");
      this.m = new fA(Mytheria.id("penises/search.penis"));
      this.m.stop();
   }

   @Compile
   protected void init() {
      this.closing = false;

      for (dL var2 : this.i) {
         if (var2.getPenis() != null) {
            var2.getPenis().stop();
         }
      }

      super.init();
   }

   public void tick() {
      this.a();
      super.tick();
   }

   @Override
   public void render(UIContext context) {
      this.menuAnimation.update(this.closing ? 0.0F : 1.0F);
      this.menuAnimation.setEasing(!this.closing ? Easing.BAKEK : Easing.BAKEK_BACK);
      this.menuAnimation.setDuration(400L);
      this.f.update();
      if (this.e) {
         this.b.setX(context.getMouseX() - this.c);
         this.b.setY(context.getMouseY() - this.d);
      }

      if (this.l.isFocused() && !this.n) {
         this.m.playOnce();
      }

      this.n = this.l.isFocused();
      float var2 = (float)(-this.f.getValue());
      float var3 = Math.min(1.0F, this.menuAnimation.getValue());

      for (dL var5 : this.i) {
         if (var5.getY() - var2 <= -this.f.getTargetValue() && this.g != var5.getCategory()) {
            this.g = var5.getCategory();
         }
      }

      boolean var28 = Mytheria.getInstance().getThemeManager().getCurrentTheme() == ct.DARK;
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var3);
      fl.scale(
         context.getMatrices(),
         this.b.getX() + this.b.getWidth() / 2.0F,
         this.b.getY() + this.b.getHeight() / 2.0F,
         0.5F + 0.5F * this.menuAnimation.getValue()
      );
      if (bJ.showGlass()) {
         context.drawLiquidGlass(
            this.b.getX(),
            this.b.getY(),
            this.b.getWidth(),
            this.b.getHeight(),
            5.0F,
            bJ.getDistortion(),
            BorderRadius.all(16.0F),
            ec.getLiquidGlassColor().mulAlpha(var3 * bJ.glass())
         );
         context.drawRoundedRect(
            this.b.getX(),
            this.b.getY(),
            this.b.getWidth(),
            this.b.getHeight(),
            BorderRadius.all(16.0F),
            (var28 ? ec.getAdditionalColor() : ec.getBackgroundColor()).withAlpha((int)(255.0F * (0.8F - 0.6F * bJ.glass()) * var3))
         );
      } else {
         if (bJ.showMinimalizm()) {
            context.drawBlurredRect(
               this.b.getX(),
               this.b.getY(),
               this.b.getWidth(),
               this.b.getHeight(),
               11.25F,
               5.0F,
               BorderRadius.all(16.0F),
               ec.WHITE.mulAlpha(var3 * bJ.minimalizm())
            );
         }

         context.drawRoundedRect(
            this.b.getX(),
            this.b.getY(),
            this.b.getWidth(),
            this.b.getHeight(),
            BorderRadius.all(16.0F),
            var28 ? ec.getAdditionalColor().mulAlpha(0.98F * var3) : ec.getBackgroundColor().mulAlpha(0.95F * var3)
         );
      }

      context.drawShadow(this.b.getX() + 5.0F, this.b.getY() + 5.0F, 109.0F, 333.0F, 20.0F, BorderRadius.all(14.0F), ec.BLACK.mulAlpha(0.2F * var3));
      if (bJ.showGlass()) {
         context.drawLiquidGlass(
            this.b.getX() + 5.0F,
            this.b.getY() + 5.0F,
            109.0F,
            333.0F,
            5.0F,
            bJ.getDistortion(),
            BorderRadius.all(12.0F),
            ec.getLiquidGlassColor().mulAlpha(var3 * bJ.glass())
         );
         context.drawRoundedRect(
            this.b.getX() + 5.0F,
            this.b.getY() + 5.0F,
            109.0F,
            333.0F,
            BorderRadius.all(12.0F),
            ec.getBackgroundColor().withAlpha((int)(255.0F * (0.8F - 0.6F * bJ.glass()) * var3 * (var28 ? 0.85F : 0.65F)))
         );
      } else {
         if (bJ.showMinimalizm()) {
            context.drawBlurredRect(
               this.b.getX() + 5.0F, this.b.getY() + 5.0F, 109.0F, 333.0F, 11.25F, BorderRadius.all(12.0F), ec.WHITE.mulAlpha(var3 * bJ.minimalizm())
            );
         }

         context.drawRoundedRect(
            this.b.getX() + 5.0F,
            this.b.getY() + 5.0F,
            109.0F,
            333.0F,
            BorderRadius.all(12.0F),
            ec.getBackgroundColor().mulAlpha(var3 * (var28 ? 0.85F : 0.65F))
         );
      }

      float var29 = this.b.getX();
      float var6 = this.b.getY();
      float var7 = 0.0F;
      float var8 = 0.0F;
      float var9 = 177.0F;
      context.drawRoundedRect(
         var29 + 13.0F,
         var6 + 13.0F,
         93.0F,
         14.0F,
         BorderRadius.all(3.0F),
         var28 ? ec.getAdditionalColor().mulAlpha(0.6F) : ec.getBackgroundColor().mulAlpha(0.6F)
      );
      fj.drawAnimationSprite(context.getMatrices(), this.m.getCurrentSprite(), var29 + 16.0F, var6 + 16.0F, 8.0F, 8.0F, ec.getTextColor().mulAlpha(0.5F));
      this.l.set(var29 + 21.0F, var6 + 13.0F, 80.0F, 14.0F);
      this.l.setTextColor(ec.getTextColor().mulAlpha(0.5F));
      this.l.render(context);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var3);
      fq var10 = new fq(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.REGULAR);
      context.drawText(Fonts.REGULAR.getFont(6.0F), "Функции", var29 + 14.0F, var6 + 35.0F, ec.getTextColor().mulAlpha(0.3F));
      var10.draw();

      for (dL var12 : this.i) {
         this.k.setDuration(150L);
         this.k.setEasing(Easing.QUAD_OUT);
         if (var12.getCategory() == this.g) {
            this.k.update(var7);
         }

         if (er.isHovered(var29 + 12.0F, var6 + 43.0F + var7, 95.0, 16.0, context)) {
            eo.set(en.HAND);
         }

         var7 += 18.0F;
      }

      context.drawRoundedRect(var29 + 12.0F, var6 + 43.0F + this.k.getValue(), 95.0F, 16.0F, BorderRadius.all(4.0F), ec.getAccentColor());
      var7 = 0.0F;
      fr var34 = new fr(VertexFormats.POSITION_TEXTURE_COLOR, context.getMatrices());

      for (dL var13 : this.i) {
         var13.getSelected().update(var13.getCategory() == this.g);
         if (var13.getPenis() == null) {
            context.drawSprite(
               var13.getCategory().getMenuSprite(),
               var29 + 18.0F,
               var6 + 47.0F + var7,
               8.0F,
               8.0F,
               ec.getTextColor().mix(ec.WHITE, var13.getSelected().getValue())
            );
         }

         var7 += 18.0F;
      }

      var34.draw();
      var7 = 0.0F;
      fr var36 = new fr(VertexFormats.POSITION_TEXTURE_COLOR, context.getMatrices());

      for (dL var14 : this.i) {
         var14.getSelected().update(var14.getCategory() == this.g);
         if (var14.getPenis() != null) {
            fj.drawAnimationSprite(
               context.getMatrices(),
               var14.getPenis().getCurrentSprite(),
               var29 + 18.0F,
               var6 + 47.0F + var7,
               8.0F,
               8.0F,
               ec.getTextColor().mix(ec.WHITE, var14.getSelected().getValue())
            );
         }

         var7 += 18.0F;
      }

      var36.draw();
      var7 = 0.0F;
      fq var38 = new fq(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.MEDIUM);

      for (dL var15 : this.i) {
         context.drawText(
            Fonts.MEDIUM.getFont(7.0F),
            var15.getCategory().getName(),
            var29 + 32.0F,
            var6 + 48.5F + var7,
            ec.getTextColor().mix(ec.WHITE, var15.getSelected().getValue())
         );
         var7 += 18.0F;
      }

      var38.draw();
      var7 = var2;
      fm.push(context.getMatrices(), this.b.getX(), this.b.getY() + 1.0F, this.b.getWidth(), this.b.getHeight() - 2.0F);
      fu var40 = new fu(5.0F);

      for (dL var16 : this.i) {
         float var17 = var7;
         var16.setY(var7);

         for (dN var19 : var16.getModules()) {
            boolean var20 = !this.c(var19);
            var19.getVisible().update(var20);
            var19.getOffset().update(var20);
            if (!this.b(var19)) {
               var19.set(var29 + 127.0F + var8, var6 + 33.0F + var7, var9, 28.0F);
               if (er.isHovered(var29, var6 - var19.getHeight(), this.b.getWidth(), this.b.getHeight() + var19.getHeight(), var19.getX(), var19.getY())) {
                  var19.render(context);
                  if (er.isHovered(var19.getX(), var19.getY(), var19.getWidth(), var19.getHeight(), context)) {
                     eo.set(en.HAND);
                  }
               }

               var8 += (var19.getWidth() + 6.5F) * var19.getOffset().getValue();
               if (var8 > this.b.getWidth() - 139.0F) {
                  var7 += 34.0F * var19.getOffset().getValue();
                  var8 = 0.0F;
               }
            }
         }

         if (var8 != 0.0F) {
            var7 += 34.0F;
         }

         var8 = 0.0F;
         var7 += 25.0F;
         if (var16.getCategory() == du.OTHER && var7 - var17 < this.b.getHeight()) {
            var7 = var17 + this.b.getHeight();
         }
      }

      var40.draw();
      ft var42 = new ft();

      for (dL var45 : this.i) {
         for (dN var52 : var45.getModules()) {
            if (!this.b(var52)
               && er.isHovered(var29, var6 - var52.getHeight(), this.b.getWidth(), this.b.getHeight() + var52.getHeight(), var52.getX(), var52.getY())) {
               var52.renderRounds(context);
            }
         }
      }

      var42.draw();
      ft var44 = new ft();

      for (dL var49 : this.i) {
         for (dN var57 : var49.getModules()) {
            if (!this.b(var57)
               && er.isHovered(var29, var6 - var57.getHeight(), this.b.getWidth(), this.b.getHeight() + var57.getHeight(), var57.getX(), var57.getY())) {
               var57.renderInto(context);
            }
         }
      }

      var44.draw();
      fq var47 = new fq(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.MEDIUM);

      for (dL var54 : this.i) {
         for (dN var21 : var54.getModules()) {
            if (!this.b(var21)
               && er.isHovered(var29, var6 - var21.getHeight(), this.b.getWidth(), this.b.getHeight() + var21.getHeight(), var21.getX(), var21.getY())) {
               var21.renderMedium(context);
            }
         }
      }

      var47.draw();
      fp var51 = new fp(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.REGULAR, 0.9F, 1.0F, var9 - 30.0F, var29 + 127.0F, context.getMatrices().peek().getPositionMatrix());

      for (dL var59 : this.i) {
         for (dN var22 : var59.getModules()) {
            if (!this.b(var22)
               && er.isHovered(var29, var6 - var22.getHeight(), this.b.getWidth(), this.b.getHeight() + var22.getHeight(), var22.getX(), var22.getY())
               && var22.getX() == var29 + 127.0F) {
               var22.renderRegular(context);
            }
         }
      }

      var51.draw();
      fp var56 = new fp(
         VertexFormats.POSITION_TEXTURE_COLOR, Fonts.REGULAR, 0.9F, 1.0F, var9 - 30.0F, var29 + 127.0F + var9 + 6.5F, context.getMatrices().peek().getPositionMatrix()
      );

      for (dL var63 : this.i) {
         for (dN var23 : var63.getModules()) {
            if (!this.b(var23)
               && er.isHovered(var29, var6 - var23.getHeight(), this.b.getWidth(), this.b.getHeight() + var23.getHeight(), var23.getX(), var23.getY())
               && var23.getX() != var29 + 127.0F) {
               var23.renderRegular(context);
            }
         }
      }

      var56.draw();
      fq var61 = new fq(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.SEMIBOLD);

      for (dL var67 : this.i) {
         if (er.isHovered(var29, var6 - 20.0F, this.b.getWidth(), this.b.getHeight() + 20.0F, var29 + 142.0F, var6 + 16.0F + var67.getY())) {
            context.drawText(
               Fonts.SEMIBOLD.getFont(12.0F),
               var67.getCategory().getName(),
               var29 + 143.0F,
               var6 + 16.0F + var67.getY(),
               Mytheria.getInstance().getThemeManager().getCurrentTheme().getTextColor()
            );
         }
      }

      var61.draw();
      fr var65 = new fr(VertexFormats.POSITION_TEXTURE_COLOR, context.getMatrices());

      for (dL var70 : this.i) {
         if (er.isHovered(var29, var6 - 20.0F, this.b.getWidth(), this.b.getHeight() + 20.0F, var29 + 142.0F, var6 + 16.0F + var70.getY())
            && var70.getPenis() == null) {
            context.drawSprite(var70.getCategory().getBigMenuSprite(), var29 + 129.0F, var6 + 15.0F + var70.getY(), 10.0F, 10.0F, ec.getTextColor());
         }
      }

      var65.draw();
      fr var69 = new fr(VertexFormats.POSITION_TEXTURE_COLOR, context.getMatrices());

      for (dL var24 : this.i) {
         if (er.isHovered(var29, var6 - 20.0F, this.b.getWidth(), this.b.getHeight() + 20.0F, var29 + 142.0F, var6 + 16.0F + var24.getY())
            && var24.getPenis() != null) {
            fj.drawAnimationSprite(
               context.getMatrices(), var24.getPenis().getCurrentSprite(), var29 + 129.0F, var6 + 15.0F + var24.getY(), 10.0F, 10.0F, ec.getTextColor()
            );
         }
      }

      var69.draw();
      float var72 = var7 - var2;
      float var73 = this.b.getHeight() - 10.0F;
      float var25 = -Math.max(0.0F, var72 - var73);
      this.f.setMax(var25 - 10.0F);
      fm.pop();
      fl.end(context.getMatrices());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

      for (dO var27 : this.j) {
         var27.render(context);
      }

      for (cy var75 : this.h) {
         var75.render(context);
      }

      this.j.removeIf(window -> window.getAnimation().getValue() == 0.0F && !window.isShowing());
      this.h.removeIf(colorPickerx -> colorPickerx.getAnimation().getValue() == 0.0F && !colorPickerx.isShowing());
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

   @Compile
   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      if (!Mytheria.getInstance().getHud().getIsland().handleClick((float)mouseX, (float)mouseY, button.getButtonIndex())) {
         for (cy var7 : this.h) {
            boolean var8 = var7.isPick();
            var7.onMouseClicked(mouseX, mouseY, button);
            if (var7.isHovered(mouseX, mouseY) || var8) {
               return;
            }

            var7.setShowing(false);
         }

         for (dO var16 : this.j) {
            var16.onMouseClicked(mouseX, mouseY, button);
            if (var16.isHovered(mouseX, mouseY)) {
               return;
            }

            if (!er.isHovered(this.b, mouseX, mouseY)) {
               boolean var18 = true;

               for (dO var10 : this.j) {
                  if (er.isHovered(var10, mouseX, mouseY)) {
                     var18 = false;
                  }
               }

               if (var18) {
                  var16.setShowing(false);
               }
            }
         }

         float var15 = this.b.getX();
         float var17 = this.b.getY();
         float var19 = 0.0F;
         float var20 = 0.0F;

         for (dL var11 : this.i) {
            if (er.isHovered(var15 + 12.0F, var17 + 43.0F + var19, 95.0, 16.0, mouseX, mouseY) && var11.getCategory() != this.g) {
               this.f.scroll((-this.f.getValue() - (var11.getY() - this.f.getValue())) / 20.0);
               if (var11.getPenis() != null) {
                  var11.getPenis().playOnce();
               }

               return;
            }

            var19 += 18.0F;
         }

         for (dL var23 : this.i) {
            for (dN var13 : var23.getModules()) {
               if (!this.b(var13)
                  && (er.isHovered(this.b, mouseX, mouseY) || button != MouseButton.LEFT && button != MouseButton.RIGHT)
                  && er.isHovered(var13.getX(), var13.getY(), var13.getWidth(), var13.getHeight(), mouseX, mouseY)) {
                  var13.onMouseClicked(mouseX, mouseY, button);
                  return;
               }
            }
         }

         if (button != MouseButton.MIDDLE) {
            this.l.onMouseClicked(mouseX, mouseY, button);
         }

         if (er.isHovered(this.b, mouseX, mouseY)) {
            this.e = true;
            this.c = (float)(mouseX - this.b.getX());
            this.d = (float)(mouseY - this.b.getY());
         }

         super.onMouseClicked(mouseX, mouseY, button);
      }
   }

   @Compile
   @Override
   public void onMouseReleased(double mouseX, double mouseY, MouseButton button) {
      this.e = false;

      for (dO var7 : this.j) {
         var7.onMouseReleased(mouseX, mouseY, button);
      }

      for (cy var9 : this.h) {
         var9.onMouseReleased(mouseX, mouseY, button);
      }

      if (this.l.isFocused()) {
         this.l.onMouseReleased(mouseX, mouseY, button);
      }

      super.onMouseReleased(mouseX, mouseY, button);
   }

   @Compile
   @Override
   public boolean onMouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      for (dO var10 : this.j) {
         var10.onScroll(mouseX, mouseY, horizontalAmount, verticalAmount);
      }

      if (er.isHovered(this.b, mouseX, mouseY)) {
         this.f.scroll(verticalAmount);
      }

      return true;
   }

   @Compile
   public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
      if (!this.l.isFocused() && Screen.hasControlDown() && keyCode == 70) {
         this.l.setFocused(true);
      }

      this.f.onKeyPressed(keyCode);

      for (dO var5 : this.j) {
         var5.onKeyPressed(keyCode, scanCode, modifiers);
      }

      for (cy var10 : this.h) {
         var10.onKeyPressed(keyCode, scanCode, modifiers);
      }

      if (this.l.isFocused() && !this.isBindingModule()) {
         this.l.onKeyPressed(keyCode, scanCode, modifiers);
      }

      for (dL var11 : this.i) {
         for (dN var7 : var11.getModules()) {
            if (!this.b(var7)) {
               var7.onKeyPressed(keyCode, scanCode, modifiers);
            }
         }
      }

      return super.keyPressed(keyCode, scanCode, modifiers);
   }

   @Compile
   public boolean charTyped(char chr, int modifiers) {
      if (this.l.isFocused() && !this.isBindingModule()) {
         this.l.charTyped(chr, modifiers);
      }

      for (dO var4 : this.j) {
         var4.charTyped(chr, modifiers);
      }

      for (dL var8 : this.i) {
         for (dN var6 : var8.getModules()) {
            if (!this.b(var6)) {
               var6.charTyped(chr, modifiers);
            }
         }
      }

      return super.charTyped(chr, modifiers);
   }

   @Compile
   public void close() {
      this.closing = true;
      bN var1 = Mytheria.getInstance().getModuleManager().getModuleSafe(bN.class);
      if (var1 != null) {
         var1.disable();
      }

      ba var2 = Mytheria.getInstance().getModuleManager().getModuleSafe(ba.class);
      if (var2 != null && var2.isEnabled()) {
         fL.CLICKGUI_OPEN.play(var2.getVolume().getCurrentValue(), 1.0F);
      }

      Mytheria.getInstance().getFileManager().writeFile("client");
      if (cK.LAST_FIELD != null) {
         cK.LAST_FIELD.setFocused(false);
      }

      super.close();
   }

   private boolean a(dN component) {
      cK var2 = this.l;
      return var2 != null
         && !var2.getBuiltText().isBlank()
         && !component.getModule().getName().toLowerCase().contains(var2.getBuiltText().toLowerCase())
         && !component.getModule().getName().replace(" ", "").toLowerCase().contains(var2.getBuiltText().toLowerCase());
   }

   private boolean b(dN component) {
      return component.getOffset().getValue() == 0.0F || this.a(component) || component.getModule().isHidden();
   }

   private boolean c(dN component) {
      return this.j.stream().anyMatch(window -> window.getModule() == component);
   }

   public boolean isBindingModule() {
      return this.i.stream().flatMap(panel -> panel.getModules().stream()).anyMatch(dN::isBinding);
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
      return this.b;
   }

   @Generated
   public float getDragX() {
      return this.c;
   }

   @Generated
   public float getDragY() {
      return this.d;
   }

   @Generated
   public boolean isDrag() {
      return this.e;
   }

   @Generated
   public es getScrollHandler() {
      return this.f;
   }

   @Generated
   public du getCurrent() {
      return this.g;
   }

   @Generated
   public List<cy> getColorPickers() {
      return this.h;
   }

   @Generated
   public List<dL> getCategories() {
      return this.i;
   }

   @Generated
   public List<dO> getWindows() {
      return this.j;
   }

   @Generated
   public dZ getCurrentCategory() {
      return this.k;
   }

   @Generated
   public cK getSearchField() {
      return this.l;
   }

   @Generated
   public fA getSearchPenis() {
      return this.m;
   }

   @Generated
   public boolean isPrevFocused() {
      return this.n;
   }

   @Generated
   public fO getTimer() {
      return this.a;
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
