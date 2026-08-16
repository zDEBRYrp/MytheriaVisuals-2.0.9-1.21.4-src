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
import a.ep;
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
import a.bi;
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
import a.ch;
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

import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import nesquik.mytheria.utility.mixins.ArmorItemAddition;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Items;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode;

@ModuleInfo(name = "Elytra Utils", category = ax.PLAYER, desc = "Помощник с элитрами")
public class bi extends aJ {
   private final cg a = new cg(this, "Клавиша свапа");
   private final cg b = new cg(this, "Клавиша фейерверка");
   private final ch c = new ch(this, "Fly после свапа на элитры");
   private boolean d;
   private bi.a e;
   private final EventListener<W> f = event -> {
      if (mc.player.isGliding()) {
         this.d = true;
      }

      eE var2 = ew.getChestplateSlot();
      ey<ex> var3 = ez.hotbar().and(ez.inventory()).and(ez.offhand());
      ex var4 = var3.findItem(
         itemStack -> itemStack.getItem() instanceof ArmorItem var1 && ((ArmorItemAddition)var1).Mytheria$getType() == EquipmentType.CHESTPLATE
      );
      ex var5 = var3.findItem(Items.FIREWORK_ROCKET);
      boolean var6 = var2.item() == Items.ELYTRA;
      if (this.e != null) {
         if (this.e.a == 0 && mc.currentScreen == null) {
            mc.setScreen(new InventoryScreen(mc.player));
            this.e.a++;
            return;
         }

         switch (this.e.a) {
            case 1:
               ew.moveItem(this.e.c.getIdForServer(), this.e.d.getIdForServer(), true);
            default:
               if (this.e.a++ >= 1) {
                  mc.setScreen(null);
                  if (this.c.isEnabled() && this.e.e) {
                     mc.player.networkHandler.sendChatCommand("fly");
                  }

                  this.e = null;
               }
         }
      }
   };
   private final EventListener<an> g = event -> {
      if (this.a.isKey(event.getKey()) && event.getAction() == 1 && mc.currentScreen == null) {
         this.a();
      }

      if (this.b.isKey(event.getKey()) && event.getAction() == 1 && mc.currentScreen == null) {
         ew.selectItemInHotbar(Items.FIREWORK_ROCKET);
      }
   };
   private final EventListener<ao> h = event -> {
      if (this.a.isKey(event.getButton()) && event.getAction() == 1 && mc.currentScreen == null) {
         this.a();
      }

      if (this.b.isKey(event.getButton()) && event.getAction() == 1 && mc.currentScreen == null) {
         ew.selectItemInHotbar(Items.FIREWORK_ROCKET);
      }
   };

   private void a() {
      eE var1 = ew.getChestplateSlot();
      ey<ex> var2 = ez.inventory().and(ez.hotbar());
      ex var3 = var2.findItem(itemStack -> itemStack.getItem() == Items.ELYTRA && !itemStack.willBreakNextUse());
      ex var4 = var2.findItem(
         itemStack -> itemStack.getItem() instanceof ArmorItem var1x && ((ArmorItemAddition)var1x).Mytheria$getType() == EquipmentType.CHESTPLATE
      );
      boolean var5 = var1.item() == Items.ELYTRA;
      if (!var5 && var3 != null) {
         if (mc.player != null) {
            mc.player.networkHandler.sendPacket(new ClientCommandC2SPacket(mc.player, Mode.RELEASE_SHIFT_KEY));
         }

         this.e = new bi.a(var3, var1, true);
      } else if (var4 != null) {
         if (mc.player != null) {
            mc.player.networkHandler.sendPacket(new ClientCommandC2SPacket(mc.player, Mode.RELEASE_SHIFT_KEY));
         }

         this.e = new bi.a(var4, var1, false);
      }
   }

   @Override
   public void onDisable() {
      this.d = false;
   }

   @Override
   public boolean isHidden() {
      return super.isHidden() || ep.isHW() || ep.isRW() || ep.isST();
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

   @Override
   public void onEnable() {
      this.d = false;
   }

   static class a {
      int a;
      int b = 0;
      final ex c;
      final ex d;
      final boolean e;

      a(ex from, ex chest, boolean isEquippingElytra) {
         this.c = from;
         this.d = chest;
         this.e = isEquippingElytra;
      }
   }
}
