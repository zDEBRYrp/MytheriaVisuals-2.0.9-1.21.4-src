package nesquik.mytheria.mixin.minecraft.client;

import a.an;
import a.uc.dY;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.client.Keyboard;
import net.minecraft.client.gui.screen.ChatScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Keyboard.class)
public class KeyboardMixin implements IMinecraft {
   @Inject(method = "onKey(JIIII)V", at = @At("HEAD"))
   public void triggerKeyEvent(long window, int key, int scancode, int action, int modifiers, CallbackInfo ci) {
      if (key != -1) {
         if (dY.isInitialized()) {
            Mytheria.getInstance().getEventManager().triggerEvent(new an(action, key));
         }

         if (mc.currentScreen == null && key == 46 && action == 1) {
            mc.setScreen(new ChatScreen(""));
         }
      }
   }
}
