package a.uc;
import a.b;
import a.by;
import a.cc;
import a.ew;
import a.fo;
import a.cn;
import a.l;
import a.dr;
import a.er;
import a.az;
import a.dx;
import a.r;
import a.as;
import a.ed;
import a.dd;
import a.ab;
import a.cj;
import a.cx;
import a.eg;
import a.ae;
import a.de;
import a.m;
import a.dw;
import a.d;
import a.bw;
import a.fj;
import a.v;
import a.g;
import a.bs;
import a.ce;
import a.at;
import a.dh;
import a.br;
import a.em;
import a.ct;
import a.cr;
import a.ci;
import a.aq;
import a.cg;
import a.j;
import a.bc;
import a.ag;
import a.ei;
import a.ao;
import a.cp;
import a.di;
import a.ak;
import a.aj;
import a.o;
import a.ef;
import a.dy;
import a.cd;
import a.eh;
import a.eb;
import a.fe;
import a.bk;
import a.ap;
import a.fp;
import a.ft;
import a.cf;
import a.bf;
import a.en;
import a.bi;
import a.dc;
import a.fq;
import a.au;
import a.bh;
import a.af;
import a.a;
import a.fm;
import a.bn;
import a.ah;
import a.bd;
import a.z;
import a.i;
import a.fd;
import a.ch;
import a.da;
import a.fb;
import a.df;
import a.av;
import a.ek;
import a.es;
import a.al;
import a.bq;
import a.ee;
import a.n;
import a.k;
import a.cb;
import a.el;
import a.eo;
import a.bp;
import a.ad;
import a.ck;
import a.doItem;
import a.t;
import a.db;
import a.fs;
import a.an;
import a.bt;
import a.fy;
import a.ey;
import a.dj;
import a.ff;
import a.fk;
import a.bg;
import a.fg;
import a.p;
import a.dv;
import a.y;
import a.fr;
import a.bu;
import a.dt;
import a.et;
import a.cl;
import a.cs;
import a.ec;
import a.dg;
import a.x;
import a.fl;
import a.aw;
import a.bl;
import a.cu;
import a.cw;
import a.w;
import a.fx;
import a.bo;
import a.dl;
import a.c;
import a.fu;
import a.f;
import a.fa;
import a.be;
import a.dk;
import a.bm;
import a.aa;
import a.ez;
import a.cy;
import a.bx;
import a.cq;
import a.ej;
import a.ex;
import a.du;
import a.s;
import a.dm;
import a.dn;
import a.dO;
import a.fc;
import a.ea;
import a.e;
import a.fw;
import a.dq;
import a.ds;
import a.fn;
import a.fi;
import a.ax;
import a.h;
import a.ep;
import a.cv;
import a.ca;
import a.bv;
import a.fv;
import a.q;
import a.fz;
import a.cz;
import a.ay;
import a.eq;
import a.dz;
import a.ev;
import a.ba;
import a.u;
import a.eu;
import a.ai;
import a.ac;
import a.bj;
import a.ar;
import a.am;
import a.bb;
import a.fh;
import a.dp;
import a.co;
import a.cm;
import a.bz;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import net.minecraft.text.Text;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.client.gui.hud.BossBarHud;
import net.minecraft.client.gui.hud.ClientBossBar;
import net.minecraft.entity.Entity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;

public final class eI implements IMinecraft {
   private static final double[] a = new double[65536];

   public static double sin(double radians) {
      int var2 = (int)(radians * 10430.378350470453) & 65535;
      return a[var2];
   }

   public static double cos(double radians) {
      int var2 = (int)(radians * 10430.378350470453 + 16384.0) & 65535;
      return a[var2];
   }

   public static float random(double min, double max) {
      return (float)(min + (max - min) * Math.random());
   }

