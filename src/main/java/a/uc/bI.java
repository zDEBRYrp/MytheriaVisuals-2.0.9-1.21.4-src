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
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import nesquik.mytheria.Mytheria;
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
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;

@ModuleInfo(name = "Hit Particles", category = ax.VISUALS, desc = "modules.descriptions.hit_particles")
public class bI extends aJ implements IMinecraft {
   private final ck a = new ck(this, "modules.settings.hit_particles.particle_type");
   private final ck.a b = new ck.a(this.a, "Star").select();
   private final ck.a c = new ck.a(this.a, "Glow");
   private final ck.a d = new ck.a(this.a, "Heart");
   private final ck.a e = new ck.a(this.a, "Dollar");
   private final ck.a f = new ck.a(this.a, "Random");
   private final ck g = new ck(this, "modules.settings.hit_particles.color_mode");
   private final ck.a h = new ck.a(this.g, "modules.settings.color_mode.client").select();
   private final ck.a i = new ck.a(this.g, "modules.settings.color_mode.custom");
   private final cj j = new cj(this, "modules.settings.hit_particles.color", () -> !this.i.isSelected()).color(new eb(138.0F, 43.0F, 226.0F));
   private final SliderSetting k = new SliderSetting(this, "modules.settings.hit_particles.speed").min(0.1F).max(3.0F).step(0.1F).currentValue(1.5F);
   private final SliderSetting l = new SliderSetting(this, "modules.settings.hit_particles.size").min(0.0F).max(3.0F).step(0.1F).currentValue(0.8F);
   private final SliderSetting m = new SliderSetting(this, "modules.settings.hit_particles.count").min(5.0F).max(50.0F).step(1.0F).currentValue(30.0F);
   private final List<bI.a> n = new CopyOnWriteArrayList<>();
   private final Random o = new Random();
   private long p = System.nanoTime();
   private final EventListener<C> q = event -> {
      Entity var2 = event.getEntity();
      if (var2 != null) {
         for (int var3 = 0; var3 < this.m.getCurrentValue(); var3++) {
            Identifier var4 = this.c();
            Vec3d var5 = new Vec3d(
               var2.getX() + this.a(-0.4, 0.4), var2.getY() + this.a(0.0, var2.getHeight()), var2.getZ() + this.a(-0.4, 0.4)
            );
            Vec3d var6 = new Vec3d(this.a(-1.35, 1.35), this.a(-1.25, 1.25), this.a(-1.35, 1.35));
            eb var7 = this.a(var3);
            this.n.add(new bI.a(var4, var5, var6, var7, 0.15F + this.l.getCurrentValue() * 0.3F, this.k.getCurrentValue()));
         }
      }
   };
   private final EventListener<W> r = event -> this.n.removeIf(particle -> particle.g > 1000L);
   private final EventListener<ae> s = event -> {
      if (!this.n.isEmpty()) {
         long var2 = System.nanoTime();
         double var4 = (var2 - this.p) / 1.0E9;
         this.p = var2;
         MatrixStack var6 = event.getMatrices();
         this.a();
         Camera var7 = mc.gameRenderer.getCamera();
         Vec3d var8 = var7.getPos();

         for (bI.a var10 : this.n) {
            var10.update(var4);
            this.a(var6, var10, var8);
         }

         this.b();
      }
   };

   @Override
   public void onEnable() {
      super.onEnable();
      this.n.clear();
   }

   @Override
   public void onDisable() {
      super.onDisable();
      this.n.clear();
   }

   private void a() {
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.enableBlend();
      RenderSystem.blendFuncSeparate(SrcFactor.SRC_ALPHA, DstFactor.ONE, SrcFactor.ONE, DstFactor.ONE);
      RenderSystem.enableDepthTest();
      RenderSystem.disableCull();
      RenderSystem.depthMask(false);
   }

   private void b() {
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.enableDepthTest();
      RenderSystem.enableCull();
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
   }

   private void a(MatrixStack matrix, bI.a particle, Vec3d cameraPos) {
      matrix.push();
      Vec3d var4 = particle.b.subtract(cameraPos);
      matrix.translate(var4.x, var4.y, var4.z);
      matrix.multiply(mc.getEntityRenderDispatcher().getRotation());
      RenderSystem.setShaderTexture(0, particle.a);
      Tessellator var5 = Tessellator.getInstance();
      BufferBuilder var6 = var5.begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      Matrix4f var7 = matrix.peek().getPositionMatrix();
      float var8 = particle.e / 2.0F;
      this.a(var6, var7, var8, particle.d.withAlpha((int)(particle.h * 255.0F)).getRGB());
      BufferRenderer.drawWithGlobalProgram(var6.end());
      matrix.pop();
   }

   private void a(BufferBuilder buffer, Matrix4f matrix, float size, int color) {
      buffer.vertex(matrix, -size, -size, 0.0F).texture(0.0F, 0.0F).color(color);
      buffer.vertex(matrix, size, -size, 0.0F).texture(1.0F, 0.0F).color(color);
      buffer.vertex(matrix, size, size, 0.0F).texture(1.0F, 1.0F).color(color);
      buffer.vertex(matrix, -size, size, 0.0F).texture(0.0F, 1.0F).color(color);
   }

   private Identifier c() {
      if (this.f.isSelected()) {
         Identifier[] var1 = new Identifier[]{
            Mytheria.id("textures/world/particles/dollar.png"),
            Mytheria.id("textures/world/particles/heart.png"),
            Mytheria.id("textures/world/particles/star.png")
         };
         return var1[this.o.nextInt(var1.length)];
      } else if (this.e.isSelected()) {
         return Mytheria.id("textures/world/particles/dollar.png");
      } else if (this.d.isSelected()) {
         return Mytheria.id("textures/world/particles/heart.png");
      } else if (this.b.isSelected()) {
         return Mytheria.id("textures/world/particles/star.png");
      } else {
         return this.c.isSelected() ? Mytheria.id("textures/bloom.png") : Mytheria.id("textures/world/particles/star.png");
      }
   }

   private eb a(int index) {
      return this.i.isSelected() ? this.j.getColor() : ec.getAccentColor();
   }

   private double a(double min, double max) {
      return min + (max - min) * this.o.nextDouble();
   }

   class a {
      final Identifier a;
      Vec3d b;
      private Vec3d c;
      final eb d;
      final float e;
      private final float f;
      long g = 0L;
      float h = 1.0F;

      public a(Identifier texture, Vec3d position, Vec3d velocity, eb color, float size, float speedMultiplier) {
         this.a = texture;
         this.b = position;
         this.c = velocity.multiply(0.05);
         this.d = color;
         this.e = size;
         this.f = speedMultiplier;
      }

      public void update(double deltaTime) {
         this.c = this.c.multiply(Math.pow(0.999, deltaTime * 60.0));
         this.b = this.b.add(this.c.multiply(deltaTime * 60.0 * this.f));
         this.g += (long)(deltaTime * 1000.0);
         if (this.g > 600L) {
            this.h = 1.0F - (float)(this.g - 600L) / 400.0F;
            this.h = Math.max(0.0F, Math.min(1.0F, this.h));
         }
      }
   }
}
