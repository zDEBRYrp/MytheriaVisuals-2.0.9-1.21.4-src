package a;
import a.uc.B;
import a.uc.bZ;
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
import a.cn;
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
import a.uc.fJ;
import a.v;
import a.g;
import a.uc.fD;
import a.uc.eX;
import a.z;
import a.uc.bS;
import a.uc.aO;
import a.uc.cE;
import a.x;
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
import a.uc.A;
import a.uc.cL;
import a.uc.fM;
import a.uc.dM;
import a.uc.cA;
import a.uc.bD;
import a.uc.bX;
import a.uc.cH;
import a.uc.bG;
import a.uc.fB;
import a.uc.fA;
import a.uc.dF;
import a.uc.bU;
import a.uc.cY;
import a.uc.aC;
import a.uc.aL;
import a.uc.bQ;
import a.ee;
import a.uc.eT;
import a.k;
import a.uc.cB;
import a.bt;
import a.w;
import a.uc.eL;
import a.uc.bP;
import a.uc.aD;
import a.uc.fI;
import a.t;
import a.uc.dB;
import a.uc.cV;
import a.uc.C;
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
import a.y;
import a.uc.cM;
import a.uc.eQ;
import a.uc.eV;
import a.uc.cS;
import a.uc.bO;
import a.uc.eC;
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
import java.util.ArrayList;
import java.util.List;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;

