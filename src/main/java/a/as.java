package a;
import a.b;
import a.uc.bZ;
import a.uc.eF;
import a.uc.bY;
import a.uc.cC;
import a.uc.bN;
import a.uc.bR;
import a.aq;
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
import a.az;
import a.uc.eK;
import a.uc.dZ;
import a.uc.dX;
import a.uc.R;
import a.as;
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
import a.x;
import a.uc.fC;
import a.uc.aT;
import a.uc.dH;
import a.uc.fP;
import a.uc.eM;
import a.ct;
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
import a.eb;
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
import a.cy;
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
import a.t;
import a.uc.dB;
import a.uc.cV;
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
import a.uc.E;
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
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.file.api.FileInfo;
import nesquik.mytheria.systems.setting.Setting;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.client.session.Session;
import net.minecraft.client.session.Session.AccountType;

@FileInfo(name = "client")
public class as extends aq implements IMinecraft {
   private String a = null;
   private String b = null;

   public String getLastConfigName() {
      return this.a;
   }

   public String getLastMenuCategory() {
      return this.b;
   }

   public void setLastMenuCategory(String category) {
      this.b = category;
   }

   @Override
   public void write() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("username", mc.getSession().getUsername());
      var1.addProperty("theme", Mytheria.getInstance().getThemeManager().getCurrentTheme().name());
      var1.addProperty("swing", Mytheria.getInstance().getSwingManager().getCurrent());
      var1.add("hudElements", this.a());
      var1.add("friends", this.b());
      var1.add("colorPickerPresets", this.c());
      t var2 = Mytheria.getInstance().getConfigManager().getCurrent();
      if (var2 != null) {
         var1.addProperty("lastConfig", var2.getFileName());
      }

      if (this.b != null) {
         var1.addProperty("lastMenuCategory", this.b);
      }

