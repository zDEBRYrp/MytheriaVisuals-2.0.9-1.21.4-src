package nesquik.mytheria.mixin.minecraft.client.gui.overlay;

import a.aw;
import a.uc.bC;
import a.uc.dY;
import a.eb;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Fog;
import net.minecraft.client.render.FogShape;
import net.minecraft.client.render.BackgroundRenderer.FogType;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(BackgroundRenderer.class)
public class BackgroundRendererMixin {
   @ModifyReturnValue(
      method = "applyFog(Lnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/BackgroundRenderer$FogType;Lorg/joml/Vector4f;FZF)Lnet/minecraft/client/render/Fog;",
      at = @At("RETURN")
   )
   private static Fog modifyFogProperties(
      Fog original, @Local(argsOnly = true) Camera camera, @Local(argsOnly = true) FogType fogType, @Local(argsOnly = true, ordinal = 0) float viewDistance
   ) {
      aw var4 = dY.getModuleManager();
      if (var4 == null) {
         return original;
      } else {
         bC var5 = var4.getModule(bC.class);
         if (var5 != null && var5.shouldModifyFog(camera) && fogType == FogType.FOG_TERRAIN) {
            float var6 = MathHelper.clamp(var5.getDistance().getFirstValue(), -8.0F, viewDistance);
            float var7 = MathHelper.clamp(var5.getDistance().getSecondValue(), 0.0F, viewDistance);
            eb var8 = var5.getFogColorValue();
            FogShape var9 = FogShape.SPHERE;
            float var10 = var8.getRed() / 255.0F;
            float var11 = var8.getGreen() / 255.0F;
            float var12 = var8.getBlue() / 255.0F;
            float var13 = var8.getAlpha() / 255.0F;
            return new Fog(var6, var7, var9, var10, var11, var12, var13);
         } else {
            return original;
         }
      }
   }
}
