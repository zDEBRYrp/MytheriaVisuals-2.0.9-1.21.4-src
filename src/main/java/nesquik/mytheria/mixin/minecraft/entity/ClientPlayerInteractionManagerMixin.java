package nesquik.mytheria.mixin.minecraft.entity;

import a.uc.D;
import a.uc.L;
import a.uc.P;
import a.bk;
import nesquik.mytheria.Mytheria;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientPlayerInteractionManager.class)
public class ClientPlayerInteractionManagerMixin {
   @Shadow
   @Final
   private MinecraftClient client;

   @Inject(method = "attackEntity(Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/entity/Entity;)V", at = @At("HEAD"), cancellable = true)
   private void Mytheria$critPre(PlayerEntity player, Entity target, CallbackInfo ci) {
      if (bk.isActive) {
         ci.cancel();
      } else {
         L var4 = new L(target);
         Mytheria.getInstance().getEventManager().triggerEvent(var4);
         if (var4.isCancelled()) {
            ci.cancel();
         }
      }
   }

   @Inject(method = "breakBlock(Lnet/minecraft/util/math/BlockPos;)Z", at = @At("RETURN"), cancellable = true)
   public void breakBlockHook(BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
      D var3 = new D(pos);
      Mytheria.getInstance().getEventManager().triggerEvent(var3);
      if (var3.isCancelled()) {
         cir.setReturnValue(false);
      }
   }

   @Inject(method = "attackBlock(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Direction;)Z", at = @At("HEAD"), cancellable = true)
   private void onAttackBlock(BlockPos blockPos, Direction direction, CallbackInfoReturnable<Boolean> info) {
      if (bk.isActive) {
         info.setReturnValue(false);
         info.cancel();
      } else {
         P var4 = new P(blockPos);
         Mytheria.getInstance().getEventManager().triggerEvent(var4);
         if (var4.isCancelled()) {
            info.cancel();
         }
      }
   }

   @Inject(
      method = "interactBlock(Lnet/minecraft/client/network/ClientPlayerEntity;Lnet/minecraft/util/Hand;Lnet/minecraft/util/hit/BlockHitResult;)Lnet/minecraft/util/ActionResult;",
      at = @At("HEAD"),
      cancellable = true
   )
   public void preventInteraction(ClientPlayerEntity player, Hand hand, BlockHitResult hitResult, CallbackInfoReturnable<ActionResult> cir) {
      if (bk.isActive) {
         cir.setReturnValue(ActionResult.FAIL);
         cir.cancel();
      } else {
         if (this.client.world != null) {
         }
      }
   }

   @Inject(
      method = "interactEntity(Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/entity/Entity;Lnet/minecraft/util/Hand;)Lnet/minecraft/util/ActionResult;",
      at = @At("HEAD"),
      cancellable = true
   )
   private void onInteractEntity(PlayerEntity player, Entity entity, Hand hand, CallbackInfoReturnable<ActionResult> cir) {
      if (bk.isActive) {
         cir.setReturnValue(ActionResult.FAIL);
         cir.cancel();
      }
   }

   @Inject(
      method = "interactEntityAtLocation(Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/entity/Entity;Lnet/minecraft/util/hit/EntityHitResult;Lnet/minecraft/util/Hand;)Lnet/minecraft/util/ActionResult;",
      at = @At("HEAD"),
      cancellable = true
   )
   private void onInteractEntityAtLocation(PlayerEntity player, Entity entity, EntityHitResult hitResult, Hand hand, CallbackInfoReturnable<ActionResult> cir) {
      if (bk.isActive) {
         cir.setReturnValue(ActionResult.FAIL);
         cir.cancel();
      }
   }

   private boolean isLookingAtBlock(BlockPos blockPos) {
      if (this.client.player == null) {
         return false;
      }

      Vec3d var2 = this.client.player.getEyePos();
      Vec3d var3 = Vec3d.ofCenter(blockPos);
      Vec3d var4 = var3.subtract(var2).normalize();
      Vec3d var5 = bk.getCurrentLookVector();
      double var6 = var5.dotProduct(var4);
      double var8 = Math.acos(MathHelper.clamp(var6, -1.0, 1.0)) * (180.0 / Math.PI);
      return var8 < 90.0;
   }

   private boolean isLookingAtEntity(Entity entity) {
      if (this.client.player == null) {
         return false;
      }

      Vec3d var2 = this.client.player.getEyePos();
      Vec3d var3 = entity.getPos().add(0.0, entity.getHeight() / 2.0F, 0.0);
      Vec3d var4 = var3.subtract(var2).normalize();
      Vec3d var5 = bk.getCurrentLookVector();
      double var6 = var5.dotProduct(var4);
      double var8 = Math.acos(MathHelper.clamp(var6, -1.0, 1.0)) * (180.0 / Math.PI);
      return var8 < 90.0;
   }
}
