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
import java.util.List;
import java.util.Map.Entry;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.CustomScreen;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Font;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.utility.animation.base.Easing;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import nesquik.mytheria.utility.interfaces.IScaledResolution;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;

public class dX extends CustomScreen implements IMinecraft, IScaledResolution {
   private final fw a;
   private final es b = new es();
   private final dZ c = new dZ(400L, 0.0F, Easing.BAKEK);
   private boolean d = false;
   private boolean e = false;
   private final cK f;
   private final cK g;
   private final cK h;
   private final cK i;
   private final cK j;
   private final List<dX.a> k = new ArrayList<>();
   private dX.a l = null;
   private final dZ m = new dZ(300L, -1.0F, Easing.BAKEK);
   private boolean n = false;
   private boolean o = false;
   private int p = -1;
   private boolean q = false;
   private final dZ r = new dZ(300L, Easing.FIGMA_EASE_IN_OUT);
   private final dZ s = new dZ(300L, Easing.FIGMA_EASE_IN_OUT);
   private final dZ t = new dZ(300L, Easing.FIGMA_EASE_IN_OUT);
   private final ea u = new ea(300L, ec.getTextColor(), Easing.FIGMA_EASE_IN_OUT);

   public dX() {
      float var1 = 500.0F;
      float var2 = 343.0F;
      this.a = new fw(sr.getScaledWidth() / 2.0F - var1 / 2.0F, sr.getScaledHeight() / 2.0F - var2 / 2.0F, var1, var2);
      this.f = new cK(Fonts.REGULAR.getFont(7.0F));
      this.f.setPreview(av.translate("waypoints.gui.search"));
      this.f.setFocused(false);
      this.g = new cK(Fonts.REGULAR.getFont(7.0F));
      this.g.setPreview(av.translate("waypoints.gui.name"));
      this.h = new cK(Fonts.REGULAR.getFont(7.0F));
      this.h.setPreview("X");
      this.i = new cK(Fonts.REGULAR.getFont(7.0F));
      this.i.setPreview("Y");
      this.j = new cK(Fonts.REGULAR.getFont(7.0F));
      this.j.setPreview("Z");
      this.b();
      this.a();
   }

   private void a() {
      this.k.clear();
      cv var1 = Mytheria.getInstance().getWayPointsManager();
      String var2 = this.f.getBuiltText().toLowerCase();

      for (Entry var4 : var1.getEntries()) {
         if (var2.isEmpty() || ((String)var4.getKey()).toLowerCase().contains(var2)) {
            this.k
               .add(
                  new dX.a(
                     (String)var4.getKey(),
                     (int)((Vec3d)var4.getValue()).x,
                     (int)((Vec3d)var4.getValue()).y,
                     (int)((Vec3d)var4.getValue()).z
                  )
               );
         }
      }
   }

   private void b() {
      cv var1 = Mytheria.getInstance().getWayPointsManager();
      this.p = var1.getQuickWaypointBind();
      this.n = var1.isAutoWaypointOnEvent();
      this.o = var1.isAutoWaypointOnDeath();
      this.r.setValue(this.n ? 1.0F : 0.0F);
      this.s.setValue(this.o ? 1.0F : 0.0F);
      String var2 = this.p == -1 ? "Не задан" : ej.getKeyName(this.p);
      float var3 = Fonts.REGULAR.getFont(7.0F).width(var2) + 7.0F;
      this.t.setValue(var3);
   }

   private void c() {
      cv var1 = Mytheria.getInstance().getWayPointsManager();
      var1.setQuickWaypointBind(this.p);
      var1.setAutoWaypointOnEvent(this.n);
      var1.setAutoWaypointOnDeath(this.o);
   }

   protected void init() {
      this.d = false;
      this.f.setFocused(false);
      this.g.setFocused(false);
      this.h.setFocused(false);
      this.i.setFocused(false);
      this.j.setFocused(false);
      super.init();
   }

   public void tick() {
      super.tick();
   }