   public static double cubicBezier(double t, double p0, double p1, double p2, double p3) {
      return Math.pow(1.0 - t, 3.0) * p0 + 3.0 * t * Math.pow(1.0 - t, 2.0) * p1 + 3.0 * Math.pow(t, 2.0) * (1.0 - t) * p2 + Math.pow(t, 3.0) * p3;
   }

   public static boolean canSeen(Vec3d targetVec) {
      return mc.world
            .raycast(new RaycastContext(mc.player.getEyePos(), targetVec, ShapeType.COLLIDER, FluidHandling.NONE, mc.player))
            .getType()
         == Type.MISS;
   }

   public static boolean canShoot(Vec3d targetVec) {
      Vec3d var1 = mc.player.getEyePos();
      Vec3d var2 = targetVec.subtract(var1);
      double var3 = var2.length();
      var2 = var2.normalize();
      HashSet var5 = new HashSet();
      int var6 = 0;
      double var7 = 0.25;

      for (double var9 = 0.0; var9 <= var3; var9 += var7) {
         Vec3d var11 = var1.add(var2.multiply(var9));
         BlockPos var12 = BlockPos.ofFloored(var11);
         if (!var5.contains(var12)) {
            var5.add(var12);
            BlockState var13 = mc.world.getBlockState(var12);
            if (!var13.isAir()) {
               Block var14 = var13.getBlock();
               if (!var13.isOf(Blocks.GLASS) && !var13.isOf(Blocks.GLASS_PANE) && !(var13.getBlock() instanceof TrapdoorBlock)) {
                  VoxelShape var15 = var13.getCollisionShape(mc.world, var12);
                  if (!var15.isEmpty()) {
                     var6++;
                  }
               }
            }
         }
      }

      AtomicBoolean var20 = new AtomicBoolean(false);
      BossBarHud var10 = mc.inGameHud.getBossBarHud();
      if (var10 != null) {
         Class<BossBarHud> var21 = BossBarHud.class;

         try {
            Field var22 = var21.getField("bossBars");
            Map<UUID, ClientBossBar> var23 = (Map<UUID, ClientBossBar>)var22.get(var10);

            for (UUID var25 : var23.keySet()) {
               ClientBossBar var16 = (ClientBossBar)var23.get(var25);
               List<Text> var17 = var16.getName().getSiblings();
               var17.stream().allMatch(text -> {
                  if (text.getString().contains("룳ꈣꈃ룲ꈣꈅ")) {
                     var20.set(true);
                  }

                  return true;
               });
            }
         } catch (Exception var18) {
         }
      }

      return var6 <= (var20.get() ? 3 : (mc.player.getInventory().selectedSlot == 0 ? 2 : 1));
   }

   public static int levenshtein(String a, String b) {
      int var2 = a.length();
      int var3 = b.length();
      int[] var4 = new int[var3 + 1];
      int var5 = 0;

      while (var5 <= var3) {
         var4[var5] = var5++;
      }

      for (int var6 = 1; var6 <= var2; var6++) {
         int var7 = var4[0];
         var4[0] = var6;

         for (int var8 = 1; var8 <= var3; var8++) {
            int var9 = var4[var8];
            int var10 = a.charAt(var6 - 1) == b.charAt(var8 - 1) ? 0 : 1;
            var4[var8] = Math.min(Math.min(var4[var8] + 1, var4[var8 - 1] + 1), var7 + var10);
            var7 = var9;
         }
      }

      return var4[var3];
   }

   public static float interpolate(double oldValue, double newValue, double interpolationValue) {
      return (float)(oldValue + (newValue - oldValue) * interpolationValue);
   }

   public static HitResult rayTrace(double rayTraceDistance, float yaw, float pitch, Entity entity) {
      Vec3d var5 = mc.player.getCameraPosVec(1.0F);
      Vec3d var6 = getVectorForRotation(pitch, yaw);
      Vec3d var7 = var5.add(var6.x * rayTraceDistance, var6.y * rayTraceDistance, var6.z * rayTraceDistance);
      return mc.world.raycast(new RaycastContext(var5, var7, ShapeType.OUTLINE, FluidHandling.NONE, entity));
   }

