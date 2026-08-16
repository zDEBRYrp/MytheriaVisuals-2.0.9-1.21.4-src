package nesquik.mytheria.mixin.minecraft.client.util;

import java.io.InputStream;
import java.util.List;
import net.minecraft.client.util.Icons;
import net.minecraft.client.util.Window;
import net.minecraft.resource.InputSupplier;
import net.minecraft.resource.ResourcePack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Window.class)
public class WindowMixin {
   @Redirect(
      method = "setIcon(Lnet/minecraft/resource/ResourcePack;Lnet/minecraft/client/util/Icons;)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/Icons;getIcons(Lnet/minecraft/resource/ResourcePack;)Ljava/util/List;")
   )
   public List<InputSupplier<InputStream>> setCustomIcon(Icons instance, ResourcePack resourcePack) {
      try {
         return instance.getIcons(resourcePack);
      } catch (Exception var4) {
         return List.of();
      }
   }
}
