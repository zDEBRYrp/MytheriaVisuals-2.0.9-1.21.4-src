package nesquik.mytheria.mixin.minecraft.client;

import a.bw;
import nesquik.mytheria.Mytheria;
import net.minecraft.client.render.DimensionEffects;
import net.minecraft.client.render.DimensionEffects.End;
import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientWorld.class)
public class ClientWorldMixin {
   @Unique
   private final DimensionEffects endSky = new End();

   @Inject(method = "getDimensionEffects()Lnet/minecraft/client/render/DimensionEffects;", at = @At("HEAD"), cancellable = true)
   private void onGetSkyProperties(CallbackInfoReturnable<DimensionEffects> info) {
      if (Mytheria.getInstance().getModuleManager().getModule(bw.class).isEnabled()
         && Mytheria.getInstance().getModuleManager().getModule(bw.class).getEndSky().isEnabled()) {
         info.setReturnValue(this.endSky);
      }
   }
}
