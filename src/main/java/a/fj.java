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
import a.fo;
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
import a.d;
import a.uc.aP;
import a.uc.dS;
import a.uc.aH;
import a.uc.eD;
import a.uc.aW;
import a.uc.dD;
import a.uc.bB;
import a.uc.eO;
import a.uc.cP;
import a.fk;
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
import a.h;
import a.uc.J;
import a.uc.Q;
import a.uc.N;
import a.uc.bW;
import a.uc.P;
import a.fj;
import a.uc.V;
import a.g;
import a.uc.fD;
import a.uc.eX;
import a.z;
import a.uc.bS;
import a.uc.aO;
import a.uc.cE;
import a.x;
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
import a.ff;
import a.uc.aR;
import a.uc.fG;
import a.uc.dV;
import a.uc.aX;
import a.uc.dG;
import a.e;
import a.uc.dP;
import a.y;
import a.uc.cM;
import a.uc.eQ;
import a.uc.eV;
import a.uc.cS;
import a.uc.bO;
import a.ec;
import a.uc.fL;
import a.uc.bL;
import a.uc.aI;
import a.uc.cW;
import a.uc.dL;
import a.uc.aM;
import a.uc.eJ;
import a.uc.bV;
import a.f;
import a.uc.cQ;
import a.uc.dQ;
import a.uc.dK;
import a.uc.aA;
import a.uc.eZ;
import a.uc.S;
import a.fh;
import a.uc.dU;
import a.uc.dN;
import a.uc.fN;
import a.uc.cZ;
import a.uc.eU;
import a.uc.bJ;

import com.mojang.blaze3d.systems.RenderSystem;
import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.gradient.Gradient;
import nesquik.mytheria.framework.shader.GlProgram;
import nesquik.mytheria.framework.shader.impl.BlurProgram;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import nesquik.mytheria.utility.interfaces.IWindow;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec2f;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;
import ru.kotopushka.compiler.sdk.annotations.Initialization;

public final class fj implements IMinecraft, IWindow {
   public static final float DEFAULT_SMOOTHNESS = 0.5F;
   public static final fk limiter = new fk(true);
   public static GlProgram rectangleProgram;
   private static GlProgram a;
   private static GlProgram b;
   private static GlProgram c;
   private static GlProgram d;
   private static GlProgram e;
   private static GlProgram f;
   private static GlProgram g;
   public static BlurProgram blurProgram;
   private static final fh h = new fh(false);

   @Initialization
   public static void initializeShaders() {
      rectangleProgram = new GlProgram(Mytheria.id("rectangle/data"), VertexFormats.POSITION_COLOR);
      a = new GlProgram(Mytheria.id("squircle/data"), VertexFormats.POSITION_COLOR);
      c = new GlProgram(Mytheria.id("squircle_texture/data"), VertexFormats.POSITION_TEXTURE_COLOR);
      b = new GlProgram(Mytheria.id("texture/data"), VertexFormats.POSITION_TEXTURE_COLOR);
      d = new GlProgram(Mytheria.id("border/data"), VertexFormats.POSITION_COLOR);
      e = new GlProgram(Mytheria.id("loading/data"), VertexFormats.POSITION_COLOR);
      f = new GlProgram(Mytheria.id("liquidglass/data"), VertexFormats.POSITION_TEXTURE_COLOR);
      g = new GlProgram(Mytheria.id("gradient_rectangle/data"), VertexFormats.POSITION_COLOR);
      blurProgram = new BlurProgram();
      blurProgram.initShaders();
   }

   public static void updateBuffer() {
      h.setClearColor(0.0F, 0.0F, 0.0F, 1.0F);
      h.setup();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      mc.getFramebuffer().beginRead();
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      RenderSystem.setShaderTexture(0, mc.getFramebuffer().getColorAttachment());
      a(0.0F, 0.0F, mw.getScaledWidth(), mw.getScaledHeight(), true);
      mc.getFramebuffer().endRead();
      RenderSystem.disableBlend();
      mc.getFramebuffer().beginWrite(true);
      h.stop();
   }

   private static void a(float x, float y, float width, float height, boolean flip) {
      BufferBuilder var5 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      byte var6 = -1;
      float var7 = flip ? 0.0F : 1.0F;
      float var8 = flip ? 1.0F : 0.0F;
      var5.vertex(x, y, 0.0F).texture(0.0F, var8).color(-1);
      var5.vertex(x, y + height, 0.0F).texture(0.0F, var7).color(-1);
      var5.vertex(x + width, y + height, 0.0F).texture(1.0F, var7).color(-1);
      var5.vertex(x + width, y, 0.0F).texture(1.0F, var8).color(-1);
      BufferRenderer.drawWithGlobalProgram(var5.end());
   }

