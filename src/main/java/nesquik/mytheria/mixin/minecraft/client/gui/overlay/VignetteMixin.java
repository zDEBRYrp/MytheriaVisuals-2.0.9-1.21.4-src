package nesquik.mytheria.mixin.minecraft.client.gui.overlay;

import a.uc.bQ;
import java.util.function.Function;
import nesquik.mytheria.Mytheria;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DrawContext.class)
public class VignetteMixin {
   private static final Identifier VIGNETTE_TEXTURE = Identifier.ofVanilla("textures/misc/vignette.png");

   @Inject(method = "drawTexture(Ljava/util/function/Function;Lnet/minecraft/util/Identifier;IIIIFFIIII)V", at = @At("HEAD"), cancellable = true, require = 0)
   private void onDrawTexture(
      Function<Identifier, ?> textureGetter,
      Identifier texture,
      int x,
      int y,
      float u,
      float v,
      int width,
      int height,
      int textureWidth,
      int textureHeight,
      int z,
      CallbackInfo ci
   ) {
      bQ var13 = Mytheria.getInstance().getModuleManager().getModule(bQ.class);
      if (var13 != null && var13.isEnabled() && var13.getVignette().isSelected() && VIGNETTE_TEXTURE.equals(texture)) {
         ci.cancel();
      }
   }
}
