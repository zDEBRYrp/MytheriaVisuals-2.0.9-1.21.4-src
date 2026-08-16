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
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.Heightmap.Type;
import org.joml.AxisAngle4f;
import org.joml.Quaternionf;

@ModuleInfo(name = "ItemRadius", category = ax.PLAYER, desc = "modules.descriptions.itemradius")
public class aM extends aJ {
   private final ch a = new ch(this, "modules.settings.itemradius.ender_eye", "modules.settings.itemradius.ender_eye.description").enable();
   private final cj b = new cj(this, "modules.settings.itemradius.ender_eye_color").color(new eb(255.0F, 255.0F, 255.0F, 255.0F)).alpha(true);
   private final ch c = new ch(this, "modules.settings.itemradius.sugar", "modules.settings.itemradius.sugar.description").enable();
   private final cj d = new cj(this, "modules.settings.itemradius.sugar_color").color(new eb(255.0F, 255.0F, 255.0F, 255.0F)).alpha(true);
   private final ch e = new ch(this, "modules.settings.itemradius.netherite_scrap", "modules.settings.itemradius.netherite_scrap.description").enable();
   private final cj f = new cj(this, "modules.settings.itemradius.netherite_scrap_color").color(new eb(255.0F, 255.0F, 255.0F, 255.0F)).alpha(true);
   private final ch g = new ch(this, "modules.settings.itemradius.dried_kelp", "modules.settings.itemradius.dried_kelp.description").enable();
   private final cj h = new cj(this, "modules.settings.itemradius.dried_kelp_color").color(new eb(255.0F, 255.0F, 255.0F, 255.0F)).alpha(true);
   private final ch i = new ch(this, "modules.settings.itemradius.snowball", "modules.settings.itemradius.snowball.description").enable();
   private final cj j = new cj(this, "modules.settings.itemradius.snowball_color").color(new eb(255.0F, 255.0F, 255.0F, 255.0F)).alpha(true);
   private final ch k = new ch(this, "modules.settings.itemradius.proximity_color", "modules.settings.itemradius.proximity_color.description").enable();
   private final cj l = new cj(this, "modules.settings.itemradius.proximity_color_setting").color(new eb(0.0F, 255.0F, 0.0F, 255.0F)).alpha(true);
   private final EventListener<ae> m = event -> {
      if (mc.player != null) {
         boolean var2 = mc.player.getMainHandStack().getItem() == Items.ENDER_EYE || mc.player.getOffHandStack().getItem() == Items.ENDER_EYE;
         boolean var3 = mc.player.getMainHandStack().getItem() == Items.SUGAR || mc.player.getOffHandStack().getItem() == Items.SUGAR;
         boolean var4 = mc.player.getMainHandStack().getItem() == Items.NETHERITE_SCRAP || mc.player.getOffHandStack().getItem() == Items.NETHERITE_SCRAP;
         boolean var5 = mc.player.getMainHandStack().getItem() == Items.DRIED_KELP || mc.player.getOffHandStack().getItem() == Items.DRIED_KELP;
         boolean var6 = mc.player.getMainHandStack().getItem() == Items.SNOWBALL || mc.player.getOffHandStack().getItem() == Items.SNOWBALL;
         if (var2 || var3 || var4 || var5 || var6) {
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableDepthTest();
            RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
            RenderSystem.lineWidth(8.0F);
            MatrixStack var7 = event.getMatrices();
            var7.push();
            Vec3d var8 = mc.gameRenderer.getCamera().getPos();
            var7.translate(-var8.x, -var8.y, -var8.z);
            Vec3d var9 = mc.player.getPos();
            Vec3d var10 = var9.add(0.0, -0.1, 0.0);
            if (this.a.isEnabled() && var2) {
               eb var11 = this.b.getColor();
               int var12 = var11.getRGB();
               if (this.k.isEnabled() && this.a(var10, 14.0F)) {
                  var12 = this.l.getColor().getRGB();
               }

               this.a(var7, var10, 14.0F, var12);
            }

            if (this.c.isEnabled() && var3) {
               eb var15 = this.d.getColor();
               int var19 = var15.getRGB();
               if (this.k.isEnabled() && this.a(var10, 14.0F)) {
                  var19 = this.l.getColor().getRGB();
               }

               this.a(var7, var10, 14.0F, var19);
            }

            if (this.e.isEnabled() && var4) {
               eb var16 = this.f.getColor();
               int var20 = var16.getRGB();
               Vec3d var13 = this.b();
               Vec3d var14 = var13.add(0.0, 1.5, 0.0);
               if (this.k.isEnabled() && this.a(var14, 2.5F)) {
                  var20 = this.l.getColor().getRGB();
               }

               this.a(var7, var14, var20);
            }

            if (this.g.isEnabled() && var5) {
               eb var17 = this.h.getColor();
               int var21 = var17.getRGB();
               Vec3d var23 = this.b();
               Vec3d var25 = var23.add(0.0, 1.5, 0.0);
               if (this.k.isEnabled() && this.a(var25, Math.max(2.0F, 5.0F) / 2.0F)) {
                  var21 = this.l.getColor().getRGB();
               }

               this.b(var7, var25, var21);
            }

            if (this.i.isEnabled() && var6) {
               eb var18 = this.j.getColor();
               int var22 = var18.getRGB();
               Vec3d var24 = this.a();
               if (this.k.isEnabled() && this.a(var24, 12.0F)) {
                  var22 = this.l.getColor().getRGB();
               }

               this.a(var7, var24, 12.0F, var22);
            }

            var7.pop();
            RenderSystem.enableDepthTest();
            RenderSystem.disableBlend();
         }
      }
   };

