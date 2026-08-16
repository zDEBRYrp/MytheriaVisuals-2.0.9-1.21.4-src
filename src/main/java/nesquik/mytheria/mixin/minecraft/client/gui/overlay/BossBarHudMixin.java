package nesquik.mytheria.mixin.minecraft.client.gui.overlay;

import a.uc.bQ;
import a.uc.dY;
import a.dc;
import a.dm;
import a.ep;
import a.fe;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.BossBarHud;
import net.minecraft.client.gui.hud.ClientBossBar;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BossBarHud.class)
public class BossBarHudMixin implements IMinecraft {
   @Shadow
   @Final
   private Map<UUID, ClientBossBar> bossBars;
   @Unique
   private static final Pattern PVP_TIME_PATTERN = Pattern.compile("(\\d+)\\s*[сc][еe][кk](?=$|\\s|\\p{Punct})", 66);
   private static final String FILTERED_TEXT = "둅ꈣꈃ둄ꈣꈅ";
   private final Map<UUID, String> lastProcessedNames = new HashMap<>();

   @Inject(method = "render(Lnet/minecraft/client/gui/DrawContext;)V", at = @At("HEAD"))
   private void onRenderHead(DrawContext context, CallbackInfo ci) {
      if (dY.isInitialized()) {
         int var3 = 0;

         for (ClientBossBar var5 : this.bossBars.values()) {
            if (var5.getName() != null) {
               String var6 = var5.getName().getString().toLowerCase();
               if (var6.contains("бой") || var6.contains("pvp")) {
                  Matcher var7 = PVP_TIME_PATTERN.matcher(var5.getName().getString());
                  if (var7.find()) {
                     var3 = Integer.parseInt(var7.group(1));
                  }
                  break;
               }
            }
         }

         ep.setHasCT(var3 > 0);
         ep.setCtTime(var3);
      }
   }

   @Inject(method = "render(Lnet/minecraft/client/gui/DrawContext;)V", at = @At("HEAD"), cancellable = true)
   private void cancelRenderIfNeeded(DrawContext context, CallbackInfo ci) {
      if (!dY.isInitialized()) {
         fe.setRendering(true);
      } else {
         bQ var3 = Mytheria.getInstance().getModuleManager().getModuleSafe(bQ.class);
         if (var3 == null) {
            fe.setRendering(true);
         } else {
            dc var4 = Mytheria.getInstance().getHud().getIsland();
            boolean var5 = var4.isShowing() && var4.statuses().stream().anyMatch(status -> status instanceof dm);
            if ((!var3.isEnabled() || !var3.getBossBar().isSelected()) && (!ep.hasCT || !var5)) {
               fe.setRendering(true);
            } else {
               fe.setRendering(false);
               ci.cancel();
            }
         }
      }
   }

   @Inject(method = "render(Lnet/minecraft/client/gui/DrawContext;)V", at = @At("RETURN"))
   private void onRenderReturn(DrawContext context, CallbackInfo ci) {
   }

   @Unique
   public Map<UUID, ClientBossBar> mytheria$getBossBars() {
      return this.bossBars;
   }
}
