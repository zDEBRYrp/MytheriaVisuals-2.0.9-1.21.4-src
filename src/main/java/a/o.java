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
import a.g;
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
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.commands.Command;
import nesquik.mytheria.systems.commands.ValidationResult;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class o implements IMinecraft {
   private static final AtomicLong a = new AtomicLong(0L);
   private static final AtomicLong b = new AtomicLong(0L);
   private static Timer c = null;
   private static final ExecutorService d = Executors.newCachedThreadPool(new ThreadFactory() {
      @Override
      public Thread newThread(Runnable r) {
         Thread var2 = new Thread(r, "IRC-Worker");
         var2.setDaemon(true);
         return var2;
      }
   });

   public Command command() {
      return f.begin("irc")
         .desc("IRC — глобальный чат Mytheria")
         .param("message", pb -> pb.vararg().validator(text -> ValidationResult.ok(text)))
         .handler(this::a)
         .build();
   }

   private void a(g ctx) {
      if (mc.player != null) {
         startPolling();
         aW var2 = Mytheria.getInstance().getModuleManager().getModuleSafe(aW.class);
         if (var2 != null && var2.isEnabled()) {
            List var3 = (List)ctx.arguments().get(0);
            if (var3 != null && !var3.isEmpty()) {
               String var4 = String.join(" ", var3);
               String var5 = mc.player.getGameProfile().getName();
               long var6 = System.currentTimeMillis();
               long var8 = 3000L - (var6 - b.get());
               if (var8 > 0L) {
                  mc.player
                     .sendMessage(
                        d()
                           .copy()
                           .append(
                              Text.literal(" Подождите ещё " + (var8 / 1000L + 1L) + " сек.")
                                 .setStyle(Style.EMPTY.withColor(Formatting.RED))
                           ),
                        false
                     );
               } else {
                  b.set(var6);
                  d.execute(() -> this.a(var5, var4));
                  startPolling();
               }
            } else {
               mc.player
                  .sendMessage(
                     d()
                        .copy()
                        .append(Text.literal(" Использование: .irc <сообщение>").setStyle(Style.EMPTY.withColor(Formatting.GRAY))),
                     false
                  );
            }
         } else {
            mc.player
               .sendMessage(
                  d()
                     .copy()
                     .append(Text.literal(" IRC выключен. Включи модуль IRC.").setStyle(Style.EMPTY.withColor(Formatting.RED))),
                  false
               );
         }
      }
   }

   private void a(String playerName, String message) {
      try {
         JsonObject var3 = new JsonObject();
         var3.addProperty("playerName", playerName);
         var3.addProperty("message", message);
         var3.addProperty("uid", cx.uid);
         var3.addProperty("role", cx.role);
         var3.addProperty("userId", cx.getUserId());
         System.out.println("[IRC Client] Sending: playerName=" + playerName + ", message=" + message + ", uid=" + cx.uid);
         HttpURLConnection var4 = (HttpURLConnection)new URL("http://node1.yumo.su:25566/api/irc/send").openConnection();
         var4.setRequestMethod("POST");
         var4.setRequestProperty("Content-Type", "application/json");
         var4.setConnectTimeout(5000);
         var4.setReadTimeout(5000);
         var4.setDoOutput(true);

         try (OutputStream var5 = var4.getOutputStream()) {
            var5.write(var3.toString().getBytes(StandardCharsets.UTF_8));
         }

         int var18 = var4.getResponseCode();
         if (var18 != 200) {
            String var6 = "";

            try (InputStream var7 = var4.getErrorStream()) {
               if (var7 != null) {
                  var6 = new String(var7.readAllBytes(), StandardCharsets.UTF_8);
               }
            } catch (Exception var16) {
            }

            String var19 = "Ошибка отправки: " + var18;
            boolean var8 = false;
            if (var18 == 401 || var18 == 403) {
               var19 = "Доступ запрещён";
            } else if (!var6.isEmpty()) {
               try {
                  if (var6.contains("\"error\"")) {
                     int var9 = var6.indexOf("\"error\":\"") + 9;
                     int var10 = var6.indexOf("\"", var9);
                     if (var9 > 8 && var10 > var9) {
                        var19 = var6.substring(var9, var10);
                     }
                  }

                  if (var6.contains("\"muted\":true")) {
                     var8 = true;
                  }
               } catch (Exception var12) {
               }
            }

            String var20 = var19;
            boolean var21 = var8;
            mc.execute(
               () -> {
                  if (mc.player != null) {
                     if (var21) {
                        Text var2 = a("Сервер", var20, "Admin", "#f87171", 0);
                        mc.player.sendMessage(var2, false);
                     } else {
                        mc.player
                           .sendMessage(
                              d()
                                 .copy()
                                 .append(Text.literal(" " + var20).setStyle(Style.EMPTY.withColor(Formatting.RED))),
                              false
                           );
                     }
                  }
               }
            );
         }

         var4.disconnect();
      } catch (Exception var17) {
         mc.execute(
            () -> {
               if (mc.player != null) {
                  mc.player
                     .sendMessage(
                        d()
                           .copy()
                           .append(Text.literal(" Ошибка подключения к IRC").setStyle(Style.EMPTY.withColor(Formatting.RED))),
                        false
                     );
               }
            }
         );
      }
   }

   public static void startPolling() {
      if (c == null) {
         a.set(System.currentTimeMillis());
         c = new Timer("IRC-Poll", true);
         c.schedule(new TimerTask() {
            @Override
            public void run() {
               o.a();
            }
         }, 0L);
      }
   }

   public static void stopPolling() {
      if (c != null) {
         c.cancel();
         c = null;
      }
   }

   static void a() {
      while (c != null) {
         aW var0 = Mytheria.getInstance().getModuleManager().getModuleSafe(aW.class);
         if (var0 != null && var0.isEnabled()) {
            b();
         } else {
            try {
               Thread.sleep(1000L);
            } catch (InterruptedException var2) {
            }
         }
      }
   }

   private static void b() {
      try {
         long var0 = a.get();
         HttpURLConnection var2 = (HttpURLConnection)new URL("http://node1.yumo.su:25566/api/irc/poll?since=" + var0).openConnection();
         var2.setRequestMethod("GET");
         var2.setConnectTimeout(5000);
         var2.setReadTimeout(25000);
         if (var2.getResponseCode() != 200) {
            var2.disconnect();
            return;
         }

         String var3;
         try (InputStream var4 = var2.getInputStream()) {
            var3 = new String(var4.readAllBytes(), StandardCharsets.UTF_8);
         }

         var2.disconnect();
         JsonObject var18 = JsonParser.parseString(var3).getAsJsonObject();
         if (var18.has("ts")) {
            a.set(var18.get("ts").getAsLong());
         }

         JsonArray var5 = var18.getAsJsonArray("messages");
         if (var5 == null || var5.isEmpty()) {
            return;
         }

         for (JsonElement var7 : var5) {
            JsonObject var8 = var7.getAsJsonObject();
            String var9 = var8.has("playerName") ? var8.get("playerName").getAsString() : "?";
            String var10 = var8.has("message") ? var8.get("message").getAsString() : "";
            String var11 = var8.has("role") ? var8.get("role").getAsString() : "";
            String var12 = var8.has("roleColor") && !var8.get("roleColor").isJsonNull() ? var8.get("roleColor").getAsString() : "";
            int var13 = var8.has("uid") ? var8.get("uid").getAsInt() : 0;
            Text var14 = a(var9, var10, var11, var12, var13);
            mc.execute(() -> {
               if (mc.player != null) {
                  mc.player.sendMessage(var14, false);
               }
            });
         }
      } catch (Exception var17) {
      }
   }

   private static int b(String role, String customColor) {
      if (customColor != null && !customColor.isEmpty()) {
         try {
            return a(customColor);
         } catch (Exception var4) {
         }
      }
      return switch (role == null ? "" : role) {
         case "Media" -> 16384000;
         case "Dev" -> 10486015;
         case "Test" -> 16762880;
         default -> 16777215;
      };
   }

   private static int a(String hex) {
      if (hex.startsWith("#")) {
         hex = hex.substring(1);
      }

      return Integer.parseInt(hex, 16);
   }

   private static int c() {
      try {
         bJ var0 = Mytheria.getInstance().getModuleManager().getModule(bJ.class);
         return var0.clientColor.getColor().getRGB();
      } catch (Exception var1) {
         return 9133302;
      }
   }

   private static Text d() {
      int var0 = c();
      return Text.literal("[")
         .setStyle(Style.EMPTY.withColor(16777215).withBold(true))
         .copy()
         .append(Text.literal("IRC").setStyle(Style.EMPTY.withColor(var0).withBold(true)))
         .append(Text.literal("]").setStyle(Style.EMPTY.withColor(16777215).withBold(true)));
   }

   private static Text a(String name, String message, String role, String roleColor, int uid) {
      int var5 = c();
      MutableText var6 = Text.literal("").copy();
      var6.append(Text.literal("IRC ").setStyle(Style.EMPTY.withColor(var5).withBold(true)));
      if (role != null && !role.isEmpty() && !role.equalsIgnoreCase("User")) {
         int var7 = b(role, roleColor);
         var6.append(Text.literal("[").setStyle(Style.EMPTY.withColor(16777215).withBold(true)));
         var6.append(Text.literal(role).setStyle(Style.EMPTY.withColor(var7).withBold(true)));
         var6.append(Text.literal("] ").setStyle(Style.EMPTY.withColor(16777215).withBold(true)));
      }

      var6.append(Text.literal(name).setStyle(Style.EMPTY.withColor(16777215).withBold(true)));
      var6.append(Text.literal(" » ").setStyle(Style.EMPTY.withColor(4867176)));
      var6.append(Text.literal(message).setStyle(Style.EMPTY.withColor(12891645)));
      return var6;
   }
}
