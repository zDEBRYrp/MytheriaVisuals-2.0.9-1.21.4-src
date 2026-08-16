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
import nesquik.mytheria.systems.setting.SettingsContainer;
import nesquik.mytheria.systems.setting.settings.SliderSetting;
import org.jetbrains.annotations.NotNull;

public class aA extends aB {
   private final SliderSetting a = new aA.a(this, "swing.anchorX").step(0.05F).min(-5.0F).max(5.0F).currentValue(0.0F);
   private final SliderSetting b = new aA.a(this, "swing.anchorY").step(0.05F).min(-5.0F).max(5.0F).currentValue(0.0F);
   private final SliderSetting c = new aA.a(this, "swing.anchorZ").step(0.05F).min(-5.0F).max(5.0F).currentValue(0.0F);
   private final SliderSetting d = new aA.a(this, "swing.moveX").step(0.05F).min(-5.0F).max(5.0F).currentValue(0.0F);
   private final SliderSetting e = new aA.a(this, "swing.moveY").step(0.05F).min(-5.0F).max(5.0F).currentValue(0.0F);
   private final SliderSetting f = new aA.a(this, "swing.moveZ").step(0.05F).min(-3.0F).max(3.0F).currentValue(0.0F);
   private final SliderSetting g = new aA.a(this, "swing.rotateX").step(15.0F).min(-360.0F).max(360.0F).currentValue(0.0F);
   private final SliderSetting h = new aA.a(this, "swing.rotateY").step(15.0F).min(-360.0F).max(360.0F).currentValue(0.0F);
   private final SliderSetting i = new aA.a(this, "swing.rotateZ").step(15.0F).min(-360.0F).max(360.0F).currentValue(0.0F);

   @Generated
   public SliderSetting getAnchorX() {
      return this.a;
   }

   @Generated
   public SliderSetting getAnchorY() {
      return this.b;
   }

   @Generated
   public SliderSetting getAnchorZ() {
      return this.c;
   }

   @Generated
   public SliderSetting getMoveX() {
      return this.d;
   }

   @Generated
   public SliderSetting getMoveY() {
      return this.e;
   }

   @Generated
   public SliderSetting getMoveZ() {
      return this.f;
   }

   @Generated
   public SliderSetting getRotateX() {
      return this.g;
   }

   @Generated
   public SliderSetting getRotateY() {
      return this.h;
   }

   @Generated
   public SliderSetting getRotateZ() {
      return this.i;
   }

   public static class a extends SliderSetting {
      public a(@NotNull SettingsContainer parent, String name) {
         super(parent, name);
      }

      @Override
      public void setCurrentValue(float currentValue) {
         super.setCurrentValue(currentValue);
      }
   }
}
