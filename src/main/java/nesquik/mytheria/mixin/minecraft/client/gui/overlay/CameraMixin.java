package nesquik.mytheria.mixin.minecraft.client.gui.overlay;

import a.aw;
import a.uc.bQ;
import a.bk;
import a.by;
import a.uc.dY;
import net.minecraft.block.enums.CameraSubmersionType;
import net.minecraft.client.render.Camera;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(Camera.class)
public abstract class CameraMixin {
   @Shadow
   protected abstract float clipToSpace(float var1);

   @Inject(method = "getSubmersionType()Lnet/minecraft/block/enums/CameraSubmersionType;", at = @At("HEAD"), cancellable = true)
   private void getSubmergedFluidState(CallbackInfoReturnable<CameraSubmersionType> ci) {
      aw var2 = dY.getModuleManager();
      if (var2 != null) {
         bQ var3 = var2.getModule(bQ.class);
         if (var3 != null && var3.isEnabled() && var3.getWater().isSelected()) {
            ci.setReturnValue(CameraSubmersionType.NONE);
         }
      }
   }

   @ModifyArgs(
      method = "update(Lnet/minecraft/world/BlockView;Lnet/minecraft/entity/Entity;ZZF)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/Camera;setRotation(FF)V")
   )
   private void modifyRotation(Args args) {
      if (bk.isActive) {
         args.set(0, bk.x);
         args.set(1, bk.y);
      }
   }

   @Redirect(
      method = "update(Lnet/minecraft/world/BlockView;Lnet/minecraft/entity/Entity;ZZF)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/Camera;clipToSpace(F)F")
   )
   private float smoothF5CameraOffset(Camera instance, float desiredDistance) {
      float var3 = this.clipToSpace(desiredDistance);
      if (!by.smoothF5Enabled()) {
         return var3;
      }

      float var4 = by.f5Progress();
      if (var4 >= 1.0F) {
         return var3;
      }

      boolean var5 = by.isThirdPerson();
      float var6 = var5 ? 0.35F : 0.0F;
      return var6 + (var3 - var6) * var4;
   }
}