   public static void drawLine(MatrixStack matrices, Vec2f from, Vec2f to, eb color) {
      matrices.push();

      try {
         Matrix4f var4 = matrices.peek().getPositionMatrix();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
         RenderSystem.lineWidth(1.0F);
         drawSetup();
         BufferBuilder var5 = RenderSystem.renderThreadTesselator().begin(DrawMode.DEBUG_LINE_STRIP, VertexFormats.POSITION_COLOR);
         var5.vertex(var4, from.x, from.y, 0.0F).color(color.getRGB());
         var5.vertex(var4, to.x, to.y, 0.0F).color(color.getRGB());
         BufferRenderer.drawWithGlobalProgram(var5.end());
         drawEnd();
      } finally {
         RenderSystem.disableBlend();
         RenderSystem.lineWidth(1.0F);
         matrices.pop();
      }
   }

   public static void drawBezier(MatrixStack matrices, Vec2f p0, Vec2f p1, Vec2f p2, Vec2f p3, eb color, int resolution) {
      matrices.push();

      try {
         Matrix4f var7 = matrices.peek().getPositionMatrix();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
         RenderSystem.lineWidth(1.0F);
         drawSetup();
         BufferBuilder var8 = RenderSystem.renderThreadTesselator().begin(DrawMode.DEBUG_LINE_STRIP, VertexFormats.POSITION_COLOR);

         for (int var9 = 0; var9 <= resolution; var9++) {
            float var10 = (float)var9 / resolution;
            float var11 = (float)eI.cubicBezier(var10, p0.x, p1.x, p2.x, p3.x);
            float var12 = (float)eI.cubicBezier(var10, p0.y, p1.y, p2.y, p3.y);
            var8.vertex(var7, var11, var12, 0.0F).color(color.getRGB());
         }

         BufferRenderer.drawWithGlobalProgram(var8.end());
         drawEnd();
      } finally {
         RenderSystem.disableBlend();
         RenderSystem.lineWidth(1.0F);
         matrices.pop();
      }
   }

   public static void drawRect(MatrixStack matrices, float x, float y, float width, float height, eb color) {
      if (fo.getActive() instanceof fs var6) {
         BufferBuilder var9 = var6.getBuilder();
         Matrix4f var8 = var6.getMatrices().peek().getPositionMatrix();
         var9.vertex(var8, x, y + height, 0.0F).color(color.getRGB());
         var9.vertex(var8, x + width, y + height, 0.0F).color(color.getRGB());
         var9.vertex(var8, x + width, y, 0.0F).color(color.getRGB());
         var9.vertex(var8, x, y, 0.0F).color(color.getRGB());
      } else {
         matrices.push();
         Matrix4f var10 = matrices.peek().getPositionMatrix();
         RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
         drawSetup();
         BufferBuilder var11 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
         var11.vertex(var10, x, y + height, 0.0F).color(color.getRGB());
         var11.vertex(var10, x + width, y + height, 0.0F).color(color.getRGB());
         var11.vertex(var10, x + width, y, 0.0F).color(color.getRGB());
         var11.vertex(var10, x, y, 0.0F).color(color.getRGB());
         BufferRenderer.drawWithGlobalProgram(var11.end());
         drawEnd();
         matrices.pop();
      }
   }

   public static void drawSquircle(MatrixStack matrices, float x, float y, float width, float height, float squirt, BorderRadius borderRadius, eb color) {
      matrices.push();
      Matrix4f var8 = matrices.peek().getPositionMatrix();
      float var9 = 0.5F;
      if (fo.getActive() instanceof fu var10) {
         var10.add(
            var8,
            x,
            y,
            width,
            height,
            borderRadius.topLeftRadius() * squirt / 2.0F,
            borderRadius.bottomLeftRadius() * squirt / 2.0F,
            borderRadius.topRightRadius() * squirt / 2.0F,
            borderRadius.bottomRightRadius() * squirt / 2.0F,
            color.getRGB()
         );
         matrices.pop();
      } else {
         a.use();
         a.findUniform("Size").set(width, height);
         a.findUniform("Radius")
            .set(
               borderRadius.topLeftRadius() * squirt / 2.0F,
               borderRadius.bottomLeftRadius() * squirt / 2.0F,
               borderRadius.topRightRadius() * squirt / 2.0F,
               borderRadius.bottomRightRadius() * squirt / 2.0F
            );
         a.findUniform("Smoothness").set(var9);
         a.findUniform("CornerSmoothness").set(squirt);
         drawSetup();
         float var18 = -var9 / 2.0F + var9 * 2.0F;
         float var12 = var9 / 2.0F + var9;
         float var13 = x - var18 / 2.0F;
         float var14 = y - var12 / 2.0F;
         float var15 = width + var18;
         float var16 = height + var12;
         BufferBuilder var17 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
         var17.vertex(var8, var13, var14, 0.0F).color(color.getRGB());
         var17.vertex(var8, var13, var14 + var16, 0.0F).color(color.getRGB());
         var17.vertex(var8, var13 + var15, var14 + var16, 0.0F).color(color.getRGB());
         var17.vertex(var8, var13 + var15, var14, 0.0F).color(color.getRGB());
         BufferRenderer.drawWithGlobalProgram(var17.end());
         drawEnd();
         matrices.pop();
      }
   }

