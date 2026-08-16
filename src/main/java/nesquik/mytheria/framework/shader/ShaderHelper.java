package nesquik.mytheria.framework.shader;

import com.mojang.blaze3d.systems.RenderSystem;
import nesquik.mytheria.framework.shader.storage.BlurredShader;
import nesquik.mytheria.framework.shader.storage.CobwebShader;
import nesquik.mytheria.framework.shader.storage.DepthShader;
import nesquik.mytheria.framework.shader.storage.GaussianShader;
import nesquik.mytheria.framework.shader.storage.LiquidGlassShader;
import nesquik.mytheria.framework.shader.storage.NebulaShader;
import nesquik.mytheria.framework.shader.storage.PassThroughShader;
import nesquik.mytheria.framework.shader.storage.PlasmaShader;
import nesquik.mytheria.framework.shader.storage.SolidShader;
import nesquik.mytheria.framework.shader.storage.TintShader;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;

public class ShaderHelper {
   private static final MinecraftClient mc = MinecraftClient.getInstance();
   private static GaussianShader gaussianShader;
   private static DepthShader depthShader;
   private static Shader passThroughShader;
   private static TintShader tintShader;
   private static BlurredShader blurredShader;
   private static SimpleFramebuffer copyFbo;
   private static SimpleFramebuffer fbo1;
   private static SimpleFramebuffer fbo2;
   private static SimpleFramebuffer depthFbo;
   private static SimpleFramebuffer tintFbo;
   private static SolidShader solidShader;
   private static LiquidGlassShader liquidGlassShader;
   private static PlasmaShader plasmaShader;
   private static NebulaShader nebulaShader;
   private static CobwebShader cobwebShader;
   private static boolean initialized = false;

   public static void initShadersIfNeeded() {
      if (!initialized) {
         try {
            gaussianShader = new GaussianShader();
            depthShader = new DepthShader();
            passThroughShader = new PassThroughShader();
            tintShader = new TintShader();
            blurredShader = new BlurredShader();
            solidShader = new SolidShader();
            liquidGlassShader = new LiquidGlassShader();
            plasmaShader = new PlasmaShader();
            nebulaShader = new NebulaShader();
            cobwebShader = new CobwebShader();
            initialized = true;
         } catch (Exception var1) {
            System.err.println("Failed to initialize shaders!");
            var1.printStackTrace();
         }
      }
   }

   public static void checkFramebuffers() {
      int var0 = mc.getWindow().getFramebufferWidth();
      int var1 = mc.getWindow().getFramebufferHeight();
      boolean var2 = copyFbo == null || copyFbo.textureWidth != var0 || copyFbo.textureHeight != var1;
      if (var2) {
         if (copyFbo != null) {
            try {
               copyFbo.delete();
               fbo1.delete();
               fbo2.delete();
               depthFbo.delete();
               tintFbo.delete();
            } catch (Exception var5) {
               System.err.println("Error deleting old framebuffers: " + var5.getMessage());
            }
         }

         try {
            copyFbo = new SimpleFramebuffer(var0, var1, true);
            fbo1 = new SimpleFramebuffer(var0, var1, true);
            fbo2 = new SimpleFramebuffer(var0, var1, true);
            depthFbo = new SimpleFramebuffer(var0, var1, true);
            tintFbo = new SimpleFramebuffer(var0, var1, true);
         } catch (Exception var4) {
            System.err.println("Error creating framebuffers: " + var4.getMessage());
            var4.printStackTrace();
         }
      }
   }

   public static void drawFullScreenQuad() {
      RenderSystem.assertOnRenderThread();
      BufferBuilder var0 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION);
      var0.vertex(-1.0F, -1.0F, 0.0F);
      var0.vertex(1.0F, -1.0F, 0.0F);
      var0.vertex(1.0F, 1.0F, 0.0F);
      var0.vertex(-1.0F, 1.0F, 0.0F);
      BufferRenderer.draw(var0.end());
   }

   public static boolean isInitialized() {
      return initialized;
   }

   public static GaussianShader getGaussianShader() {
      return gaussianShader;
   }

   public static DepthShader getDepthShader() {
      return depthShader;
   }

   public static Shader getPassThroughShader() {
      return passThroughShader;
   }

   public static TintShader getTintShader() {
      return tintShader;
   }

   public static BlurredShader getBlurredShader() {
      return blurredShader;
   }

   public static SimpleFramebuffer getCopyFbo() {
      return copyFbo;
   }

   public static SimpleFramebuffer getFbo1() {
      return fbo1;
   }

   public static SimpleFramebuffer getFbo2() {
      return fbo2;
   }

   public static SimpleFramebuffer getDepthFbo() {
      return depthFbo;
   }

   public static SimpleFramebuffer getTintFbo() {
      return tintFbo;
   }

   public static SolidShader getSolidShader() {
      return solidShader;
   }

   public static LiquidGlassShader getLiquidGlassShader() {
      return liquidGlassShader;
   }

   public static PlasmaShader getPlasmaShader() {
      return plasmaShader;
   }

   public static NebulaShader getNebulaShader() {
      return nebulaShader;
   }

   public static CobwebShader getCobwebShader() {
      return cobwebShader;
   }
}
