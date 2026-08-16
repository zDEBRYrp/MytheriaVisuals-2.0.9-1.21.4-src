package nesquik.mytheria.mixin.minecraft.item;

import nesquik.mytheria.utility.mixins.ArmorItemAddition;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ArmorItem.class)
public abstract class ArmorItemMixin implements ArmorItemAddition {
   @Unique
   private EquipmentType Mytheria$type;
   @Unique
   private ArmorMaterial Mytheria$material;

   @Inject(method = "<init>(Lnet/minecraft/item/equipment/ArmorMaterial;Lnet/minecraft/item/equipment/EquipmentType;Lnet/minecraft/item/Item$Settings;)V", at = @At("TAIL"))
   public void saveArgs(ArmorMaterial material, EquipmentType type, Settings settings, CallbackInfo ci) {
      this.Mytheria$type = type;
      this.Mytheria$material = material;
   }

   @Override
   public ArmorMaterial Mytheria$getMaterial() {
      return this.Mytheria$material;
   }

   @Override
   public EquipmentType Mytheria$getType() {
      return this.Mytheria$type;
   }
}
