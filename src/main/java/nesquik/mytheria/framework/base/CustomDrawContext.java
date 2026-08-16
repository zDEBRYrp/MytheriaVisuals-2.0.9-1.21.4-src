package nesquik.mytheria.framework.base;

import a.uc.bJ;
import a.eb;
import a.ec;
import a.et;
import a.fj;
import a.fv;
import a.fw;
import com.mojang.blaze3d.systems.RenderSystem;
import nesquik.mytheria.framework.msdf.Font;
import nesquik.mytheria.framework.msdf.LunarFontRenderer;
import nesquik.mytheria.framework.msdf.MsdfRenderer;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.gradient.Gradient;
import nesquik.mytheria.mixin.accessors.DrawContextAccessor;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import nesquik.mytheria.utility.interfaces.IScaledResolution;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.DiffuseLighting;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.render.item.ItemRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ModelTransformationMode;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.crash.CrashException;
import net.minecraft.util.crash.CrashReport;
import net.minecraft.util.crash.CrashReportSection;
import net.minecraft.util.math.Vec2f;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class CustomDrawContext extends DrawContext implements IMinecraft {
   private final DrawContext originalContext;

   protected CustomDrawContext(DrawContext originalContext) {
      super(MinecraftClient.getInstance(), ((DrawContextAccessor)originalContext).getVertexConsumers());
      this.originalContext = originalContext;
   }

   public MatrixStack getMatrices() {
      return this.originalContext.getMatrices();
   }

   public int getScaledWindowWidth() {
      return (int)IScaledResolution.sr.getScaledWidth();
   }

   public int getScaledWindowHeight() {
      return (int)IScaledResolution.sr.getScaledHeight();
   }

   public static CustomDrawContext of(DrawContext originalContext) {
      return new CustomDrawContext(originalContext);
   }

   public void drawClientRect(float x, float y, float width, float height, float alpha, float dragAnim, float squircle) {
      boolean var8 = bJ.showMinimalizm();
      boolean var9 = bJ.showGlass();
      boolean var10 = et.isLunarClient();
      if (var10) {
         this.drawRoundedRect(x, y, width, height, BorderRadius.all(8.0F), bJ.getBackgroundColor().withAlpha(255.0F * alpha));
      } else {
         if (var9) {
            this.drawLiquidGlass(
               x,
               y,
               width,
               height,
               bJ.getGlassBlur(),
               bJ.getDistortion() - 0.07F * dragAnim,
               BorderRadius.all(8.0F),
               ec.getLiquidGlassColor().withAlpha(255.0F * alpha * bJ.getGlassAlpha())
            );
            this.drawRoundedRect(x, y, width, height, BorderRadius.all(8.0F), ec.getBackgroundColor().withAlpha(255.0F * (0.8F - 0.6F * bJ.glass()) * alpha));
         } else {
            this.drawBlurredRect(x, y, width, height, 11.25F, squircle, BorderRadius.all(8.0F), eb.WHITE.withAlpha(255.0F * alpha * bJ.minimalizm()));
            this.drawRoundedRect(x, y, width, height, BorderRadius.all(8.0F), bJ.getBackgroundColor());
         }
      }
   }

   public void pushMatrix() {
      this.getMatrices().push();
   }

   public void popMatrix() {
      this.getMatrices().pop();
   }

   public void drawRect(float x, float y, float width, float height, eb color) {
      fj.drawRect(this.getMatrices(), x, y, width, height, color);
   }

   public void drawLine(Vec2f from, Vec2f to, eb color) {
      fj.drawLine(this.getMatrices(), from, to, color);
   }

   public void drawBezier(Vec2f p0, Vec2f p1, Vec2f p2, Vec2f p3, eb color, int resolution) {
      fj.drawBezier(this.getMatrices(), p0, p1, p2, p3, color, resolution);
   }

   public void drawSquircle(float x, float y, float width, float height, float squirt, BorderRadius borderRadius, eb color) {
      fj.drawSquircle(this.getMatrices(), x, y, width, height, squirt, borderRadius, color);
   }

   public void drawRoundedRect(float x, float y, float width, float height, BorderRadius borderRadius, eb color) {
      fj.drawRoundedRect(this.getMatrices(), x, y, width, height, borderRadius, color);
   }

   public void drawHardRoundedRect(float x, float y, float width, float height, BorderRadius borderRadius, eb color) {
      fj.drawHardRoundedRect(this.getMatrices(), x, y, width, height, borderRadius, color);
   }

   public void drawRoundedRect(float x, float y, float width, float height, BorderRadius borderRadius, Gradient gradient) {
      fj.drawRoundedRect(this.getMatrices(), x, y, width, height, borderRadius, gradient);
   }

   public void drawLiquidGlass(float x, float y, float width, float height, float squirt, float power, BorderRadius borderRadius, eb color) {
      fj.drawLiquidGlass(
         this.getMatrices(),
         x - 5.0F * bJ.minimalizm(),
         y - 5.0F * bJ.minimalizm(),
         width + 10.0F * bJ.minimalizm(),
         height + 10.0F * bJ.minimalizm(),
         borderRadius,
         color,
         color.getAlpha() / 255.0F * bJ.glass(),
         (height == 240.0F ? 100 : 50) * bJ.glass(),
         color.withAlpha(255.0F),
         1.0F,
         true,
         0.0F,
         power * bJ.glass(),
         2.0F,
         false
      );
   }

   public void drawLiquidGlass(float x, float y, float width, float height, float squirt, BorderRadius borderRadius, eb color, boolean clean) {
      fj.drawLiquidGlass(
         this.getMatrices(),
         x,
         y,
         width,
         height,
         borderRadius,
         color,
         color.getAlpha() / 255.0F,
         height == 240.0F ? 100.0F : 50.0F,
         color.withAlpha(255.0F),
         1.0F,
         true,
         0.0F,
         0.08F,
         2.0F,
         clean
      );
   }

   public void drawLoadingRect(float x, float y, float width, float height, float progress, BorderRadius borderRadius, eb color) {
      fj.drawLoadingRect(this.getMatrices(), x, y, width, height, progress, borderRadius, color);
   }

   public void drawRoundedBorder(float x, float y, float width, float height, float borderThickness, BorderRadius borderRadius, eb borderColor) {
      fj.drawRoundedBorder(this.getMatrices(), x, y, width, height, borderThickness, borderRadius, borderColor);
   }

   public void drawTexture(Identifier identifier, fw rect) {
      this.drawTexture(identifier, rect, eb.WHITE);
   }

   public void drawTexture(Identifier identifier, fw rect, eb color) {
      fj.drawTexture(this.getMatrices(), identifier, rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight(), color);
   }

   public void drawTexture(Identifier identifier, float x, float y, float width, float height) {
      fj.drawTexture(this.getMatrices(), identifier, x, y, width, height, eb.WHITE);
   }

   public void drawTexture(Identifier identifier, float x, float y, float width, float height, float u1, float u2, float v1, float v2, eb color) {
      fj.drawTexture(this.getMatrices(), identifier, x, y, width, height, u1, u2, v1, v2, color);
   }

   public void drawTexture(Identifier identifier, float x, float y, float width, float height, eb textureColor) {
      fj.drawTexture(this.getMatrices(), identifier, x, y, width, height, textureColor);
   }

   public void drawTextureSmooth(Identifier identifier, float x, float y, float width, float height, eb textureColor) {
      fj.drawTextureSmooth(this.getMatrices(), identifier, x, y, width, height, textureColor);
   }

   public void drawSprite(fv sprite, float x, float y, float width, float height, eb textureColor) {
      fj.drawSprite(this.getMatrices(), sprite, x, y, width, height, textureColor);
   }

   public void drawRoundedTextureWithUV(
      Identifier identifier, float x, float y, float width, float height, BorderRadius borderRadius, eb color, float u1, float v1, float u2, float v2
   ) {
      fj.drawRoundedTextureWithUV(this.getMatrices(), identifier, x, y, width, height, borderRadius, color, u1, v1, u2, v2);
   }

   public void drawRoundedTexture(Identifier identifier, float x, float y, float width, float height, BorderRadius borderRadius) {
      fj.drawRoundedTexture(this.getMatrices(), identifier, x, y, width, height, borderRadius);
   }

   public void drawRoundedTexture(Identifier identifier, float x, float y, float width, float height, BorderRadius borderRadius, eb color) {
      fj.drawRoundedTexture(this.getMatrices(), identifier, x, y, width, height, borderRadius, color);
   }

   public void drawShadow(float x, float y, float width, float height, float softness, BorderRadius borderRadius, eb color) {
      fj.drawShadow(this.getMatrices(), x, y, width, height, softness, borderRadius, color);
   }

   public void drawBlurredRect(float x, float y, float width, float height, float blurRadius, BorderRadius borderRadius, eb color) {
      fj.drawBlur(this.getMatrices(), x, y, width, height, blurRadius, borderRadius, color);
   }

   public void drawBlurredRect(float x, float y, float width, float height, float blurRadius, float squirt, BorderRadius borderRadius, eb color) {
      fj.drawBlur(this.getMatrices(), x, y, width, height, blurRadius, squirt, borderRadius, color);
   }

   public void drawText(Font font, String text, float x, float y, eb color) {
      if (et.isLunarClient()) {
         LunarFontRenderer.renderText(font.getFont(), text, font.getSize(), color.getRGB(), this.getMatrices().peek().getPositionMatrix(), x, y, 0.0F);
      } else {
         MsdfRenderer.renderText(font.getFont(), text, font.getSize(), color.getRGB(), this.getMatrices().peek().getPositionMatrix(), x, y, 0.0F);
      }
   }

   public void drawText(Font font, Text text, float x, float y) {
      if (et.isLunarClient()) {
         LunarFontRenderer.renderText(font.getFont(), text.getString(), font.getSize(), -1, this.getMatrices().peek().getPositionMatrix(), x, y, 0.0F);
      } else {
         MsdfRenderer.renderText(font.getFont(), text, font.getSize(), this.getMatrices().peek().getPositionMatrix(), x, y, 0.0F);
      }
   }

   public void drawFadeoutText(Font font, String text, float x, float y, eb color, float fadeoutStart, float fadeoutEnd) {
      if (et.isLunarClient()) {
         LunarFontRenderer.renderText(
            font.getFont(), text, font.getSize(), color.getRGB(), this.getMatrices().peek().getPositionMatrix(), x, y, 0.0F, true, fadeoutStart, fadeoutEnd
         );
      } else {
         MsdfRenderer.renderText(
            font.getFont(), text, font.getSize(), color.getRGB(), this.getMatrices().peek().getPositionMatrix(), x, y, 0.0F, true, fadeoutStart, fadeoutEnd
         );
      }
   }

   public void drawFadeoutText(Font font, String text, float x, float y, eb color, float fadeoutStart, float fadeoutEnd, float maxWidth) {
      if (et.isLunarClient()) {
         LunarFontRenderer.renderText(
            font.getFont(),
            text,
            font.getSize(),
            color.getRGB(),
            this.getMatrices().peek().getPositionMatrix(),
            x,
            y,
            0.0F,
            true,
            fadeoutStart,
            fadeoutEnd,
            maxWidth
         );
      } else {
         MsdfRenderer.renderText(
            font.getFont(),
            text,
            font.getSize(),
            color.getRGB(),
            this.getMatrices().peek().getPositionMatrix(),
            x,
            y,
            0.0F,
            true,
            fadeoutStart,
            fadeoutEnd,
            maxWidth
         );
      }
   }

   public void drawCenteredText(Font font, String text, float x, float y, eb color) {
      this.drawText(font, text, x - font.getFont().getWidth(text, font.getSize()) / 2.0F, y, color);
   }

   public void drawRightText(Font font, String text, float x, float y, eb color) {
      this.drawText(font, text, x - font.getFont().getWidth(text, font.getSize()), y, color);
   }

   public void drawItem(Item item, float x, float y, float size) {
      this.drawItem(item.getDefaultStack(), x, y, size);
   }

   public void flushItems() {
      Immediate var1 = ((DrawContextAccessor)this.originalContext).getVertexConsumers();
      var1.draw();
   }

   public void drawItem(ItemStack item, float x, float y, float size) {
      this.getMatrices().push();
      this.getMatrices().translate(x, y, 0.0F);
      this.getMatrices().scale(size, size, size);
      MatrixStack var5 = this.getMatrices();
      ItemRenderState var6 = ((DrawContextAccessor)this.originalContext).getItemRenderState();
      Immediate var7 = ((DrawContextAccessor)this.originalContext).getVertexConsumers();
      if (!item.isEmpty()) {
         mc.getItemModelManager().update(var6, item, ModelTransformationMode.GUI, false, mc.world, mc.player, 0);
         var5.push();
         var5.translate(8.0F, 8.0F, 150 + (var6.hasDepth() ? 0 : 0));

         try {
            var5.scale(16.0F, -16.0F, 16.0F);
            boolean var8 = !var6.isSideLit();
            if (var8) {
               DiffuseLighting.disableGuiDepthLighting();
            }

            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            var6.render(var5, var7, 15728880, OverlayTexture.DEFAULT_UV);
            if (var8) {
               DiffuseLighting.enableGuiDepthLighting();
            }
         } catch (Throwable var11) {
            CrashReport var9 = CrashReport.create(var11, "Rendering item");
            CrashReportSection var10 = var9.addElement("Item being rendered");
            var10.add("Item Type", () -> String.valueOf(item.getItem()));
            var10.add("Item Components", () -> String.valueOf(item.getComponents()));
            var10.add("Item Foil", () -> String.valueOf(item.hasGlint()));
            throw new CrashException(var9);
         }

         var5.pop();
      }

      this.getMatrices().pop();
   }

   public void drawHead(AbstractClientPlayerEntity player, float x, float y, float size, BorderRadius borderRadius, eb color) {
      fj.drawPlayerHeadWithHat(this.getMatrices(), player, x, y, size, borderRadius, color);
   }

   public void drawHead(LivingEntity entity, float x, float y, float size, BorderRadius borderRadius, eb color) {
      fj.drawEntityHeadWithHat(this.getMatrices(), entity, x, y, size, borderRadius, color);
   }

   public void drawBatchItem(ItemStack item, int x, int y) {
      this.drawBatchItem(mc.player, mc.world, item, x, y, 0);
   }

   private void drawBatchItem(@Nullable LivingEntity entity, @Nullable World world, ItemStack stack, int x, int y, int seed) {
      this.drawBatchItem(entity, world, stack, x, y, seed, 0);
   }

   private void drawBatchItem(@Nullable LivingEntity entity, @Nullable World world, ItemStack stack, int x, int y, int seed, int z) {
      MatrixStack var8 = this.getMatrices();
      ItemRenderState var9 = ((DrawContextAccessor)this.originalContext).getItemRenderState();
      Immediate var10 = ((DrawContextAccessor)this.originalContext).getVertexConsumers();
      if (!stack.isEmpty()) {
         mc.getItemModelManager().update(var9, stack, ModelTransformationMode.GUI, false, world, entity, seed);
         var8.push();
         var8.translate(x + 8, y + 8, 150 + (var9.hasDepth() ? z : 0));

         try {
            var8.scale(16.0F, -16.0F, 16.0F);
            boolean var11 = !var9.isSideLit();
            if (var11) {
               DiffuseLighting.disableGuiDepthLighting();
            }

            var9.render(var8, var10, 15728880, OverlayTexture.DEFAULT_UV);
            if (var11) {
               DiffuseLighting.enableGuiDepthLighting();
            }
         } catch (Throwable var14) {
            CrashReport var12 = CrashReport.create(var14, "Rendering item");
            CrashReportSection var13 = var12.addElement("Item being rendered");
            var13.add("Item Type", () -> String.valueOf(stack.getItem()));
            var13.add("Item Components", () -> String.valueOf(stack.getComponents()));
            var13.add("Item Foil", () -> String.valueOf(stack.hasGlint()));
            throw new CrashException(var12);
         }

         var8.pop();
      }
   }
}
