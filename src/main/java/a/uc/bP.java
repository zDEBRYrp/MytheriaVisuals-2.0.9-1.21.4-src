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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.CustomDrawContext;
import nesquik.mytheria.framework.msdf.Font;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.entity.projectile.thrown.PotionEntity;
import net.minecraft.entity.projectile.thrown.SnowballEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.EnderPearlItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.TridentItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;

@ModuleInfo(name = "Prediction", category = ax.VISUALS)
public class bP extends aJ {
   private final List<bP.b> a = new ArrayList<>();
   private final List<bP.a> b = new ArrayList<>();
   private final cn c = new cn(this, "modules.settings.prediction.entities");
   private final ck d = new ck(this, "modules.settings.prediction.render_mode");
   private final ck.a e = new ck.a(this.d, "modules.settings.prediction.render_mode.default");
   private final ck.a f = new ck.a(this.d, "modules.settings.prediction.render_mode.glow").select();
   private final ch g = new ch(this, "modules.settings.prediction.hand").enable();
   private final EventListener<ab> h = event -> {
      CustomDrawContext var2 = event.getContext();
      MatrixStack var3 = var2.getMatrices();

      for (bP.b var5 : this.a) {
         Vec2f var6 = fn.worldToScreen(var5.b.getLast());
         if (var6 != null) {
            float var7 = var6.x;
            float var8 = var6.y;
            Font var9 = Fonts.MEDIUM.getFont(13.0F);
            float var10 = var9.height() + 6.0F;
            float var11 = -var10;
            String var12 = var5.a.getName().getString().replace("Брошенный эндер-жемчуг", "Эндер-жемчуг");
            if (var5.a instanceof PotionEntity var13) {
               var12 = var13.getStack().getFormattedName().getString();
            }

            var12 = var12.replace("] ", "").replace("[", "") + String.format(" (%s сек)", ej.formatNumber(var5.c / 20.0F));

            ItemStack var29 = switch (var5.a) {
               case ThrownItemEntity var16 -> var16.getStack();
               case PersistentProjectileEntity var17 -> var17.getItemStack();
               case ItemEntity var18 -> var18.getStack();
               default -> Items.ARROW.getDefaultStack();
            };
            float var31 = (float)var5.b.getLast().distanceTo(mc.player.getEyePos());
            float var32 = MathHelper.clamp(1.0F - var31 / 20.0F, 0.5F, 1.0F);
            var3.push();
            var3.translate(var7, var8, 0.0F);
            var3.scale(var32, var32, 1.0F);
            float var33 = var9.width(var12) + 20.0F;
            var2.drawRect(-var33 / 2.0F, var11, var33, var10, new eb(0.0F, 0.0F, 0.0F, 100.0F));
            var2.drawItem(var29, -var33 / 2.0F, var11, 1.0F);
            var2.drawText(var9, var12, -var33 / 2.0F + 17.0F, var11 + 3.0F, ec.WHITE);
            var11 += var10;
            if (var5.a instanceof ProjectileEntity var34 && var34.getOwner() instanceof AbstractClientPlayerEntity var36) {
               String var40 = "От " + (var34.getOwner() == mc.player ? "Вас" : var34.getOwner().getName().getString());
               float var20 = var9.width(var40) + 22.0F;
               var2.drawRect(-var20 / 2.0F, var11, var20, var10, new eb(0.0F, 0.0F, 0.0F, 100.0F));
               var2.drawHead(var36, -var20 / 2.0F, var11, var10, BorderRadius.ZERO, ec.WHITE);
               var2.drawText(var9, var40, -var20 / 2.0F + 19.0F, var11 + 3.0F, ec.WHITE);
               var11 += var10;
            }

            if (var5.a instanceof PotionEntity var35) {
               for (StatusEffectInstance var41 : eh.effects(var35.getStack())) {
                  String var42 = ((StatusEffect)var41.getEffectType().value()).getName().getString();
                  int var21 = var41.getAmplifier();
                  int var22 = var41.getDuration();
                  String var23 = var21 > 0 ? " " + (var21 + 1) : "";
                  String var24 = this.a(var22);
                  String var25 = var42 + var23 + " (" + var24 + ")";
                  float var26 = var9.width(var25) + 6.0F;
                  var2.drawRect(-var26 / 2.0F, var11 + 5.0F, var26, var10, new eb(0.0F, 0.0F, 0.0F, 100.0F));
                  var2.drawText(
                     var9,
                     var25,
                     -var26 / 2.0F + 3.0F,
                     var11 + 8.0F,
                     eb.fromInt(((StatusEffect)var41.getEffectType().value()).getColor()).withAlpha(255.0F)
                  );
                  var11 += var10;
               }
            }

            var3.pop();
         }
      }
   };
   private final EventListener<ae> i = event -> {
      MatrixStack var2 = event.getMatrices();
      var2.push();
      fl.setupRender3D(true);
      fl.prepareMatrices(var2);
      RenderSystem.enableDepthTest();
      if (this.e.isSelected()) {
         RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
         BufferBuilder var3 = RenderSystem.renderThreadTesselator().begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);

         for (bP.b var5 : this.a) {
            Vec3d var6 = var5.b.getFirst();
            fi.drawLine(var2, var3, fn.getInterpolatedPos(var5.a, event.getTickDelta()), var6, ec.getAccentColor());

            for (Vec3d var8 : var5.b) {
               fi.drawLine(var2, var3, var6, var8, ec.getAccentColor());
               var6 = var8;
            }
         }

         fl.buildBuffer(var3);
      } else {
         Identifier var14 = Mytheria.id("textures/bloom.png");
         RenderSystem.setShaderTexture(0, var14);
         RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
         BufferBuilder var16 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);