@ModuleInfo(name = "Region Helper", category = ax.PLAYER, desc = "modules.descriptions.region_helper")
public class bt extends aJ {
   private final ck a = new ck(this, "modules.settings.region_helper.server");
   private final ck.a b = new ck.a(this.a, "modules.settings.region_helper.server.funtime").select();
   private final ck.a holyworldSetting = new ck.a(this.a, "modules.settings.region_helper.server.holyworld");
   private final cn d = new cn(this, "modules.settings.region_helper.display_mode");
   private final cn.a e = new cn.a(this.d, "modules.settings.region_helper.display_mode.in_hand").select();
   private final cn.a f = new cn.a(this.d, "modules.settings.region_helper.display_mode.placed");
   private final cn g = new cn(this, "modules.settings.region_helper.funtime_region_types", () -> !this.b.isSelected());
   private final cn.a h = new cn.a(this.g, "modules.settings.region_helper.region_types.iron").select();
   private final cn.a i = new cn.a(this.g, "modules.settings.region_helper.region_types.gold").select();
   private final cn.a j = new cn.a(this.g, "modules.settings.region_helper.region_types.diamond").select();
   private final cn.a k = new cn.a(this.g, "modules.settings.region_helper.region_types.emerald").select();
   private final cn.a l = new cn.a(this.g, "modules.settings.region_helper.region_types.diamond_ore").select();
   private final cn.a m = new cn.a(this.g, "modules.settings.region_helper.region_types.emerald_ore").select();
   private final cn n = new cn(this, "modules.settings.region_helper.holyworld_region_types", () -> !this.holyworldSetting.isSelected());
   private final cn.a o = new cn.a(this.n, "modules.settings.region_helper.holyworld.tiny_private").select();
   private final cn.a p = new cn.a(this.n, "modules.settings.region_helper.holyworld.small_private").select();
   private final cn.a q = new cn.a(this.n, "modules.settings.region_helper.holyworld.medium_private").select();
   private final cn.a r = new cn.a(this.n, "modules.settings.region_helper.holyworld.big_private").select();
   private final cn.a s = new cn.a(this.n, "modules.settings.region_helper.holyworld.unique_private").select();
   private final cj t = new cj(this, "modules.settings.region_helper.color.iron").color(new eb(200.0F, 200.0F, 200.0F, 150.0F)).alpha(true);
   private final cj u = new cj(this, "modules.settings.region_helper.color.gold").color(new eb(255.0F, 215.0F, 0.0F, 150.0F)).alpha(true);
   private final cj v = new cj(this, "modules.settings.region_helper.color.diamond").color(new eb(0.0F, 255.0F, 255.0F, 150.0F)).alpha(true);
   private final cj w = new cj(this, "modules.settings.region_helper.color.emerald").color(new eb(0.0F, 255.0F, 0.0F, 150.0F)).alpha(true);
   private final cj x = new cj(this, "modules.settings.region_helper.color.diamond_ore").color(new eb(100.0F, 200.0F, 255.0F, 150.0F)).alpha(true);
   private final cj y = new cj(this, "modules.settings.region_helper.color.emerald_ore").color(new eb(50.0F, 200.0F, 50.0F, 150.0F)).alpha(true);
   private final cj z = new cj(this, "modules.settings.region_helper.color.netherite_block").color(new eb(50.0F, 50.0F, 50.0F, 150.0F)).alpha(true);
   private final List<bt.b> A = new ArrayList<>();
   private long B = 0L;
   private final EventListener<ae> C = event -> {
      if (ee.isInGame() && mc.player != null && mc.world != null) {
         boolean var2 = mc.player.getMainHandStack().getItem() == Items.IRON_BLOCK || mc.player.getOffHandStack().getItem() == Items.IRON_BLOCK;
         boolean var3 = mc.player.getMainHandStack().getItem() == Items.GOLD_BLOCK || mc.player.getOffHandStack().getItem() == Items.GOLD_BLOCK;
         boolean var4 = mc.player.getMainHandStack().getItem() == Items.DIAMOND_BLOCK || mc.player.getOffHandStack().getItem() == Items.DIAMOND_BLOCK;
         boolean var5 = mc.player.getMainHandStack().getItem() == Items.EMERALD_BLOCK || mc.player.getOffHandStack().getItem() == Items.EMERALD_BLOCK;
         boolean var6 = mc.player.getMainHandStack().getItem() == Items.DIAMOND_ORE || mc.player.getOffHandStack().getItem() == Items.DIAMOND_ORE;
         boolean var7 = mc.player.getMainHandStack().getItem() == Items.EMERALD_ORE || mc.player.getOffHandStack().getItem() == Items.EMERALD_ORE;
         boolean var8 = mc.player.getMainHandStack().getItem() == Items.NETHERITE_BLOCK || mc.player.getOffHandStack().getItem() == Items.NETHERITE_BLOCK;
         boolean var9 = var2 || var3 || var4 || var5 || var6 || var7 || var8;
         MatrixStack var10 = event.getMatrices();
         var10.push();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.disableDepthTest();
         RenderSystem.disableCull();
         RenderSystem.lineWidth(2.0F);
         if (this.e.isSelected() && var9) {
            Vec3d var11 = this.b();
            if (this.b.isSelected()) {
               if (var2 && this.h.isSelected()) {
                  this.a(var10, var11, this.a(bt.c.IRON_BLOCK));
               }

               if (var3 && this.i.isSelected()) {
                  this.a(var10, var11, this.a(bt.c.GOLD_BLOCK));
               }

               if (var4 && this.j.isSelected()) {
                  this.a(var10, var11, this.a(bt.c.DIAMOND_BLOCK));
               }

               if (var5 && this.k.isSelected()) {
                  this.a(var10, var11, this.a(bt.c.EMERALD_BLOCK));
               }

               if (var6 && this.l.isSelected()) {
                  this.a(var10, var11, this.a(bt.c.DIAMOND_ORE));
               }

               if (var7 && this.m.isSelected()) {
                  this.a(var10, var11, this.a(bt.c.EMERALD_ORE));
               }
            } else if (this.holyworldSetting.isSelected()) {
               if (var2 && this.o.isSelected()) {
                  this.a(var10, var11, this.a(bt.c.IRON_BLOCK));
               }

               if (var3 && this.p.isSelected()) {
                  this.a(var10, var11, this.a(bt.c.GOLD_BLOCK));
               }

               if (var4 && this.q.isSelected()) {
                  this.a(var10, var11, this.a(bt.c.DIAMOND_BLOCK));
               }

               if (var7 && this.r.isSelected()) {
                  this.a(var10, var11, this.a(bt.c.EMERALD_ORE));
               }

               if (var8 && this.s.isSelected()) {
                  this.a(var10, var11, this.a(bt.c.NETHERITE_BLOCK));
               }
            }
         }

         if (this.f.isSelected()) {
            long var16 = System.currentTimeMillis();
            if (var16 - this.B > 1000L) {
               this.a();
               this.B = var16;
            }

            for (bt.b var14 : this.A) {
               boolean var15 = false;
               if (this.b.isSelected()) {
                  var15 = switch (var14.b) {
                     case IRON_BLOCK -> this.h.isSelected();
                     case GOLD_BLOCK -> this.i.isSelected();
                     case DIAMOND_BLOCK -> this.j.isSelected();
                     case EMERALD_BLOCK -> this.k.isSelected();
                     case DIAMOND_ORE -> this.l.isSelected();
                     case EMERALD_ORE -> this.m.isSelected();
                     case NETHERITE_BLOCK -> false;
                  };
               } else if (this.holyworldSetting.isSelected()) {
                  var15 = switch (var14.b) {
                     case IRON_BLOCK -> this.o.isSelected();
                     case GOLD_BLOCK -> this.p.isSelected();
                     case DIAMOND_BLOCK -> this.q.isSelected();
                     case EMERALD_BLOCK -> false;
                     case DIAMOND_ORE -> false;
                     case EMERALD_ORE -> this.r.isSelected();
                     case NETHERITE_BLOCK -> this.s.isSelected();
                  };
               }

               if (var15) {
                  this.a(var10, new Vec3d(var14.a.getX() + 0.5, var14.a.getY(), var14.a.getZ() + 0.5), this.a(var14.b));
               }
            }
         }

         RenderSystem.lineWidth(1.0F);
         RenderSystem.enableCull();
         RenderSystem.enableDepthTest();
         RenderSystem.disableBlend();
         var10.pop();
      }
   };

