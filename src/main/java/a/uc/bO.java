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
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.CustomDrawContext;
import nesquik.mytheria.framework.msdf.Font;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;

@ModuleInfo(name = "Object Info", category = ax.VISUALS, desc = "modules.descriptions.object_info")
public class bO extends aJ {
   private static final Identifier a = Mytheria.id("textures/bloom.png");
   static final Random RANDOM = new Random();
   private final ck c = new ck(this, "modules.settings.object_info.particle_mode");
   private final ck.a d = new ck.a(this.c, "modules.settings.object_info.particle_mode.gravity").select();
   private final ck.a e = new ck.a(this.c, "modules.settings.object_info.particle_mode.scatter");
   private final ch f = new ch(this, "modules.settings.object_info.debug_mode").enabled(false);
   private final Map<BlockPos, bO.a> g = new ConcurrentHashMap<>();
   private final List<bO.c> h = Collections.synchronizedList(new ArrayList<>());
   private final EventListener<S> i = event -> {
      if (mc.player != null && mc.world != null) {
         if (event.getPacket() instanceof PlaySoundS2CPacket var3) {
            String var4 = ((SoundEvent)var3.getSound().value()).id().toString();
            float var5 = var3.getPitch();
            float var6 = var3.getVolume();
            BlockPos var7 = BlockPos.ofFloored(var3.getX(), var3.getY(), var3.getZ());
            this.a(var4, var5, var6, var7);
         }
      }
   };
   private final EventListener<ad> j = event -> {
      if (mc.player != null && mc.world != null) {
         CustomDrawContext var2 = event.getContext();
         MatrixStack var3 = var2.getMatrices();
         Font var4 = Fonts.MEDIUM.getFont(11.0F);

         for (bO.a var6 : this.g.values()) {
            var6.a(var2, var3, var4, event.getTickDelta());
         }
      }
   };
   private final EventListener<ae> k = event -> {
      if (mc.player != null && mc.world != null) {
         if (!this.g.isEmpty() || !this.h.isEmpty()) {
            MatrixStack var2 = event.getMatrices();
            Camera var3 = event.getCamera();
            Vec3d var4 = var3.getPos();
            var2.push();
            RenderSystem.enableBlend();
            RenderSystem.blendFunc(770, 1);
            RenderSystem.enableDepthTest();
            RenderSystem.disableCull();
            RenderSystem.depthMask(false);
            RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
            RenderSystem.setShaderTexture(0, a);
            Tessellator var5 = Tessellator.getInstance();

            try {
               BufferBuilder var6 = var5.begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
               ArrayList var7 = new ArrayList();

               for (Entry var9 : this.g.entrySet()) {
                  bO.a var10 = (bO.a)var9.getValue();
                  if (var10.c.finished(var10.b.getTime())) {
                     this.a(var10);
                     var7.add((BlockPos)var9.getKey());
                  } else {
                     var10.a(var2, var6, var3, var4);
                  }
               }

               var7.forEach(this.g::remove);
               synchronized (this.h) {
                  Iterator var15 = this.h.iterator();

                  while (var15.hasNext()) {
                     bO.c var16 = (bO.c)var15.next();
                     if (var16.b()) {
                        var15.remove();
                     } else {
                        var16.a();
                        var16.a(var2, var6, var3, var4);
                     }
                  }
               }

               BufferRenderer.drawWithGlobalProgram(var6.end());
            } catch (Exception var13) {
            }

            RenderSystem.depthMask(true);
            RenderSystem.enableCull();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableBlend();
            var2.pop();
         }
      }
   };
   private final EventListener<R> l = event -> {
      this.g.clear();
      this.h.clear();
   };

   @Override
   public void onDisable() {
      super.onDisable();
      this.g.clear();
      this.h.clear();
   }