   public static void drawLoadingRect(MatrixStack matrices, float x, float y, float width, float height, float progress, BorderRadius borderRadius, eb color) {
      matrices.push();
      Matrix4f var8 = matrices.peek().getPositionMatrix();
      float var9 = 0.5F;
      e.use();
      e.findUniform("Size").set(width, height);
      e.findUniform("Radius")
         .set(borderRadius.topLeftRadius(), borderRadius.bottomLeftRadius(), borderRadius.topRightRadius(), borderRadius.bottomRightRadius());
      e.findUniform("Smoothness").set(var9);
      e.findUniform("Progress").set(progress);
      e.findUniform("StripeWidth").set(0.0F);
      e.findUniform("Fade").set(0.5F);
      drawSetup();
      float var10 = -var9 / 2.0F + var9 * 2.0F;
      float var11 = var9 / 2.0F + var9;
      float var12 = x - var10 / 2.0F;
      float var13 = y - var11 / 2.0F;
      float var14 = width + var10;
      float var15 = height + var11;
      BufferBuilder var16 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
      var16.vertex(var8, var12, var13, 0.0F).color(color.getRGB());
      var16.vertex(var8, var12, var13 + var15, 0.0F).color(color.getRGB());
      var16.vertex(var8, var12 + var14, var13 + var15, 0.0F).color(color.getRGB());
      var16.vertex(var8, var12 + var14, var13, 0.0F).color(color.getRGB());
      BufferRenderer.drawWithGlobalProgram(var16.end());
      drawEnd();
      matrices.pop();
   }

   public static void drawLiquidGlass(
      MatrixStack matrices,
      float x,
      float y,
      float width,
      float height,
      BorderRadius borderRadius,
      eb color,
      float globalAlpha,
      float fresnelPower,
      eb fresnelColor,
      float baseAlpha,
      boolean fresnelInvert,
      float fresnelMix,
      float distortStrength,
      float squirt,
      boolean clean
   ) {
      Matrix4f var16 = matrices.peek().getPositionMatrix();
      drawSetup();
      RenderSystem.disableCull();
      RenderSystem.setShaderTexture(0, clean ? mc.getFramebuffer().getColorAttachment() : BlurProgram.getTexture());
      f.use();
      f.findUniform("GlobalAlpha").set(globalAlpha);
      f.findUniform("Size").set(width, height);
      f.findUniform("Radius")
         .set(borderRadius.topLeftRadius(), borderRadius.bottomLeftRadius(), borderRadius.topRightRadius(), borderRadius.bottomRightRadius());
      f.findUniform("Smoothness").set(0.5F);
      f.findUniform("FresnelPower").set(fresnelPower);
      f.findUniform("FresnelColor").set(ff.getRGBf(fresnelColor.getRGB()));
      f.findUniform("FresnelAlpha").set(ff.alphaf(fresnelColor.getRGB()));
      f.findUniform("BaseAlpha").set(baseAlpha);
      f.findUniform("FresnelInvert").set(fresnelInvert ? 1 : 0);
      f.findUniform("FresnelMix").set(fresnelMix);
      f.findUniform("DistortStrength").set(distortStrength);
      f.findUniform("CornerSmoothness").set(squirt);
      int var17 = mw.getScaledWidth();
      int var18 = mw.getScaledHeight();
      float var19 = x / var17;
      float var20 = (var18 - y - height) / var18;
      float var21 = width / var17;
      float var22 = height / var18;
      BufferBuilder var23 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      var23.vertex(var16, x, y, 0.0F).texture(var19, var20 + var22).color(color.getRGB());
      var23.vertex(var16, x, y + height, 0.0F).texture(var19, var20).color(color.getRGB());
      var23.vertex(var16, x + width, y + height, 0.0F).texture(var19 + var21, var20).color(color.getRGB());
      var23.vertex(var16, x + width, y, 0.0F).texture(var19 + var21, var20 + var22).color(color.getRGB());
      BufferRenderer.drawWithGlobalProgram(var23.end());
      RenderSystem.setShaderTexture(0, 0);
      RenderSystem.enableCull();
      drawEnd();
   }

