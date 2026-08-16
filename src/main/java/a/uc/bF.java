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
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.joml.Quaternionf;
import org.joml.Vector3f;

@ModuleInfo(name = "Friend Marker", category = ax.VISUALS, desc = "modules.descriptions.friend_marker")
public class bF extends aJ {
   private final cj a = new cj(this, "Цвет кристалла").color(ec.ACCENT);
   private final EventListener<ae> b = event -> {
      if (mc.world != null && mc.player != null) {
         MatrixStack var2 = event.getMatrices();
         var2.push();
         RenderSystem.enableBlend();
         RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE);
         RenderSystem.enableDepthTest();
         RenderSystem.disableCull();
         RenderSystem.depthMask(false);

         for (PlayerEntity var4 : mc.world.getPlayers()) {
            if (var4 != mc.player && Mytheria.getInstance().getFriendManager().isFriend(var4.getName().getString()) && this.a(var4)) {
               this.a(var2, var4);
            }
         }

         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, 0);
         RenderSystem.disableBlend();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
         var2.pop();
      }
   };

   private boolean a(PlayerEntity player) {
      if (mc.player != null && mc.world != null) {
         Vec3d var2 = mc.player.getEyePos();
         Vec3d var3 = player.getEyePos();
         return mc.world.raycast(new RaycastContext(var2, var3, ShapeType.COLLIDER, FluidHandling.NONE, mc.player)).getType()
            == Type.MISS;
      } else {
         return false;
      }
   }

   private void a(MatrixStack ms, PlayerEntity player) {
      Camera var3 = mc.gameRenderer.getCamera();
      eb var4 = this.a.getColor();
      fl.prepareMatrices(ms, this.b(player));
      BufferBuilder var5 = fg.createBuffer();
      ms.push();
      ms.translate(0.0, player.getHeight() + 0.5, 0.0);
      float var6 = (float)(System.currentTimeMillis() % 3600L) / 10.0F;
      ms.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var6));
      Vec3d var7 = this.b(player).add(0.0, player.getHeight() + 0.5, 0.0);
      Vec3d var8 = player.getPos().add(0.0, player.getHeight() / 2.0, 0.0);
      Vector3f var9 = new Vector3f(
            (float)(var8.x - var7.x), (float)(var8.y - var7.y), (float)(var8.z - var7.z)
         )
         .normalize();
      Vector3f var10 = new Vector3f(0.0F, 1.0F, 0.0F);
      Quaternionf var11 = new Quaternionf().rotationTo(var10, var9);
      ms.multiply(var11);
      float var12 = 0.15F;
      fg.render(ms, var5, 0.0F, 0.0F, 0.0F, var12, var4.withAlpha(255.0F));
      ms.pop();
      BufferRenderer.drawWithGlobalProgram(var5.end());
      Identifier var13 = Mytheria.id("textures/bloom.png");
      RenderSystem.setShaderTexture(0, var13);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      BufferBuilder var14 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      float var15 = 1.0F;
      ms.push();
      ms.translate(0.0, player.getHeight() + 0.5, 0.0);
      ms.multiply(var3.getRotation());
      fj.drawImage(ms, var14, -var15 / 2.0F, -var15 / 2.0F, 0.0, var15, var15, var4.withAlpha(76.5F));
      ms.pop();
      fl.buildBuffer(var14);
   }

   private Vec3d b(PlayerEntity player) {
      float var2 = MinecraftClient.getInstance().getRenderTickCounter().getTickDelta(false);
      return new Vec3d(
         MathHelper.lerp(var2, player.prevX, player.getX()),
         MathHelper.lerp(var2, player.prevY, player.getY()),
         MathHelper.lerp(var2, player.prevZ, player.getZ())
      );
   }
}
