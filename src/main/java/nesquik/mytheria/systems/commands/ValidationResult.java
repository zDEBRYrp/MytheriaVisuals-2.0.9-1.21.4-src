package nesquik.mytheria.systems.commands;

import a.eg;
import net.minecraft.text.Text;

public sealed interface ValidationResult permits ValidationResult.b, ValidationResult.a {
   static <T> ValidationResult.b<T> ok(T value) {
      return new ValidationResult.b<>((T)value);
   }

   static ValidationResult.a error(String msg) {
      eg.error(Text.of(msg));
      return new ValidationResult.a(msg);
   }

   record a(String a) implements ValidationResult {

      public a(String a) {
         this.a = a;
      }

      public String message() {
         return this.a;
      }
   }

   record b<T>(T a) implements ValidationResult {

      public b(T a) {
         this.a = (T)a;
      }

      public T value() {
         return this.a;
      }
   }
}
