package a;
import a.b;
import a.bz;
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
import a.ab;
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

import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.Module;
import net.minecraft.client.MinecraftClient;
import ru.kotopushka.compiler.sdk.annotations.CompileBytecode;

public class aw {
   private final List<Module> a = new ArrayList<>();
   private final EventListener<W> b;
   private final EventListener<ab> c;
   private final EventListener<an> d = event -> {
      var mc = MinecraftClient.getInstance();
      for (Module var3 : this.getModules()) {
         if (var3.getKey() == event.getKey() && var3.getKey() != -1 && event.getAction() == 1) {
            boolean isMenu = var3 instanceof bN;
            if (mc.currentScreen == null || isMenu || mc.currentScreen instanceof ds) {
               var3.toggle();
            }
         }
      }
   };
   private final EventListener<ao> e = event -> {
      var mc = MinecraftClient.getInstance();
      for (Module var3 : this.getModules()) {
         if (var3.getKey() == event.getButton() && var3.getKey() != -1 && event.getAction() == 1) {
            boolean isMenu = var3 instanceof bN;
            if (mc.currentScreen == null || isMenu || mc.currentScreen instanceof ds) {
               var3.toggle();
            }
         }
      }
   };

   public aw(EventListener<W> tickListener, EventListener<ab> moduleWidgetRenderer) {
      this.b = tickListener;
      this.c = moduleWidgetRenderer;
      Mytheria.getInstance().getEventManager().subscribe(this);
   }

   @CompileBytecode
   public void registerModules() {
      this.register(new bn());
      this.register(new bh());
      this.register(new aO());
      this.register(new aV());
      this.register(new aP());
      this.register(new bf());
      this.register(new bN());
      this.register(new bl());
      this.register(new bQ());
      this.register(new bA());
      this.register(new bw());
      this.register(new bR());
      this.register(new aM());
      this.register(new bS());
      this.register(new bV());
      this.register(new bJ());
      this.register(new bH());
      this.register(new bT());
      this.register(new bC());
      this.register(new bv());
      this.register(new bj());
      this.register(new bx());
      this.register(new bX());
      this.register(new bD());
      this.register(new bW());
      this.register(new bM());
      this.register(new bP());
      this.register(new aN());
      this.register(new bd());
      this.register(new bp());
      this.register(new bo());
      this.register(new bm());
      this.register(new bc());
      this.register(new br());
      this.register(new aY());
      this.register(new aX());
      this.register(new bs());
      this.register(new bt());
      this.register(new bO());
      this.register(new aZ());
      this.register(new bi());
      this.register(new bk());
      this.register(new bF());
      this.register(new bu());
      this.register(new aR());
      this.register(new aU());
      this.register(new bq());
      this.register(new bg());
      this.register(new aS());
      this.register(new aQ());
      this.register(new ba());
      this.register(new aT());
      this.register(new aW());
      this.register(new bb());
      this.register(new bU());
      this.register(new bL());
      this.register(new bB());
      this.register(new bz());
      this.register(new bI());
      this.register(new be());
      this.register(new bK());
      this.register(new bE());
      this.register(new bG());
   }

   @CompileBytecode
   public void enableModules() {
      for (Module var2 : this.a) {
         if (var2.getInfo().enabledByDefault()) {
            var2.enable();
         }
      }

      Mytheria.LOGGER.info("Enabled default modules");
   }

   public void register(aJ module) {
      this.a.add(module);
   }

   public <T extends Module> T getModule(String name) {
      return (T)this.a
         .stream()
         .filter(module -> module.getName().replace(" ", "").equalsIgnoreCase(name) || module.getName().equalsIgnoreCase(name))
         .findFirst()
         .orElseThrow(() -> new aI(name));
   }

   public <T extends Module> T getModule(Class<T> clazz) {
      return (T)this.a.stream().filter(module -> module.getClass().equals(clazz)).findFirst().orElseThrow(() -> new aI(clazz.getSimpleName()));
   }

   public <T extends Module> T getModuleSafe(Class<T> clazz) {
      return (T)this.a.stream().filter(module -> module.getClass().equals(clazz)).findFirst().orElse(null);
   }

   public void disableAllModules() {
      for (Module var2 : this.a) {
         if (var2.isEnabled()) {
            var2.disable();
         }
      }
   }

   @Generated
   public List<Module> getModules() {
      return this.a;
   }

   @Generated
   public EventListener<W> getTickListener() {
      return this.b;
   }

   @Generated
   public EventListener<ab> getModuleWidgetRenderer() {
      return this.c;
   }

   @Generated
   public EventListener<an> getOnKeyPress() {
      return this.d;
   }

   @Generated
   public EventListener<ao> getOnMouseButtonPress() {
      return this.e;
   }
}
