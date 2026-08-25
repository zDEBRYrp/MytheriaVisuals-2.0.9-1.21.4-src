package nesquik.mytheria.mixin.minecraft.client;

import a.by;
import a.fh;
import a.uc.dP;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.client.render.VertexFormats;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class BetterMinecraftClientMixin {
   @Inject(method = "setScreen(Lnet/minecraft/client/gui/screen/Screen;)V", at = @At("HEAD"))
   private void onSetScreen(Screen screen, CallbackInfo ci) {
      by.onSetScreen(screen);
      try {
         MinecraftClient mc = MinecraftClient.getInstance();
         Screen old = mc.currentScreen;
         if (screen instanceof dP && old != null && !(old instanceof dP)) {
            Framebuffer src = mc.getFramebuffer();
            fh snap = new fh(false).setLinear().setDownscale(1.0F);
            snap.setup();
            snap.beginWrite(true);
            RenderSystem.setShaderTexture(0, src.getColorAttachment());
            BufferBuilder bb = RenderSystem.renderThreadTesselator().begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
            bb.vertex(0.0F, 0.0F, 0.0F).texture(0.0F, 1.0F).color(-1);
            bb.vertex(0.0F, (float)mc.getWindow().getScaledHeight(), 0.0F).texture(0.0F, 0.0F).color(-1);
            bb.vertex((float)mc.getWindow().getScaledWidth(), (float)mc.getWindow().getScaledHeight(), 0.0F).texture(1.0F, 0.0F).color(-1);
            bb.vertex((float)mc.getWindow().getScaledWidth(), 0.0F, 0.0F).texture(1.0F, 1.0F).color(-1);
            BufferRenderer.drawWithGlobalProgram(bb.end());
            snap.endWrite();
            RenderSystem.setShaderTexture(0, 0);
            dP.capturedSnapshot = snap;
         }
      } catch (Exception var9) {
         RenderSystem.setShaderTexture(0, 0);
      }
   }

   @Inject(method = "tick()V", at = @At("HEAD"))
   private void onTick(CallbackInfo ci) {
      by.tickPerspective();
   }
}
