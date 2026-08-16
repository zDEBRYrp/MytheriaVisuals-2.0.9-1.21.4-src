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
import a.v;
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

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.jagrosh.discordipc.IPCListener;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

public class a {
   private final long a;
   private RandomAccessFile b;
   private IPCListener c;
   private volatile boolean d = false;

   public a(long clientId) {
      this.a = clientId;
   }

   public void setListener(IPCListener listener) {
      this.c = listener;
   }

   public void connect() {
      Thread var1 = new Thread(() -> {
         try {
            for (int var1x = 0; var1x < 10; var1x++) {
               try {
                  this.b = new RandomAccessFile("\\\\.\\pipe\\discord-ipc-" + var1x, "rw");
                  break;
               } catch (IOException var9) {
                  if (var1x == 9) {
                     throw var9;
                  }
               }
            }

            JsonObject var11 = new JsonObject();
            var11.addProperty("v", 1);
            var11.addProperty("client_id", String.valueOf(this.a));
            this.a(0, var11.toString());
            byte[] var2 = new byte[8];
            this.b.readFully(var2);
            ByteBuffer var3 = ByteBuffer.wrap(var2).order(ByteOrder.LITTLE_ENDIAN);
            int var4 = var3.getInt();
            int var5 = var3.getInt();
            byte[] var6 = new byte[var5];
            this.b.readFully(var6);
            String var7 = new String(var6);
            JsonObject var8 = JsonParser.parseString(var7).getAsJsonObject();
            if (var8.has("evt") && "READY".equals(var8.get("evt").getAsString())) {
               this.d = true;
               if (this.c != null) {
                  this.c.onReady(this);
               }
            }
         } catch (Exception var10) {
         }
      }, "Discord-IPC");
      var1.setDaemon(true);
      var1.start();
   }

   public void sendRichPresence(b presence) {
      if (this.d && this.b != null) {
         try {
            JsonObject var2 = new JsonObject();
            if (presence.getState() != null) {
               var2.addProperty("state", presence.getState());
            }

            if (presence.getDetails() != null) {
               var2.addProperty("details", presence.getDetails());
            }

            if (presence.getStartTimestamp() > 0L) {
               JsonObject var3 = new JsonObject();
               var3.addProperty("start", presence.getStartTimestamp());
               if (presence.getEndTimestamp() > 0L) {
                  var3.addProperty("end", presence.getEndTimestamp());
               }

               var2.add("timestamps", var3);
            }

            JsonObject var10 = new JsonObject();
            if (presence.getLargeImageKey() != null) {
               var10.addProperty("large_image", presence.getLargeImageKey());
               if (presence.getLargeImageText() != null) {
                  var10.addProperty("large_text", presence.getLargeImageText());
               }
            }

            if (presence.getSmallImageKey() != null) {
               var10.addProperty("small_image", presence.getSmallImageKey());
               if (presence.getSmallImageText() != null) {
                  var10.addProperty("small_text", presence.getSmallImageText());
               }
            }

            if (var10.size() > 0) {
               var2.add("assets", var10);
            }

            if (presence.getButtons() != null && presence.getButtons().length > 0) {
               JsonArray var4 = new JsonArray();
               int var5 = Math.min(2, presence.getButtons().length);

               for (int var6 = 0; var6 < var5; var6++) {
                  b.a var7 = presence.getButtons()[var6];
                  if (var7 != null && var7.getLabel() != null && var7.getUrl() != null) {
                     JsonObject var8 = new JsonObject();
                     var8.addProperty("label", var7.getLabel());
                     var8.addProperty("url", var7.getUrl());
                     var4.add(var8);
                  }
               }

               if (var4.size() > 0) {
                  var2.add("buttons", var4);
               }
            }

            JsonObject var11 = new JsonObject();
            var11.addProperty("pid", ProcessHandle.current().pid());
            var11.add("activity", var2);
            JsonObject var12 = new JsonObject();
            var12.addProperty("cmd", "SET_ACTIVITY");
            var12.add("args", var11);
            var12.addProperty("nonce", UUID.randomUUID().toString());
            this.a(1, var12.toString());
            System.out.println("[DiscordIPC] Sent payload: " + var12.toString());
         } catch (Exception var9) {
            System.err.println("[DiscordIPC] Error sending presence: " + var9.getMessage());
         }
      }
   }

   private void a(int opcode, String data) throws IOException {
      byte[] var3 = data.getBytes();
      ByteBuffer var4 = ByteBuffer.allocate(8 + var3.length).order(ByteOrder.LITTLE_ENDIAN);
      var4.putInt(opcode);
      var4.putInt(var3.length);
      var4.put(var3);
      this.b.write(var4.array());
   }

   public void close() {
      this.d = false;

      try {
         if (this.b != null) {
            this.b.close();
         }
      } catch (IOException var2) {
      }
   }

   public boolean isConnected() {
      return this.d;
   }
}
