package nesquik.mytheria.mixin.minecraft.client;

import a.uc.K;
import a.c;
import a.cw;
import a.fy;
import a.bs;
import a.uc.dY;
import nesquik.mytheria.Mytheria;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.RunArgs;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {
   @Shadow
   private int itemUseCooldown;

   @Inject(method = "run()V", at = @At("HEAD"))
   public void onRunStart(CallbackInfo ci) {
      Thread.currentThread().setUncaughtExceptionHandler((thread, throwable) -> cw.reportCrash(throwable));
   }

   @Inject(method = "tick()V", at = @At("HEAD"))
   public void tick(CallbackInfo ci) {
      Mytheria.getInstance().getEventManager().triggerEvent(new K());
   }

   @Inject(method = "<init>(Lnet/minecraft/client/RunArgs;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/MinecraftClient;onResolutionChanged()V"))
   public void initializeClient(RunArgs args, CallbackInfo ci) {
      c.init();
   }

   @Inject(method = "<init>(Lnet/minecraft/client/RunArgs;)V", at = @At("RETURN"))
   public void endInitialize(RunArgs args, CallbackInfo ci) {
      try {
         fy var3 = fy.getOrCreateAtlasFor(16, 16);
         var3.registerAnimationFromPenisFile(Mytheria.id("penises/combat.penis"));
         var3.registerAnimationFromPenisFile(Mytheria.id("penises/movement.penis"));
         var3.registerAnimationFromPenisFile(Mytheria.id("penises/visuals.penis"));
         var3.registerAnimationFromPenisFile(Mytheria.id("penises/player.penis"));
         var3.registerAnimationFromPenisFile(Mytheria.id("penises/other.penis"));
         var3.registerAnimationFromPenisFile(Mytheria.id("penises/search.penis"));
         var3.buildAtlas();
         fy var4 = fy.getOrCreateAtlasFor(12, 12);
         var4.registerAnimationFromPenisFile(Mytheria.id("penises/check_enable.penis"));
         var4.registerAnimationFromPenisFile(Mytheria.id("penises/check_disable.penis"));
         var4.buildAtlas();
      } catch (Exception var5) {
         System.err.println("Ошибка при загрузке анимаций: " + var5.getMessage());
         var5.printStackTrace();
      }
   }

   @Inject(method = "stop()V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/MinecraftClient;close()V", shift = Shift.AFTER))
   public void shutdownClient(CallbackInfo ci) {
      c.shutdown();
      new Thread(() -> {
         try {
            String var0 = System.getProperty("os.name").toLowerCase();
            if (var0.contains("win")) {
               long var1 = ProcessHandle.current().pid();
               Runtime.getRuntime().exec("taskkill /F /PID " + var1);
            } else {
               long var4 = ProcessHandle.current().pid();
               Runtime.getRuntime().exec("kill -9 " + var4);
            }
         } catch (Exception var3x) {
            Runtime.getRuntime().halt(0);
         }
      }, "Process-Killer").start();

      try {
         Thread.sleep(100L);
      } catch (InterruptedException var3) {
      }

      Runtime.getRuntime().halt(0);
   }

   @Inject(method = "getWindowTitle()Ljava/lang/String;", at = @At("HEAD"), cancellable = true)
   public void changeWindowTitle(CallbackInfoReturnable<String> cir) {
      c.updateTitle(cir);
   }

    @Inject(method = "doItemUse()V", at = @At("HEAD"))
    public void onItemUse(CallbackInfo ci) {
    }

    @Inject(method = "disconnect(Lnet/minecraft/client/gui/screen/Screen;Z)V", at = @At("HEAD"), cancellable = true)
    public void onDisconnect(net.minecraft.client.gui.screen.Screen screen, boolean transferring, CallbackInfo ci) {
       if (dY.isInitialized()) {
          bs var3 = Mytheria.getInstance().getModuleManager().getModuleSafe(bs.class);
          if (var3 != null && var3.isEnabled() && var3.shouldBlockDisconnect()) {
             ci.cancel();
          }
       }
    }
}
