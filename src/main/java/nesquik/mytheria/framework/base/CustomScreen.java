package nesquik.mytheria.framework.base;

import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public abstract class CustomScreen extends Screen implements IMinecraft {
   public static final double VIRTUAL_SCALE = 2.0;

   public CustomScreen() {
      super(Text.empty());
   }

   @Override
   public void tick() {
      super.tick();
      try {
         if (mc.player != null) {
            // если поиск/поле ввода в фокусе — не двигаемся, иначе WASD+прыжок+шифт+спринт
            boolean searchFocused = false;
            try {
               if (a.uc.cK.LAST_FIELD != null && a.uc.cK.LAST_FIELD.isFocused()) searchFocused = true;
            } catch (Exception ignored) {}
            if (!searchFocused) {
               long handle = mc.getWindow().getHandle();
               net.minecraft.client.option.KeyBinding[] binds = new net.minecraft.client.option.KeyBinding[]{mc.options.forwardKey, mc.options.backKey, mc.options.leftKey, mc.options.rightKey, mc.options.jumpKey, mc.options.sneakKey, mc.options.sprintKey};
               for (net.minecraft.client.option.KeyBinding b : binds) {
                  int code = net.minecraft.client.util.InputUtil.fromTranslationKey(b.getBoundKeyTranslationKey()).getCode();
                  b.setPressed(net.minecraft.client.util.InputUtil.isKeyPressed(handle, code));
               }
            }
         }
      } catch (Exception ignored) {}
   }

   public abstract void render(UIContext var1);

   public final void render(DrawContext context, int mouseX, int mouseY, float delta) {
      double var5 = mc.getWindow().getScaleFactor();
      double var7 = 2.0 / var5;
      int var9 = (int)(mouseX / var7);
      int var10 = (int)(mouseY / var7);
      context.getMatrices().push();
      context.getMatrices().scale((float)var7, (float)var7, 1.0F);
      UIContext var11 = UIContext.of(context, var9, var10, delta);
      this.render(var11);
      context.getMatrices().pop();
   }

   private static double toVirtual(double coord) {
      double var2 = mc.getWindow().getScaleFactor();
      return coord / (2.0 / var2);
   }

   public final boolean mouseClicked(double mouseX, double mouseY, int button) {
      MouseButton var6 = MouseButton.fromButtonIndex(button);
      this.onMouseClicked(toVirtual(mouseX), toVirtual(mouseY), var6);
      return super.mouseClicked(mouseX, mouseY, button);
   }

   public final boolean mouseReleased(double mouseX, double mouseY, int button) {
      MouseButton var6 = MouseButton.fromButtonIndex(button);
      this.onMouseReleased(toVirtual(mouseX), toVirtual(mouseY), var6);
      return super.mouseReleased(mouseX, mouseY, button);
   }

   public final boolean mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY) {
      double var10 = 2.0 / mc.getWindow().getScaleFactor();
      MouseButton var12 = MouseButton.fromButtonIndex(button);
      this.onMouseDragged(mouseX / var10, mouseY / var10, var12, deltaX / var10, deltaY / var10);
      return super.mouseDragged(mouseX, mouseY, button, deltaX, deltaY);
   }

   public final boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      return this.onMouseScrolled(toVirtual(mouseX), toVirtual(mouseY), horizontalAmount, verticalAmount);
   }

   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
   }

   public void onMouseReleased(double mouseX, double mouseY, MouseButton button) {
   }

   public void onMouseDragged(double mouseX, double mouseY, MouseButton button, double deltaX, double deltaY) {
   }

   public boolean onMouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      return false;
   }
}
