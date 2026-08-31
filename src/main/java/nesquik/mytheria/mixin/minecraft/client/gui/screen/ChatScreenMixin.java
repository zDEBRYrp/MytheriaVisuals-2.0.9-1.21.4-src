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
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.client.gui.hud.ChatHudLine;
import net.minecraft.client.gui.screen.ChatInputSuggestor;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.text.Text;
import net.minecraft.util.math.MathHelper;
import nesquik.mytheria.mixin.accessors.ChatHudAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
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

   @Unique
   private int mytheria$hoveredMsgIndex = -1;

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

      mytheria$hoveredMsgIndex = mytheria$getHoveredMessageIndex(mouseX, mouseY);

      if (dY.isInitialized() && mytheria$hoveredMsgIndex >= 0) {
         fQ chatCopy = dY.getInstance().getModuleManager().getModuleSafe(fQ.class);
         if (chatCopy != null && chatCopy.isChatCopyEnabled()) {
            ChatHud chatHud = mc.inGameHud.getChatHud();
            double chatScale = chatHud.getChatScale();
            int scaledHeight = mc.getWindow().getScaledHeight();
            int lineHeight = 9;
            double chatLineY = (scaledHeight - mouseY - 40.0) / (chatScale * lineHeight);
            int lineIndex = MathHelper.floor(chatLineY + ((ChatHudAccessor) chatHud).getScrolledLines());
            if (lineIndex >= 0 && lineIndex < ((ChatHudAccessor) chatHud).getVisibleMessages().size()) {
               int screenY = (int) (scaledHeight - 40.0 - (lineIndex - ((ChatHudAccessor) chatHud).getScrolledLines()) * lineHeight * chatScale - lineHeight * chatScale);
               int screenX = (int) (4.0 * chatScale);

               float alpha = 0.6f;
               context.fill(screenX, screenY, screenX + 14, screenY + lineHeight, (int)(alpha * 255) << 24);
               context.drawText(mc.textRenderer, Text.literal("C"), screenX + 2, screenY + 1, 0xFFFFFF, false);
            }
         }
      }
   }

   @Inject(method = "mouseClicked(DDI)Z", at = @At("HEAD"), cancellable = true)
   private void onMouseClick(double mouseX, double mouseY, int button, CallbackInfoReturnable<Boolean> cir) {
      if (dY.isInitialized()) {
         double var7 = mc.getWindow().getScaleFactor() / 2.0;
         dY.getEventManager().triggerEvent(new ai((float)(mouseX * var7), (float)(mouseY * var7), button));
      }

      if (button == 0 && dY.isInitialized() && mytheria$hoveredMsgIndex >= 0) {
         fQ chatCopy = dY.getInstance().getModuleManager().getModuleSafe(fQ.class);
         if (chatCopy != null && chatCopy.isChatCopyEnabled()) {
            fQ.copyChatMessage(chatCopy.getFormatIndex());
            cir.setReturnValue(true);
         }
      }
   }

   public boolean mouseReleased(double mouseX, double mouseY, int button) {
      if (dY.isInitialized()) {
         double var6 = mc.getWindow().getScaleFactor() / 2.0;
         dY.getEventManager().triggerEvent(new ak((float)(mouseX * var6), (float)(mouseY * var6), button));
      }

      return super.mouseReleased(mouseX, mouseY, button);
   }

   @Unique
   private int mytheria$getHoveredMessageIndex(double mouseX, double mouseY) {
      if (mc.inGameHud == null) return -1;
      ChatHud chatHud = mc.inGameHud.getChatHud();
      ChatHudAccessor accessor = (ChatHudAccessor) chatHud;
      java.util.List<ChatHudLine.Visible> visible = accessor.getVisibleMessages();
      int scrolledLines = accessor.getScrolledLines();

      double chatScale = chatHud.getChatScale();
      int scaledHeight = mc.getWindow().getScaledHeight();

      double chatX = mouseX / chatScale - 4.0;
      double chatY = (scaledHeight - mouseY - 40.0) / (chatScale * 9.0);

      int lineWidth = MathHelper.floor(chatHud.getWidth() / chatScale);
      if (chatX < -4.0 || chatX > lineWidth) return -1;

      int visibleCount = Math.min(
         MathHelper.floor((scaledHeight - 40.0) / (chatScale * 9.0)),
         visible.size()
      );
      if (chatY < 0.0 || chatY >= visibleCount) return -1;

      int lineIndex = MathHelper.floor(chatY + scrolledLines);
      if (lineIndex < 0 || lineIndex >= visible.size()) return -1;

      int msgIndex = lineIndex;
      while (msgIndex >= 0) {
         if (visible.get(msgIndex).endOfEntry()) break;
         msgIndex--;
      }
      return msgIndex;
   }
}
