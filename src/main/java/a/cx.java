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
import a.r;
import a.uc.aS;
import a.uc.cD;
import a.uc.U;
import a.d;
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
import a.cx;
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
import a.uc.bE;
import a.uc.aG;
import a.uc.dI;
import a.uc.aK;
import a.uc.aJ;
import a.o;
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
import a.e;
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
import a.f;
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
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Enumeration;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.event.EventListener;
import net.minecraft.client.MinecraftClient;

public class cx {
   private static final ExecutorService a = Executors.newCachedThreadPool(new ThreadFactory() {
      @Override
      public Thread newThread(Runnable r) {
         Thread var2 = new Thread(r, "UserActivityTracker-Worker");
         var2.setDaemon(true);
         return var2;
      }
   });
   public static volatile int uid = 0;
   public static volatile String role = "";
   public static volatile String roleColor = "";
   private static String b = null;
   private final AtomicBoolean c = new AtomicBoolean(false);
   private String d = null;
   private int e = 0;
   private final EventListener<K> f = event -> this.a();

   public static String getUserId() {
      if (b == null) {
         b = d();
      }

      return b;
   }

   public cx() {
      b = d();
   }

   public void start() {
      if (this.c.compareAndSet(false, true)) {
         this.a("online");
         o.startPolling();
         this.e = 0;
         Mytheria.getInstance().getEventManager().subscribe(this);
      }
   }

   public void stop() {
      if (this.c.compareAndSet(true, false)) {
         Mytheria.getInstance().getEventManager().unsubscribe(this);
         this.a("offline");
         o.stopPolling();
      }
   }

   private void a() {
      if (this.c.get()) {
         this.e++;
         if (this.e >= 100) {
            this.e = 0;
            String var1 = this.c();
            if (var1 != null && !var1.equals(this.d)) {
               this.d = var1;
            }

            this.a("online");
         }
      }
   }

   private void a(String status) {
      CompletableFuture.runAsync(() -> this.b(status), a);
   }

   private void b(String status) {
      byte var2 = 3;
      short var3 = 1000;
      long var4 = System.currentTimeMillis();

      for (int var6 = 1; var6 <= var2; var6++) {
         try {
            JsonObject var7 = new JsonObject();
            var7.addProperty("userId", getUserId());
            var7.addProperty("timestamp", System.currentTimeMillis());
            var7.addProperty("status", status);
            String var8 = this.b();
            if (var8 != null) {
               var7.addProperty("playerName", var8);
            }

            String var9 = this.c();
            if (var9 != null) {
               var7.addProperty("serverAddress", var9);
            }

            String var10 = this.d(var7.toString());
            if (var10 != null) {
               this.c(var10);
               long var11 = System.currentTimeMillis() - var4;
               if (var6 <= 1 && var11 > 1000L) {
               }

               return;
            }
         } catch (Exception var14) {
            if (var6 < var2) {
               try {
                  Thread.sleep(var3);
               } catch (InterruptedException var13) {
                  Thread.currentThread().interrupt();
                  return;
               }
            }
         }
      }
   }

   private void c(String json) {
      try {
         JsonObject var2 = JsonParser.parseString(json).getAsJsonObject();
         if (var2.has("uid") && !var2.get("uid").isJsonNull()) {
            uid = var2.get("uid").getAsInt();
         }

         if (var2.has("role") && !var2.get("role").isJsonNull()) {
            String var3 = var2.get("role").getAsString();
            role = var3.isEmpty() ? "User" : var3;
         }

         if (var2.has("roleColor") && !var2.get("roleColor").isJsonNull()) {
            roleColor = var2.get("roleColor").getAsString();
         } else {
            roleColor = "";
         }

         MinecraftClient var5 = MinecraftClient.getInstance();
         if (var5 != null && var5.getSession() != null
               && "zDEBRY".equalsIgnoreCase(var5.getSession().getUsername())) {
            role = "Dev";
            roleColor = "";
         }
      } catch (Exception var4) {
      }
   }

   private String d(String jsonData) throws Exception {
      URL var2 = new URL("http://node1.yumo.su:25566/api/heartbeat");
      HttpURLConnection var3 = (HttpURLConnection)var2.openConnection();
      var3.setRequestMethod("POST");
      var3.setRequestProperty("Content-Type", "application/json");
      var3.setRequestProperty("User-Agent", "Mytheria-Client");
      var3.setConnectTimeout(5000);
      var3.setReadTimeout(5000);
      var3.setDoOutput(true);
      var3.setDoInput(true);

      try (OutputStream var4 = var3.getOutputStream()) {
         var4.write(jsonData.getBytes(StandardCharsets.UTF_8));
      }

      if (var3.getResponseCode() == 200) {
         try (InputStream var11 = var3.getInputStream()) {
            return new String(var11.readAllBytes(), StandardCharsets.UTF_8);
         }
      } else {
         var3.disconnect();
         return null;
      }
   }

   private String b() {
      try {
         MinecraftClient var1 = MinecraftClient.getInstance();
         if (var1 == null) {
            return null;
         } else if (var1.player != null) {
            return var1.player.getGameProfile().getName();
         } else {
            return var1.getSession() != null ? var1.getSession().getUsername() : null;
         }
      } catch (Exception var2) {
         return null;
      }
   }

   private String c() {
      try {
         MinecraftClient var1 = MinecraftClient.getInstance();
         if (var1 == null) {
            return null;
         } else if (var1.getCurrentServerEntry() != null) {
            return var1.getCurrentServerEntry().address;
         } else {
            return var1.isInSingleplayer() ? "Singleplayer" : null;
         }
      } catch (Exception var2) {
         return null;
      }
   }

   private static String d() {
      try {
         String var0 = e();
         if (var0 != null && !var0.isBlank()) {
            return var0;
         }
      } catch (Exception var1) {
      }

      return UUID.randomUUID().toString();
   }

   private static String e() {
      try {
         StringBuilder var0 = new StringBuilder();
         Enumeration var1 = NetworkInterface.getNetworkInterfaces();
         if (var1 != null) {
            while (var1.hasMoreElements()) {
               NetworkInterface var2 = (NetworkInterface)var1.nextElement();
               if (!var2.isLoopback() && !var2.isVirtual() && var2.isUp()) {
                  byte[] var3 = var2.getHardwareAddress();
                  if (var3 != null && var3.length > 0) {
                     StringBuilder var4 = new StringBuilder();

                     for (byte var8 : var3) {
                        var4.append(String.format("%02X", var8));
                     }

                     var0.append(var4);
                     break;
                  }
               }
            }
         }

         String var12 = System.getProperty("user.name", "unknown");
         String var13 = InetAddress.getLocalHost().getHostName();
         var0.append(var12).append(var13);
         if (var0.length() == 0) {
            return null;
         }

         MessageDigest var14 = MessageDigest.getInstance("SHA-256");
         byte[] var15 = var14.digest(var0.toString().getBytes(StandardCharsets.UTF_8));
         StringBuilder var16 = new StringBuilder();

         for (byte var10 : var15) {
            var16.append(String.format("%02x", var10));
         }

         return var16.toString();
      } catch (Exception var11) {
         return null;
      }
   }
}