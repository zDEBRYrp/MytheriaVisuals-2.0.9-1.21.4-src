package nesquik.mytheria.mixin.minecraft.client.network;

import a.uc.M;
import a.uc.Q;
import a.uc.R;
import a.bs;
import a.uc.dY;
import a.em;
import a.uc.fD;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientCommonNetworkHandler;
import net.minecraft.client.network.ClientConnectionState;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.network.packet.s2c.play.GameJoinS2CPacket;
import net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.chunk.WorldChunk;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPlayNetworkHandler.class)
public abstract class ClientPlayNetworkHandlerMixin extends ClientCommonNetworkHandler implements IMinecraft {
   @Unique
   private fD oldRotation = fD.ZERO;

   protected ClientPlayNetworkHandlerMixin(MinecraftClient client, ClientConnection connection, ClientConnectionState connectionState) {
      super(client, connection, connectionState);
   }

   @Inject(
      method = "onItemPickupAnimation(Lnet/minecraft/network/packet/s2c/play/ItemPickupAnimationS2CPacket;)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/world/ClientWorld;getEntityById(I)Lnet/minecraft/entity/Entity;", ordinal = 0)
   )
   private void onItemPickupAnimation(ItemPickupAnimationS2CPacket packet, CallbackInfo info) {
      if (dY.isInitialized()) {
         Entity var3 = this.client.world.getEntityById(packet.getEntityId());
         Entity var4 = this.client.world.getEntityById(packet.getCollectorEntityId());
         if (var3 instanceof ItemEntity && var4 == this.client.player) {
            Mytheria.getInstance().getEventManager().triggerEvent(new M(((ItemEntity)var3).getStack(), packet.getStackAmount()));
         }
      }
   }

   @Inject(method = "onBlockEntityUpdate(Lnet/minecraft/network/packet/s2c/play/BlockEntityUpdateS2CPacket;)V", at = @At("TAIL"))
   private void onBlockEntityUpdate(BlockEntityUpdateS2CPacket packet, CallbackInfo ci) {
      if (mc.world != null) {
         BlockPos var3 = packet.getPos();
         BlockEntity var4 = mc.world.getBlockEntity(var3);
         if (var4 != null && !em.blockEntities.contains(var4)) {
            em.blockEntities.add(var4);
         }
      }
   }

   @Inject(method = "onChunkData(Lnet/minecraft/network/packet/s2c/play/ChunkDataS2CPacket;)V", at = @At("TAIL"))
   private void onChunkData(ChunkDataS2CPacket packet, CallbackInfo ci) {
      if (mc.world != null) {
         WorldChunk var3 = mc.world.getChunk(packet.getChunkX(), packet.getChunkZ());
         var3.getBlockEntities().values().forEach(be -> {
            if (!em.blockEntities.contains(be)) {
               em.blockEntities.add(be);
            }
         });
      }
   }

   @Inject(method = "onGameJoin(Lnet/minecraft/network/packet/s2c/play/GameJoinS2CPacket;)V", at = @At("TAIL"))
   private void onGameJoin(GameJoinS2CPacket packet, CallbackInfo ci) {
      em.blockEntities.clear();
      if (dY.isInitialized()) {
         Mytheria.getInstance().getEventManager().triggerEvent(new R());
      }
   }

   @Inject(method = "onPlayerPositionLook(Lnet/minecraft/network/packet/s2c/play/PlayerPositionLookS2CPacket;)V", at = @At("HEAD"))
   public void savePlayerRotation(PlayerPositionLookS2CPacket packet, CallbackInfo ci) {
      if (mc.player != null) {
         this.oldRotation = new fD(mc.player.getYaw(), mc.player.getPitch());
      }
   }

   @Inject(method = "onPlayerPositionLook(Lnet/minecraft/network/packet/s2c/play/PlayerPositionLookS2CPacket;)V", at = @At("RETURN"))
   public void modifyPlayerRotation(PlayerPositionLookS2CPacket packet, CallbackInfo ci) {
      if (mc.player != null) {
         new fD(packet.change().yaw(), packet.change().pitch());
      }
   }

   @Inject(method = "onEntityStatusEffect(Lnet/minecraft/network/packet/s2c/play/EntityStatusEffectS2CPacket;)V", at = @At("HEAD"), cancellable = true)
   public void onEntityStatusEffect(EntityStatusEffectS2CPacket packet, CallbackInfo ci) {
      if (dY.isInitialized()) {
         if (mc.player != null && mc.world != null) {
            if (packet.getEntityId() == mc.player.getId()) {
               ;
            }
         }
      }
   }

   @Inject(method = "onEntityStatus(Lnet/minecraft/network/packet/s2c/play/EntityStatusS2CPacket;)V", at = @At("HEAD"))
   public void onEntityStatus(EntityStatusS2CPacket packet, CallbackInfo ci) {
      if (dY.isInitialized()) {
         if (mc.world != null) {
            if (packet.getStatus() == 35 && packet.getEntity(mc.world) instanceof PlayerEntity var4) {
               ItemStack var5 = var4.getMainHandStack();
               ItemStack var6 = var4.getOffHandStack();
               ItemStack var7 = null;
               if (var5.getItem() == Items.TOTEM_OF_UNDYING) {
                  var7 = var5;
               } else if (var6.getItem() == Items.TOTEM_OF_UNDYING) {
                  var7 = var6;
               }

               if (var7 != null) {
                  boolean var8 = var7.hasEnchantments();
                  Mytheria.getInstance().getEventManager().triggerEvent(new Q(var4, var7, var8));
               }
            }
         }
      }
   }

   @Inject(method = "sendChatCommand(Ljava/lang/String;)V", at = @At("HEAD"), cancellable = true)
   private void onSendChatCommand(String command, CallbackInfo ci) {
      if (dY.isInitialized()) {
         bs var3 = Mytheria.getInstance().getModuleManager().getModuleSafe(bs.class);
         if (var3 != null && var3.isEnabled() && var3.shouldBlockHubCommand(command)) {
            ci.cancel();
         }
      }
   }
}
