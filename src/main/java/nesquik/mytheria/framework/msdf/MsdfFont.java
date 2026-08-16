package nesquik.mytheria.framework.msdf;

import a.uc.aZ;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import nesquik.mytheria.Mytheria;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.joml.Matrix4f;

public final class MsdfFont {
   private final String name;
   private final AbstractTexture texture;
   private final FontData.AtlasData atlas;
   private final FontData.MetricsData metrics;
   private final Map<Integer, MsdfGlyph> glyphs;
   private final Map<Integer, Map<Integer, Float>> kernings;
   private final ConcurrentHashMap<Long, Float> widthCache = new ConcurrentHashMap<>();

   MsdfFont(
      String name,
      AbstractTexture texture,
      FontData.AtlasData atlas,
      FontData.MetricsData metrics,
      Map<Integer, MsdfGlyph> glyphs,
      Map<Integer, Map<Integer, Float>> kernings
   ) {
      this.name = name;
      this.texture = texture;
      this.atlas = atlas;
      this.metrics = metrics;
      this.glyphs = glyphs;
      this.kernings = kernings;
   }

   public int getTextureId() {
      return this.texture.getGlId();
   }

   public void applyGlyphs(
      Matrix4f matrix, VertexConsumer consumer, String text, float size, float thickness, float spacing, float x, float y, float z, int color
   ) {
      int var11 = -1;
      boolean var12 = false;

      for (int var13 = 0; var13 < text.length(); var13++) {
         char var14 = text.charAt(var13);
         if (var12) {
            var12 = false;
         } else if (var14 == 167) {
            var12 = true;
         } else {
            MsdfGlyph var15 = this.glyphs.get(Integer.valueOf(var14));
            if (var15 != null) {
               Map<Integer, Float> var16 = this.kernings.get(var11);
               if (var16 != null) {
                  x += var16.getOrDefault(Integer.valueOf(var14), 0.0F) * size;
               }

               x += var15.apply(matrix, consumer, size, x, y, z, color) + thickness + spacing;
               var11 = var14;
            }
         }
      }
   }

   public float getWidthOld(String text, float size) {
      text = text.replace("і", "i").replace("І", "I");
      int var3 = -1;
      float var4 = 0.0F;
      boolean var5 = false;
      aZ var6 = Mytheria.getInstance().getModuleManager().getModule(aZ.class);
      if (var6.isEnabled()) {
         text = var6.patchName(text);
      }

      for (int var7 = 0; var7 < text.length(); var7++) {
         char var8 = text.charAt(var7);
         if (var5) {
            var5 = false;
         } else if (var8 == 167) {
            var5 = true;
         } else {
            MsdfGlyph var9 = this.glyphs.get(Integer.valueOf(var8));
            if (var9 != null) {
               Map<Integer, Float> var10 = this.kernings.get(var3);
               if (var10 != null) {
                  var4 += var10.getOrDefault(Integer.valueOf(var8), 0.0F) * size;
               }

               var4 += var9.getWidth(size) + 0.25F;
               var3 = var8;
            }
         }
      }

      return var4;
   }

   private static long widthKey(String s, float size, boolean np) {
      int var3 = s.hashCode();
      return var3 & 4294967295L ^ (long)Float.floatToIntBits(size) << 32 ^ (np ? -7046029254386353131L : 0L);
   }

   public float getWidth(String text, float size) {
      text = text.replace("і", "i").replace("І", "I");
      aZ var3 = Mytheria.getInstance().getModuleManager().getModule(aZ.class);
      boolean var4 = var3.isEnabled();
      if (var4) {
         text = var3.patchName(text);
      }

      long var5 = widthKey(text, size, var4);
      Float var7 = this.widthCache.get(var5);
      if (var7 != null) {
         return var7;
      }

      float var8 = this.getWidthOld(text, size);
      this.widthCache.put(var5, var8);
      return var8;
   }

   public void clearWidthCache() {
      this.widthCache.clear();
   }

   public float getTextWidth(Text text, float size) {
      return this.getWidth(text.getString(), size);
   }

   public Font getFont(float size) {
      return new Font(this, size);
   }

   public String getName() {
      return this.name;
   }

   public FontData.AtlasData getAtlas() {
      return this.atlas;
   }

   public FontData.MetricsData getMetrics() {
      return this.metrics;
   }

   public static MsdfFont.Builder builder() {
      return new MsdfFont.Builder();
   }

   public static class Builder {
      private String name = "?";
      private Identifier dataIdentifer;
      private Identifier atlasIdentifier;

      Builder() {
      }

      public MsdfFont.Builder name(String name) {
         this.name = name;
         return this;
      }

      public MsdfFont.Builder data(String dataFileName) {
         this.dataIdentifer = Identifier.of(Mytheria.MOD_ID, "fonts/msdf/" + dataFileName + ".json");
         return this;
      }

      public MsdfFont.Builder atlas(String atlasFileName) {
         this.atlasIdentifier = Identifier.of(Mytheria.MOD_ID, "fonts/msdf/" + atlasFileName + ".png");
         return this;
      }

      public MsdfFont build() {
         FontData var1 = ResourceProvider.fromJsonToInstance(this.dataIdentifer, FontData.class);
         AbstractTexture var2 = MinecraftClient.getInstance().getTextureManager().getTexture(this.atlasIdentifier);
         if (var1 == null) {
            throw new RuntimeException(
               "Failed to read font data file: "
                  + this.dataIdentifer.toString()
                  + "; Are you sure this is json file? Try to check the correctness of its syntax."
            );
         }

         RenderSystem.recordRenderCall(() -> var2.setFilter(true, false));
         float var3 = var1.atlas().width();
         float var4 = var1.atlas().height();
         Map var5 = var1.glyphs().stream().collect(Collectors.toMap(glyphData -> glyphData.unicode(), glyphData -> new MsdfGlyph(glyphData, var3, var4)));
         HashMap var6 = new HashMap();
         var1.kernings().forEach(kerning -> {
            Map var2x = (Map)var6.get(kerning.leftChar());
            if (var2x == null) {
               var2x = new HashMap();
               var6.put(kerning.leftChar(), var2x);
            }

            var2x.put(kerning.rightChar(), kerning.advance());
         });
         return new MsdfFont(this.name, var2, var1.atlas(), var1.metrics(), var5, var6);
      }
   }
}
