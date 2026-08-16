package nesquik.mytheria.mixin.minecraft.client;

import a.bq;
import a.e;
import nesquik.mytheria.Mytheria;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityRenderer.class)
public class SocialNameTagRenderMixin<T, S extends EntityRenderState> {
   private static final Identifier MYTHERIA_LOGO = Mytheria.id("image/mainmenu/mytheria.png");
   private static final String ICON_SPACE = "  ";
   @Unique
   private static final ThreadLocal<Boolean> mytheria$shouldRender = ThreadLocal.withInitial(() -> false);
   @Unique
   private static final ThreadLocal<Float> mytheria$spaceWidth = ThreadLocal.withInitial(() -> 0.0F);

   @ModifyVariable(
      method = "renderLabelIfPresent(Lnet/minecraft/client/render/entity/state/EntityRenderState;Lnet/minecraft/text/Text;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V",
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 0
   )
   private Text social_prependIconSpace(Text text) {
      if (!bq.isActive()) {
         mytheria$shouldRender.set(false);
         return text;
      }

      String var2 = text.getString().replaceAll("§[0-9a-fk-orA-FK-OR]", "").trim();
      boolean var3 = e.isMytheriaUserInText(var2);
      if (!var3) {
         mytheria$shouldRender.set(false);
         return text;
      }

      mytheria$shouldRender.set(true);
      MinecraftClient var4 = MinecraftClient.getInstance();
      if (var4.textRenderer != null) {
         mytheria$spaceWidth.set((float)var4.textRenderer.getWidth("  "));
      }

      return Text.literal("  ").append(text);
   }

   @Inject(
      method = "renderLabelIfPresent(Lnet/minecraft/client/render/entity/state/EntityRenderState;Lnet/minecraft/text/Text;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/font/TextRenderer;draw(Lnet/minecraft/text/Text;FFIZLorg/joml/Matrix4f;Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/client/font/TextRenderer$TextLayerType;II)I",
         shift = Shift.BEFORE
      )
   )
   private void social_drawExtendedBackground(S state, Text text, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, CallbackInfo ci) {
      if (mytheria$shouldRender.get()) {
         MinecraftClient var7 = MinecraftClient.getInstance();
         TextRenderer var8 = var7.textRenderer;
         if (var8 != null) {
            float var9 = 12.0F;
            float var10 = -var8.getWidth(text) / 2.0F - 5.0F;
            float var11 = var10 - 2.0F;
            float var12 = -var8.getWidth(text) / 2.0F + 2.0F;
            float var13 = -1.0F;
            float var14 = 9.0F;
            Matrix4f var15 = matrices.peek().getPositionMatrix();

            try {
               VertexConsumer var16 = vertexConsumers.getBuffer(RenderLayer.getTextBackgroundSeeThrough());
               byte var17 = 0;
               byte var18 = 0;
               byte var19 = 0;
               byte var20 = 64;
               var16.vertex(var15, var11, var13, 0.0F).color(var17, var18, var19, var20).light(light);
               var16.vertex(var15, var11, var14, 0.0F).color(var17, var18, var19, var20).light(light);
               var16.vertex(var15, var12, var14, 0.0F).color(var17, var18, var19, var20).light(light);
               var16.vertex(var15, var12, var13, 0.0F).color(var17, var18, var19, var20).light(light);
            } catch (Exception var21) {
            }
         }
      }
   }

   @Inject(
      method = "renderLabelIfPresent(Lnet/minecraft/client/render/entity/state/EntityRenderState;Lnet/minecraft/text/Text;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/font/TextRenderer;draw(Lnet/minecraft/text/Text;FFIZLorg/joml/Matrix4f;Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/client/font/TextRenderer$TextLayerType;II)I",
         shift = Shift.AFTER
      )
   )
   private void social_drawIconAfterText(S state, Text text, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, CallbackInfo ci) {
      if (mytheria$shouldRender.get()) {
         MinecraftClient var7 = MinecraftClient.getInstance();
         TextRenderer var8 = var7.textRenderer;
         if (var8 != null) {
            float var9 = 12.0F;
            float var10 = -var8.getWidth(text) / 2.0F - 5.0F;
            float var11 = var10 + var9;
            float var12 = -var9 / 2.0F + 4.0F;
            float var13 = var12 + var9;
            Matrix4f var14 = matrices.peek().getPositionMatrix();

            try {
               VertexConsumer var15 = vertexConsumers.getBuffer(RenderLayer.getText(MYTHERIA_LOGO));
               var15.vertex(var14, var10, var12, 0.0F).color(255, 255, 255, 255).texture(0.0F, 0.0F).light(light);
               var15.vertex(var14, var10, var13, 0.0F).color(255, 255, 255, 255).texture(0.0F, 1.0F).light(light);
               var15.vertex(var14, var11, var13, 0.0F).color(255, 255, 255, 255).texture(1.0F, 1.0F).light(light);
               var15.vertex(var14, var11, var12, 0.0F).color(255, 255, 255, 255).texture(1.0F, 0.0F).light(light);
            } catch (Exception var19) {
            } finally {
               mytheria$shouldRender.set(false);
            }
         }
      }
   }
}