   public static void drawRoundedRect(MatrixStack matrices, float x, float y, float width, float height, BorderRadius borderRadius, eb color) {
      matrices.push();
      Matrix4f var7 = matrices.peek().getPositionMatrix();
      float var8 = 0.5F;
      if (fo.getActive() instanceof ft var9) {
         var9.add(
            var7,
            x,
            y,
            width,
            height,
            borderRadius.topLeftRadius(),
            borderRadius.bottomLeftRadius(),
            borderRadius.topRightRadius(),
            borderRadius.bottomRightRadius(),
            color.getRGB()
         );
         matrices.pop();
      } else {
         rectangleProgram.use();
         rectangleProgram.findUniform("Size").set(width, height);
         rectangleProgram.findUniform("Radius")
            .set(borderRadius.topLeftRadius(), borderRadius.bottomLeftRadius(), borderRadius.topRightRadius(), borderRadius.bottomRightRadius());
         rectangleProgram.findUniform("Smoothness").set(var8);
         drawSetup();
         float var17 = -var8 / 2.0F + var8 * 2.0F;
         float var11 = var8 / 2.0F + var8;
         float var12 = x - var17 / 2.0F;
         float var13 = y - var11 / 2.0F;
         float var14 = width + var17;
         float var15 = height + var11;
         BufferBuilder var16 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
         var16.vertex(var7, var12, var13, 0.0F).color(color.getRGB());
         var16.vertex(var7, var12, var13 + var15, 0.0F).color(color.getRGB());
         var16.vertex(var7, var12 + var14, var13 + var15, 0.0F).color(color.getRGB());
         var16.vertex(var7, var12 + var14, var13, 0.0F).color(color.getRGB());
         BufferRenderer.drawWithGlobalProgram(var16.end());
         drawEnd();
         matrices.pop();
      }
   }

   public static void drawRoundedRect(
      MatrixStack matrices, float x, float y, float width, float height, BorderRadius borderRadius, eb color1, eb color2, eb color3, eb color4
   ) {
      matrices.push();
      Matrix4f var10 = matrices.peek().getPositionMatrix();
      float var11 = 0.5F;
      g.use();
      g.findUniform("Size").set(width, height);
      g.findUniform("Radius")
         .set(borderRadius.topLeftRadius(), borderRadius.bottomLeftRadius(), borderRadius.topRightRadius(), borderRadius.bottomRightRadius());
      g.findUniform("Smoothness").set(var11);
      g.findUniform("TopLeftColor").set(color1.getRed() / 255.0F, color1.getGreen() / 255.0F, color1.getBlue() / 255.0F, color1.getAlpha() / 255.0F);
      g.findUniform("BottomLeftColor")
         .set(color2.getRed() / 255.0F, color2.getGreen() / 255.0F, color2.getBlue() / 255.0F, color2.getAlpha() / 255.0F);
      g.findUniform("BottomRightColor")
         .set(color3.getRed() / 255.0F, color3.getGreen() / 255.0F, color3.getBlue() / 255.0F, color3.getAlpha() / 255.0F);
      g.findUniform("TopRightColor").set(color4.getRed() / 255.0F, color4.getGreen() / 255.0F, color4.getBlue() / 255.0F, color4.getAlpha() / 255.0F);
      drawSetup();
      float var12 = -var11 / 2.0F + var11 * 2.0F;
      float var13 = var11 / 2.0F + var11;
      float var14 = x - var12 / 2.0F;
      float var15 = y - var13 / 2.0F;
      float var16 = width + var12;
      float var17 = height + var13;
      BufferBuilder var18 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
      var18.vertex(var10, var14, var15, 0.0F).color(color1.getRGB());
      var18.vertex(var10, var14, var15 + var17, 0.0F).color(color2.getRGB());
      var18.vertex(var10, var14 + var16, var15 + var17, 0.0F).color(color3.getRGB());
      var18.vertex(var10, var14 + var16, var15, 0.0F).color(color4.getRGB());
      BufferRenderer.drawWithGlobalProgram(var18.end());
      drawEnd();
      matrices.pop();
   }

   public static void drawRoundedRect(MatrixStack matrices, float x, float y, float width, float height, BorderRadius borderRadius, Gradient gradient) {
      drawRoundedRect(
         matrices,
         x,
         y,
         width,
         height,
         borderRadius,
         gradient.getTopLeftColor(),
         gradient.getBottomLeftColor(),
         gradient.getBottomRightColor(),
         gradient.getTopRightColor()
      );
   }

   public static void drawHardRoundedRect(MatrixStack matrices, float x, float y, float width, float height, BorderRadius borderRadius, eb color) {
      matrices.push();
      Matrix4f var7 = matrices.peek().getPositionMatrix();
      float var8 = 0.1F;
      if (fo.getActive() instanceof ft var9) {
         var9.add(
            var7,
            x,
            y,
            width,
            height,
            borderRadius.topLeftRadius(),
            borderRadius.bottomLeftRadius(),
            borderRadius.topRightRadius(),
            borderRadius.bottomRightRadius(),
            color.getRGB()
         );
         matrices.pop();
      } else {
         rectangleProgram.use();
         rectangleProgram.findUniform("Size").set(width, height);
         rectangleProgram.findUniform("Radius")
            .set(borderRadius.topLeftRadius(), borderRadius.bottomLeftRadius(), borderRadius.topRightRadius(), borderRadius.bottomRightRadius());
      }
   }

