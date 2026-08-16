package nesquik.mytheria.framework.msdf;

import lombok.Generated;

public final class Fonts {
   private static volatile boolean initialized = false;
   private static MsdfFont bold;
   private static MsdfFont medium;
   private static MsdfFont regular;
   private static MsdfFont semibold;
   private static MsdfFont roundBold;
   public static final MsdfFont BOLD;
   public static final MsdfFont MEDIUM;
   public static final MsdfFont REGULAR;
   public static final MsdfFont SEMIBOLD;
   public static final MsdfFont ROUND_BOLD;

   public static boolean isInitialized() {
      return initialized;
   }

   public static void ensureInitialized() {
      if (!initialized) {
         try {
            bold = MsdfFont.builder().atlas("bold").data("bold").build();
            medium = MsdfFont.builder().atlas("medium").data("medium").build();
            regular = MsdfFont.builder().atlas("regular").data("regular").build();
            semibold = MsdfFont.builder().atlas("semibold").data("semibold").build();
            roundBold = MsdfFont.builder().atlas("roundbold").data("roundbold").build();
            initialized = true;
         } catch (Exception var1) {
         }
      }
   }

   @Generated
   private Fonts() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      MsdfFont var0 = null;
      MsdfFont var1 = null;
      MsdfFont var2 = null;
      MsdfFont var3 = null;
      MsdfFont var4 = null;

      try {
         var0 = MsdfFont.builder().atlas("bold").data("bold").build();
         var1 = MsdfFont.builder().atlas("medium").data("medium").build();
         var2 = MsdfFont.builder().atlas("regular").data("regular").build();
         var3 = MsdfFont.builder().atlas("semibold").data("semibold").build();
         var4 = MsdfFont.builder().atlas("roundbold").data("roundbold").build();
         initialized = true;
      } catch (Exception var6) {
         System.err.println("Fonts not initialized yet: " + var6.getMessage());
      }

      BOLD = var0;
      MEDIUM = var1;
      REGULAR = var2;
      SEMIBOLD = var3;
      ROUND_BOLD = var4;
   }
}
