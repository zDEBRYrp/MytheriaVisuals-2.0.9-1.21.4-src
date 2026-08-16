package nesquik.mytheria.framework.objects;

import lombok.Generated;

public enum MouseButton {
   LEFT(0),
   RIGHT(1),
   MIDDLE(2),
   BUTTON_4(3),
   BUTTON_5(4),
   BUTTON_6(5),
   BUTTON_7(6);

   private final int buttonIndex;

   public static MouseButton fromButtonIndex(int index) {
      for (MouseButton var4 : values()) {
         if (var4.getButtonIndex() == index) {
            return var4;
         }
      }

      return LEFT;
   }

   @Generated
   MouseButton(final int buttonIndex) {
      this.buttonIndex = buttonIndex;
   }

   @Generated
   public int getButtonIndex() {
      return this.buttonIndex;
   }
}
