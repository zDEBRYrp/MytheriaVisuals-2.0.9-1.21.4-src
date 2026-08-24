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
import a.eg;
import a.uc.dA;
import a.uc.eI;
import a.uc.aE;
import a.uc.dE;
import a.uc.M;
import a.uc.dW;
import a.h;
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
import a.z;
import a.uc.bS;
import a.ao;
import a.uc.cE;
import a.x;
import a.uc.fC;
import a.uc.aT;
import a.uc.dH;
import a.uc.fP;
import a.uc.eM;
import a.uc.cT;
import a.uc.bA;
import a.uc.eS;
import a.uc.cR;
import a.an;
import a.uc.cI;
import a.uc.cG;
import a.uc.bC;
import a.i;
import a.uc.bE;
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
import a.cv;
import a.c;
import a.uc.aY;
import a.uc.dT;
import a.uc.dJ;
import a.uc.fF;
import a.ar;
import a.uc.fG;
import a.uc.dV;
import a.uc.aX;
import a.uc.dG;
import a.e;
import a.uc.dP;
import a.y;
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
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.client.gui.screen.DeathScreen;
import net.minecraft.text.Text;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;

public class cv implements IMinecraft {
   private final Map<String, Vec3d> a = new HashMap<>();
   private final File b;
   private int c = -1;
   private boolean d = false;
   private boolean e = false;
   private boolean f = false;
   private String waypointMode = "CLASSIC";
   private final EventListener<an> g = event -> {
      if (this.c > 7 && event.getKey() == this.c && event.getAction() == 1 && mc.currentScreen == null && mc.player != null) {
         this.a();
      }
   };
   private final EventListener<ao> h = event -> {
      if (this.c >= 0 && this.c <= 7 && event.getButton() == this.c && event.getAction() == 1 && mc.currentScreen == null && mc.player != null) {
         this.a();
      }
   };
   private final EventListener<W> i = event -> {
      if (this.e && mc.player != null) {
         if (!(mc.currentScreen instanceof DeathScreen)) {
            this.f = true;
         } else if (this.f) {
            int var2 = (int)mc.player.getX();
            int var3 = (int)mc.player.getY();
            int var4 = (int)mc.player.getZ();
            int var5 = this.getNextAvailableNumber("Смерть ");
            String var6 = "Смерть " + var5;
            Vec3d var7 = new Vec3d(var2, var3, var4);
            this.a.put(var6, var7);
            eg.info(Text.of(av.translate("modules.waypoints.added", var6, var2, var3, var4)));
            this.b();
            this.f = false;
         }
      }
   };

   private void a() {
      Vec3d var1 = mc.player.getEyePos();
      Vec3d var2 = mc.player.getRotationVec(1.0F);
      Vec3d var3 = var1.add(var2.multiply(200.0));
      RaycastContext var4 = new RaycastContext(var1, var3, ShapeType.OUTLINE, FluidHandling.NONE, mc.player);
      BlockHitResult var5 = mc.world.raycast(var4);
      int var6 = this.getNextAvailableNumber("Новая метка ");
      String var7 = "Новая метка " + var6;
      if (var5.getType() == Type.BLOCK) {
         BlockPos var8 = var5.getBlockPos();
         this.add(var7, var8.getX(), var8.getY(), var8.getZ());
      } else {
         Vec3d var9 = var1.add(var2.multiply(200.0));
         this.add(var7, (int)var9.x, (int)var9.y, (int)var9.z);
      }
   }

   public cv() {
      File var1 = new File(ar.DIRECTORY, "configs");
      if (!var1.exists()) {
         var1.mkdirs();
      }

      this.b = new File(var1, "waypoints.json");
      this.c();
   }

   public void init() {
      Mytheria.getInstance().getEventManager().subscribe(this);
   }

   public void add(String name, int x, int y, int z) {
      Vec3d var5 = new Vec3d(x, y, z);
      this.a.put(name, var5);
      eg.info(Text.of(av.translate("modules.waypoints.added", name, x, y, z)));
      this.b();
   }

   public void del(String name) {
      if (this.a.remove(name) != null) {
         eg.info(Text.of(av.translate("modules.waypoints.deleted", name)));
         this.b();
      }
   }

   public void delSilent(String name) {
      if (this.a.remove(name) != null) this.b();
   }

   public void clear() {
      this.a.clear();
      eg.info(Text.of(av.translate("modules.waypoints.cleared")));
      this.b();
   }

   public boolean contains(String name) {
      return this.a.containsKey(name);
   }

   public Set<Entry<String, Vec3d>> getEntries() {
      return this.a.entrySet();
   }

