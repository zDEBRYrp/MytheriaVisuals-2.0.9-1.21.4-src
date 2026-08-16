package a;
import a.b;
import a.uc.bZ;
import a.uc.eF;
import a.uc.bY;
import a.uc.cC;
import a.uc.bN;
import a.uc.bR;
import a.uc.aQ;
import a.uc.eR;
import a.uc.eW;
import a.uc.fO;
import a.uc.dY;
import a.uc.eP;
import a.uc.cN;
import a.uc.L;
import a.uc.dR;
import a.uc.eY;
import a.uc.cK;
import a.uc.cO;
import a.uc.aZ;
import a.uc.eK;
import a.uc.dZ;
import a.uc.dX;
import a.uc.R;
import a.uc.aS;
import a.uc.cD;
import a.uc.U;
import a.d;
import a.uc.aP;
import a.uc.dS;
import a.uc.aH;
import a.uc.eD;
import a.uc.aW;
import a.uc.dD;
import a.uc.bB;
import a.uc.eO;
import a.uc.cP;
import a.uc.fK;
import a.uc.aB;
import a.uc.cJ;
import a.uc.cX;
import a.uc.eG;
import a.uc.dA;
import a.uc.eI;
import a.uc.aE;
import a.uc.dE;
import a.uc.M;
import a.uc.dW;
import a.h;
import a.j;
import a.uc.Q;
import a.uc.N;
import a.uc.bW;
import a.uc.P;
import a.uc.fJ;
import a.uc.V;
import a.g;
import a.uc.fD;
import a.uc.eX;
import a.uc.Z;
import a.uc.bS;
import a.uc.aO;
import a.uc.cE;
import a.uc.X;
import a.uc.fC;
import a.uc.aT;
import a.uc.dH;
import a.uc.fP;
import a.uc.eM;
import a.uc.cT;
import a.uc.bA;
import a.uc.eS;
import a.uc.cR;
import a.uc.aN;
import a.uc.cI;
import a.uc.cG;
import a.uc.bC;
import a.i;
import a.uc.bE;
import a.uc.aG;
import a.uc.dI;
import a.uc.aK;
import a.uc.aJ;
import a.uc.O;
import a.av;
import a.uc.eH;
import a.uc.eB;
import a.uc.fE;
import a.uc.bK;
import a.uc.cF;
import a.uc.bF;
import a.uc.eN;
import a.uc.bI;
import a.uc.dC;
import a.uc.cU;
import a.uc.aU;
import a.bh;
import a.uc.eA;
import a.uc.bM;
import a.uc.aF;
import a.a;
import a.uc.cL;
import a.uc.fM;
import a.uc.dM;
import a.uc.cA;
import a.uc.bD;
import a.uc.bX;
import a.ch;
import a.uc.bG;
import a.uc.fB;
import a.uc.fA;
import a.uc.dF;
import a.uc.bU;
import a.uc.cY;
import a.uc.aC;
import a.uc.aL;
import a.uc.bQ;
import a.uc.eE;
import a.uc.eT;
import a.k;
import a.cb;
import a.uc.bT;
import a.uc.W;
import a.uc.eL;
import a.uc.bP;
import a.uc.aD;
import a.uc.fI;
import a.uc.T;
import a.uc.dB;
import a.uc.cV;
import a.c;
import a.uc.aY;
import a.uc.dT;
import a.uc.dJ;
import a.uc.fF;
import a.uc.aR;
import a.uc.fG;
import a.uc.dV;
import a.ax;
import a.uc.dG;
import a.e;
import a.uc.dP;
import a.uc.Y;
import a.uc.cM;
import a.uc.eQ;
import a.uc.eV;
import a.uc.cS;
import a.uc.bO;
import a.uc.eC;
import a.uc.fL;
import a.uc.bL;
import a.uc.aI;
import a.uc.cW;
import a.uc.dL;
import a.uc.aM;
import a.uc.eJ;
import a.uc.bV;
import a.f;
import a.uc.cQ;
import a.uc.dQ;
import a.uc.dK;
import a.uc.aA;
import a.uc.eZ;
import a.uc.S;
import a.uc.fH;
import a.uc.dU;
import a.uc.dN;
import a.uc.fN;
import a.uc.cZ;
import a.uc.eU;
import a.uc.bJ;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import nesquik.mytheria.systems.setting.settings.SliderSetting;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

