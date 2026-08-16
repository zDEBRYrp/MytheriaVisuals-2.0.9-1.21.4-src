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

import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.TntEntity;
import net.minecraft.item.Items;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;

@ModuleInfo(name = "TNT Timer", category = ax.VISUALS, desc = "modules.descriptions.tnt_timer")
public class bS extends aJ {
   private final EventListener<ad> a = event -> {
      MatrixStack var2 = event.getContext().getMatrices();
      fs var3 = new fs(VertexFormats.POSITION_COLOR, event.getContext().getMatrices());

      for (Entity var5 : mc.world.getEntities()) {
         if (var5 instanceof TntEntity var6) {
            this.a(event, var2, var6);
         }
      }

      var3.draw();
      fq var8 = new fq(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.MEDIUM);

      for (Entity var10 : mc.world.getEntities()) {
         if (var10 instanceof TntEntity var7) {
            this.b(event, var2, var7);
         }
      }

      var8.draw();
   };

   private void a(ad event, MatrixStack matrices, TntEntity entity) {
      int var4 = entity.getFuse();
      float var5 = var4 / 20.0F;
      String var6 = av.translate("modules.tnt_timer.format", var5);
      Vec3d var7 = entity.getLerpedPos(event.getTickDelta()).add(0.0, 0.5, 0.0);
      Vec2f var8 = fn.worldToScreen(var7);
      if (var8 != null) {
         float var9 = (float)mc.player.getPos().distanceTo(var7);
         float var10 = MathHelper.clamp(1.0F - var9 / 20.0F, 0.5F, 1.0F);
         matrices.push();
         matrices.translate(var8.x - 6.0F, var8.y, 0.0F);
         matrices.scale(var10, var10, 1.0F);
         int var11 = (int)Fonts.MEDIUM.getFont(11.0F).width(var6);
         int var12 = -var11 / 2;
         event.getContext().drawRect(var12 - 3, 1.0F, var11 + 26, Fonts.MEDIUM.getFont(11.0F).height() + 8.0F, new eb(0.0F, 0.0F, 0.0F, 100.0F));
         matrices.pop();
      }
   }

   private void b(ad event, MatrixStack matrices, TntEntity entity) {
      int var4 = entity.getFuse();
      float var5 = var4 / 20.0F;
      String var6 = av.translate("modules.tnt_timer.format", var5);
      Vec3d var7 = entity.getLerpedPos(event.getTickDelta()).add(0.0, 0.5, 0.0);
      Vec2f var8 = fn.worldToScreen(var7);
      if (var8 != null) {
         float var9 = (float)mc.player.getPos().distanceTo(var7);
         float var10 = MathHelper.clamp(1.0F - var9 / 20.0F, 0.5F, 1.0F);
         matrices.push();
         matrices.translate(var8.x - 6.0F, var8.y, 0.0F);
         matrices.scale(var10, var10, 1.0F);
         int var11 = (int)Fonts.MEDIUM.getFont(11.0F).width(var6);
         int var12 = -var11 / 2;
         event.getContext().drawText(Fonts.MEDIUM.getFont(11.0F), var6, var12 + 16, 5.0F, eb.WHITE);
         event.getContext().drawItem(Items.TNT, var12, 3.0F, 0.75F);
         matrices.pop();
      }
   }
}
