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
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import nesquik.mytheria.systems.setting.settings.SliderSetting;
import nesquik.mytheria.utility.animation.base.Easing;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BuiltBuffer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;

@ModuleInfo(name = "Hit Effect", category = ax.VISUALS, desc = "modules.descriptions.hiteffect")
public class bH extends aJ {
   private final List<bH.b> a = new ArrayList<>();
   private final ch b = new ch(this, "modules.settings.hiteffect.sync_with_theme").enabled(true);
   private final cj c = new cj(this, "modules.settings.hiteffect.color", () -> this.b.isEnabled()).color(ec.getAccentColor()).alpha(true);
   private final cj d = new cj(this, "modules.settings.hiteffect.totem_color", () -> this.b.isEnabled())
      .color(new eb(255.0F, 215.0F, 0.0F, 255.0F))
      .alpha(true);
   private final ck e = new ck(this, "Режим отображения");
   private final ck.a f = new ck.a(this.e, "Стандарт").select();
   private final ck.a g = new ck.a(this.e, "Полный блок");
   private final SliderSetting h = new SliderSetting(this, "Дальность", "Радиус волны эффекта").min(5.0F).max(30.0F).step(1.0F).currentValue(15.0F);
   private final SliderSetting i = new SliderSetting(this, "Скорость", "Скорость распространения волны")
      .min(500.0F)
      .max(3000.0F)
      .step(100.0F)
      .currentValue(1200.0F);
   private final EventListener<C> j = event -> {
      if (mc.player != null && event.getEntity() != null) {
         Vec3d var2 = event.getEntity().getPos();
         eb var3 = this.b.isEnabled() ? ec.getAccentColor() : this.c.getColor();
         int var4 = this.f.isSelected() ? 0 : 1;
         int var5 = (int)this.h.getCurrentValue();
         long var6 = (long)this.i.getCurrentValue();
         this.a.add(new bH.b(var2, var3, var4, var5, var6));
      }
   };
   private final EventListener<Q> k = event -> {
      if (event.getPlayer() != null) {
         Vec3d var2 = event.getPlayer().getPos();
         eb var3 = this.b.isEnabled() ? ec.getAccentColor() : this.d.getColor();
         int var4 = this.f.isSelected() ? 0 : 1;
         int var5 = (int)this.h.getCurrentValue();
         long var6 = (long)this.i.getCurrentValue();
         this.a.add(new bH.b(var2, var3, var4, var5, var6));
      }
   };
   private final EventListener<ae> l = event -> {
      if (!this.a.isEmpty()) {
         MatrixStack var2 = event.getMatrices();
         Camera var3 = mc.gameRenderer.getCamera();
         Vec3d var4 = var3.getPos();
         var2.push();
         var2.translate(-var4.x, -var4.y, -var4.z);
         RenderSystem.enableBlend();
         RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_SRC_ALPHA);
         RenderSystem.disableCull();
         RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
         RenderSystem.enableDepthTest();
         RenderSystem.depthMask(false);
         BufferBuilder var5 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);

         for (bH.b var7 : this.a) {
            if (var7.f == 0) {
               var7.a(var5, var2);
            }
         }

         BuiltBuffer var14 = var5.endNullable();
         if (var14 != null) {
            BufferRenderer.drawWithGlobalProgram(var14);
         }

