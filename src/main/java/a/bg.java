package a;
import a.b;
import a.uc.bZ;
import a.ef;
import a.uc.bY;
import a.uc.cC;
import a.uc.bN;
import a.uc.bR;
import a.uc.aQ;
import a.uc.eR;
import a.ew;
import a.uc.fO;
import a.uc.dY;
import a.ep;
import a.uc.cN;
import a.uc.L;
import a.uc.dR;
import a.ey;
import a.ck;
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
import a.h;
import a.j;
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
import a.ao;
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
import a.an;
import a.uc.cI;
import a.cg;
import a.uc.bC;
import a.i;
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
import a.bg;
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
import a.ax;
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
import a.uc.eU;
import a.uc.bJ;

import java.util.Comparator;
import java.util.List;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode;

@ModuleInfo(name = "Auto Swap", category = ax.PLAYER, desc = "modules.descriptions.auto_swap")
public class bg extends aJ {
   private final cg a = new cg(this, "modules.settings.auto_swap.button");
   private final ck b = new ck(this, "modules.settings.auto_swap.item");
   private final ck.a c = new ck.a(this.b, "modules.settings.auto_swap.item.talisman").select();
   private final ck d = new ck(this, "modules.settings.auto_swap.swap_to");
   private final ck.a e = new ck.a(this.d, "modules.settings.auto_swap.swap_to.talisman").select();
   private final fO f = new fO();
   private bg.a g;
   private final EventListener<W> h = event -> {
      if (this.g != null && mc.player != null) {
         if (this.g.a == 0 && mc.currentScreen == null) {
            mc.setScreen(new InventoryScreen(mc.player));
            this.g.a++;
         } else {
            if (this.g.a == 1) {
               if (mc.player.getOffHandStack().getItem() == this.g.b.item()) {
                  ew.moveToOffHand(this.g.c);
               } else {
                  ew.moveToOffHand(this.g.b);
               }

               this.g.a++;
            }

            if (this.g.a >= 2) {
               mc.setScreen(null);
               this.f.reset();
               Mytheria.getInstance()
                  .getNotificationManager()
                  .addNotificationOther(
                     cb.SUCCESS,
                     this.getName(),
                     mc.player
                        .getOffHandStack()
                        .getName()
                        .getString()
                        .replace("[", "")
                        .replace("] ", "")
                        .replace("xxx ", "")
                        .replace(" xxx", "")
                        .replace("123 ", "")
                        .replace(" 123", "")
                  );
               this.g = null;
            }
         }
      }
   };
   private final EventListener<an> i = event -> {
      if (mc.currentScreen == null) {
         if (event.getAction() == 1 && this.a.isKey(event.getKey())) {
            this.a();
         }
      }
   };
   private final EventListener<ao> j = event -> {
      if (mc.currentScreen == null) {
         if (this.a.isKey(event.getButton())) {
            this.a();
         }
      }
   };

   public bg() {
      new ck.a(this.d, "modules.settings.auto_swap.swap_to.orb");
      new ck.a(this.b, "modules.settings.auto_swap.item.orb");
   }

   private void a() {
      if (mc.player != null) {
         if (mc.currentScreen == null) {
            if (this.g == null) {
               int var1 = 36 + mc.player.getInventory().selectedSlot;
               ey<ex> var2 = ez.inventory().and(ez.hotbar()).and(ez.offhand());
               List<ex> var3 = var2.findItems(this.c.isSelected() ? Items.TOTEM_OF_UNDYING : Items.PLAYER_HEAD);
               List<ex> var4 = var2.findItems(this.e.isSelected() ? Items.TOTEM_OF_UNDYING : Items.PLAYER_HEAD);
               ex var5 = var3.stream()
                  .filter(slotW -> slotW.getIdForServer() != var1)
                  .min(Comparator.comparingInt(stack -> ef.bestFactor(stack.itemStack()) - (stack.getIdForServer() == 45 ? 99 : 0)))
                  .orElse(null);
               ex var6 = var4.stream()
                  .filter(slotW -> var5 != slotW && slotW.getIdForServer() != var1)
                  .min(Comparator.comparingInt(stack -> ef.bestFactor(stack.itemStack()) - (stack.getIdForServer() == 45 ? 99 : 0)))
                  .orElse(null);
               if (var5 != null && var6 != null) {
                  mc.player.networkHandler.sendPacket(new ClientCommandC2SPacket(mc.player, Mode.RELEASE_SHIFT_KEY));
                  this.g = new bg.a(var5, var6);
               }
            }
         }
      }
   }

   @Override
   public boolean isHidden() {
      return super.isHidden() || ep.isCW() || ep.isRW() || ep.is("space");
   }

   @Override
   public void setEnabled(boolean newState, boolean silent) {
      if (!newState || !this.isHidden()) {
         super.setEnabled(newState, silent);
      }
   }

   @Override
   public void tick() {
      if (this.isHidden()) {
         super.setEnabled(false, true);
      }
   }

   static class a {
      int a = 0;
      final ex b;
      final ex c;

      a(ex slot, ex slot1) {
         this.b = slot;
         this.c = slot1;
      }
   }
}
