package nesquik.mytheria.mixin.minecraft.client.gui.screen.multiplayer;

import a.uc.U;
import nesquik.mytheria.Mytheria;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.multiplayer.ConnectScreen;
import net.minecraft.client.network.CookieStorage;
import net.minecraft.client.network.ServerAddress;
import net.minecraft.client.network.ServerInfo;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ConnectScreen.class)
public class ConnectScreenMixin {
   @Inject(method = "connect(Lnet/minecraft/client/MinecraftClient;Lnet/minecraft/client/network/ServerAddress;Lnet/minecraft/client/network/ServerInfo;Lnet/minecraft/client/network/CookieStorage;)V", at = @At("HEAD"))
   private void onNewConnection(MinecraftClient client, ServerAddress address, ServerInfo info, CookieStorage cookieStorage, CallbackInfo ci) {
      Mytheria.getInstance().getEventManager().triggerEvent(new U(address, info, cookieStorage));
   }
}
