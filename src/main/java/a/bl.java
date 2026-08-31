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
import a.uc.J;
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
import a.uc.aV;
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
import a.uc.bH;
import a.uc.eA;
import a.uc.bM;
import a.af;
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
import a.uc.K;
import a.uc.cB;
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
import a.bl;
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

import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import nesquik.mytheria.systems.setting.settings.SliderSetting;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.MathHelper;

@ModuleInfo(name = "Healing Helper", category = ax.PLAYER, desc = "Подсказывает, что лучше съесть или выпить")
public class bl extends aJ {
   private final ch enchantedAppleSetting = new ch(this, "Чарка").enabled(true);
   private final SliderSetting b = new SliderSetting(this, "Порог для чарки").min(1.0F).max(20.0F).step(0.5F).currentValue(12.0F).suffix(" HP");
   private final ch c = new ch(this, "Золотое яблоко").enabled(true);
   private final SliderSetting d = new SliderSetting(this, "Порог для гаппла").min(1.0F).max(20.0F).step(0.5F).currentValue(14.0F).suffix(" HP");
   private final ch e = new ch(this, "Исцеление").enabled(true);
   private final SliderSetting f = new SliderSetting(this, "Порог для хилки").min(1.0F).max(20.0F).step(0.5F).currentValue(10.0F).suffix(" HP");
   private final ch g = new ch(this, "Золотая морковь").enabled(true);
   private final SliderSetting h = new SliderSetting(this, "Сытость для морковки").min(0.0F).max(20.0F).step(1.0F).currentValue(18.0F).suffix(" \ud83c\udf56");
   private final EventListener<af> i = event -> {
      if (mc.player != null && mc.world != null) {
         this.renderHotbarHighlights(event.getContext());
      }
   };

   /** Подсвечивает на хотбаре лучший предмет для лечения */
   public void renderHotbarHighlights(DrawContext context) {
      if (mc.player != null) {
         bl.a var2 = this.a();
         if (var2 != null) {
            for (int var3 = 0; var3 < 9; var3++) {
               ItemStack var4 = mc.player.getInventory().getStack(var3);
               if (!var4.isEmpty()) {
                  boolean var5 = var2 == bl.a.HEALING_POTION ? this.b(var4) : var2.a(var4);
                  if (var5 && this.a(var4)) {
                     int var6 = mc.getWindow().getScaledWidth();
                     int var7 = mc.getWindow().getScaledHeight();
                     int var8 = var6 / 2 - 90 + var3 * 20 + 2;
                     int var9 = var7 - 16 - 3;
                     float var10 = this.c();
                     int var11 = this.a(65280, var10);
                     context.fill(var8 - 1, var9 - 1, var8 + 17, var9 + 17, var11);
                  }
               }
            }
         }
      }
   }

   /** Определяет оптимальный тип лечения на основе здоровья и сытости */
   private bl.a a() {
      if (mc.player == null) {
         return null;
      } else {
         float var1 = mc.player.getHealth();
         int var2 = mc.player.getHungerManager().getFoodLevel();
         if (this.enchantedAppleSetting.isEnabled() && var1 <= this.b.getCurrentValue() && this.a(Items.ENCHANTED_GOLDEN_APPLE)) {
            return bl.a.ENCHANTED_APPLE;
         } else if (this.c.isEnabled() && var1 <= this.d.getCurrentValue() && this.a(Items.GOLDEN_APPLE)) {
            return bl.a.GOLDEN_APPLE;
         } else if (this.e.isEnabled() && var1 <= this.f.getCurrentValue() && this.b()) {
            return bl.a.HEALING_POTION;
         } else {
            return this.g.isEnabled() && var2 <= this.h.getCurrentValue() && this.a(Items.GOLDEN_CARROT) ? bl.a.GOLDEN_CARROT : null;
         }
      }
   }

   private boolean a(Item item) {
      if (mc.player == null) {
         return false;
      }

      for (int var2 = 0; var2 < 9; var2++) {
         ItemStack var3 = mc.player.getInventory().getStack(var2);
         if (!var3.isEmpty() && var3.getItem() == item && this.a(var3)) {
            return true;
         }
      }

      return false;
   }

   private boolean b() {
      if (mc.player == null) {
         return false;
      }

      for (int var1 = 0; var1 < 9; var1++) {
         ItemStack var2 = mc.player.getInventory().getStack(var1);
         if (!var2.isEmpty() && this.b(var2) && this.a(var2)) {
            return true;
         }
      }

      return false;
   }

   private boolean a(ItemStack stack) {
      return mc.player != null && stack != null && !stack.isEmpty() && mc.player.getItemCooldownManager().getCooldownProgress(stack, 0.0F) <= 0.0F;
   }

   private boolean b(ItemStack stack) {
      Item var2 = stack.getItem();
      if (var2 != Items.POTION && var2 != Items.SPLASH_POTION && var2 != Items.LINGERING_POTION) {
         return false;
      }

      PotionContentsComponent var3 = (PotionContentsComponent)stack.get(DataComponentTypes.POTION_CONTENTS);
      if (var3 == null) {
         return false;
      }

      for (StatusEffectInstance var5 : var3.getEffects()) {
         if (var5.getEffectType() == StatusEffects.INSTANT_HEALTH) {
            return true;
         }
      }

      return false;
   }

   private float c() {
      float var1 = (float)(System.currentTimeMillis() / 1000.0 * 6.0 * Math.PI * 2.0);
      float var2 = 0.5F + 0.5F * MathHelper.sin(var1);
      return 0.2F + 0.5F * var2;
   }

   private int a(int color, float alpha) {
      float var3 = MathHelper.clamp(alpha, 0.0F, 1.0F);
      int var4 = Math.round(255.0F * var3);
      return var4 << 24 | color & 16777215;
   }

   enum a {
      ENCHANTED_APPLE,
      GOLDEN_APPLE,
      HEALING_POTION,
      GOLDEN_CARROT;

      /** Проверяет, соответствует ли предмет данному типу лечения */
      boolean a(ItemStack stack) {
         Item var2 = stack.getItem();

         return switch (this) {
            case ENCHANTED_APPLE -> var2 == Items.ENCHANTED_GOLDEN_APPLE;
            case GOLDEN_APPLE -> var2 == Items.GOLDEN_APPLE;
            case HEALING_POTION -> false;
            case GOLDEN_CARROT -> var2 == Items.GOLDEN_CARROT;
         };
      }
   }
}
