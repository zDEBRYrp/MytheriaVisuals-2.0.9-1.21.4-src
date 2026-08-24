package nesquik.mytheria.mixin.minecraft.client.gui.screen;

import a.ar;
import a.ds;
import nesquik.mytheria.Mytheria;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {
   @Inject(method = "init()V", at = @At("HEAD"), cancellable = true)
   public void setCustomScreen(CallbackInfo ci) {
      if (!Mytheria.INSTANCE.isPanic()) {
         try {
            java.io.File f = new java.io.File(ar.DIRECTORY, "disable_custom_menu");
            if (f.exists()) return;
         } catch (Exception ignored) {}
         ci.cancel();
         MinecraftClient.getInstance().setScreen(new ds());
      }
   }
}
