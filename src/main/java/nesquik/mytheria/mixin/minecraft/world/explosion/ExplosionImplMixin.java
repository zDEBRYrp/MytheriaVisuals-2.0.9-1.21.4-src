package nesquik.mytheria.mixin.minecraft.world.explosion;

import a.uc.B;
import java.util.List;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.mixin.accessors.ExplosionImplAccessor;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.explosion.ExplosionImpl;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ExplosionImpl.class)
public abstract class ExplosionImplMixin implements IMinecraft {
   @Inject(method = "explode()V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/explosion/ExplosionImpl;damageEntities()V", shift = Shift.AFTER))
   private void onAfterDamageEntities(CallbackInfo ci) {
      ExplosionImpl var2 = (ExplosionImpl)(Object)this;
      List<BlockPos> var3 = ((ExplosionImplAccessor)var2).invokeGetBlocksToDestroy();
      List<BlockPos> var4 = var3.stream().filter(pos -> var2.getWorld().getBlockState(pos).isOf(Blocks.ANCIENT_DEBRIS)).toList();
      if (!var4.isEmpty() && var2.getWorld().getRegistryKey() == World.NETHER) {
         Mytheria.getInstance().getEventManager().triggerEvent(new B(var4, var2.getPosition()));
      }
   }
}
