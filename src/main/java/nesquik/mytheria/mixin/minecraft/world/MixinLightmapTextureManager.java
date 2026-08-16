package nesquik.mytheria.mixin.minecraft.world;

import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.render.LightmapTextureManager;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LightmapTextureManager.class)
public abstract class MixinLightmapTextureManager {
   @Shadow
   @Final
   private SimpleFramebuffer lightmapFramebuffer;

   @Shadow
   protected abstract float getDarknessFactor(float var1);

   @Inject(method = "update(F)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gl/SimpleFramebuffer;endWrite()V", shift = Shift.BEFORE))
   private void onUpdate(CallbackInfo info) {
   }

   @Redirect(method = "update(F)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/LightmapTextureManager;getDarknessFactor(F)F"))
   private float redirectGetDarknessFactor(LightmapTextureManager instance, float delta) {
      return this.getDarknessFactor(delta);
   }
}