   private boolean a(Vec3d center, float radius) {
      return mc.player != null && mc.world != null
         ? mc.world
            .getPlayers()
            .stream()
            .anyMatch(
               player -> {
                  if (player == mc.player) {
                     return false;
                  }

                  Vec3d var3 = player.getPos();
                  double var4 = Math.sqrt(
                     Math.pow(var3.x - center.x, 2.0)
                        + Math.pow(var3.y - center.y, 2.0)
                        + Math.pow(var3.z - center.z, 2.0)
                  );
                  return var4 <= radius;
               }
            )
         : false;
   }

   private void a(MatrixStack matrices, Vec3d center, float radius, int color) {
      BufferBuilder var5 = Tessellator.getInstance().begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);
      double var6 = center.y;
      byte var8 = 64;

      for (int var9 = 0; var9 < var8; var9++) {
         double var10 = (Math.PI * 2) * var9 / var8;
         double var12 = (Math.PI * 2) * (var9 + 1) / var8;
         double var14 = center.x + radius * Math.cos(var10);
         double var16 = center.z + radius * Math.sin(var10);
         double var18 = center.x + radius * Math.cos(var12);
         double var20 = center.z + radius * Math.sin(var12);
         var5.vertex(matrices.peek().getPositionMatrix(), (float)var14, (float)var6, (float)var16).color(color);
         var5.vertex(matrices.peek().getPositionMatrix(), (float)var18, (float)var6, (float)var20).color(color);
      }

