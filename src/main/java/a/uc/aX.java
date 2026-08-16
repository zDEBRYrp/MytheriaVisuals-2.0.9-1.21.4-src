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

import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.mixin.accessors.HandledScreenAccessor;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import nesquik.mytheria.systems.setting.settings.SliderSetting;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.math.MathHelper;

@ModuleInfo(name = "Item Highlighter", category = ax.PLAYER, desc = "modules.descriptions.item_highlighter")
@Environment(EnvType.CLIENT)
public class aX extends aJ {
   private final ch a = new ch(this, "Анимация").enabled(true);
   private final SliderSetting b = new SliderSetting(this, "Скорость мигания").min(1.0F).max(20.0F).step(1.0F).currentValue(6.0F).suffix(" Hz");
   private final cn c = new cn(this, "modules.settings.item_highlighter.items").min(0);
   private final cn.a d = new cn.a(this.c, "Тотем").select();
   private final cn.a e = new cn.a(this.c, "Зачарованное яблоко").select();
   private final cn.a f = new cn.a(this.c, "Золотое яблоко").select();
   private final cn.a g = new cn.a(this.c, "Золотая морковь").select();
   private final cn.a h = new cn.a(this.c, "Исцел").select();
   private final cn.a i = new cn.a(this.c, "Дезориентация").select();
   private final cn.a j = new cn.a(this.c, "Трапка").select();
   private final cn.a k = new cn.a(this.c, "Огненный смерч").select();
   private final cn.a l = new cn.a(this.c, "Стан").select();
   private final cn.a m = new cn.a(this.c, "Пласт").select();
   private final cn.a n = new cn.a(this.c, "Божья аура").select();
   private final cn.a o = new cn.a(this.c, "Явная пыль").select();
   private final cn.a p = new cn.a(this.c, "Ком снега").select();
   private final cn.a q = new cn.a(this.c, "Трапка (HW)").select();
   private final cn.a r = new cn.a(this.c, "Взрывная трапка").select();
   private final cn.a s = new cn.a(this.c, "Прощальный гул").select();
   private final cn.a t = new cn.a(this.c, "Рюкзак").select();
   private final cn.a u = new cn.a(this.c, "Арбалет").select();
   private final cn.a v = new cn.a(this.c, "Сфера").select();
   private final cj w = new cj(this, "Тотем", () -> !this.d.isSelected()).color(ec.ACCENT);
   private final cj x = new cj(this, "Зачарованное яблоко", () -> !this.e.isSelected()).color(ec.ACCENT);
   private final cj y = new cj(this, "Золотое яблоко", () -> !this.f.isSelected()).color(ec.ACCENT);
   private final cj z = new cj(this, "Золотая морковь", () -> !this.g.isSelected()).color(ec.ACCENT);
   private final cj A = new cj(this, "Исцел", () -> !this.h.isSelected()).color(ec.ACCENT);
   private final cj B = new cj(this, "Дезориентация", () -> !this.i.isSelected()).color(ec.ACCENT);
   private final cj C = new cj(this, "Трапка", () -> !this.j.isSelected()).color(ec.ACCENT);
   private final cj D = new cj(this, "Огненный смерч", () -> !this.k.isSelected()).color(ec.ACCENT);
   private final cj E = new cj(this, "Стан", () -> !this.l.isSelected()).color(ec.ACCENT);
   private final cj F = new cj(this, "Пласт", () -> !this.m.isSelected()).color(ec.ACCENT);
   private final cj G = new cj(this, "Божья аура", () -> !this.n.isSelected()).color(ec.ACCENT);
   private final cj H = new cj(this, "Явная пыль", () -> !this.o.isSelected()).color(ec.ACCENT);
   private final cj I = new cj(this, "Ком снега", () -> !this.p.isSelected()).color(ec.ACCENT);
   private final cj J = new cj(this, "Трапка (HW)", () -> !this.q.isSelected()).color(ec.ACCENT);
   private final cj K = new cj(this, "Взрывная трапка", () -> !this.r.isSelected()).color(ec.ACCENT);
   private final cj L = new cj(this, "Прощальный гул", () -> !this.s.isSelected()).color(ec.ACCENT);
   private final cj M = new cj(this, "Рюкзак", () -> !this.t.isSelected()).color(ec.ACCENT);
   private final cj N = new cj(this, "Арбалет", () -> !this.u.isSelected()).color(ec.ACCENT);
   private final cj O = new cj(this, "Сфера", () -> !this.v.isSelected()).color(ec.ACCENT);
   private final EventListener<ag> P = event -> {
      if (mc.player != null && mc.currentScreen != null && mc.currentScreen instanceof HandledScreenAccessor var2) {
         int var3 = var2.getX();
         int var4 = var2.getY();

         for (Slot var6 : mc.player.currentScreenHandler.slots) {
            if (var6.hasStack()) {
               eb var7 = this.a(var6.getStack());
               if (var7 != null) {
                  float var8 = var3 + var6.x;
                  float var9 = var4 + var6.y;
                  eb var10 = this.a.isEnabled() ? var7.withAlpha(var7.getAlpha() * this.a()) : var7;
                  event.getContext().drawRect(var8, var9, 16.0F, 16.0F, var10);
                  eb var11 = new eb(
                     Math.min(255.0F, var10.getRed() * 1.3F),
                     Math.min(255.0F, var10.getGreen() * 1.3F),
                     Math.min(255.0F, var10.getBlue() * 1.3F),
                     var10.getAlpha()
                  );
                  event.getContext().drawRoundedBorder(var8, var9, 16.0F, 16.0F, 0.5F, BorderRadius.all(0.0F), var11);
               }
            }
         }
      }
   };
   private final EventListener<af> Q = event -> {
      if (mc.player != null && mc.world != null) {
         this.a(event.getContext());
      }
   };
   private final EventListener<ac> R = event -> {};

