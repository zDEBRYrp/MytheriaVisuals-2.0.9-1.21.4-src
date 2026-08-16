package nesquik.mytheria.framework.shader.impl;

import nesquik.mytheria.framework.shader.GlProgram;
import nesquik.mytheria.utility.interfaces.IWindow;
import net.minecraft.client.gl.GlUniform;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.util.Identifier;
import ru.kotopushka.compiler.sdk.annotations.CompileBytecode;

public class KawaseBlurProgram extends GlProgram implements IWindow {
   private GlUniform resolutionUniform;
   private GlUniform offsetUniform;
   private GlUniform saturationUniform;
   private GlUniform tintIntensityUniform;
   private GlUniform tintColorUniform;

   public KawaseBlurProgram(Identifier identifier) {
      super(identifier, VertexFormats.POSITION_TEXTURE_COLOR);
   }

   @CompileBytecode
   public void updateUniforms(float offset) {
      if (this.offsetUniform != null
         && this.resolutionUniform != null
         && this.saturationUniform != null
         && this.tintIntensityUniform != null
         && this.tintColorUniform != null) {
         this.offsetUniform.set(offset);
         this.resolutionUniform.set(1.0F / mw.getScaledWidth(), 1.0F / mw.getScaledHeight());
         this.saturationUniform.set(1.0F);
         this.tintIntensityUniform.set(0.0F);
         this.tintColorUniform.set(1.0F, 1.0F, 1.0F);
      }
   }

   public void updateUniforms(float offset, int textureWidth, int textureHeight) {
      if (this.offsetUniform != null
         && this.resolutionUniform != null
         && this.saturationUniform != null
         && this.tintIntensityUniform != null
         && this.tintColorUniform != null) {
         this.offsetUniform.set(offset);
         float var4 = textureWidth > 0 ? 1.0F / textureWidth : 0.0F;
         float var5 = textureHeight > 0 ? 1.0F / textureHeight : 0.0F;
         this.resolutionUniform.set(var4, var5);
         this.saturationUniform.set(1.0F);
         this.tintIntensityUniform.set(0.0F);
         this.tintColorUniform.set(1.0F, 1.0F, 1.0F);
      }
   }

   @Override
   public void setup() {
      this.resolutionUniform = this.findUniform("Resolution");
      this.offsetUniform = this.findUniform("Offset");
      this.saturationUniform = this.findUniform("Saturation");
      this.tintIntensityUniform = this.findUniform("TintIntensity");
      this.tintColorUniform = this.findUniform("TintColor");
      super.setup();
   }
}
