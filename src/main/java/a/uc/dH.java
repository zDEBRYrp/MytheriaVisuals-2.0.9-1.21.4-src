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

public class dH extends dz<cm> {
   private final dZ a = new dZ(500L, Easing.BAKEK_PAGES);
   private final dZ b = new dZ(500L, Easing.BAKEK_PAGES);
   private boolean c;
   private boolean d;

   public dH(cm setting, CustomComponent parent) {
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
      float var8 = this.setting.getFirstValue();
      float var9 = this.setting.getSecondValue();
      if (var8 >= var9) {
         var8 = this.setting.getSecondValue();
         var9 = this.setting.getFirstValue();
      }

      this.a.update(var8);
      this.b.update(var9);
      this.hoverAnimation.update(this.isHovered(context.getMouseX(), context.getMouseY()));
      context.drawRoundedRect(var2, var3 + this.height - 12.0F, var4, 2.0F, BorderRadius.all(0.25F), ec.getAdditionalColor().withAlpha(178.5F));
      context.drawRoundedRect(
         var2 + var4 * er.getPercent(this.a.getValue(), this.setting.getMin(), this.setting.getMax()),
         var3 + this.height - 12.0F,
         var4 * er.getPercent(this.b.getValue(), this.setting.getMin(), this.setting.getMax())
            - var4 * er.getPercent(this.a.getValue(), this.setting.getMin(), this.setting.getMax()),
         2.0F,
         BorderRadius.all(0.25F),
         ec.getAccentColor()
      );
      context.drawShadow(
         var2 + var4 * er.getPercent(this.a.getValue(), this.setting.getMin(), this.setting.getMax()) - 3.0F,
         var3 + this.height - 14.0F,
         6.0F,
         6.0F,
         10.0F,
         BorderRadius.all(3.0F),
         eb.BLACK.withAlpha(63.75F)
      );
      context.drawRoundedRect(
         var2 + var4 * er.getPercent(this.a.getValue(), this.setting.getMin(), this.setting.getMax()) - 3.0F,
         var3 + this.height - 14.0F,
         6.0F,
         6.0F,
         BorderRadius.all(3.0F),
         eb.WHITE
      );
      context.drawShadow(
         var2
            + var4 * er.getPercent(this.a.getValue(), this.setting.getMin(), this.setting.getMax())
            + var4 * er.getPercent(this.b.getValue(), this.setting.getMin(), this.setting.getMax())
            - var4 * er.getPercent(this.a.getValue(), this.setting.getMin(), this.setting.getMax())
            - 3.0F,
         var3 + this.height - 14.0F,
         6.0F,
         6.0F,
         10.0F,
         BorderRadius.all(3.0F),
         eb.BLACK.withAlpha(63.75F)
      );
      context.drawRoundedRect(
         var2
            + var4 * er.getPercent(this.a.getValue(), this.setting.getMin(), this.setting.getMax())
            + var4 * er.getPercent(this.b.getValue(), this.setting.getMin(), this.setting.getMax())
            - var4 * er.getPercent(this.a.getValue(), this.setting.getMin(), this.setting.getMax())
            - 3.0F,
         var3 + this.height - 14.0F,
         6.0F,
         6.0F,
         BorderRadius.all(3.0F),
         eb.WHITE
      );
      String var10 = String.format("от %s до %s", ej.formatNumber(this.a.getValue()), ej.formatNumber(this.b.getValue()));
      context.drawFadeoutText(
         var5,
         av.translate(this.setting.getName()),
         this.x + var6,
         var3 + 11.0F - var5.height(),
         ec.getTextColor().withAlpha(255.0F * (0.75F + 0.25F * this.hoverAnimation.getValue())),
         0.8F,
         1.0F,
         this.getParent().getWidth() - var6 - Fonts.REGULAR.getFont(7.0F).width(var10) - 10.0F
      );
      context.drawRightText(
         Fonts.REGULAR.getFont(7.0F),
         var10,
         var2 + var4,
         var3 + 11.0F - var7,
         ec.getTextColor().withAlpha(255.0F * (0.75F + 0.25F * this.hoverAnimation.getValue()))
      );
      if (this.isHovered(context.getMouseX(), context.getMouseY())) {
         eo.set(en.HAND);
      }

      if (this.c) {
         float var11 = er.getSliderValue(this.setting.getMin(), this.setting.getMax(), var2, var4, context.getMouseX());
         this.setting.setFirstValue(var11);
         eo.set(en.ARROW_HORIZONTAL);
      } else if (this.d) {
         float var12 = er.getSliderValue(this.setting.getMin(), this.setting.getMax(), var2, var4, context.getMouseX());
         this.setting.setSecondValue(var12);
         eo.set(en.ARROW_HORIZONTAL);
      }
   }

   @Override
   public void drawSplit(UIContext context) {
      float var2 = 0.5F;
      context.drawRect(this.x, this.y + this.height, this.width, var2, ec.getTextColor().withAlpha(5.1F));
   }

   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      float var6 = this.x + 9.0F;
      float var7 = this.width - 18.0F;
      if (this.isHovered(mouseX, mouseY)) {
         float var8 = (float)Math.abs(mouseX - (var6 + var7 * er.getPercent(this.setting.getFirstValue(), this.setting.getMin(), this.setting.getMax())));
         float var9 = (float)Math.abs(mouseX - (var6 + var7 * er.getPercent(this.setting.getSecondValue(), this.setting.getMin(), this.setting.getMax())));
         if (var8 < var9) {
            this.c = true;
         } else {
            this.d = true;
         }
      }

      super.onMouseClicked(mouseX, mouseY, button);
   }

   @Override
   public void onMouseReleased(double mouseX, double mouseY, MouseButton button) {
      this.c = false;
      this.d = false;
      super.onMouseReleased(mouseX, mouseY, button);
   }

   @Override
   public float getHeight() {
      return this.height = 29.0F;
   }
}
