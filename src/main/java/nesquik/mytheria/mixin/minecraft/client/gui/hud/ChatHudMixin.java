package nesquik.mytheria.mixin.minecraft.client.gui.hud;

import a.uc.bA;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ChatHud.class)
public abstract class ChatHudMixin {
   @Unique
   private Text mytheria$lastMessage = null;
   @Unique
   private int mytheria$spamCount = 1;

   @Inject(method = "clear(Z)V", at = @At("HEAD"), cancellable = true)
   private void onClear(boolean clearHistory, CallbackInfo ci) {
      if (bA.isChatHistoryEnabled()) {
         ci.cancel();
      }
   }

   @ModifyVariable(method = "addMessage(Lnet/minecraft/text/Text;)V", at = @At("HEAD"), argsOnly = true, ordinal = 0)
   private Text modifyMessage(Text message) {
      if (!bA.isAntiSpamEnabled()) {
         this.mytheria$lastMessage = message;
         this.mytheria$spamCount = 1;
         return message;
      } else {
         String var2 = message.getString();
         if (this.mytheria$lastMessage != null && this.mytheria$lastMessage.getString().equals(var2)) {
            this.mytheria$spamCount++;
            return Text.literal(var2 + " §7[x" + this.mytheria$spamCount + "]");
         } else {
            this.mytheria$lastMessage = message;
            this.mytheria$spamCount = 1;
            return message;
         }
      }
   }
}