   public int getNextAvailableNumber(String prefix) {
      int var2 = 0;

      for (String var4 : this.a.keySet()) {
         if (var4.startsWith(prefix)) {
            try {
               String var5 = var4.substring(prefix.length()).trim();
               int var6 = Integer.parseInt(var5);
               if (var6 > var2) {
                  var2 = var6;
               }
            } catch (NumberFormatException var7) {
            }
         }
      }

      for (int var8 = 1; var8 <= var2 + 1; var8++) {
         String var9 = prefix + var8;
         if (!this.a.containsKey(var9)) {
            return var8;
         }
      }

      return var2 + 1;
   }

   public int getQuickWaypointBind() {
      return this.c;
   }

   public void setQuickWaypointBind(int keyCode) {
      this.c = keyCode;
      this.b();
   }

   public boolean isAutoWaypointOnEvent() {
      return this.d;
   }

   public void setAutoWaypointOnEvent(boolean value) {
      this.d = value;
      this.b();
   }

   public boolean isAutoWaypointOnDeath() {
      return this.e;
   }

   public void setAutoWaypointOnDeath(boolean value) {
      this.e = value;
      this.b();
   }

   public String getWaypointMode() {
      return this.waypointMode;
   }

   public void setWaypointMode(String mode) {
      if (mode == null) return;
      String m = mode.toUpperCase();
      if (m.equals("CLASSIC") || m.equals("BEACON") || m.equals("DOT") || m.equals("TRACER") || m.equals("BOTH")) {
         this.waypointMode = m;
         this.b();
      }
   }

   private void b() {
      try {
         JsonObject var1 = new JsonObject();
         JsonArray var2 = new JsonArray();

         for (Entry var4 : this.a.entrySet()) {
            JsonObject var5 = new JsonObject();
            var5.addProperty("name", (String)var4.getKey());
            var5.addProperty("x", (int)((Vec3d)var4.getValue()).x);
            var5.addProperty("y", (int)((Vec3d)var4.getValue()).y);
            var5.addProperty("z", (int)((Vec3d)var4.getValue()).z);
            var2.add(var5);
         }

         var1.add("waypoints", var2);
         JsonObject var10 = new JsonObject();
         var10.addProperty("quickWaypointBind", this.c);
         var10.addProperty("autoWaypointOnEvent", this.d);
         var10.addProperty("autoWaypointOnDeath", this.e);
         var10.addProperty("waypointMode", this.waypointMode);
         var1.add("settings", var10);

         try (FileWriter var11 = new FileWriter(this.b)) {
            var11.write(ar.GSON.toJson(var1));
         }
      } catch (Exception var9) {
         var9.printStackTrace();
      }
   }

   private void c() {
      if (this.b.exists()) {
         try (FileReader var1 = new FileReader(this.b)) {
            JsonObject var2 = (JsonObject)ar.GSON.fromJson(var1, JsonObject.class);
            if (var2 != null) {
               if (var2.has("waypoints")) {
                  for (JsonElement var5 : var2.getAsJsonArray("waypoints")) {
                     JsonObject var6 = var5.getAsJsonObject();
                     String var7 = var6.get("name").getAsString();
                     int var8 = var6.get("x").getAsInt();
                     int var9 = var6.get("y").getAsInt();
                     int var10 = var6.get("z").getAsInt();
                     this.a.put(var7, new Vec3d(var8, var9, var10));
                  }
               } else {
                  JsonArray var14 = (JsonArray)ar.GSON.fromJson(var1, JsonArray.class);
                  if (var14 != null) {
                     for (JsonElement var17 : var14) {
                        JsonObject var18 = var17.getAsJsonObject();
                        String var19 = var18.get("name").getAsString();
                        int var20 = var18.get("x").getAsInt();
                        int var21 = var18.get("y").getAsInt();
                        int var22 = var18.get("z").getAsInt();
                        this.a.put(var19, new Vec3d(var20, var21, var22));
                     }
                  }
               }

               if (var2.has("settings")) {
                  JsonObject var15 = var2.getAsJsonObject("settings");
                  if (var15.has("quickWaypointBind")) {
                     this.c = var15.get("quickWaypointBind").getAsInt();
                  }

                  if (var15.has("autoWaypointOnEvent")) {
                     this.d = var15.get("autoWaypointOnEvent").getAsBoolean();
                  }

                  if (var15.has("autoWaypointOnDeath")) {
                     this.e = var15.get("autoWaypointOnDeath").getAsBoolean();
                  }
                  if (var15.has("waypointMode")) {
                     String m = var15.get("waypointMode").getAsString().toUpperCase();
                     if (m.equals("CLASSIC") || m.equals("BEACON") || m.equals("DOT") || m.equals("TRACER") || m.equals("BOTH")) {
                        this.waypointMode = m;
                     }
                  }
               }
            }
         } catch (Exception var13) {
            var13.printStackTrace();
         }
      }
   }
}