   private void a(String soundId, float pitch, float volume, BlockPos pos) {
      if (soundId.contains("minecraft:block.anvil.place") && Math.abs(pitch - 1.1F) < 0.05F && Math.abs(volume - 0.7F) < 0.05F) {
         this.g.put(pos, new bO.a(pos.up(), bO.b.PLAST));
      }

      if (soundId.contains("minecraft:entity.wither.break_block") && Math.abs(pitch - 1.0F) < 0.05F && Math.abs(volume - 0.7F) < 0.05F) {
         this.g.put(pos, new bO.a(pos.up(), bO.b.DRAGON));
      }

      if (soundId.contains("minecraft:entity.generic.explode") && Math.abs(pitch - 1.0F) < 0.05F && Math.abs(volume - 1.0F) < 0.05F) {
         this.g.put(pos, new bO.a(pos, bO.b.TRAP));
      }

      if ((soundId.contains("minecraft:block.piston.extend") || soundId.contains("minecraft:block.piston.contract"))
         && Math.abs(pitch - 0.5F) < 0.05F
         && Math.abs(volume - 0.7F) < 0.05F) {
         this.g.put(pos, new bO.a(pos, bO.b.TRAP));
      }
   }

   private void a(bO.a data) {
      if (data.b == bO.b.TRAP) {
         Vec3d var2 = data.a.toCenterPos();
         boolean var3 = this.c.is(this.d);
         float[][] var4 = new float[][]{
            {0.15F, -0.15F, 0.15F, 0.0F, 1.0F, 0.0F},
            {-0.15F, -0.15F, 0.15F, 0.0F, 1.0F, 0.0F},
            {0.15F, -0.15F, -0.15F, 0.0F, 1.0F, 0.0F},
            {-0.15F, -0.15F, -0.15F, 0.0F, 1.0F, 0.0F},
            {-0.15F, 0.15F, 0.15F, 1.0F, 0.0F, 0.0F},
            {-0.15F, -0.15F, 0.15F, 1.0F, 0.0F, 0.0F},
            {-0.15F, 0.15F, -0.15F, 1.0F, 0.0F, 0.0F},
            {-0.15F, -0.15F, -0.15F, 1.0F, 0.0F, 0.0F},
            {0.15F, 0.15F, -0.15F, 0.0F, 0.0F, 1.0F},
            {-0.15F, 0.15F, -0.15F, 0.0F, 0.0F, 1.0F},
            {0.15F, -0.15F, -0.15F, 0.0F, 0.0F, 1.0F},
            {-0.15F, -0.15F, -0.15F, 0.0F, 0.0F, 1.0F}
         };

         for (float[] var8 : var4) {
            for (float var9 = 0.0F; var9 < 3.0F; var9 += 0.02F) {
               float var10 = var8[0] + var9 * var8[3];
               float var11 = var8[1] + var9 * var8[4];
               float var12 = var8[2] + var9 * var8[5];
               float var13 = 0.005F;
               float var14 = (RANDOM.nextFloat() - 0.5F) * 2.0F * var13;
               float var15 = (RANDOM.nextFloat() - 0.5F) * 2.0F * var13;
               float var16 = (RANDOM.nextFloat() - 0.5F) * 2.0F * var13;
               this.h.add(new bO.c(var2, var10, var11, var12, var14, var15, var16, var3));
            }
         }
      }
   }

   static class a {
      final BlockPos a;
      final bO.b b;
      final fO c = new fO();

      @Generated
      a(BlockPos pos, bO.b type) {
         this.a = pos;
         this.b = type;
      }

