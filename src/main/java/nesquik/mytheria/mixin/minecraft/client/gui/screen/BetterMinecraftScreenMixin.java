package nesquik.mytheria.mixin.minecraft.client.gui.screen;

import a.by;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Screen.class)
public class BetterMinecraftScreenMixin {
   @Inject(method = "render(Lnet/minecraft/client/gui/DrawContext;IIF)V", at = @At("HEAD"))
   private void onRenderHead(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
      if (by.smoothScreensEnabled()) {
         MinecraftClient var6 = MinecraftClient.getInstance();
         if (var6.currentScreen == (Object)this) {
            float var7 = by.screenProgress();
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var7);
         }
      }
   }

   @Inject(method = "render(Lnet/minecraft/client/gui/DrawContext;IIF)V", at = @At("RETURN"))
   private void onRenderReturn(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
      if (by.smoothScreensEnabled()) {
         MinecraftClient var6 = MinecraftClient.getInstance();
         if (var6.currentScreen == (Object)this) {
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
