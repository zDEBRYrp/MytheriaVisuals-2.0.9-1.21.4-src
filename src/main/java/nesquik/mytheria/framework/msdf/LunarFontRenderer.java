package nesquik.mytheria.framework.msdf;

import org.joml.Matrix4f;

public class LunarFontRenderer {
   public static void renderText(MsdfFont font, String text, float size, int color, Matrix4f matrix, float x, float y, float z) {
      MsdfRenderer.renderText(font, text, size, color, matrix, x, y, z);
   }

   public static void renderText(
      MsdfFont font, String text, float size, int color, Matrix4f matrix, float x, float y, float z, boolean fadeout, float fadeoutStart, float fadeoutEnd
   ) {
      MsdfRenderer.renderText(font, text, size, color, matrix, x, y, z, fadeout, fadeoutStart, fadeoutEnd);
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
      boolean fadeout,
      float fadeoutStart,
      float fadeoutEnd,
      float maxWidth
   ) {
      MsdfRenderer.renderText(font, text, size, color, matrix, x, y, z, fadeout, fadeoutStart, fadeoutEnd, maxWidth);
   }
}
