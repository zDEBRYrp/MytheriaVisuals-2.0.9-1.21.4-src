package nesquik.mytheria.mixin.minecraft.entity;

import a.uc.C;
import a.uc.N;
import a.uc.fE;
import nesquik.mytheria.Mytheria;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {
   @Inject(method = "attack(Lnet/minecraft/entity/Entity;)V", at = @At("HEAD"), cancellable = true, remap = false)
   private void attackAHook2(Entity target, CallbackInfo ci) {
      PlayerEntity var3 = (PlayerEntity)(Object)this;
      boolean var4 = var3.getVelocity().y < 0.0
         && !var3.isOnGround()
         && !var3.isTouchingWater()
         && !var3.hasStatusEffect(StatusEffects.BLINDNESS)
         && !var3.hasVehicle();
      C var5 = new C(target, var4);
      Mytheria.getInstance().getEventManager().triggerEvent(var5);
      if (var5.isCancelled()) {
         ci.cancel();
      }
   }

   @Inject(method = "attack(Lnet/minecraft/entity/Entity;)V", at = @At("RETURN"), cancellable = true, remap = false)
   private void attackAHook(Entity target, CallbackInfo ci) {
      N var3 = new N(target);
      Mytheria.getInstance().getEventManager().triggerEvent(var3);
   }

   @Inject(method = "isPushedByFluids()Z", at = @At("HEAD"), cancellable = true, remap = false)
   private void removePushFromFluids(CallbackInfoReturnable<Boolean> cir) {
   }

   @Redirect(
      method = "travel(Lnet/minecraft/util/math/Vec3d;)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/PlayerEntity;getRotationVector()Lnet/minecraft/util/math/Vec3d;"),
      remap = false
   )
   private Vec3d redirectGetRotationVectorInTravel(PlayerEntity instance) {
      fE var2 = Mytheria.getInstance().getRotationHandler();
      return var2.isIdling() ? instance.getRotationVector() : var2.getCurrentRotation().getRotationVector();
   }
}
