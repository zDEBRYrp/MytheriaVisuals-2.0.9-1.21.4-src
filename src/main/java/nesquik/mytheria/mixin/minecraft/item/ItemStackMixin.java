package nesquik.mytheria.mixin.minecraft.item;

import a.uc.I;
import nesquik.mytheria.Mytheria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public abstract class ItemStackMixin {
   @Inject(method = "finishUsing(Lnet/minecraft/world/World;Lnet/minecraft/entity/LivingEntity;)Lnet/minecraft/item/ItemStack;", at = @At("TAIL"))
   private void onFinishUsing(World world, LivingEntity user, CallbackInfoReturnable<ItemStack> cir) {
      if (user instanceof PlayerEntity var4) {
         Mytheria.getInstance().getEventManager().triggerEvent(new I(var4, (ItemStack)(Object)this));
      }
   }
}
