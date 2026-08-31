package nesquik.mytheria;
import a.ek;
import a.fj;

import a.uc.A;
import a.uc.aG;
import a.uc.aK;
import a.uc.aL;
import a.ar;
import a.at;
import a.av;
import a.aw;
import a.az;
import a.uc.bZ;
import a.uc.cN;
import a.cd;
import a.cr;
import a.cu;
import a.cv;
import a.cw;
import a.cx;
import a.dt;
import a.e;
import a.uc.eK;
import a.uc.eK;
import a.el;
import a.eq;
import a.uc.fE;
import a.uc.fJ;
import a.uc.fN;
import a.uc.fJ;
import a.h;
import a.s;
import a.t;
import a.u;
import a.v;
import a.y;
import a.z;
import java.awt.image.BufferedImage;
import java.net.URI;
import javax.imageio.ImageIO;
import lombok.Generated;
import nesquik.mytheria.framework.shader.GlProgram;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.ResourceType;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.kotopushka.compiler.sdk.annotations.Compile;
import ru.kotopushka.compiler.sdk.annotations.CompileBytecode;
import ru.kotopushka.compiler.sdk.annotations.Initialization;

public enum Mytheria implements IMinecraft {
   INSTANCE;

   public static final String NAME = "Mytheria";
   public static final String BUILD_TYPE = "Beta";
   public static final String VERSION = "2.0";
   public static final String MOD_ID = "Mytheria".toLowerCase();
   public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
   private z a;
   private cu b;
   private aw c;
   private h d;
   private at e;
   private v f;
   private fE g;
   private cr h;
   private fN i;
   private ar j;
   private bZ k;
   private u l;
   private az m;
   private eq n;
   private cN o;
   private A p;
   private cd q;
   private cv r;
   private aG discordRpc;
   private dt t;
   private eK u;
   private cx v;
   private e w;
   private boolean x;

   @Compile
   @Initialization
   public void initialize() {
      this.i = new fN();
      this.a = new z();
      this.r = new cv();
      this.r.init();
      this.e = new at();
      this.b = new cu();
      this.f = new v();
      this.g = new fE(new fJ());
      this.h = new cr();
      this.j = new ar();
      this.c = new aw(new aK(), new aL());
      this.o = new cN();
      this.n = new eq();
      this.k = new bZ();
      this.l = new u();
      this.j.registerClientFiles();
      this.c.registerModules();
      this.c.enableModules();
      this.l.handle();
      this.d = new h();
      this.d.initCommands();
      this.m = new az();
      this.discordRpc = new aG();
      this.discordRpc.handle();
      this.j.loadClientFiles();
      t var1 = this.l.getConfig("autosave", true);
      if (var1 != null) {
         var1.load();
         this.l.setCurrent(var1);
      }

      ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES).registerReloadListener(new SimpleSynchronousResourceReloadListener() {
         public Identifier getFabricId() {
            return Mytheria.id("after_shader_load");
         }

         public void reload(ResourceManager manager) {
            try {
               GlProgram.loadAndSetupPrograms();
            } catch (Exception var3) {
            }
         }
      });
      fj.initializeShaders();
      av.loadTranslations();
      this.u = new eK();
      this.p = new A();
      this.q = new cd();
      String var2 = System.getProperty("os.name");
      String var3 = System.getProperty("user.name");
      if (var2.toLowerCase().contains("windows") && !var3.equals("nesquik")) {
         this.f.connect();
      }

      s.init();
      ek.setDarkTitleBar();
      new y();
      this.a();
      Thread.setDefaultUncaughtExceptionHandler((thread, throwable) -> cw.reportCrash(throwable));
      this.v = new cx();
      this.v.start();
      this.w = new e();
      this.w.start();
   }

   public void shutdown() {
      LOGGER.info("Shutting down...");
      if (this.i != null) {
         this.i.shutdown();
      }

      if (this.v != null) {
         this.v.stop();
      }

      if (this.w != null) {
         this.w.stop();
      }

      if (this.f != null) {
         Thread var1 = new Thread(() -> {
            try {
               this.f.disconnect();
            } catch (Exception var2x) {
               LOGGER.error("Error disconnecting Discord", var2x);
            }
         }, "Discord-Shutdown");
         var1.setDaemon(true);
         var1.start();
      }

      try {
         this.j.saveClientFiles();
      } catch (Exception var3) {
         LOGGER.error("Error saving client files", var3);
      }

      if (!this.isPanic()) {
         try {
            this.discordRpc.getAutoSavePreset().save();
         } catch (Exception var2) {
            LOGGER.error("Error saving autosave preset", var2);
         }

         try {
            t var4 = this.l.getConfig("autosave", false);
            if (var4 != null) {
               var4.save();
            }
         } catch (Exception var5) {
            LOGGER.error("Error saving autosave config", var5);
         }
      }

      this.setPanic(false);
      LOGGER.info("Shutdown completed");
   }

   public static Mytheria getInstance() {
      return INSTANCE;
   }

   public static Identifier id(String path) {
      return Identifier.of(MOD_ID, path);
   }

   @CompileBytecode
   private void a() {
      try {
         BufferedImage var1 = ImageIO.read(URI.create("https://mytheria.pub/api/avatars/ConeTin.jpg?t=1754613855632").toURL());
         if (var1 == null) {
            return;
         }

         Identifier var2 = id("temp/avatar");
         mc.getTextureManager().registerTexture(var2, new NativeImageBackedTexture(el.bufferedImageToNativeImage(var1, true)));
      } catch (Exception var3) {
      }
   }

   @Generated
   public z getEventManager() {
      return this.a;
   }

   @Generated
   public cu getThemeManager() {
      return this.b;
   }

   @Generated
   public aw getModuleManager() {
      return this.c;
   }

   @Generated
   public h getCommandManager() {
      return this.d;
   }

   @Generated
   public at getFriendManager() {
      return this.e;
   }

   @Generated
   public v getDiscordManager() {
      return this.f;
   }

   @Generated
   public fE getRotationHandler() {
      return this.g;
   }

   @Generated
   public cr getTargetManager() {
      return this.h;
   }

   @Generated
   public fN getMusicTracker() {
      return this.i;
   }

   @Generated
   public ar getFileManager() {
      return this.j;
   }

   @Generated
   public bZ getNotificationManager() {
      return this.k;
   }

   @Generated
   public u getConfigManager() {
      return this.l;
   }

   @Generated
   public az getSwingManager() {
      return this.m;
   }

   @Generated
   public aG getSwingPresetManager() {
      return this.discordRpc;
   }

   @Generated
   public eq getTpsHandler() {
      return this.n;
   }

   @Generated
   public cN getHud() {
      return this.o;
   }

   @Generated
   public A getServerConnectionHandler() {
      return this.p;
   }

   @Generated
   public cd getPoshalkoHandler() {
      return this.q;
   }

   @Generated
   public cv getWayPointsManager() {
      return this.r;
   }

   @Generated
   public dt getMenuScreen() {
      return this.t;
   }

   @Generated
   public eK getChatListener() {
      return this.u;
   }

   @Generated
   public boolean isPanic() {
      return this.x;
   }

   @Generated
   public void setMenuScreen(dt menuScreen) {
      this.t = menuScreen;
   }

   @Generated
   public void setPanic(boolean panic) {
      this.x = panic;
   }
}
