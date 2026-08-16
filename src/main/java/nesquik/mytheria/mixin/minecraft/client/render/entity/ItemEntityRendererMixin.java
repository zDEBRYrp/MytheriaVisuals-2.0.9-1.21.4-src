package nesquik.mytheria.mixin.minecraft.client.render.entity;

import a.uc.bK;
import nesquik.mytheria.Mytheria;
import net.minecraft.client.render.entity.ItemEntityRenderer;
import net.minecraft.client.render.entity.state.ItemEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.ItemEntity;
import net.minecraft.util.math.RotationAxis;
import org.joml.Quaternionf;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemEntityRenderer.class)
public abstract class ItemEntityRendererMixin {
   @Unique
   private ItemEntity currentEntity;

   @Inject(method = "updateRenderState(Lnet/minecraft/entity/ItemEntity;Lnet/minecraft/client/render/entity/state/ItemEntityRenderState;F)V", at = @At("HEAD"))
   private void captureEntity(ItemEntity itemEntity, ItemEntityRenderState state, float tickDelta, CallbackInfo ci) {
      this.currentEntity = itemEntity;
   }

   @Redirect(
      method = "render(Lnet/minecraft/client/render/entity/state/ItemEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/math/MatrixStack;translate(FFF)V", ordinal = 0)
   )
   private void redirectTranslate(MatrixStack matrices, float x, float y, float z) {
      bK var5 = Mytheria.getInstance().getModuleManager().getModuleSafe(bK.class);
      if (var5 != null && var5.isEnabled()) {
         matrices.translate(0.0F, 0.0F, 0.0F);
      } else {
         matrices.translate(x, y, z);
      }
   }

   @Redirect(
      method = "render(Lnet/minecraft/client/render/entity/state/ItemEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/math/MatrixStack;multiply(Lorg/joml/Quaternionf;)V")
   )
   private void redirectRotation(MatrixStack matrices, Quaternionf quaternion) {
      bK var3 = Mytheria.getInstance().getModuleManager().getModuleSafe(bK.class);
      if (var3 != null && var3.isEnabled()) {
         boolean var4 = this.currentEntity != null && this.currentEntity.isOnGround();
         if (var4) {
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(90.0F));
         }
      } else {
         matrices.multiply(quaternion);
      }
   }
}