   public static void drawRoundedBorder(
      MatrixStack matrices, float x, float y, float width, float height, float borderThickness, BorderRadius borderRadius, eb borderColor
   ) {
      matrices.push();
      Matrix4f var8 = matrices.peek().getPositionMatrix();
      float var9 = 0.5F;
      float var10 = 1.0F;
      d.use();
      d.findUniform("Size").set(width, height);
      d.findUniform("Radius")
         .set(borderRadius.topLeftRadius(), borderRadius.bottomLeftRadius(), borderRadius.topRightRadius(), borderRadius.bottomRightRadius());
   }

   public static void drawTextureSmooth(MatrixStack matrices, Identifier identifier, float x, float y, float width, float height, eb textureColor) {
      matrices.push();
      Matrix4f var7 = matrices.peek().getPositionMatrix();
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      int var8 = RenderSystem.getShaderTexture(0);
      RenderSystem.setShaderTexture(0, identifier);
      AbstractTexture var9 = mc.getTextureManager().getTexture(identifier);
      if (var9 != null) {
         GL11.glBindTexture(3553, var9.getGlId());
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
      }

      drawSetup();
      BufferBuilder var10 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      var10.vertex(var7, x, y, 0.0F).texture(0.0F, 0.0F).color(textureColor.getRGB());
      var10.vertex(var7, x, y + height, 0.0F).texture(0.0F, 1.0F).color(textureColor.getRGB());
      var10.vertex(var7, x + width, y + height, 0.0F).texture(1.0F, 1.0F).color(textureColor.getRGB());
      var10.vertex(var7, x + width, y, 0.0F).texture(1.0F, 0.0F).color(textureColor.getRGB());
      BufferRenderer.drawWithGlobalProgram(var10.end());
      drawEnd();
      RenderSystem.setShaderTexture(0, 0);
      matrices.pop();
   }

   public static void drawTexture(MatrixStack matrices, Identifier identifier, float x, float y, float width, float height, eb textureColor) {
      if (fo.getActive() instanceof fr var7) {
         BufferBuilder var10 = var7.getBuilder();
         Matrix4f var9 = var7.getMatrices().peek().getPositionMatrix();
         RenderSystem.setShaderTexture(0, identifier);
         var10.vertex(var9, x, y, 0.0F).texture(0.0F, 0.0F).color(textureColor.getRGB());
         var10.vertex(var9, x, y + height, 0.0F).texture(0.0F, 1.0F).color(textureColor.getRGB());
         var10.vertex(var9, x + width, y + height, 0.0F).texture(1.0F, 1.0F).color(textureColor.getRGB());
         var10.vertex(var9, x + width, y, 0.0F).texture(1.0F, 0.0F).color(textureColor.getRGB());
      } else {
         matrices.push();
         Matrix4f var11 = matrices.peek().getPositionMatrix();
         RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
         RenderSystem.setShaderTexture(0, identifier);
         drawSetup();
         BufferBuilder var12 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
         var12.vertex(var11, x, y, 0.0F).texture(0.0F, 0.0F).color(textureColor.getRGB());
         var12.vertex(var11, x, y + height, 0.0F).texture(0.0F, 1.0F).color(textureColor.getRGB());
         var12.vertex(var11, x + width, y + height, 0.0F).texture(1.0F, 1.0F).color(textureColor.getRGB());
         var12.vertex(var11, x + width, y, 0.0F).texture(1.0F, 0.0F).color(textureColor.getRGB());
         BufferRenderer.drawWithGlobalProgram(var12.end());
         drawEnd();
         RenderSystem.setShaderTexture(0, 0);
         matrices.pop();
      }
   }

   public static void drawTexture(
      MatrixStack matrices, Identifier identifier, float x, float y, float width, float height, float u1, float u2, float v1, float v2, eb clor
   ) {
      if (fo.getActive() instanceof fr var11) {
         BufferBuilder var17 = var11.getBuilder();
         Matrix4f var13 = var11.getMatrices().peek().getPositionMatrix();
         RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
         RenderSystem.setShaderTexture(0, identifier);
         int var14 = clor.getRGB();
         float var15 = x + width;
         float var16 = y + height;
         var17.vertex(var13, x, y, 0.0F).texture(u1, v1).color(var14);
         var17.vertex(var13, x, var16, 0.0F).texture(u1, v2).color(var14);
         var17.vertex(var13, var15, var16, 0.0F).texture(u2, v2).color(var14);
         var17.vertex(var13, var15, y, 0.0F).texture(u2, v1).color(var14);
      } else {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         matrices.push();
         int var18 = clor.getRGB();
         Matrix4f var19 = matrices.peek().getPositionMatrix();
         float var20 = x + width;
         float var21 = y + height;
         RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
         RenderSystem.setShaderTexture(0, identifier);
         BufferBuilder var22 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
         var22.vertex(var19, x, y, 0.0F).texture(u1, v1).color(var18);
         var22.vertex(var19, x, var21, 0.0F).texture(u1, v2).color(var18);
         var22.vertex(var19, var20, var21, 0.0F).texture(u2, v2).color(var18);
         var22.vertex(var19, var20, y, 0.0F).texture(u2, v1).color(var18);
         BufferRenderer.drawWithGlobalProgram(var22.end());
         drawEnd();
         RenderSystem.setShaderTexture(0, 0);
         matrices.pop();
         RenderSystem.disableBlend();
      }
   }

