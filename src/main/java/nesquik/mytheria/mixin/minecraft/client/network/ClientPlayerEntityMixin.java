package nesquik.mytheria.mixin.minecraft.client.network;

import a.uc.E;
import a.uc.V;
import a.uc.W;
import a.uc.Y;
import a.bk;
import a.bm;
import a.uc.dY;
import a.uc.fE;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import nesquik.mytheria.utility.mixins.ClientPlayerEntityAddition;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientPlayerEntity.class)
public class ClientPlayerEntityMixin implements IMinecraft, ClientPlayerEntityAddition {
   @Unique
   private int groundTicks = 0;

   @Redirect(method = "tickMovement()V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/network/ClientPlayerEntity;isUsingItem()Z"), require = 0)
   private boolean onIsUsingItemRedirect(ClientPlayerEntity player) {
      if (!dY.isInitialized()) {
         return player.isUsingItem() && player.getVehicle() == null;
      }

      Y var2 = new Y();
      Mytheria.getInstance().getEventManager().triggerEvent(var2);
      return player.isUsingItem() && player.getVehicle() == null && !var2.isCancelled();
   }

   @WrapWithCondition(method = "closeScreen()V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/MinecraftClient;setScreen(Lnet/minecraft/client/gui/screen/Screen;)V"))
   private boolean preventCloseScreen(MinecraftClient instance, Screen screen) {
      if (dY.isInitialized()) {
         Mytheria.getInstance().getEventManager().triggerEvent(new E(screen));
      }

      return true;
   }

   @Inject(method = "pushOutOfBlocks(DD)V", at = @At("HEAD"), cancellable = true)
   public void removePushOutFromBlocks(double x, double z, CallbackInfo ci) {
   }

   @Inject(method = "tick()V", at = @At("HEAD"))
   public void triggerTickEvent(CallbackInfo ci) {
      if (dY.isInitialized()) {
         Mytheria.getInstance().getEventManager().triggerEvent(new W());
         bk var2 = Mytheria.getInstance().getModuleManager().getModule(bk.class);
         if (var2 != null && var2.isEnabled() && mc.player != null) {
         }
      }
   }

   @Inject(method = "tick()V", at = @At("RETURN"))
   public void triggerTickEndEvent(CallbackInfo ci) {
      if (dY.isInitialized()) {
         Mytheria.getInstance().getEventManager().triggerEvent(new V());
      }
   }

   @Inject(method = "tickMovement()V", at = @At("HEAD"))
   public void updateOnGroundTicks(CallbackInfo ci) {
      if (mc.player != null && mc.player.isOnGround()) {
         this.groundTicks++;
      } else {
         this.groundTicks = 0;
      }
   }

   @Redirect(method = "sendMovementPackets()V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/network/ClientPlayerEntity;getYaw()F"))
   public float replaceMovePacketYaw(ClientPlayerEntity instance) {
      if (!dY.isInitialized()) {
         return instance.getYaw();
      }

      fE var2 = Mytheria.getInstance().getRotationHandler();
      float var3 = var2.isIdling() ? instance.getYaw() : var2.getCurrentRotation().getYaw();
      var2.getServerRotation().setYaw(var3);
      return var3;
   }

   @Redirect(method = "sendMovementPackets()V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/network/ClientPlayerEntity;getPitch()F"))
   public float replaceMovePacketPitch(ClientPlayerEntity instance) {
      if (!dY.isInitialized()) {
         return instance.getPitch();
      }

      fE var2 = Mytheria.getInstance().getRotationHandler();
      float var3 = var2.isIdling() ? instance.getPitch() : var2.getCurrentRotation().getPitch();
      var2.getServerRotation().setYaw(var3);
      return var3;
   }

   @Inject(method = "dropSelectedItem(Z)Z", at = @At("HEAD"), cancellable = true)
   private void onDropSelectedItem(boolean entireStack, CallbackInfoReturnable<Boolean> cir) {
      if (dY.isInitialized()) {
         bm var3 = Mytheria.getInstance().getModuleManager().getModuleSafe(bm.class);
         if (var3 != null && var3.isEnabled() && var3.getSlotLock().isSelected() && var3.isLocked(mc.player.getInventory().selectedSlot)) {
            cir.setReturnValue(false);
            cir.cancel();
         }
      }
   }

   @Override
   public int Mytheria$getOnGroundTicks() {
      return this.groundTicks;
   }
}
