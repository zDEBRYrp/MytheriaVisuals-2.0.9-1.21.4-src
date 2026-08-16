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
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.ApiStatus.Internal;

public class fE implements IMinecraft {
   private final fJ a;
   private fD b = fD.ZERO;
   private final fD c = fD.ZERO;
   private fD d = fD.ZERO;
   private fD e = fD.ZERO;
   private fH f = fH.IDLE;
   @Nullable
   private fI g;
   private final fO h = new fO();

   public fE(fJ rotationUpdateListener) {
      this.a = rotationUpdateListener;
      Mytheria.getInstance().getEventManager().subscribe(this);
   }

   public boolean isIdling() {
      return this.f == fH.IDLE;
   }

   @Internal
   public void update() {
      this.d = this.b;
      if (this.g == null) {
         this.b = this.getPlayerRotation();
      } else if (this.h.finished(70L)) {
         if (this.getPlayerRotation().differenceValue(this.b) < 1.0F) {
            this.f = fH.IDLE;
            this.g = null;
         } else {
            this.f = fH.ROTATING_BACK;
            mc.player.setYaw(fF.adjustAngle(this.b.getYaw(), mc.player.getYaw()));
            this.b = fF.correctRotation(
               new fD(
                  this.a(this.b.getYaw(), this.getPlayerRotation().getYaw(), this.g.getReturnSpeed()),
                  this.a(this.b.getPitch(), this.getPlayerRotation().getPitch(), this.g.getReturnSpeed())
               )
            );
         }
      } else {
         this.f = fH.ROTATING;
         this.b = fF.correctRotation(
            new fD(
               this.a(this.b.getYaw(), this.g.getRotation().getYaw(), this.g.getSpeedX()),
               this.a(this.b.getPitch(), this.g.getRotation().getPitch(), this.g.getSpeedY())
            )
         );
      }
   }

   public void updateRender(float partialTicks) {
      if (mc.player != null) {
         float var2 = eI.interpolate(this.d.getYaw(), this.b.getYaw(), partialTicks);
         float var3 = this.d.getPitch() + (this.b.getPitch() - this.d.getPitch()) * partialTicks;
         if (var3 <= -85.0F) {
            var3 = 0.0F;
         }

         this.e = new fD(var2, var3);
         if (Mytheria.getInstance().getTargetManager().getCurrentTarget() != null) {
         }
      }
   }

   public void rotate(fD rotation, fC moveCorrection, float yawSpeed, float pitchSpeed, float returnSpeed, fG priority) {
      int var7 = priority.getPriority();
      if (this.g == null || this.g.getPriority() <= var7 || this.f != fH.ROTATING) {
         rotation.setYaw(fF.adjustAngle(this.g == null ? this.getPlayerRotation().getYaw() : this.g.getRotation().getYaw(), rotation.getYaw()));
         this.g = new fI(rotation, moveCorrection, yawSpeed, pitchSpeed, returnSpeed, var7);
         this.h.reset();
      }
   }

   public void rotate(fD rotation, fC moveCorrection, float yawSpeed, float pitchSpeed, float returnSpeed) {
      this.rotate(rotation, moveCorrection, yawSpeed, pitchSpeed, returnSpeed, fG.NORMAL);
   }

   public void rotate(fD rotation, fG priority) {
      this.rotate(rotation, fC.DIRECT, 180.0F, 180.0F, 180.0F, priority);
   }

   public void rotate(fD rotation) {
      this.rotate(rotation, fC.DIRECT, 180.0F, 180.0F, 180.0F, fG.NORMAL);
   }

   private float a(float current, float target, float speed) {
      float var4 = fF.getAngleDifference(current, target);
      return Math.abs(var4) <= speed ? target : current + Math.signum(var4) * speed;
   }

   public void rotateTowards(Entity entity, long yawSpeed, long pitchSpeed, long returnSpeed, fG priority, fC moveCorrection) {
      if (entity != null && mc.player != null) {
         double var10 = entity.getX();
         double var12 = entity.getY() + entity.getEyeHeight(entity.getPose());
         double var14 = entity.getZ();
         double var16 = var10 - mc.player.getX();
         double var18 = var12 - (mc.player.getY() + mc.player.getEyeHeight(mc.player.getPose()));
         double var20 = var14 - mc.player.getZ();
         double var22 = Math.sqrt(var16 * var16 + var20 * var20);
         float var24 = (float)Math.toDegrees(Math.atan2(var20, var16)) - 90.0F;
         float var25 = (float)(-Math.toDegrees(Math.atan2(var18, var22)));
         fD var26 = new fD(var24, var25);
         this.rotate(var26, moveCorrection, (float)yawSpeed, (float)pitchSpeed, (float)returnSpeed, priority);
      }
   }

   public fD getRotation(LivingEntity entity) {
      return new fD(entity.getYaw(), entity.getPitch());
   }

   public fD getPlayerRotation() {
      return mc.player == null ? fD.ZERO : this.getRotation(mc.player);
   }

   @Generated
   public fJ getRotationUpdateListener() {
      return this.a;
   }

   @Generated
   public fD getCurrentRotation() {
      return this.b;
   }

   @Generated
   public fD getServerRotation() {
      return this.c;
   }

   @Generated
   public fD getPrevRotation() {
      return this.d;
   }

   @Generated
   public fD getRenderRotation() {
      return this.e;
   }

   @Generated
   public fH getState() {
      return this.f;
   }

   @Generated
   public fO getRotationIdle() {
      return this.h;
   }

   @Generated
   public void setCurrentRotation(fD currentRotation) {
      this.b = currentRotation;
   }

   @Generated
   public void setPrevRotation(fD prevRotation) {
      this.d = prevRotation;
   }

   @Generated
   public void setRenderRotation(fD renderRotation) {
      this.e = renderRotation;
   }

   @Generated
   public void setState(fH state) {
      this.f = state;
   }

   @Generated
   public void setCurrentTask(@Nullable fI currentTask) {
      this.g = currentTask;
   }

   @Nullable
   @Generated
   public fI getCurrentTask() {
      return this.g;
   }
}
