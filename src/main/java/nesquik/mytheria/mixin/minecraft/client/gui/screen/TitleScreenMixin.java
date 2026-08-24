package nesquik.mytheria.mixin.minecraft.client.gui.screen;

import a.ds;
import a.uc.bN;
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
            bN menu = Mytheria.getInstance().getModuleManager().getModuleSafe(bN.class);
            if (menu != null && !menu.isCustomMainMenuEnabled()) return;
         } catch (Exception ignored) {}
         ci.cancel();
         MinecraftClient.getInstance().setScreen(new ds());
      }
   }
}
