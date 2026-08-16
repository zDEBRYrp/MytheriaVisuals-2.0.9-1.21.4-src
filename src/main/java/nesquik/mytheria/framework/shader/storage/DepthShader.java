package nesquik.mytheria.framework.shader.storage;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import nesquik.mytheria.framework.shader.Shader;
import nesquik.mytheria.framework.shader.ShaderHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.SimpleFramebuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;

public class DepthShader extends Shader {
   private static final MinecraftClient mc = MinecraftClient.getInstance();

   public DepthShader() {
      super("effects", "depth");
   }

   public static void applyDepthMask(Shader shader, SimpleFramebuffer fbo, SimpleFramebuffer fbo2, SimpleFramebuffer copyfbo, float fogDistance) {
      fbo.beginWrite(true);
      shader.bind();
      shader.setUniform1i("Tex0", 0);
      shader.setUniform1i("Tex1", 1);
      shader.setUniform1f("Near", 0.05F);
      shader.setUniform1f("Far", mc.gameRenderer.getFarPlaneDistance());
      shader.setUniform1f("MinThreshold", 0.1F * fogDistance / 100.0F);
      shader.setUniform1f("MaxThreshold", 0.28F * fogDistance / 100.0F);
      GL13.glActiveTexture(33984);
      GL11.glBindTexture(3553, fbo2.getColorAttachment());
      GL13.glActiveTexture(33985);
      GL11.glBindTexture(3553, copyfbo.getDepthAttachment());
      GlStateManager._texParameter(3553, 10241, 9728);
      GlStateManager._texParameter(3553, 10240, 9728);
      ShaderHelper.drawFullScreenQuad();
      shader.unbind();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glBindTexture(3553, 0);
      GL13.glActiveTexture(33984);
      GL11.glBindTexture(3553, 0);
   }
}