      try (FileWriter var3 = new FileWriter(this.file)) {
         var3.write(ar.GSON.toJson(var1));
      } catch (Exception var8) {
         var8.printStackTrace();
      }
   }

   @Override
   public void read() {
      try (FileReader var1 = new FileReader(this.getFile())) {
         JsonObject var2 = (JsonObject)ar.GSON.fromJson(var1, JsonObject.class);
         if (var2.has("username")) {
            String var3 = var2.get("username").getAsString();
            new Session(var3, UUID.randomUUID(), "", Optional.empty(), Optional.empty(), AccountType.MOJANG);
         }

         if (var2.has("swing")) {
            String var18 = var2.get("swing").getAsString();
            az var4 = Mytheria.getInstance().getSwingManager();
            aG var5 = Mytheria.getInstance().getSwingPresetManager();
            boolean var6 = false;

            for (aE var8 : Mytheria.getInstance().getSwingManager().getPresets()) {
               if (var8.getName().equals(var18)) {
                  var4.getBezier().start(var8.getBezierStart()).end(var8.getBezierEnd());
                  var4.getBack().enabled(var8.isSwingBack());
                  var4.getSpeed().setCurrentValue(var8.getSpeed());
                  aA var9 = var4.getStartPhase();
                  var9.getAnchorX().setCurrentValue(var8.getFrom().getAnchorX());
                  var9.getAnchorY().setCurrentValue(var8.getFrom().getAnchorY());
                  var9.getAnchorZ().setCurrentValue(var8.getFrom().getAnchorZ());
                  var9.getMoveX().setCurrentValue(var8.getFrom().getMoveX());
                  var9.getMoveY().setCurrentValue(var8.getFrom().getMoveY());
                  var9.getMoveZ().setCurrentValue(var8.getFrom().getMoveZ());
                  var9.getRotateX().setCurrentValue(var8.getFrom().getRotateX());
                  var9.getRotateY().setCurrentValue(var8.getFrom().getRotateY());
                  var9.getRotateZ().setCurrentValue(var8.getFrom().getRotateZ());
                  aA var10 = var4.getEndPhase();
                  var10.getAnchorX().setCurrentValue(var8.getTo().getAnchorX());
                  var10.getAnchorY().setCurrentValue(var8.getTo().getAnchorY());
                  var10.getAnchorZ().setCurrentValue(var8.getTo().getAnchorZ());
                  var10.getMoveX().setCurrentValue(var8.getTo().getMoveX());
                  var10.getMoveY().setCurrentValue(var8.getTo().getMoveY());
                  var10.getMoveZ().setCurrentValue(var8.getTo().getMoveZ());
                  var10.getRotateX().setCurrentValue(var8.getTo().getRotateX());
                  var10.getRotateY().setCurrentValue(var8.getTo().getRotateY());
                  var10.getRotateZ().setCurrentValue(var8.getTo().getRotateZ());
                  var4.setCurrent(var18);
                  var6 = true;
                  break;
               }
            }

            if (!var6) {
               aF var28 = var5.getPreset(var18);
               if (var28 != null) {
                  var5.setCurrent(var28);
                  var4.setCurrent(var18);
                  var28.load();
               }
            }
         }

         if (var2.has("theme")) {
            String var19 = var2.get("theme").getAsString();

            try {
               ct var22 = ct.valueOf(var19);
               Mytheria.getInstance().getThemeManager().setCurrentTheme(var22);
            } catch (IllegalArgumentException var15) {
               Mytheria.getInstance().getThemeManager().setCurrentTheme(ct.DARK);
            }
         }

         if (var2.has("friends")) {
            JsonArray var20 = var2.getAsJsonArray("friends");
            Mytheria.getInstance().getFriendManager().clear();

            for (JsonElement var25 : var20) {
               Mytheria.getInstance().getFriendManager().add(var25.getAsString());
            }
         }

         if (var2.has("colorPickerPresets")) {
            this.a(var2.getAsJsonArray("colorPickerPresets"));
         }

         if (var2.has("hudElements")) {
            for (JsonElement var24 : var2.getAsJsonArray("hudElements")) {
               JsonObject var26 = var24.getAsJsonObject();
               String var27 = var26.get("name").getAsString();
               float var29 = var26.get("x").getAsFloat();
               float var30 = var26.get("y").getAsFloat();
               boolean var31 = var26.get("showing").getAsBoolean();
               cP var32 = Mytheria.getInstance().getHud().getElementByName(var27);
               if (var32 != null) {
                  var32.setX(var29);
                  var32.setY(var30);
                  var32.setShowing(var31);
                  if (var26.has("settings")) {
                     JsonObject var11 = var26.getAsJsonObject("settings");

                     for (Setting var13 : var32.getSettings()) {
                        if (var11.has(var13.getName())) {
                           var13.load(var11.get(var13.getName()));
                        }
                     }
                  }
               }
            }
         }

         if (var2.has("lastConfig")) {
            this.a = var2.get("lastConfig").getAsString();
            Mytheria.LOGGER.info("Found lastConfig in client.myth: {}", this.a);
         }

         if (var2.has("lastMenuCategory")) {
            this.b = var2.get("lastMenuCategory").getAsString();
            Mytheria.LOGGER.info("Found lastMenuCategory in client.myth: {}", this.b);
         }
      } catch (Exception var17) {
         var17.printStackTrace();
      }
   }

   private JsonArray a() {
      JsonArray var1 = new JsonArray();

      for (cP var3 : Mytheria.getInstance().getHud().getElements()) {
         JsonObject var4 = new JsonObject();
         var4.addProperty("name", var3.getName());
         var4.addProperty("x", var3.getX());
         var4.addProperty("y", var3.getY());
         var4.addProperty("showing", var3.isShowing());
         var4.add("settings", this.a(var3));
         var1.add(var4);
      }

      return var1;
   }

   private JsonObject a(cP element) {
      JsonObject var2 = new JsonObject();

      for (Setting var4 : element.getSettings()) {
         var2.add(var4.getName(), var4.save());
      }

      return var2;
   }

   private JsonArray b() {
      JsonArray var1 = new JsonArray();

      for (String var3 : Mytheria.getInstance().getFriendManager().listFriends()) {
         var1.add(var3);
      }

      return var1;
   }

   private JsonArray c() {
      JsonArray var1 = new JsonArray();

      for (cy.a var3 : cy.COLOR_PRESETS) {
         if (var3.isShowing()) {
            JsonObject var4 = new JsonObject();
            eb var5 = var3.getColor();
            var4.addProperty("red", var5.getRed());
            var4.addProperty("green", var5.getGreen());
            var4.addProperty("blue", var5.getBlue());
            var4.addProperty("alpha", var5.getAlpha());
            var1.add(var4);
         }
      }

      return var1;
   }

   private void a(JsonArray presetsArray) {
      ArrayList var2 = new ArrayList();

      for (JsonElement var4 : presetsArray) {
         JsonObject var5 = var4.getAsJsonObject();
         float var6 = var5.get("red").getAsFloat();
         float var7 = var5.get("green").getAsFloat();
         float var8 = var5.get("blue").getAsFloat();
         float var9 = var5.get("alpha").getAsFloat();
         eb var10 = new eb(var6, var7, var8, var9);
         var2.add(new cy.a(var10));
      }

      cy.setColorPresets(var2);
   }
}
