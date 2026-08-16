package a;
import a.b;
import a.uc.bZ;
import a.uc.eF;
import a.uc.bY;
import a.uc.cC;
import a.uc.bN;
import a.uc.bR;
import a.uc.aQ;
import a.uc.eR;
import a.uc.eW;
import a.uc.fO;
import a.uc.dY;
import a.uc.eP;
import a.uc.cN;
import a.uc.L;
import a.uc.dR;
import a.uc.eY;
import a.uc.cK;
import a.uc.cO;
import a.uc.aZ;
import a.uc.eK;
import a.uc.dZ;
import a.uc.dX;
import a.uc.R;
import a.uc.aS;
import a.uc.cD;
import a.uc.U;
import a.uc.D;
import a.uc.aP;
import a.uc.dS;
import a.uc.aH;
import a.uc.eD;
import a.uc.aW;
import a.uc.dD;
import a.uc.bB;
import a.uc.eO;
import a.uc.cP;
import a.uc.fK;
import a.uc.aB;
import a.uc.cJ;
import a.uc.cX;
import a.uc.eG;
import a.uc.dA;
import a.uc.eI;
import a.uc.aE;
import a.uc.dE;
import a.uc.M;
import a.uc.dW;
import a.uc.H;
import a.uc.J;
import a.uc.Q;
import a.uc.N;
import a.uc.bW;
import a.uc.P;
import a.uc.fJ;
import a.uc.V;
import a.uc.G;
import a.uc.fD;
import a.uc.eX;
import a.uc.Z;
import a.uc.bS;
import a.uc.aO;
import a.uc.cE;
import a.uc.X;
import a.uc.fC;
import a.uc.aT;
import a.uc.dH;
import a.uc.fP;
import a.uc.eM;
import a.uc.cT;
import a.uc.bA;
import a.uc.eS;
import a.uc.cR;
import a.uc.aN;
import a.uc.cI;
import a.uc.cG;
import a.uc.bC;
import a.uc.I;
import a.be;
import a.uc.aG;
import a.uc.dI;
import a.uc.aK;
import a.uc.aJ;
import a.uc.O;
import a.av;
import a.uc.eH;
import a.uc.eB;
import a.uc.fE;
import a.uc.bK;
import a.uc.cF;
import a.uc.bF;
import a.uc.eN;
import a.uc.bI;
import a.uc.dC;
import a.uc.cU;
import a.au;
import a.uc.bH;
import a.uc.eA;
import a.uc.bM;
import a.uc.aF;
import a.a;
import a.uc.cL;
import a.uc.fM;
import a.uc.dM;
import a.uc.cA;
import a.uc.bD;
import a.uc.bX;
import a.uc.cH;
import a.uc.bG;
import a.uc.fB;
import a.uc.fA;
import a.uc.dF;
import a.uc.bU;
import a.uc.cY;
import a.uc.aC;
import a.uc.aL;
import a.uc.bQ;
import a.uc.eE;
import a.uc.eT;
import a.uc.K;
import a.uc.cB;
import a.uc.bT;
import a.uc.W;
import a.uc.eL;
import a.uc.bP;
import a.uc.aD;
import a.uc.fI;
import a.uc.T;
import a.uc.dB;
import a.uc.cV;
import a.c;
import a.uc.aY;
import a.uc.dT;
import a.uc.dJ;
import a.uc.fF;
import a.uc.aR;
import a.uc.fG;
import a.uc.dV;
import a.uc.aX;
import a.uc.dG;
import a.uc.E;
import a.uc.dP;
import a.uc.Y;
import a.uc.cM;
import a.uc.eQ;
import a.uc.eV;
import a.uc.cS;
import a.uc.bO;
import a.uc.eC;
import a.uc.fL;
import a.uc.bL;
import a.uc.aI;
import a.uc.cW;
import a.uc.dL;
import a.uc.aM;
import a.uc.eJ;
import a.uc.bV;
import a.uc.F;
import a.uc.cQ;
import a.uc.dQ;
import a.uc.dK;
import a.uc.aA;
import a.uc.eZ;
import a.uc.S;
import a.uc.fH;
import a.uc.dU;
import a.uc.dN;
import a.uc.fN;
import a.uc.cZ;
import a.uc.eU;
import a.uc.bJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Map;
import javax.annotation.Nonnull;
import lombok.Generated;
import nesquik.mytheria.Mytheria;

public final class av {
   private static final au a = au.RU_RU;
   private static au b = a;
   private static final Map<String, String> c = new HashMap<>();

   public static void loadTranslations() {
      String var0 = "/assets/" + Mytheria.MOD_ID + "/lang/" + b.getCode() + ".lang";

      try {
         InputStream var1 = av.class.getResourceAsStream(var0);
         if (var1 == null) {
            throw new RuntimeException("Language file not found: " + var0);
         }

         c.clear();
         BufferedReader var2 = new BufferedReader(new InputStreamReader(var1, StandardCharsets.UTF_8));
         String var3 = b.getCode() + ".lang";
         int var5 = 0;

         String var4;
         while ((var4 = var2.readLine()) != null) {
            var5++;
            var4 = a(var4).trim();
            if (!var4.isEmpty()) {
               int var6 = var4.indexOf(61);
               if (var6 != -1) {
                  String var7 = var4.substring(0, var6).trim();
                  String var8 = var4.substring(var6 + 1).trim();
                  if (!var7.isEmpty()) {
                     c.put(var7, var8);
                  }
               }
            }
         }

         var2.close();
      } catch (IOException var9) {
         throw new RuntimeException("Failed to load translations for language: " + b.getCode(), var9);
      }
   }

   public static void setLanguage(@Nonnull au lang) {
      b = lang;
      loadTranslations();
   }

   public static String translate(String key, Object... args) {
      String var2 = c.getOrDefault(key, key);
      if (args.length == 0) {
         return var2;
      }

      try {
         return String.format(var2, args);
      } catch (IllegalFormatException var4) {
         Mytheria.LOGGER.warn("Failed to format translation key '{}' with format '{}': {}", new Object[]{key, var2, var4.getMessage()});
         return var2;
      }
   }

   public static String translateOrEmpty(String key) {
      return c.getOrDefault(key, " ");
   }

   private static String a(String line) {
      int var1 = line.indexOf("#");
      return var1 != -1 ? line.substring(0, var1) : line;
   }

   @Generated
   private av() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   @Generated
   public static au getCurrentLanguage() {
      return b;
   }
}
