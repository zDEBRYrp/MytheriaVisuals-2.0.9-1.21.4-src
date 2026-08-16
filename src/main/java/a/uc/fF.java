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

import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;

public final class fF implements IMinecraft {
   public static Vec3d getNearestPoint(LivingEntity entity) {
      Vec3d var1 = mc.player.getEyePos();
      return new Vec3d(
         MathHelper.clamp(var1.x, entity.getBoundingBox().minX, entity.getBoundingBox().maxX),
         MathHelper.clamp(var1.y, entity.getBoundingBox().minY, entity.getBoundingBox().maxY),
         MathHelper.clamp(var1.z, entity.getBoundingBox().minZ, entity.getBoundingBox().maxZ)
      );
   }

   public static Vec3d getNearestPoint(LivingEntity entity, Vec3d pos) {
      return entity.getPos().subtract(entity.getPos()).add(getNearestPoint(entity));
   }

   public static fD getRotationTo(Vec3d targetedEntity) {
      double var1 = targetedEntity.getX();
      double var3 = targetedEntity.getY();
      double var5 = targetedEntity.getZ();
      double var7 = var1 - mc.player.getX();
      double var9 = var3 - (mc.player.getY() + mc.player.getEyeHeight(mc.player.getPose()));
      double var11 = var5 - mc.player.getZ();
      double var13 = Math.sqrt(var7 * var7 + var11 * var11);
      float var15 = (float)Math.toDegrees(Math.atan2(var11, var7)) - 90.0F;
      float var16 = (float)(-Math.toDegrees(Math.atan2(var9, var13)));
      return new fD(var15, var16);
   }

   public static double getGcd() {
      double var0 = (Double)mc.options.getMouseSensitivity().getValue() * 0.6F + 0.2F;
      double var2 = var0 * var0 * var0;
      return var2 * 8.0 * 0.15F;
   }

   @NotNull
   public static fD correctRotation(@NotNull fD rotation) {
      double var1 = getGcd();
      float var3 = (float)(rotation.getYaw() - rotation.getYaw() % var1);
      float var4 = (float)(rotation.getPitch() - rotation.getPitch() % var1);
      return new fD(var3, var4);
   }

   public static float getAngleDifference(float current, float target) {
      float var2 = target - current;

      while (var2 > 180.0F) {
         var2 -= 360.0F;
      }

      while (var2 < -180.0F) {
         var2 += 360.0F;
      }

      return var2;
   }

   public static float adjustAngle(float currentAngle, float targetAngle) {
      float var2 = currentAngle % 360.0F;
      if (var2 < 0.0F) {
         var2 += 360.0F;
      }

      float var3 = targetAngle % 360.0F;
      if (var3 < 0.0F) {
         var3 += 360.0F;
      }

      int var4 = (int)(currentAngle / 360.0F);
      if (currentAngle < 0.0F && currentAngle % 360.0F != 0.0F) {
         var4--;
      }

      float var5 = var3 + var4 * 360;
      float var6 = var5 - currentAngle;
      if (var6 > 180.0F) {
         var5 -= 360.0F;
      } else if (var6 < -180.0F) {
         var5 += 360.0F;
      }

      return var5;
   }
}
