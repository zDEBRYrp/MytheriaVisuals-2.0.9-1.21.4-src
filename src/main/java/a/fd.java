package a;
import a.b;
import a.uc.bZ;
import a.uc.eF;
import a.uc.bY;
import a.uc.cC;
import a.uc.bN;
import a.uc.bR;
import a.uc.aQ;
import a.uc.eR;
import a.uc.eW;
import a.uc.fO;
import a.uc.dY;
import a.uc.eP;
import a.uc.cN;
import a.uc.L;
import a.uc.dR;
import a.uc.eY;
import a.uc.cK;
import a.uc.cO;
import a.uc.aZ;
import a.uc.eK;
import a.uc.dZ;
import a.uc.dX;
import a.uc.R;
import a.uc.aS;
import a.uc.cD;
import a.uc.U;
import a.uc.D;
import a.uc.aP;
import a.uc.dS;
import a.uc.aH;
import a.uc.eD;
import a.uc.aW;
import a.uc.dD;
import a.uc.bB;
import a.uc.eO;
import a.uc.cP;
import a.uc.fK;
import a.uc.aB;
import a.uc.cJ;
import a.uc.cX;
import a.uc.eG;
import a.uc.dA;
import a.uc.eI;
import a.uc.aE;
import a.uc.dE;
import a.uc.M;
import a.uc.dW;
import a.uc.H;
import a.uc.J;
import a.uc.Q;
import a.uc.N;
import a.uc.bW;
import a.uc.P;
import a.uc.fJ;
import a.uc.V;
import a.uc.G;
import a.fd;
import a.uc.eX;
import a.uc.Z;
import a.uc.bS;
import a.uc.aO;
import a.uc.cE;
import a.uc.X;
import a.uc.fC;
import a.uc.aT;
import a.uc.dH;
import a.uc.fP;
import a.uc.eM;
import a.uc.cT;
import a.uc.bA;
import a.uc.eS;
import a.uc.cR;
import a.uc.aN;
import a.uc.cI;
import a.uc.cG;
import a.uc.bC;
import a.uc.I;
import a.uc.bE;
import a.uc.aG;
import a.uc.dI;
import a.uc.aK;
import a.uc.aJ;
import a.uc.O;
import a.uc.aV;
import a.uc.eH;
import a.eb;
import a.uc.fE;
import a.uc.bK;
import a.uc.cF;
import a.uc.bF;
import a.uc.eN;
import a.uc.bI;
import a.uc.dC;
import a.uc.cU;
import a.uc.aU;
import a.uc.bH;
import a.uc.eA;
import a.uc.bM;
import a.uc.aF;
import a.a;
import a.uc.cL;
import a.uc.fM;
import a.uc.dM;
import a.uc.cA;
import a.uc.bD;
import a.uc.bX;
import a.uc.cH;
import a.uc.bG;
import a.uc.fB;
import a.uc.fA;
import a.uc.dF;
import a.uc.bU;
import a.uc.cY;
import a.uc.aC;
import a.uc.aL;
import a.uc.bQ;
import a.uc.eE;
import a.uc.eT;
import a.uc.K;
import a.uc.cB;
import a.uc.bT;
import a.uc.W;
import a.uc.eL;
import a.uc.bP;
import a.uc.aD;
import a.uc.fI;
import a.uc.T;
import a.uc.dB;
import a.uc.cV;
import a.c;
import a.uc.aY;
import a.uc.dT;
import a.uc.dJ;
import a.uc.fF;
import a.uc.aR;
import a.uc.fG;
import a.uc.dV;
import a.uc.aX;
import a.uc.dG;
import a.uc.E;
import a.uc.dP;
import a.uc.Y;
import a.uc.cM;
import a.uc.eQ;
import a.uc.eV;
import a.uc.cS;
import a.uc.bO;
import a.uc.eC;
import a.uc.fL;
import a.uc.bL;
import a.uc.aI;
import a.uc.cW;
import a.uc.dL;
import a.uc.aM;
import a.uc.eJ;
import a.uc.bV;
import a.uc.F;
import a.uc.cQ;
import a.uc.dQ;
import a.uc.dK;
import a.uc.aA;
import a.uc.eZ;
import a.uc.S;
import a.uc.fH;
import a.uc.dU;
import a.uc.dN;
import a.uc.fN;
import a.uc.cZ;
import a.uc.eU;
import a.uc.bJ;

