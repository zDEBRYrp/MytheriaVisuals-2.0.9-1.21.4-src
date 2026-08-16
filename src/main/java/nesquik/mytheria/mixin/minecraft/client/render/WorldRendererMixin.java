package nesquik.mytheria.mixin.minecraft.client.render;

import a.ae;
import a.fn;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.util.ObjectAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.profiler.Profilers;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WorldRenderer.class)
public class WorldRendererMixin implements IMinecraft {
   private static int frameCounter = 0;
   private static int lastEventFrame = -1;

   @Inject(
      method = "render(Lnet/minecraft/client/util/ObjectAllocator;Lnet/minecraft/client/render/RenderTickCounter;ZLnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/GameRenderer;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;)V",
      at = @At("RETURN")
   )
   private void render(
      ObjectAllocator allocator,
      RenderTickCounter tickCounter,
      boolean renderBlockOutline,
      Camera camera,
      GameRenderer gameRenderer,
      Matrix4f positionMatrix,
      Matrix4f projectionMatrix,
      CallbackInfo ci
   ) {
      frameCounter++;
      if (lastEventFrame != frameCounter) {
         lastEventFrame = frameCounter;
         fn.onRender(positionMatrix, projectionMatrix);
         Profilers.get().swap(Mytheria.MOD_ID + "_renderWorld");
         MatrixStack var9 = new MatrixStack();
         var9.multiplyPositionMatrix(positionMatrix);
         Mytheria.getInstance().getEventManager().triggerEvent(new ae(var9, positionMatrix, projectionMatrix, camera, tickCounter.getTickDelta(false)));
      }
   }
}