      void a(CustomDrawContext ctx, MatrixStack matrices, Font font, float tickDelta) {
         long var5 = this.b.getTime() - this.c.getElapsedTime();
         if (var5 > 0L) {
            int var7 = (int)(var5 / 1000L);
            Vec3d var8 = this.a.toCenterPos().add(0.0, 0.5, 0.0);
            Vec2f var9 = fn.worldToScreen(var8);
            if (var9 != null) {
               float var10 = (float)IMinecraft.mc.player.getPos().distanceTo(var8);
               float var11 = MathHelper.clamp(1.0F - var10 / 30.0F, 0.3F, 1.0F);
               String var12 = String.format("0:%02d", var7);
               float var13 = 50.0F;
               float var14 = var9.x - var13 / 2.0F;
               float var15 = var9.y - var13 / 2.0F;
               matrices.push();
               matrices.translate(var14, var15, 0.0F);
               matrices.scale(var11, var11, 1.0F);
               ctx.drawRoundedRect(0.0F, 0.0F, var13, var13, BorderRadius.all(8.0F), eb.BLACK.withAlpha((int)(150.0F * var11)));
               float var16 = 16.0F;
               ctx.drawItem(this.b.getItem(), (var13 - var16) / 2.0F, (var13 - var16) / 2.0F - 4.0F, 1.0F);
               float var17 = font.width(var12);
               ctx.drawText(font, var12, (var13 - var17) / 2.0F, var13 - 14.0F, ec.WHITE.withAlpha((int)(255.0F * var11)));
               matrices.pop();
            }
         }
      }

      void a(MatrixStack matrices, BufferBuilder buffer, Camera camera, Vec3d cameraPos) {
         if (this.b == bO.b.TRAP) {
            float var5 = 0.05F;
            float var6 = 0.125F;
            Vec3d var7 = this.a.toCenterPos().subtract(cameraPos);
            eb var8 = Mytheria.getInstance().getThemeManager().getCurrentTheme().getAdditionalColor();
            float[][] var9 = new float[][]{
               {0.15F, -0.15F, 0.15F, 0.0F, 1.0F, 0.0F},
               {-0.15F, -0.15F, 0.15F, 0.0F, 1.0F, 0.0F},
               {0.15F, -0.15F, -0.15F, 0.0F, 1.0F, 0.0F},
               {-0.15F, -0.15F, -0.15F, 0.0F, 1.0F, 0.0F},
               {-0.15F, 0.15F, 0.15F, 1.0F, 0.0F, 0.0F},
               {-0.15F, -0.15F, 0.15F, 1.0F, 0.0F, 0.0F},
               {-0.15F, 0.15F, -0.15F, 1.0F, 0.0F, 0.0F},
               {-0.15F, -0.15F, -0.15F, 1.0F, 0.0F, 0.0F},
               {0.15F, 0.15F, -0.15F, 0.0F, 0.0F, 1.0F},
               {-0.15F, 0.15F, -0.15F, 0.0F, 0.0F, 1.0F},
               {0.15F, -0.15F, -0.15F, 0.0F, 0.0F, 1.0F},
               {-0.15F, -0.15F, -0.15F, 0.0F, 0.0F, 1.0F}
            };

            for (float[] var13 : var9) {
               for (float var14 = 0.0F; var14 < 3.0F; var14 += 0.02F) {
                  matrices.push();
                  matrices.translate(
                     var7.x + var13[0] + var14 * var13[3],
                     var7.y + var13[1] + var14 * var13[4],
                     var7.z + var13[2] + var14 * var13[5]
                  );
                  matrices.multiply(camera.getRotation());
                  Matrix4f var15 = matrices.peek().getPositionMatrix();
                  this.a(buffer, var15, var5, var8.withAlpha(230.0F));
                  this.a(buffer, var15, var6, var8.withAlpha(25.0F));
                  matrices.pop();
               }
            }
         }
      }

      private void a(BufferBuilder buffer, Matrix4f matrix, float size, eb color) {
         float var5 = size / 2.0F;
         int var6 = color.getRGB();
         buffer.vertex(matrix, -var5, -var5, 0.0F).texture(0.0F, 0.0F).color(var6);
         buffer.vertex(matrix, -var5, var5, 0.0F).texture(0.0F, 1.0F).color(var6);
         buffer.vertex(matrix, var5, var5, 0.0F).texture(1.0F, 1.0F).color(var6);
         buffer.vertex(matrix, var5, -var5, 0.0F).texture(1.0F, 0.0F).color(var6);
      }
   }

