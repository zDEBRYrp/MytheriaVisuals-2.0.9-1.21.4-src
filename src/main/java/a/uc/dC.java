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

import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.CustomComponent;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Font;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.utility.animation.base.Easing;

public class dC extends dz<ch> {
   private dZ a;
   private dZ b;
   private ea c;

   public dC(ch setting, CustomComponent parent) {
      super(setting, parent);
   }

   @Override
   public void onInit() {
      this.a = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
      this.b = new dZ(300L, Easing.BAKEK);
      this.c = new ea(300L, new eb(24.0F, 24.0F, 27.0F), Easing.FIGMA_EASE_IN_OUT);
      this.width = 13.0F;
      this.height = 8.0F;
      super.onInit();
   }

   @Override
   public void update(UIContext context) {
      super.update(context);
   }

   @Override
   public void renderComponent(UIContext context) {
      this.a.update(this.setting.isEnabled() ? 1.0F : 0.75F);
      this.b.update(this.setting.isEnabled() ? 1.0F : 0.0F);
      eb var2 = ec.getAccentColor();
      eb var3 = new eb(var2.getRed() * 0.6F + 102.0F, var2.getGreen() * 0.6F + 102.0F, var2.getBlue() * 0.6F + 102.0F, 255.0F);
      this.c.update(this.setting.isEnabled() ? var3 : Mytheria.getInstance().getThemeManager().getCurrentTheme().getAdditionalColor().mix(eb.BLACK, 0.3F));
      this.hoverAnimation.update(this.isHovered(context.getMouseX(), context.getMouseY()));
      if (this.isHovered(context.getMouseX(), context.getMouseY())) {
         eo.set(en.HAND);
      }

      float var4 = 13.0F;
      float var5 = 8.0F;
      Font var6 = Fonts.REGULAR.getFont(8.0F);
      float var7 = 10.0F;
      float var8 = var6.height();
      float var9 = 19.0F;
      context.drawFadeoutText(
         var6,
         av.translate(this.setting.getName()),
         this.x + var7,
         this.y + er.getMiddleOfBox(var6.height(), var9) - 0.5F,
         ec.getTextColor().withAlpha(255.0F * (0.75F + 0.25F * this.b.getValue() + 0.25F * this.hoverAnimation.getValue())),
         0.7F,
         0.99F,
         this.width - var4 - 20.0F
      );
      context.drawRoundedRect(
         this.x + this.width - var4 - 9.0F,
         this.y + 5.0F,
         var4,
         var5,
         BorderRadius.all(3.0F),
         this.c.getColor().withAlpha(!this.setting.isEnabled() ? 255.0F - 100.0F * bJ.glass() : 255.0F)
      );
      context.drawRoundedRect(
         this.x + this.width - var4 - 8.0F + 5.0F * this.b.getValue(),
         this.y + 6.0F,
         6.0F,
         6.0F,
         BorderRadius.all(4.0F),
         new eb(255.0F, 255.0F, 255.0F).withAlpha(this.a.getValue() * 255.0F)
      );
   }

   @Override
   public void drawRegular8(UIContext context) {
   }

   @Override
   public void drawSplit(UIContext context) {
      float var2 = 0.5F;
      context.drawRect(this.x, this.y + this.height, this.width, var2, ec.getTextColor().withAlpha(5.1F));
   }

   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      if (this.isHovered(mouseX, mouseY) && button == MouseButton.LEFT) {
         this.setting.toggle();
         this.setting.autoSaveConfig();
      }

      super.onMouseReleased(mouseX, mouseY, button);
   }

   @Override
   public float getHeight() {
      return this.height = 18.0F;
   }
}
