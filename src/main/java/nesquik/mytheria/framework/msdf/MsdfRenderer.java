package nesquik.mytheria.framework.msdf;

import a.uc.aZ;
import a.ec;
import a.fo;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import lombok.Generated;
import nesquik.mytheria.Mytheria;
import net.minecraft.client.gl.Defines;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BuiltBuffer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.text.Text;
import org.joml.Matrix4f;
import org.joml.Vector4f;

public final class MsdfRenderer {
   public static final ShaderProgramKey MSDF_FONT_SHADER_KEY = new ShaderProgramKey(
      ResourceProvider.getShaderIdentifier("msdf_font/data"), VertexFormats.POSITION_TEXTURE_COLOR, Defines.EMPTY
   );

   public static void renderText(MsdfFont font, String text, float size, int color, Matrix4f matrix, float x, float y, float z) {
      renderText(font, text, size, color, matrix, x, y, z, false, 0.0F, 1.0F, 0.0F);
   }

   public static void renderText(
      MsdfFont font,
      String text,
      float size,
      int color,
      Matrix4f matrix,
      float x,
      float y,
      float z,
      boolean enableFadeout,
      float fadeoutStart,
      float fadeoutEnd,
      float maxWidth
   ) {
      text = text.replace("і", "i").replace("І", "I");
      float var12 = 0.05F;
      float var13 = 0.5F;
      float var14 = 0.0F;
      aZ var15 = Mytheria.getInstance().getModuleManager().getModule(aZ.class);
      if (var15.isEnabled()) {
         text = var15.patchName(text);
      }

      Vector4f var16 = matrix.transform(new Vector4f(x, y, z, 1.0F));
      float var17 = var16.x;
      Vector4f var18 = matrix.transform(new Vector4f(x + maxWidth, y, z, 1.0F));
      float var19 = var18.x - var17;
      if (fo.getActive() != null) {
         font.applyGlyphs(matrix, fo.getActive().getBuilder(), text, size, var12 * 0.5F * size, var14, x - 0.75F, y + size * 0.7F, z, color);
      } else {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.disableCull();
         RenderSystem.setShaderTexture(0, font.getTextureId());
         ShaderProgram var20 = RenderSystem.setShader(MSDF_FONT_SHADER_KEY);
         var20.getUniform("Range").set(font.getAtlas().range());
         var20.getUniform("Thickness").set(var12);
         var20.getUniform("Smoothness").set(var13);
         var20.getUniform("EnableFadeout").set(enableFadeout ? 1 : 0);
         var20.getUniform("FadeoutStart").set(fadeoutStart);
         var20.getUniform("FadeoutEnd").set(fadeoutEnd);
         var20.getUniform("MaxWidth").set(var19);
         var20.getUniform("TextPosX").set(var17);
         BufferBuilder var21 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
         font.applyGlyphs(matrix, var21, text, size, var12 * 0.5F * size, var14, x - 0.75F, y + size * 0.7F, z, color);
         BuiltBuffer var22 = var21.endNullable();
         if (var22 != null) {
            BufferRenderer.drawWithGlobalProgram(var22);
         }

         RenderSystem.setShaderTexture(0, 0);
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
      }
   }

   public static void renderText(
      MsdfFont font,
      String text,
      float size,
      int color,
      Matrix4f matrix,
      float x,
      float y,
      float z,
      boolean enableFadeout,
      float fadeoutStart,
      float fadeoutEnd
   ) {
      float var11 = font.getWidth(text, size) * 2.0F;
      renderText(font, text, size, color, matrix, x, y, z, enableFadeout, fadeoutStart, fadeoutEnd, var11);
   }

   public static void renderText(MsdfFont font, Text text, float size, Matrix4f matrix, float x, float y, float z) {
      renderText(font, text, size, matrix, x, y, z, false, 0.0F, 1.0F, 0.0F);
   }

   public static void renderText(
      MsdfFont font,
      Text text,
      float size,
      Matrix4f matrix,
      float x,
      float y,
      float z,
      boolean enableFadeout,
      float fadeoutStart,
      float fadeoutEnd,
      float maxWidth
   ) {
      float var11 = 0.05F;
      float var12 = 0.5F;
      float var13 = 0.0F;
      List<FormattedTextProcessor.TextSegment> var14 = FormattedTextProcessor.processText(text, ec.WHITE.getRGB());
      float var15 = x;
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableCull();
      RenderSystem.setShaderTexture(0, font.getTextureId());
      ShaderProgram var16 = RenderSystem.setShader(MSDF_FONT_SHADER_KEY);
      var16.getUniform("Range").set(font.getAtlas().range());
      var16.getUniform("Thickness").set(var11);
      var16.getUniform("Smoothness").set(var12);
      var16.getUniform("EnableFadeout").set(enableFadeout ? 1 : 0);
      var16.getUniform("FadeoutStart").set(fadeoutStart);
      var16.getUniform("FadeoutEnd").set(fadeoutEnd);
      var16.getUniform("MaxWidth").set(maxWidth);
      var16.getUniform("TextPosX").set(x);
      BufferBuilder var17 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);

      for (FormattedTextProcessor.TextSegment var19 : var14) {
         font.applyGlyphs(matrix, var17, var19.text, size, var11 * 0.5F * size, var13 - 0.3F, var15 - 0.75F, y + size * 0.7F, z, var19.color);
         var15 += font.getWidth(var19.text, size);
      }

      BuiltBuffer var20 = var17.endNullable();
      if (var20 != null) {
         BufferRenderer.drawWithGlobalProgram(var20);
      }

      RenderSystem.setShaderTexture(0, 0);
      RenderSystem.enableCull();
      RenderSystem.disableBlend();
   }

   public static void renderText(
      MsdfFont font, Text text, float size, Matrix4f matrix, float x, float y, float z, boolean enableFadeout, float fadeoutStart, float fadeoutEnd
   ) {
      float var10 = font.getTextWidth(text, size) * 2.0F;
      renderText(font, text, size, matrix, x, y, z, enableFadeout, fadeoutStart, fadeoutEnd, var10);
   }

   @Generated
   private MsdfRenderer() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
