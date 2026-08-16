package nesquik.mytheria.mixin.minecraft.network;

import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.packet.s2c.play.EntityS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPlayNetworkHandler.class)
public class ClientPlayNetworkHandlerMixin {
   @Inject(method = "onEntity(Lnet/minecraft/network/packet/s2c/play/EntityS2CPacket;)V", at = @At("TAIL"), remap = false)
   public void onEntity(EntityS2CPacket packet, CallbackInfo ci) {
   }
}
