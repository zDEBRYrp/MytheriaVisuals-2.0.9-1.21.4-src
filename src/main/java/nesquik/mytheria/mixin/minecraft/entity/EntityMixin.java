package nesquik.mytheria.mixin.minecraft.entity;

import a.uc.fC;
import a.uc.fE;
import a.uc.fI;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Box;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Entity.class)
public class EntityMixin implements IMinecraft {
   @Shadow
   private Box boundingBox;

   @ModifyExpressionValue(
      method = "move(Lnet/minecraft/entity/MovementType;Lnet/minecraft/util/math/Vec3d;)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;isControlledByPlayer()Z")
   )
   public boolean fixFalldistanceValue(boolean original) {
      return (Object)this == mc.player ? false : original;
   }

   @Redirect(method = "updateVelocity(FLnet/minecraft/util/math/Vec3d;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;getYaw()F"))
   public float movementCorrection(Entity instance) {
      fE var2 = Mytheria.INSTANCE.getRotationHandler();
      fI var3 = var2.getCurrentTask();
      return var3 != null && var3.getMoveCorrection() != fC.NONE && instance instanceof ClientPlayerEntity
         ? var2.getCurrentRotation().getYaw()
         : instance.getYaw();
   }
}
