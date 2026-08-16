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
import java.awt.Color;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import nesquik.mytheria.systems.setting.settings.SliderSetting;
import nesquik.mytheria.utility.animation.base.Easing;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;

@ModuleInfo(name = "Jump Circle", category = ax.VISUALS, desc = "modules.descriptions.jump_circle")
public class bL extends aJ implements IMinecraft {
   private final CopyOnWriteArrayList<bL.a> a = new CopyOnWriteArrayList<>();
   private final SliderSetting b = new SliderSetting(this, "modules.settings.jump_circle.size").min(0.5F).max(8.0F).step(0.1F).currentValue(2.0F);
   private final SliderSetting c = new SliderSetting(this, "modules.settings.jump_circle.hold_time").min(0.1F).max(5.0F).step(0.1F).currentValue(1.0F);
   private final ck d = new ck(this, "modules.settings.jump_circle.mode");
   private final ck.a e = new ck.a(this.d, "modules.settings.jump_circle.mode.classic").select();
   private final ck.a f = new ck.a(this.d, "modules.settings.jump_circle.mode.mode2");
   private final ck.a g = new ck.a(this.d, "modules.settings.jump_circle.mode.mode3");
   private final SliderSetting h = new SliderSetting(this, "modules.settings.jump_circle.rotation_speed").min(0.0F).max(10.0F).step(0.1F).currentValue(2.0F);
   private final ck i = new ck(this, "modules.settings.jump_circle.color_mode");
   private final ck.a j = new ck.a(this.i, "modules.settings.color_mode.custom").select();
   private final ck.a k = new ck.a(this.i, "modules.settings.color_mode.client");
   private final cj l = new cj(this, "modules.settings.jump_circle.color_1", () -> !this.j.isSelected()).color(ec.ACCENT);
   private final cj m = new cj(this, "modules.settings.jump_circle.color_2", () -> !this.j.isSelected()).color(ec.ACCENT);
   private final cj n = new cj(this, "modules.settings.jump_circle.color_3", () -> !this.j.isSelected()).color(ec.ACCENT);
   private final cj o = new cj(this, "modules.settings.jump_circle.color_4", () -> !this.j.isSelected()).color(ec.ACCENT);
   private float p = 0.0F;
   private boolean q = true;
   private boolean r = false;
   private boolean s = false;
   private boolean t = false;
   private Vec3d u = null;
   private final EventListener<W> v = event -> {
      if (mc.player != null) {
         this.p = this.p + this.h.getCurrentValue() * 2.0F;
         if (this.p >= 360.0F) {
            this.p -= 360.0F;
         }

         boolean var2 = mc.player.isOnGround();
         if (!this.r) {
            this.q = var2;
            this.r = true;
         } else {
            if (this.q && !var2 && this.t && !this.s && this.u != null) {
               this.a.add(new bL.a(this.u));
               this.s = true;
            }

            if (var2) {
               this.s = false;
               if (mc.options.jumpKey.isPressed()) {
                  this.t = true;
                  this.u = mc.player.getPos();
               } else {
                  this.t = false;
               }
            } else {
               this.t = false;
            }

            this.q = var2;
         }
      }
   };
   private final EventListener<ae> w = event -> {
      if (mc.player != null && !this.a.isEmpty()) {
         MatrixStack var2 = event.getMatrices();
         Camera var3 = event.getCamera();
         Tessellator var4 = Tessellator.getInstance();
         var2.push();
         long var5 = System.currentTimeMillis();

         for (bL.a var8 : List.copyOf(this.a)) {
            long var9 = var5 - var8.b;
            long var11 = (long)(this.c.getCurrentValue() * 1000.0F);
            if (var9 > var11) {
               if (!var8.e) {
                  var8.d.update(0.0F);
                  var8.e = true;
               }

               if (var8.d.isDone() && var8.d.getValue() <= 0.01F) {
                  this.a.remove(var8);
                  continue;
               }
            }

            var8.c.update(1.0F);
            var8.d.update(var8.e ? 0.0F : 1.0F);
            float var13 = var8.c.getValue() * this.b.getCurrentValue();
            float var14 = var8.d.getValue();
            float var15 = 1.0F + 0.06F * (float)Math.sin((var5 - var8.b) / 220.0);
            float var16 = var13 * var15;
            int var17 = (int)(Math.max(0.0F, Math.min(1.0F, var14)) * 255.0F);
            int var18 = a(this.a(1).getRGB(), var17, 0.0F);
            int var19 = a(this.a(2).getRGB(), var17, 0.05F);
            int var20 = a(this.a(3).getRGB(), var17, 0.1F);
            int var21 = a(this.a(4).getRGB(), var17, 0.15F);
            double var22 = var8.a.x - var3.getPos().x;
            double var24 = var8.a.y + 0.01 - var3.getPos().y;
            double var26 = var8.a.z - var3.getPos().z;
            var2.push();
            var2.translate(var22, var24, var26);
            var2.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(this.p));
            RenderSystem.enableDepthTest();
            RenderSystem.disableCull();
            RenderSystem.enableBlend();
            RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE);
            RenderSystem.depthMask(false);
            RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            RenderSystem.setShaderTexture(0, this.a());
            BufferBuilder var28 = var4.begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
            Matrix4f var29 = var2.peek().getPositionMatrix();
            float var30 = var16 / 2.0F;
            var28.vertex(var29, -var30, 0.0F, -var30).texture(0.0F, 0.0F).color(var18);
            var28.vertex(var29, var30, 0.0F, -var30).texture(1.0F, 0.0F).color(var19);
            var28.vertex(var29, var30, 0.0F, var30).texture(1.0F, 1.0F).color(var20);
            var28.vertex(var29, -var30, 0.0F, var30).texture(0.0F, 1.0F).color(var21);
            BufferRenderer.drawWithGlobalProgram(var28.end());
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            RenderSystem.defaultBlendFunc();
            RenderSystem.depthMask(true);
            RenderSystem.enableCull();
            var2.pop();
         }

