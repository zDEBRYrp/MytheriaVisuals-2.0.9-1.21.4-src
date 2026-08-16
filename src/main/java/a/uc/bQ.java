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
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;

@ModuleInfo(name = "Removals", category = ax.VISUALS, enabledByDefault = true, desc = "modules.descriptions.removals")
public class bQ extends aJ {
   private double a;
   private final cn b = new cn(this, "modules.settings.removals.effects");
   private final cn.a c = new cn.a(this.b, "modules.settings.removals.hurtCam").select();
   private final cn.a d = new cn.a(this.b, "modules.settings.removals.scoreboard");
   private final cn.a e = new cn.a(this.b, "modules.settings.removals.bossBar");
   private final cn.a f = new cn.a(this.b, "modules.settings.removals.portal").select();
   private final cn.a g = new cn.a(this.b, "modules.settings.removals.fire").select();
   private final cn.a h = new cn.a(this.b, "modules.settings.removals.breakParticles");
   private final cn.a i = new cn.a(this.b, "modules.settings.removals.water");
   private final cn.a j = new cn.a(this.b, "modules.settings.removals.pumpkin");
   private final cn.a k = new cn.a(this.b, "modules.settings.removals.fov").select();
   private final cn.a l = new cn.a(this.b, "modules.settings.removals.weather");
   private final cn.a m = new cn.a(this.b, "modules.settings.removals.vignette");
   private final cn n = new cn(this, "modules.settings.removals.sounds");
   private final cn.a o = new cn.a(this.n, "modules.settings.removals.beacon");
   private final cn.a p = new cn.a(this.n, "modules.settings.removals.phantoms");
   private final cn.a q = new cn.a(this.n, "modules.settings.removals.weatherSound");
   private final EventListener<W> r = event -> {
      if (this.k.isSelected()) {
         mc.options.getFovEffectScale().setValue(0.0);
      }
   };

   @Override
   public void onEnable() {
      this.a = (Double)mc.options.getFovEffectScale().getValue();
      super.onEnable();
   }

   @Override
   public void onDisable() {
      mc.options.getFovEffectScale().setValue(this.a);
      super.onDisable();
   }

   @Generated
   public double getOldFovEffectScale() {
      return this.a;
   }

   @Generated
   public cn getEffects() {
      return this.b;
   }

   @Generated
   public cn.a getHurtCam() {
      return this.c;
   }

   @Generated
   public cn.a getScoreboard() {
      return this.d;
   }

   @Generated
   public cn.a getBossBar() {
      return this.e;
   }

   @Generated
   public cn.a getPortal() {
      return this.f;
   }

   @Generated
   public cn.a getFire() {
      return this.g;
   }

   @Generated
   public cn.a getBreakParticles() {
      return this.h;
   }

   @Generated
   public cn.a getWater() {
      return this.i;
   }

   @Generated
   public cn.a getPumpkin() {
      return this.j;
   }

   @Generated
   public cn.a getFov() {
      return this.k;
   }

   @Generated
   public cn.a getWeather() {
      return this.l;
   }

   @Generated
   public cn.a getVignette() {
      return this.m;
   }

   @Generated
   public cn getSounds() {
      return this.n;
   }

   @Generated
   public cn.a getBeacon() {
      return this.o;
   }

   @Generated
   public cn.a getPhantoms() {
      return this.p;
   }

   @Generated
   public cn.a getWeatherSound() {
      return this.q;
   }

   @Generated
   public EventListener<W> getOnUpdateEvent() {
      return this.r;
   }
}
