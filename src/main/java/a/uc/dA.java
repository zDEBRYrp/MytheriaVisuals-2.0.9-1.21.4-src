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

import nesquik.mytheria.framework.base.CustomComponent;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Font;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.utility.animation.base.Easing;
import net.minecraft.util.math.Vec2f;

public class dA extends dz<cf> {
   private final dZ a = new dZ(500L, Easing.BAKEK_PAGES);
   private final dZ b = new dZ(500L, Easing.BAKEK_PAGES);
   private final dZ c = new dZ(500L, Easing.BAKEK_PAGES);
   private final dZ d = new dZ(500L, Easing.BAKEK_PAGES);
   private boolean e;
   private boolean f;

   public dA(cf setting, CustomComponent parent) {
      super(setting, parent);
   }

   @Override
   public void renderComponent(UIContext context) {
      float var2 = this.x + 9.0F;
      float var3 = this.y + 2.0F;
      float var4 = this.width - 18.0F;
      Font var5 = Fonts.REGULAR.getFont(8.0F);
      float var6 = 10.0F;
      float var7 = Fonts.REGULAR.getFont(7.0F).height();
      this.hoverAnimation.update(this.isHovered(context.getMouseX(), context.getMouseY()));
      float var8 = 3.0F;
      float var9 = var2 - 1.0F + var8;
      float var10 = var3 + 17.0F + var8;
      float var11 = var4 + 2.0F - var8 * 2.0F;
      float var12 = this.height - 10.0F - 17.0F - var8 * 2.0F;
      context.drawRoundedRect(
         var9 - var8, var10 - var8, var11 + var8 * 2.0F, var12 + var8 * 2.0F, BorderRadius.all(6.0F), ec.getBackgroundColor().withAlpha(76.5F)
      );
      context.drawRoundedRect(
         var9 + this.a.getValue() * var11 - 3.0F, var10 + this.b.getValue() * var12 - 3.0F, 6.0F, 6.0F, BorderRadius.all(6.0F), ec.WHITE.withAlpha(255.0F)
      );
      context.drawRoundedRect(
         var9 + this.c.getValue() * var11 - 3.0F, var10 + this.d.getValue() * var12 - 3.0F, 6.0F, 6.0F, BorderRadius.all(6.0F), ec.WHITE.withAlpha(255.0F)
      );
      Vec2f var13 = new Vec2f(var9, var10 + var12);
      Vec2f var14 = new Vec2f(var9 + this.a.getValue() * var11, var10 + this.b.getValue() * var12);
      Vec2f var15 = new Vec2f(var9 + this.c.getValue() * var11, var10 + this.d.getValue() * var12);
      Vec2f var16 = new Vec2f(var9 + var11, var10);
      context.drawBezier(var13, var14, var15, var16, eb.WHITE, 50);
      context.drawLine(var13, var14, ec.WHITE.mulAlpha(0.5F));
      context.drawLine(var16, var15, ec.WHITE.mulAlpha(0.5F));
      context.drawFadeoutText(
         var5,
         av.translate(this.setting.getName()),
         this.x + var6,
         var3 + 11.0F - var5.height(),
         ec.getTextColor().withAlpha(255.0F * (0.75F + 0.25F * this.hoverAnimation.getValue())),
         0.8F,
         1.0F,
         this.getParent().getWidth() - var6 - 10.0F
      );
      if (this.isHovered(context.getMouseX(), context.getMouseY())) {
         eo.set(en.HAND);
      }

      if (this.e) {
         float var17 = er.getSliderValue(0.0F, 1.0F, var9, var11, context.getMouseX());
         float var18 = er.getSliderValueWithoutClamp(0.0F, 1.0F, var10, var12, context.getMouseY());
         this.setting.start(new Vec2f(var17, Math.clamp(var18, -0.5F, 1.5F)));
         eo.set(en.CROSSHAIR);
      } else if (this.f) {
         float var19 = er.getSliderValue(0.0F, 1.0F, var9, var11, context.getMouseX());
         float var20 = er.getSliderValueWithoutClamp(0.0F, 1.0F, var10, var12, context.getMouseY());
         this.setting.end(new Vec2f(var19, Math.clamp(var20, -0.5F, 1.5F)));
         eo.set(en.CROSSHAIR);
      }

      this.a.setValue(this.setting.start().x);
      this.b.setValue(this.setting.start().y);
      this.c.setValue(this.setting.end().x);
      this.d.setValue(this.setting.end().y);
   }

   @Override
   public void drawSplit(UIContext context) {
      float var2 = 0.5F;
      context.drawRect(this.x, this.y + this.height, this.width, var2, ec.getTextColor().withAlpha(5.1F));
   }

   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      float var6 = this.x + 9.0F;
      float var7 = this.y + 2.0F;
      float var8 = this.width - 18.0F;
      if (this.isHovered(mouseX, mouseY)) {
         float var9 = var6 - 1.0F;
         float var10 = var7 + 17.0F;
         float var11 = var8 + 2.0F;
         float var12 = this.height - 10.0F - 17.0F;
         Vec2f var13 = new Vec2f(er.getPercent((float)mouseX, var9, var9 + var11), er.getPercent((float)mouseY, var10, var10 + var12));
         float var14 = this.distance(this.setting.start(), var13);
         float var15 = this.distance(this.setting.end(), var13);
         if (var14 < var15) {
            this.e = true;
         } else {
            this.f = true;
         }
      }

      super.onMouseClicked(mouseX, mouseY, button);
   }

   public float distance(Vec2f vec, Vec2f vec2) {
      float var3 = vec.x - vec2.x;
      float var4 = vec.y - vec2.y;
      return (float)Math.sqrt(var3 * var3 + var4 * var4);
   }

   @Override
   public void onMouseReleased(double mouseX, double mouseY, MouseButton button) {
      this.e = false;
      this.f = false;
      super.onMouseReleased(mouseX, mouseY, button);
   }

   @Override
   public float getHeight() {
      return this.height = this.width - 14.0F;
   }
}
