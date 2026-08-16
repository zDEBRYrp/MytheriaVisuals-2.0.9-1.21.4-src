package nesquik.mytheria.mixin.minecraft.client;

import a.d;
import net.minecraft.client.sound.SoundInstance;
import net.minecraft.client.sound.SoundSystem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SoundSystem.class)
public class SoundSystemMixin {
   @Inject(method = "play(Lnet/minecraft/client/sound/SoundInstance;)V", at = @At("HEAD"), cancellable = true)
   private void onPlaySound(SoundInstance sound, CallbackInfo ci) {
      d.playSound(sound, ci);
   }

   @Inject(method = "play(Lnet/minecraft/client/sound/SoundInstance;I)V", at = @At("HEAD"), cancellable = true)
   private void onPlaySoundDelayed(SoundInstance sound, int delay, CallbackInfo ci) {
      d.playSound(sound, ci);
   }
}
