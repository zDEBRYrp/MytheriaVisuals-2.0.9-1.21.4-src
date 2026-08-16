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

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import nesquik.mytheria.systems.setting.settings.SliderSetting;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;

@ModuleInfo(name = "Trails", category = ax.VISUALS, desc = "modules.descriptions.trails")
public class bU extends aJ implements IMinecraft {
   private final SliderSetting a = new SliderSetting(this, "modules.settings.trails.length").min(150.0F).max(350.0F).step(5.0F).currentValue(250.0F);
   private final ch b = new ch(this, "modules.settings.trails.sync_with_theme").enabled(true);
   private final cj c = new cj(this, "modules.settings.trails.color", () -> this.b.isEnabled()).color(ec.getAccentColor()).alpha(true);
   private final List<bU.a> d = new ArrayList<>();
   private final EventListener<ae> e = event -> {
      if (mc.player != null) {
         MatrixStack var2 = event.getMatrices();
         if (mc.options.getPerspective().isFirstPerson()) {
            this.d.clear();
         } else {
            RenderSystem.enableBlend();
            RenderSystem.enableDepthTest();
            RenderSystem.depthMask(false);
            RenderSystem.disableCull();
            RenderSystem.defaultBlendFunc();

            try {
               this.d.removeIf(point -> (float)(System.currentTimeMillis() - point.b) > this.a.getCurrentValue());
               Vec3d var3 = new Vec3d(mc.player.prevX, mc.player.prevY, mc.player.prevZ);
               Vec3d var4 = mc.player.getPos();
               Vec3d var5 = var3.lerp(var4, event.getTickDelta());
               if (!this.d.isEmpty()) {
                  Vec3d var6 = this.d.get(this.d.size() - 1).a;
                  double var7 = var6.distanceTo(var5);
                  if (var7 > 10.0) {
                     this.d.clear();
                  }
               }

               this.d.add(new bU.a(var5));

               while (this.d.size() > 1000) {
                  this.d.remove(0);
               }

               if (this.d.size() >= 2) {
                  this.a(var2);
               }
            } catch (Exception var12) {
            } finally {
               RenderSystem.enableCull();
               RenderSystem.depthMask(true);
               RenderSystem.enableDepthTest();
               RenderSystem.disableBlend();
            }
         }
      }
   };

   @Override
   public void onEnable() {
      super.onEnable();
      this.d.clear();
   }

   @Override
   public void onDisable() {
      super.onDisable();
      this.d.clear();
   }

   private void a(MatrixStack matrix) {
      if (this.d.size() >= 2) {
         Camera var2 = mc.gameRenderer.getCamera();
         Vec3d var3 = var2.getPos();
         Matrix4f var4 = matrix.peek().getPositionMatrix();
         RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
         Tessellator var5 = Tessellator.getInstance();
         BufferBuilder var6 = var5.begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
         eb var7 = this.b.isEnabled() ? ec.getAccentColor() : this.c.getColor();

         for (int var8 = 0; var8 < this.d.size() - 1; var8++) {
            bU.a var9 = this.d.get(var8);
            bU.a var10 = this.d.get(var8 + 1);
            Vec3d var11 = var9.a.subtract(var3);
            Vec3d var12 = var10.a.subtract(var3);
            eb var13 = var7;
            eb var14 = var7;
            float var15 = Math.min((float)var8 / (this.d.size() - 1), 1.0F);
            float var16 = Math.min((float)(var8 + 1) / (this.d.size() - 1), 1.0F);
            int var17 = var13.withAlpha((int)(var15 * 128.0F)).getRGB();
            int var18 = var14.withAlpha((int)(var16 * 128.0F)).getRGB();
            double var19 = mc.player.getHeight();
            var6.vertex(var4, (float)var11.x, (float)var11.y + 5.0E-4F, (float)var11.z).color(var17);
            var6.vertex(var4, (float)var12.x, (float)var12.y + 5.0E-4F, (float)var12.z).color(var18);
            var6.vertex(var4, (float)var12.x, (float)(var12.y + var19), (float)var12.z).color(var18);
            var6.vertex(var4, (float)var11.x, (float)(var11.y + var19), (float)var11.z).color(var17);
         }

         BufferRenderer.drawWithGlobalProgram(var6.end());
         RenderSystem.lineWidth(2.0F);
         this.a(matrix, var3, true);
         this.a(matrix, var3, false);
         RenderSystem.lineWidth(1.0F);
      }
   }

   private void a(MatrixStack matrix, Vec3d cameraPos, boolean withHeight) {
      if (!this.d.isEmpty()) {
         RenderSystem.setShader(ShaderProgramKeys.RENDERTYPE_LINES);
         Tessellator var4 = Tessellator.getInstance();
         BufferBuilder var5 = var4.begin(DrawMode.LINE_STRIP, VertexFormats.POSITION_COLOR);
         Matrix4f var6 = matrix.peek().getPositionMatrix();
         eb var7 = this.b.isEnabled() ? ec.getAccentColor() : this.c.getColor();
         int var8 = 0;

         for (bU.a var10 : this.d) {
            Vec3d var11 = var10.a.subtract(cameraPos);
            eb var12 = var7;
            float var13 = Math.min((float)var8 / this.d.size(), 1.0F);
            int var14 = var12.withAlpha((int)(var13 * 255.0F)).getRGB();
            if (withHeight) {
               var5.vertex(var6, (float)var11.x, (float)(var11.y + mc.player.getHeight()), (float)var11.z)
                  .color(var14);
            } else {
               var5.vertex(var6, (float)var11.x, (float)var11.y + 5.0E-4F, (float)var11.z).color(var14);
            }

            var8++;
         }

         BufferRenderer.drawWithGlobalProgram(var5.end());
      }
   }

   static class a {
      final Vec3d a;
      final long b;

      public a(Vec3d position) {
         this.a = position;
         this.b = System.currentTimeMillis();
      }
   }
}