   private void a(DrawContext context) {
      if (mc.player != null) {
         for (int var2 = 0; var2 < 9; var2++) {
            ItemStack var3 = mc.player.getInventory().getStack(var2);
            if (!var3.isEmpty()) {
               eb var4 = this.a(var3);
               if (var4 != null) {
                  int var5 = mc.getWindow().getScaledWidth();
                  int var6 = mc.getWindow().getScaledHeight();
                  int var7 = var5 / 2 - 90 + var2 * 20 + 2;
                  int var8 = var6 - 16 - 3;
                  float var9 = this.a.isEnabled() ? this.a() : 1.0F;
                  int var10 = this.a(var4.getRGB(), var9 * (var4.getAlpha() / 255.0F));
                  context.fill(var7 - 1, var8 - 1, var7 + 17, var8 + 17, var10);
               }
            }
         }
      }
   }

   private float a() {
      float var1 = this.b.getCurrentValue();
      float var2 = (float)(System.currentTimeMillis() / 1000.0 * var1 * Math.PI * 2.0);
      float var3 = 0.5F + 0.5F * MathHelper.sin(var2);
      return 0.2F + 0.5F * var3;
   }

   private int a(int color, float alpha) {
      float var3 = MathHelper.clamp(alpha, 0.0F, 1.0F);
      int var4 = Math.round(255.0F * var3);
      return var4 << 24 | color & 16777215;
   }

   private eb a(ItemStack stack) {
      if (stack != null && !stack.isEmpty()) {
         Item var2 = stack.getItem();
         eb var3;
         if (var2 == Items.TOTEM_OF_UNDYING && this.d.isSelected()) {
            var3 = this.w.getColor();
         } else if (var2 == Items.ENCHANTED_GOLDEN_APPLE && this.e.isSelected()) {
            var3 = this.x.getColor();
         } else if (var2 == Items.GOLDEN_APPLE && this.f.isSelected()) {
            var3 = this.y.getColor();
         } else if (var2 == Items.GOLDEN_CARROT && this.g.isSelected()) {
            var3 = this.z.getColor();
         } else if (this.h.isSelected() && eh.hasEffect(stack, StatusEffects.INSTANT_HEALTH)) {
            var3 = this.A.getColor();
         } else if (var2 == Items.ENDER_EYE && this.i.isSelected()) {
            var3 = this.B.getColor();
         } else if (var2 == Items.NETHERITE_SCRAP && this.j.isSelected()) {
            var3 = this.C.getColor();
         } else if (var2 == Items.FIRE_CHARGE && this.k.isSelected()) {
            var3 = this.D.getColor();
         } else if (var2 == Items.NETHER_STAR && this.l.isSelected()) {
            var3 = this.E.getColor();
         } else if (var2 == Items.DRIED_KELP && this.m.isSelected()) {
            var3 = this.F.getColor();
         } else if (var2 == Items.PHANTOM_MEMBRANE && this.n.isSelected()) {
            var3 = this.G.getColor();
         } else if (var2 == Items.SUGAR && this.o.isSelected()) {
            var3 = this.H.getColor();
         } else if (var2 == Items.SNOWBALL && this.p.isSelected()) {
            var3 = this.I.getColor();
         } else if (var2 == Items.POPPED_CHORUS_FRUIT && this.q.isSelected()) {
            var3 = this.J.getColor();
         } else if (var2 == Items.PRISMARINE_SHARD && this.r.isSelected()) {
            var3 = this.K.getColor();
         } else if (var2 == Items.FIREWORK_STAR && this.s.isSelected()) {
            var3 = this.L.getColor();
         } else if (var2 == Items.MAGENTA_SHULKER_BOX && this.t.isSelected()) {
            var3 = this.M.getColor();
         } else if (var2 == Items.CROSSBOW && this.u.isSelected()) {
            var3 = this.N.getColor();
         } else {
            if (var2 != Items.PLAYER_HEAD || !this.v.isSelected()) {
               return null;
            }

            var3 = this.O.getColor();
         }

         return var3.withAlpha(140.25F);
      } else {
         return null;
      }
   }
}
