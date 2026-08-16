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

import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.modules.Module;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import nesquik.mytheria.systems.setting.Setting;
import nesquik.mytheria.utility.animation.base.Easing;

public abstract class aJ implements Module {
   private final ModuleInfo a = this.getClass().getAnnotation(ModuleInfo.class);
   private int b;
   private ax c;
   private boolean d;
   private boolean e;
   private String f;
   private List<Setting> g = new ArrayList<>();
   private final dZ h = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);

   public aJ() {
      this.f = this.a.name();
      this.c = this.a.category();
      this.b = this.a.key();
   }

   @Override
   public void toggle() {
      this.setEnabled(!this.d, false);
   }

   @Override
   public void onEnable() {
   }

   @Override
   public void onDisable() {
   }

   @Override
   public void tick() {
   }

   @Override
   public void disable() {
      this.setEnabled(false, false);
   }

   @Override
   public void enable() {
      this.setEnabled(true, false);
   }

   @Override
   public void setEnabled(boolean newState, boolean silent) {
      if (this.d != newState) {
         this.d = newState;
         if (!(this instanceof bN) && !silent) {
            ba var3 = Mytheria.getInstance().getModuleManager().getModuleSafe(ba.class);
            if (var3 != null && var3.isEnabled()) {
               if (this.d) {
                  var3.getToggleEnableSound().play(var3.getVolume().getCurrentValue(), 1.0F);
               } else {
                  var3.getToggleDisableSound().play(var3.getVolume().getCurrentValue(), 1.0F);
               }
            }
         }

         if (this.d) {
            Mytheria.getInstance().getEventManager().subscribe(this);
            if (!silent) {
               Mytheria.getInstance()
                  .getNotificationManager()
                  .addNotification(
                     cb.SUCCESS, this.f.replace(" ", "") + " " + av.translate("enabled") + (av.getCurrentLanguage() == au.RU_RU ? ej.makeGender(this.f) : "")
                  );
            }

            this.onEnable();
         } else {
            Mytheria.getInstance().getEventManager().unsubscribe(this);
            if (!silent) {
               Mytheria.getInstance()
                  .getNotificationManager()
                  .addNotification(
                     cb.ERROR, this.f.replace(" ", "") + " " + av.translate("disabled") + (av.getCurrentLanguage() == au.RU_RU ? ej.makeGender(this.f) : "")
                  );
            }

            this.onDisable();
         }
      }
   }

   public String getSettingName(String key) {
      return "modules.settings." + this.getName().toLowerCase().replace(" ", "_") + "." + key;
   }

   @Generated
   @Override
   public ModuleInfo getInfo() {
      return this.a;
   }

   @Generated
   @Override
   public int getKey() {
      return this.b;
   }

   @Generated
   @Override
   public ax getCategory() {
      return this.c;
   }

   @Generated
   @Override
   public boolean isEnabled() {
      return this.d;
   }

   @Generated
   @Override
   public boolean isHidden() {
      return this.e;
   }

   @Generated
   @Override
   public String getName() {
      return this.f;
   }

   @Generated
   @Override
   public List<Setting> getSettings() {
      return this.g;
   }

   @Generated
   @Override
   public dZ getKeybindsAnimation() {
      return this.h;
   }

   @Generated
   @Override
   public void setKey(int key) {
      this.b = key;
   }

   @Generated
   public void setCategory(ax category) {
      this.c = category;
   }

   @Generated
   public void setEnabled(boolean enabled) {
      this.d = enabled;
   }

   @Generated
   @Override
   public void setHidden(boolean hidden) {
      this.e = hidden;
   }

   @Generated
   public void setName(String name) {
      this.f = name;
   }

   @Generated
   public void setSettings(List<Setting> settings) {
      this.g = settings;
   }
}
