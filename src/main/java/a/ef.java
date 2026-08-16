package a;
import a.uc.B;
import a.uc.bZ;
import a.ef;
import a.uc.bY;
import a.uc.cC;
import a.uc.bN;
import a.uc.bR;
import a.uc.aQ;
import a.uc.eR;
import a.uc.eW;
import a.uc.fO;
import a.uc.dY;
import a.ep;
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
import a.ed;
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
import a.n;
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
import a.s;
import a.uc.fH;
import a.uc.dU;
import a.uc.dN;
import a.uc.fN;
import a.uc.cZ;
import a.uc.eU;
import a.uc.bJ;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.BundleContentsComponent;
import net.minecraft.component.type.ContainerComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.resource.Resource;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;

public final class ef implements IMinecraft {
   public static List<ItemStack> getItemsInShulker(ItemStack s) {
      ArrayList var1 = new ArrayList();
      ContainerComponent var2 = (ContainerComponent)s.get(DataComponentTypes.CONTAINER);
      if (var2 == null) {
         BundleContentsComponent var6 = (BundleContentsComponent)s.get(DataComponentTypes.BUNDLE_CONTENTS);
         if (var6 == null) {
            return var1;
         }

         for (ItemStack var5 : var6.iterate()) {
            var1.add(var5);
         }

         return var1;
      } else {
         for (ItemStack var4 : var2.iterateNonEmpty()) {
            var1.add(var4);
         }

         return var1;
      }
   }

   public static NbtCompound getNBT(ItemStack stack) {
      DynamicRegistryManager var1 = mc.world.getRegistryManager();
      if (stack.toNbtAllowEmpty(var1) instanceof NbtCompound var2 && var2.contains("components", 10)) {
         NbtCompound var4 = var2.getCompound("components");
         if (var4.contains("minecraft:custom_data", 10)) {
            return var4.getCompound("minecraft:custom_data");
         }
      }

      return null;
   }

   public static boolean checkDonItem(ItemStack itemStack, String startWith) {
      NbtCompound var2 = getNBT(itemStack);
      if (var2 == null) {
         return false;
      } else if (var2.contains("don-item")) {
         String var3 = var2.getString("don-item");
         return var3.contains(startWith);
      } else {
         return false;
      }
   }

   public static String findHashedModel(String hashedId) {
      try {
         ResourceManager var1 = mc.getResourceManager();
         Identifier var2 = Identifier.of("minecraft", "models/item/" + hashedId.replace("minecraft:", "") + ".json");
         Optional var3 = var1.getResource(var2);
         if (var3.isPresent()) {
            try (BufferedReader var5 = ((Resource)var3.get()).getReader()) {
               return var5.lines().collect(Collectors.joining("\n"));
            }
         } else {
            return null;
         }
      } catch (Exception var10) {
         return null;
      }
   }

   public static boolean isDonItem(ItemStack itemStack) {
      NbtCompound var1 = getNBT(itemStack);
      return var1 == null ? false : var1.contains("don-item");
   }

   public static String donNBT(ItemStack itemStack) {
      NbtCompound var1 = getNBT(itemStack);
      if (var1 == null) {
         return "";
      } else {
         NbtCompound var2 = var1.getCompound("sphereEffect");
         if (var1.contains("don-item")) {
            return var1.getString("don-item");
         } else if (var1.contains("spooky-item")) {
            return var1.getString("spooky-item");
         } else if (ep.is("holyworld") && var1.contains("sphereEffect", 10) && itemStack.getItem() == Items.TOTEM_OF_UNDYING && var2.contains("rank")) {
            return var2.getString("rank").equals("ETERNITY") ? var2.getString("name") : var2.getString("rank");
         } else {
            return "";
         }
      }
   }

   public static ed getDonateItem(ItemStack stack) {
      for (ed var4 : ed.values()) {
         for (String var8 : var4.getNbt()) {
            if (donNBT(stack).equals(var8)) {
               return var4;
            }
         }
      }

      return null;
   }

   public static int totemFactor(ItemStack stack) {
      if (!stack.hasEnchantments()) {
         return -1;
      }

      for (ed var4 : ed.values()) {
         for (String var8 : var4.getNbt()) {
            if (donNBT(stack).equals(var8)) {
               return 12 - var4.getTotem();
            }
         }
      }

      return 0;
   }

   public static int bestFactor(ItemStack stack) {
      if (!stack.hasEnchantments() && !isDonItem(stack)) {
         return 17;
      }

      for (ed var4 : ed.values()) {
         for (String var8 : var4.getNbt()) {
            if (donNBT(stack).equals(var8)) {
               return 15 - var4.getFactor();
            }
         }
      }

      return 16;
   }
}
