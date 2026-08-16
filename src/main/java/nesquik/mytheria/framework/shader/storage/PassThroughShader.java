package nesquik.mytheria.framework.shader.storage;

import com.mojang.blaze3d.systems.RenderSystem;
import nesquik.mytheria.framework.shader.Shader;
import nesquik.mytheria.framework.shader.ShaderHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.SimpleFramebuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;

public class PassThroughShader extends Shader {
   private static final MinecraftClient mc = MinecraftClient.getInstance();

   public PassThroughShader() {
      super("effects", "passthrough");
   }

   public static void renderToScreen(Shader shader, SimpleFramebuffer fbo) {
      mc.getFramebuffer().beginWrite(false);
      int var2 = fbo.getColorAttachment();
      if (var2 <= 0) {
         System.err.println("PassThroughShader: Invalid color attachment: " + var2);
      } else {
         int var3 = mc.getFramebuffer().getDepthAttachment();
         RenderSystem.depthMask(false);
         RenderSystem.enableDepthTest();
         RenderSystem.depthFunc(519);
         GL13.glActiveTexture(33984);
         GL11.glBindTexture(3553, var2);
         GL13.glActiveTexture(33985);
         GL11.glBindTexture(3553, var3);
         shader.bind();
         shader.setUniform1i("Tex0", 0);
         shader.setUniform1i("DepthTex", 1);
         shader.setUniformBool("Alpha", true);
         shader.setUniformBool("UseDepthMask", true);
         shader.setUniform1f("Near", 0.05F);
         shader.setUniform1f("Far", mc.gameRenderer.getFarPlaneDistance());
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         ShaderHelper.drawFullScreenQuad();
         shader.unbind();
         RenderSystem.depthFunc(515);
         RenderSystem.depthMask(true);
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         GL13.glActiveTexture(33985);
         GL11.glBindTexture(3553, 0);
         GL13.glActiveTexture(33984);
         GL11.glBindTexture(3553, 0);
      }
   }
}
