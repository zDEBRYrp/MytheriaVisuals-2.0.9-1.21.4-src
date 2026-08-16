package nesquik.mytheria.framework.shader.storage;

import com.mojang.blaze3d.systems.RenderSystem;
import nesquik.mytheria.framework.shader.Shader;
import nesquik.mytheria.framework.shader.ShaderHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.SimpleFramebuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;

public class TintShader extends Shader {
   private static final MinecraftClient mc = MinecraftClient.getInstance();
   private static long initTime = 0L;

   public TintShader() {
      super("effects", "tint");
      initTime = System.nanoTime();
   }

   public static void applyTintPass(Shader shader, SimpleFramebuffer fbo, SimpleFramebuffer copyfbo, float opacity, float saturation, float brightness) {
      fbo.beginWrite(true);
      shader.bind();
      shader.setUniform1i("Tex0", 0);
      shader.setUniformBool("RGBPuke", true);
      shader.setUniform2f("SV", saturation, brightness);
      shader.setUniform1f("Opacity", opacity);
      shader.setUniform1f("Time", (float)(System.nanoTime() - initTime) / 1.0E9F);
      if (mc.player != null) {
         shader.setUniform1f("Yaw", mc.player.getYaw());
         shader.setUniform1f("Pitch", mc.player.getPitch());
      }

      GL13.glActiveTexture(33984);
      GL11.glBindTexture(3553, copyfbo.getColorAttachment());
      ShaderHelper.drawFullScreenQuad();
      shader.unbind();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glBindTexture(3553, 0);
   }
}
