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
import a.uc.eX;
import a.z;
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
import a.ee;
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
import a.y;
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

import lombok.Generated;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MaceItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.TridentItem;
import net.minecraft.scoreboard.ReadableScoreboardScore;
import net.minecraft.scoreboard.ScoreboardDisplaySlot;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.scoreboard.number.StyledNumberFormat;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

public final class ee implements IMinecraft {
   private static float a = 1.0F;

   public static void resetTimer() {
      a = 1.0F;
   }

   public static Block getBlock() {
      return getBlock(0.0, 0.0, 0.0);
   }

   public static Block getBlock(double x, double y, double z) {
      return !isInGame()
         ? Blocks.AIR
         : mc.world.getBlockState(BlockPos.ofFloored(mc.player.getPos().add(x, y, z))).getBlock();
   }

   public static boolean collideWith(LivingEntity entity) {
      return collideWith(entity, 0.0F);
   }

   public static boolean collideWith(LivingEntity entity, float grow) {
      Box var2 = mc.player.getBoundingBox();
      Box var3 = entity.getBoundingBox().expand(grow, 0.0, grow);
      return var2.maxX > var3.minX
         && var2.maxY > var3.minY
         && var2.maxZ > var3.minZ
         && var2.minX < var3.maxX
         && var2.minY < var3.maxY
         && var2.minZ < var3.maxZ;
   }

   public static void setSpeed(double speed) {
      double var2 = mc.player.input.movementForward;
      double var4 = mc.player.input.movementSideways;
      float var6 = mc.player.getYaw();
      if (var2 == 0.0 && var4 == 0.0) {
         mc.player.setVelocity(0.0, mc.player.getVelocity().y, 0.0);
      } else {
         if (var2 != 0.0) {
            if (var4 > 0.0) {
               var6 += var2 > 0.0 ? -45.0F : 45.0F;
            } else if (var4 < 0.0) {
               var6 += var2 > 0.0 ? 45.0F : -45.0F;
            }

            var4 = 0.0;
            var2 = var2 > 0.0 ? 1.0 : -1.0;
         }

         double var7 = var2 * speed * Math.cos(Math.toRadians(var6 + 90.0)) + var4 * speed * Math.sin(Math.toRadians(var6 + 90.0));
         double var9 = var2 * speed * Math.sin(Math.toRadians(var6 + 90.0)) - var4 * speed * Math.cos(Math.toRadians(var6 + 90.0));
         mc.player.setVelocity(var7, mc.player.getVelocity().y, var9);
      }
   }

   public static boolean isPlayerMoving() {
      return mc.player != null && mc.world != null && mc.player.input != null
         ? mc.player.forwardSpeed != 0.0 || mc.player.input.movementSideways != 0.0
         : false;
   }

   public static Block getBlockBelow(Entity entity) {
      if (entity == null) {
         return null;
      }

      BlockPos var1 = entity.getBlockPos().down();
      return getBlockAt(var1, entity.getWorld());
   }

   public static Block getBlockAbove(Entity entity) {
      if (entity == null) {
         return null;
      }

      BlockPos var1 = entity.getBlockPos().add(0, Math.round(entity.getHeight()), 0).up();
      return getBlockAt(var1, entity.getWorld());
   }

   public static Block getBlockBelowPlayer() {
      if (mc.player != null && mc.world != null) {
         BlockPos var0 = mc.player.getBlockPos().down().up();
         return getBlockAt(var0, mc.world);
      } else {
         return null;
      }
   }

   public static Block getBlockAbovePlayer() {
      if (mc.player != null && mc.world != null) {
         BlockPos var0 = mc.player.getBlockPos().up();
         return getBlockAt(var0, mc.world);
      } else {
         return null;
      }
   }

   public static Block getBlockStandingOn(Entity entity) {
      if (entity == null) {
         return null;
      }

      BlockPos var1 = entity.getBlockPos();
      return getBlockAt(var1, entity.getWorld());
   }

   public static double getVelocity() {
      return Math.hypot(mc.player.getVelocity().x, mc.player.getVelocity().z);
   }

   public static Block getBlockStandingOnPlayer() {
      if (mc.player != null && mc.world != null) {
         BlockPos var0 = mc.player.getBlockPos();
         return getBlockAt(var0, mc.world);
      } else {
         return null;
      }
   }

   public static Block getBlockAt(BlockPos pos, World world) {
      return world.getBlockState(pos).getBlock();
   }

   public static double direction(float rotationYaw, double moveForward, double moveStrafing) {
      if (moveForward < 0.0) {
         rotationYaw += 180.0F;
      }

      float var5 = 1.0F;
      if (moveForward < 0.0) {
         var5 = -0.5F;
      } else if (moveForward > 0.0) {
         var5 = 0.5F;
      }

      if (moveStrafing > 0.0) {
         rotationYaw -= 90.0F * var5;
      }

      if (moveStrafing < 0.0) {
         rotationYaw += 90.0F * var5;
      }

      return Math.toRadians(rotationYaw);
   }

   public static boolean isInGame() {
      return mc.player != null && mc.world != null;
   }

   public static float getHealth(PlayerEntity ent) {
      if (ent == null) {
         return 0.0F;
      }

      if (mc.isInSingleplayer()) {
         return ent.getHealth() + ent.getAbsorptionAmount();
      }

      if (ep.isServerForHPFix()) {
         ScoreboardObjective var1 = ent.getScoreboard().getObjectiveForSlot(ScoreboardDisplaySlot.BELOW_NAME);
         if (var1 != null) {
            ReadableScoreboardScore var2 = ent.getScoreboard().getScore(ent, var1);
            String var3 = ReadableScoreboardScore.getFormattedScore(var2, var1.getNumberFormatOr(StyledNumberFormat.EMPTY)).getString();
            String var4 = var3.replaceAll("[^0-9.]", "");

            try {
               float var5 = Float.parseFloat(var4);
               if (var5 > 0.0F && var5 <= 1000.0F) {
                  return var5;
               }
            } catch (NumberFormatException var6) {
            }
         }
      }

      return ent.getHealth() + ent.getAbsorptionAmount();
   }

   public static boolean isHoldingWeapon() {
      if (mc.player == null) {
         return false;
      }

      ItemStack var0 = mc.player.getMainHandStack();
      Item var1 = var0.getItem();
      return var0.isEmpty() ? false : var1 instanceof SwordItem || var1 instanceof AxeItem || var1 instanceof TridentItem || var1 instanceof MaceItem;
   }

   @Generated
   public static void setTimer(float timer) {
      a = timer;
   }

   @Generated
   public static float getTimer() {
      return a;
   }
}
