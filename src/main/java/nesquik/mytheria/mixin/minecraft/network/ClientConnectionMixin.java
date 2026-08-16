package nesquik.mytheria.mixin.minecraft.network;

import a.uc.S;
import a.uc.T;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.listener.PacketListener;
import net.minecraft.network.packet.Packet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientConnection.class)
public class ClientConnectionMixin implements IMinecraft {
   @Unique
   private static boolean stackOverflowFix;

   @Inject(method = "handlePacket(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/listener/PacketListener;)V", at = @At("HEAD"), cancellable = true)
   private static <T extends PacketListener> void triggerReceivePacketEvent(Packet<T> packet, PacketListener listener, CallbackInfo ci) {
      S var3 = new S(packet);
      Mytheria.getInstance().getEventManager().triggerEvent(var3);
      if (var3.isCancelled()) {
         ci.cancel();
      }
   }

   @Inject(method = "send(Lnet/minecraft/network/packet/Packet;)V", at = @At("HEAD"), cancellable = true)
   public void triggerSendPacketEvent(Packet<?> packet, CallbackInfo ci) {
      T var3 = new T(packet);
      if (!stackOverflowFix) {
         Mytheria.getInstance().getEventManager().triggerEvent(var3);
         if (var3.isCancelled()) {
            ci.cancel();
         }

         Packet var4 = var3.getPacket();
         if (var4 != packet) {
            ci.cancel();
            stackOverflowFix = true;
            mc.getNetworkHandler().sendPacket(var4);
            stackOverflowFix = false;
         }
      }
   }
}