   private void a() {
      this.A.clear();
      if (mc.player != null && mc.world != null) {
         BlockPos var1 = mc.player.getBlockPos();
         byte var2 = 50;

         for (int var3 = -var2; var3 <= var2; var3++) {
            for (int var4 = -20; var4 <= 20; var4++) {
               for (int var5 = -var2; var5 <= var2; var5++) {
                  BlockPos var6 = var1.add(var3, var4, var5);
                  Block var7 = mc.world.getBlockState(var6).getBlock();
                  bt.c var8 = this.a(var7);
                  if (var8 != null) {
                     this.A.add(new bt.b(var6, var8));
                  }
               }
            }
         }
      }
   }

   private bt.c a(Block block) {
      if (block == Blocks.IRON_BLOCK) {
         return bt.c.IRON_BLOCK;
      } else if (block == Blocks.GOLD_BLOCK) {
         return bt.c.GOLD_BLOCK;
      } else if (block == Blocks.DIAMOND_BLOCK) {
         return bt.c.DIAMOND_BLOCK;
      } else if (block == Blocks.EMERALD_BLOCK) {
         return bt.c.EMERALD_BLOCK;
      } else if (block == Blocks.DIAMOND_ORE) {
         return bt.c.DIAMOND_ORE;
      } else if (block == Blocks.EMERALD_ORE) {
         return bt.c.EMERALD_ORE;
      } else {
         return block == Blocks.NETHERITE_BLOCK ? bt.c.NETHERITE_BLOCK : null;
      }
   }

   private bt.a a(bt.c type) {
      if (this.b.isSelected()) {
         return switch (type) {
            case IRON_BLOCK -> new bt.a(type, 2, 2);
            case GOLD_BLOCK -> new bt.a(type, 3, 3);
            case DIAMOND_BLOCK -> new bt.a(type, 5, 5);
            case EMERALD_BLOCK -> new bt.a(type, 7, 7);
            case DIAMOND_ORE -> new bt.a(type, 10, 10);
            case EMERALD_ORE -> new bt.a(type, 15, 15);
            case NETHERITE_BLOCK -> new bt.a(type, 2, 2);
         };
      } else if (this.holyworldSetting.isSelected()) {
         return switch (type) {
            case IRON_BLOCK -> new bt.a(type, 5, 5);
            case GOLD_BLOCK -> new bt.a(type, 7, 7);
            case DIAMOND_BLOCK -> new bt.a(type, 11, 11);
            case EMERALD_BLOCK -> new bt.a(type, 7, 7);
            case DIAMOND_ORE -> new bt.a(type, 10, 10);
            case EMERALD_ORE -> new bt.a(type, 21, 21);
            case NETHERITE_BLOCK -> new bt.a(type, 31, 31);
         };
      } else {
         return new bt.a(type, 2, 2);
      }
   }

   private Vec3d b() {
      if (mc.player == null) {
         return Vec3d.ZERO;
      }

      double var1 = Math.floor(mc.player.getX()) + 0.5;
      double var3 = Math.floor(mc.player.getY());
      double var5 = Math.floor(mc.player.getZ()) + 0.5;
      return new Vec3d(var1, var3, var5);
   }

