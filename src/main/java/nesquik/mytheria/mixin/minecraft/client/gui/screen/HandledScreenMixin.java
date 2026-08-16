package nesquik.mytheria.mixin.minecraft.client.gui.screen;

import a.ag;
import a.al;
import a.am;
import a.bm;
import a.uc.fO;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.CustomDrawContext;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.util.InputUtil;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(HandledScreen.class)
public abstract class HandledScreenMixin implements IMinecraft {
   @Unique
   private final fO timer = new fO();

   @Shadow
   protected abstract boolean isPointOverSlot(Slot var1, double var2, double var4);

   @Shadow
   protected abstract void onMouseClick(Slot var1, int var2, int var3, SlotActionType var4);

   @Inject(method = "render(Lnet/minecraft/client/gui/DrawContext;IIF)V", at = @At("TAIL"))
   private void onRender(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
      CustomDrawContext var6 = CustomDrawContext.of(context);
      Mytheria.getInstance().getEventManager().triggerEvent(new ag(var6, delta));

      for (Slot var8 : mc.player.currentScreenHandler.slots) {
         bm var9 = Mytheria.getInstance().getModuleManager().getModule(bm.class);
         if (this.isPointOverSlot(var8, mouseX, mouseY)
            && var8.isEnabled()
            && var9.isEnabled()
            && var9.getScroller().isSelected()
            && this.timer.finished((long)var9.getScrollDelay().getCurrentValue())
            && InputUtil.isKeyPressed(mc.getWindow().getHandle(), 340)
            && GLFW.glfwGetMouseButton(mc.getWindow().getHandle(), 0) == 1) {
            this.onMouseClick(var8, var8.id, 0, SlotActionType.QUICK_MOVE);
            this.timer.reset();
         }
      }
   }

   @Inject(method = "mouseClicked(DDI)Z", at = @At("HEAD"))
   private void onMouseClick(double mouseX, double mouseY, int button, CallbackInfoReturnable<Boolean> cir) {
      Mytheria.getInstance().getEventManager().triggerEvent(new al((float)mouseX, (float)mouseY, button));
   }

   @Inject(method = "mouseReleased(DDI)Z", at = @At("HEAD"))
   public void mouseReleased(double mouseX, double mouseY, int button, CallbackInfoReturnable<Boolean> cir) {
      Mytheria.getInstance().getEventManager().triggerEvent(new am((float)mouseX, (float)mouseY, button));
   }
}
