package nesquik.mytheria.mixin.minecraft.client.gui.screen;
import a.bx;

import a.ah;
import a.uc.bG;
import a.uc.bQ;
import a.uc.bX;
import a.uc.bX;
import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.systems.RenderSystem;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.shader.ShaderHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GameRenderer.class)
public abstract class GameRendererMixin {
   @Shadow
   private float zoom;
   @Shadow
   private float zoomX;
   @Shadow
   private float zoomY;
   @Shadow
   private float viewDistance;
   @Shadow
   @Final
   private MinecraftClient client;
   @Shadow
   @Final
   private Camera camera;

   @Shadow
   public abstract float getFarPlaneDistance();

   @Shadow
   protected abstract void renderHand(Camera var1, float var2, Matrix4f var3);

   @Redirect(
      method = "renderWorld(Lnet/minecraft/client/render/RenderTickCounter;)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/GameRenderer;renderHand(Lnet/minecraft/client/render/Camera;FLorg/joml/Matrix4f;)V")
   )
   private void redirectRenderHand(GameRenderer gameRenderer, Camera camera, float tickDelta, Matrix4f matrix4f) {
      bG var5 = Mytheria.getInstance().getModuleManager().getModule(bG.class);
      if (var5 != null && var5.isEnabled()) {
         RenderSystem.colorMask(false, false, false, false);
         this.renderHand(camera, tickDelta, matrix4f);
         RenderSystem.colorMask(true, true, true, true);
         bG.render(this.getFarPlaneDistance());
      } else {
         this.renderHand(camera, tickDelta, matrix4f);
      }
   }

   @Inject(method = "render(Lnet/minecraft/client/render/RenderTickCounter;Z)V", at = @At("HEAD"))
   private void onFrameStart(CallbackInfo ci) {
      ShaderHelper.initShadersIfNeeded();
      ShaderHelper.checkFramebuffers();
   }

   @Inject(
      method = "renderWorld(Lnet/minecraft/client/render/RenderTickCounter;)V",
      at = @At(value = "FIELD", target = "Lnet/minecraft/client/render/GameRenderer;renderHand:Z", opcode = 180, ordinal = 0)
   )
   public void hookWorldRender(RenderTickCounter tickCounter, CallbackInfo ci, @Local(ordinal = 2) Matrix4f matrix4f2) {
      MatrixStack var4 = new MatrixStack();
      var4.multiplyPositionMatrix(matrix4f2);
      ah var5 = new ah(var4, this.camera, tickCounter.getTickDelta(false));
      Mytheria.getInstance().getEventManager().triggerEvent(var5);
   }

   @Inject(method = "tiltViewWhenHurt(Lnet/minecraft/client/util/math/MatrixStack;F)V", at = @At("HEAD"), cancellable = true)
   private void tiltViewWhenHurtHook(MatrixStack matrices, float tickDelta, CallbackInfo ci) {
      bQ var4 = Mytheria.getInstance().getModuleManager().getModule(bQ.class);
      if (var4.isEnabled() && var4.getHurtCam().isSelected()) {
         ci.cancel();
      }
   }

   @Inject(method = "getBasicProjectionMatrix(F)Lorg/joml/Matrix4f;", at = @At("TAIL"), cancellable = true)
   private void onGetBasicProjectionMatrix(float fovDegrees, CallbackInfoReturnable<Matrix4f> cir) {
      bX var3 = Mytheria.getInstance().getModuleManager().getModule(bX.class);
      bx var4 = Mytheria.getInstance().getModuleManager().getModule(bx.class);
      if (var3 != null && var3.isEnabled()) {
         var3.updateZoom();
         fovDegrees /= var3.getZoomMultiplier();
      }

      if (var4 != null && var4.isEnabled() && !bx.isRenderingHands()) {
         MatrixStack var8 = new MatrixStack();
         var8.peek().getPositionMatrix().identity();
         if (this.zoom != 1.0F) {
            var8.translate(this.zoomX, -this.zoomY, 0.0F);
            var8.scale(this.zoom, this.zoom, 1.0F);
         }

         float var9 = var4.getRatio();
         Matrix4f var7 = new Matrix4f();
         var7.setPerspective((float)(fovDegrees * (float) (Math.PI / 180.0)), var9, 0.05F, this.viewDistance * 4.0F);
         var8.peek().getPositionMatrix().mul(var7);
         cir.setReturnValue(var8.peek().getPositionMatrix());
      } else if (var3 != null && var3.isEnabled()) {
         MatrixStack var5 = new MatrixStack();
         var5.peek().getPositionMatrix().identity();
         if (this.zoom != 1.0F) {
            var5.translate(this.zoomX, -this.zoomY, 0.0F);
            var5.scale(this.zoom, this.zoom, 1.0F);
         }

         Matrix4f var6 = new Matrix4f();
         var6.setPerspective(
            (float)(fovDegrees * (float) (Math.PI / 180.0)),
            (float)this.client.getWindow().getFramebufferWidth() / this.client.getWindow().getFramebufferHeight(),
            0.05F,
            this.viewDistance * 4.0F
         );
         var5.peek().getPositionMatrix().mul(var6);
         cir.setReturnValue(var5.peek().getPositionMatrix());
      }
   }
}
