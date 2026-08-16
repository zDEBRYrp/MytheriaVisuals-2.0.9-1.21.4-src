package nesquik.mytheria.mixin.minecraft.client;

import a.bq;
import a.e;
import a.ec;
import a.fj;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.mojang.blaze3d.systems.RenderSystem;
import nesquik.mytheria.Mytheria;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.PlayerListHud;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerListHud.class)
public class SocialPlayerListHudMixin {
   private static final Identifier MYTHERIA_LOGO = Mytheria.id("image/mainmenu/mytheria.png");
   private static final float ICON_SIZE = 7.0F;
   private static final String ICON_SPACE = "   ";
   private transient float pendingIconX;
   private transient float pendingIconY;
   private transient boolean pendingDraw;
   private transient DrawContext capturedContext;

   @ModifyReturnValue(method = "getPlayerName(Lnet/minecraft/client/network/PlayerListEntry;)Lnet/minecraft/text/Text;", at = @At("RETURN"))
   private Text social_prependIconSpace(Text original, PlayerListEntry entry) {
      if (!bq.isActive()) {
         return original;
      } else {
         return (Text)(!e.isMytheriaUser(entry.getProfile().getName()) ? original : Text.literal("   ").append(original));
      }
   }

   @ModifyArg(
      method = "render(Lnet/minecraft/client/gui/DrawContext;ILnet/minecraft/scoreboard/Scoreboard;Lnet/minecraft/scoreboard/ScoreboardObjective;)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/DrawContext;drawTextWithShadow(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/text/Text;III)I"),
      index = 2
   )
   private int social_drawIconAndPassX(TextRenderer renderer, Text text, int x, int y, int color) {
      if (!bq.isActive()) {
         return x;
      }

      String var6 = text.getString();
      if (!var6.startsWith("   ")) {
         return x;
      }

      float var7 = x + 2.0F;
      float var8 = y + 0.5F;
      this.pendingIconX = var7;
      this.pendingIconY = var8;
      this.pendingDraw = true;
      return x;
   }

   @Inject(
      method = "render(Lnet/minecraft/client/gui/DrawContext;ILnet/minecraft/scoreboard/Scoreboard;Lnet/minecraft/scoreboard/ScoreboardObjective;)V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/DrawContext;drawTextWithShadow(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/text/Text;III)I",
         shift = Shift.AFTER
      )
   )
   private void social_drawIconAfterText(DrawContext context, int scaledWindowWidth, Scoreboard scoreboard, ScoreboardObjective objective, CallbackInfo ci) {
      if (this.pendingDraw) {
         this.pendingDraw = false;
         MatrixStack var6 = context.getMatrices();
         var6.push();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         fj.drawTexture(var6, MYTHERIA_LOGO, this.pendingIconX, this.pendingIconY, 7.0F, 7.0F, ec.WHITE);
         RenderSystem.disableBlend();
         var6.pop();
      }
   }
}
