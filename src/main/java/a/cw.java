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
import a.n;
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
import a.uc.bE;
import a.uc.aG;
import a.uc.dI;
import a.uc.aK;
import a.uc.aJ;
import a.uc.O;
import a.uc.aV;
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
import a.uc.aU;
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
import a.uc.C;
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
import a.cw;
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

import com.google.gson.JsonObject;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import net.fabricmc.loader.api.FabricLoader;

public class cw {
   public static void sendTestReport() {
      try {
         RuntimeException var0 = new RuntimeException("Test crash report from Mytheria");
         StackTraceElement[] var1 = new StackTraceElement[]{
            new StackTraceElement("nesquik.mytheria.telemetry.CrashReporter", "sendTestReport", "CrashReporter.java", 1)
         };
         var0.setStackTrace(var1);
         JsonObject var2 = new JsonObject();
         var2.addProperty("mod", "Mytheria");
         var2.addProperty("timestamp", System.currentTimeMillis());
         var2.addProperty("exception", "TEST");
         var2.addProperty("message", "This is a test crash report");
         var2.addProperty("stackTrace", "nesquik.mytheria.telemetry.CrashReporter.sendTestReport(CrashReporter.java:1)");
         var2.addProperty("minecraftVersion", a());
         var2.addProperty("javaVersion", System.getProperty("java.version"));
         var2.addProperty("os", System.getProperty("os.name"));
         a(var2.toString());
      } catch (Exception var3) {
      }
   }

   public static void reportCrash(Throwable throwable) {
      if (a(throwable)) {
         try {
            String var1 = b(throwable);
            a(var1);
         } catch (Exception var2) {
         }
      }
   }

   private static boolean a(Throwable throwable) {
      for (Throwable var1 = throwable; var1 != null; var1 = var1.getCause()) {
         for (StackTraceElement var5 : var1.getStackTrace()) {
            if (var5.getClassName().startsWith("nesquik.mytheria")) {
               return true;
            }
         }
      }

      return false;
   }

   private static String b(Throwable throwable) {
      JsonObject var1 = new JsonObject();
      var1.addProperty("mod", "Mytheria");
      var1.addProperty("timestamp", System.currentTimeMillis());
      var1.addProperty("exception", throwable.getClass().getName());
      var1.addProperty("message", throwable.getMessage());
      StringBuilder var2 = new StringBuilder();

      for (StackTraceElement var6 : throwable.getStackTrace()) {
         if (var6.getClassName().startsWith("nesquik.mytheria")) {
            var2.append(var6).append("\n");
         }
      }

      var1.addProperty("stackTrace", var2.toString());
      var1.addProperty("minecraftVersion", a());
      var1.addProperty("javaVersion", System.getProperty("java.version"));
      var1.addProperty("os", System.getProperty("os.name"));
      return var1.toString();
   }

   private static void a(String data) throws Exception {
      URL var1 = new URL("http://node1.yumo.su:25566/api/crash-report");
      HttpURLConnection var2 = (HttpURLConnection)var1.openConnection();
      var2.setRequestMethod("POST");
      var2.setRequestProperty("Content-Type", "application/json");
      var2.setRequestProperty("User-Agent", "Mytheria-CrashReporter");
      var2.setConnectTimeout(3000);
      var2.setReadTimeout(3000);
      var2.setDoOutput(true);

      try (OutputStream var3 = var2.getOutputStream()) {
         byte[] var4 = data.getBytes(StandardCharsets.UTF_8);
         var3.write(var4, 0, var4.length);
      }

      var2.getResponseCode();
      var2.disconnect();
   }

   private static String a() {
      try {
         return FabricLoader.getInstance().getModContainer("minecraft").map(mod -> mod.getMetadata().getVersion().getFriendlyString()).orElse("unknown");
      } catch (Exception var1) {
         return "unknown";
      }
   }
}