         var2.pop();
      }
   };

   private Identifier a() {
      String var1;
      if (this.f.isSelected()) {
         var1 = "circle_bold.png";
      } else if (this.g.isSelected()) {
         var1 = "pulse.png";
      } else {
         var1 = "circle.png";
      }

      return Mytheria.id("image/" + var1);
   }

   private static int a(int rgba, int alpha, float boost) {
      int var3 = rgba >> 16 & 0xFF;
      int var4 = rgba >> 8 & 0xFF;
      int var5 = rgba & 0xFF;
      float[] var6 = Color.RGBtoHSB(var3, var4, var5, null);
      float var7 = var6[0];
      float var8 = Math.min(1.0F, var6[1] * (1.6F + boost) + 0.2F);
      float var9 = Math.min(1.0F, var6[2] * (1.5F + boost) + 0.3F);
      int var10 = Color.HSBtoRGB(var7, var8, var9) & 16777215;
      return (alpha & 0xFF) << 24 | var10;
   }

   private eb a(int index) {
      if (this.j.isSelected()) {
         return switch (index) {
            case 1 -> this.l.getColor();
            case 2 -> this.m.getColor();
            case 3 -> this.n.getColor();
            case 4 -> this.o.getColor();
            default -> this.l.getColor();
         };
      } else {
         return ec.getAccentColor();
      }
   }

   static class a {
      final Vec3d a;
      final long b;
      dZ c = new dZ(500L, 0.0F, Easing.SINE_OUT);
      dZ d = new dZ(700L, 1.0F, Easing.SINE_OUT);
      boolean e = false;

      a(Vec3d pos) {
         this.a = pos;
         this.b = System.currentTimeMillis();
         this.c.update(1.0F);
         this.d.update(1.0F);
      }
   }
}