   private void a(MatrixStack matrices, Vec3d center, bt.a config) {
      Vec3d var4 = mc.gameRenderer.getCamera().getPos();
      double var5 = config.a;
      double var7 = config.b;
      double var9 = center.x - var5 - var4.x;
      double var11 = center.y - var4.y;
      double var13 = center.z - var5 - var4.z;
      double var15 = center.x + var5 - var4.x;
      double var17 = center.y + var7 - var4.y;
      double var19 = center.z + var5 - var4.z;
      eb var21 = this.b(config.c);
      Matrix4f var22 = matrices.peek().getPositionMatrix();
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      BufferBuilder var23 = RenderSystem.renderThreadTesselator().begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);
      this.a(var23, var22, var9, var11, var13, var15, var17, var19, var21);
      BufferRenderer.drawWithGlobalProgram(var23.end());
   }

   private eb b(bt.c type) {
      return switch (type) {
         case IRON_BLOCK -> this.t.getColor();
         case GOLD_BLOCK -> this.u.getColor();
         case DIAMOND_BLOCK -> this.v.getColor();
         case EMERALD_BLOCK -> this.w.getColor();
         case DIAMOND_ORE -> this.x.getColor();
         case EMERALD_ORE -> this.y.getColor();
         case NETHERITE_BLOCK -> this.z.getColor();
      };
   }

   private void a(BufferBuilder buffer, Matrix4f matrix, double minX, double minY, double minZ, double maxX, double maxY, double maxZ, eb color) {
      int var16 = color.getRGB();
      int var17 = var16 >> 16 & 0xFF;
      int var18 = var16 >> 8 & 0xFF;
      int var19 = var16 & 0xFF;
      int var20 = var16 >> 24 & 0xFF;
      this.a(buffer, matrix, minX, minY, minZ, maxX, minY, minZ, var17, var18, var19, var20);
      this.a(buffer, matrix, maxX, minY, minZ, maxX, minY, maxZ, var17, var18, var19, var20);
      this.a(buffer, matrix, maxX, minY, maxZ, minX, minY, maxZ, var17, var18, var19, var20);
      this.a(buffer, matrix, minX, minY, maxZ, minX, minY, minZ, var17, var18, var19, var20);
      this.a(buffer, matrix, minX, maxY, minZ, maxX, maxY, minZ, var17, var18, var19, var20);
      this.a(buffer, matrix, maxX, maxY, minZ, maxX, maxY, maxZ, var17, var18, var19, var20);
      this.a(buffer, matrix, maxX, maxY, maxZ, minX, maxY, maxZ, var17, var18, var19, var20);
      this.a(buffer, matrix, minX, maxY, maxZ, minX, maxY, minZ, var17, var18, var19, var20);
      this.a(buffer, matrix, minX, minY, minZ, minX, maxY, minZ, var17, var18, var19, var20);
      this.a(buffer, matrix, maxX, minY, minZ, maxX, maxY, minZ, var17, var18, var19, var20);
      this.a(buffer, matrix, maxX, minY, maxZ, maxX, maxY, maxZ, var17, var18, var19, var20);
      this.a(buffer, matrix, minX, minY, maxZ, minX, maxY, maxZ, var17, var18, var19, var20);
   }

   private void a(BufferBuilder buffer, Matrix4f matrix, double x1, double y1, double z1, double x2, double y2, double z2, int r, int g, int b, int a) {
      buffer.vertex(matrix, (float)x1, (float)y1, (float)z1).color(r, g, b, a);
      buffer.vertex(matrix, (float)x2, (float)y2, (float)z2).color(r, g, b, a);
   }

   static class a {
      final int a;
      final int b;
      final bt.c c;

      a(bt.c type, int length, int height) {
         this.c = type;
         this.a = length;
         this.b = height;
      }
   }

   static class b {
      final BlockPos a;
      final bt.c b;

      b(BlockPos pos, bt.c type) {
         this.a = pos;
         this.b = type;
      }
   }

   enum c {
      IRON_BLOCK(Blocks.IRON_BLOCK),
      GOLD_BLOCK(Blocks.GOLD_BLOCK),
      DIAMOND_BLOCK(Blocks.DIAMOND_BLOCK),
      EMERALD_BLOCK(Blocks.EMERALD_BLOCK),
      DIAMOND_ORE(Blocks.DIAMOND_ORE),
      EMERALD_ORE(Blocks.EMERALD_ORE),
      NETHERITE_BLOCK(Blocks.NETHERITE_BLOCK);

      final Block a;

      c(Block block) {
         this.a = block;
      }
   }
}
