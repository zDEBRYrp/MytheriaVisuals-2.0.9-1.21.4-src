package a;
import a.uc.B;
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
import a.be;
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
import a.uc.C;
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

import java.util.function.Predicate;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.screen.slot.SlotActionType;
import org.jetbrains.annotations.NotNull;

public final class ew implements IMinecraft {
   public static eF getHotbarSlot(int slotId) {
      return new eF(slotId);
   }

   public static eG getInventorySlot(int slotId) {
      return new eG(slotId);
   }

   public static eE getArmorSlot(int armorIndex) {
      return new eE(armorIndex);
   }

   public static eE getHelmetSlot() {
      return getArmorSlot(3);
   }

   public static eE getChestplateSlot() {
      return getArmorSlot(2);
   }

   public static eE getLeggingsSlot() {
      return getArmorSlot(1);
   }

   public static eE getBootsSlot() {
      return getArmorSlot(0);
   }

   public static eH getOffHandSlot() {
      return new eH();
   }

   public static boolean hasItemInOffHand(Item item) {
      return getOffHandSlot().contains(item);
   }

   public static boolean offHandItemMatches(Predicate<ItemStack> predicate) {
      return getOffHandSlot().matches(predicate);
   }

   public static boolean isOffHandEmpty() {
      return getOffHandSlot().isEmpty();
   }

   public static void moveItem(ex from, ex to) {
      if (mc.getNetworkHandler() != null) {
         from.click();
         to.click();
         if (!to.isEmpty()) {
            from.click();
         }

         mc.getNetworkHandler().sendPacket(new CloseHandledScreenC2SPacket(0));
      }
   }

   public static void quickMove(int from) {
      if (mc.getNetworkHandler() != null) {
         mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, from, 0, SlotActionType.QUICK_MOVE, mc.player);
      }
   }

   public static void moveItem(int from, int to) {
      moveItem(from, to, false);
   }

   public static void moveItem(int from, int to, boolean back) {
      if (mc.getNetworkHandler() != null) {
         mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, from, 0, SlotActionType.PICKUP, mc.player);
         mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, to, 0, SlotActionType.PICKUP, mc.player);
         if (back) {
            mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, from, 0, SlotActionType.PICKUP, mc.player);
         }
      }
   }

   public static void moveHalf(int from, int to) {
      if (mc.getNetworkHandler() != null) {
         mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, from, 1, SlotActionType.PICKUP, mc.player);
         mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, to, 0, SlotActionType.PICKUP, mc.player);
      }
   }

   public static void swapOneItem(int from, int to) {
      if (mc.getNetworkHandler() != null) {
         mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, from, 0, SlotActionType.PICKUP, mc.player);
         mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, to, 1, SlotActionType.PICKUP, mc.player);
         mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, from, 0, SlotActionType.PICKUP, mc.player);
      }
   }

   public static void hotbarSwap(int from, int to) {
      if (mc.getNetworkHandler() != null) {
         mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, from, to, SlotActionType.SWAP, mc.player);
      }
   }

   public static boolean moveToHotbar(ex fromSlot, int hotbarSlotId) {
      eF var2 = getHotbarSlot(hotbarSlotId);
      moveItem(fromSlot, var2);
      return true;
   }

   public static boolean moveToArmor(ex fromSlot, int armorIndex) {
      eE var2 = getArmorSlot(armorIndex);
      moveItem(fromSlot, var2);
      return true;
   }

   public static void moveToOffHand(ex fromSlot) {
      eH var1 = getOffHandSlot();
      moveItem(fromSlot, var1);
   }

   @NotNull
   public static eF getCurrentHotbarSlot() {
      return mc.player != null && mc.player.getInventory() != null ? getHotbarSlot(mc.player.getInventory().selectedSlot) : new eF(0);
   }

   public static void selectHotbarSlot(int slotId) {
      selectHotbarSlot(slotId, true);
   }

   public static void selectHotbarSlot(int slotId, boolean sendPacket) {
      if (mc.player != null && mc.player.getInventory() != null && mc.getNetworkHandler() != null) {
         if (slotId < 0 || slotId > 8) {
            throw new IllegalArgumentException("Hotbar slot ID must be between 0 and 8");
         }

         mc.player.getInventory().selectedSlot = slotId;
         if (sendPacket) {
            mc.getNetworkHandler().sendPacket(new UpdateSelectedSlotC2SPacket(mc.player.getInventory().selectedSlot));
         }
      }
   }

   public static void selectHotbarSlot(eF slot) {
      selectHotbarSlot(slot.getSlotId());
   }

   public static void selectHotbarSlot(eF slot, boolean sendPacket) {
      selectHotbarSlot(slot.getSlotId(), sendPacket);
   }

   public static boolean selectItemInHotbar(Item item) {
      eF var1 = new eB().findItem(item);
      if (var1 != null) {
         selectHotbarSlot(var1);
         return true;
      } else {
         return false;
      }
   }

   public static void pressHotbarKey(int slotId) {
      if (mc.player != null && mc.options != null) {
         if (slotId < 0 || slotId > 8) {
            throw new IllegalArgumentException("Hotbar slot ID must be between 0 and 8");
         }

         KeyBinding var1 = mc.options.hotbarKeys[slotId];
         mc.player.getInventory().selectedSlot = slotId;
      }
   }

   public static void pressHotbarKey(eF slot) {
      pressHotbarKey(slot.getSlotId());
   }

   public static int findItemInContainer(Predicate<ItemStack> predicate) {
      if (mc.player != null && mc.player.currentScreenHandler != null) {
         for (int var1 = 0; var1 < mc.player.currentScreenHandler.slots.size(); var1++) {
            ItemStack var2 = mc.player.currentScreenHandler.getSlot(var1).getStack();
            if (predicate.test(var2)) {
               return var1;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public static int findItemInContainer(Item item) {
      return findItemInContainer(stack -> stack.getItem() == item);
   }
}
