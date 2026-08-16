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
import nesquik.mytheria.utility.animation.base.Easing;

public class cA extends CustomComponent {
   private boolean a;
   private eb b = eb.WHITE;
   private final float c;
   private final Font d;
   private final String[] e = new String[]{"", ""};
   private final String[] f = new String[]{"", ""};
   private final dZ[] g;
   private float h;
   private static final boolean i = et.isLunarClient();

   public cA(Font font, float offset, long speed, Easing easing) {
      this.d = font;
      this.c = offset;
      this.g = new dZ[2];

      for (int var6 = 0; var6 < this.g.length; var6++) {
         this.g[var6] = new dZ(speed, easing);
      }
   }

   @Override
   public void renderComponent(UIContext context) {
      if (i) {
         String var6 = this.e[0] + this.e[1];
         context.drawText(this.d, var6, this.x, this.y, this.b);
      } else {
         for (dZ var5 : this.g) {
            var5.update(1.0F);
         }

         context.drawText(
            this.d, this.f[0], this.x, this.y + this.c * this.g[0].getValue(), this.b.withAlpha(this.b.getAlpha() * (1.0F - this.g[0].getValue()))
         );
         context.drawText(
            this.d, this.e[0], this.x, this.y - this.c + this.c * this.g[0].getValue(), this.b.withAlpha(this.b.getAlpha() * this.g[0].getValue())
         );
         context.drawText(
            this.d, this.f[1], this.x + this.h, this.y + this.c * this.g[1].getValue(), this.b.withAlpha(this.b.getAlpha() * (1.0F - this.g[1].getValue()))
         );
         context.drawText(
            this.d,
            this.e[1],
            this.x + this.d.width(this.e[0]),
            this.y - this.c + this.c * this.g[1].getValue(),
            this.b.withAlpha(this.b.getAlpha() * this.g[1].getValue())
         );
      }
   }

   @Override
   public float getWidth() {
      return this.d.width(this.e[0] + this.e[1]);
   }

   public void update(int updated) {
      String var2 = String.valueOf(updated / 10);
      String var3 = String.valueOf(updated % 10);
      if (!var3.equals(this.e[1])) {
         this.h = this.d.width(this.e[0]);
         this.f[1] = this.e[1];
         this.e[1] = var3;
         this.g[1].setValue(0.0F);
      }

      if (!var2.equals(this.e[0])) {
         this.f[0] = this.e[0];
         this.e[0] = this.a ? var2 : (var2.equals("0") ? "" : var2);
         this.g[0].setValue(0.0F);
      }
   }

   public void settings(boolean drawZero, eb color) {
      this.a = drawZero;
      this.b = color;
   }
}
