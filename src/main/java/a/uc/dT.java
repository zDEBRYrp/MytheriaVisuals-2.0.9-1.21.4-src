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

import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.framework.objects.gradient.impl.VerticalGradient;
import nesquik.mytheria.utility.animation.base.Easing;
import nesquik.mytheria.utility.interfaces.IScaledResolution;

public class dT {
   private final cP a;
   private final dZ b = new dZ(300L, Easing.BAKEK);
   private final dZ c = new dZ(200L, Easing.LINEAR);
   private float d;
   private float e;
   private float f;
   private float g;

   public dT(cP element) {
      this.a = element;
   }

   public void set(float x, float y, float width, float height) {
      this.d = x;
      this.e = y;
      this.f = width;
      this.g = height;
   }

   public void render(UIContext context, float alpha) {
      boolean var3 = Mytheria.getInstance().getThemeManager().getCurrentTheme() == ct.DARK;
      this.b.update(this.a.isShowing());
      boolean var4 = er.isHovered(this.d, this.e, this.f, this.g, context.getMouseX(), context.getMouseY());
      this.c.update(var4);
      eb var5;
      if (this.a.isShowing()) {
         var5 = new eb(30.0F, 25.0F, 40.0F).withAlpha(200.0F * alpha);
      } else {
         var5 = new eb(25.0F, 25.0F, 30.0F).withAlpha(150.0F * alpha);
      }

      if (this.c.getValue() > 0.0F) {
         var5 = var5.mix(new eb(255.0F, 255.0F, 255.0F).withAlpha(20.0F), this.c.getValue());
      }

      context.drawRoundedRect(this.d, this.e, this.f, this.g, BorderRadius.all(12.0F), var5);
      if (this.a.isShowing()) {
         context.drawRoundedRect(
            this.d,
            this.e,
            this.f,
            this.g,
            BorderRadius.all(12.0F),
            new VerticalGradient(new eb(30.0F, 30.0F, 100.0F).withAlpha(60.0F * alpha), new eb(30.0F, 20.0F, 140.0F).withAlpha(80.0F * alpha))
         );
      }

      if (this.a.getIcon() != null && !this.a.getIcon().isEmpty()) {
         context.drawTexture(Mytheria.id(this.a.getIcon()), this.d + 10.0F, this.e + this.g / 2.0F - 6.0F, 12.0F, 12.0F, ec.WHITE.withAlpha(255.0F * alpha));
      }

      float var6 = this.a.getIcon() != null && !this.a.getIcon().isEmpty() ? this.d + 28.0F : this.d + 10.0F;
      context.drawText(Fonts.MEDIUM.getFont(8.0F), av.translate(this.a.getName()), var6, this.e + this.g / 2.0F - 3.5F, ec.WHITE.withAlpha(255.0F * alpha));
      float var7 = 28.0F;
      float var8 = 14.0F;
      float var9 = this.d + this.f - var7 - 10.0F;
      float var10 = this.e + this.g / 2.0F - var8 / 2.0F;
      if (this.a.isShowing()) {
         context.drawRoundedRect(
            var9,
            var10,
            var7,
            var8,
            BorderRadius.all(var8 / 2.0F),
            new VerticalGradient(new eb(140.0F, 80.0F, 240.0F).withAlpha(255.0F * alpha), new eb(100.0F, 50.0F, 200.0F).withAlpha(255.0F * alpha))
         );
      } else {
         context.drawRoundedRect(var9, var10, var7, var8, BorderRadius.all(var8 / 2.0F), new eb(50.0F, 50.0F, 60.0F).withAlpha(255.0F * alpha));
      }

      float var11 = 10.0F;
      float var12 = 2.0F;
      float var13 = var9 + var12 + (var7 - var11 - var12 * 2.0F) * this.b.getValue();
      float var14 = var10 + (var8 - var11) / 2.0F;
      context.drawRoundedRect(var13, var14, var11, var11, BorderRadius.all(var11 / 2.0F), ec.WHITE.withAlpha(255.0F * alpha));
   }

   public void onMouseClicked(double mouseX, double mouseY, MouseButton button, dR screen) {
      if (button == MouseButton.LEFT) {
         boolean var7 = this.a.isShowing();
         this.a.setShowing(!var7);
         if (!var7 && this.a.isShowing()) {
            int var8 = 0;

            for (cP var10 : Mytheria.getInstance().getHud().getElements()) {
               if (var10.isShowing() && var10 != this.a) {
                  var8++;
               }
            }

            float var14 = IScaledResolution.sr.getScaledWidth() / 2.0F - this.a.getWidth() / 2.0F;
            float var15 = IScaledResolution.sr.getScaledHeight() / 2.0F - this.a.getHeight() / 2.0F;
            float var11 = var8 % 3 * 50.0F - 50.0F;
            float var12 = var8 / 3 * 50.0F;
            this.a.pos(var14 + var11, var15 + var12);
         }

         Mytheria.getInstance().getFileManager().writeFile("client");
      } else if (button == MouseButton.RIGHT && !this.a.getSettings().isEmpty()) {
         dS var13 = new dS(this, screen.getMenuWindow().getX() + screen.getMenuWindow().getWidth() + 10.0F, screen.getMenuWindow().getY(), 200.0F);
         screen.getHudWindows().add(var13);
      }
   }

   public void onMouseReleased(double mouseX, double mouseY, MouseButton button) {
   }

   public boolean isHovered(double mouseX, double mouseY) {
      return er.isHovered(this.d, this.e, this.f, this.g, mouseX, mouseY);
   }

   public boolean isVisible() {
      return this.d > -999.0F && this.e > -999.0F;
   }

   @Generated
   public cP getElement() {
      return this.a;
   }

   @Generated
   public dZ getToggleAnimation() {
      return this.b;
   }

   @Generated
   public dZ getHoverAnimation() {
      return this.c;
   }

   @Generated
   public float getX() {
      return this.d;
   }

   @Generated
   public float getY() {
      return this.e;
   }

   @Generated
   public float getWidth() {
      return this.f;
   }

   @Generated
   public float getHeight() {
      return this.g;
   }
}
