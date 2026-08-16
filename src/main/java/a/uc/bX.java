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

import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import nesquik.mytheria.systems.setting.settings.SliderSetting;
import nesquik.mytheria.utility.animation.base.Easing;

@ModuleInfo(name = "Zoom", category = ax.VISUALS, desc = "modules.descriptions.zoom")
public class bX extends aJ {
   private final cg a = new cg(this, "modules.settings.zoom.key");
   private final SliderSetting b = new SliderSetting(this, "modules.settings.zoom.level").step(0.1F).min(1.0F).max(10.0F).currentValue(4.0F);
   private final ch c = new ch(this, "modules.settings.zoom.smooth").enabled(true);
   private final SliderSetting d = new SliderSetting(this, "modules.settings.zoom.smooth_speed", () -> !this.c.isEnabled())
      .step(50.0F)
      .min(100.0F)
      .max(1000.0F)
      .currentValue(300.0F);
   private boolean e = false;
   private final dZ f = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
   private final EventListener<an> g = event -> {
      if (this.a.isKey(event.getKey()) && mc.currentScreen == null) {
         if (event.getAction() == 1) {
            this.e = true;
         } else if (event.getAction() == 0) {
            this.e = false;
         }
      }
   };

   @Override
   public void onEnable() {
      super.onEnable();
      this.f.setDuration((long)this.d.getCurrentValue());
   }

   public void updateZoom() {
      if (this.c.isEnabled()) {
         this.f.setDuration((long)this.d.getCurrentValue());
         this.f.update(this.e);
      }
   }

   public float getZoomMultiplier() {
      if (!this.isEnabled()) {
         return 1.0F;
      } else if (this.c.isEnabled()) {
         float var1 = this.f.getValue();
         return 1.0F + (this.b.getCurrentValue() - 1.0F) * var1;
      } else {
         return this.e ? this.b.getCurrentValue() : 1.0F;
      }
   }

   public boolean isZooming() {
      return this.e;
   }
}