   public static void drawAnimationSprite(MatrixStack matrices, fB sprite, float x, float y, float width, float height, eb color) {
      if (sprite != null) {
         drawTexture(matrices, sprite.texture(), x, y, width, height, sprite.u1(), sprite.u2(), sprite.v1(), sprite.v2(), color);
      }
   }

   public static void drawSprite(MatrixStack matrices, fv sprite, float x, float y, float width, float height, eb color) {
      drawTexture(
         matrices,
         Mytheria.id(sprite.getTexture().getTexture()),
         x,
         y,
         width,
         height,
         sprite.x / sprite.getTexture().getWidth(),
         (sprite.x + sprite.getTexture().getStep()) / sprite.getTexture().getWidth(),
         0.0F,
         1.0F,
         color
      );
   }

   public static void drawRoundedTexture(MatrixStack matrices, Identifier identifier, float x, float y, float width, float height, BorderRadius borderRadius) {
      drawRoundedTexture(matrices, identifier, x, y, width, height, borderRadius, ec.WHITE);
   }

   public static void drawRoundedTexture(
      MatrixStack matrices, Identifier identifier, float x, float y, float width, float height, BorderRadius borderRadius, eb color
   ) {
      matrices.push();
      Matrix4f var8 = matrices.peek().getPositionMatrix();
      float var9 = 0.5F;
      b.use();
      RenderSystem.setShaderTexture(0, identifier);
      b.findUniform("Size").set(width, height);
      b.findUniform("Radius")
         .set(borderRadius.topLeftRadius(), borderRadius.bottomLeftRadius(), borderRadius.topRightRadius(), borderRadius.bottomRightRadius());
      b.findUniform("Smoothness").set(var9);
      drawSetup();
      float var10 = -var9 / 2.0F + var9 * 2.0F;
      float var11 = var9 / 2.0F + var9;
      float var12 = x - var10 / 2.0F;
      float var13 = y - var11 / 2.0F;
      float var14 = width + var10;
      float var15 = height + var11;
      BufferBuilder var16 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      var16.vertex(var8, var12, var13, 0.0F).texture(0.0F, 0.0F).color(color.getRGB());
      var16.vertex(var8, var12, var13 + var15, 0.0F).texture(0.0F, 1.0F).color(color.getRGB());
      var16.vertex(var8, var12 + var14, var13 + var15, 0.0F).texture(1.0F, 1.0F).color(color.getRGB());
      var16.vertex(var8, var12 + var14, var13, 0.0F).texture(1.0F, 0.0F).color(color.getRGB());
      BufferRenderer.drawWithGlobalProgram(var16.end());
      drawEnd();
      RenderSystem.setShaderTexture(0, 0);
      matrices.pop();
   }

   public static void drawShadow(MatrixStack matrices, float x, float y, float width, float height, float softness, BorderRadius borderRadius, eb color) {
      matrices.push();
      Matrix4f var8 = matrices.peek().getPositionMatrix();
      if (fo.getActive() instanceof fr var9) {
         BufferBuilder var17 = var9.getBuilder();
         float var11 = -softness / 2.0F + softness * 2.0F;
         float var12 = softness / 2.0F + softness;
         float var13 = x - var11 / 2.0F;
         float var14 = y - var12 / 2.0F;
         float var15 = width + var11;
         float var16 = height + var12;
         var17.vertex(var8, var13, var14, 0.0F).color(color.getRGB());
         var17.vertex(var8, var13, var14 + var16, 0.0F).color(color.getRGB());
         var17.vertex(var8, var13 + var15, var14 + var16, 0.0F).color(color.getRGB());
         var17.vertex(var8, var13 + var15, var14, 0.0F).color(color.getRGB());
      } else {
         rectangleProgram.use();
         rectangleProgram.findUniform("Size").set(width, height);
         rectangleProgram.findUniform("Radius")
            .set(
               borderRadius.topLeftRadius() * 3.0F,
               borderRadius.bottomLeftRadius() * 3.0F,
               borderRadius.topRightRadius() * 3.0F,
               borderRadius.bottomRightRadius() * 3.0F
            );
         rectangleProgram.findUniform("Smoothness").set(softness);
         drawSetup();
         float var18 = -softness / 2.0F + softness * 2.0F;
         float var19 = softness / 2.0F + softness;
         float var20 = x - var18 / 2.0F;
         float var21 = y - var19 / 2.0F;
         float var22 = width + var18;
         float var23 = height + var19;
         BufferBuilder var24 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
         var24.vertex(var8, var20, var21, 0.0F).color(color.getRGB());
         var24.vertex(var8, var20, var21 + var23, 0.0F).color(color.getRGB());
         var24.vertex(var8, var20 + var22, var21 + var23, 0.0F).color(color.getRGB());
         var24.vertex(var8, var20 + var22, var21, 0.0F).color(color.getRGB());
         BufferRenderer.drawWithGlobalProgram(var24.end());
         drawEnd();
         matrices.pop();
      }
   }