   @Override
   public void render(UIContext context) {
      this.c.update(this.d ? 0.0F : 1.0F);
      this.c.setEasing(!this.d ? Easing.BAKEK : Easing.BAKEK_BACK);
      this.b.update();
      if (this.d && this.c.getValue() == 0.0F) {
         if (this.e) {
            mc.setScreen(new dP());
         } else {
            super.close();
         }
      } else {
         float var2 = Math.min(1.0F, this.c.getValue());
         boolean var3 = Mytheria.getInstance().getThemeManager().getCurrentTheme() == ct.DARK;
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var2);
         fl.scale(context.getMatrices(), this.a.getX() + this.a.getWidth() / 2.0F, this.a.getY() + this.a.getHeight() / 2.0F, 0.5F + 0.5F * this.c.getValue());
         if (bJ.showGlass()) {
            context.drawLiquidGlass(
               this.a.getX(),
               this.a.getY(),
               this.a.getWidth(),
               this.a.getHeight(),
               5.0F,
               bJ.getDistortion(),
               BorderRadius.all(12.0F),
               ec.getLiquidGlassColor().mulAlpha(var2 * bJ.glass())
            );
            context.drawRoundedRect(
               this.a.getX(),
               this.a.getY(),
               this.a.getWidth(),
               this.a.getHeight(),
               BorderRadius.all(12.0F),
               bJ.getBackgroundColor().withAlpha((int)(255.0F * (0.8F - 0.6F * bJ.glass()) * var2))
            );
         } else {
            context.drawRoundedRect(this.a.getX(), this.a.getY(), this.a.getWidth(), this.a.getHeight(), BorderRadius.all(12.0F), bJ.getBackgroundColor());
         }

         float var4 = this.a.getX();
         float var5 = this.a.getY();
         this.b(context, var4, var5, var2);
         this.a(context, var4, var5, var2);
         this.c(context, var4, var5, var2);
         this.d(context, var4, var5, var2);
         fl.end(context.getMatrices());
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      }
   }

   private void a(UIContext context, float x, float y, float alpha) {
      float var5 = 30.0F;
      float var6 = 5.0F;
      float var7 = var5 * 2.0F + var6;
      float var8 = x + (this.a.getWidth() - var7) / 2.0F;
      float var9 = y + this.a.getHeight() + 10.0F;
      float var10 = var8;
      float var11 = var8 + var5 + var6;
      if (bJ.showGlass()) {
         context.drawLiquidGlass(
            var10,
            var9,
            var5,
            var5,
            bJ.getGlassBlur(),
            bJ.getDistortion(),
            BorderRadius.all(6.0F),
            ec.getLiquidGlassColor().mulAlpha(alpha * bJ.getGlassAlpha())
         );
         context.drawRoundedRect(
            var10, var9, var5, var5, BorderRadius.all(6.0F), bJ.getBackgroundColor().withAlpha((int)(255.0F * (0.8F - 0.6F * bJ.glass()) * alpha))
         );
      } else {
         context.drawRoundedRect(var10, var9, var5, var5, BorderRadius.all(6.0F), ec.getBackgroundColor().mulAlpha(alpha));
      }

      float var12 = 12.0F;
      float var13 = var10 + (var5 - var12) / 2.0F;
      float var14 = var9 + (var5 - var12) / 2.0F;
      context.drawTexture(Mytheria.id("icons/inventory.png"), var13, var14, var12, var12, ec.WHITE);
      if (er.isHovered(var10, var9, var5, var5, context)) {
         eo.set(en.HAND);
      }

      if (bJ.showGlass()) {
         context.drawLiquidGlass(
            var11,
            var9,
            var5,
            var5,
            bJ.getGlassBlur(),
            bJ.getDistortion(),
            BorderRadius.all(6.0F),
            ec.getLiquidGlassColor().mulAlpha(alpha * bJ.getGlassAlpha())
         );
         context.drawRoundedRect(
            var11, var9, var5, var5, BorderRadius.all(6.0F), bJ.getBackgroundColor().withAlpha((int)(255.0F * (0.8F - 0.6F * bJ.glass()) * alpha))
         );
      } else {
         context.drawRoundedRect(var11, var9, var5, var5, BorderRadius.all(6.0F), ec.getBackgroundColor().mulAlpha(alpha));
      }

      var13 = var11 + (var5 - var12) / 2.0F;
      var14 = var9 + (var5 - var12) / 2.0F;
      context.drawTexture(Mytheria.id("icons/way2.png"), var13, var14, var12, var12, ec.WHITE);
      if (er.isHovered(var11, var9, var5, var5, context)) {
         eo.set(en.HAND);
      }
   }

   private void b(UIContext context, float x, float y, float alpha) {
      context.drawText(Fonts.SEMIBOLD.getFont(10.0F), av.translate("waypoints.title"), x + 15.0F, y + 12.0F, ec.getTextColor().mulAlpha(alpha));
      float var5 = 8.0F;
      float var6 = x + this.a.getWidth() - var5 - 15.0F;
      float var7 = y + 12.0F;
      context.drawTexture(Mytheria.id("icons/close.png"), var6, var7, var5, var5, ec.getTextColor().mulAlpha(alpha));
      if (er.isHovered(var6, var7, var5, var5, context)) {
         eo.set(en.HAND);
      }
   }

   private void c(UIContext context, float x, float y, float alpha) {
      float var5 = x + 10.0F;
      float var6 = y + 35.0F;
      float var7 = 280.0F;
      float var8 = 30.0F;
      float var9 = this.a.getHeight() - 45.0F - 70.0F - var8;
      boolean var10 = Mytheria.getInstance().getThemeManager().getCurrentTheme() == ct.DARK;
      if (bJ.showGlass()) {
         context.drawLiquidGlass(
            var5,
            var6,
            var7,
            var8,
            bJ.getGlassBlur(),
            bJ.getDistortion(),
            BorderRadius.all(8.0F),
            ec.getLiquidGlassColor().mulAlpha(alpha * bJ.getGlassAlpha())
         );
         context.drawRoundedRect(
            var5, var6, var7, var8, BorderRadius.all(8.0F), bJ.getBackgroundColor().withAlpha((int)(255.0F * (0.8F - 0.6F * bJ.glass()) * alpha))
         );
      } else {
         context.drawRoundedRect(var5, var6, var7, var8, BorderRadius.all(8.0F), ec.getBackgroundColor().mulAlpha((var10 ? 0.8F : 0.6F) * alpha));
      }

      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, alpha);
      this.f.set(var5 + 10.0F, var6 + 8.0F, var7 - 20.0F, var8 - 16.0F);
      this.f.setTextColor(ec.getTextColor().mulAlpha(alpha));
      this.f.setAlpha(alpha);
      this.f.render(context);
      float var11 = var6 + var8 + 5.0F;
      if (bJ.showGlass()) {
         context.drawLiquidGlass(
            var5,
            var11,
            var7,
            var9,
            bJ.getGlassBlur(),
            bJ.getDistortion(),
            BorderRadius.all(8.0F),
            ec.getLiquidGlassColor().mulAlpha(alpha * bJ.getGlassAlpha())
         );
         context.drawRoundedRect(
            var5, var11, var7, var9, BorderRadius.all(8.0F), bJ.getBackgroundColor().withAlpha((int)(255.0F * (0.8F - 0.6F * bJ.glass()) * alpha))
         );
      } else {
         context.drawRoundedRect(var5, var11, var7, var9, BorderRadius.all(8.0F), ec.getBackgroundColor().mulAlpha((var10 ? 0.8F : 0.6F) * alpha));
      }

      fm.push(context.getMatrices(), var5, var11, var7, var9);
      float var12 = (float)(-this.b.getValue());
      float var13 = 45.0F;
      float var14 = var11 + 5.0F + var12;

      for (int var15 = 0; var15 < this.k.size(); var15++) {
         dX.a var16 = this.k.get(var15);
         boolean var17 = var16 == this.l;
         if (var17) {
            this.m.update(var15);
         }

         eb var18 = var17 ? ec.getAccentColor().mulAlpha(0.3F * alpha) : ec.getAdditionalColor().mulAlpha((var10 ? 0.6F : 0.5F) * alpha);
         context.drawRoundedRect(var5 + 5.0F, var14, var7 - 10.0F, var13 - 5.0F, BorderRadius.all(6.0F), var18);
         float var19 = 25.0F;
         float var20 = var5 + 10.0F;
         float var21 = var14 + (var13 - 5.0F - var19) / 2.0F;
         context.drawRoundedRect(var20, var21, var19, var19, BorderRadius.all(5.0F), ec.WHITE.mulAlpha(alpha));
         context.drawTexture(Mytheria.id("icons/way.png"), var20 + 1.0F, var21 + 1.0F, var19 - 2.0F, var19 - 2.0F, ec.getTextColor().mulAlpha(alpha));
         float var22 = var20 + var19 + 8.0F;
         float var23 = var14 + (var13 - 5.0F - Fonts.MEDIUM.getFont(8.0F).height() - Fonts.REGULAR.getFont(6.5F).height() - 2.0F) / 2.0F;
         context.drawText(Fonts.MEDIUM.getFont(8.0F), var16.name, var22, var23, ec.getTextColor().mulAlpha(alpha));
         String var24 = String.format("X: %d Y: %d Z: %d", var16.x, var16.y, var16.z);
         context.drawText(
            Fonts.REGULAR.getFont(6.5F), var24, var22, var23 + Fonts.MEDIUM.getFont(8.0F).height() + 4.0F, ec.getTextColor().mulAlpha(0.6F * alpha)
         );
         float var25 = 8.0F;
         float var26 = var5 + var7 - var25 - 15.0F;
         float var27 = var14 + (var13 - 5.0F - var25) / 2.0F;
         context.drawTexture(Mytheria.id("icons/close.png"), var26, var27, var25, var25, eb.RED.mulAlpha(alpha));
         if (er.isHovered(var26, var27, var25, var25, context)) {
            eo.set(en.HAND);
         }

         if (er.isHovered(var5 + 5.0F, var14, var7 - 10.0F, var13 - 5.0F, context)) {
            eo.set(en.HAND);
         }

         var14 += var13;
      }

      fm.pop();
      float var28 = this.k.size() * var13;
      float var29 = -Math.max(0.0F, var28 - var9 + 10.0F);
      this.b.setMax(var29);
      float var30 = var11 + var9 + 5.0F;
      float var33 = 19.0F;
      float var34 = var33 * 3.0F;
      if (bJ.showGlass()) {
         context.drawLiquidGlass(
            var5,
            var30,
            var7,
            var34,
            bJ.getGlassBlur(),
            bJ.getDistortion(),
            BorderRadius.all(8.0F),
            ec.getLiquidGlassColor().mulAlpha(alpha * bJ.getGlassAlpha())
         );
         context.drawRoundedRect(
            var5, var30, var7, var34, BorderRadius.all(8.0F), bJ.getBackgroundColor().withAlpha((int)(255.0F * (0.8F - 0.6F * bJ.glass()) * alpha))
         );
      } else {
         context.drawRoundedRect(var5, var30, var7, var34, BorderRadius.all(8.0F), ec.getBackgroundColor().mulAlpha((var10 ? 0.8F : 0.6F) * alpha));
      }

      this.a(context, var5, var30, var7, var33, "Авто метка при событии", this.n, alpha, this.r);
      float var35 = 0.5F;
      context.drawRect(var5, var30 + var33, var7, var35, ec.getTextColor().withAlpha(5.1F * alpha));
      var30 += var33;
      this.a(context, var5, var30, var7, var33, "Авто метка при смерти", this.o, alpha, this.s);
      context.drawRect(var5, var30 + var33, var7, var35, ec.getTextColor().withAlpha(5.1F * alpha));
      var30 += var33;
      this.a(context, var5, var30, var7, var33, "Быстрая метка", this.p, alpha);
   }

   private void d(UIContext context, float x, float y, float alpha) {
      float var5 = x + 300.0F;
      float var6 = y + 35.0F;
      float var7 = 190.0F;
      float var8 = this.a.getHeight() - 45.0F;
      boolean var9 = Mytheria.getInstance().getThemeManager().getCurrentTheme() == ct.DARK;
      if (bJ.showGlass()) {
         context.drawLiquidGlass(
            var5,
            var6,
            var7,
            var8,
            bJ.getGlassBlur(),
            bJ.getDistortion(),
            BorderRadius.all(8.0F),
            ec.getLiquidGlassColor().mulAlpha(alpha * bJ.getGlassAlpha())
         );
         context.drawRoundedRect(
            var5, var6, var7, var8, BorderRadius.all(8.0F), bJ.getBackgroundColor().withAlpha((int)(255.0F * (0.8F - 0.6F * bJ.glass()) * alpha))
         );
      } else {
         context.drawRoundedRect(var5, var6, var7, var8, BorderRadius.all(8.0F), ec.getBackgroundColor().mulAlpha((var9 ? 0.8F : 0.6F) * alpha));
      }

      String var10 = this.l != null ? av.translate("waypoints.gui.edit") : av.translate("waypoints.gui.add");
      context.drawText(Fonts.MEDIUM.getFont(8.0F), var10, var5 + 10.0F, var6 + 10.0F, ec.getTextColor().mulAlpha(alpha));
      float var11 = var6 + 30.0F;
      float var12 = var7 - 20.0F;
      float var13 = 25.0F;
      float var14 = 35.0F;
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, alpha);
      if (bJ.showGlass()) {
         context.drawRoundedRect(var5 + 10.0F, var11, var12, var13, BorderRadius.all(5.0F), ec.getAdditionalColor().mulAlpha(0.3F * alpha));
      } else {
         context.drawRoundedRect(var5 + 10.0F, var11, var12, var13, BorderRadius.all(5.0F), ec.getAdditionalColor().mulAlpha((var9 ? 0.6F : 0.5F) * alpha));
      }

      this.g.set(var5 + 15.0F, var11 + 3.0F, var12 - 10.0F, var13 - 6.0F);
      this.g.setTextColor(ec.getTextColor().mulAlpha(alpha));
      this.g.setAlpha(alpha);
      this.g.render(context);
      var11 += var14;
      if (bJ.showGlass()) {
         context.drawRoundedRect(var5 + 10.0F, var11, var12, var13, BorderRadius.all(5.0F), ec.getAdditionalColor().mulAlpha(0.3F * alpha));
      } else {
         context.drawRoundedRect(var5 + 10.0F, var11, var12, var13, BorderRadius.all(5.0F), ec.getAdditionalColor().mulAlpha((var9 ? 0.6F : 0.5F) * alpha));
      }

      this.h.set(var5 + 15.0F, var11 + 3.0F, var12 - 10.0F, var13 - 6.0F);
      this.h.setTextColor(ec.getTextColor().mulAlpha(alpha));
      this.h.setAlpha(alpha);
      this.h.render(context);
      var11 += var14;
      if (bJ.showGlass()) {
         context.drawRoundedRect(var5 + 10.0F, var11, var12, var13, BorderRadius.all(5.0F), ec.getAdditionalColor().mulAlpha(0.3F * alpha));
      } else {
         context.drawRoundedRect(var5 + 10.0F, var11, var12, var13, BorderRadius.all(5.0F), ec.getAdditionalColor().mulAlpha((var9 ? 0.6F : 0.5F) * alpha));
      }

      this.i.set(var5 + 15.0F, var11 + 3.0F, var12 - 10.0F, var13 - 6.0F);
      this.i.setTextColor(ec.getTextColor().mulAlpha(alpha));
      this.i.setAlpha(alpha);
      this.i.render(context);
      var11 += var14;
      if (bJ.showGlass()) {
         context.drawRoundedRect(var5 + 10.0F, var11, var12, var13, BorderRadius.all(5.0F), ec.getAdditionalColor().mulAlpha(0.3F * alpha));
      } else {
         context.drawRoundedRect(var5 + 10.0F, var11, var12, var13, BorderRadius.all(5.0F), ec.getAdditionalColor().mulAlpha((var9 ? 0.6F : 0.5F) * alpha));
      }

      this.j.set(var5 + 15.0F, var11 + 3.0F, var12 - 10.0F, var13 - 6.0F);
      this.j.setTextColor(ec.getTextColor().mulAlpha(alpha));
      this.j.setAlpha(alpha);
      this.j.render(context);
      var11 += var14 + 10.0F;
      float var15 = (var12 - 5.0F) / 2.0F;
      float var16 = 25.0F;
      context.drawRoundedRect(var5 + 10.0F, var11, var15, var16, BorderRadius.all(5.0F), ec.getAccentColor().mulAlpha(alpha));
      String var17 = this.l != null ? av.translate("waypoints.gui.save") : av.translate("waypoints.gui.add_button");
      float var18 = Fonts.MEDIUM.getFont(7.0F).width(var17);
      context.drawText(
         Fonts.MEDIUM.getFont(7.0F),
         var17,
         var5 + 10.0F + (var15 - var18) / 2.0F,
         var11 + (var16 - Fonts.MEDIUM.getFont(7.0F).height()) / 2.0F,
         ec.WHITE.mulAlpha(alpha)
      );
      if (er.isHovered(var5 + 10.0F, var11, var15, var16, context)) {
         eo.set(en.HAND);
      }

      float var19 = var5 + 10.0F + var15 + 5.0F;
      context.drawRoundedRect(var19, var11, var15, var16, BorderRadius.all(5.0F), ec.getTextColor().mulAlpha(0.2F * alpha));
      String var20 = av.translate("waypoints.gui.clear");
      float var21 = Fonts.MEDIUM.getFont(7.0F).width(var20);
      context.drawText(
         Fonts.MEDIUM.getFont(7.0F),
         var20,
         var19 + (var15 - var21) / 2.0F,
         var11 + (var16 - Fonts.MEDIUM.getFont(7.0F).height()) / 2.0F,
         ec.getTextColor().mulAlpha(alpha)
      );
      if (er.isHovered(var19, var11, var15, var16, context)) {
         eo.set(en.HAND);
      }
   }

   private void a(UIContext context, float x, float y, float width, float height, String label, boolean enabled, float alpha, dZ toggleAnim) {
      toggleAnim.update(enabled ? 1.0F : 0.0F);
      context.drawText(
         Fonts.REGULAR.getFont(8.0F),
         label,
         x + 10.0F,
         y + (height - Fonts.REGULAR.getFont(8.0F).height()) / 2.0F - 0.5F,
         ec.getTextColor().withAlpha(255.0F * (0.75F + 0.25F * toggleAnim.getValue()) * alpha)
      );
      float var10 = 13.0F;
      float var11 = 8.0F;
      float var12 = x + width - var10 - 9.0F;
      float var13 = y + (height - var11) / 2.0F;
      eb var14 = ec.getAccentColor();
      eb var15 = new eb(var14.getRed() * 0.6F + 102.0F, var14.getGreen() * 0.6F + 102.0F, var14.getBlue() * 0.6F + 102.0F, 255.0F);
      eb var16 = Mytheria.getInstance().getThemeManager().getCurrentTheme().getAdditionalColor().mix(eb.BLACK, 0.3F);
      eb var17 = var15.mix(var16, 1.0F - toggleAnim.getValue());
      context.drawRoundedRect(var12, var13, var10, var11, BorderRadius.all(3.0F), var17.withAlpha((enabled ? 255.0F : 255.0F - 100.0F * bJ.glass()) * alpha));
      float var18 = 6.0F;
      float var19 = var12 + 1.0F + 5.0F * toggleAnim.getValue();
      float var20 = var13 + 1.0F;
      context.drawRoundedRect(var19, var20, var18, var18, BorderRadius.all(4.0F), ec.WHITE.withAlpha(255.0F * (0.75F + 0.25F * toggleAnim.getValue()) * alpha));
      if (er.isHovered(x, y, width, height, context)) {
         eo.set(en.HAND);
      }
   }

   private void a(UIContext context, float x, float y, float width, float height, String label, int keyCode, float alpha) {
      String var9 = this.q ? "..." : (keyCode == -1 ? "Не задан" : ej.getKeyName(keyCode));
      Font var10 = Fonts.REGULAR.getFont(7.0F);
      float var11 = var10.width(var9) + 7.0F;
      this.t.update(var11);
      this.u.update(this.q ? ec.getAccentColor() : ec.getTextColor());
      context.drawText(
         Fonts.REGULAR.getFont(8.0F),
         label,
         x + 10.0F,
         y + (height - Fonts.REGULAR.getFont(8.0F).height()) / 2.0F,
         ec.getTextColor().withAlpha(191.25F * alpha)
      );
      float var12 = this.t.getValue();
      float var13 = x + width - 9.0F - var12;
      float var14 = y + (height - 11.0F) / 2.0F;
      context.drawRoundedRect(var13, var14, var12, 11.0F, BorderRadius.all(3.0F), ec.getAdditionalColor().mulAlpha(alpha));
      context.drawText(var10, var9, var13 + 4.0F, var14 + 3.0F, this.u.getColor().withAlpha(191.25F * alpha));
      if (er.isHovered(var13, var14, var12, 11.0, context)) {
         eo.set(en.HAND);
      }
   }

   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      float var6 = this.a.getX();
      float var7 = this.a.getY();
      float var8 = 8.0F;
      float var9 = var6 + this.a.getWidth() - var8 - 15.0F;
      float var10 = var7 + 12.0F;
      if (er.isHovered(var9, var10, var8, var8, mouseX, mouseY)) {
         this.close();
      } else {
         float var11 = 30.0F;
         float var12 = 5.0F;
         float var13 = var11 * 2.0F + var12;
         float var14 = var6 + (this.a.getWidth() - var13) / 2.0F;
         float var15 = var7 + this.a.getHeight() + 10.0F;
         float var16 = var14;
         float var17 = var14 + var11 + var12;
         if (er.isHovered(var16, var15, var11, var11, mouseX, mouseY)) {
            this.d = true;
            this.e = true;
         } else if (!er.isHovered(var17, var15, var11, var11, mouseX, mouseY)) {
            boolean var18 = this.f.isHovered(mouseX, mouseY);
            boolean var19 = this.g.isHovered(mouseX, mouseY);
            boolean var20 = this.h.isHovered(mouseX, mouseY);
            boolean var21 = this.i.isHovered(mouseX, mouseY);
            boolean var22 = this.j.isHovered(mouseX, mouseY);
            if (!var18) {
               this.f.setFocused(false);
            }

            if (!var19) {
               this.g.setFocused(false);
            }

            if (!var20) {
               this.h.setFocused(false);
            }

            if (!var21) {
               this.i.setFocused(false);
            }

            if (!var22) {
               this.j.setFocused(false);
            }

            if (var18) {
               this.f.setFocused(true);
            }

            if (var19) {
               this.g.setFocused(true);
            }

            if (var20) {
               this.h.setFocused(true);
            }

            if (var21) {
               this.i.setFocused(true);
            }

            if (var22) {
               this.j.setFocused(true);
            }

            if (!var18 && !var19 && !var20 && !var21 && !var22) {
               float var23 = var6 + 10.0F;
               float var24 = var7 + 35.0F;
               float var25 = 280.0F;
               float var26 = 30.0F;
               float var27 = var24 + var26 + 5.0F;
               float var28 = this.a.getHeight() - 45.0F - 70.0F - var26;
               if (er.isHovered(var23, var27, var25, var28, mouseX, mouseY)) {
                  float var29 = (float)(-this.b.getValue());
                  float var30 = 45.0F;
                  float var31 = var27 + 5.0F + var29;

                  for (dX.a var33 : this.k) {
                     float var34 = 8.0F;
                     float var35 = var23 + var25 - var34 - 15.0F;
                     float var36 = var31 + (var30 - 5.0F - var34) / 2.0F;
                     if (er.isHovered(var35, var36, var34, var34, mouseX, mouseY)) {
                        Mytheria.getInstance().getWayPointsManager().del(var33.name);
                        this.a();
                        if (this.l == var33) {
                           this.e();
                        }

                        return;
                     }

                     if (er.isHovered(var23 + 5.0F, var31, var25 - 10.0F, var30 - 5.0F, mouseX, mouseY)) {
                        this.l = var33;
                        this.a(this.g, var33.name);
                        this.a(this.h, String.valueOf(var33.x));
                        this.a(this.i, String.valueOf(var33.y));
                        this.a(this.j, String.valueOf(var33.z));
                        return;
                     }

                     var31 += var30;
                  }
               }

               float var43 = var6 + 300.0F;
               float var44 = var7 + 35.0F;
               float var45 = 190.0F;
               float var46 = var45 - 20.0F;
               float var47 = 35.0F;
               float var48 = var44 + 30.0F + var47 * 4.0F + 10.0F;
               float var49 = (var46 - 5.0F) / 2.0F;
               float var50 = 25.0F;
               if (er.isHovered(var43 + 10.0F, var48, var49, var50, mouseX, mouseY)) {
                  this.d();
               } else {
                  float var37 = var43 + 10.0F + var49 + 5.0F;
                  if (er.isHovered(var37, var48, var49, var50, mouseX, mouseY)) {
                     this.e();
                  } else {
                     float var38 = var27 + var28 + 5.0F;
                     float var39 = 19.0F;
                     if (er.isHovered(var23, var38, var25, var39, mouseX, mouseY)) {
                        this.n = !this.n;
                        this.c();
                     } else {
                        var38 += var39;
                        if (er.isHovered(var23, var38, var25, var39, mouseX, mouseY)) {
                           this.o = !this.o;
                           this.c();
                        } else {
                           var38 += var39;
                           float var40 = this.t.getValue();
                           float var41 = var23 + var25 - 9.0F - var40;
                           float var42 = var38 + (var39 - 11.0F) / 2.0F;
                           if (er.isHovered(var41, var42, var40, 11.0, mouseX, mouseY)) {
                              if (button == MouseButton.LEFT) {
                                 this.q = !this.q;
                                 if (!this.q) {
                                    this.p = -1;
                                    this.c();
                                 }
                              } else if (this.q && button != MouseButton.RIGHT) {
                                 this.p = button.getButtonIndex();
                                 this.q = false;
                                 this.c();
                              }
                           } else {
                              super.onMouseClicked(mouseX, mouseY, button);
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean onMouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      float var9 = this.a.getX() + 10.0F;
      float var10 = this.a.getY() + 35.0F;
      float var11 = 280.0F;
      float var12 = 30.0F;
      float var13 = var10 + var12 + 5.0F;
      float var14 = this.a.getHeight() - 45.0F - 70.0F - var12;
      if (er.isHovered(var9, var13, var11, var14, mouseX, mouseY)) {
         this.b.scroll(verticalAmount);
      }

      return true;
   }

   private void d() {
      String var1 = this.g.getBuiltText().trim();
      String var2 = this.h.getBuiltText();
      String var3 = this.i.getBuiltText();
      String var4 = this.j.getBuiltText();
      if (var1.isEmpty()) {
         cv var5 = Mytheria.getInstance().getWayPointsManager();
         int var6 = var5.getNextAvailableNumber("Новая метка ");
         var1 = "Новая метка " + var6;
      }

      if (!var2.isEmpty() && !var3.isEmpty() && !var4.isEmpty()) {
         try {
            int var10 = Integer.parseInt(var2);
            int var11 = Integer.parseInt(var3);
            int var7 = Integer.parseInt(var4);
            cv var8 = Mytheria.getInstance().getWayPointsManager();
            if (this.l != null && !this.l.name.equals(var1)) {
               var8.del(this.l.name);
            }

            var8.add(var1, var10, var11, var7);
            this.a();
            this.e();
         } catch (NumberFormatException var9) {
            eg.error(Text.of("Координаты должны быть числами"));
         }
      } else {
         eg.error(Text.of("Заполните координаты"));
      }
   }

   private void e() {
      this.l = null;
      this.g.clear();
      this.h.clear();
      this.i.clear();
      this.j.clear();
   }

   private void a(cK field, String text) {
      field.clear();

      for (char var6 : text.toCharArray()) {
         field.typeChar(var6);
      }
   }

   public void close() {
      if (!this.d) {
         this.d = true;
      } else {
         if (this.c.getValue() == 0.0F) {
            this.c();
            super.close();
         }
      }
   }

   public boolean charTyped(char chr, int modifiers) {
      if (this.f.isFocused()) {
         boolean var3 = this.f.charTyped(chr, modifiers);
         this.a();
         return var3;
      } else if (this.g.isFocused()) {
         return this.g.charTyped(chr, modifiers);
      } else if (this.h.isFocused()) {
         return this.h.charTyped(chr, modifiers);
      } else if (this.i.isFocused()) {
         return this.i.charTyped(chr, modifiers);
      } else {
         return this.j.isFocused() ? this.j.charTyped(chr, modifiers) : super.charTyped(chr, modifiers);
      }
   }

   public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
      if (!this.q) {
         if (this.f.isFocused()) {
            this.f.onKeyPressed(keyCode, scanCode, modifiers);
            this.a();
            return true;
         } else if (this.g.isFocused()) {
            this.g.onKeyPressed(keyCode, scanCode, modifiers);
            return true;
         } else if (this.h.isFocused()) {
            this.h.onKeyPressed(keyCode, scanCode, modifiers);
            return true;
         } else if (this.i.isFocused()) {
            this.i.onKeyPressed(keyCode, scanCode, modifiers);
            return true;
         } else if (this.j.isFocused()) {
            this.j.onKeyPressed(keyCode, scanCode, modifiers);
            return true;
         } else {
            return super.keyPressed(keyCode, scanCode, modifiers);
         }
      } else {
         if (keyCode != 256 && keyCode != 261) {
            this.p = keyCode;
         } else {
            this.p = -1;
         }

         this.q = false;
         this.c();
         return true;
      }
   }

   @Override
   public void onMouseReleased(double mouseX, double mouseY, MouseButton button) {
      this.f.onMouseReleased(mouseX, mouseY, button);
      this.g.onMouseReleased(mouseX, mouseY, button);
      this.h.onMouseReleased(mouseX, mouseY, button);
      this.i.onMouseReleased(mouseX, mouseY, button);
      this.j.onMouseReleased(mouseX, mouseY, button);
      super.onMouseReleased(mouseX, mouseY, button);
   }

   public boolean shouldPause() {
      return false;
   }

   static class a {
      public final String name;
      public final int x;
      public final int y;
      public final int z;

      public a(String name, int x, int y, int z) {
         this.name = name;
         this.x = x;
         this.y = y;
         this.z = z;
      }
   }
}
