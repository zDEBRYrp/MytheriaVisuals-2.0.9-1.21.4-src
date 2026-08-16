package nesquik.mytheria.mixin.minecraft.client.input;

import a.uc.X;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.input.Input;
import net.minecraft.client.input.KeyboardInput;
import net.minecraft.util.PlayerInput;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin(KeyboardInput.class)
public abstract class KeyboardInputMixin implements IMinecraft {
   @Inject(method = "tick()V", at = @At("TAIL"))
   private void onTick(CallbackInfo ci) {
      Input var2 = (Input)(Object)this;
      InputAccessor var3 = (InputAccessor)var2;
      PlayerInput var4 = var3.getInput();
      float var5 = var3.getMovementForward();
      float var6 = var3.getMovementSideways();
      boolean var7 = var3.getInput().jump();
      boolean var8 = var3.getInput().sneak();
      boolean var9 = var3.getInput().sprint();
      X var10 = new X(var5, var6, var7, var8, var9);
      Mytheria.getInstance().getEventManager().triggerEvent(var10);
      var3.setMovementForward(var10.getForward());
      var3.setMovementSideways(var10.getStrafe());
      boolean var11 = var10.getForward() > 0.0F;
      boolean var12 = var10.getForward() < 0.0F;
      boolean var13 = var10.getStrafe() > 0.0F;
      boolean var14 = var10.getStrafe() < 0.0F;
      var3.setInput(new PlayerInput(var11, var12, var13, var14, var10.isJump(), var10.isSneak(), var10.isSprint()));
   }
}