   enum b {
      TRAP("modules.object_info.trap", Items.NETHERITE_SCRAP, 15000L),
      DRAGON("modules.object_info.dragon", Items.DRAGON_HEAD, 30000L),
      PLAST("modules.object_info.plast", Items.DRIED_KELP, 20000L);

      private final String a;
      private final Item b;
      private final long c;

      @Generated
      b(String translationKey, Item item, long time) {
         this.a = translationKey;
         this.b = item;
         this.c = time;
      }

      public String getName() {
         return av.translate(this.a);
      }

      public Item getItem() {
         return this.b;
      }

      public long getTime() {
         return this.c;
      }
   }

   class c {
      double a;
      double b;
      double c;
      float d;
      float e;
      float f;
      final long g;
      final float h = 0.05F;
      final float i = 0.125F;
      final float j;
      final long k;
      final boolean l;
      final float m;

      c(Vec3d center, float offsetX, float offsetY, float offsetZ, float vx, float vy, float vz, boolean hasGravity) {
         this.a = center.x + offsetX;
         this.b = center.y + offsetY;
         this.c = center.z + offsetZ;
         this.d = vx;
         this.e = vy;
         this.f = vz;
         this.g = System.currentTimeMillis();
         this.l = hasGravity;
         this.j = 2.0E-4F + bO.RANDOM.nextFloat() * 4.0E-4F;
         this.k = 2000 + bO.RANDOM.nextInt(2000);
         this.m = hasGravity ? 0.9999F : 0.999F;
      }

      void a() {
         if (this.l) {
            this.e = this.e - this.j;
         }

         this.d = this.d * this.m;
         this.e = this.e * this.m;
         this.f = this.f * this.m;
         double var1 = this.a + this.d;
         double var3 = this.b + this.e;
         double var5 = this.c + this.f;
         if (this.l && IMinecraft.mc.world != null) {
            BlockPos var7 = BlockPos.ofFloored(this.a, var3 - 0.5, this.c);
            if (!IMinecraft.mc.world.getBlockState(var7).isAir()) {
               this.e = -this.e * 0.4F;
               var3 = this.b;
            }

            BlockPos var8 = BlockPos.ofFloored(var1, this.b, this.c);
            if (!IMinecraft.mc.world.getBlockState(var8).isAir()) {
               this.d = -this.d * 0.4F;
               var1 = this.a;
            }

            BlockPos var9 = BlockPos.ofFloored(this.a, this.b, var5);
            if (!IMinecraft.mc.world.getBlockState(var9).isAir()) {
               this.f = -this.f * 0.4F;
               var5 = this.c;
            }
         }

         this.a = var1;
         this.b = var3;
         this.c = var5;
      }

      void a(MatrixStack matrices, BufferBuilder buffer, Camera camera, Vec3d cameraPos) {
         matrices.push();
         matrices.translate(this.a - cameraPos.x, this.b - cameraPos.y, this.c - cameraPos.z);
         matrices.multiply(camera.getRotation());
         Matrix4f var5 = matrices.peek().getPositionMatrix();
         eb var6 = Mytheria.getInstance().getThemeManager().getCurrentTheme().getAdditionalColor();
         this.a(buffer, var5, 0.05F, var6.withAlpha(230.0F));
         this.a(buffer, var5, 0.125F, var6.withAlpha(25.0F));
         matrices.pop();
      }

      private void a(BufferBuilder buffer, Matrix4f matrix, float size, eb color) {
         float var5 = size / 2.0F;
         int var6 = color.getRGB();
         buffer.vertex(matrix, -var5, -var5, 0.0F).texture(0.0F, 0.0F).color(var6);
         buffer.vertex(matrix, -var5, var5, 0.0F).texture(0.0F, 1.0F).color(var6);
         buffer.vertex(matrix, var5, var5, 0.0F).texture(1.0F, 1.0F).color(var6);
         buffer.vertex(matrix, var5, -var5, 0.0F).texture(1.0F, 0.0F).color(var6);
      }

      boolean b() {
         return System.currentTimeMillis() - this.g > this.k;
      }
   }
}
