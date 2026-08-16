package nesquik.mytheria.framework.shader.storage;

import com.mojang.blaze3d.systems.RenderSystem;
import nesquik.mytheria.framework.shader.Shader;
import nesquik.mytheria.framework.shader.ShaderHelper;
import net.minecraft.client.gl.SimpleFramebuffer;
import org.joml.Vector3f;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;

public class GaussianShader extends Shader {
   public GaussianShader() {
      super("blurs", "gaussian");
   }

   public static void applyGaussianBlur(
      Shader shader,
      SimpleFramebuffer fbo1,
      SimpleFramebuffer fbo2,
      SimpleFramebuffer tintFbo,
      SimpleFramebuffer copyFbo,
      float strength,
      boolean linearSampling,
      boolean usePuke
   ) {
      Vector3f var8 = calculateGaussian(strength);
      int var9 = (int)Math.ceil(strength * 3.0F);
      shader.bind();
      shader.setUniform1i("Tex0", 0);
      shader.setUniformBool("Alpha", false);
      shader.setUniform3f("Gaussian", var8);
      shader.setUniform1i("Support", var9);
      shader.setUniformBool("LinearSampling", linearSampling);
      fbo1.beginWrite(true);
      shader.setUniform2f("Direction", 1.0F, 0.0F);
      shader.setUniform2f("TexelSize", 1.0F / fbo1.textureWidth, 1.0F / fbo1.textureHeight);
      int var10 = usePuke ? tintFbo.getColorAttachment() : copyFbo.getColorAttachment();
      GL13.glActiveTexture(33984);
      GL11.glBindTexture(3553, var10);
      ShaderHelper.drawFullScreenQuad();
      fbo2.beginWrite(true);
      shader.setUniform2f("Direction", 0.0F, 1.0F);
      shader.setUniform2f("TexelSize", 1.0F / fbo2.textureWidth, 1.0F / fbo2.textureHeight);
      GL11.glBindTexture(3553, fbo1.getColorAttachment());
      ShaderHelper.drawFullScreenQuad();
      shader.unbind();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glBindTexture(3553, 0);
   }

   public static Vector3f calculateGaussian(float sigma) {
      float var1 = 2.50662F;
      float var2 = (float)Math.exp(-0.5F / (sigma * sigma));
      return new Vector3f(1.0F / (2.50662F * sigma), var2, var2 * var2);
   }
}
