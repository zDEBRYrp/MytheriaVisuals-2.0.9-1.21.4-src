package nesquik.mytheria.mixin.minecraft.client;

import a.by;
import net.minecraft.client.gui.hud.PlayerListHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerListHud.class)
public class BetterMinecraftPlayerListHudMixin {
   @Inject(method = "setVisible(Z)V", at = @At("HEAD"))
   private void onSetVisible(boolean visible, CallbackInfo ci) {
      by.onTabVisible(visible);
   }
}