   public static boolean tracedTo(Entity shooter, Vec3d startVec, Vec3d endVec, Box boundingBox, Predicate<Entity> filter, double distance, Entity target) {
      World var8 = shooter.getWorld();
      double var9 = distance;

      for (Entity var12 : var8.getOtherEntities(shooter, boundingBox, filter)) {
         Box var13 = var12.getBoundingBox().expand(var12.getTargetingMargin());
         Optional var14 = var13.raycast(startVec, endVec);
         if (var13.contains(startVec)) {
            if (var9 >= 0.0) {
               if (var12 == target) {
                  return true;
               }

               var9 = 0.0;
            }
         } else if (var14.isPresent()) {
            Vec3d var15 = (Vec3d)var14.get();
            double var16 = startVec.squaredDistanceTo(var15);
            if (var12.getRootVehicle() == shooter.getRootVehicle()) {
               if (var9 == 0.0 && var12 == target) {
                  return true;
               }
            } else {
               if (var12 == target) {
                  return true;
               }

               var9 = var16;
            }
         }
      }

      return false;
   }

   public static boolean canTraceWithBlock(double rayTraceDistance, float yaw, float pitch, Entity entity, Entity target, boolean checkBlocks) {
      if (target != null && entity != null && mc.world != null) {
         float var7 = mc.getRenderTickCounter().getTickDelta(false);
         Vec3d var8 = entity.getCameraPosVec(var7);
         Vec3d var9 = target.getBoundingBox().getCenter();
         if (checkBlocks) {
            BlockHitResult var10 = mc.world.raycast(new RaycastContext(var8, var9, ShapeType.COLLIDER, FluidHandling.NONE, entity));
            if (var10 != null && var10.getType() == Type.BLOCK) {
               double var11 = var10.getPos().squaredDistanceTo(var8);
               double var13 = var9.squaredDistanceTo(var8);
               if (var11 < var13) {
                  return false;
               }
            }
         }

         Vec3d var15 = getVectorForRotation(pitch, yaw);
         Vec3d var16 = var8.add(var15.multiply(rayTraceDistance));
         Box var12 = entity.getBoundingBox().stretch(var15.multiply(rayTraceDistance)).expand(1.0);
         return tracedTo(entity, var8, var16, var12, e -> !e.isSpectator() && e.canHit(), rayTraceDistance * rayTraceDistance, target);
      } else {
         return false;
      }
   }

   public static Vec3d getVectorForRotation(float pitch, float yaw) {
      float var2 = -yaw * (float) (Math.PI / 180.0) - (float) Math.PI;
      float var3 = -pitch * (float) (Math.PI / 180.0);
      float var4 = MathHelper.cos(var2);
      float var5 = MathHelper.sin(var2);
      float var6 = -MathHelper.cos(var3);
      float var7 = MathHelper.sin(var3);
      return new Vec3d(var5 * var6, var7, var4 * var6);
   }

   public static float angleDifference(float angle1, float angle2) {
      float var2 = (angle1 - angle2) % 360.0F;
      if (var2 < -180.0F) {
         var2 += 360.0F;
      } else if (var2 > 180.0F) {
         var2 -= 360.0F;
      }

      return var2;
   }

   public static String calculate(String expression) {
      expression = expression.replaceAll("\\s+", "");
      if (expression.isEmpty()) {
         return "";
      }

      try {
         double var1 = new eM(expression).build().evaluate();
         return String.valueOf(var1);
      } catch (IllegalArgumentException var3) {
         return expression;
      }
   }

   static {
      for (int var0 = 0; var0 < 65536; var0++) {
         a[var0] = Math.sin(var0 * (Math.PI * 2) / 65536.0);
      }
   }
}
