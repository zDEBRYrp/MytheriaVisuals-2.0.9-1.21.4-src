package nesquik.mytheria.mixin.minecraft.entity;

import a.uc.G;
import a.uc.H;
import a.uc.bR;
import a.uc.fC;
import a.uc.fE;
import a.uc.fI;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import nesquik.mytheria.Mytheria;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity.RemovalReason;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.TridentItem;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {
   @Shadow
   private int jumpingCooldown;

   @Shadow
   public abstract void remove(RemovalReason var1);

   @Shadow
   public abstract ItemStack getMainHandStack();

   @Shadow
   public abstract ItemStack getOffHandStack();

   @Shadow
   public abstract boolean isUsingItem();

   @Inject(method = "addStatusEffect(Lnet/minecraft/entity/effect/StatusEffectInstance;Lnet/minecraft/entity/Entity;)Z", at = @At("HEAD"), cancellable = true)
   private void blockDarknessEffect(StatusEffectInstance effect, Entity source, CallbackInfoReturnable<Boolean> cir) {
      if (StatusEffects.DARKNESS.equals(effect.getEffectType())) {
         LivingEntity var4 = (LivingEntity)(Object)this;
         if (var4 == MinecraftClient.getInstance().player) {
            ;
         }
      }
   }

   @ModifyReturnValue(method = "getHandSwingDuration()I", at = @At("RETURN"))
   public int replaceSwingSpeed(int original) {
      LivingEntity var2 = (LivingEntity)(Object)this;
      if (var2 != MinecraftClient.getInstance().player) {
         return original;
      }

      try {
         bR var3 = Mytheria.getInstance().getModuleManager().getModuleSafe(bR.class);
         if (var3 != null && var3.isEnabled()) {
            ItemStack var4 = this.getMainHandStack();
            if (var4.isEmpty()) {
               return original;
            }

            Item var5 = var4.getItem();
            boolean var6 = var5 instanceof SwordItem || var5 instanceof AxeItem || var5 instanceof TridentItem;
            if (!var6) {
               return original;
            }

            float var7 = Mytheria.getInstance().getSwingManager().getSpeed().getCurrentValue();
            float var8;
            if (var7 <= 1.0F) {
               var8 = 3.0F;
            } else if (var7 <= 2.0F) {
               var8 = 2.0F;
            } else if (var7 <= 3.0F) {
               var8 = 1.5F;
            } else if (var7 <= 4.0F) {
               var8 = 1.2F;
            } else {
               var8 = 1.0F;
            }

            return Math.max(1, (int)(original * var8));
         }
      } catch (Exception var9) {
      }

      return original;
   }

   @Inject(method = "jump()V", at = @At("HEAD"), cancellable = true, remap = false)
   public void triggerJumpEvent(CallbackInfo ci) {
      LivingEntity var2 = (LivingEntity)(Object)this;
      H var3 = new H(var2);
      Mytheria.getInstance().getEventManager().triggerEvent(var3);
      if (var3.isCancelled()) {
         ci.cancel();
      }
   }

   @ModifyExpressionValue(method = "jump()V", at = @At(value = "NEW", target = "(DDD)Lnet/minecraft/util/math/Vec3d;"))
   public Vec3d movementCorrection(Vec3d original) {
      fE var2 = Mytheria.INSTANCE.getRotationHandler();
      fI var3 = var2.getCurrentTask();
      if ((Object)this != MinecraftClient.getInstance().player) {
         return original;
      } else if (var3 != null && var3.getMoveCorrection() != fC.NONE) {
         float var4 = var2.getCurrentRotation().getYaw() * (float) (Math.PI / 180.0);
         return new Vec3d(-MathHelper.sin(var4) * 0.2F, 0.0, MathHelper.cos(var4) * 0.2F);
      } else {
         return original;
      }
   }

   @Inject(method = "onDeath(Lnet/minecraft/entity/damage/DamageSource;)V", at = @At("TAIL"), remap = false)
   public void triggerEntityDeathEvent(DamageSource damageSource, CallbackInfo ci) {
      LivingEntity var3 = (LivingEntity)(Object)this;
      Mytheria.getInstance().getEventManager().triggerEvent(new G(var3, damageSource));
   }

   @Inject(method = "tick()V", at = @At("HEAD"))
   private void preventItemInterruptionInTick(CallbackInfo ci) {
   }

   @Redirect(
      method = "calcGlidingVelocity(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;getPitch()F")
   )
   private float redirectGetPitch(LivingEntity instance) {
      fE var2 = Mytheria.getInstance().getRotationHandler();
      return var2.isIdling() ? instance.getPitch() : var2.getCurrentRotation().getPitch();
   }

   @Redirect(
      method = "calcGlidingVelocity(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;getRotationVector()Lnet/minecraft/util/math/Vec3d;")
   )
   private Vec3d redirectGetRotationVector(LivingEntity instance) {
      fE var2 = Mytheria.getInstance().getRotationHandler();
      return var2.isIdling() ? instance.getRotationVector() : var2.getCurrentRotation().getRotationVector();
   }
}
