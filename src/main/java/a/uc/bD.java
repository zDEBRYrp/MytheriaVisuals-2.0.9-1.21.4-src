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
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import nesquik.mytheria.systems.setting.settings.SliderSetting;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.joml.Matrix4f;

@ModuleInfo(name = "Custom HitBox", category = ax.VISUALS, desc = "modules.descriptions.custom_hitbox")
public class bD extends aJ {
   private static final Identifier a = Mytheria.id("textures/bloom.png");
   private static final int[][] b = new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 0}, {4, 5}, {5, 6}, {6, 7}, {7, 4}, {0, 4}, {1, 5}, {2, 6}, {3, 7}};
   private final ch c = new ch(this, "modules.settings.custom_hitbox.fill").enabled(true);
   private final ch d = new ch(this, "Синхронизация с темой", "Использовать акцентный цвет темы").enabled(true);
   private final cj e;
   private final ch f = new ch(this, "Свечение", "Добавить эффект свечения").enabled(false);
   private final SliderSetting g = new SliderSetting(this, "Интенсивность свечения", "Сила эффекта свечения")
      .min(0.1F)
      .max(1.0F)
      .step(0.05F)
      .currentValue(0.5F);
   private final cn h;
   private final cn.a i;
   private final cn.a j;
   private final cn.a k;
   private final ch l = new ch(this, "Себя", "Показывать хитбокс на себе от 3-го лица").enabled(false);
   private final ch m = new ch(this, "Углы", "Показывать только углы хитбокса").enabled(false);
   private final SliderSetting n = new SliderSetting(this, "Длина углов", "Длина линий на углах").min(0.1F).max(0.5F).step(0.05F).currentValue(0.25F);
   private final ch o = new ch(this, "Только при наводке", "Показывать только при взгляде на сущность").enabled(false);
   private final cn p;
   private final cn.a q;
   private final cn.a r;
   private final EventListener<ae> s = event -> {
      if (ee.isInGame()) {
         MatrixStack var2 = event.getMatrices();
         var2.push();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.enableDepthTest();
         RenderSystem.depthMask(false);
         RenderSystem.disableCull();

         for (Entity var4 : mc.world.getEntities()) {
            boolean var5 = this.a(var4) && this.a(var4, event.getTickDelta()) && this.b(var4);
            if (this.o.isEnabled() && var4 != mc.player) {
               var5 = var5 && this.c(var4);
            }

            if (var5) {
               this.a(var2, var4, event.getTickDelta());
            }
         }

         RenderSystem.depthMask(true);
         RenderSystem.enableCull();
         RenderSystem.enableDepthTest();
         RenderSystem.disableBlend();
         RenderSystem.lineWidth(1.0F);
         var2.pop();
      }
   };

   public bD() {
      this.e = new cj(this, "modules.settings.custom_hitbox.color", () -> this.d.isEnabled()).color(ec.ACCENT);
      this.h = new cn(this, "Типы сущностей");
      this.i = new cn.a(this.h, "Игроки").select();
      this.j = new cn.a(this.h, "Мобы").select();
      this.k = new cn.a(this.h, "Предметы");
      this.p = new cn(this, "Режим отображения");
      this.q = new cn.a(this.p, "Полный хитбокс").select();
      this.r = new cn.a(this.p, "Только верх");
   }

   private boolean a(Entity entity) {
      if (entity == mc.player) {
         return this.l.isEnabled() && !mc.options.getPerspective().isFirstPerson();
      } else if (entity.isInvisible()) {
         return false;
      } else if (entity instanceof PlayerEntity) {
         return this.i.isSelected();
      } else if (entity instanceof MobEntity) {
         return this.j.isSelected();
      } else {
         return entity instanceof ItemEntity ? this.k.isSelected() : false;
      }
   }

   private boolean b(Entity entity) {
      if (mc.player != null && mc.world != null) {
         Vec3d var2 = mc.player.getEyePos();
         Box var3 = entity.getBoundingBox();
         Vec3d var4 = var3.getCenter();
         RaycastContext var5 = new RaycastContext(var2, var4, ShapeType.COLLIDER, FluidHandling.NONE, mc.player);
         BlockHitResult var6 = mc.world.raycast(var5);
         if (var6.getType() != Type.MISS) {
            Vec3d[] var7 = new Vec3d[]{
               new Vec3d(var3.minX, var3.minY, var3.minZ),
               new Vec3d(var3.maxX, var3.minY, var3.minZ),
               new Vec3d(var3.minX, var3.maxY, var3.minZ),
               new Vec3d(var3.maxX, var3.maxY, var3.minZ),
               new Vec3d(var3.minX, var3.minY, var3.maxZ),
               new Vec3d(var3.maxX, var3.minY, var3.maxZ),
               new Vec3d(var3.minX, var3.maxY, var3.maxZ),
               new Vec3d(var3.maxX, var3.maxY, var3.maxZ),
               var4
            };

            for (Vec3d var11 : var7) {
               RaycastContext var12 = new RaycastContext(var2, var11, ShapeType.COLLIDER, FluidHandling.NONE, mc.player);
               BlockHitResult var13 = mc.world.raycast(var12);
               if (var13.getType() == Type.MISS) {
                  return true;
               }
            }

            return false;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   private boolean a(Entity entity, float partialTicks) {
      Camera var3 = mc.gameRenderer.getCamera();
      Vec3d var4 = var3.getPos();
      double var5 = entity.lastRenderX + (entity.getX() - entity.lastRenderX) * partialTicks;
      double var7 = entity.lastRenderY + (entity.getY() - entity.lastRenderY) * partialTicks + entity.getHeight() * 0.5;
      double var9 = entity.lastRenderZ + (entity.getZ() - entity.lastRenderZ) * partialTicks;
      double var11 = var5 - var4.x;
      double var13 = var7 - var4.y;
      double var15 = var9 - var4.z;
      double var17 = Math.sqrt(var11 * var11 + var15 * var15);
      if (var17 < 1.0E-6) {
         return true;
      }

      float var19 = (float)(MathHelper.atan2(var15, var11) * 180.0 / Math.PI) - 90.0F;
      float var20 = (float)(-(MathHelper.atan2(var13, var17) * 180.0 / Math.PI));
      float var21 = var3.getYaw();
      float var22 = var3.getPitch();
      float var23 = MathHelper.wrapDegrees(var19 - var21);
      float var24 = MathHelper.wrapDegrees(var20 - var22);
      return Math.abs(var23) <= 75.0F && Math.abs(var24) <= 75.0F;
   }

   private boolean c(Entity entity) {
      if (mc.player == null) {
         return false;
      }

      Vec3d var2 = mc.player.getEyePos();
      Vec3d var3 = mc.player.getRotationVec(1.0F);
      Vec3d var4 = entity.getBoundingBox().getCenter();
      Vec3d var5 = var4.subtract(var2).normalize();
      double var6 = var3.dotProduct(var5);
      return var6 > 0.95;
   }

   private void a(MatrixStack matrices, Entity target, float partialTicks) {
      if (target != null) {
         Vec3d var4 = mc.gameRenderer.getCamera().getPos();
         double var5 = target.lastRenderX + (target.getX() - target.lastRenderX) * partialTicks;
         double var7 = target.lastRenderY + (target.getY() - target.lastRenderY) * partialTicks;
         double var9 = target.lastRenderZ + (target.getZ() - target.lastRenderZ) * partialTicks;
         Box var11 = target.getBoundingBox();
         double var12 = var11.minX - target.getX() + var5 - var4.x;
         double var14 = var11.minY - target.getY() + var7 - var4.y;
         double var16 = var11.minZ - target.getZ() + var9 - var4.z;
         double var18 = var11.maxX - target.getX() + var5 - var4.x;
         double var20 = var11.maxY - target.getY() + var7 - var4.y;
         double var22 = var11.maxZ - target.getZ() + var9 - var4.z;
         boolean var24 = this.r.isSelected();
         if (var24) {
            double var25 = var20 - var14;
            var14 = var20 - var25 * 0.15;
         }

         eb var33 = this.d.isEnabled() ? ec.getAccentColor() : this.e.getColor();
         Matrix4f var26 = matrices.peek().getPositionMatrix();
         if (this.m.isEnabled()) {
            this.a(var26, var12, var14, var16, var18, var20, var22, var33, var24);
         } else {
            eb var27 = var33.withAlpha((int)(var33.getAlpha() * 0.3F));
            eb var28 = var33.withAlpha((int)(var33.getAlpha() * 0.6F));
            eb var29 = var33.withAlpha((int)(var33.getAlpha() * 0.3F));
            eb var30 = var33.withAlpha((int)(var33.getAlpha() * 0.6F));
            eb[] var31 = new eb[]{var27, var28, var29, var30};
            if (this.c.isEnabled()) {
               RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
               BufferBuilder var32 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
               this.a(var32, var26, var12, var14 + 0.01F, var16, var18, var20, var22, var31, 85, var24);
               BufferRenderer.drawWithGlobalProgram(var32.end());
            }

            RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
            RenderSystem.lineWidth(3.0F);
            BufferBuilder var34 = RenderSystem.renderThreadTesselator().begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);
            this.a(var34, var26, var12, var14 + 0.01F, var16, var18, var20, var22, var31, var24);
            BufferRenderer.drawWithGlobalProgram(var34.end());
         }

         if (this.f.isEnabled()) {
            this.a(matrices, var12, var14, var16, var18, var20, var22, var33, var24);
         }
      }
   }

   private void a(Matrix4f matrix, double minX, double minY, double minZ, double maxX, double maxY, double maxZ, eb color, boolean isTopOnly) {
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      float var16 = this.n.getCurrentValue();
      double var17 = maxX - minX;
      double var19 = maxY - minY;
      double var21 = maxZ - minZ;
      double var23 = Math.min(var17, Math.min(var19, var21)) * var16;
      int var25 = this.a(color.getRGB(), 255);
      int var26 = var25 >> 16 & 0xFF;
      int var27 = var25 >> 8 & 0xFF;
      int var28 = var25 & 0xFF;
      int var29 = var25 >> 24 & 0xFF;
      RenderSystem.lineWidth(3.0F);
      BufferBuilder var30 = RenderSystem.renderThreadTesselator().begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);
      Vec3d[] var31 = new Vec3d[]{
         new Vec3d(minX, minY, minZ),
         new Vec3d(maxX, minY, minZ),
         new Vec3d(maxX, minY, maxZ),
         new Vec3d(minX, minY, maxZ),
         new Vec3d(minX, maxY, minZ),
         new Vec3d(maxX, maxY, minZ),
         new Vec3d(maxX, maxY, maxZ),
         new Vec3d(minX, maxY, maxZ)
      };
      if (!isTopOnly) {
         this.a(var30, matrix, var31[0], var23, var26, var27, var28, var29, true, true, true);
         this.a(var30, matrix, var31[1], var23, var26, var27, var28, var29, false, true, true);
         this.a(var30, matrix, var31[2], var23, var26, var27, var28, var29, false, true, false);
         this.a(var30, matrix, var31[3], var23, var26, var27, var28, var29, true, true, false);
      }

      this.a(var30, matrix, var31[4], var23, var26, var27, var28, var29, true, false, true);
      this.a(var30, matrix, var31[5], var23, var26, var27, var28, var29, false, false, true);
      this.a(var30, matrix, var31[6], var23, var26, var27, var28, var29, false, false, false);
      this.a(var30, matrix, var31[7], var23, var26, var27, var28, var29, true, false, false);
      BufferRenderer.drawWithGlobalProgram(var30.end());
   }

   private void a(
      BufferBuilder buffer, Matrix4f matrix, Vec3d corner, double lineLength, int r, int g, int b, int a, boolean isLeft, boolean isBottom, boolean isFront
   ) {
      Vec3d var13 = corner.add(isLeft ? lineLength : -lineLength, 0.0, 0.0);
      buffer.vertex(matrix, (float)corner.x, (float)corner.y, (float)corner.z).color(r, g, b, a);
      buffer.vertex(matrix, (float)var13.x, (float)var13.y, (float)var13.z).color(r, g, b, a);
      Vec3d var14 = corner.add(0.0, isBottom ? lineLength : -lineLength, 0.0);
      buffer.vertex(matrix, (float)corner.x, (float)corner.y, (float)corner.z).color(r, g, b, a);
      buffer.vertex(matrix, (float)var14.x, (float)var14.y, (float)var14.z).color(r, g, b, a);
      Vec3d var15 = corner.add(0.0, 0.0, isFront ? lineLength : -lineLength);
      buffer.vertex(matrix, (float)corner.x, (float)corner.y, (float)corner.z).color(r, g, b, a);
      buffer.vertex(matrix, (float)var15.x, (float)var15.y, (float)var15.z).color(r, g, b, a);
   }

   private void a(
      BufferBuilder buffer,
      Matrix4f matrix,
      double minX,
      double minY,
      double minZ,
      double maxX,
      double maxY,
      double maxZ,
      eb[] colors,
      int fillAlpha,
      boolean isTopOnly
   ) {
      int[] var18 = new int[4];
      int[][] var19 = new int[4][4];

      for (int var20 = 0; var20 < 4; var20++) {
         int var21 = colors[var20].getRGB();
         var18[var20] = this.a(var21, fillAlpha);
         var19[var20][0] = var18[var20] >> 16 & 0xFF;
         var19[var20][1] = var18[var20] >> 8 & 0xFF;
         var19[var20][2] = var18[var20] & 0xFF;
         var19[var20][3] = var18[var20] >> 24 & 0xFF;
      }

      if (!isTopOnly) {
         buffer.vertex(matrix, (float)minX, (float)minY, (float)minZ).color(var19[0][0], var19[0][1], var19[0][2], var19[0][3]);
         buffer.vertex(matrix, (float)maxX, (float)minY, (float)minZ).color(var19[1][0], var19[1][1], var19[1][2], var19[1][3]);
         buffer.vertex(matrix, (float)maxX, (float)minY, (float)maxZ).color(var19[2][0], var19[2][1], var19[2][2], var19[2][3]);
         buffer.vertex(matrix, (float)minX, (float)minY, (float)maxZ).color(var19[3][0], var19[3][1], var19[3][2], var19[3][3]);
      }

      buffer.vertex(matrix, (float)minX, (float)maxY, (float)minZ).color(var19[0][0], var19[0][1], var19[0][2], var19[0][3]);
      buffer.vertex(matrix, (float)minX, (float)maxY, (float)maxZ).color(var19[3][0], var19[3][1], var19[3][2], var19[3][3]);
      buffer.vertex(matrix, (float)maxX, (float)maxY, (float)maxZ).color(var19[2][0], var19[2][1], var19[2][2], var19[2][3]);
      buffer.vertex(matrix, (float)maxX, (float)maxY, (float)minZ).color(var19[1][0], var19[1][1], var19[1][2], var19[1][3]);
      buffer.vertex(matrix, (float)minX, (float)minY, (float)maxZ).color(var19[3][0], var19[3][1], var19[3][2], var19[3][3]);
      buffer.vertex(matrix, (float)maxX, (float)minY, (float)maxZ).color(var19[2][0], var19[2][1], var19[2][2], var19[2][3]);
      buffer.vertex(matrix, (float)maxX, (float)maxY, (float)maxZ).color(var19[2][0], var19[2][1], var19[2][2], var19[2][3]);
      buffer.vertex(matrix, (float)minX, (float)maxY, (float)maxZ).color(var19[3][0], var19[3][1], var19[3][2], var19[3][3]);
      buffer.vertex(matrix, (float)maxX, (float)minY, (float)minZ).color(var19[1][0], var19[1][1], var19[1][2], var19[1][3]);
      buffer.vertex(matrix, (float)minX, (float)minY, (float)minZ).color(var19[0][0], var19[0][1], var19[0][2], var19[0][3]);
      buffer.vertex(matrix, (float)minX, (float)maxY, (float)minZ).color(var19[0][0], var19[0][1], var19[0][2], var19[0][3]);
      buffer.vertex(matrix, (float)maxX, (float)maxY, (float)minZ).color(var19[1][0], var19[1][1], var19[1][2], var19[1][3]);
      buffer.vertex(matrix, (float)minX, (float)minY, (float)minZ).color(var19[0][0], var19[0][1], var19[0][2], var19[0][3]);
      buffer.vertex(matrix, (float)minX, (float)minY, (float)maxZ).color(var19[3][0], var19[3][1], var19[3][2], var19[3][3]);
      buffer.vertex(matrix, (float)minX, (float)maxY, (float)maxZ).color(var19[3][0], var19[3][1], var19[3][2], var19[3][3]);
      buffer.vertex(matrix, (float)minX, (float)maxY, (float)minZ).color(var19[0][0], var19[0][1], var19[0][2], var19[0][3]);
      buffer.vertex(matrix, (float)maxX, (float)minY, (float)maxZ).color(var19[2][0], var19[2][1], var19[2][2], var19[2][3]);
      buffer.vertex(matrix, (float)maxX, (float)minY, (float)minZ).color(var19[1][0], var19[1][1], var19[1][2], var19[1][3]);
      buffer.vertex(matrix, (float)maxX, (float)maxY, (float)minZ).color(var19[1][0], var19[1][1], var19[1][2], var19[1][3]);
      buffer.vertex(matrix, (float)maxX, (float)maxY, (float)maxZ).color(var19[2][0], var19[2][1], var19[2][2], var19[2][3]);
   }

   private int a(int color, int alpha) {
      int var3 = color >> 16 & 0xFF;
      int var4 = color >> 8 & 0xFF;
      int var5 = color & 0xFF;
      return alpha << 24 | var3 << 16 | var4 << 8 | var5;
   }

   private void a(
      BufferBuilder buffer, Matrix4f matrix, double minX, double minY, double minZ, double maxX, double maxY, double maxZ, eb[] colors, boolean isTopOnly
   ) {
      int[] var17 = new int[4];

      for (int var18 = 0; var18 < 4; var18++) {
         var17[var18] = this.a(colors[var18].getRGB(), 255);
      }

      if (!isTopOnly) {
         this.a(buffer, matrix, minX, minY, minZ, maxX, minY, minZ, var17[0], var17[1]);
         this.a(buffer, matrix, maxX, minY, minZ, maxX, minY, maxZ, var17[1], var17[2]);
         this.a(buffer, matrix, maxX, minY, maxZ, minX, minY, maxZ, var17[2], var17[3]);
         this.a(buffer, matrix, minX, minY, maxZ, minX, minY, minZ, var17[3], var17[0]);
      }

      this.a(buffer, matrix, minX, maxY, minZ, maxX, maxY, minZ, var17[0], var17[1]);
      this.a(buffer, matrix, maxX, maxY, minZ, maxX, maxY, maxZ, var17[1], var17[2]);
      this.a(buffer, matrix, maxX, maxY, maxZ, minX, maxY, maxZ, var17[2], var17[3]);
      this.a(buffer, matrix, minX, maxY, maxZ, minX, maxY, minZ, var17[3], var17[0]);
      this.a(buffer, matrix, minX, minY, minZ, minX, maxY, minZ, var17[0], var17[0]);
      this.a(buffer, matrix, maxX, minY, minZ, maxX, maxY, minZ, var17[1], var17[1]);
      this.a(buffer, matrix, maxX, minY, maxZ, maxX, maxY, maxZ, var17[2], var17[2]);
      this.a(buffer, matrix, minX, minY, maxZ, minX, maxY, maxZ, var17[3], var17[3]);
   }

   private void a(BufferBuilder buffer, Matrix4f matrix, double x1, double y1, double z1, double x2, double y2, double z2, int color1, int color2) {
      int var17 = color1 >> 16 & 0xFF;
      int var18 = color1 >> 8 & 0xFF;
      int var19 = color1 & 0xFF;
      int var20 = color1 >> 24 & 0xFF;
      int var21 = color2 >> 16 & 0xFF;
      int var22 = color2 >> 8 & 0xFF;
      int var23 = color2 & 0xFF;
      int var24 = color2 >> 24 & 0xFF;
      buffer.vertex(matrix, (float)x1, (float)y1, (float)z1).color(var17, var18, var19, var20);
      buffer.vertex(matrix, (float)x2, (float)y2, (float)z2).color(var21, var22, var23, var24);
   }

   private void a(MatrixStack matrices, double minX, double minY, double minZ, double maxX, double maxY, double maxZ, eb color, boolean isTopOnly) {
      RenderSystem.setShaderTexture(0, a);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      BufferBuilder var16 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      Vec3d[] var17 = new Vec3d[]{
         new Vec3d(minX, minY, minZ),
         new Vec3d(maxX, minY, minZ),
         new Vec3d(maxX, minY, maxZ),
         new Vec3d(minX, minY, maxZ),
         new Vec3d(minX, maxY, minZ),
         new Vec3d(maxX, maxY, minZ),
         new Vec3d(maxX, maxY, maxZ),
         new Vec3d(minX, maxY, maxZ)
      };

      for (int[] var21 : b) {
         if (!isTopOnly || var21[0] >= 4 || var21[1] >= 4) {
            Vec3d var22 = var17[var21[0]];
            Vec3d var23 = var17[var21[1]];
            float var24 = (float)var22.distanceTo(var23);

            for (int var25 = 0; var25 < 10; var25++) {
               float var26 = var25 / 10.0F;
               Vec3d var27 = var22.add(var23.subtract(var22).multiply(var26));
               matrices.push();
               matrices.translate(var27.x, var27.y, var27.z);
               matrices.multiply(mc.gameRenderer.getCamera().getRotation());
               float var28 = this.g.getCurrentValue();
               float var29 = var24 / 4.0F;
               fj.drawImage(matrices, var16, -var29 / 2.0F, -var29 / 2.0F, 0.0, var29, var29, color.withAlpha(76.5F * var28));
               float var30 = var24 * 1.5F;
               fj.drawImage(matrices, var16, -var30 / 2.0F, -var30 / 2.0F, 0.0, var30, var30, color.withAlpha(5.1F * var28));
               matrices.pop();
            }
         }
      }

      BufferRenderer.drawWithGlobalProgram(var16.end());
   }
}
