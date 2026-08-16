package a;
import a.b;
import a.bz;
import a.uc.eF;
import a.uc.bY;
import a.uc.cC;
import a.uc.bN;
import a.uc.bR;
import a.uc.aQ;
import a.uc.eR;
import a.uc.eW;
import a.uc.fO;
import a.uc.dY;
import a.uc.eP;
import a.uc.cN;
import a.l;
import a.uc.dR;
import a.uc.eY;
import a.ck;
import a.uc.cO;
import a.uc.aZ;
import a.uc.eK;
import a.uc.dZ;
import a.uc.dX;
import a.r;
import a.uc.aS;
import a.uc.cD;
import a.u;
import a.d;
import a.uc.aP;
import a.uc.dS;
import a.uc.aH;
import a.uc.eD;
import a.uc.aW;
import a.uc.dD;
import a.uc.bB;
import a.uc.eO;
import a.uc.cP;
import a.uc.fK;
import a.uc.aB;
import a.cj;
import a.uc.cX;
import a.uc.eG;
import a.uc.dA;
import a.uc.eI;
import a.ae;
import a.uc.dE;
import a.m;
import a.uc.dW;
import a.h;
import a.j;
import a.q;
import a.n;
import a.uc.bW;
import a.p;
import a.fj;
import a.uc.V;
import a.g;
import a.fd;
import a.uc.eX;
import a.uc.Z;
import a.uc.bS;
import a.uc.aO;
import a.uc.cE;
import a.uc.X;
import a.uc.fC;
import a.uc.aT;
import a.uc.dH;
import a.uc.fP;
import a.uc.eM;
import a.uc.cT;
import a.uc.bA;
import a.uc.eS;
import a.uc.cR;
import a.uc.aN;
import a.uc.cI;
import a.uc.cG;
import a.uc.bC;
import a.i;
import a.uc.bE;
import a.uc.aG;
import a.uc.dI;
import a.uc.aK;
import a.uc.aJ;
import a.o;
import a.uc.aV;
import a.uc.eH;
import a.eb;
import a.uc.fE;
import a.uc.bK;
import a.uc.cF;
import a.uc.bF;
import a.uc.eN;
import a.uc.bI;
import a.uc.dC;
import a.uc.cU;
import a.uc.aU;
import a.uc.bH;
import a.uc.eA;
import a.uc.bM;
import a.uc.aF;
import a.a;
import a.uc.cL;
import a.uc.fM;
import a.uc.dM;
import a.uc.cA;
import a.uc.bD;
import a.uc.bX;
import a.ch;
import a.uc.bG;
import a.uc.fB;
import a.uc.fA;
import a.uc.dF;
import a.uc.bU;
import a.uc.cY;
import a.uc.aC;
import a.uc.aL;
import a.uc.bQ;
import a.uc.eE;
import a.uc.eT;
import a.k;
import a.uc.cB;
import a.uc.bT;
import a.uc.W;
import a.uc.eL;
import a.uc.bP;
import a.uc.aD;
import a.uc.fI;
import a.t;
import a.uc.dB;
import a.uc.cV;
import a.c;
import a.uc.aY;
import a.uc.dT;
import a.uc.dJ;
import a.uc.fF;
import a.uc.aR;
import a.uc.fG;
import a.uc.dV;
import a.ax;
import a.uc.dG;
import a.e;
import a.uc.dP;
import a.uc.Y;
import a.uc.cM;
import a.uc.eQ;
import a.uc.eV;
import a.uc.cS;
import a.uc.bO;
import a.ec;
import a.uc.fL;
import a.uc.bL;
import a.uc.aI;
import a.uc.cW;
import a.uc.dL;
import a.uc.aM;
import a.uc.eJ;
import a.uc.bV;
import a.f;
import a.uc.cQ;
import a.uc.dQ;
import a.uc.dK;
import a.uc.aA;
import a.uc.eZ;
import a.s;
import a.uc.fH;
import a.uc.dU;
import a.uc.dN;
import a.uc.fN;
import a.uc.cZ;
import a.uc.eU;
import a.uc.bJ;

import com.mojang.blaze3d.systems.RenderSystem;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import nesquik.mytheria.systems.setting.settings.SliderSetting;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import org.joml.Matrix4f;

