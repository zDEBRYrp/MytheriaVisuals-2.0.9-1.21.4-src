package nesquik.mytheria.mixin.minecraft.client.gui.screen;

import a.uc.Z;
import a.uc.fQ;
import a.uc.dY;
import a.ai;
import a.ak;
import a.h;
import nesquik.mytheria.framework.base.CustomDrawContext;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatInputSuggestor;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ChatScreen.class)
public class ChatScreenMixin extends Screen implements IMinecraft {
   @Shadow
   protected TextFieldWidget chatField;
   @Shadow
   private ChatInputSuggestor chatInputSuggestor;

   protected ChatScreenMixin(Text title) {
      super(title);
   }

   @Inject(method = "sendMessage(Ljava/lang/String;Z)V", at = @At("HEAD"), cancellable = true)
   private void onSendMessage(String text, boolean addToHistory, CallbackInfo ci) {
      if (dY.getInstance() != null) {
         h var4 = dY.getInstance().getCommandManager();
         if (var4 != null && var4.dispatch(text)) {
            mc.inGameHud.getChatHud().addToMessageHistory(text);
            ci.cancel();
         }
      }
   }

   @Inject(method = "render(Lnet/minecraft/client/gui/DrawContext;IIF)V", at = @At("RETURN"))
   public void render(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
      if (dY.isInitialized()) {
         context.getMatrices().push();
         double var6 = 2.0 / mc.getWindow().getScaleFactor();
         context.getMatrices().scale((float)var6, (float)var6, 1.0F);
         dY.getEventManager().triggerEvent(new Z(CustomDrawContext.of(context), delta));
         context.getMatrices().pop();
      }
   }

   @Inject(method = "mouseClicked(DDI)Z", at = @At("HEAD"))
   private void onMouseClick(double mouseX, double mouseY, int button, CallbackInfoReturnable<Boolean> cir) {
      if (dY.isInitialized()) {
         double var7 = mc.getWindow().getScaleFactor() / 2.0;
         dY.getEventManager().triggerEvent(new ai((float)(mouseX * var7), (float)(mouseY * var7), button));
      }
   }

    public boolean mouseReleased(double mouseX, double mouseY, int button) {
       if (dY.isInitialized()) {
          double var6 = mc.getWindow().getScaleFactor() / 2.0;
          dY.getEventManager().triggerEvent(new ak((float)(mouseX * var6), (float)(mouseY * var6), button));
       }

       return super.mouseReleased(mouseX, mouseY, button);
    }

    @Inject(method = "keyPressed(III)Z", at = @At("HEAD"), cancellable = true)
    private void onKeyPressed(int keyCode, int scanCode, int modifiers, CallbackInfoReturnable<Boolean> cir) {
       if (keyCode == GLFW.GLFW_KEY_C && (modifiers & GLFW.GLFW_MOD_CONTROL) != 0) {
          if (dY.isInitialized()) {
             a.uc.fQ chatCopy = dY.getInstance().getModuleManager().getModuleSafe(a.uc.fQ.class);
             if (chatCopy != null && chatCopy.isEnabled()) {
                a.uc.fQ.copyHoveredMessage(chatCopy.getFormatIndex());
                cir.setReturnValue(true);
             }
          }
       }
    }
}