         for (bP.b var20 : this.a) {
            Vec3d var23 = var20.b.getFirst();
            Vec3d var26 = fn.getInterpolatedPos(var20.a, event.getTickDelta());
            if (var26.distanceTo(mc.player.getEyePos()) > 2.0) {
               for (int var9 = 0; var9 < 10; var9++) {
                  float var10 = var9 / 10.0F;
                  Vec3d var11 = var26.add(var23.subtract(var26).multiply(var10));
                  this.a(var2, var11, var16, (float)var23.distanceTo(var26) / 3.0F, 1.0F);
                  this.a(var2, var11, var16, (float)var23.distanceTo(var26) * 2.0F, 0.05F);
               }
            }

            for (Vec3d var32 : var20.b) {
               if (var32.distanceTo(mc.player.getEyePos()) > 2.0) {
                  for (int var35 = 0; var35 < 10; var35++) {
                     float var12 = var35 / 10.0F;
                     Vec3d var13 = var23.add(var32.subtract(var23).multiply(var12));
                     this.a(var2, var13, var16, (float)var32.distanceTo(var23) / 3.0F, 1.0F);
                     this.a(var2, var13, var16, (float)var32.distanceTo(var23) * 2.0F, 0.05F);
                  }
               }

               var23 = var32;
            }

            float var29 = 9.0F;
            if (var20.a instanceof PotionEntity) {
               var2.push();
               var2.translate(var20.b.getLast());
               var2.multiply(RotationAxis.NEGATIVE_X.rotationDegrees(-90.0F));
               fj.drawImage(var2, var16, -var29 / 2.0F, -var29 / 2.0F, 0.0, var29, var29, ec.getAccentColor().withAlpha(255.0F));
               var2.pop();
            }
         }

