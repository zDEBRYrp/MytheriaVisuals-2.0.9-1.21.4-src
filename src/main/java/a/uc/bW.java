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

import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import nesquik.mytheria.utility.animation.base.Easing;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BuiltBuffer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import org.joml.Quaternionf;

@ModuleInfo(name = "World", category = ax.VISUALS, desc = "Визуальные дополнения мира")
public class bW extends aJ {
   private final List<bW.a> a = new ArrayList<>();
   private final ck b = new ck(this, "modules.settings.world.color_mode");
   private final ck.a c = new ck.a(this.b, "modules.settings.world.color_mode.client").select();
   private final ck.a d = new ck.a(this.b, "modules.settings.world.color_mode.custom");
   private final cj e = new cj(this, "color", () -> !this.d.isSelected()).color(ec.getAccentColor());
   private final EventListener<ae> f = event -> {
      MatrixStack var2 = event.getMatrices();
      Camera var3 = mc.gameRenderer.getCamera();
      Vec3d var4 = var3.getPos();
      var2.push();
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE);
      RenderSystem.enableDepthTest();
      RenderSystem.disableCull();
      RenderSystem.depthMask(false);
      Identifier var5 = Mytheria.id("textures/bloom.png");
      RenderSystem.setShaderTexture(0, var5);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      BufferBuilder var6 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);

      for (bW.a var8 : this.a) {
         Vec3d var9 = fn.getInterpolatedPos(var8.a, var8.c, event.getTickDelta());
         float var10 = 4.0F * var8.h;
         var2.push();
         fl.prepareMatrices(var2, var9);
         var2.multiply(var3.getRotation());
         fj.drawImage(var2, var6, -var10 / 2.0F, -var10 / 2.0F, 0.0, var10, var10, this.a().withAlpha(255.0F * var8.j.getValue() * 0.4F));
         var2.pop();
      }

      BuiltBuffer var13 = var6.endNullable();
      if (var13 != null) {
         BufferRenderer.drawWithGlobalProgram(var13);
      }

      RenderSystem.depthMask(true);
      RenderSystem.setShaderTexture(0, 0);
      RenderSystem.disableBlend();
      RenderSystem.enableCull();
      RenderSystem.disableDepthTest();
      var2.pop();
      RenderSystem.enableBlend();
      RenderSystem.disableDepthTest();
      RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE);
      RenderSystem.enableDepthTest();
      RenderSystem.disableCull();
      RenderSystem.depthMask(false);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      BufferBuilder var14 = RenderSystem.renderThreadTesselator().begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);

      for (bW.a var17 : this.a) {
         var17.j.update(!var17.i.finished(var17.g));
         Vec3d var11 = fn.getInterpolatedPos(var17.a, var17.c, event.getTickDelta());
         Vec3d var12 = fn.getInterpolatedPos(var17.b, var17.d, event.getTickDelta());
         var2.push();
         var2.translate(var11.add(-var4.getX(), -var4.getY(), -var4.getZ()));
         var2.multiply(new Quaternionf().rotationXYZ((float)var12.x, (float)var12.y, (float)var12.z));
         var2.scale(var17.h, var17.h, var17.h);
         fi.renderBoxInternalDiagonals(var2, var14, new Box(-0.5, -0.5, -0.5, 0.5, 0.5, 0.5), this.a().withAlpha(255.0F * var17.j.getValue() * 0.4F));
         fi.renderOutlinedBox(var2, var14, new Box(-0.5, -0.5, -0.5, 0.5, 0.5, 0.5), this.a().withAlpha(205.0F * var17.j.getValue()));
         var2.pop();
      }

      BuiltBuffer var16 = var14.endNullable();
      if (var16 != null) {
         BufferRenderer.drawWithGlobalProgram(var16);
      }

      RenderSystem.depthMask(true);
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableCull();
      RenderSystem.enableDepthTest();
      RenderSystem.disableBlend();
   };

   @Override
   public void tick() {
      this.a.removeIf(particlex -> particlex.j.getValue() == 0.0F && particlex.i.finished(particlex.g));

      for (bW.a var2 : this.a) {
         var2.a();
      }

      if (this.a.size() < 100) {
         this.a
            .add(
               new bW.a(
                  mc.player.getPos().add(eI.random(-20.0, 20.0), eI.random(0.0, 5.0), eI.random(-20.0, 20.0)),
                  Vec3d.ZERO,
                  new Vec3d(eI.random(-1.0, 1.0), eI.random(0.0, 2.0), eI.random(-1.0, 1.0)),
                  new Vec3d(eI.random(-1.0, 1.0), eI.random(-1.0, 1.0), eI.random(-1.0, 1.0)),
                  (long)eI.random(1500.0, 4500.0),
                  eI.random(0.1F, 0.3F)
               )
            );
      }
   }

   private eb a() {
      return this.c.isSelected() ? ec.getAccentColor() : this.e.getColor();
   }

   static class a {
      Vec3d a;
      Vec3d b;
      Vec3d c;
      Vec3d d;
      Vec3d e;
      Vec3d f;
      final long g;
      float h;
      final fO i = new fO();
      final dZ j = new dZ(300L, Easing.FIGMA_EASE_IN_OUT);

      public a(Vec3d pos, Vec3d rotate, Vec3d motion, Vec3d rotateMotion, long liveTicks, float size) {
         this.c = pos;
         this.d = rotate;
         this.e = motion.multiply(0.04F);
         this.f = rotateMotion.multiply(0.04F);
         this.g = liveTicks;
         this.h = size;
         this.b = rotate;
         this.a = pos;
         this.j.setDuration(1000L);
      }

      void a() {
         this.a = this.c;
         this.b = this.d;
         this.c = this.c.add(this.e);
         this.d = this.d.add(this.f);
         this.e = this.e.multiply(0.98);
         this.f = this.f.multiply(0.98);
      }
   }
}
