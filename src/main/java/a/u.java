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
import a.u;
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
import a.uc.S;
import a.uc.fH;
import a.uc.dU;
import a.uc.dN;
import a.uc.fN;
import a.uc.cZ;
import a.uc.eU;
import a.uc.bJ;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import lombok.Generated;
import nesquik.mytheria.Mytheria;
import net.minecraft.text.Text;

public class u {
   private final List<t> a = new ArrayList<>();
   private t b;
   private boolean c = false;

   public void handle() {
      if (this.getAutoSaveConfig() == null) {
         this.createConfig("autosave");
      }

      if (!this.c) {
         this.a();
         this.c = true;
      }
   }

   public void directionConfig() {
      try {
         File var1 = new File(ar.DIRECTORY, "configs");
         String[] var2 = new String[]{"explorer", var1.getAbsolutePath()};
         Runtime.getRuntime().exec(var2);
      } catch (Exception var3) {
         Mytheria.LOGGER.error("Не удалось открыть папку с конфигами: {}", var3.getMessage());
      }
   }

   public void createConfig(String name) {
      if (name != null) {
         this.refresh();
         t var2 = new t(name);
         if (name.equals("autosave")) {
            var2.load();
         }

         var2.save();
         this.a.add(var2);
      }
   }

   public void listConfigs() {
      this.refresh();
      eg.info(Text.of("Список конфигов:"));

      for (t var2 : this.a) {
         int var3 = this.a.indexOf(var2) + 1;
         eg.info(Text.of("[" + var3 + "] " + var2.getFileName()));
      }
   }

   private void a() {
      this.a.clear();
      Path var1 = Paths.get(ar.DIRECTORY.getPath(), "configs");
      if (!Files.exists(var1)) {
         try {
            Files.createDirectories(var1);
         } catch (IOException var6) {
            Mytheria.LOGGER.error("Не удалось создать директорию конфигов: {}", var6.getMessage());
         }
      } else {
         try (Stream<Path> var2 = Files.list(var1)) {
            var2.filter(x$0 -> Files.isRegularFile(x$0)).filter(path -> path.toString().endsWith(".myth")).forEach(path -> {
               String var2x = path.getFileName().toString();
               String var3 = var2x.substring(0, var2x.lastIndexOf(46));
               t var4 = new t(var3);
               this.a.add(var4);
            });
         } catch (IOException var8) {
            Mytheria.LOGGER.error("Ошибка при сканировании директории конфигов: {}", var8.getMessage());
         }
      }
   }

   public t getConfig(String name, boolean rescan) {
      if (rescan) {
         this.a();
      }

      return this.a.stream().filter(configFile -> configFile.getFileName().equalsIgnoreCase(name)).findFirst().orElse(null);
   }

   public t getConfig(String name) {
      return this.getConfig(name, false);
   }

   public t getAutoSaveConfig() {
      return this.b != null ? this.b : this.getConfig("autosave", false);
   }

   public void refresh() {
      this.a();
   }

   @Generated
   public List<t> getConfigFiles() {
      return this.a;
   }

   @Generated
   public t getCurrent() {
      return this.b;
   }

   @Generated
   public boolean isInitialized() {
      return this.c;
   }

   @Generated
   public void setCurrent(t current) {
      this.b = current;
   }
}