import com.mojang.blaze3d.systems.RenderSystem;
import nesquik.mytheria.Mytheria;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Defines;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.util.Identifier;
import org.joml.Matrix4f;

public class fd {
   public static void renderShaderBox(
      Matrix4f matrix, double minX, double minY, double minZ, double maxX, double maxY, double maxZ, eb color, fd.a mode, int fillAlpha, float speed
   ) {
      if (!mode.hasShader()) {
         a(matrix, minX, minY, minZ, maxX, maxY, maxZ, color, fillAlpha);
      } else {
         a(matrix, minX, minY, minZ, maxX, maxY, maxZ, color, mode, fillAlpha, speed);
      }
   }

   private static void a(Matrix4f matrix, double minX, double minY, double minZ, double maxX, double maxY, double maxZ, eb color, int fillAlpha) {
      int var15 = a(color.getRGB(), fillAlpha);
      int var16 = var15 >> 16 & 0xFF;
      int var17 = var15 >> 8 & 0xFF;
      int var18 = var15 & 0xFF;
      int var19 = var15 >> 24 & 0xFF;
      BufferBuilder var20 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
      var20.vertex(matrix, (float)minX, (float)minY, (float)minZ).color(var16, var17, var18, var19);
      var20.vertex(matrix, (float)maxX, (float)minY, (float)minZ).color(var16, var17, var18, var19);
      var20.vertex(matrix, (float)maxX, (float)minY, (float)maxZ).color(var16, var17, var18, var19);
      var20.vertex(matrix, (float)minX, (float)minY, (float)maxZ).color(var16, var17, var18, var19);
      var20.vertex(matrix, (float)minX, (float)maxY, (float)minZ).color(var16, var17, var18, var19);
      var20.vertex(matrix, (float)minX, (float)maxY, (float)maxZ).color(var16, var17, var18, var19);
      var20.vertex(matrix, (float)maxX, (float)maxY, (float)maxZ).color(var16, var17, var18, var19);
      var20.vertex(matrix, (float)maxX, (float)maxY, (float)minZ).color(var16, var17, var18, var19);
      var20.vertex(matrix, (float)minX, (float)minY, (float)maxZ).color(var16, var17, var18, var19);
      var20.vertex(matrix, (float)maxX, (float)minY, (float)maxZ).color(var16, var17, var18, var19);
      var20.vertex(matrix, (float)maxX, (float)maxY, (float)maxZ).color(var16, var17, var18, var19);
      var20.vertex(matrix, (float)minX, (float)maxY, (float)maxZ).color(var16, var17, var18, var19);
      var20.vertex(matrix, (float)maxX, (float)minY, (float)minZ).color(var16, var17, var18, var19);
      var20.vertex(matrix, (float)minX, (float)minY, (float)minZ).color(var16, var17, var18, var19);
      var20.vertex(matrix, (float)minX, (float)maxY, (float)minZ).color(var16, var17, var18, var19);
      var20.vertex(matrix, (float)maxX, (float)maxY, (float)minZ).color(var16, var17, var18, var19);
      var20.vertex(matrix, (float)minX, (float)minY, (float)minZ).color(var16, var17, var18, var19);
      var20.vertex(matrix, (float)minX, (float)minY, (float)maxZ).color(var16, var17, var18, var19);
      var20.vertex(matrix, (float)minX, (float)maxY, (float)maxZ).color(var16, var17, var18, var19);
      var20.vertex(matrix, (float)minX, (float)maxY, (float)minZ).color(var16, var17, var18, var19);
      var20.vertex(matrix, (float)maxX, (float)minY, (float)maxZ).color(var16, var17, var18, var19);
      var20.vertex(matrix, (float)maxX, (float)minY, (float)minZ).color(var16, var17, var18, var19);
      var20.vertex(matrix, (float)maxX, (float)maxY, (float)minZ).color(var16, var17, var18, var19);
      var20.vertex(matrix, (float)maxX, (float)maxY, (float)maxZ).color(var16, var17, var18, var19);
      BufferRenderer.drawWithGlobalProgram(var20.end());
   }

