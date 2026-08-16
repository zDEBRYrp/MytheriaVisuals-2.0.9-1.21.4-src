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
