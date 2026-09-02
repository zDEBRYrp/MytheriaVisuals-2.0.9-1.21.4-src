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
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import nesquik.mytheria.systems.setting.settings.SliderSetting;
import nesquik.mytheria.utility.animation.base.Easing;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;

@ModuleInfo(name = "Target ESP", category = ax.VISUALS, desc = "Помечает активную цель")
public class bT extends aJ {
   private final ck a = new ck(this, "modules.settings.target_esp.mode");
   private final ck.a b = new ck.a(this.a, "modules.settings.target_esp.mode.souls");
   private final ck.a c = new ck.a(this.a, "modules.settings.target_esp.mode.crystals").select();
   private final ck.a d = new ck.a(this.a, "modules.settings.target_esp.mode.chains");
   private final ck.a e = new ck.a(this.a, "modules.settings.target_esp.mode.circles");
   private final ck.a f = new ck.a(this.a, "modules.settings.target_esp.mode.marker");
   private final ck.a g = new ck.a(this.a, "modules.settings.target_esp.mode.ring");
   private final ck.a h = new ck.a(this.a, "modules.settings.target_esp.mode.pigs");
   private final ch i = new ch(this, "Синхронизация с темой", "Использовать акцентный цвет темы").enabled(true);
   private final cj j = new cj(this, "color", () -> this.i.isEnabled()).color(ec.ACCENT);
   private final ch k = new ch(this, "modules.settings.target_esp.change_color_on_damage").enable();
   private final SliderSetting l = new SliderSetting(this, "modules.settings.target_esp.speed").min(0.1F).max(5.0F).step(0.1F).currentValue(0.5F);
   private final SliderSetting m = new SliderSetting(
         this, "modules.settings.target_esp.size", () -> this.b.isSelected() || this.c.isSelected() || this.g.isSelected() || this.h.isSelected()
      )
      .min(0.5F)
      .max(3.0F)
      .step(0.1F)
      .currentValue(1.5F);
   private final SliderSetting n = new SliderSetting(
         this, "modules.settings.target_esp.particle_count", () -> this.b.isSelected() || this.c.isSelected() || this.g.isSelected() || this.h.isSelected()
      )
      .min(1.0F)
      .max(50.0F)
      .step(1.0F)
      .currentValue(20.0F);
   private final SliderSetting o = new SliderSetting(
         this, "modules.settings.target_esp.particle_thickness", () -> this.b.isSelected() || this.c.isSelected() || this.g.isSelected() || this.h.isSelected()
      )
      .min(0.1F)
      .max(2.0F)
      .step(0.1F)
      .currentValue(1.0F);
   private final dZ p = new dZ(300L, 0.0F, Easing.BOTH_CUBIC);
   private final dZ q = new dZ(70L, 0.0F, Easing.LINEAR);
   private final dZ r = new dZ(200L, 0.0F, Easing.BOTH_CUBIC);
   private final dZ s = new dZ(50L, 0.0F, Easing.LINEAR);
    private LivingEntity t;
    private PigEntity pigCache;
   private float u = 0.0F;
   private final fO v = new fO();
   private double w = 0.0;
   private float x = 0.0F;
   private long y = 0L;
   private final EventListener<ae> z = event -> {
      try {
      if (ee.isInGame()) {
         LivingEntity var2 = null;
         HitResult var3 = mc.crosshairTarget;
         if (var3 != null
            && var3.getType() == Type.ENTITY
            && var3 instanceof EntityHitResult var4
            && var4.getEntity() instanceof LivingEntity var5
            && var5 != mc.player
            && !var5.isInvisible()
            && !(var5 instanceof PlayerEntity var11 && (var11.isInvisibleTo(mc.player) || var11.isSpectator()))) {
            double var7 = mc.player.distanceTo(var5);
            if (var7 <= 3.0) {
               var2 = var5;
            }
         }

         if (var2 != null) {
            this.t = var2;
            this.v.reset();
         }

         boolean var9 = var2 != null || !this.v.finished(1000L);
         this.p.setEasing(Easing.FIGMA_EASE_IN_OUT);
         this.p.update(var9);
         float var10 = this.l.getCurrentValue();
         this.q.update(this.q.getValue() + 10.0F * var10 + 50.0F * var10);
         this.s.update(this.s.getValue() + 5.0F * var10);
         this.u += 3.0F * var10;
         if (var2 != null && this.t == var2) {
            boolean var12 = var2.hurtTime > 0;
            this.r.update(var12);
            if (var12 && this.g.isSelected()) {
               this.y = System.currentTimeMillis();
            }
         } else {
            this.r.update(false);
         }

          if (this.t != null && this.p.getValue() != 0.0F && !this.t.isRemoved() && mc.world != null && mc.player != null) {
             System.out.println("[TargetESP-DEBUG] RENDER HIT, entity=" + this.t.getClass().getSimpleName());
             System.out.println("[TargetESP-DEBUG] Mode: d=" + this.d.isSelected() + " e=" + this.e.isSelected() + " f=" + this.f.isSelected() + " c=" + this.c.isSelected() + " g=" + this.g.isSelected() + " h=" + this.h.isSelected());
             MatrixStack var13 = event.getMatrices();
             var13.push();
             RenderSystem.enableBlend();
             RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE);
             RenderSystem.enableDepthTest();

             boolean visible = true;
             try {
                if (mc.world
                      .raycast(
                         new RaycastContext(
                            mc.gameRenderer.getCamera().getPos(), this.t.getEyePos(), ShapeType.COLLIDER, FluidHandling.NONE, mc.player
                         )
                      )
                      .getType()
                   != Type.MISS) {
                   visible = false;
                }
             } catch (Exception ignored) {}
             if (!visible) {
                RenderSystem.disableDepthTest();
             }

             RenderSystem.disableCull();
             RenderSystem.depthMask(false);
             try {
             if (this.d.isSelected()) {
                System.out.println("[TargetESP-DEBUG] calling chains");
                this.a(var13, this.t);
             } else if (this.e.isSelected()) {
                System.out.println("[TargetESP-DEBUG] calling marker");
                this.c(var13, this.t);
             } else if (this.f.isSelected()) {
                System.out.println("[TargetESP-DEBUG] calling rings");
                this.b(var13, this.t);
             } else if (this.c.isSelected()) {
                System.out.println("[TargetESP-DEBUG] calling crystals");
                this.d(var13, this.t);
             } else if (this.g.isSelected()) {
                System.out.println("[TargetESP-DEBUG] calling soul circles");
                this.f(var13, this.t);
             } else if (this.h.isSelected()) {
                System.out.println("[TargetESP-DEBUG] calling pigs");
                this.g(var13, this.t);
             } else {
                System.out.println("[TargetESP-DEBUG] calling souls (default)");
                this.e(var13, this.t);
             }
             } catch (Throwable t) {
                System.err.println("[TargetESP] Render method crashed: " + t.getClass().getSimpleName() + ": " + t.getMessage());
             }

             RenderSystem.depthMask(true);
             RenderSystem.setShaderTexture(0, 0);
             RenderSystem.disableBlend();
             RenderSystem.enableCull();
             RenderSystem.disableDepthTest();
              var13.pop();
          }
       }
       } catch (Exception e) {
          System.err.println("[TargetESP] Error: " + e.getClass().getSimpleName() + ": " + e.getMessage());
       }
     };

    private eb a() {
       float var1 = this.r.getValue();
      eb var2 = this.i.isEnabled() ? ec.getAccentColor() : this.j.getColor();
      if (this.k.isEnabled() && var1 > 0.0F) {
         eb var3 = new eb(255.0F, 0.0F, 0.0F, 255.0F);
         return var2.mix(var3, var1);
      } else {
         return var2;
      }
   }

   private void a(MatrixStack ms, LivingEntity target) {
      Camera var3 = mc.gameRenderer.getCamera();
      Vec3d var4 = this.a(target);
      double var5 = var4.x;
      double var7 = var4.y + target.getHeight() / 2.0F;
      double var9 = var4.z;
      double var11 = var5 - var3.getPos().getX();
      double var13 = var7 - var3.getPos().getY();
      double var15 = var9 - var3.getPos().getZ();
      this.a(ms, var11, var13, var15, 0.0F);
      this.a(ms, var11, var13, var15, 90.0F);
   }

   private void a(MatrixStack stack, double x, double y, double z, float offsetAngle) {
      stack.push();
      stack.translate(x, y, z);
      float var9 = this.u;
      stack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(var9 + offsetAngle));
      stack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var9 + offsetAngle));
      float var10 = this.t.getWidth() * 1.5F * this.m.getCurrentValue();
      int var11 = Math.max(10, (int)this.n.getCurrentValue());
      eb var12 = this.a();
      int var13 = (int)(this.p.getValue() * 255.0F);
      Identifier var14 = Mytheria.id("textures/chain.png");
      RenderSystem.setShaderTexture(0, var14);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      Matrix4f var15 = stack.peek().getPositionMatrix();
      BufferBuilder var16 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      float var17 = 4.0F * this.o.getCurrentValue();
      float var18 = this.t.getHeight() * 0.8F * this.m.getCurrentValue();
      float var19 = var18 / 2.0F;

      for (int var20 = 0; var20 < var11; var20++) {
         float var21 = (float)((Math.PI * 2) * var20 / var11);
         float var22 = (float)((Math.PI * 2) * (var20 + 1) / var11);
         float var23 = (float)(Math.cos(var21) * var10);
         float var24 = (float)(Math.sin(var21) * var10);
         float var25 = (float)(Math.cos(var22) * var10);
         float var26 = (float)(Math.sin(var22) * var10);
         float var27 = (float)var20 / var11 * var17;
         float var28 = (float)(var20 + 1) / var11 * var17;
         eb var29 = var12.withAlpha(var13);
         eb var30 = var12.withAlpha(var13);
         var16.vertex(var15, var23, -var19, var24).texture(var27, 1.0F).color(var29.getRGB());
         var16.vertex(var15, var25, -var19, var26).texture(var28, 1.0F).color(var30.getRGB());
         var16.vertex(var15, var25, var19, var26).texture(var28, 0.0F).color(var30.getRGB());
         var16.vertex(var15, var23, var19, var24).texture(var27, 0.0F).color(var29.getRGB());
      }

      BufferRenderer.drawWithGlobalProgram(var16.end());
      stack.pop();
   }

   private void b(MatrixStack ms, LivingEntity target) {
      Camera var3 = mc.gameRenderer.getCamera();
      Vec3d var4 = this.a(target);
      double var5 = var4.x - var3.getPos().getX();
      double var7 = var4.y - var3.getPos().getY() + target.getHeight() / 2.0;
      double var9 = var4.z - var3.getPos().getZ();
      float var11 = 1.2F * this.m.getCurrentValue() * this.o.getCurrentValue();
      float var12 = this.s.getValue();
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE);
      RenderSystem.disableDepthTest();
      RenderSystem.disableCull();
      eb var13 = this.a();
      ms.push();
      ms.translate(var5, var7, var9);
      ms.multiply(var3.getRotation());
      ms.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(var12));
      int var14 = (int)(this.p.getValue() * 255.0F * 0.7F);
      eb var15 = var13.withAlpha(var14);
      Identifier var16 = Mytheria.id("textures/marker.png");
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      int var17 = Math.max(1, (int)(this.n.getCurrentValue() / 10.0F));

      for (int var18 = 0; var18 < var17; var18++) {
         float var19 = var11 * (1.0F + var18 * 0.1F);
         float var20 = var14 / (var18 + 1);
         fj.drawImage(ms, var16, -var19 / 2.0F, -var19 / 2.0F, 0.0, var19, var19, var13.withAlpha((int)(var20 * 0.3F)));
      }

      fj.drawImage(ms, var16, -var11 / 2.0F, -var11 / 2.0F, 0.0, var11, var11, var15);
      ms.pop();
      RenderSystem.enableDepthTest();
      RenderSystem.enableCull();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableBlend();
   }

   private void c(MatrixStack ms, LivingEntity target) {
      Camera var3 = mc.gameRenderer.getCamera();
      Vec3d var4 = var3.getPos();
      Vec3d var5 = this.a(target);
      double var6 = var5.x - var4.getX();
      double var8 = var5.y - var4.getY();
      double var10 = var5.z - var4.getZ();
      float var12 = this.q.getValue();
      float var13 = target.getWidth() * 1.45F * this.m.getCurrentValue();
      float var14 = Math.max(0.5F, 0.7F - 0.1F * this.r.getValue() + 0.1F - 0.1F * this.p.getValue());
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE);
      RenderSystem.disableDepthTest();
      RenderSystem.disableCull();
      eb var15 = this.a();
      Identifier var16 = Mytheria.id("textures/bloom.png");
      RenderSystem.setShaderTexture(0, var16);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      int var17 = Math.max(1, (int)(360.0F / this.n.getCurrentValue()));
      float var18 = 0.4F * this.m.getCurrentValue() * this.o.getCurrentValue();
      float var19 = 0.8F * this.m.getCurrentValue() * this.o.getCurrentValue();

      for (int var20 = 0; var20 < 360; var20 += var17) {
         if ((int)(var20 / 45.0F) % 2 != 0) {
            double var21 = Math.toRadians(var20 + var12);
            float var23 = (float)(var6 + Math.sin(var21) * var13 * var14);
            float var24 = (float)(var10 + Math.cos(var21) * var13 * var14);
            double var25 = Math.toRadians(var12);
            float var27 = (float)((1.0 - Math.cos(var25)) / 2.0);
            float var28 = (float)(var8 + target.getHeight() * var27);
            ms.push();
            ms.translate(var23, var28, var24);
            ms.multiply(var3.getRotation());
            int var29 = (int)(this.p.getValue() * 255.0F);
            eb var30 = var15.withAlpha(var29);
            BufferBuilder var31 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
            int var32 = (int)(var29 * 0.1F);
            eb var33 = var30.withAlpha(var32);
            fj.drawImage(ms, var31, -var19 / 2.0F, -var19 / 2.0F, 0.0, var19, var19, var33);
            BufferRenderer.drawWithGlobalProgram(var31.end());
            var31 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
            fj.drawImage(ms, var31, -var18 / 2.0F, -var18 / 2.0F, 0.0, var18, var18, var30);
            BufferRenderer.drawWithGlobalProgram(var31.end());
            ms.pop();
         }
      }

      RenderSystem.enableDepthTest();
      RenderSystem.enableCull();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableBlend();
   }

    private static int applyBrightness(int color, float brightness) {
       int a = color >> 24 & 0xFF;
       int r = Math.min(255, Math.max(0, (int)((color >> 16 & 0xFF) * brightness)));
       int g = Math.min(255, Math.max(0, (int)((color >> 8 & 0xFF) * brightness)));
       int b = Math.min(255, Math.max(0, (int)((color & 0xFF) * brightness)));
       return a << 24 | r << 16 | g << 8 | b;
    }

    private static final Vector3f[] CRYSTAL_VERTS = new Vector3f[]{
       new Vector3f(0.0F, 1.5F, 0.0F),
       new Vector3f(0.0F, -1.5F, 0.0F),
       new Vector3f(1.0F, 0.0F, 0.0F),
       new Vector3f(-1.0F, 0.0F, 0.0F),
       new Vector3f(0.0F, 0.0F, 1.0F),
       new Vector3f(0.0F, 0.0F, -1.0F)
    };
    private static final int[][] CRYSTAL_FACES = new int[][]{
       {0, 2, 4}, {0, 4, 3}, {0, 3, 5}, {0, 5, 2},
       {1, 4, 2}, {1, 3, 4}, {1, 5, 3}, {1, 2, 5}
    };
    private static final float[] CRYSTAL_BRIGHTNESS = new float[]{
       1.0F, 0.8F, 0.6F, 0.9F, 0.7F, 0.5F, 0.4F, 0.6F
    };

    private void d(MatrixStack ms, LivingEntity target) {
       Camera var3 = mc.gameRenderer.getCamera();
       eb var5 = this.a();
       float var6 = this.t.getWidth() * 1.5F;
       float alpha = 255.0F * this.p.getValue();
       eb faceColor = var5.withAlpha(alpha);

       RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
       RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
       fl.prepareMatrices(ms, this.a(this.t));

       for (byte var8 = 0; var8 < 360; var8 += 20) {
          float var9 = 1.2F - 0.5F * this.p.getValue();
          float var10 = (float)(eI.sin((float)Math.toRadians(var8 + this.q.getValue() * 0.3F)) * var6 * var9);
          float var11 = (float)(eI.cos((float)Math.toRadians(var8 + this.q.getValue() * 0.3F)) * var6 * var9);
          float var12 = 0.1F;
          ms.push();
          ms.translate(var10, 0.1F + target.getHeight() * Math.abs(eI.sin(var8)), var11);
          Vec3d var13 = this.a(this.t).add(var10, 1.0, var11);
          Vec3d var14 = target.getPos().add(0.0, target.getHeight() / 2.0, 0.0);
          Vector3f dir = new Vector3f(
                (float)(var14.x - var13.x), (float)(var14.y - var13.y), (float)(var14.z - var13.z)
             );
          float len = dir.length();
          if (len < 0.001F) {
             ms.pop();
             continue;
          }
          dir.normalize();
          Vector3f up = new Vector3f(0.0F, 1.0F, 0.0F);
          Quaternionf rot = new Quaternionf().rotationTo(up, dir);
          ms.multiply(rot);

          ms.push();
          ms.scale(var12, var12, var12);
          Matrix4f posMat = ms.peek().getPositionMatrix();
          BufferBuilder buf = RenderSystem.renderThreadTesselator().begin(DrawMode.TRIANGLES, VertexFormats.POSITION_COLOR);
          for (int f = 0; f < CRYSTAL_FACES.length; f++) {
             int[] face = CRYSTAL_FACES[f];
             float bright = CRYSTAL_BRIGHTNESS[f];
             int c = applyBrightness(faceColor.getRGB(), bright);
             for (int v = 0; v < 3; v++) {
                Vector3f vert = CRYSTAL_VERTS[face[v]];
                buf.vertex(posMat, vert.x, vert.y, vert.z).color(c);
             }
          }
          BufferRenderer.drawWithGlobalProgram(buf.end());
          ms.pop();

          ms.pop();
       }

       Identifier var18 = Mytheria.id("textures/bloom.png");
       RenderSystem.setShaderTexture(0, var18);
       RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
       BufferBuilder var19 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
       float var20 = 1.0F;

       for (byte var21 = 0; var21 < 360; var21 += 20) {
          float var22 = 1.2F - 0.5F * this.p.getValue();
          float var23 = (float)(eI.sin((float)Math.toRadians(var21 + this.q.getValue() * 0.3F)) * var6 * var22);
          float var24 = (float)(eI.cos((float)Math.toRadians(var21 + this.q.getValue() * 0.3F)) * var6 * var22);
          ms.push();
          ms.translate(var23, 0.1F + target.getHeight() * Math.abs(eI.sin(var21)), var24);
          ms.multiply(var3.getRotation());
          fj.drawImage(ms, var19, -var20 / 2.0F, -var20 / 2.0F, 0.0, var20, var20, var5.withAlpha(255.0F * this.p.getValue() * 0.2F));
          ms.pop();
       }

       fl.buildBuffer(var19);
    }

    private void e(MatrixStack ms, LivingEntity target) {
       Camera var3 = mc.gameRenderer.getCamera();
       Vec3d var4 = this.a(target);
       Vec3d var5 = var3.getPos();
       eb var6 = this.a();
       Identifier var7 = Mytheria.id("textures/bloom.png");
       float var8 = this.t.getWidth() * 1.5F;
       double var9 = var4.x - var5.getX();
       double var11 = var4.y - var5.getY();
       double var13 = var4.z - var5.getZ();
       RenderSystem.setShaderTexture(0, var7);
       RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
       BufferBuilder var15 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
       byte var16 = 2;
       byte var17 = 0;
       byte var18 = 0;
       int var19 = 0;

       for (byte var20 = 0; var20 < 360; var20 += var16) {
          float var21 = 0.13F + 0.005F * var17;
          float var22 = 0.7F + 0.005F * var17;
          if (var18 > 0) {
             var18 -= var16;
          } else {
             var17 += var16;
             if (var17 > 50) {
                var18 = 100;
                var17 = 0;
                var19++;
             } else {
                float var23 = Math.max(0.5F, 1.2F - 0.5F * this.p.getValue());
                float var24 = (float)(eI.sin((float)Math.toRadians(var20 + this.q.getValue() * 1.0F)) * var8 * var23);
                float var25 = (float)(eI.cos((float)Math.toRadians(var20 + this.q.getValue() * 1.0F)) * var8 * var23);
                double var26 = this.t.getHeight() / 1.5F + this.t.getHeight() / 3.0F * eI.sin(Math.toRadians(var20 / 2.0F + this.q.getValue() / 5.0F));
                ms.push();
                ms.translate(var9 + var24, var11 + var26, var13 + var25);
                ms.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-var3.getYaw()));
                ms.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var3.getPitch()));
                fj.drawImage(ms, var15, -var22 / 2.0F, -var22 / 2.0F, -var21 / 2.0F, var22, var22, var6.withAlpha(var6.getAlpha() * this.p.getValue() * 0.05F));
                fj.drawImage(ms, var15, -var21 / 2.0F, -var21 / 2.0F, -var21 / 2.0F, var21, var21, var6.withAlpha(var6.getAlpha() * this.p.getValue()));
                ms.pop();
             }
          }
       }

       BufferRenderer.drawWithGlobalProgram(var15.end());
    }

   private Vec3d a(LivingEntity target) {
      float var2 = MinecraftClient.getInstance().getRenderTickCounter().getTickDelta(false);
      return new Vec3d(
         MathHelper.lerp(var2, target.prevX, target.getX()),
         MathHelper.lerp(var2, target.prevY, target.getY()),
         MathHelper.lerp(var2, target.prevZ, target.getZ())
      );
   }

   private void f(MatrixStack ms, LivingEntity target) {
      Camera var3 = mc.gameRenderer.getCamera();
      Vec3d var4 = this.a(target);
      Vec3d var5 = var3.getPos();
      float var6 = target.getWidth() * 0.7F;
      float var7 = target.getHeight();
      float var8 = this.a(this.p.getValue());
      double var9 = var4.x - var5.getX();
      double var11 = var4.y - var5.getY();
      double var13 = var4.z - var5.getZ();
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE);
      RenderSystem.disableCull();
      RenderSystem.enableDepthTest();
      RenderSystem.depthMask(false);
      float var15 = this.l.getCurrentValue() * 0.02F;
      this.w += var15;
      double var16 = this.w;
      double var18 = this.a(var16) * var7;
      double var20 = this.a(var16 - 0.4) * var7;
      float var22 = 0.2F * this.m.getCurrentValue() * this.o.getCurrentValue();
      float var23 = 0.14F * this.m.getCurrentValue() * this.o.getCurrentValue();
      int var24 = Math.max(40, (int)this.n.getCurrentValue() * 2);
      byte var25 = 6;
      long var26 = System.currentTimeMillis();
      Identifier var28 = Mytheria.id("textures/bloom.png");
      RenderSystem.setShaderTexture(0, var28);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      BufferBuilder var29 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);

      for (int var30 = 0; var30 < var24; var30++) {
         double var31 = (Math.PI * 2) * var30 / var24;
         float var33 = (float)(Math.cos(var31) * var6);
         float var34 = (float)(Math.sin(var31) * var6);
         int var35 = this.a(var30 * (360 / var24), var26);
         ms.push();
         ms.translate(var9 + var33, var11 + var18, var13 + var34);
         ms.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-var3.getYaw()));
         ms.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var3.getPitch()));
         eb var36 = eb.fromInt(var35).withAlpha(var8 * 255.0F);
         fj.drawImage(ms, var29, -var22 / 2.0F, -var22 / 2.0F, 0.0, var22, var22, var36);
         ms.pop();

         for (int var37 = 1; var37 <= var25; var37++) {
            float var38 = (float)var37 / (var25 + 1);
            double var39 = var18 + (var20 - var18) * var38;
            float var41 = var8 * (1.0F - var38) * 200.0F;
            ms.push();
            ms.translate(var9 + var33, var11 + var39, var13 + var34);
            ms.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-var3.getYaw()));
            ms.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var3.getPitch()));
            eb var42 = eb.fromInt(var35).withAlpha(var41);
            fj.drawImage(ms, var29, -var23 / 2.0F, -var23 / 2.0F, 0.0, var23, var23, var42);
            ms.pop();
         }
      }

      BufferRenderer.drawWithGlobalProgram(var29.end());
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      RenderSystem.enableCull();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableBlend();
   }

   private int a(int offsetAngle, long currentTime) {
      return this.a(this.a().getRGB());
   }

   private int a(int color) {
      if (!this.k.isEnabled()) {
         return color;
      }

      float var2 = 0.0F;
      long var3 = System.currentTimeMillis() - this.y;
      if (var3 < 300L) {
         float var5 = (float)var3 / 300.0F;
         var2 = 1.0F - this.a(var5);
      }

      this.x = MathHelper.lerp(1.0F, this.x, var2);
      if (this.x < 0.05F) {
         return color;
      }

      int var12 = color >> 24 & 0xFF;
      int var6 = color >> 16 & 0xFF;
      int var7 = color >> 8 & 0xFF;
      int var8 = color & 0xFF;
      int var9 = MathHelper.lerp(this.x, var6, 255);
      int var10 = MathHelper.lerp(this.x, var7, 50);
      int var11 = MathHelper.lerp(this.x, var8, 50);
      return var12 << 24 | var9 << 16 | var10 << 8 | var11;
   }

   private float a(float x) {
      return 1.0F - (float)Math.pow(1.0F - x, 3.0);
   }

   private double a(double step) {
      return Math.abs(Math.sin(step));
   }

   private void g(MatrixStack ms, LivingEntity target) {
      Camera var3 = mc.gameRenderer.getCamera();
      Vec3d var4 = this.a(target);
      Vec3d var5 = var3.getPos();
      double var6 = var4.x - var5.getX();
      double var8 = var4.y - var5.getY();
      double var10 = var4.z - var5.getZ();
      float var12 = 0.7F;
      float var13 = 1.0F;
      float var14 = 2.5E-4F * this.l.getCurrentValue();
      long var15 = System.currentTimeMillis();
      float var17 = (float)(-(var15 % 1000000L)) * var14;
      byte var18 = 8;
      double[] var19 = new double[var18];
      double[] var20 = new double[var18];
      double[] var21 = new double[var18];
      float var22 = var17 * 360.0F;

      for (int var23 = 0; var23 < var18; var23++) {
         float var24 = var22 + (float)var23 / var18 * 360.0F;
         double var25 = Math.toRadians(var24);
         float var27 = var23 % 2 == 0 ? 0.1F : -0.1F;
         double var28 = Math.cos(var25) * var12;
         double var30 = Math.sin(var25) * var12;
         var19[var23] = var6 + var28;
         var20[var23] = var8 + var13 + var27 - 0.2F;
         var21[var23] = var10 + var30;
      }

      double var62 = var6;
      double var63 = var8 + 2.2F;
      double var64 = var10;
      float var29 = (float)(var15 % 1000000L) * this.l.getCurrentValue() * 0.001F;
      float var65 = var29 * 180.0F;
      float var31 = (float)(Math.sin(var29 * 1.5) * 120.0);
      float var32 = (float)(Math.cos(var29 * 1.2) * 90.0);
      eb var33 = this.a();
      float var34 = var33.getRed() / 255.0F;
      float var35 = var33.getGreen() / 255.0F;
      float var36 = var33.getBlue() / 255.0F;
      float var37 = this.p.getValue();
      RenderSystem.enableDepthTest();
      RenderSystem.depthMask(true);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableCull();
      RenderSystem.setShaderColor(var34, var35, var36, var37);

      try {
         if (this.pigCache == null || this.pigCache.isRemoved()) {
            this.pigCache = new PigEntity(EntityType.PIG, mc.world);
         }
         PigEntity var38 = this.pigCache;
         var38.age = 0;
         EntityRenderDispatcher var39 = mc.getEntityRenderDispatcher();
         Immediate var40 = mc.getBufferBuilders().getEntityVertexConsumers();

         for (int var41 = 0; var41 <= var18; var41++) {
            double var42;
            double var44;
            double var46;
            double var48;
            double var50;
            double var52;
            if (var41 < var18) {
               var42 = var19[var41];
               var44 = var20[var41];
               var46 = var21[var41];
               int var54 = (var41 + 1) % var18;
               var48 = var19[var54];
               var50 = var20[var54];
               var52 = var21[var54];
            } else {
               var42 = var62;
               var44 = var63;
               var46 = var64;
               var48 = var19[0];
               var50 = var20[0];
               var52 = var21[0];
            }

            ms.push();
            ms.translate(var42, var44, var46);
            if (var41 == var18) {
               ms.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var65));
               ms.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var31));
               ms.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(var32));
            } else {
               double var66 = var48 - var42;
               double var56 = var50 - var44;
               double var58 = var52 - var46;
               float var60 = (float)Math.toDegrees(Math.atan2(-var58, var66)) - 95.0F;
               ms.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var60));
            }

            float var67 = var41 == var18 ? 0.4F * this.p.getValue() * this.o.getCurrentValue() : 0.3F * this.p.getValue() * this.o.getCurrentValue();
            ms.scale(var67, var67, var67);
            var38.bodyYaw = 0.0F;
            var38.prevBodyYaw = 0.0F;
            var38.headYaw = 0.0F;
            var38.prevHeadYaw = 0.0F;
            var39.render(var38, 0.0, 0.0, 0.0, mc.getRenderTickCounter().getTickDelta(false), ms, var40, 15728880);
            ms.pop();
         }

         var40.draw();
      } catch (Exception var61) {
      }

      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.enableCull();
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
   }

   @Override
   public void tick() {
      super.tick();
   }
}