   private static void a(
      Matrix4f matrix, double minX, double minY, double minZ, double maxX, double maxY, double maxZ, eb color, fd.a mode, int fillAlpha, float speed
   ) {
      try {
         ShaderProgram var17 = RenderSystem.setShader(mode.getShaderKey());
         if (var17 == null) {
            Mytheria.LOGGER.warn("Shader is null for mode: {}", mode.b);
            a(matrix, minX, minY, minZ, maxX, maxY, maxZ, color, fillAlpha);
            return;
         }

         if (var17.getUniform("time") != null) {
            var17.getUniform("time").set((float)(System.currentTimeMillis() % 100000L) / 1000.0F * speed);
         }

         if (var17.getUniform("screenSize") != null) {
            MinecraftClient var18 = MinecraftClient.getInstance();
            var17.getUniform("screenSize")
               .set((float)var18.getWindow().getFramebufferWidth(), (float)var18.getWindow().getFramebufferHeight());
         }

         if (var17.getUniform("baseColor") != null) {
            var17.getUniform("baseColor")
               .set(color.getRed() / 255.0F, color.getGreen() / 255.0F, color.getBlue() / 255.0F, color.getAlpha() / 255.0F);
         }

         if (var17.getUniform("alpha") != null) {
            var17.getUniform("alpha").set(fillAlpha / 255.0F);
         }

         if (var17.getUniform("zoomFactor") != null) {
            bX var25 = Mytheria.getInstance().getModuleManager().getModuleSafe(bX.class);
            float var19 = 1.0F;
            if (var25 != null && var25.isEnabled()) {
               var19 = var25.getZoomMultiplier();
            }

            var17.getUniform("zoomFactor").set(var19);
         }

         BufferBuilder var26 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
         int var27 = a(color.getRGB(), fillAlpha);
         int var20 = var27 >> 16 & 0xFF;
         int var21 = var27 >> 8 & 0xFF;
         int var22 = var27 & 0xFF;
         int var23 = var27 >> 24 & 0xFF;
         var26.vertex(matrix, (float)minX, (float)minY, (float)minZ).texture(0.0F, 0.0F).color(var20, var21, var22, var23);
         var26.vertex(matrix, (float)maxX, (float)minY, (float)minZ).texture(1.0F, 0.0F).color(var20, var21, var22, var23);
         var26.vertex(matrix, (float)maxX, (float)minY, (float)maxZ).texture(1.0F, 1.0F).color(var20, var21, var22, var23);
         var26.vertex(matrix, (float)minX, (float)minY, (float)maxZ).texture(0.0F, 1.0F).color(var20, var21, var22, var23);
         var26.vertex(matrix, (float)minX, (float)maxY, (float)minZ).texture(0.0F, 0.0F).color(var20, var21, var22, var23);
         var26.vertex(matrix, (float)minX, (float)maxY, (float)maxZ).texture(0.0F, 1.0F).color(var20, var21, var22, var23);
         var26.vertex(matrix, (float)maxX, (float)maxY, (float)maxZ).texture(1.0F, 1.0F).color(var20, var21, var22, var23);
         var26.vertex(matrix, (float)maxX, (float)maxY, (float)minZ).texture(1.0F, 0.0F).color(var20, var21, var22, var23);
         var26.vertex(matrix, (float)minX, (float)minY, (float)maxZ).texture(0.0F, 0.0F).color(var20, var21, var22, var23);
         var26.vertex(matrix, (float)maxX, (float)minY, (float)maxZ).texture(1.0F, 0.0F).color(var20, var21, var22, var23);
         var26.vertex(matrix, (float)maxX, (float)maxY, (float)maxZ).texture(1.0F, 1.0F).color(var20, var21, var22, var23);
         var26.vertex(matrix, (float)minX, (float)maxY, (float)maxZ).texture(0.0F, 1.0F).color(var20, var21, var22, var23);
         var26.vertex(matrix, (float)maxX, (float)minY, (float)minZ).texture(0.0F, 0.0F).color(var20, var21, var22, var23);
         var26.vertex(matrix, (float)minX, (float)minY, (float)minZ).texture(1.0F, 0.0F).color(var20, var21, var22, var23);
         var26.vertex(matrix, (float)minX, (float)maxY, (float)minZ).texture(1.0F, 1.0F).color(var20, var21, var22, var23);
         var26.vertex(matrix, (float)maxX, (float)maxY, (float)minZ).texture(0.0F, 1.0F).color(var20, var21, var22, var23);
         var26.vertex(matrix, (float)minX, (float)minY, (float)minZ).texture(0.0F, 0.0F).color(var20, var21, var22, var23);
         var26.vertex(matrix, (float)minX, (float)minY, (float)maxZ).texture(1.0F, 0.0F).color(var20, var21, var22, var23);
         var26.vertex(matrix, (float)minX, (float)maxY, (float)maxZ).texture(1.0F, 1.0F).color(var20, var21, var22, var23);
         var26.vertex(matrix, (float)minX, (float)maxY, (float)minZ).texture(0.0F, 1.0F).color(var20, var21, var22, var23);
         var26.vertex(matrix, (float)maxX, (float)minY, (float)maxZ).texture(0.0F, 0.0F).color(var20, var21, var22, var23);
         var26.vertex(matrix, (float)maxX, (float)minY, (float)minZ).texture(1.0F, 0.0F).color(var20, var21, var22, var23);
         var26.vertex(matrix, (float)maxX, (float)maxY, (float)minZ).texture(1.0F, 1.0F).color(var20, var21, var22, var23);
         var26.vertex(matrix, (float)maxX, (float)maxY, (float)maxZ).texture(0.0F, 1.0F).color(var20, var21, var22, var23);
         BufferRenderer.drawWithGlobalProgram(var26.end());
      } catch (Exception var24) {
         Mytheria.LOGGER.error("Failed to render with shader: {}", mode.b, var24);
         a(matrix, minX, minY, minZ, maxX, maxY, maxZ, color, fillAlpha);
      }
   }

