package nesquik.mytheria.framework.shader.impl;

import a.uc.fO;
import a.fh;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.mojang.blaze3d.systems.RenderSystem;
import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import nesquik.mytheria.utility.interfaces.IWindow;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import ru.kotopushka.compiler.sdk.annotations.Compile;

public class BlurProgram implements IMinecraft, IWindow {
   private static final Framebuffer MAIN_FBO = mc.getFramebuffer();
   public static final Supplier<fh> CACHE = Suppliers.memoize(() -> new fh(false).setLinear());
   public static final Supplier<fh> BUFFER = Suppliers.memoize(() -> new fh(false).setLinear());
   private final fO timer = new fO();
   private static KawaseBlurProgram kawaseDownProgram;
   private static KawaseBlurProgram kawaseUpProgram;
   private float blurOffset = 1.0F;
   private float blurDownscale = 0.5F;

   /**
    * Инициализирует шейдеры kawase blur (down и up).
    */
   @Compile
   public void initShaders() {
      kawaseDownProgram = new KawaseBlurProgram(Mytheria.id("kawase_down/data"));
      kawaseUpProgram = new KawaseBlurProgram(Mytheria.id("kawase_up/data"));
   }

   /**
    * Выполняет multi-pass Kawase blur (downsample + upsample) к текущему фреймбуферу.
    */
   public void draw() {
      if (this.timer.finished(25L)) {
         if (kawaseDownProgram == null || kawaseUpProgram == null) {
            return;
         }

         this.blurOffset = 1.0F;
         fh var1 = (fh)CACHE.get();
         fh var2 = (fh)BUFFER.get();
         if (var1 == null || var2 == null) {
            return;
         }

         var1.setDownscale(this.blurDownscale).setLinear();
         var2.setDownscale(this.blurDownscale).setLinear();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         kawaseDownProgram.use();
         kawaseDownProgram.updateUniforms(this.blurOffset, MAIN_FBO.textureWidth, MAIN_FBO.textureHeight);
         var1.setup();
         MAIN_FBO.beginRead();
         RenderSystem.setShaderTexture(0, MAIN_FBO.getColorAttachment());
         this.drawQuad(0.0F, 0.0F, mw.getScaledWidth(), mw.getScaledHeight());
         var1.stop();
         fh[] var3 = new fh[]{var1, var2};
         byte var4 = 3;

         for (int var5 = 1; var5 < 3; var5++) {
            int var6 = var5 % 2;
            var3[var6].setup();
            var3[(var6 + 1) % 2].beginRead();
            RenderSystem.setShaderTexture(0, var3[(var6 + 1) % 2].getColorAttachment());
            kawaseDownProgram.updateUniforms(this.blurOffset, var3[(var6 + 1) % 2].textureWidth, var3[(var6 + 1) % 2].textureHeight);
            this.drawQuad(0.0F, 0.0F, mw.getScaledWidth(), mw.getScaledHeight());
            var3[(var6 + 1) % 2].endRead();
            var3[var6].stop();
         }

         kawaseUpProgram.use();

         for (int var7 = 0; var7 < 3; var7++) {
            int var8 = var7 % 2;
            var3[(var8 + 1) % 2].setup();
            var3[var8].beginRead();
            RenderSystem.setShaderTexture(0, var3[var8].getColorAttachment());
            kawaseUpProgram.updateUniforms(this.blurOffset, var3[var8].textureWidth, var3[var8].textureHeight);
            this.drawQuad(0.0F, 0.0F, mw.getScaledWidth(), mw.getScaledHeight());
            var3[var8].endRead();
            var3[var8].stop();
         }

         MAIN_FBO.endRead();
         MAIN_FBO.beginWrite(false);
         RenderSystem.setShaderTexture(0, 0);
         RenderSystem.disableBlend();
      }
   }

   /**
    * Рисует текстурированный квад (POSITION_TEXTURE_COLOR).
    */
   private void drawQuad(float x, float y, float width, float height) {
      byte var5 = -1;
      BufferBuilder var6 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      var6.vertex(x, y, 0.0F).texture(0.0F, 1.0F).color(var5);
      var6.vertex(x, y + height, 0.0F).texture(0.0F, 0.0F).color(var5);
      var6.vertex(x + width, y + height, 0.0F).texture(1.0F, 0.0F).color(var5);
      var6.vertex(x + width, y, 0.0F).texture(1.0F, 1.0F).color(var5);
      BufferRenderer.drawWithGlobalProgram(var6.end());
   }

   /**
    * Возвращает ID текстуры размытого буфера.
    */
   public static int getTexture() {
      return ((fh)BUFFER.get()).getColorAttachment();
   }

   /**
    * Устанавливает смещение размытия.
    */
   @Generated
   public void setBlurOffset(float blurOffset) {
      this.blurOffset = blurOffset;
   }

   /**
    * Устанавливает коэффициент уменьшения разрешения.
    */
   @Generated
   public void setBlurDownscale(float blurDownscale) {
      this.blurDownscale = blurDownscale;
   }
}