@ModuleInfo(name = "Block Overlay", category = ax.VISUALS, desc = "modules.descriptions.blockoverlay")
public class bz extends aJ {
   private static final Identifier a = Mytheria.id("textures/bloom.png");
   private static final int[][] b = new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 0}, {4, 5}, {5, 6}, {6, 7}, {7, 4}, {0, 4}, {1, 5}, {2, 6}, {3, 7}};
   private final ch c = new ch(this, "modules.settings.blockoverlay.fill").enabled(true);
   private final ch d = new ch(this, "modules.settings.blockoverlay.use_shader", "modules.settings.blockoverlay.use_shader.desc").enabled(false);
   private final ck e = new ck(this, "modules.settings.blockoverlay.shader_mode", "modules.settings.blockoverlay.shader_mode.desc", () -> !this.d.isEnabled());
   private final ck.a f = new ck.a(this.e, "modules.settings.blockoverlay.shader_mode.cobweb").select();
   private final ck.a g = new ck.a(this.e, "modules.settings.blockoverlay.shader_mode.nebula");
   private final ck.a h = new ck.a(this.e, "modules.settings.blockoverlay.shader_mode.plasma");
   private final ck.a i = new ck.a(this.e, "modules.settings.blockoverlay.shader_mode.starfield");
   private final ck.a j = new ck.a(this.e, "modules.settings.blockoverlay.shader_mode.fireworks");
   private final ck.a k = new ck.a(this.e, "modules.settings.blockoverlay.shader_mode.galaxy");
   private final ck.a l = new ck.a(this.e, "modules.settings.blockoverlay.shader_mode.stars");
   private final SliderSetting m = new SliderSetting(
         this, "modules.settings.blockoverlay.shader_opacity", "modules.settings.blockoverlay.shader_opacity.desc", () -> !this.d.isEnabled()
      )
      .min(0.1F)
      .max(1.0F)
      .step(0.05F)
      .currentValue(1.0F);
   private final SliderSetting n = new SliderSetting(
         this, "modules.settings.blockoverlay.shader_speed", "modules.settings.blockoverlay.shader_speed.desc", () -> !this.d.isEnabled()
      )
      .min(0.1F)
      .max(5.0F)
      .step(0.1F)
      .currentValue(1.0F);
   private final ch o = new ch(this, "Синхронизация с темой", "Использовать акцентный цвет темы").enabled(true);
   private final cj p = new cj(this, "modules.settings.blockoverlay.color", () -> this.o.isEnabled()).color(new eb(151.0F, 71.0F, 255.0F, 255.0F)).alpha(true);
   private final ch q = new ch(this, "Свечение", "Добавить эффект свечения").enabled(false);
   private final SliderSetting r = new SliderSetting(this, "Интенсивность свечения", "Сила эффекта свечения")
      .min(0.1F)
      .max(1.0F)
      .step(0.05F)
      .currentValue(0.5F);
   private final ch s = new ch(this, "Углы", "Показывать только углы").enabled(false);
   private final SliderSetting t = new SliderSetting(this, "Длина углов", "Длина линий на углах").min(0.1F).max(0.5F).step(0.05F).currentValue(0.25F);
   private final EventListener<ae> u = event -> {
      if (mc.crosshairTarget instanceof BlockHitResult var2 && var2.getType().equals(Type.BLOCK)) {
         BlockPos var30 = var2.getBlockPos();
         if (mc.world == null) {
            return;
         }

         MatrixStack var4 = event.getMatrices();
         Vec3d var5 = mc.gameRenderer.getCamera().getPos();
         VoxelShape var6 = mc.world.getBlockState(var30).getOutlineShape(mc.world, var30);
         Box var7 = var6.isEmpty() ? new Box(var30) : var6.getBoundingBox().offset(var30);
         double var8 = var7.minX - var5.x;
         double var10 = var7.minY - var5.y;
         double var12 = var7.minZ - var5.z;
         double var14 = var7.maxX - var5.x;
         double var16 = var7.maxY - var5.y;
         double var18 = var7.maxZ - var5.z;
         eb var20 = this.o.isEnabled() ? ec.getAccentColor() : this.p.getColor();
         var4.push();
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.disableDepthTest();
         RenderSystem.disableCull();
         Matrix4f var21 = var4.peek().getPositionMatrix();
         if (this.s.isEnabled()) {
            if (this.d.isEnabled()) {
               fd.a var31 = this.a();
               int var32 = (int)(this.m.getCurrentValue() * 255.0F);
               float var33 = this.n.getCurrentValue();
               fd.renderShaderBox(var21, var8, var10, var12, var14, var16, var18, var20, var31, var32, var33);
            }

            this.a(var21, var8, var10, var12, var14, var16, var18, var20);
         } else {
            eb var22 = var20.withAlpha((int)(var20.getAlpha() * 0.3F));
            eb var23 = var20.withAlpha((int)(var20.getAlpha() * 0.6F));
            eb var24 = var20.withAlpha((int)(var20.getAlpha() * 0.3F));
            eb var25 = var20.withAlpha((int)(var20.getAlpha() * 0.6F));
            eb[] var26 = new eb[]{var22, var23, var24, var25};
            if (this.c.isEnabled() || this.d.isEnabled()) {
               fd.a var27 = this.d.isEnabled() ? this.a() : fd.a.FIREWORKS;
               if (!this.d.isEnabled() && this.c.isEnabled()) {
                  RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
                  BufferBuilder var35 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
                  this.a(var35, var21, var8, var10, var12, var14, var16, var18, var26, 85);
                  BufferRenderer.drawWithGlobalProgram(var35.end());
               } else if (this.d.isEnabled()) {
                  int var28 = (int)(this.m.getCurrentValue() * 255.0F);
                  float var29 = this.n.getCurrentValue();
                  fd.renderShaderBox(var21, var8, var10, var12, var14, var16, var18, var20, var27, var28, var29);
               }
            }

            RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
            RenderSystem.lineWidth(3.0F);
            BufferBuilder var34 = RenderSystem.renderThreadTesselator().begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);
            this.a(var34, var21, var8, var10, var12, var14, var16, var18, var26);
            BufferRenderer.drawWithGlobalProgram(var34.end());
         }

         if (this.q.isEnabled()) {
            this.a(var4, var8, var10, var12, var14, var16, var18, var20);
         }

         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.enableCull();
         RenderSystem.enableDepthTest();
         RenderSystem.disableBlend();
         RenderSystem.lineWidth(1.0F);
         var4.pop();
      }
   };

   private void a(Matrix4f matrix, double minX, double minY, double minZ, double maxX, double maxY, double maxZ, eb color) {
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      float var15 = this.t.getCurrentValue();
      double var16 = maxX - minX;
      double var18 = maxY - minY;
      double var20 = maxZ - minZ;
      double var22 = Math.min(var16, Math.min(var18, var20)) * var15;
      int var24 = this.a(color.getRGB(), 255);
      int var25 = var24 >> 16 & 0xFF;
      int var26 = var24 >> 8 & 0xFF;
      int var27 = var24 & 0xFF;
      int var28 = var24 >> 24 & 0xFF;
      RenderSystem.lineWidth(3.0F);
      BufferBuilder var29 = RenderSystem.renderThreadTesselator().begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);
      Vec3d[] var30 = new Vec3d[]{
         new Vec3d(minX, minY, minZ),
         new Vec3d(maxX, minY, minZ),
         new Vec3d(maxX, minY, maxZ),
         new Vec3d(minX, minY, maxZ),
         new Vec3d(minX, maxY, minZ),
         new Vec3d(maxX, maxY, minZ),
         new Vec3d(maxX, maxY, maxZ),
         new Vec3d(minX, maxY, maxZ)
      };
      this.a(var29, matrix, var30[0], var22, var25, var26, var27, var28, true, true, true);
      this.a(var29, matrix, var30[1], var22, var25, var26, var27, var28, false, true, true);
      this.a(var29, matrix, var30[2], var22, var25, var26, var27, var28, false, true, false);
      this.a(var29, matrix, var30[3], var22, var25, var26, var27, var28, true, true, false);
      this.a(var29, matrix, var30[4], var22, var25, var26, var27, var28, true, false, true);
      this.a(var29, matrix, var30[5], var22, var25, var26, var27, var28, false, false, true);
      this.a(var29, matrix, var30[6], var22, var25, var26, var27, var28, false, false, false);
      this.a(var29, matrix, var30[7], var22, var25, var26, var27, var28, true, false, false);
      BufferRenderer.drawWithGlobalProgram(var29.end());
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
      BufferBuilder buffer, Matrix4f matrix, double minX, double minY, double minZ, double maxX, double maxY, double maxZ, eb[] colors, int fillAlpha
   ) {
      int[] var17 = new int[4];
      int[][] var18 = new int[4][4];

      for (int var19 = 0; var19 < 4; var19++) {
         int var20 = colors[var19].getRGB();
         var17[var19] = this.a(var20, fillAlpha);
         var18[var19][0] = var17[var19] >> 16 & 0xFF;
         var18[var19][1] = var17[var19] >> 8 & 0xFF;
         var18[var19][2] = var17[var19] & 0xFF;
         var18[var19][3] = var17[var19] >> 24 & 0xFF;
      }

      buffer.vertex(matrix, (float)minX, (float)minY, (float)minZ).color(var18[0][0], var18[0][1], var18[0][2], var18[0][3]);
      buffer.vertex(matrix, (float)maxX, (float)minY, (float)minZ).color(var18[1][0], var18[1][1], var18[1][2], var18[1][3]);
      buffer.vertex(matrix, (float)maxX, (float)minY, (float)maxZ).color(var18[2][0], var18[2][1], var18[2][2], var18[2][3]);
      buffer.vertex(matrix, (float)minX, (float)minY, (float)maxZ).color(var18[3][0], var18[3][1], var18[3][2], var18[3][3]);
      buffer.vertex(matrix, (float)minX, (float)maxY, (float)minZ).color(var18[0][0], var18[0][1], var18[0][2], var18[0][3]);
      buffer.vertex(matrix, (float)minX, (float)maxY, (float)maxZ).color(var18[3][0], var18[3][1], var18[3][2], var18[3][3]);
      buffer.vertex(matrix, (float)maxX, (float)maxY, (float)maxZ).color(var18[2][0], var18[2][1], var18[2][2], var18[2][3]);
      buffer.vertex(matrix, (float)maxX, (float)maxY, (float)minZ).color(var18[1][0], var18[1][1], var18[1][2], var18[1][3]);
      buffer.vertex(matrix, (float)minX, (float)minY, (float)maxZ).color(var18[3][0], var18[3][1], var18[3][2], var18[3][3]);
      buffer.vertex(matrix, (float)maxX, (float)minY, (float)maxZ).color(var18[2][0], var18[2][1], var18[2][2], var18[2][3]);
      buffer.vertex(matrix, (float)maxX, (float)maxY, (float)maxZ).color(var18[2][0], var18[2][1], var18[2][2], var18[2][3]);
      buffer.vertex(matrix, (float)minX, (float)maxY, (float)maxZ).color(var18[3][0], var18[3][1], var18[3][2], var18[3][3]);
      buffer.vertex(matrix, (float)maxX, (float)minY, (float)minZ).color(var18[1][0], var18[1][1], var18[1][2], var18[1][3]);
      buffer.vertex(matrix, (float)minX, (float)minY, (float)minZ).color(var18[0][0], var18[0][1], var18[0][2], var18[0][3]);
      buffer.vertex(matrix, (float)minX, (float)maxY, (float)minZ).color(var18[0][0], var18[0][1], var18[0][2], var18[0][3]);
      buffer.vertex(matrix, (float)maxX, (float)maxY, (float)minZ).color(var18[1][0], var18[1][1], var18[1][2], var18[1][3]);
      buffer.vertex(matrix, (float)minX, (float)minY, (float)minZ).color(var18[0][0], var18[0][1], var18[0][2], var18[0][3]);
      buffer.vertex(matrix, (float)minX, (float)minY, (float)maxZ).color(var18[3][0], var18[3][1], var18[3][2], var18[3][3]);
      buffer.vertex(matrix, (float)minX, (float)maxY, (float)maxZ).color(var18[3][0], var18[3][1], var18[3][2], var18[3][3]);
      buffer.vertex(matrix, (float)minX, (float)maxY, (float)minZ).color(var18[0][0], var18[0][1], var18[0][2], var18[0][3]);
      buffer.vertex(matrix, (float)maxX, (float)minY, (float)maxZ).color(var18[2][0], var18[2][1], var18[2][2], var18[2][3]);
      buffer.vertex(matrix, (float)maxX, (float)minY, (float)minZ).color(var18[1][0], var18[1][1], var18[1][2], var18[1][3]);
      buffer.vertex(matrix, (float)maxX, (float)maxY, (float)minZ).color(var18[1][0], var18[1][1], var18[1][2], var18[1][3]);
      buffer.vertex(matrix, (float)maxX, (float)maxY, (float)maxZ).color(var18[2][0], var18[2][1], var18[2][2], var18[2][3]);
   }

   private int a(int color, int alpha) {
      int var3 = color >> 16 & 0xFF;
      int var4 = color >> 8 & 0xFF;
      int var5 = color & 0xFF;
      return alpha << 24 | var3 << 16 | var4 << 8 | var5;
   }

   private void a(BufferBuilder buffer, Matrix4f matrix, double minX, double minY, double minZ, double maxX, double maxY, double maxZ, eb[] colors) {
      int[] var16 = new int[4];

      for (int var17 = 0; var17 < 4; var17++) {
         var16[var17] = this.a(colors[var17].getRGB(), 255);
      }

      this.a(buffer, matrix, minX, minY, minZ, maxX, minY, minZ, var16[0], var16[1]);
      this.a(buffer, matrix, maxX, minY, minZ, maxX, minY, maxZ, var16[1], var16[2]);
      this.a(buffer, matrix, maxX, minY, maxZ, minX, minY, maxZ, var16[2], var16[3]);
      this.a(buffer, matrix, minX, minY, maxZ, minX, minY, minZ, var16[3], var16[0]);
      this.a(buffer, matrix, minX, maxY, minZ, maxX, maxY, minZ, var16[0], var16[1]);
      this.a(buffer, matrix, maxX, maxY, minZ, maxX, maxY, maxZ, var16[1], var16[2]);
      this.a(buffer, matrix, maxX, maxY, maxZ, minX, maxY, maxZ, var16[2], var16[3]);
      this.a(buffer, matrix, minX, maxY, maxZ, minX, maxY, minZ, var16[3], var16[0]);
      this.a(buffer, matrix, minX, minY, minZ, minX, maxY, minZ, var16[0], var16[0]);
      this.a(buffer, matrix, maxX, minY, minZ, maxX, maxY, minZ, var16[1], var16[1]);
      this.a(buffer, matrix, maxX, minY, maxZ, maxX, maxY, maxZ, var16[2], var16[2]);
      this.a(buffer, matrix, minX, minY, maxZ, minX, maxY, maxZ, var16[3], var16[3]);
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

   private void a(MatrixStack matrices, double minX, double minY, double minZ, double maxX, double maxY, double maxZ, eb color) {
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableDepthTest();
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      RenderSystem.setShaderTexture(0, a);
      Vec3d[] var15 = new Vec3d[]{
         new Vec3d(minX, minY, minZ),
         new Vec3d(maxX, minY, minZ),
         new Vec3d(maxX, minY, maxZ),
         new Vec3d(minX, minY, maxZ),
         new Vec3d(minX, maxY, minZ),
         new Vec3d(maxX, maxY, minZ),
         new Vec3d(maxX, maxY, maxZ),
         new Vec3d(minX, maxY, maxZ)
      };

      for (int[] var19 : b) {
         Vec3d var20 = var15[var19[0]];
         Vec3d var21 = var15[var19[1]];
         float var22 = (float)var20.distanceTo(var21);

         for (int var23 = 0; var23 < 10; var23++) {
            float var24 = var23 / 10.0F;
            Vec3d var25 = var20.add(var21.subtract(var20).multiply(var24));
            matrices.push();
            matrices.translate(var25.x, var25.y, var25.z);
            matrices.multiply(mc.gameRenderer.getCamera().getRotation());
            float var26 = this.r.getCurrentValue();
            float var27 = var22 / 4.0F;
            BufferBuilder var28 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
            fj.drawImage(matrices, var28, -var27 / 2.0F, -var27 / 2.0F, 0.0, var27, var27, color.withAlpha(76.5F * var26));
            BufferRenderer.drawWithGlobalProgram(var28.end());
            float var29 = var22 * 1.5F;
            var28 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
            fj.drawImage(matrices, var28, -var29 / 2.0F, -var29 / 2.0F, 0.0, var29, var29, color.withAlpha(5.1F * var26));
            BufferRenderer.drawWithGlobalProgram(var28.end());
            matrices.pop();
         }
      }

      RenderSystem.enableDepthTest();
   }

   private fd.a a() {
      ck.a var1 = this.e.getValue();
      if (var1 == this.f) {
         return fd.a.COBWEB;
      } else if (var1 == this.g) {
         return fd.a.NEBULA;
      } else if (var1 == this.h) {
         return fd.a.PLASMA;
      } else if (var1 == this.i) {
         return fd.a.STARFIELD;
      } else if (var1 == this.j) {
         return fd.a.FIREWORKS;
      } else if (var1 == this.k) {
         return fd.a.GALAXY;
      } else {
         return var1 == this.l ? fd.a.STARS : fd.a.COBWEB;
      }
   }
}