   public static void drawBlur(
      MatrixStack matrices, float x, float y, float width, float height, float blurRadius, float squirt, BorderRadius borderRadius, eb color
   ) {
      matrices.push();
      Matrix4f var9 = matrices.peek().getPositionMatrix();
      float var10 = 0.03F;
      blurRadius /= 22.5F;
      if (!(blurRadius <= 0.0F)) {
         blurProgram.setBlurOffset(2.0F);
         c.use();
         RenderSystem.setShaderTexture(0, BlurProgram.getTexture());
         c.findUniform("Size").set(width, height);
         c.findUniform("Radius")
            .set(
               borderRadius.topLeftRadius() * squirt / 2.0F,
               borderRadius.bottomLeftRadius() * squirt / 2.0F,
               borderRadius.topRightRadius() * squirt / 2.0F,
               borderRadius.bottomRightRadius() * squirt / 2.0F
            );
         c.findUniform("Smoothness").set(0.1F);
         c.findUniform("CornerSmoothness").set(squirt);
         drawSetup();
         float var11 = -var10 / 2.0F + var10 * 2.0F;
         float var12 = var10 / 2.0F + var10;
         float var13 = x - var11 / 2.0F;
         float var14 = y - var12 / 2.0F;
         float var15 = width + var11;
         float var16 = height + var12;
         int var17 = mc.getWindow().getScaledWidth();
         int var18 = mc.getWindow().getScaledHeight();
         float var19 = var13 / var17;
         float var20 = (var18 - var14 - var16) / var18;
         float var21 = var15 / var17;
         float var22 = var16 / var18;
         BufferBuilder var23 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
         var23.vertex(var9, var13, var14, 0.0F).texture(var19, var20 + var22).color(color.getRGB());
         var23.vertex(var9, var13, var14 + var16, 0.0F).texture(var19, var20).color(color.getRGB());
         var23.vertex(var9, var13 + var15, var14 + var16, 0.0F).texture(var19 + var21, var20).color(color.getRGB());
         var23.vertex(var9, var13 + var15, var14, 0.0F).texture(var19 + var21, var20 + var22).color(color.getRGB());
         BufferRenderer.drawWithGlobalProgram(var23.end());
         drawEnd();
         RenderSystem.setShaderTexture(0, 0);
         matrices.pop();
      }
   }

   public static void drawBlur(MatrixStack matrices, float x, float y, float width, float height, float blurRadius, BorderRadius borderRadius, eb color) {
      matrices.push();
      Matrix4f var8 = matrices.peek().getPositionMatrix();
      blurRadius /= 22.5F;
      if (!(blurRadius <= 0.0F)) {
         blurProgram.setBlurOffset(2.0F);
         b.use();
         RenderSystem.setShaderTexture(0, BlurProgram.getTexture());
         b.findUniform("Size").set(width, height);
         b.findUniform("Radius")
            .set(borderRadius.topLeftRadius(), borderRadius.bottomLeftRadius(), borderRadius.topRightRadius(), borderRadius.bottomRightRadius());
         b.findUniform("Smoothness").set(0.01F);
         drawSetup();
         int var9 = mc.getWindow().getScaledWidth();
         int var10 = mc.getWindow().getScaledHeight();
         float var11 = x / var9;
         float var12 = (var10 - y - height) / var10;
         float var13 = width / var9;
         float var14 = height / var10;
         BufferBuilder var15 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
         var15.vertex(var8, x, y, 0.0F).texture(var11, var12 + var14).color(color.getRGB());
         var15.vertex(var8, x, y + height, 0.0F).texture(var11, var12).color(color.getRGB());
         var15.vertex(var8, x + width, y + height, 0.0F).texture(var11 + var13, var12).color(color.getRGB());
         var15.vertex(var8, x + width, y, 0.0F).texture(var11 + var13, var12 + var14).color(color.getRGB());
         BufferRenderer.drawWithGlobalProgram(var15.end());
         drawEnd();
         RenderSystem.setShaderTexture(0, 0);
         matrices.pop();
      }
   }

   public static void drawImage(MatrixStack matrices, BufferBuilder builder, double x, double y, double z, double width, double height, eb color) {
      Matrix4f var13 = matrices.peek().getPositionMatrix();
      builder.vertex(var13, (float)x, (float)(y + height), (float)z).texture(0.0F, 1.0F).color(color.getRGB());
      builder.vertex(var13, (float)(x + width), (float)(y + height), (float)z).texture(1.0F, 1.0F).color(color.getRGB());
      builder.vertex(var13, (float)(x + width), (float)y, (float)z).texture(1.0F, 0.0F).color(color.getRGB());
      builder.vertex(var13, (float)x, (float)y, (float)z).texture(0.0F, 0.0F).color(color.getRGB());
   }

