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

import lombok.Generated;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.util.math.MathHelper;

public class X extends w implements IMinecraft {
   private float a;
   private float b;
   private boolean c;
   private boolean d;
   private boolean e;
   private double f;

   public X(float moveForward, float moveStrafe, boolean jump, boolean sneak, boolean sprint) {
      this.a = moveForward;
      this.b = moveStrafe;
      this.c = jump;
      this.d = sneak;
      this.e = sprint;
      this.f = 0.3;
   }

   public void setYaw(float yaw, float direction) {
      float var3 = this.getForward();
      float var4 = this.getStrafe();
      double var5 = MathHelper.wrapDegrees(Math.toDegrees(ee.direction(direction, var3, var4)));
      if (var3 != 0.0F || var4 != 0.0F) {
         float var7 = 0.0F;
         float var8 = 0.0F;
         float var9 = Float.MAX_VALUE;

         for (float var10 = -1.0F; var10 <= 1.0F; var10++) {
            for (float var11 = -1.0F; var11 <= 1.0F; var11++) {
               if (var11 != 0.0F || var10 != 0.0F) {
                  double var12 = MathHelper.wrapDegrees(Math.toDegrees(ee.direction(yaw, var10, var11)));
                  double var14 = Math.abs(var5 - var12);
                  if (var14 < var9) {
                     var9 = (float)var14;
                     var7 = var10;
                     var8 = var11;
                  }
               }
            }
         }

         this.setForward(var7);
         this.setStrafe(var8);
      }
   }

   public void setYaw(float yaw) {
      if (mc.player != null) {
         this.setYaw(yaw, mc.player.getYaw());
      }
   }

   @Generated
   public float getForward() {
      return this.a;
   }

   @Generated
   public float getStrafe() {
      return this.b;
   }

   @Generated
   public boolean isJump() {
      return this.c;
   }

   @Generated
   public boolean isSneak() {
      return this.d;
   }

   @Generated
   public boolean isSprint() {
      return this.e;
   }

   @Generated
   public double getSneakSlowDownMultiplier() {
      return this.f;
   }

   @Generated
   public void setForward(float forward) {
      this.a = forward;
   }

   @Generated
   public void setStrafe(float strafe) {
      this.b = strafe;
   }

   @Generated
   public void setJump(boolean jump) {
      this.c = jump;
   }

   @Generated
   public void setSneak(boolean sneak) {
      this.d = sneak;
   }

   @Generated
   public void setSprint(boolean sprint) {
      this.e = sprint;
   }

   @Generated
   public void setSneakSlowDownMultiplier(double sneakSlowDownMultiplier) {
      this.f = sneakSlowDownMultiplier;
   }
}
