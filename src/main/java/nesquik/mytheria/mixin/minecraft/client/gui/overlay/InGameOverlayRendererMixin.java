package nesquik.mytheria.mixin.minecraft.client.gui.overlay;

import a.aw;
import a.uc.bQ;
import a.uc.dY;
import net.minecraft.client.gui.hud.InGameOverlayRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameOverlayRenderer.class)
public class InGameOverlayRendererMixin {
   @Inject(method = "renderFireOverlay(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;)V", at = @At("HEAD"), cancellable = true)
   private static void renderFireOverlayHook(MatrixStack matrices, VertexConsumerProvider vertexConsumers, CallbackInfo ci) {
      aw var3 = dY.getModuleManager();
      if (var3 != null) {
         bQ var4 = var3.getModule(bQ.class);
         if (var4 != null && var4.isEnabled() && var4.getFire().isSelected()) {
            ci.cancel();
         }
      }
   }
}
