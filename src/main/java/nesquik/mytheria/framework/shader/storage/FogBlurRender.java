package nesquik.mytheria.framework.shader.storage;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import nesquik.mytheria.framework.shader.Shader;
import nesquik.mytheria.framework.shader.ShaderHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.SimpleFramebuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;

public class FogBlurRender {
   private static final MinecraftClient mc = MinecraftClient.getInstance();
   private static SimpleFramebuffer savedDepthFbo = null;

   public static void applyFogBlur(
      float strength,
      float distance,
      boolean linearSampling,
      boolean usePuke,
      float pukeOpacity,
      float pukeSaturation,
      float pukeBrightness,
      boolean usePreSavedDepth
   ) {
      ShaderHelper.initShadersIfNeeded();
      if (ShaderHelper.isInitialized()) {
         int var8 = GL11.glGetInteger(34016);

         try {
            ShaderHelper.checkFramebuffers();
            TintShader var9 = ShaderHelper.getTintShader();
            GaussianShader var10 = ShaderHelper.getGaussianShader();
            DepthShader var11 = ShaderHelper.getDepthShader();
            Shader var12 = ShaderHelper.getPassThroughShader();
            SimpleFramebuffer var13 = ShaderHelper.getTintFbo();
            SimpleFramebuffer var14 = ShaderHelper.getCopyFbo();
            SimpleFramebuffer var15 = ShaderHelper.getFbo1();
            SimpleFramebuffer var16 = ShaderHelper.getFbo2();
            SimpleFramebuffer var17 = ShaderHelper.getDepthFbo();
            Framebuffer var18 = mc.getFramebuffer();
            var14.clear();
            var15.clear();
            var16.clear();
            var17.clear();
            var13.clear();
            GlStateManager._glBindFramebuffer(36008, var18.fbo);
            GlStateManager._glBindFramebuffer(36009, var14.fbo);
            GlStateManager._glBlitFrameBuffer(0, 0, var18.textureWidth, var18.textureHeight, 0, 0, var14.textureWidth, var14.textureHeight, 16640, 9728);
            if (usePuke) {
               TintShader.applyTintPass(var9, var13, var14, pukeOpacity, pukeSaturation, pukeBrightness);
            }

            GaussianShader.applyGaussianBlur(var10, var15, var16, var13, var14, strength, linearSampling, usePuke);
            DepthShader.applyDepthMask(var11, var17, var16, var14, distance);
            PassThroughShader.renderToScreen(var12, var17);
         } finally {
            mc.getFramebuffer().beginWrite(false);
            GL13.glActiveTexture(33985);
            GL11.glBindTexture(3553, 0);
            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, 0);
            GL13.glActiveTexture(var8);
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
