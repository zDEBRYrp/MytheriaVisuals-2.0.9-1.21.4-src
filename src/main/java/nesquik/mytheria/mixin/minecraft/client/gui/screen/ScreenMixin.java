package nesquik.mytheria.mixin.minecraft.client.gui.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import net.minecraft.client.render.DiffuseLighting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Screen.class)
public class ScreenMixin {
   @Inject(method = "renderBackground(Lnet/minecraft/client/gui/DrawContext;IIF)V", at = @At("HEAD"), cancellable = true)
   private void disableVanillaBackgroundBlur(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
      MinecraftClient var6 = MinecraftClient.getInstance();
      boolean var7 = (Object)this instanceof TitleScreen || (Object)this instanceof MultiplayerScreen || (Object)this instanceof SelectWorldScreen;
      if (!var7 && var6.world != null) {
         context.fillGradient(0, 0, context.getScaledWindowWidth(), context.getScaledWindowHeight(), -1072689136, -804253680);
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.enableDepthTest();
         RenderSystem.depthMask(true);
         DiffuseLighting.disableGuiDepthLighting();
         ci.cancel();
      }
   }
}
