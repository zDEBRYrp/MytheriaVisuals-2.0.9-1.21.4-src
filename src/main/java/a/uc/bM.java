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
import java.util.Random;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import nesquik.mytheria.systems.setting.settings.SliderSetting;
import nesquik.mytheria.utility.animation.base.Easing;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BuiltBuffer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;

@ModuleInfo(name = "Kill Effects", category = ax.VISUALS, desc = "modules.descriptions.kill_effects")
public class bM extends aJ {
   private final List<bM.a> a = new ArrayList<>();
   private final Random b = new Random();
   private final ck c = new ck(this, "modules.settings.kill_effects.color_mode");
   private final ck.a d = new ck.a(this.c, "modules.settings.kill_effects.color_mode.client").select();
   private final ck.a e = new ck.a(this.c, "modules.settings.kill_effects.color_mode.custom");
   private final cj f = new cj(this, "modules.settings.kill_effects.color", () -> !this.e.isSelected()).color(new eb(151.0F, 71.0F, 255.0F, 255.0F));
   private final ch g = new ch(this, "modules.settings.kill_effects.play_sound").enabled(true);
   private final SliderSetting h = new SliderSetting(this, "modules.settings.kill_effects.volume", () -> !this.g.isEnabled())
      .min(0.0F)
      .max(100.0F)
      .step(1.0F)
      .currentValue(100.0F);
   private final ch i = new ch(this, "modules.settings.kill_effects.mobs").enabled(false);
   private final ck j = new ck(this, "modules.settings.kill_effects.sound_type", () -> !this.g.isEnabled());
   private final ck.a k = new ck.a(this.j, "Kill1");
   private final ck.a l = new ck.a(this.j, "Kill2");
   private final ck.a m = new ck.a(this.j, "Kill3");
   private final ck.a n = new ck.a(this.j, "Kill4");
   private final ck.a o = new ck.a(this.j, "Kill5");
   private final ck.a p = new ck.a(this.j, "Kill6");
   private final ck.a q = new ck.a(this.j, "Random").select();
   private final EventListener<G> r = event -> {
      if (mc.world != null && mc.player != null && event.getEntity() instanceof LivingEntity) {
         boolean var2 = false;
         if (event.getSource() != null
            && event.getSource().getAttacker() != null
            && event.getSource().getAttacker().getUuid().equals(mc.player.getUuid())) {
            var2 = true;
         }

         if (!var2) {
            return;
         }

         if ((this.i.isEnabled() || event.getEntity() instanceof PlayerEntity) && event.getEntity() != mc.player && !event.getEntity().isRemoved()) {
            eb var3 = this.d.isSelected() ? ec.getAccentColor() : this.f.getColor();
            this.a.add(new bM.a(event.getEntity().getPos(), var3));
            if (this.g.isEnabled()) {
               fK var4 = this.a();
               var4.play(this.h.getCurrentValue() / 100.0F);
            }
         }
      }
   };
   private final EventListener<ae> s = event -> {
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

      for (bM.a var8 : this.a) {
         var8.a(var6, event.getMatrices(), var3);
         if (var8.d.getValue() == 1.0F) {
            var8.c = false;
         }
      }

      BuiltBuffer var9 = var6.endNullable();
      if (var9 != null) {
         BufferRenderer.drawWithGlobalProgram(var9);
      }

      RenderSystem.depthMask(true);
      RenderSystem.setShaderTexture(0, 0);
      RenderSystem.disableBlend();
      RenderSystem.enableCull();
      RenderSystem.disableDepthTest();
      var2.pop();
      this.a.removeIf(lightningx -> !lightningx.c && lightningx.d.getValue() == 0.0F);
   };

   private fK a() {
      if (this.j.is(this.k)) {
         return fL.KILL1;
      } else if (this.j.is(this.l)) {
         return fL.KILL2;
      } else if (this.j.is(this.m)) {
         return fL.KILL3;
      } else if (this.j.is(this.n)) {
         return fL.KILL4;
      } else if (this.j.is(this.o)) {
         return fL.KILL5;
      } else if (this.j.is(this.p)) {
         return fL.KILL6;
      } else if (this.j.is(this.q)) {
         fK[] var1 = new fK[]{fL.KILL1, fL.KILL2, fL.KILL3, fL.KILL4, fL.KILL5, fL.KILL6};
         return var1[this.b.nextInt(var1.length)];
      } else {
         return fL.KILL1;
      }
   }

   static class a {
      final Vec3d a;
      final eb b;
      boolean c = true;
      final dZ d = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
      final List<Vec3d> e = new ArrayList<>();

      public a(Vec3d pos, eb color) {
         this.a = pos;
         this.b = color;
         Vec3d var3 = pos;

         for (int var4 = 0; var4 < 200; var4++) {
            this.e.add(var3 = var3.add(eI.random(-0.4F, 0.4F), 0.25, eI.random(-0.4F, 0.4F)));
         }
      }

      void a(BufferBuilder builder, MatrixStack ms, Camera camera) {
         this.d.setEasing(Easing.BOUNCE_IN);
         this.d.setDuration(500L);
         this.d.update(this.c);

         for (Vec3d var5 : this.e) {
            float var6 = (float)(2.0 + 5.0 * (var5.y - this.a.y) / 50.0);
            ms.push();
            fl.prepareMatrices(ms, var5);
            ms.multiply(camera.getRotation());
            fj.drawImage(ms, builder, -var6 / 2.0F, -var6 / 2.0F, 0.0, var6, var6, this.b.withAlpha(255.0F * this.d.getValue() * 0.4F));
            ms.pop();
         }
      }
   }
}