      BufferRenderer.drawWithGlobalProgram(var5.end());
   }

   private Vec3d a() {
      if (mc.player == null) {
         return Vec3d.ZERO;
      }

      Vec3d var1 = mc.player.getEyePos();
      Vec3d var2 = mc.player.getRotationVec(1.0F);
      float var3 = mc.player.getPitch(1.0F);
      double var4 = Math.toRadians(var3);
      double var6 = 20.0;
      double var8 = 1.0 + Math.abs(Math.sin(var4)) * 1.0;
      double var10 = var6 * var8;
      var10 = Math.max(10.0, Math.min(50.0, var10));
      Vec3d var12 = var1.add(var2.multiply(var10));
      double var13 = mc.player.getY();
      if (mc.world != null) {
         var13 = mc.world.getTopY(Type.MOTION_BLOCKING, (int)var12.x, (int)var12.z);
      }

      return new Vec3d(var12.x, var13, var12.z);
   }

   private Vec3d b() {
      if (mc.player == null) {
         return Vec3d.ZERO;
      }

      double var1 = Math.floor(mc.player.getX()) + 0.5;
      double var3 = Math.floor(mc.player.getY()) + 0.5;
      double var5 = Math.floor(mc.player.getZ()) + 0.5;
      return new Vec3d(var1, var3, var5);
   }

   private void a(MatrixStack matrices, Vec3d center, int color) {
      Tessellator var4 = Tessellator.getInstance();
      float var5 = 2.5F;
      float var6 = 2.0F;
      float[][] var7 = new float[][]{
         {-var5, -var6, -var5},
         {var5, -var6, -var5},
         {var5, var6, -var5},
         {-var5, var6, -var5},
         {-var5, -var6, var5},
         {var5, -var6, var5},
         {2.5F, 2.0F, 2.5F},
         {-var5, var6, var5}
      };
      int[][] var8 = new int[][]{{0, 1, 2, 3}, {4, 7, 6, 5}, {0, 4, 5, 1}, {2, 6, 7, 3}, {0, 3, 7, 4}, {1, 5, 6, 2}};
      int var9 = color & 16777215 | 1426063360;
      BufferBuilder var10 = var4.begin(DrawMode.TRIANGLES, VertexFormats.POSITION_COLOR);

      for (int[] var14 : var8) {
         for (int var15 = 0; var15 < var14.length - 2; var15++) {
            int var16 = var14[0];
            int var17 = var14[var15 + 1];
            int var18 = var14[var15 + 2];
            var10.vertex(
                  matrices.peek().getPositionMatrix(),
                  (float)(center.x + var7[var16][0]),
                  (float)(center.y + var7[var16][1]),
                  (float)(center.z + var7[var16][2])
               )
               .color(var9);
            var10.vertex(
                  matrices.peek().getPositionMatrix(),
                  (float)(center.x + var7[var17][0]),
                  (float)(center.y + var7[var17][1]),
                  (float)(center.z + var7[var17][2])
               )
               .color(var9);
            var10.vertex(
                  matrices.peek().getPositionMatrix(),
                  (float)(center.x + var7[var18][0]),
                  (float)(center.y + var7[var18][1]),
                  (float)(center.z + var7[var18][2])
               )
               .color(var9);
         }
      }

      BufferRenderer.drawWithGlobalProgram(var10.end());
      int[][] var20 = new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 0}, {4, 5}, {5, 6}, {6, 7}, {7, 4}, {0, 4}, {1, 5}, {2, 6}, {3, 7}};
      var10 = var4.begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);

      for (int[] var24 : var20) {
         int var25 = var24[0];
         int var26 = var24[1];
         var10.vertex(
               matrices.peek().getPositionMatrix(),
               (float)(center.x + var7[var25][0]),
               (float)(center.y + var7[var25][1]),
               (float)(center.z + var7[var25][2])
            )
            .color(color);
         var10.vertex(
               matrices.peek().getPositionMatrix(),
               (float)(center.x + var7[var26][0]),
               (float)(center.y + var7[var26][1]),
               (float)(center.z + var7[var26][2])
            )
            .color(color);
      }

      BufferRenderer.drawWithGlobalProgram(var10.end());
   }

   private void b(MatrixStack matrices, Vec3d center, int color) {
      float var4 = mc.player.getPitch(1.0F);
      boolean var5 = var4 < -45.0F;
      if (var5) {
         Vec3d var6 = mc.player.getEyePos();
         Vec3d var7 = var6.add(0.0, 0.0, 3.0);
         this.d(matrices, var7, color);
      } else {
         Vec3d var8 = this.a(center, 4.0);
         this.c(matrices, var8, color);
      }
   }

   private Vec3d a(Vec3d center, double distance) {
      float var4 = mc.player.getYaw(1.0F);
      double var5 = -Math.sin(Math.toRadians(var4));
      double var7 = Math.cos(Math.toRadians(var4));
      double var9 = Math.floor(center.x + var5 * distance) + 0.5;
      double var11 = Math.floor(center.z + var7 * distance) + 0.5;
      double var13 = Math.floor(center.y) + 0.5;
      return new Vec3d(var9, var13, var11);
   }

   private void c(MatrixStack matrices, Vec3d center, int color) {
      Tessellator var4 = Tessellator.getInstance();
      float var5 = 1.0F;
      float var6 = 2.5F;
      float var7 = 2.0F;
      RenderSystem.enableDepthTest();
      float[][] var8 = new float[][]{
         {-var5, -var7, -var6},
         {var5, -var7, -var6},
         {var5, var7, -var6},
         {-var5, var7, -var6},
         {-var5, -var7, var6},
         {var5, -var7, var6},
         {1.0F, 2.0F, 2.5F},
         {-var5, var7, var6}
      };
      float var9 = mc.player.getYaw(1.0F);
      matrices.push();
      matrices.translate(center.x, center.y, center.z);
      matrices.multiply(new Quaternionf(new AxisAngle4f((float)Math.toRadians(-var9 + 90.0F), 0.0F, 1.0F, 0.0F)));
      matrices.translate(-center.x, -center.y, -center.z);
      int[][] var10 = new int[][]{{0, 1, 2, 3}, {4, 7, 6, 5}, {0, 4, 5, 1}, {2, 6, 7, 3}, {0, 3, 7, 4}, {1, 5, 6, 2}};
      int var11 = color & 16777215 | 1426063360;
      BufferBuilder var12 = var4.begin(DrawMode.TRIANGLES, VertexFormats.POSITION_COLOR);

      for (int[] var16 : var10) {
         for (int var17 = 0; var17 < var16.length - 2; var17++) {
            int var18 = var16[0];
            int var19 = var16[var17 + 1];
            int var20 = var16[var17 + 2];
            var12.vertex(
                  matrices.peek().getPositionMatrix(),
                  (float)(center.x + var8[var18][0]),
                  (float)(center.y + var8[var18][1]),
                  (float)(center.z + var8[var18][2])
               )
               .color(var11);
            var12.vertex(
                  matrices.peek().getPositionMatrix(),
                  (float)(center.x + var8[var19][0]),
                  (float)(center.y + var8[var19][1]),
                  (float)(center.z + var8[var19][2])
               )
               .color(var11);
            var12.vertex(
                  matrices.peek().getPositionMatrix(),
                  (float)(center.x + var8[var20][0]),
                  (float)(center.y + var8[var20][1]),
                  (float)(center.z + var8[var20][2])
               )
               .color(var11);
         }
      }

      BufferRenderer.drawWithGlobalProgram(var12.end());
      int[][] var22 = new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 0}, {4, 5}, {5, 6}, {6, 7}, {7, 4}, {0, 4}, {1, 5}, {2, 6}, {3, 7}};
      var12 = var4.begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);

      for (int[] var26 : var22) {
         int var27 = var26[0];
         int var28 = var26[1];
         var12.vertex(
               matrices.peek().getPositionMatrix(),
               (float)(center.x + var8[var27][0]),
               (float)(center.y + var8[var27][1]),
               (float)(center.z + var8[var27][2])
            )
            .color(color);
         var12.vertex(
               matrices.peek().getPositionMatrix(),
               (float)(center.x + var8[var28][0]),
               (float)(center.y + var8[var28][1]),
               (float)(center.z + var8[var28][2])
            )
            .color(color);
      }

      BufferRenderer.drawWithGlobalProgram(var12.end());
      matrices.pop();
   }

   private void d(MatrixStack matrices, Vec3d center, int color) {
      Tessellator var4 = Tessellator.getInstance();
      RenderSystem.disableDepthTest();
      float var5 = 2.5F;
      float var6 = 1.0F;
      float[][] var7 = new float[][]{
         {-var5, -var6, -var5},
         {var5, -var6, -var5},
         {var5, var6, -var5},
         {-var5, var6, -var5},
         {-var5, -var6, var5},
         {var5, -var6, var5},
         {2.5F, 1.0F, 2.5F},
         {-var5, var6, var5}
      };
      int[][] var8 = new int[][]{{0, 1, 2, 3}, {4, 7, 6, 5}, {0, 4, 5, 1}, {2, 6, 7, 3}, {0, 3, 7, 4}, {1, 5, 6, 2}};
      int var9 = color & 16777215 | 1426063360;
      BufferBuilder var10 = var4.begin(DrawMode.TRIANGLES, VertexFormats.POSITION_COLOR);

      for (int[] var14 : var8) {
         for (int var15 = 0; var15 < var14.length - 2; var15++) {
            int var16 = var14[0];
            int var17 = var14[var15 + 1];
            int var18 = var14[var15 + 2];
            var10.vertex(
                  matrices.peek().getPositionMatrix(),
                  (float)(center.x + var7[var16][0]),
                  (float)(center.y + var7[var16][1]),
                  (float)(center.z + var7[var16][2])
               )
               .color(var9);
            var10.vertex(
                  matrices.peek().getPositionMatrix(),
                  (float)(center.x + var7[var17][0]),
                  (float)(center.y + var7[var17][1]),
                  (float)(center.z + var7[var17][2])
               )
               .color(var9);
            var10.vertex(
                  matrices.peek().getPositionMatrix(),
                  (float)(center.x + var7[var18][0]),
                  (float)(center.y + var7[var18][1]),
                  (float)(center.z + var7[var18][2])
               )
               .color(var9);
         }
      }

      BufferRenderer.drawWithGlobalProgram(var10.end());
      int[][] var20 = new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 0}, {4, 5}, {5, 6}, {6, 7}, {7, 4}, {0, 4}, {1, 5}, {2, 6}, {3, 7}};
      var10 = var4.begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);

      for (int[] var24 : var20) {
         int var25 = var24[0];
         int var26 = var24[1];
         var10.vertex(
               matrices.peek().getPositionMatrix(),
               (float)(center.x + var7[var25][0]),
               (float)(center.y + var7[var25][1]),
               (float)(center.z + var7[var25][2])
            )
            .color(color);
         var10.vertex(
               matrices.peek().getPositionMatrix(),
               (float)(center.x + var7[var26][0]),
               (float)(center.y + var7[var26][1]),
               (float)(center.z + var7[var26][2])
            )
            .color(color);
      }

      BufferRenderer.drawWithGlobalProgram(var10.end());
   }

   public ch getEnderEye() {
      return this.a;
   }

   public cj getEnderEyeColor() {
      return this.b;
   }

   public ch getSugar() {
      return this.c;
   }

   public cj getSugarColor() {
      return this.d;
   }

   public ch getNetheriteScrap() {
      return this.e;
   }

   public cj getNetheriteScrapColor() {
      return this.f;
   }

   public ch getDriedKelp() {
      return this.g;
   }

   public cj getDriedKelpColor() {
      return this.h;
   }

   public ch getSnowball() {
      return this.i;
   }

   public cj getSnowballColor() {
      return this.j;
   }

   public ch getProximityColor() {
      return this.k;
   }

   public cj getProximityColorSetting() {
      return this.l;
   }

   public EventListener<ae> getOnRender3D() {
      return this.m;
   }
}
