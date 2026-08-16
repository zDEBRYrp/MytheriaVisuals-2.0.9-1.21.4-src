package nesquik.mytheria.mixin.minecraft.entity;

import a.uc.J;
import a.uc.fD;
import a.uc.fE;
import a.uc.fH;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(FireworkRocketEntity.class)
public abstract class FireworkRocketEntityMixin implements IMinecraft {
   @Redirect(method = "tick()V", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;setVelocity(Lnet/minecraft/util/math/Vec3d;)V"))
   private void redirectSetVelocity(LivingEntity shooter, Vec3d velocity) {
      FireworkRocketEntity var3 = (FireworkRocketEntity)(Object)this;
      J var4 = new J(shooter, velocity, var3);
      Mytheria.getInstance().getEventManager().triggerEvent(var4);
      shooter.setVelocity(var4.getVelocity());
   }

   @Redirect(method = "tick()V", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;getRotationVector()Lnet/minecraft/util/math/Vec3d;"))
   private Vec3d redirectGetRotationVector(LivingEntity instance) {
      if (instance == mc.player) {
         fE var2 = Mytheria.getInstance().getRotationHandler();
         if (var2 != null && var2.getState() != fH.IDLE) {
            fD var3 = var2.getCurrentRotation();
            return Vec3d.fromPolar(var3.getPitch(), var3.getYaw());
         }
      }

      return instance.getRotationVector();
   }
}
