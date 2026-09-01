package nesquik.mytheria.mixin.minecraft.client;

import a.ao;
import a.ap;
import a.bj;
import a.bk;
import a.uc.dY;
import a.en;
import a.eo;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.Mouse;
import net.minecraft.item.Items;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Mouse.class)
public class MouseMixin implements IMinecraft {
   @Shadow
   private double cursorDeltaX;
   @Shadow
   private double cursorDeltaY;

   @Inject(method = "tick()V", at = @At("RETURN"))
   private void tick(CallbackInfo ci) {
      if (eo.getCurrentType() != eo.getPrev()) {
         GLFW.glfwSetCursor(mc.getWindow().getHandle(), eo.getCurrentType().getCode());
      }

      eo.setPrev(eo.getCurrentType());
      eo.set(en.DEFAULT);
   }

   @Inject(method = "onMouseButton(JIII)V", at = @At("HEAD"))
   private void onMouseButton(long window, int button, int action, int mods, CallbackInfo ci) {
      if (dY.isInitialized()) {
         if (action == 1) {
            Mytheria.getInstance().getEventManager().triggerEvent(new ao(button, action));
         }

         if (button == 1) {
            MinecraftClient var7 = MinecraftClient.getInstance();
            bj var8 = Mytheria.getInstance().getModuleManager().getModuleSafe(bj.class);
            if (var8 != null && var8.isEnabled() && var7.player != null && (var7.player.getMainHandStack().getItem() == Items.EXPERIENCE_BOTTLE || var7.player.getOffHandStack().getItem() == Items.EXPERIENCE_BOTTLE)) {
               if (action == 1) {
                  var8.onRightClickPress();
               } else if (action == 0) {
                  var8.onRightClickRelease();
               }
            }
         }
      }
   }

   @Inject(method = "onMouseScroll(JDD)V", at = @At("HEAD"))
   private void onMouseScroll(long window, double horizontal, double vertical, CallbackInfo ci) {
      if (vertical != 0.0 && dY.isInitialized()) {
         Mytheria.getInstance().getEventManager().triggerEvent(new ap(vertical));
      }
   }

   @Inject(method = "updateMouse(D)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/network/ClientPlayerEntity;changeLookDirection(DD)V"), cancellable = true)
   private void onUpdateMouse(double timeDelta, CallbackInfo ci) {
      if (bk.isActive() && mc.player != null) {
         double var4 = (Double)mc.options.getMouseSensitivity().getValue() * 0.6 + 0.2;
         double var6 = var4 * var4 * var4;
         double var8 = var6 * 8.0;
         double var10 = this.cursorDeltaX * var8;
         double var12 = this.cursorDeltaY * var8;
         float var14 = (float)(var10 * 0.15);
         float var15 = (float)(var12 * 0.15);
         bk.INSTANCE.updateFreeYaw(var14);
         bk.INSTANCE.updateFreePitch(var15);
         ci.cancel();
      }
   }
}
