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
import a.cs;
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
import a.cq;
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

import java.util.Comparator;
import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class cs implements IMinecraft {
   private boolean a = false;
   private boolean b = false;
   private boolean c = false;
   private boolean d = false;
   private boolean e = false;
   private boolean f = false;
   private boolean g = false;
   private float h = -1.0F;
   private Comparator<Entity> i = cq.DISTANCE;

   public boolean isEntityValid(Entity entity) {
      if (mc.player == null || mc.world == null || entity == null) {
         return false;
      }

      if (entity instanceof LivingEntity && entity != mc.player) {
         if (entity instanceof LivingEntity var2 && var2.isDead()) {
            return false;
         } else {
            if (!this.isWithinRange(entity)) {
               return false;
            }

            if (entity instanceof ArmorStandEntity) {
               return this.g;
            }

            if (!this.d && entity.isInvisible()) {
               return false;
            }

            if (entity instanceof PlayerEntity var3) {
               boolean var4 = Mytheria.getInstance().getFriendManager().isFriend(var3.getName().getString());
               if (!this.f && var4) {
                  return false;
               } else {
                  boolean var5 = this.a(var3);
                  if (!this.a && !this.e) {
                     return false;
                  } else if (this.a && this.e) {
                     return true;
                  } else {
                     return this.e ? var5 : !var5;
                  }
               }
            } else if (entity instanceof AnimalEntity) {
               return this.b;
            } else {
               return entity instanceof MobEntity ? this.c : false;
            }
         }
      } else {
         return false;
      }
   }

   public boolean isWithinRange(Entity entity) {
      return this.getRequiredRange() <= 0.0F ? true : entity.distanceTo(mc.player) <= this.getRequiredRange();
   }

   private boolean a(PlayerEntity player) {
      for (ItemStack var3 : player.getAllArmorItems()) {
         if (var3 != null && !var3.isEmpty()) {
            return false;
         }
      }

      return true;
   }

   @Generated
   public boolean isTargetPlayers() {
      return this.a;
   }

   @Generated
   public boolean isTargetAnimals() {
      return this.b;
   }

   @Generated
   public boolean isTargetMobs() {
      return this.c;
   }

   @Generated
   public boolean isTargetInvisibles() {
      return this.d;
   }

   @Generated
   public boolean isTargetNakedPlayers() {
      return this.e;
   }

   @Generated
   public boolean isTargetFriends() {
      return this.f;
   }

   @Generated
   public boolean isTargetArmorStands() {
      return this.g;
   }

   @Generated
   public float getRequiredRange() {
      return this.h;
   }

   @Generated
   public Comparator<Entity> getTargetComparator() {
      return this.i;
   }
}