   public static void drawImage(MatrixStack matrices, Identifier identifier, double x, double y, double z, double width, double height, eb color) {
      RenderSystem.setShaderTexture(0, identifier);
      BufferBuilder var13 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      Matrix4f var14 = matrices.peek().getPositionMatrix();
      var13.vertex(var14, (float)x, (float)(y + height), (float)z).texture(0.0F, 1.0F).color(color.getRGB());
      var13.vertex(var14, (float)(x + width), (float)(y + height), (float)z).texture(1.0F, 1.0F).color(color.getRGB());
      var13.vertex(var14, (float)(x + width), (float)y, (float)z).texture(1.0F, 0.0F).color(color.getRGB());
      var13.vertex(var14, (float)x, (float)y, (float)z).texture(0.0F, 0.0F).color(color.getRGB());
      BufferRenderer.drawWithGlobalProgram(var13.end());
   }

   public static void drawPlayerHeadWithHat(
      MatrixStack matrices, AbstractClientPlayerEntity player, float x, float y, float size, BorderRadius borderRadius, eb color
   ) {
      Identifier var7 = player.getSkinTextures().texture();
      drawPlayerHeadWithRoundedShader(matrices, var7, x, y, size, borderRadius, color);
      a(matrices, var7, x, y, size, borderRadius, color);
   }

   public static <T extends LivingEntity, S extends LivingEntityRenderState, M extends EntityModel<? super S>> void drawEntityHeadWithHat(
      MatrixStack matrices, T entity, float x, float y, float size, BorderRadius borderRadius, eb color
   ) {
      EntityRenderer var7 = mc.getEntityRenderDispatcher().getRenderer(entity);
      if (var7 instanceof LivingEntityRenderer var8) {
         LivingEntityRenderer var9 = (LivingEntityRenderer)var7;
         LivingEntityRenderState var10 = (LivingEntityRenderState)var9.createRenderState();
         Identifier var11 = var9.getTexture(var10);
         drawPlayerHeadWithRoundedShader(matrices, var11, x, y, size, borderRadius, color);
         a(matrices, var11, x, y, size, borderRadius, color);
      }
   }

   public static void drawPlayerHeadWithRoundedShader(
      MatrixStack matrices, Identifier skinTexture, float x, float y, float size, BorderRadius borderRadius, eb color
   ) {
      drawRoundedTextureWithUV(matrices, skinTexture, x, y, size, size, borderRadius, color, 0.125F, 0.125F, 0.25F, 0.25F);
   }

   private static void a(MatrixStack matrices, Identifier skinTexture, float x, float y, float size, BorderRadius borderRadius, eb color) {
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      drawRoundedTextureWithUV(matrices, skinTexture, x, y, size, size, borderRadius, color, 0.625F, 0.125F, 0.75F, 0.25F);
      RenderSystem.disableBlend();
   }

   public static void drawRoundedTextureWithUV(
      MatrixStack matrices,
      Identifier identifier,
      float x,
      float y,
      float width,
      float height,
      BorderRadius borderRadius,
      eb color,
      float u1,
      float v1,
      float u2,
      float v2
   ) {
      matrices.push();
      Matrix4f var12 = matrices.peek().getPositionMatrix();
      float var13 = 0.5F;
      b.use();
      RenderSystem.setShaderTexture(0, identifier);
      b.findUniform("Size").set(width, height);
      b.findUniform("Radius")
         .set(borderRadius.topLeftRadius(), borderRadius.bottomLeftRadius(), borderRadius.topRightRadius(), borderRadius.bottomRightRadius());
      b.findUniform("Smoothness").set(var13);
      drawSetup();
      float var14 = -var13 / 2.0F + var13 * 2.0F;
      float var15 = var13 / 2.0F + var13;
      float var16 = x - var14 / 2.0F;
      float var17 = y - var15 / 2.0F;
      float var18 = width + var14;
      float var19 = height + var15;
      BufferBuilder var20 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      var20.vertex(var12, var16, var17, 0.0F).texture(u1, v1).color(color.getRGB());
      var20.vertex(var12, var16, var17 + var19, 0.0F).texture(u1, v2).color(color.getRGB());
      var20.vertex(var12, var16 + var18, var17 + var19, 0.0F).texture(u2, v2).color(color.getRGB());
      var20.vertex(var12, var16 + var18, var17, 0.0F).texture(u2, v1).color(color.getRGB());
      BufferRenderer.drawWithGlobalProgram(var20.end());
      drawEnd();
      RenderSystem.setShaderTexture(0, 0);
      matrices.pop();
   }

   public static void drawSetup() {
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
   }

   public static void drawEnd() {
      RenderSystem.disableBlend();
   }

   @Generated
   public static GlProgram getSquircleProgram() {
      return a;
   }
}