   private static int a(int color, int alpha) {
      int var2 = color >> 16 & 0xFF;
      int var3 = color >> 8 & 0xFF;
      int var4 = color & 0xFF;
      return alpha << 24 | var2 << 16 | var3 << 8 | var4;
   }

   public enum a {
      COBWEB("Паутина", "block_cobweb"),
      NEBULA("Туманность", "block_nebula"),
      PLASMA("Плазма", "block_plasma"),
      STARFIELD("Звёздное поле", "block_starfield"),
      FIREWORKS("Геометрия", "block_fireworks"),
      GALAXY("Галактика", "block_galaxy"),
      STARS("Аква", "block_stars");

      private final String a;
      final String b;
      private ShaderProgramKey c;

      a(String displayName, String shaderName) {
         this.a = displayName;
         this.b = shaderName;
         if (shaderName != null) {
            this.c = new ShaderProgramKey(
               Identifier.of("mytheria", "shadersblock/shadersforblock/" + shaderName), VertexFormats.POSITION_TEXTURE_COLOR, Defines.EMPTY
            );
         }
      }

      public String getDisplayName() {
         return this.a;
      }

      public ShaderProgramKey getShaderKey() {
         return this.c;
      }

      public boolean hasShader() {
         return this.b != null;
      }
   }
}