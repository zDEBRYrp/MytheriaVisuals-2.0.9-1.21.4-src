package nesquik.mytheria.mixin.minecraft.client.render;

import a.uc.bQ;
import nesquik.mytheria.Mytheria;
import net.minecraft.client.render.Fog;
import net.minecraft.client.render.FrameGraphBuilder;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WorldRenderer.class)
public abstract class WeatherRendererMixin {
   @Inject(method = "renderWeather(Lnet/minecraft/client/render/FrameGraphBuilder;Lnet/minecraft/util/math/Vec3d;FLnet/minecraft/client/render/Fog;)V", at = @At("HEAD"), cancellable = true)
   private void onRenderWeather(FrameGraphBuilder frameGraphBuilder, Vec3d pos, float tickDelta, Fog fog, CallbackInfo ci) {
      bQ var6 = Mytheria.getInstance().getModuleManager().getModule(bQ.class);
      if (var6.isEnabled() && var6.getWeather().isSelected()) {
         ci.cancel();
      }
   }
}