         fl.buildBuffer(var16);
      }

      float var15 = 1.0F;
      Identifier var17 = Mytheria.id("textures/hit.png");
      RenderSystem.setShaderTexture(0, var17);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      BufferBuilder var19 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);

      for (bP.a var24 : this.b) {
         if (var24.d == null) {
            var2.push();
            var2.translate(var24.e.getPos());
            var2.multiply(var24.e.getSide().getRotationQuaternion());
            var2.multiply(RotationAxis.NEGATIVE_X.rotationDegrees(-90.0F));
            fj.drawImage(var2, var19, -var15 / 2.0F, -var15 / 2.0F, 0.0, var15, var15, ec.getAccentColor().withAlpha(255.0F));
            var2.pop();
         }
      }

      fl.buildBuffer(var19);
      RenderSystem.enableBlend();
      RenderSystem.disableDepthTest();
      RenderSystem.disableCull();
      RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      Camera var22 = mc.gameRenderer.getCamera();
      Vec3d var25 = var22.getPos();
      BufferBuilder var27 = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);

      for (bP.a var33 : this.b) {
         if (var33.d != null && !(var33.d instanceof PlayerEntity var36 && (var36.isInvisible() || var36.isInvisibleTo(mc.player) || var36.isSpectator()))) {
            fi.renderFilledBox(var2, var27, var33.d.getBoundingBox(), ec.getAccentColor().mulAlpha(0.5F));
         }
      }

      fl.buildBuffer(var27);
      BufferBuilder var31 = RenderSystem.renderThreadTesselator().begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);

      for (bP.a var37 : this.b) {
         if (var37.d != null && !(var37.d instanceof PlayerEntity var39 && (var39.isInvisible() || var39.isInvisibleTo(mc.player) || var39.isSpectator()))) {
            fi.renderOutlinedBox(var2, var31, var37.d.getBoundingBox(), ec.getAccentColor());
         }
      }

      fl.buildBuffer(var31);
      fl.endRender3D();
      var2.pop();
   };

   public bP() {
      new cp<Entity>(this.c, "modules.settings.prediction.entities.pearls", entity -> entity instanceof EnderPearlEntity).select();
      new cp<Entity>(this.c, "modules.settings.prediction.entities.tridents", entity -> entity instanceof TridentEntity).select();
      new cp<Entity>(this.c, "modules.settings.prediction.entities.snowballs", entity -> entity instanceof SnowballEntity).select();
      new cp<Entity>(this.c, "modules.settings.prediction.entities.arrows", entity -> entity instanceof ArrowEntity).select();
      new cp<Entity>(this.c, "modules.settings.prediction.entities.potions", entity -> entity instanceof PotionEntity).select();
      new cp<>(this.c, "modules.settings.prediction.entities.items", entity -> entity instanceof ItemEntity);
   }

   @Override
   public void tick() {
      this.a.clear();
      this.b.clear();
      ArrayList var1 = new ArrayList();
      if (this.g.isEnabled()) {
         ItemStack var2 = mc.player.getMainHandStack();
         Object var3 = null;
         if (var2.getItem() instanceof EnderPearlItem) {
            var3 = new EnderPearlEntity(mc.world, mc.player, var2);
         } else if (var2.getItem() instanceof TridentItem && mc.player.isUsingItem()) {
            var3 = new TridentEntity(mc.world, mc.player, var2);
         } else if (var2.getItem() instanceof BowItem && mc.player.isUsingItem()) {
            ItemStack var12 = new ItemStack(Items.ARROW);
            var3 = new ArrowEntity(mc.world, mc.player, var12, var2);
         } else if (var2.getItem() instanceof CrossbowItem && CrossbowItem.isCharged(var2)) {
            boolean var4 = ev.getEnchantmentLevel(var2, Enchantments.MULTISHOT) > 0;
            ItemStack var5 = new ItemStack(Items.ARROW);
            if (var4) {
               for (int var6 = 0; var6 < 3; var6++) {
                  ArrowEntity var7 = new ArrowEntity(mc.world, mc.player, var5, var2);
                  var1.add(var7);
               }
            } else {
               var3 = new ArrowEntity(mc.world, mc.player, var5, var2);
            }
         }

         if (var3 instanceof ProjectileEntity var13) {
            float var15 = 1.5F;
            if (var3 instanceof TridentEntity) {
               var15 = 2.5F;
            } else if (var3 instanceof ArrowEntity) {
               var15 = 3.0F;
            }

            this.a(var13, mc.player, mc.player.getPitch(), mc.player.getYaw(), 0.0F, var15, 1.0F);
            this.a(var13, true);
         }
      }

      if (!var1.isEmpty()) {
         float var8 = 3.15F;
         float var10 = 10.0F;

         for (int var14 = 0; var14 < var1.size(); var14++) {
            ProjectileEntity var16 = (ProjectileEntity)var1.get(var14);
            float var17 = 0.0F;
            if (var14 == 0) {
               var17 = -var10;
            } else if (var14 == 2) {
               var17 = var10;
            }

            this.a(var16, mc.player, mc.player.getPitch(), mc.player.getYaw() + var17, 0.0F, var8, 1.0F);
            this.a(var16, true);
         }
      }

      for (Entity var11 : mc.world.getEntities()) {
         this.a(var11, false);
      }
   }

   private void a(Entity entity, boolean inHand) {
      if (!(!inHand && entity instanceof ProjectileEntity var3) || var3.getOwner() == mc.player) {
         if (this.a(entity)) {
            if (entity instanceof ProjectileEntity var13 && var13.getOwner() == null) {
               List<AbstractClientPlayerEntity> var4 = mc.world.getPlayers();
               if (!var4.isEmpty()) {
                  Collections.sort(var4, Comparator.comparingDouble(player -> player.distanceTo(var13)));
                  var13.setOwner((Entity)var4.getFirst());
               }
            }

            ArrayList var14 = new ArrayList();
            Vec3d var15 = entity.getPos();
            Vec3d var5 = entity.getVelocity();
            Entity var6 = null;
            int var7 = 0;
            BlockHitResult var8 = null;

            for (int var9 = 0; var9 < 150; var9++) {
               Vec3d var10 = this.b(entity, var5);
               Vec3d var11 = var15.add(var10);
               var7 = var9;
               var8 = mc.world.raycast(new RaycastContext(var15, var11, ShapeType.COLLIDER, FluidHandling.NONE, entity));
               Entity var12 = this.a(entity, var11);
               if (var12 != null) {
                  var14.add(var11);
                  var6 = var12;
                  break;
               }

               if (var8.getType() != Type.MISS) {
                  var14.add(var8.getPos());
                  break;
               }

               var14.add(var11);
               var15 = var11;
               var5 = var10;
            }

            if (!var14.isEmpty()) {
               if (inHand) {
                  this.b.add(new bP.a(entity, (Vec3d)var14.getLast(), var7, var6, var8));
               } else {
                  this.a.add(new bP.b(entity, var14, var7, var6));
               }
            }
         }
      }
   }

   private void a(MatrixStack ms, Vec3d pos, BufferBuilder buffer, float size, float alpha) {
      ms.push();
      ms.translate(pos);
      ms.multiply(mc.gameRenderer.getCamera().getRotation());
      fj.drawImage(ms, buffer, -size / 2.0F, -size / 2.0F, 0.0, size, size, ec.getAccentColor().withAlpha(255.0F * alpha));
      ms.pop();
   }

   private boolean a(Entity entity) {
      boolean var2 = false;

      for (cn.a var4 : this.c.getSelectedValues()) {
         cp var5 = (cp)var4;
         if (var5.predicated(entity)) {
            var2 = true;
         }
      }

      return entity instanceof TridentEntity var6 && var6.returnTimer > 0
         ? false
         : var2 && (Math.abs(entity.getVelocity().x + entity.getVelocity().z) > 0.01F || Math.abs(entity.getVelocity().y) > 0.2F);
   }

   private Entity a(Entity movingEntity, Vec3d predictedPos) {
      Vec3d var3 = movingEntity.getPos();
      Vec3d var4 = predictedPos.subtract(var3);
      if (var4.lengthSquared() == 0.0) {
         return null;
      }

      EntityHitResult var5 = ProjectileUtil.raycast(
         movingEntity,
         var3,
         predictedPos,
         movingEntity.getBoundingBox().stretch(var4).expand(0.5),
         entity -> mc.player == entity
               || !entity.isAlive()
               || entity instanceof ItemEntity
               || entity instanceof ExperienceOrbEntity
               || entity == movingEntity
            ? false
            : !entity.isInvisible() && !(entity instanceof PlayerEntity var2 && (var2.isInvisibleTo(mc.player) || var2.isSpectator())),
         var4.lengthSquared()
      );
      return var5 != null ? var5.getEntity() : null;
   }

   private void a(ProjectileEntity entity, double x, double y, double z, float power) {
      Vec3d var9 = this.b(entity, x, y, z, power);
      entity.setVelocity(var9);
      entity.velocityDirty = true;
      double var10 = var9.horizontalLength();
      entity.setYaw((float)(MathHelper.atan2(var9.x, var9.z) * 180.0 / (float) Math.PI));
      entity.setPitch((float)(MathHelper.atan2(var9.y, var10) * 180.0 / (float) Math.PI));
      entity.prevYaw = entity.getYaw();
      entity.prevPitch = entity.getPitch();
   }

   private void a(ProjectileEntity entity, Entity shooter, float pitch, float yaw, float roll, float speed, float divergence) {
      float var8 = -MathHelper.sin(yaw * (float) (Math.PI / 180.0)) * MathHelper.cos(pitch * (float) (Math.PI / 180.0));
      float var9 = -MathHelper.sin((pitch + roll) * (float) (Math.PI / 180.0));
      float var10 = MathHelper.cos(yaw * (float) (Math.PI / 180.0)) * MathHelper.cos(pitch * (float) (Math.PI / 180.0));
      this.a(entity, var8, var9, var10, speed);
      Vec3d var11 = shooter.getMovement();
      entity.setVelocity(entity.getVelocity().add(var11.x, shooter.isOnGround() ? 0.0 : var11.y, var11.z));
   }

   private Vec3d b(ProjectileEntity entity, double x, double y, double z, float power) {
      return new Vec3d(x, y, z).normalize().multiply(power);
   }

   private Vec3d b(Entity entity, Vec3d motion) {
      return motion.multiply(0.99).add(0.0, -entity.getFinalGravity(), 0.0);
   }

   private String a(int ticks) {
      int var2 = ticks / 20;
      int var3 = var2 / 60;
      int var4 = var2 % 60;
      return var3 > 0 ? String.format("%d:%02d", var3, var4) : String.format("0:%02d", var4);
   }

   record a(Entity a, Vec3d b, int c, Entity d, BlockHitResult e) {

      a(Entity a, Vec3d b, int c, Entity d, BlockHitResult e) {
         this.a = a;
         this.b = b;
         this.c = c;
         this.d = d;
         this.e = e;
      }

      public Entity entity() {
         return this.a;
      }

      public Vec3d pos() {
         return this.b;
      }

      public int ticks() {
         return this.c;
      }

      public Entity collidedEntity() {
         return this.d;
      }

      public BlockHitResult hitResult() {
         return this.e;
      }
   }

   record b(Entity a, List<Vec3d> b, int c, Entity d) {

      b(Entity a, List<Vec3d> b, int c, Entity d) {
         this.a = a;
         this.b = b;
         this.c = c;
         this.d = d;
      }

      public Entity entity() {
         return this.a;
      }

      public List<Vec3d> vectors() {
         return this.b;
      }

      public int ticks() {
         return this.c;
      }

      public Entity collidedEntity() {
         return this.d;
      }
   }
}
