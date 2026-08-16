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
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Font;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.utility.animation.base.Easing;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class cZ extends cP {
   private final dZ a = new dZ(300L, 0.0F, Easing.BAKEK_SIZE);
   private final dZ b = new dZ(300L, 0.0F, Easing.BAKEK);
   private final dZ c = new dZ(300L, 0.0F, Easing.BAKEK);
   private final dZ d = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
   private final dZ e = new dZ(300L, 0.0F, Easing.BAKEK);
   private final dZ f = new dZ(300L, 0.0F, Easing.BAKEK);
   private final dZ g = new dZ(500L, 0.0F, Easing.BAKEK_SIZE);
   private final dZ h = new dZ(150L, 0.0F, Easing.BAKEK);
   private final dZ i = new dZ(50L, 0.0F, Easing.SINE_IN_OUT);
   private final dZ[] j = new dZ[4];
   private LivingEntity k;
   private final fO l = new fO();
   private boolean m;

   public cZ() {
      super("hud.targethud", "icons/hud/target.png");

      for (int var1 = 0; var1 < this.j.length; var1++) {
         this.j[var1] = new dZ(300L, 0.0F, Easing.BAKEK);
      }
   }

   @Override
   public void update(UIContext context) {
      super.update(context);
      this.width = 100.0F;
      this.height = 32.0F;
   }

   @Override
   protected void renderComponent(UIContext context) {
      LivingEntity var2 = this.a();
      if (var2 != null) {
         this.k = var2;
      }

      if (this.k != null) {
         Font var3 = Fonts.REGULAR.getFont(7.0F);
         Font var4 = Fonts.SEMIBOLD.getFont(6.0F);
         boolean var5 = Mytheria.getInstance().getThemeManager().getCurrentTheme() == ct.DARK;
         eb var6 = bJ.getBackgroundColor();
         boolean var7 = er.isHovered(this.x + 30.0F, this.y + 3.0F + 6.0F * this.a.getValue(), 60.0, 6.0, context);
         if (!var7 || this.l.finished(1000L)) {
            this.m = false;
         }

         boolean var8 = et.isLunarClient();
         boolean var9 = this.k.isUsingItem() && this.k.getActiveItem().contains(DataComponentTypes.FOOD);
         this.h.update(var9);
         if (var9) {
            float var10 = (float)Math.sin(System.currentTimeMillis() / 100.0) * 0.5F + 0.5F;
            this.i.setValue(var10);
         }

         this.f.update(var7);
         this.g.update(this.m);
         this.a.update(this.animation.getValue() * this.visible.getValue() >= 1.0F);
         this.b.update((this.k instanceof PlayerEntity var29 ? ee.getHealth(var29) : this.k.getHealth()) / this.k.getMaxHealth());
         this.c.update(this.k.getAbsorptionAmount() / 20.0F);
         float var30 = this.k instanceof PlayerEntity var31 ? ee.getHealth(var31) : this.k.getHealth();
         this.d.update(var30);
         if (this.animation.getValue() != 0.0F) {
            float var32 = RenderSystem.getShaderColor()[3];
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            context.drawItem(Items.DIAMOND_CHESTPLATE, -992.0F, 994.0F, 1.0F);
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var32);
            float var33 = 0.0F;
            boolean var13 = false;
            ItemStack[] var14 = new ItemStack[]{this.k.getMainHandStack(), this.k.getOffHandStack()};

            for (ItemStack var16 : this.k.getArmorItems()) {
               if (!var16.isEmpty()) {
                  var33 += 13.0F;
               }
            }

            float var34 = 11.0F;

            for (ItemStack var19 : var14) {
               if (!var19.isEmpty()) {
                  var33 += 13.0F;
               }
            }

            context.drawShadow(
               this.x - 5.0F,
               this.y - 5.0F,
               this.width + 10.0F,
               this.height + 10.0F,
               15.0F,
               BorderRadius.all(6.0F),
               eb.BLACK.withAlpha(63.75F * this.dragAnim.getValue())
            );
            if (bJ.showGlass() && !var8) {
               context.drawLiquidGlass(
                  this.x,
                  this.y,
                  this.width,
                  this.height,
                  bJ.getGlassBlur(),
                  bJ.getDistortion() - 0.07F * this.dragAnim.getValue(),
                  BorderRadius.all(8.0F),
                  ec.getLiquidGlassColor().withAlpha(255.0F * this.animation.getValue() * bJ.getGlassAlpha())
               );
               context.drawRoundedRect(
                  this.x, this.y, this.width, this.height, BorderRadius.all(8.0F), var6.withAlpha(var6.getAlpha() * (0.8F - 0.6F * bJ.glass()))
               );
            } else {
               if (bJ.showMinimalizm() && !var8) {
                  context.drawBlurredRect(
                     this.x,
                     this.y,
                     this.width,
                     this.height,
                     11.25F,
                     7.0F,
                     BorderRadius.all(8.0F),
                     eb.WHITE.withAlpha(255.0F * this.animation.getValue() * bJ.minimalizm())
                  );
               }

               context.drawRoundedRect(this.x, this.y, this.width, this.height, BorderRadius.all(8.0F), var6);
            }

            float var36 = 255.0F * this.a.getValue();
            fm.push(context.getMatrices(), this.x, this.y, this.width, this.height);
            if (this.k instanceof AbstractClientPlayerEntity var37) {
               context.drawHead(var37, this.x + 4.0F, this.y + 3.5F, 18.0F, BorderRadius.all(2.0F), ec.WHITE.withAlpha(var36));
            } else {
               context.drawRoundedTexture(
                  Mytheria.id(
                     bJ.glassSelected()
                        ? "icons/hud/whoglass.png"
                        : (Mytheria.getInstance().getThemeManager().getCurrentTheme() == ct.DARK ? "icons/hud/whodark.png" : "icons/hud/who.png")
                  ),
                  this.x + 4.0F,
                  this.y + 3.5F,
                  18.0F,
                  18.0F,
                  BorderRadius.all(2.0F),
                  ec.WHITE.withAlpha(var36)
               );
            }

            String var38 = var30 == 1000.0F ? "?" : ej.formatNumber(this.d.getValue()).replace(",", ".");
            boolean var40 = this.k.isInvisible();
            String var41 = var40 ? "Неизвестный" : this.k.getName().getString();
            String var20 = var40 ? "?" : var38;
            context.drawFadeoutText(
               var3,
               var41,
               this.x + 26.0F + 8.0F * this.f.getValue(),
               this.y + 2.0F + 6.0F * this.a.getValue(),
               ec.getTextColor().withAlpha(var36),
               0.7F,
               1.0F,
               this.width - 36.0F - 8.0F * this.f.getValue()
            );
            fl.rotate(context.getMatrices(), this.x + 24.0F + 5.0F * this.f.getValue(), this.y + 5.0F + 6.0F * this.a.getValue(), 90.0F * this.g.getValue());
            context.drawTexture(
               Mytheria.id("icons/hud/copy.png"),
               this.x + 21.0F + 5.0F * this.f.getValue(),
               this.y + 2.0F + 6.0F * this.a.getValue(),
               6.0F,
               6.0F,
               ec.getTextColor().withAlpha(var36 * this.f.getValue() * (1.0F - this.g.getValue()))
            );
            fl.end(context.getMatrices());
            fl.rotate(
               context.getMatrices(), this.x + 24.0F + 5.0F * this.f.getValue(), this.y + 5.0F + 6.0F * this.a.getValue(), -90.0F + 90.0F * this.g.getValue()
            );
            context.drawTexture(
               Mytheria.id("icons/check.png"),
               this.x + 21.0F + 5.0F * this.f.getValue(),
               this.y + 2.0F + 6.0F * this.a.getValue(),
               6.0F,
               6.0F,
               ec.GREEN.withAlpha(var36 * this.f.getValue() * this.g.getValue())
            );
            fl.end(context.getMatrices());
            String var21 = "HP / " + var20;
            context.drawText(var4, var21, this.x + 26.0F, this.y + 11.0F + 6.0F * this.a.getValue(), ec.getTextColor().withAlpha(var36 * 0.7F));
            float var22 = 2.4F;
            float var23 = this.x + 4.0F;
            float var24 = this.y + 25.0F;
            float var25 = 92.0F;
            context.drawRoundedRect(var23, var24, var25, var22, BorderRadius.sides(0.5F), ec.getAdditionalColor().withAlpha(var36 * (1.0F - 0.7F * bJ.glass())));
            float var26 = var25 * Math.clamp(this.b.getValue(), 0.0F, 1.0F);
            eb var27 = ec.getAccentColor();
            context.drawRoundedRect(var23 - 2.0F, var24 - 2.0F, var26 + 4.0F, var22 + 4.0F, BorderRadius.sides(1.5F), var27.withAlpha(var36 * 0.05F));
            context.drawRoundedRect(var23 - 1.5F, var24 - 1.5F, var26 + 3.0F, var22 + 3.0F, BorderRadius.sides(1.25F), var27.withAlpha(var36 * 0.1F));
            context.drawRoundedRect(var23 - 1.0F, var24 - 1.0F, var26 + 2.0F, var22 + 2.0F, BorderRadius.sides(1.0F), var27.withAlpha(var36 * 0.15F));
            context.drawRoundedRect(var23 - 0.5F, var24 - 0.5F, var26 + 1.0F, var22 + 1.0F, BorderRadius.sides(0.75F), var27.withAlpha(var36 * 0.2F));
            eb var28 = ec.getAccentColor();
            context.drawRoundedRect(var23, var24, var26, var22, BorderRadius.sides(0.5F), var28.withAlpha(var36));
            fm.pop();
         }
      }
   }

   private LivingEntity a() {
      Entity var1 = Mytheria.getInstance().getTargetManager().getCurrentTarget();
      LivingEntity var2 = var1 instanceof LivingEntity ? (LivingEntity)var1 : null;
      if (var2 != null) {
         return var2;
      } else if (mc.targetedEntity instanceof LivingEntity var3) {
         return var3;
      } else {
         return mc.currentScreen instanceof ChatScreen ? mc.player : null;
      }
   }

   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      if (er.isHovered(this.x + 30.0F, this.y + 3.0F + 6.0F * this.a.getValue(), 60.0, 6.0, mouseX, mouseY)) {
         ej.copyText(mc.player.getName().getString());
         this.l.reset();
         this.m = true;
      } else {
         super.onMouseClicked(mouseX, mouseY, button);
      }
   }

   @Override
   public boolean show() {
      LivingEntity var1 = this.a();
      return var1 != null && !var1.isInvisible();
   }
}
