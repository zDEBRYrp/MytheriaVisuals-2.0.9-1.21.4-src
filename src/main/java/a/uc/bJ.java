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

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import nesquik.mytheria.systems.setting.settings.SliderSetting;
import nesquik.mytheria.utility.animation.base.Easing;

@ModuleInfo(name = "Interface", category = ax.VISUALS, enabledByDefault = true)
public class bJ extends aJ {
   private final ck a = new ck(this, "modules.settings.interface.mode");
   private final ck.a b = new ck.a(this.a, "modules.settings.interface.liquidGlass");
   private final ck.a c = new ck.a(this.a, "modules.settings.interface.minimalism").select();
   private final ck d = new ck(this, "modules.settings.interface.themeMode", () -> this.b.isSelected());
   public final ck.a dark = new ck.a(this.d, "modules.settings.interface.dark");
   public final ck.a light = new ck.a(this.d, "modules.settings.interface.light");
   private final ck e = new ck(this, "modules.settings.interface.language");
   private final dZ f = new dZ(500L, Easing.BOTH_CUBIC);
   public final cj clientColor = new cj(this, "modules.settings.interface.clientColor", () -> false).color(new eb(151.0F, 71.0F, 255.0F, 255.0F)).alpha(false);
   public final cj minimalismBackgroundColor = new cj(
         this, "modules.settings.interface.minimalism.backgroundColor", () -> !this.c.isSelected() || this.light.isSelected()
      )
      .color(new eb(20.0F, 20.0F, 20.0F, 255.0F))
      .alpha(false);
   public final cj liquidGlassColor = new cj(this, "modules.settings.interface.liquidGlass.glassColor", () -> !this.b.isSelected())
      .color(new eb(200.0F, 220.0F, 255.0F, 255.0F))
      .alpha(true);
   public final SliderSetting liquidDistortion = new SliderSetting(this, "modules.settings.interface.liquidGlass.distortion", () -> !this.b.isSelected())
      .min(-0.2F)
      .max(0.2F)
      .step(0.01F)
      .currentValue(0.08F);
   private final ExecutorService g = Executors.newSingleThreadExecutor(r -> {
      Thread var1 = new Thread(r, "Interface-Thread");
      var1.setDaemon(true);
      var1.setPriority(1);
      return var1;
   });
   private boolean h;
   private int i = 0;
   private final EventListener<ab> j = event -> {
      this.f.setEasing(Easing.FIGMA_EASE_IN_OUT);
      this.f.update(this.b.isSelected());
      int var2 = this.e.getValues().indexOf(this.e.getValue());
      if (var2 != this.i) {
         av.setLanguage(var2 == 0 ? au.RU_RU : (var2 == 1 ? au.EN_US : (var2 == 2 ? au.UK_UA : au.PL_PL)));
         this.h = false;
      }

      this.i = var2;
      Mytheria.getInstance().getThemeManager().setCurrentTheme(this.dark.isSelected() ? ct.DARK : ct.LIGHT);
   };

   public bJ() {
      new ck.a(this.e, "Русский");
      new ck.a(this.e, "English");
      new ck.a(this.e, "Українська");
      new ck.a(this.e, "polski");
   }

   public static boolean glassSelected() {
      bJ var0 = Mytheria.getInstance().getModuleManager().getModuleSafe(bJ.class);
      return var0 != null && var0.b.isSelected();
   }

   public static float glass() {
      bJ var0 = Mytheria.getInstance().getModuleManager().getModuleSafe(bJ.class);
      return var0 != null ? var0.f.getValue() : 0.0F;
   }

   public static float minimalizm() {
      return 1.0F - glass();
   }

   public static boolean showGlass() {
      return glass() > 0.0F;
   }

   public static boolean showMinimalizm() {
      return glass() < 1.0F;
   }

   public static float getDistortion() {
      bJ var0 = Mytheria.getInstance().getModuleManager().getModuleSafe(bJ.class);
      return var0 != null ? var0.liquidDistortion.getCurrentValue() : 0.08F;
   }

   public static float getGlassBlur() {
      return 10.0F;
   }

   public static float getGlassAlpha() {
      return glass();
   }

   public static float getGlassRounding() {
      return 7.0F;
   }

   public static eb getBackgroundColor() {
      bJ var0 = Mytheria.getInstance().getModuleManager().getModuleSafe(bJ.class);
      if (var0 == null) {
         return new eb(20.0F, 20.0F, 20.0F, 255.0F);
      } else {
         return var0.light.isSelected() ? new eb(245.0F, 245.0F, 250.0F, 255.0F) : var0.minimalismBackgroundColor.getColor();
      }
   }

   @Generated
   public ck getMode() {
      return this.a;
   }

   @Generated
   public ck.a getLiquidGlass() {
      return this.b;
   }

   @Generated
   public ck.a getMinimalism() {
      return this.c;
   }

   @Generated
   public ck getThemeMode() {
      return this.d;
   }

   @Generated
   public ck.a getDark() {
      return this.dark;
   }

   @Generated
   public ck.a getLight() {
      return this.light;
   }

   @Generated
   public ck getLanguage() {
      return this.e;
   }

   @Generated
   public dZ getLiquidGlassAnim() {
      return this.f;
   }

   @Generated
   public ExecutorService getExecutor() {
      return this.g;
   }

   @Generated
   public boolean isLanguageAutoDetected() {
      return this.h;
   }

   @Generated
   public int getLastLang() {
      return this.i;
   }

   @Generated
   public EventListener<ab> getOnHudRenderEvent() {
      return this.j;
   }

   @Generated
   public cj getClientColor() {
      return this.clientColor;
   }

   @Generated
   public cj getLiquidGlassColor() {
      return this.liquidGlassColor;
   }

   @Generated
   public SliderSetting getLiquidDistortion() {
      return this.liquidDistortion;
   }

   @Override
   public void onEnable() {
      super.onEnable();
   }

   @Override
   public void onDisable() {
      super.onDisable();
   }
}
