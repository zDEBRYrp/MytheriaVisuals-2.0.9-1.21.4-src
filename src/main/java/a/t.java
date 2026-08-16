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
import a.eg;
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
import a.ba;
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
import a.cb;
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
import a.s;
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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.modules.Module;
import nesquik.mytheria.systems.setting.Setting;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.text.Text;

public class t implements IMinecraft {
   private List<Module> a = Mytheria.getInstance().getModuleManager().getModules();
   private File b;
   private String c;

   public t(String fileName) {
      this.c = fileName;
      File var2 = new File(ar.DIRECTORY, "configs");
      if (!var2.exists()) {
         var2.mkdir();
      }

      this.b = new File(var2, fileName + ".%s".formatted("myth"));
   }

   public void load() {
      if (!this.b.exists()) {
         Mytheria.LOGGER.warn("Config file not found: {}", this.b.getAbsolutePath());
      } else {
         try {
            try (BufferedReader var1 = new BufferedReader(new FileReader(this.b))) {
               JsonObject var2 = JsonParser.parseReader(var1).getAsJsonObject();
               if (!var2.has("modules")) {
                  Mytheria.LOGGER.warn("Invalid config format: missing 'modules' array in {}", this.c);
                  return;
               }

               JsonArray var3 = var2.getAsJsonArray("modules");
               int var4 = 0;

               for (JsonElement var6 : var3) {
                  JsonObject var7 = var6.getAsJsonObject();
                  if (var7.has("name")) {
                     String var8 = var7.get("name").getAsString();
                     boolean var9 = var7.has("enabled") && var7.get("enabled").getAsBoolean();
                     int var10 = var7.has("key") ? var7.get("key").getAsInt() : 0;

                     try {
                        Module var11 = Mytheria.getInstance().getModuleManager().getModule(var8);
                        if (!(var11 instanceof bN)) {
                           var11.setEnabled(var9, true);
                           var11.setKey(var10);
                        }

                        if (var7.has("settings")) {
                           JsonObject var12 = var7.getAsJsonObject("settings");

                           for (Setting var14 : var11.getSettings()) {
                              if (var12.has(var14.getName())) {
                                 var14.load(var12.get(var14.getName()));
                              }
                           }
                        }

                        var4++;
                     } catch (aI var16) {
                     }
                  }
               }

               ba var20 = Mytheria.getInstance().getModuleManager().getModuleSafe(ba.class);
               if (var20 != null) {
                  fL.MODULE.play(var20.getVolume().getCurrentValue(), 1.0F);
               }

               Mytheria.getInstance().getNotificationManager().addNotification(cb.SUCCESS, av.translate("configs.loaded"));
               Mytheria.LOGGER.info("Loaded {} modules from config {}", var4, this.c);
               Mytheria.getInstance().getConfigManager().setCurrent(this);
            }

            return;
         } catch (aI var18) {
            Mytheria.getInstance().getNotificationManager().addNotification(cb.SUCCESS, av.translate("configs.loaded"));
         } catch (Exception var19) {
            Mytheria.LOGGER.error("Failed to load config file {}: {}", this.c, var19.getMessage());
         }
      }
   }

   public void save() {
      try {
         if (!this.b.exists() && !this.b.createNewFile()) {
            throw new IOException("Failed to create config file: " + this.b.getAbsolutePath());
         }

         JsonObject var1 = new JsonObject();
         JsonArray var2 = this.a();
         var1.add("modules", var2);
         FileWriter var3 = new FileWriter(this.b);

         try {
            var3.write(ar.GSON.toJson(var1));
         } catch (Throwable var7) {
            try {
               var3.close();
            } catch (Throwable var6) {
               var7.addSuppressed(var6);
            }

            throw var7;
         }

         var3.close();
         if (!this.c.equals("autosave")) {
            Mytheria.getInstance().getConfigManager().setCurrent(this);
         }

         Mytheria.LOGGER.info("Successfully saved config " + this.c);
      } catch (IOException var8) {
         Mytheria.LOGGER.error("Failed to save config file", var8);
      }
   }

   public void delete() {
      if (this.b.exists() && this.b.delete()) {
         Mytheria.getInstance().getConfigManager().getConfigFiles().remove(this);
         eg.info(Text.of("Конфиг " + this.c + " успешно удален"));
         Mytheria.LOGGER.info("Config file deleted: {}", this.b.getAbsolutePath());
      } else {
         eg.error(Text.of("Произошла ошибка при удалении"));
         Mytheria.LOGGER.warn("Failed to delete config file: {}", this.b.getAbsolutePath());
      }
   }

   private JsonArray a() {
      JsonArray var1 = new JsonArray();

      for (Module var3 : this.a) {
         JsonObject var4 = new JsonObject();
         var4.addProperty("name", var3.getName());
         var4.addProperty("enabled", var3.isEnabled());
         var4.addProperty("key", var3.getKey());
         var4.add("settings", this.a(var3));
         var1.add(var4);
      }

      return var1;
   }

   private JsonObject a(Module module) {
      JsonObject var2 = new JsonObject();

      for (Setting var4 : module.getSettings()) {
         var2.add(var4.getName(), var4.save());
      }

      return var2;
   }

   @Generated
   public String getFileName() {
      return this.c;
   }
}
