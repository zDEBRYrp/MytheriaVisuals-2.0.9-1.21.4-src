package nesquik.mytheria.mixin.minecraft.render.item;

import a.uc.aH;
import a.aa;
import a.bx;
import com.mojang.blaze3d.systems.RenderSystem;
import nesquik.mytheria.Mytheria;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ModelTransformationMode;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import org.lwjgl.opengl.GL20;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HeldItemRenderer.class)
public abstract class HeldItemRendererMixin {
   @Shadow
   @Final
   private ItemRenderer itemRenderer;

   @Shadow
   protected abstract void applyEatOrDrinkTransformation(MatrixStack var1, float var2, Arm var3, ItemStack var4, PlayerEntity var5);

   @Shadow
   protected abstract void applyBrushTransformation(MatrixStack var1, float var2, Arm var3, ItemStack var4, PlayerEntity var5, float var6);

   @Inject(
      method = "renderFirstPersonItem(Lnet/minecraft/client/network/AbstractClientPlayerEntity;FFLnet/minecraft/util/Hand;FLnet/minecraft/item/ItemStack;FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V",
      at = @At("HEAD"),
      cancellable = true
   )
   private void onRenderFirstPersonItem(
      AbstractClientPlayerEntity player,
      float tickDelta,
      float pitch,
      Hand hand,
      float swingProgress,
      ItemStack item,
      float equipProgress,
      MatrixStack matrices,
      VertexConsumerProvider vertexConsumers,
      int light,
      CallbackInfo ci
   ) {
      GL20.glUseProgram(0);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      bx.setRenderingHands(true);
      boolean var12 = hand == Hand.MAIN_HAND;
      Arm var13 = var12 ? player.getMainArm() : player.getMainArm().getOpposite();
      boolean var14 = var13 == Arm.RIGHT;
      matrices.push();
      aa var15 = new aa(var13, hand, swingProgress, item, equipProgress, matrices);
      Mytheria.getInstance().getEventManager().triggerEvent(var15);
      aH var16 = var15.getViewModelTransformations();
      if (var16 != null) {
         float var17 = var14 ? 1.0F : -1.0F;
         matrices.translate(var16.translateX() * var17, var16.translateY(), var16.translateZ());
         matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var16.rotateX()));
         matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var16.rotateY()));
         matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(var16.rotateZ()));
      }

      if (var15.isCancelled()) {
         ci.cancel();
         float var22 = -0.4F * MathHelper.sin(MathHelper.sqrt(0.0F) * (float) Math.PI);
         float var18 = 0.2F * MathHelper.sin(MathHelper.sqrt(0.0F) * (float) (Math.PI * 2));
         float var19 = -0.2F * MathHelper.sin(0.0F);
         matrices.translate((var13 == Arm.RIGHT ? 1 : -1) * var22, var18, var19);
         int var20 = var13 == Arm.RIGHT ? 1 : -1;
         matrices.translate(var20 * 0.56F, -0.52F, -0.72F);
         if (!item.isEmpty()) {
            HeldItemRenderer var21 = (HeldItemRenderer)(Object)this;
            var21.renderItem(
               player, item, var14 ? ModelTransformationMode.FIRST_PERSON_RIGHT_HAND : ModelTransformationMode.FIRST_PERSON_LEFT_HAND, !var14, matrices, vertexConsumers, light
            );
         }

         matrices.pop();
      }
   }

   @Inject(
      method = "renderFirstPersonItem(Lnet/minecraft/client/network/AbstractClientPlayerEntity;FFLnet/minecraft/util/Hand;FLnet/minecraft/item/ItemStack;FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V",
      at = @At("RETURN")
   )
   private void afterRenderFirstPersonItem(
      AbstractClientPlayerEntity player,
      float tickDelta,
      float pitch,
      Hand hand,
      float swingProgress,
      ItemStack item,
      float equipProgress,
      MatrixStack matrices,
      VertexConsumerProvider vertexConsumers,
      int light,
      CallbackInfo ci
   ) {
      matrices.pop();
      bx.setRenderingHands(false);
   }
}