         BufferBuilder var15 = RenderSystem.renderThreadTesselator().begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);

         for (bH.b var9 : this.a) {
            if (var9.f == 0) {
               var9.b(var15, var2);
            }
         }

         BuiltBuffer var16 = var15.endNullable();
         if (var16 != null) {
            BufferRenderer.drawWithGlobalProgram(var16);
         }

         RenderSystem.disableDepthTest();
         BufferBuilder var17 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);

         for (bH.b var11 : this.a) {
            if (var11.f != 0) {
               var11.a(var17, var2);
            }
         }

         BuiltBuffer var18 = var17.endNullable();
         if (var18 != null) {
            BufferRenderer.drawWithGlobalProgram(var18);
         }

         BufferBuilder var19 = RenderSystem.renderThreadTesselator().begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);

         for (bH.b var13 : this.a) {
            if (var13.f != 0) {
               var13.b(var19, var2);
            }
         }

         BuiltBuffer var20 = var19.endNullable();
         if (var20 != null) {
            BufferRenderer.drawWithGlobalProgram(var20);
         }

         RenderSystem.enableCull();
         RenderSystem.enableDepthTest();
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
         var2.pop();
         this.a.removeIf(Mytheria -> Mytheria.c.getValue() >= 1.0F);
      }
   };

   @Override
   public void onDisable() {
      this.a.clear();
   }

   static class a {
      final BlockPos a;
      final double b;

      public a(BlockPos pos, double distance) {
         this.a = pos;
         this.b = distance;
      }
   }

   static class b {
      final Vec3d a;
      final eb b;
      final dZ c;
      final List<bH.a> d = new ArrayList<>();
      final int e;
      final int f;

      public b(Vec3d pos, eb color, int renderMode, int maxRadius, long duration) {
         this.a = pos;
         this.b = color;
         this.f = renderMode;
         this.e = maxRadius;
         this.c = new dZ(duration, 0.0F, Easing.LINEAR);
         this.c.update(true);
         BlockPos var7 = BlockPos.ofFloored(pos);

         for (int var8 = -maxRadius; var8 <= maxRadius; var8++) {
            for (int var9 = -maxRadius; var9 <= maxRadius; var9++) {
               double var10 = Math.sqrt(var8 * var8 + var9 * var9);
               if (var10 <= maxRadius && var10 >= 1.0) {
                  BlockPos var12 = null;

                  for (int var13 = 3; var13 >= -10; var13--) {
                     BlockPos var14 = var7.add(var8, var13, var9);
                     if (IMinecraft.mc.world != null && !IMinecraft.mc.world.getBlockState(var14).isAir()) {
                        var12 = var14;
                        break;
                     }
                  }

                  if (var12 != null) {
                     this.d.add(new bH.a(var12, var10));
                  }
               }
            }
         }
      }

      void a(BufferBuilder builder, MatrixStack ms) {
         this.c.update(true);
         float var3 = this.c.getValue();
         float var4 = var3 * this.e;
         float var5 = 1.0F;

         for (bH.a var7 : this.d) {
            float var8 = Math.abs((float)var7.b - var4);
            if (!(var8 > var5)) {
               float var9 = 1.0F - var8 / var5;
               var9 = (float)Math.pow(var9, 0.5);
               float var10 = 1.0F;
               if (var3 > 0.7F) {
                  var10 = 1.0F - (var3 - 0.7F) / 0.3F;
                  var10 = (float)Math.pow(var10, 2.0);
               }

               var9 *= var10;
               if (!(var9 <= 0.05F)) {
                  float var11 = 1.0F;
                  if (var3 > 0.7F) {
                     var11 = 0.5F + 0.5F * var10;
                  }

                  Vec3d var12 = var7.a.toCenterPos();
                  double var13 = 0.5 * var11;
                  if (this.f == 0) {
                     Box var15 = new Box(
                        var12.x - var13,
                        var12.y - var13,
                        var12.z - var13,
                        var12.x + var13,
                        var12.y + var13,
                        var12.z + var13
                     );
                     fi.renderFilledBox(ms, builder, var15, this.b.withAlpha(var9 * 40.0F));
                  } else {
                     Matrix4f var30 = ms.peek().getPositionMatrix();
                     float var16 = (float)(var12.x - var13);
                     float var17 = (float)(var12.x + var13);
                     float var18 = (float)(var12.y - var13);
                     float var19 = (float)(var12.y + var13);
                     float var20 = (float)(var12.z - var13);
                     float var21 = (float)(var12.z + var13);
                     int var22 = this.b.withAlpha(var9 * 40.0F).getRGB();
                     int var23 = var22 >> 16 & 0xFF;
                     int var24 = var22 >> 8 & 0xFF;
                     int var25 = var22 & 0xFF;
                     int var26 = var22 >> 24 & 0xFF;
                     builder.vertex(var30, var16, var18, var20).color(var23, var24, var25, var26);
                     builder.vertex(var30, var17, var18, var20).color(var23, var24, var25, var26);
                     builder.vertex(var30, var17, var18, var21).color(var23, var24, var25, var26);
                     builder.vertex(var30, var16, var18, var21).color(var23, var24, var25, var26);
                     builder.vertex(var30, var16, var19, var20).color(var23, var24, var25, var26);
                     builder.vertex(var30, var16, var19, var21).color(var23, var24, var25, var26);
                     builder.vertex(var30, var17, var19, var21).color(var23, var24, var25, var26);
                     builder.vertex(var30, var17, var19, var20).color(var23, var24, var25, var26);
                     builder.vertex(var30, var16, var18, var21).color(var23, var24, var25, var26);
                     builder.vertex(var30, var17, var18, var21).color(var23, var24, var25, var26);
                     builder.vertex(var30, var17, var19, var21).color(var23, var24, var25, var26);
                     builder.vertex(var30, var16, var19, var21).color(var23, var24, var25, var26);
                     builder.vertex(var30, var17, var18, var20).color(var23, var24, var25, var26);
                     builder.vertex(var30, var16, var18, var20).color(var23, var24, var25, var26);
                     builder.vertex(var30, var16, var19, var20).color(var23, var24, var25, var26);
                     builder.vertex(var30, var17, var19, var20).color(var23, var24, var25, var26);
                     builder.vertex(var30, var16, var18, var20).color(var23, var24, var25, var26);
                     builder.vertex(var30, var16, var18, var21).color(var23, var24, var25, var26);
                     builder.vertex(var30, var16, var19, var21).color(var23, var24, var25, var26);
                     builder.vertex(var30, var16, var19, var20).color(var23, var24, var25, var26);
                     builder.vertex(var30, var17, var18, var21).color(var23, var24, var25, var26);
                     builder.vertex(var30, var17, var18, var20).color(var23, var24, var25, var26);
                     builder.vertex(var30, var17, var19, var20).color(var23, var24, var25, var26);
                     builder.vertex(var30, var17, var19, var21).color(var23, var24, var25, var26);
                  }
               }
            }
         }
      }

      void b(BufferBuilder builder, MatrixStack ms) {
         this.c.update(true);
         float var3 = this.c.getValue();
         float var4 = var3 * this.e;
         float var5 = 1.0F;

         for (bH.a var7 : this.d) {
            float var8 = Math.abs((float)var7.b - var4);
            if (!(var8 > var5)) {
               float var9 = 1.0F - var8 / var5;
               var9 = (float)Math.pow(var9, 0.5);
               float var10 = 1.0F;
               if (var3 > 0.7F) {
                  var10 = 1.0F - (var3 - 0.7F) / 0.3F;
                  var10 = (float)Math.pow(var10, 2.0);
               }

               var9 *= var10;
               if (!(var9 <= 0.05F)) {
                  float var11 = 1.0F;
                  if (var3 > 0.7F) {
                     var11 = 0.5F + 0.5F * var10;
                  }

                  Vec3d var12 = var7.a.toCenterPos();
                  double var13 = 0.5 * var11;
                  if (this.f == 0) {
                     Box var15 = new Box(
                        var12.x - var13,
                        var12.y - var13,
                        var12.z - var13,
                        var12.x + var13,
                        var12.y + var13,
                        var12.z + var13
                     );
                     fi.renderOutlinedBox(ms, builder, var15, this.b.withAlpha(var9 * 255.0F));
                  } else {
                     Matrix4f var30 = ms.peek().getPositionMatrix();
                     float var16 = (float)(var12.x - var13);
                     float var17 = (float)(var12.x + var13);
                     float var18 = (float)(var12.y - var13);
                     float var19 = (float)(var12.y + var13);
                     float var20 = (float)(var12.z - var13);
                     float var21 = (float)(var12.z + var13);
                     int var22 = this.b.withAlpha(var9 * 255.0F).getRGB();
                     int var23 = var22 >> 16 & 0xFF;
                     int var24 = var22 >> 8 & 0xFF;
                     int var25 = var22 & 0xFF;
                     int var26 = var22 >> 24 & 0xFF;
                     builder.vertex(var30, var16, var18, var20).color(var23, var24, var25, var26);
                     builder.vertex(var30, var17, var18, var20).color(var23, var24, var25, var26);
                     builder.vertex(var30, var17, var18, var20).color(var23, var24, var25, var26);
                     builder.vertex(var30, var17, var18, var21).color(var23, var24, var25, var26);
                     builder.vertex(var30, var17, var18, var21).color(var23, var24, var25, var26);
                     builder.vertex(var30, var16, var18, var21).color(var23, var24, var25, var26);
                     builder.vertex(var30, var16, var18, var21).color(var23, var24, var25, var26);
                     builder.vertex(var30, var16, var18, var20).color(var23, var24, var25, var26);
                     builder.vertex(var30, var16, var19, var20).color(var23, var24, var25, var26);
                     builder.vertex(var30, var17, var19, var20).color(var23, var24, var25, var26);
                     builder.vertex(var30, var17, var19, var20).color(var23, var24, var25, var26);
                     builder.vertex(var30, var17, var19, var21).color(var23, var24, var25, var26);
                     builder.vertex(var30, var17, var19, var21).color(var23, var24, var25, var26);
                     builder.vertex(var30, var16, var19, var21).color(var23, var24, var25, var26);
                     builder.vertex(var30, var16, var19, var21).color(var23, var24, var25, var26);
                     builder.vertex(var30, var16, var19, var20).color(var23, var24, var25, var26);
                     builder.vertex(var30, var16, var18, var20).color(var23, var24, var25, var26);
                     builder.vertex(var30, var16, var19, var20).color(var23, var24, var25, var26);
                     builder.vertex(var30, var17, var18, var20).color(var23, var24, var25, var26);
                     builder.vertex(var30, var17, var19, var20).color(var23, var24, var25, var26);
                     builder.vertex(var30, var17, var18, var21).color(var23, var24, var25, var26);
                     builder.vertex(var30, var17, var19, var21).color(var23, var24, var25, var26);
                     builder.vertex(var30, var16, var18, var21).color(var23, var24, var25, var26);
                     builder.vertex(var30, var16, var19, var21).color(var23, var24, var25, var26);
                  }
               }
            }
         }
      }
   }
}
