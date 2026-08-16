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
import a.ew;
import a.uc.fO;
import a.uc.dY;
import a.uc.eP;
import a.uc.cN;
import a.uc.L;
import a.uc.dR;
import a.ey;
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
import a.g;
import a.uc.fD;
import a.ex;
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
import a.cb;
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
import a.ez;
import a.uc.S;
import a.uc.fH;
import a.uc.dU;
import a.uc.dN;
import a.uc.fN;
import a.uc.cZ;
import a.eu;
import a.uc.bJ;

import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.item.Item;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.util.Hand;

public class eu implements IMinecraft {
   private Item heldItem = null;
   private eF b = null;
   private boolean c = false;
   private ex d = null;
   private final fO e = new fO();
   private eu.a f = eu.a.IDLE;
   private final EventListener<W> g = event -> {
      if (this.c) {
         this.a();
      }
   };

   public eu() {
      Mytheria.getInstance().getEventManager().subscribe(this);
   }

   private void a() {
      if (mc.player != null && mc.world != null && mc.interactionManager != null && mc.player.getItemCooldownManager() != null) {
         switch (this.f) {
            case USING_ITEM:
               mc.interactionManager
                  .sendSequencedPacket(
                     mc.world,
                     sequence -> new PlayerInteractItemC2SPacket(Hand.MAIN_HAND, sequence, mc.player.getYaw(), mc.player.getPitch())
                  );
               this.f = eu.a.RETURNING_SLOT;
               break;
            case RETURNING_SLOT:
               ew.selectHotbarSlot(this.b);
               this.b();
               break;
            default:
               this.c = false;
               this.f = eu.a.IDLE;
         }
      } else {
         this.c = false;
         this.f = eu.a.IDLE;
      }
   }

   public void useItem(Item itemType) {
      if (mc.player != null && mc.world != null && mc.interactionManager != null && mc.currentScreen == null && !this.c) {
         ey var2 = ez.hotbar();
         eF var3 = (eF)var2.findItem(itemType);
         if (var3 == null) {
            Mytheria.getInstance()
               .getNotificationManager()
               .addNotificationOther(cb.ERROR, "Предмет не найден", "Вам необходимо иметь " + itemType.getName().getString() + " в хотбаре");
         } else if (!mc.player.getItemCooldownManager().isCoolingDown(var3.itemStack())) {
            this.heldItem = itemType;
            this.b = ew.getCurrentHotbarSlot();
            this.d = var3;
            this.c = true;
            this.f = eu.a.USING_ITEM;
            this.e.reset();
            if (ew.getCurrentHotbarSlot().item() != itemType) {
               ew.selectHotbarSlot(var3);
            }
         }
      }
   }

   private void b() {
      this.c = false;
      this.f = eu.a.IDLE;
      this.heldItem = null;
      this.b = null;
      this.d = null;
   }

   enum a {
      IDLE,
      USING_ITEM,
      RETURNING_SLOT;
   }
}
