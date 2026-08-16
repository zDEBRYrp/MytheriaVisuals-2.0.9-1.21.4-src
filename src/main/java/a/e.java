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
import a.el;
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

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.event.EventListener;
import net.minecraft.client.MinecraftClient;

public class e {
   private static final Set<String> a = ConcurrentHashMap.newKeySet();
   private static final Set<String> b = ConcurrentHashMap.newKeySet();
   private final Timer c = new Timer("Social-Timer", true);
   private boolean d = false;
   private static volatile boolean e = false;
   private final EventListener<W> f = event -> {
      if (!e) {
         MinecraftClient var1 = MinecraftClient.getInstance();
         if (var1 != null && var1.getNetworkHandler() != null) {
            var1.getNetworkHandler().getPlayerList().forEach(entry -> a.add(entry.getProfile().getName().toLowerCase()));
         }
      }
   };

   public void start() {
      if (!this.d) {
         this.d = true;
         a.add("fakeplayer");
         b.add("fakeplayer");
         MinecraftClient var1 = MinecraftClient.getInstance();
         if (var1 != null && var1.player != null) {
            String var2 = var1.player.getGameProfile().getName().toLowerCase();
            a.add(var2);
            b.add(var2);
         }

         Mytheria.getInstance().getEventManager().subscribe(this);
         this.c.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
               a();
            }
         }, 0L, 5000L);
      }
   }

   public void stop() {
      this.d = false;
      this.c.cancel();
      a.clear();
      b.clear();
   }

   public static boolean isMytheriaUser(String playerName) {
      if (playerName == null) {
         return false;
      }

      String var1 = playerName.toLowerCase();
      boolean var2 = a.contains(var1);
      if (var2) {
         b.add(var1);
      }

      return var2 || b.contains(var1);
   }

   public static boolean isMytheriaUserInText(String labelText) {
      if (labelText != null && !labelText.isEmpty()) {
         String var1 = labelText.toLowerCase();

         for (String var3 : a) {
            if (var1.contains(var3)) {
               b.add(var3);
               return true;
            }
         }

         for (String var5 : b) {
            if (var1.contains(var5)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   static void a() {
      try {
         URL var0 = new URL("http://node1.yumo.su:25566/api/online");
         HttpURLConnection var1 = (HttpURLConnection)var0.openConnection();
         var1.setRequestMethod("GET");
         var1.setRequestProperty("User-Agent", "Mytheria-Client");
         var1.setConnectTimeout(4000);
         var1.setReadTimeout(4000);
         if (var1.getResponseCode() == 200) {
            try (InputStream var2 = var1.getInputStream()) {
               String var3 = new String(var2.readAllBytes(), StandardCharsets.UTF_8);
               a(var3);
               e = true;
            }

            return;
         }

         var1.disconnect();
      } catch (Exception var7) {
      }

      e = false;
   }

   private static void a(String json) {
      try {
         JsonArray var1 = JsonParser.parseString(json).getAsJsonObject().getAsJsonArray("players");
         KeySetView var2 = ConcurrentHashMap.newKeySet();
         var1.forEach(el -> {
            String var2x = el.getAsString().toLowerCase();
            var2.add(var2x);
            b.add(var2x);
         });
         var2.add("fakeplayer");
         b.add("fakeplayer");
         MinecraftClient var3 = MinecraftClient.getInstance();
         if (var3 != null && var3.player != null) {
            String var4 = var3.player.getGameProfile().getName().toLowerCase();
            var2.add(var4);
            b.add(var4);
         }

         a.clear();
         a.addAll(var2);
      } catch (Exception var5) {
      }
   }
}
