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
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Font;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.utility.animation.base.Easing;
import nesquik.mytheria.utility.mixins.StatusEffectInstanceAddition;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.texture.Sprite;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.entry.RegistryEntry;

public class cU extends cR {
   int a = -1;
   private final Map<String, StatusEffectInstance> b = new TreeMap<>();
   private final Map<String, StatusEffectInstance> c = new TreeMap<>();
   private final Map<StatusEffect, Boolean> d = new HashMap<>();
   private final ch e = new ch(this, "hud.effects.alert");
   private final ch f = new ch(this, "hud.effects.separate_donate").enabled(true);
   private final Map<String, dZ> g = new HashMap<>();
   private final Map<String, cA> h = new HashMap<>();
   private static final boolean i = et.isLunarClient();

   public cU() {
      super("hud.effects", "icons/hud/potion.png");
   }

   private List<String> a() {
      if (mc.player == null) {
         return new ArrayList<>();
      }

      Collection<StatusEffectInstance> var1 = mc.player.getStatusEffects();
      HashMap var2 = new HashMap();

      for (StatusEffectInstance var4 : var1) {
         StatusEffect var5 = (StatusEffect)var4.getEffectType().value();
         String var6 = var5.getName().getString();
         var2.put(var6, var4.getAmplifier());
      }

      ArrayList var7 = new ArrayList();
      if (var2.containsKey("Сила")
            && (Integer)var2.get("Сила") >= 3
            && var2.containsKey("Скорость")
            && (Integer)var2.get("Скорость") >= 2
            && var2.containsKey("Спешка")
         || var2.containsKey("Strength")
            && (Integer)var2.get("Strength") >= 3
            && var2.containsKey("Speed")
            && (Integer)var2.get("Speed") >= 2
            && var2.containsKey("Haste")) {
         var7.add("Зелье Ассасина");
      }

      if (var2.containsKey("Сопротивление")
            && var2.containsKey("Огнестойкость")
            && var2.containsKey("Невидимость")
            && var2.containsKey("Прилив здоровья")
            && (Integer)var2.get("Прилив здоровья") >= 2
         || var2.containsKey("Resistance")
            && var2.containsKey("Fire Resistance")
            && var2.containsKey("Invisibility")
            && var2.containsKey("Health Boost")
            && (Integer)var2.get("Health Boost") >= 2) {
         var7.add("Зелье Палладина");
      }

      if (var2.containsKey("Сила") && (Integer)var2.get("Сила") >= 4 && var2.containsKey("Замедление") && (Integer)var2.get("Замедление") >= 3
         || var2.containsKey("Strength") && (Integer)var2.get("Strength") >= 4 && var2.containsKey("Slowness") && (Integer)var2.get("Slowness") >= 3) {
         var7.add("Зелье Гнева");
      }

      if (var2.containsKey("Слабость")
            && (Integer)var2.get("Слабость") >= 1
            && var2.containsKey("Утомление")
            && (Integer)var2.get("Утомление") >= 1
            && var2.containsKey("Иссушение")
            && (Integer)var2.get("Иссушение") >= 2
            && var2.containsKey("Слепота")
         || var2.containsKey("Weakness")
            && (Integer)var2.get("Weakness") >= 1
            && var2.containsKey("Mining Fatigue")
            && (Integer)var2.get("Mining Fatigue") >= 1
            && var2.containsKey("Wither")
            && (Integer)var2.get("Wither") >= 2
            && var2.containsKey("Blindness")) {
         var7.add("Снотворное");
      }

      if (var2.containsKey("Отравление")
            && (Integer)var2.get("Отравление") >= 1
            && var2.containsKey("Иссушение")
            && (Integer)var2.get("Иссушение") >= 1
            && var2.containsKey("Замедление")
            && (Integer)var2.get("Замедление") >= 2
            && var2.containsKey("Голод")
            && (Integer)var2.get("Голод") >= 4
            && var2.containsKey("Свечение")
         || var2.containsKey("Poison")
            && (Integer)var2.get("Poison") >= 1
            && var2.containsKey("Wither")
            && (Integer)var2.get("Wither") >= 1
            && var2.containsKey("Slowness")
            && (Integer)var2.get("Slowness") >= 2
            && var2.containsKey("Hunger")
            && (Integer)var2.get("Hunger") >= 4
            && var2.containsKey("Glowing")) {
         var7.add("Зелье Радиации");
      }

      if (var2.containsKey("Замедление")
            && (Integer)var2.get("Замедление") >= 9
            && var2.containsKey("Скорость")
            && (Integer)var2.get("Скорость") >= 4
            && var2.containsKey("Слепота")
            && (Integer)var2.get("Слепота") >= 9
            && var2.containsKey("Свечение")
         || var2.containsKey("Slowness")
            && (Integer)var2.get("Slowness") >= 9
            && var2.containsKey("Speed")
            && (Integer)var2.get("Speed") >= 4
            && var2.containsKey("Blindness")
            && (Integer)var2.get("Blindness") >= 9
            && var2.containsKey("Glowing")) {
         var7.add("Хлопушка");
      }

      if (var2.containsKey("Регенерация") && (Integer)var2.get("Регенерация") >= 2 && var2.containsKey("Невидимость") && (Integer)var2.get("Невидимость") >= 1
         || var2.containsKey("Regeneration")
            && (Integer)var2.get("Regeneration") >= 2
            && var2.containsKey("Invisibility")
            && (Integer)var2.get("Invisibility") >= 1) {
         var7.add("Святая вода");
      }

      return var7;
   }

