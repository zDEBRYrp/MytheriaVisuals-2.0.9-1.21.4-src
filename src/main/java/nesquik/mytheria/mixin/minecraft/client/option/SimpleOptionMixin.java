package nesquik.mytheria.mixin.minecraft.client.option;

import a.bw;
import a.uc.dY;
import nesquik.mytheria.Mytheria;
import net.minecraft.client.option.SimpleOption;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SimpleOption.class)
public class SimpleOptionMixin<T> {
   @Shadow
   @Final
   Text text;
   @Shadow
   T value;

   @Inject(method = "getValue()Ljava/lang/Object;", at = @At("HEAD"), cancellable = true)
   public void getGammaValue(CallbackInfoReturnable<Double> cir) {
      if (dY.isInitialized() && Mytheria.getInstance().getModuleManager() != null) {
         bw var2 = Mytheria.getInstance().getModuleManager().getModule(bw.class);
         if (var2.isEnabled() && var2.getBright().isEnabled() && this.text.equals(Text.translatable("options.gamma"))) {
            cir.setReturnValue(1337.0);
         }
      }
   }

   @Inject(method = "setValue(Ljava/lang/Object;)V", at = @At("HEAD"), cancellable = true)
   public void setGammaValue(T value, CallbackInfo ci) {
      if (this.text.equals(Text.translatable("options.gamma"))) {
         this.value = (T)value;
         ci.cancel();
      }
   }
}
