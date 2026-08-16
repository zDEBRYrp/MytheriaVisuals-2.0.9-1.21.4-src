package nesquik.mytheria.mixin.minecraft.client.gui.overlay;

import a.ab;
import a.ac;
import a.ad;
import a.af;
import a.uc.bB;
import a.uc.bQ;
import a.uc.cV;
import a.ep;
import a.fj;
import a.fm;
import com.mojang.blaze3d.systems.RenderSystem;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.CustomDrawContext;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.render.DiffuseLighting;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.scoreboard.ScoreboardObjective;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(InGameHud.class)
public class InGameHudMixin implements IMinecraft {
   @Inject(method = "renderScoreboardSidebar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/scoreboard/ScoreboardObjective;)V", at = @At("HEAD"), cancellable = true)
   private void renderScoreboardSidebarHook(DrawContext context, ScoreboardObjective objective, CallbackInfo ci) {
      if (objective.getDisplayName().getString().contains("Анархия") && (ep.isFT() || ep.isST())) {
         try {
            ep.ftAn = Integer.parseInt(objective.getDisplayName().getString().split("-")[1].trim());
         } catch (Exception var5) {
         }
      }

      bQ var4 = Mytheria.getInstance().getModuleManager().getModule(bQ.class);
      if (var4.isEnabled() && var4.getScoreboard().isSelected()) {
         ci.cancel();
      }
   }

   @Inject(method = "renderScoreboardSidebar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/scoreboard/ScoreboardObjective;)V", at = @At("HEAD"))
   private void beforeRenderScoreboardSidebar(DrawContext context, ScoreboardObjective objective, CallbackInfo ci) {
      context.getMatrices().push();
      context.getMatrices().translate(0.0F, 0.0F, 100.0F);
   }

   @Inject(method = "renderScoreboardSidebar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/scoreboard/ScoreboardObjective;)V", at = @At("RETURN"))
   private void afterRenderScoreboardSidebar(DrawContext context, ScoreboardObjective objective, CallbackInfo ci) {
      context.getMatrices().pop();
   }

   @Inject(method = "renderPortalOverlay(Lnet/minecraft/client/gui/DrawContext;F)V", at = @At("HEAD"), cancellable = true)
   private void renderPortalOverlayHook(DrawContext context, float nauseaStrength, CallbackInfo ci) {
      bQ var4 = Mytheria.getInstance().getModuleManager().getModule(bQ.class);
      if (var4.isEnabled() && var4.getPortal().isSelected()) {
         ci.cancel();
      }
   }

   @ModifyArgs(
      method = "renderMiscOverlays(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/hud/InGameHud;renderOverlay(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/util/Identifier;F)V", ordinal = 0)
   )
   private void onRenderPumpkinOverlay(Args args) {
      bQ var2 = Mytheria.getInstance().getModuleManager().getModule(bQ.class);
      if (var2.isEnabled() && var2.getPumpkin().isSelected()) {
         args.set(2, 0.0F);
      }
   }

   @Inject(method = "render(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V", at = @At("HEAD"))
   public void triggerPreHudRenderEvent(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
      context.getMatrices().push();
      double var4 = mc.getWindow().getScaleFactor();
      double var6 = 2.0 / var4;
      context.getMatrices().scale((float)var6, (float)var6, 1.0F);
      CustomDrawContext var8 = CustomDrawContext.of(context);
      Mytheria.getInstance().getEventManager().triggerEvent(new ad(var8, tickCounter.getTickDelta(false)));
      context.getMatrices().pop();
   }

   @Inject(
      method = "render(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/LayeredDrawer;render(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V", shift = Shift.AFTER)
   )
   public void afterLayeredDrawerRender(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
      context.getMatrices().push();
      double var4 = mc.getWindow().getScaleFactor();
      double var6 = 2.0 / var4;
      context.getMatrices().scale((float)var6, (float)var6, 1.0F);
      CustomDrawContext var8 = CustomDrawContext.of(context);
      fj.blurProgram.draw();
      Mytheria.getInstance().getEventManager().triggerEvent(new ab(var8, tickCounter.getTickDelta(false)));
      context.getMatrices().pop();
      fm.clear();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableDepthTest();
      DiffuseLighting.disableGuiDepthLighting();
   }

   @Inject(method = "render(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V", at = @At("RETURN"))
   public void triggerPostHudRenderEvent(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
      context.getMatrices().push();
      double var4 = mc.getWindow().getScaleFactor();
      double var6 = 2.0 / var4;
      context.getMatrices().scale((float)var6, (float)var6, 1.0F);
      CustomDrawContext var8 = CustomDrawContext.of(context);
      Mytheria.getInstance().getEventManager().triggerEvent(new ac(var8, tickCounter.getTickDelta(false)));
      context.getMatrices().pop();
   }

   @Inject(method = "renderHotbar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V", at = @At("HEAD"), cancellable = true)
   private void onRenderHotbar(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
      cV var4 = Mytheria.getInstance().getHud().getElementByName("hud.hotbar");
      if (var4 != null && var4.isShowing() && var4.show()) {
         ci.cancel();
      }
   }

   @Inject(method = "renderHotbar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V", at = @At("RETURN"))
   private void afterRenderHotbar(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
      Mytheria.getInstance().getEventManager().triggerEvent(new af(context, tickCounter.getTickDelta(false)));
   }

   @Inject(method = "renderStatusEffectOverlay(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V", at = @At("HEAD"), cancellable = true)
   private void onRenderStatusEffectOverlay(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
      ci.cancel();
   }

   @Inject(method = "renderCrosshair(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V", at = @At("HEAD"), cancellable = true)
   private void onRenderCrosshair(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
      bB var4 = Mytheria.getInstance().getModuleManager().getModule(bB.class);
      if (var4 != null && var4.isEnabled()) {
         ci.cancel();
      }
   }
}
