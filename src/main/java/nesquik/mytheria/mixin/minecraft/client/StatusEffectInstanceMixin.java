package nesquik.mytheria.mixin.minecraft.client;

import a.uc.cA;
import a.uc.dZ;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.utility.animation.base.Easing;
import nesquik.mytheria.utility.mixins.StatusEffectInstanceAddition;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.registry.entry.RegistryEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(StatusEffectInstance.class)
public class StatusEffectInstanceMixin implements StatusEffectInstanceAddition {
   @Unique
   private final dZ potionStatusAnimation = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
   @Unique
   private cA timeAnimation;

   @Inject(method = "<init>(Lnet/minecraft/registry/entry/RegistryEntry;IIZZZLnet/minecraft/entity/effect/StatusEffectInstance;)V", at = @At("TAIL"))
   public void onInit(
      RegistryEntry<?> effect,
      int duration,
      int amplifier,
      boolean ambient,
      boolean showParticles,
      boolean showIcon,
      StatusEffectInstance hiddenEffect,
      CallbackInfo ci
   ) {
      if (MinecraftClient.getInstance() != null && MinecraftClient.getInstance().player != null) {
         this.timeAnimation = new cA(Fonts.REGULAR.getFont(7.0F), 3.0F, 300L, Easing.FIGMA_EASE_IN_OUT);
      }
   }

   @Override
   public dZ Mytheria$getAnimPotion() {
      return this.potionStatusAnimation;
   }

   @Override
   public cA Mytheria$getTimeAnimation() {
      return this.timeAnimation;
   }
}
