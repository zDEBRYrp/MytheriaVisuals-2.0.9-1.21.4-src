package nesquik.mytheria.framework.msdf;

import net.minecraft.client.render.VertexConsumer;
import org.joml.Matrix4f;

public final class MsdfGlyph {
   private final int code;
   private final float minU;
   private final float maxU;
   private final float minV;
   private final float maxV;
   private final float advance;
   private final float topPosition;
   private final float width;
   private final float height;

   public MsdfGlyph(FontData.GlyphData data, float atlasWidth, float atlasHeight) {
      this.code = data.unicode();
      this.advance = data.advance();
      FontData.BoundsData var4 = data.atlasBounds();
      if (var4 != null) {
         this.minU = var4.left() / atlasWidth;
         this.maxU = var4.right() / atlasWidth;
         this.minV = 1.0F - var4.top() / atlasHeight;
         this.maxV = 1.0F - var4.bottom() / atlasHeight;
      } else {
         this.minU = this.maxU = this.minV = this.maxV = 0.0F;
      }

      FontData.BoundsData var5 = data.planeBounds();
      if (var5 != null) {
         this.width = var5.right() - var5.left();
         this.height = var5.top() - var5.bottom();
         this.topPosition = var5.top();
      } else {
         this.width = this.height = this.topPosition = 0.0F;
      }
   }

   public float apply(Matrix4f matrix, VertexConsumer consumer, float size, float x, float y, float z, int color) {
      y -= this.topPosition * size;
      float var8 = this.width * size;
      float var9 = this.height * size;
      consumer.vertex(matrix, x, y, z).texture(this.minU, this.minV).color(color);
      consumer.vertex(matrix, x, y + var9, z).texture(this.minU, this.maxV).color(color);
      consumer.vertex(matrix, x + var8, y + var9, z).texture(this.maxU, this.maxV).color(color);
      consumer.vertex(matrix, x + var8, y, z).texture(this.maxU, this.minV).color(color);
      return this.advance * size;
   }

   public float getWidth(float size) {
      return this.advance * size;
   }

   public int getCharCode() {
      return this.code;
   }
}