@ModuleInfo(name = "Donate Potions Notify", category = ax.PLAYER)
public class bh extends aJ {
   private final SliderSetting a = new SliderSetting(this, "modules.settings.donate_potions_notify.notify_before")
      .step(1.0F)
      .min(1.0F)
      .max(30.0F)
      .currentValue(5.0F);
   private final ch b = new ch(this, "modules.settings.donate_potions_notify.assassin").enabled(true);
   private final ch c = new ch(this, "modules.settings.donate_potions_notify.paladin").enabled(true);
   private final ch d = new ch(this, "modules.settings.donate_potions_notify.wrath").enabled(true);
   private final ch e = new ch(this, "modules.settings.donate_potions_notify.sleeping").enabled(true);
   private final ch f = new ch(this, "modules.settings.donate_potions_notify.radiation").enabled(true);
   private final ch g = new ch(this, "modules.settings.donate_potions_notify.firecracker").enabled(true);
   private final ch h = new ch(this, "modules.settings.donate_potions_notify.holy_water").enabled(true);
   private final Map<String, Boolean> i = new HashMap<>();
   private final fO j = new fO();
   private final EventListener<W> k = event -> {
      if (mc.player != null && mc.world != null) {
         if (mc.player.age % 10 == 0) {
            int var2 = (int)this.a.getCurrentValue();
            List<String> var3 = this.a();
            long var4 = (long)(this.a.getCurrentValue() * 1000.0F);
            HashSet<String> var6 = new HashSet<>(var3);
            this.i.keySet().removeIf(key -> !var6.contains(key));
            ArrayList<String> var7 = new ArrayList<>();

            for (String var9 : var3) {
               if (this.a(var9)) {
                  int var10 = this.c(var9);
                  if (var10 > 0) {
                     int var11 = var10 / 20;
                     if (var11 <= var2 && !this.i.getOrDefault(var9, false)) {
                        var7.add(var9);
                     } else if (var11 > var2) {
                        this.i.put(var9, false);
                     }
                  }
               }
            }

            if (!var7.isEmpty() && this.j.finished(var4)) {
               StringBuilder var12 = new StringBuilder();
               var12.append(av.translate("modules.donate_potions_notify.expiring")).append(": ");

               for (int var13 = 0; var13 < var7.size(); var13++) {
                  String var14 = (String)var7.get(var13);
                  var12.append(av.translate("modules.donate_potions_notify." + this.b(var14)));
                  if (var13 < var7.size() - 1) {
                     var12.append(", ");
                  }
               }

               new ItemStack(Items.POTION);
               Mytheria.getInstance()
                  .getNotificationManager()
                  .addNotificationOther(cb.INFO, av.translate("modules.donate_potions_notify.title"), var12.toString());

               for (String var16 : var7) {
                  this.i.put(var16, true);
               }

               this.j.reset();
            }
         }
      }
   };

   private boolean a(String potionName) {
      return switch (potionName) {
         case "Зелье Ассасина" -> this.b.isEnabled();
         case "Зелье Палладина" -> this.c.isEnabled();
         case "Зелье Гнева" -> this.d.isEnabled();
         case "Снотворное" -> this.e.isEnabled();
         case "Зелье Радиации" -> this.f.isEnabled();
         case "Хлопушка" -> this.g.isEnabled();
         case "Святая вода" -> this.h.isEnabled();
         default -> false;
      };
   }

   private String b(String potionName) {
      return switch (potionName) {
         case "Зелье Ассасина" -> "assassin";
         case "Зелье Палладина" -> "paladin";
         case "Зелье Гнева" -> "wrath";
         case "Снотворное" -> "sleeping";
         case "Зелье Радиации" -> "radiation";
         case "Хлопушка" -> "firecracker";
         case "Святая вода" -> "holy_water";
         default -> "unknown";
      };
   }

   private int c(String potionName) {
      if (mc.player == null) {
         return 0;
      }

      Set var2 = this.d(potionName);
      int var3 = Integer.MAX_VALUE;

      for (StatusEffectInstance var5 : mc.player.getStatusEffects()) {
         StatusEffect var6 = (StatusEffect)var5.getEffectType().value();
         String var7 = var6.getName().getString();
         if (var2.contains(var7) && !var5.isInfinite() && var5.getDuration() < 999999999) {
            var3 = Math.min(var3, var5.getDuration());
         }
      }

      return var3 == Integer.MAX_VALUE ? 0 : var3;
   }

   private List<String> a() {
      if (mc.player == null) {
         return new ArrayList<>();
      }

      Collection<StatusEffectInstance> var1 = mc.player.getStatusEffects();
      HashMap<String, Integer> var2 = new HashMap<>();

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

   private Set<String> d(String donatePotionName) {
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
}