   private StatusEffectInstance a(String donatePotionName) {
      if (mc.player != null && donatePotionName != null) {
         Collection<StatusEffectInstance> var2 = mc.player.getStatusEffects();
         String var3 = null;
         String var4 = null;
         switch (donatePotionName) {
            case "Зелье Ассасина":
            case "Зелье Гнева":
               var3 = "Сила";
               var4 = "Strength";
               break;
            case "Зелье Палладина":
               var3 = "Сопротивление";
               var4 = "Resistance";
               break;
            case "Святая вода":
               var3 = "Регенерация";
               var4 = "Regeneration";
               break;
            case "Снотворное":
               var3 = "Слабость";
               var4 = "Weakness";
               break;
            case "Зелье Радиации":
               var3 = "Отравление";
               var4 = "Poison";
               break;
            case "Хлопушка":
               var3 = "Слепота";
               var4 = "Blindness";
         }

         if (var3 != null) {
            for (StatusEffectInstance var10 : var2) {
               StatusEffect var7 = (StatusEffect)var10.getEffectType().value();
               String var8 = var7.getName().getString();
               if (var8.equals(var3) || var8.equals(var4)) {
                  return var10;
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private Set<String> b(String donatePotionName) {
      HashSet var2 = new HashSet();
      if (donatePotionName == null) {
         return var2;
      }

      switch (donatePotionName) {
         case "Зелье Ассасина":
            var2.add("Сила");
            var2.add("Strength");
            var2.add("Скорость");
            var2.add("Speed");
            var2.add("Спешка");
            var2.add("Haste");
            break;
         case "Зелье Палладина":
            var2.add("Сопротивление");
            var2.add("Resistance");
            var2.add("Огнестойкость");
            var2.add("Fire Resistance");
            var2.add("Невидимость");
            var2.add("Invisibility");
            var2.add("Прилив здоровья");
            var2.add("Health Boost");
            break;
         case "Зелье Гнева":
            var2.add("Сила");
            var2.add("Strength");
            var2.add("Замедление");
            var2.add("Slowness");
            break;
         case "Снотворное":
            var2.add("Слабость");
            var2.add("Weakness");
            var2.add("Утомление");
            var2.add("Mining Fatigue");
            var2.add("Иссушение");
            var2.add("Wither");
            var2.add("Слепота");
            var2.add("Blindness");
            break;
         case "Зелье Радиации":
            var2.add("Отравление");
            var2.add("Poison");
            var2.add("Иссушение");
            var2.add("Wither");
            var2.add("Замедление");
            var2.add("Slowness");
            var2.add("Голод");
            var2.add("Hunger");
            var2.add("Свечение");
            var2.add("Glowing");
            break;
         case "Хлопушка":
            var2.add("Замедление");
            var2.add("Slowness");
            var2.add("Скорость");
            var2.add("Speed");
            var2.add("Слепота");
            var2.add("Blindness");
            var2.add("Свечение");
            var2.add("Glowing");
            break;
         case "Святая вода":
            var2.add("Регенерация");
            var2.add("Regeneration");
            var2.add("Невидимость");
            var2.add("Invisibility");
      }

      return var2;
   }

   private dZ a(StatusEffectInstance effect) {
      if (i) {
         StatusEffect var2 = (StatusEffect)effect.getEffectType().value();
         String var6 = var2.getName().getString();
         return this.g.computeIfAbsent(var6, k -> new dZ(300L, 0.0F, Easing.BAKEK));
      }

      try {
         return ((StatusEffectInstanceAddition)effect).Mytheria$getAnimPotion();
      } catch (ClassCastException var5) {
         StatusEffect var3 = (StatusEffect)effect.getEffectType().value();
         String var4 = var3.getName().getString();
         return this.g.computeIfAbsent(var4, k -> new dZ(300L, 0.0F, Easing.BAKEK));
      }
   }

   private cA b(StatusEffectInstance effect) {
      if (i) {
         StatusEffect var2 = (StatusEffect)effect.getEffectType().value();
         String var6 = var2.getName().getString();
         return this.h.computeIfAbsent(var6, k -> new cA(Fonts.MEDIUM.getFont(6.5F), 6.5F, 300L, Easing.BAKEK));
      }

      try {
         return ((StatusEffectInstanceAddition)effect).Mytheria$getTimeAnimation();
      } catch (ClassCastException var5) {
         StatusEffect var3 = (StatusEffect)effect.getEffectType().value();
         String var4 = var3.getName().getString();
         return this.h.computeIfAbsent(var4, k -> new cA(Fonts.MEDIUM.getFont(6.5F), 6.5F, 300L, Easing.BAKEK));
      }
   }

   @Override
   public void update(UIContext context) {
      this.width = 92.0F;
      this.height = 18.0F;
      Collection<StatusEffectInstance> var2 = mc.player.getStatusEffects();
      boolean var3 = mc.currentScreen instanceof ChatScreen || mc.currentScreen instanceof cO;
      boolean var4 = !var2.isEmpty();
      boolean var5 = var3 && !var4;
      List<String> var6 = this.a();
      boolean var7 = !var6.isEmpty() && this.f.isEnabled();
      HashSet var8 = new HashSet();
      if (var7) {
         for (String var10 : var6) {
            var8.addAll(this.b(var10));
         }
      }

      this.c.clear();
      if (!var5) {
         for (StatusEffectInstance var27 : var2) {
            StatusEffect var11 = (StatusEffect)var27.getEffectType().value();
            String var12 = var11.getName().getString();
            if (var12 != null && !ep.isCM()) {
               if (var7 && var8.contains(var12)) {
                  if (this.c.containsKey(var12)) {
                     this.c.replace(var12, var27);
                  } else {
                     this.c.put(var12, var27);
                  }
               } else if (this.b.containsKey(var12)) {
                  this.b.replace(var12, var27);
                  dZ var13 = this.a(var27);
                  if (var13.getValue() == 0.0F) {
                     var13.setValue(1.0F);
                  }
               } else {
                  this.b.put(var12, var27);
               }
            }
         }

         this.b.entrySet().removeIf(entry -> !var2.contains(entry.getValue()));
      }

      if (!this.b.isEmpty() || !this.c.isEmpty() || var5) {
         this.height += 5.0F;
      }

      if (var5) {
         Font var24 = Fonts.REGULAR.getFont(7.0F);
         Font var28 = Fonts.MEDIUM.getFont(6.5F);
         String var31 = "Speed II";
         String var34 = "Strength II";
         float var37 = Math.max(var24.width(var31), var24.width(var34));
         String var14 = "00:00";
         float var15 = var28.width(var14) + 10.0F;
         float var16 = 20.0F + var37 + 10.0F + var15 + 10.0F;
         this.width = Math.max(var16, this.width);
         this.height += 18.0F;
      } else {
         for (StatusEffectInstance var29 : this.b.values()) {
            dZ var32 = this.a(var29);
            StatusEffect var35 = (StatusEffect)var29.getEffectType().value();
            if (this.e.isEnabled()) {
               String var38 = var35.getName().getString() + " " + (var29.getAmplifier() > 0 ? var29.getAmplifier() + 1 : "");
               if (!mc.player.hasStatusEffect(var29.getEffectType())) {
                  if (!this.d.getOrDefault(var35, false) && !var35.getCategory().equals(StatusEffectCategory.HARMFUL)) {
                     Mytheria.getInstance()
                        .getNotificationManager()
                        .addNotificationOther(cb.INFO, "Эффект " + var38 + " закончился", "Действие эффекта завершено");
                     this.d.put(var35, true);
                  }
               } else {
                  this.d.put(var35, false);
               }
            }

            var32.update(var2.contains(var29));
            var32.setEasing(Easing.BAKEK);
            String var39 = var35.getName().getString() + " " + (var29.getAmplifier() > 0 ? var29.getAmplifier() + 1 : "");
            Font var41 = Fonts.REGULAR.getFont(7.0F);
            Font var43 = Fonts.MEDIUM.getFont(6.5F);
            float var45 = var41.width(var39);
            String var17;
            if (!var29.isInfinite() && var29.getDuration() < 999999999) {
               int var18 = var29.getDuration() / 20;
               int var19 = var18 / 60;
               int var20 = var18 % 60;
               var17 = String.format("%02d:%02d", var19, var20);
            } else {
               var17 = "**:**";
            }

            float var50 = var43.width(var17) + 10.0F;
            float var53 = 20.0F + var45 + 10.0F + var50 + 10.0F;
            this.width = Math.max(var53, this.width);
            this.height = this.height + 18.0F * var32.getValue();
         }

         if (var7) {
            for (String var30 : var6) {
               Font var33 = Fonts.REGULAR.getFont(7.0F);
               Font var36 = Fonts.MEDIUM.getFont(6.5F);
               float var40 = var33.width(var30);
               String var42 = "00:00";
               Set<String> var44 = this.b(var30);

               for (StatusEffectInstance var48 : this.c.values()) {
                  StatusEffect var51 = (StatusEffect)var48.getEffectType().value();
                  String var54 = var51.getName().getString();
                  if (var44.contains(var54) && !var48.isInfinite() && var48.getDuration() < 999999999) {
                     int var55 = var48.getDuration() / 20;
                     int var21 = var55 / 60;
                     int var22 = var55 % 60;
                     var42 = String.format("%02d:%02d", var21, var22);
                     break;
                  }
               }

               float var47 = var36.width(var42) + 10.0F;
               StatusEffectInstance var49 = this.a(var30);
               float var52;
               if (var49 != null) {
                  var52 = 20.0F + var40 + 10.0F + var47 + 10.0F;
               } else {
                  var52 = 10.0F + var40 + 10.0F + var47 + 10.0F;
               }

               this.width = Math.max(var52, this.width);
               this.height += 18.0F;
            }
         }
      }

      super.update(context);
   }

   private void a(UIContext context) {
      Font var2 = Fonts.REGULAR.getFont(7.0F);
      Font var3 = Fonts.MEDIUM.getFont(6.5F);
      float var4 = 22.0F;
      long var5 = System.currentTimeMillis();
      long var7 = var5 % 2000L;
      boolean var9 = var5 / 2000L % 2L == 0L;
      float var10 = 1.0F;
      if (var7 < 300L) {
         var10 = (float)var7 / 300.0F;
      } else if (var7 > 1700L) {
         var10 = (float)(2000L - var7) / 300.0F;
      }

      String var11 = var9 ? "Speed II" : "Strength II";
      String var12 = "00:00";
      float var13 = 10.0F;

      try {
         RegistryEntry var14;
         if (var9) {
            var14 = StatusEffects.SPEED;
         } else {
            var14 = StatusEffects.STRENGTH;
         }

         Sprite var15 = mc.getStatusEffectSpriteManager().getSprite(var14);
         context.drawTexture(
            var15.getAtlasId(),
            this.x + 5.0F,
            this.y + var4 + er.getMiddleOfBox(var13, 18.0F),
            var13,
            var13,
            var15.getMinU(),
            var15.getMaxU(),
            var15.getMinV(),
            var15.getMaxV(),
            eb.WHITE.withAlpha((int)(255.0F * var10))
         );
      } catch (Exception var22) {
         context.drawRect(this.x + 5.0F, this.y + var4 + er.getMiddleOfBox(var13, 18.0F), var13, var13, ec.getTextColor().withAlpha(50.0F * var10));
      }

      float var23 = this.x + 5.0F + var13 + 4.0F;
      context.drawText(var2, "|", var23, this.y + var4 + er.getMiddleOfBox(var2.height(), 18.0F), ec.getTextColor().withAlpha(80.0F * var10));
      float var24 = var23 + 6.0F;
      context.drawText(var2, var11, var24, this.y + var4 + er.getMiddleOfBox(var2.height(), 18.0F), ec.getTextColor().withAlpha(255.0F * var10));
      float var16 = var3.width(var12) + 10.0F;
      float var17 = 13.0F;
      float var18 = this.x + this.width - 5.0F - var16;
      float var19 = this.y + var4 + (18.0F - var17) / 2.0F;
      context.drawRoundedRect(var18, var19, var16, var17, BorderRadius.all(6.0F), ec.getTextColor().withAlpha(10.0F * var10));
      float var20 = var18 + (var16 - var3.width(var12)) / 2.0F + 1.0F;
      float var21 = var19 + (var17 - var3.height()) / 2.0F;
      context.drawText(var3, var12, var20, var21, ec.getTextColor().withAlpha(255.0F * var10));
   }

   @Override
   protected void renderComponent(UIContext context) {
      if (mc.player != null && mc.world != null) {
         Font var2 = Fonts.REGULAR.getFont(7.0F);
         float var3 = 22.0F;
         context.drawClientRect(this.x, this.y, this.width, Math.max(20.0F, this.height), this.animation.getValue(), this.dragAnim.getValue(), 7.0F);
         float var4 = 18.0F;
         Font var5 = Fonts.MEDIUM.getFont(8.0F);
         String var6 = "Potions";
         float var7 = var5.width(var6);
         float var8 = this.x + (this.width - var7) / 2.0F;
         context.drawText(var5, var6, var8, this.y + er.getMiddleOfBox(var2.height(), var4) + 0.5F, ec.getTextColor());
         if (this.height >= 23.0F) {
            context.drawRect(this.x, this.y + var4, this.width, 0.5F, ec.getTextColor().withAlpha(30.0F));
         }

         Collection<StatusEffectInstance> var9 = mc.player.getStatusEffects();
         boolean var10 = mc.currentScreen instanceof ChatScreen || mc.currentScreen instanceof cO;
         boolean var11 = !var9.isEmpty();
         boolean var12 = var10 && !var11;
         if (var12) {
            this.a(context);
            if (this.height > 23.0F) {
               float var44 = this.width * 0.5F;
               float var45 = 1.5F;
               float var46 = this.x + (this.width - var44) / 2.0F;
               float var59 = this.y + this.height - var45 - 0.0F;
               context.drawRoundedRect(var46, var59, var44, var45, BorderRadius.all(1.25F), eb.WHITE);
            }

            return;
         }

         List<String> var13 = this.a();
         boolean var14 = !var13.isEmpty() && this.f.isEnabled();
         StatusEffectInstance var15 = null;
         if (!i) {
            fs var48 = new fs(VertexFormats.POSITION_COLOR, context.getMatrices());

            for (StatusEffectInstance var73 : this.b.values()) {
               dZ var85 = this.a(var73);
               if (var85.getValue() == 0.0F) {
                  var15 = var73;
               } else {
                  float var20 = -4.5F + 4.5F * var85.getValue();
                  if (var3 != 22.0F) {
                     context.drawRect(this.x, this.y + var3 + var20, this.width, 0.5F, ec.getTextColor().withAlpha(5.1F * var85.getValue()));
                  }

                  var3 += 18.0F * var85.getValue();
               }
            }

            if (var14) {
               if (var3 != 22.0F) {
                  context.drawRect(this.x, this.y + var3, this.width, 0.5F, ec.getTextColor().withAlpha(5.1F));
               }

               for (String var74 : var13) {
                  var3 += 18.0F;
               }
            }

            var48.draw();
         } else {
            for (StatusEffectInstance var17 : this.b.values()) {
               dZ var18 = this.a(var17);
               if (var18.getValue() == 0.0F) {
                  var15 = var17;
               } else {
                  float var19 = -4.5F + 4.5F * var18.getValue();
                  if (var3 != 22.0F) {
                     context.drawRect(this.x, this.y + var3 + var19, this.width, 0.5F, ec.getTextColor().withAlpha(5.1F * var18.getValue()));
                  }

                  var3 += 18.0F * var18.getValue();
               }
            }

            if (var14) {
               if (var3 != 22.0F) {
                  context.drawRect(this.x, this.y + var3, this.width, 0.5F, ec.getTextColor().withAlpha(5.1F));
               }

               for (String var60 : var13) {
                  var3 += 18.0F;
               }
            }
         }

         var3 = 22.0F;
         if (!i) {
            fr var51 = new fr(VertexFormats.POSITION_TEXTURE_COLOR, context.getMatrices());

            for (StatusEffectInstance var77 : this.b.values()) {
               dZ var88 = this.a(var77);
               if (var88.getValue() != 0.0F) {
                  float var98 = -4.5F + 4.5F * var88.getValue();
                  Sprite var106 = mc.getStatusEffectSpriteManager().getSprite(var77.getEffectType());
                  float var22 = 10.0F;
                  context.drawTexture(
                     var106.getAtlasId(),
                     this.x + 5.0F,
                     this.y + var3 + var98 + er.getMiddleOfBox(var22, 18.0F),
                     var22,
                     var22,
                     var106.getMinU(),
                     var106.getMaxU(),
                     var106.getMinV(),
                     var106.getMaxV(),
                     eb.WHITE.withAlpha(255.0F * var88.getValue())
                  );
                  var3 += 18.0F * var88.getValue();
               }
            }

            if (var14) {
               for (String var78 : var13) {
                  StatusEffectInstance var89 = this.a(var78);
                  if (var89 != null) {
                     Sprite var99 = mc.getStatusEffectSpriteManager().getSprite(var89.getEffectType());
                     float var107 = 10.0F;
                     context.drawTexture(
                        var99.getAtlasId(),
                        this.x + 5.0F,
                        this.y + var3 + er.getMiddleOfBox(var107, 18.0F),
                        var107,
                        var107,
                        var99.getMinU(),
                        var99.getMaxU(),
                        var99.getMinV(),
                        var99.getMaxV(),
                        eb.WHITE.withAlpha(255.0F)
                     );
                  }

                  var3 += 18.0F;
               }
            }

            var51.draw();
         } else {
            for (StatusEffectInstance var63 : this.b.values()) {
               dZ var75 = this.a(var63);
               if (var75.getValue() != 0.0F) {
                  float var86 = -4.5F + 4.5F * var75.getValue();
                  Sprite var96 = mc.getStatusEffectSpriteManager().getSprite(var63.getEffectType());
                  float var21 = 10.0F;
                  context.drawTexture(
                     var96.getAtlasId(),
                     this.x + 5.0F,
                     this.y + var3 + var86 + er.getMiddleOfBox(var21, 18.0F),
                     var21,
                     var21,
                     var96.getMinU(),
                     var96.getMaxU(),
                     var96.getMinV(),
                     var96.getMaxV(),
                     eb.WHITE.withAlpha(255.0F * var75.getValue())
                  );
                  var3 += 18.0F * var75.getValue();
               }
            }

            if (var14) {
               for (String var64 : var13) {
                  StatusEffectInstance var76 = this.a(var64);
                  if (var76 != null) {
                     Sprite var87 = mc.getStatusEffectSpriteManager().getSprite(var76.getEffectType());
                     float var97 = 10.0F;
                     context.drawTexture(
                        var87.getAtlasId(),
                        this.x + 5.0F,
                        this.y + var3 + er.getMiddleOfBox(var97, 18.0F),
                        var97,
                        var97,
                        var87.getMinU(),
                        var87.getMaxU(),
                        var87.getMinV(),
                        var87.getMaxV(),
                        eb.WHITE.withAlpha(255.0F)
                     );
                  }

                  var3 += 18.0F;
               }
            }
         }

         var3 = 22.0F;

         for (StatusEffectInstance var67 : this.b.values()) {
            dZ var79 = this.a(var67);
            cA var90 = this.b(var67);
            StatusEffect var100 = (StatusEffect)var67.getEffectType().value();
            if (var79.getValue() != 0.0F) {
               float var108 = -4.5F + 4.5F * var79.getValue();
               float var114 = 18.0F;
               Font var24 = Fonts.MEDIUM.getFont(6.5F);
               float var26 = 13.0F;
               String var23;
               float var25;
               if (!var67.isInfinite() && var67.getDuration() < 999999999) {
                  int var27 = var67.getDuration() / 20;
                  int var28 = var27 / 60;
                  int var29 = var27 % 60;
                  var23 = String.format("%02d:%02d", var28, var29);
                  var25 = var24.width(var23) + 10.0F;
               } else {
                  var23 = "**:**";
                  var25 = var24.width(var23) + 10.0F;
               }

               float var138 = this.x + this.width - 5.0F - var25;
               float var142 = this.y + var3 + var108 + (var114 - var26) / 2.0F;
               context.drawRoundedRect(var138, var142, var25, var26, BorderRadius.all(6.0F), ec.getTextColor().withAlpha(10.0F * var79.getValue()));
               boolean var30 = var100.getCategory().equals(StatusEffectCategory.HARMFUL);
               boolean var31 = !var67.isInfinite() && var67.getDuration() < 999999999 && var67.getDuration() <= 200;
               eb var145;
               if (var30) {
                  var145 = new eb(255.0F, 150.0F, 150.0F, 255.0F * var79.getValue());
               } else if (var31) {
                  var145 = new eb(255.0F, 200.0F, 150.0F, 255.0F * var79.getValue());
               } else {
                  var145 = ec.getTextColor().withAlpha(255.0F * var79.getValue());
               }

               if (!var67.isInfinite() && var67.getDuration() < 999999999) {
                  int var151 = var67.getDuration() / 20;
                  int var153 = var151 / 60;
                  int var34 = var151 % 60;
                  String var35 = String.format("%02d:%02d", var153, var34);
                  String var36 = String.format("%02d:", var153);
                  float var37 = var24.width(var36);
                  float var38 = var24.width(var35);
                  float var39 = var138 + (var25 - var38) / 2.0F + 1.0F;
                  float var40 = var142 + (var26 - var24.height()) / 2.0F;
                  context.drawText(var24, var36, var39, var40, var145);
                  var90.settings(true, var145);
                  var90.update(var34);
                  var90.pos(var39 + var37, var40);
                  var90.render(context);
               } else {
                  float var32 = var138 + (var25 - var24.width(var23)) / 2.0F + 1.0F;
                  float var33 = var142 + (var26 - var24.height()) / 2.0F;
                  context.drawText(var24, var23, var32, var33, var145);
               }

               var3 += 18.0F * var79.getValue();
            }
         }

         if (var14) {
            for (String var68 : var13) {
               float var80 = 18.0F;
               Font var91 = Fonts.MEDIUM.getFont(6.5F);
               float var101 = 13.0F;
               int var109 = Integer.MAX_VALUE;
               Set<String> var115 = this.b(var68);

               for (StatusEffectInstance var124 : this.c.values()) {
                  StatusEffect var129 = (StatusEffect)var124.getEffectType().value();
                  String var134 = var129.getName().getString();
                  if (var115.contains(var134) && !var124.isInfinite() && var124.getDuration() < 999999999) {
                     var109 = Math.min(var109, var124.getDuration());
                  }
               }

               String var120;
               float var125;
               if (var109 != Integer.MAX_VALUE) {
                  int var130 = var109 / 20;
                  int var135 = var130 / 60;
                  int var139 = var130 % 60;
                  var120 = String.format("%02d:%02d", var135, var139);
                  var125 = var91.width(var120) + 10.0F;
               } else {
                  var120 = "**:**";
                  var125 = var91.width(var120) + 10.0F;
               }

               float var131 = this.x + this.width - 5.0F - var125;
               float var136 = this.y + var3 + (var80 - var101) / 2.0F;
               context.drawRoundedRect(var131, var136, var125, var101, BorderRadius.all(6.0F), ec.getTextColor().withAlpha(10.0F));
               boolean var140 = var109 != Integer.MAX_VALUE && var109 <= 200;
               eb var143 = var140 ? new eb(255.0F, 200.0F, 150.0F, 255.0F) : ec.getTextColor();
               float var146 = var131 + (var125 - var91.width(var120)) / 2.0F + 1.0F;
               float var148 = var136 + (var101 - var91.height()) / 2.0F;
               context.drawText(var91, var120, var146, var148, var143);
               var3 += 18.0F;
            }
         }

         if (i) {
            var3 = 22.0F;

            for (StatusEffectInstance var70 : this.b.values()) {
               dZ var82 = this.a(var70);
               StatusEffect var93 = (StatusEffect)var70.getEffectType().value();
               if (var82.getValue() != 0.0F) {
                  float var103 = -4.5F + 4.5F * var82.getValue();
                  String var111 = var93.getName().getString() + " " + (var70.getAmplifier() > 0 ? var70.getAmplifier() + 1 : "");
                  float var117 = 10.0F;
                  float var122 = this.x + 5.0F + var117 + 4.0F;
                  context.drawText(
                     var2, "|", var122, this.y + var3 + var103 + er.getMiddleOfBox(var2.height(), 18.0F), ec.getTextColor().withAlpha(80.0F * var82.getValue())
                  );
                  float var127 = var122 + 6.0F;
                  context.drawText(
                     var2,
                     var111,
                     var127,
                     this.y + var3 + var103 + er.getMiddleOfBox(var2.height(), 18.0F),
                     ec.getTextColor().withAlpha(255.0F * var82.getValue())
                  );
                  var3 += 18.0F * var82.getValue();
               }
            }
         } else {
            fq var54 = new fq(VertexFormats.POSITION_TEXTURE_COLOR, var2.getFont());
            var3 = 22.0F;

            for (StatusEffectInstance var81 : this.b.values()) {
               dZ var92 = this.a(var81);
               StatusEffect var102 = (StatusEffect)var81.getEffectType().value();
               if (var92.getValue() != 0.0F) {
                  float var110 = -4.5F + 4.5F * var92.getValue();
                  String var116 = var102.getName().getString() + " " + (var81.getAmplifier() > 0 ? var81.getAmplifier() + 1 : "");
                  float var121 = 10.0F;
                  float var126 = this.x + 5.0F + var121 + 4.0F;
                  context.drawText(
                     var2, "|", var126, this.y + var3 + var110 + er.getMiddleOfBox(var2.height(), 18.0F), ec.getTextColor().withAlpha(80.0F * var92.getValue())
                  );
                  float var132 = var126 + 6.0F;
                  context.drawText(
                     var2,
                     var116,
                     var132,
                     this.y + var3 + var110 + er.getMiddleOfBox(var2.height(), 18.0F),
                     ec.getTextColor().withAlpha(255.0F * var92.getValue())
                  );
                  var3 += 18.0F * var92.getValue();
               }
            }

            var54.draw();
         }

         if (var14) {
            for (String var71 : var13) {
               StatusEffectInstance var83 = this.a(var71);
               float var94;
               if (var83 != null) {
                  float var104 = 10.0F;
                  float var112 = this.x + 5.0F + var104 + 4.0F;
                  float var118 = this.y + var3 + er.getMiddleOfBox(var2.height(), 18.0F);
                  context.drawText(var2, "|", var112, var118, ec.getTextColor().withAlpha(80.0F));
                  var94 = var112 + 6.0F;
               } else {
                  var94 = this.x + 5.0F;
               }

               float var105 = this.y + var3 + er.getMiddleOfBox(var2.height(), 18.0F);
               long var113 = System.currentTimeMillis();
               float var123 = (float)(var113 % 6000L) / 6000.0F;
               eb var128 = ec.getAccentColor();
               float var133 = var94;

               for (int var137 = 0; var137 < var71.length(); var137++) {
                  char var141 = var71.charAt(var137);
                  String var144 = String.valueOf(var141);
                  float var147 = (float)var137 / Math.max(1, var71.length() - 1);
                  float var149 = (var123 + var147 * 0.5F) % 1.0F;
                  float var150 = (float)(Math.sin(var149 * Math.PI * 2.0 - (Math.PI / 2)) * 0.5 + 0.5);
                  int var152 = (int)(255.0F - (255.0F - var128.getRed()) * var150);
                  int var154 = (int)(255.0F - (255.0F - var128.getGreen()) * var150);
                  int var155 = (int)(255.0F - (255.0F - var128.getBlue()) * var150);
                  eb var156 = new eb(var152, var154, var155, 255.0F);
                  context.drawText(var2, var144, var133, var105, var156);
                  var133 += var2.width(var144);
               }

               var3 += 18.0F;
            }
         }

         if (this.height > 23.0F) {
            float var57 = this.width * 0.5F;
            float var72 = 1.5F;
            float var84 = this.x + (this.width - var57) / 2.0F;
            float var95 = this.y + this.height - var72 - 0.0F;
            context.drawRoundedRect(var84, var95, var57, var72, BorderRadius.all(1.25F), eb.WHITE);
         }

         if (var15 != null) {
            StatusEffect var58 = (StatusEffect)var15.getEffectType().value();
            this.b.remove(var58.getName().getString(), var15);
         }
      }
   }

   @Override
   public boolean show() {
      if (mc.player == null || mc.world == null) {
         return false;
      } else {
         return !(mc.currentScreen instanceof ChatScreen) && !(mc.currentScreen instanceof cO) ? !mc.player.getStatusEffects().isEmpty() : true;
      }
   }
}
