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
import nesquik.mytheria.utility.interfaces.IScaledResolution;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.item.ItemStack;

public class cV extends cP {
   public cV() {
      super("hud.hotbar", "icons/hud/hotbar.png");
   }

   @Override
   public void update(UIContext context) {
      boolean var2 = mc.player != null && !mc.player.getOffHandStack().isEmpty();
      float var3 = var2 ? 26.0F : 0.0F;
      float var4 = 194.0F;
      float var5 = var2 ? 8.0F : 0.0F;
      this.width = var3 + var5 + var4;
      this.height = 22.0F;
      if (!(mc.currentScreen instanceof ChatScreen) && !(mc.currentScreen instanceof cO)) {
         float var6 = IScaledResolution.sr.getScaledWidth() / 2.0F;
         float var7 = var6 - var4 / 2.0F;
         this.x = var2 ? var7 - var5 - var3 : var7;
         this.y = IScaledResolution.sr.getScaledHeight() - this.height - 1.0F;
      }

      super.update(context);
   }

   @Override
   protected void renderComponent(UIContext context) {
      if (mc.player != null && mc.world != null) {
         Font var2 = Fonts.SEMIBOLD.getFont(5.5F);
         boolean var3 = Mytheria.getInstance().getThemeManager().getCurrentTheme() == ct.DARK;
         eb var4 = bJ.getBackgroundColor();
         float var5 = 20.0F;
         float var6 = 20.0F;
         float var7 = 1.0F;
         float var8 = 3.0F;
         float var9 = 1.5F;
         float var10 = 3.0F;
         ItemStack var11 = mc.player.getOffHandStack();
         boolean var12 = !var11.isEmpty();
         float var13 = var5 + var10 * 2.0F;
         float var14 = this.x;
         float var15 = 9.0F * var5 + 8.0F * var7 + 6.0F;
         float var16 = var12 ? var14 + var13 + 8.0F : this.x;
         float var17 = var14 + var10;
         float var18 = var16 + var8;
         float var19 = this.y + var9;
         if (var12) {
            context.drawShadow(
               var14 - 5.0F,
               this.y - 5.0F,
               var13 + 10.0F,
               this.height + 10.0F,
               15.0F,
               BorderRadius.all(6.0F),
               eb.BLACK.withAlpha(63.75F * this.dragAnim.getValue())
            );
            if (bJ.showMinimalizm()) {
               context.drawBlurredRect(
                  var14,
                  this.y,
                  var13,
                  this.height,
                  11.25F,
                  7.0F,
                  BorderRadius.all(6.0F),
                  eb.WHITE.withAlpha(255.0F * this.animation.getValue() * bJ.minimalizm())
               );
            }

            if (bJ.showGlass()) {
               context.drawLiquidGlass(
                  var14,
                  this.y,
                  var13,
                  this.height,
                  7.0F,
                  bJ.getDistortion() - 0.07F * this.dragAnim.getValue(),
                  BorderRadius.all(6.0F),
                  ec.getLiquidGlassColor().withAlpha(255.0F * this.animation.getValue() * bJ.glass())
               );
            }

            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            context.drawRoundedRect(var14, this.y, var13, this.height, BorderRadius.all(6.0F), var4);
            float var20 = 0.85F;
            float var21 = 16.0F * var20;
            float var22 = (var5 - var21) / 2.0F;
            float var23 = (var6 - var21) / 2.0F;
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            context.drawItem(var11, var17 + var22, var19 + var23, var20);
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         }

         context.drawShadow(
            var16 - 5.0F,
            this.y - 5.0F,
            var15 + 10.0F,
            this.height + 10.0F,
            15.0F,
            BorderRadius.all(6.0F),
            eb.BLACK.withAlpha(63.75F * this.dragAnim.getValue())
         );
         if (bJ.showMinimalizm()) {
            context.drawBlurredRect(
               var16,
               this.y,
               var15,
               this.height,
               11.25F,
               7.0F,
               BorderRadius.all(6.0F),
               eb.WHITE.withAlpha(255.0F * this.animation.getValue() * bJ.minimalizm())
            );
         }

         if (bJ.showGlass()) {
            context.drawLiquidGlass(
               var16,
               this.y,
               var15,
               this.height,
               7.0F,
               bJ.getDistortion() - 0.07F * this.dragAnim.getValue(),
               BorderRadius.all(6.0F),
               ec.getLiquidGlassColor().withAlpha(255.0F * this.animation.getValue() * bJ.glass())
            );
         }

         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         context.drawRoundedRect(var16, this.y, var15, this.height, BorderRadius.all(6.0F), var4);
         int var30 = mc.player.getInventory().selectedSlot;
         float var31 = var18 + var30 * (var5 + var7);
         float var32 = 0.5F;
         context.drawRoundedRect(var31 + var32, var19 + var32, var5 - var32 * 2.0F, var6 - var32 * 2.0F, BorderRadius.all(4.5F), eb.BLACK.withAlpha(80.0F));

         for (int var33 = 0; var33 < 9; var33++) {
            ItemStack var24 = mc.player.getInventory().getStack(var33);
            if (!var24.isEmpty()) {
               float var25 = var18 + var33 * (var5 + var7);
               float var26 = 0.85F;
               float var27 = 16.0F * var26;
               float var28 = (var5 - var27) / 2.0F;
               float var29 = (var6 - var27) / 2.0F;
               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
               context.drawItem(var24, var25 + var28, var19 + var29, var26);
               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            }
         }

         context.flushItems();
         if (var12 && var11.getCount() > 1) {
            String var34 = String.valueOf(var11.getCount());
            Font var36 = Fonts.REGULAR.getFont(6.0F);
            float var38 = var17 + var5 - var36.width(var34) - 2.0F;
            float var40 = var19 + var6 - var36.height() - 1.0F;
            context.drawText(var36, var34, var38 + 0.5F, var40 + 0.5F, eb.BLACK.withAlpha(150.0F));
            context.drawText(var36, var34, var38, var40, eb.WHITE);
         }

         for (int var35 = 0; var35 < 9; var35++) {
            ItemStack var37 = mc.player.getInventory().getStack(var35);
            if (!var37.isEmpty() && var37.getCount() > 1) {
               float var39 = var18 + var35 * (var5 + var7);
               String var41 = String.valueOf(var37.getCount());
               Font var42 = Fonts.REGULAR.getFont(6.0F);
               float var43 = var39 + var5 - var42.width(var41) - 2.0F;
               float var44 = var19 + var6 - var42.height() - 1.0F;
               context.drawText(var42, var41, var43 + 0.5F, var44 + 0.5F, eb.BLACK.withAlpha(150.0F));
               context.drawText(var42, var41, var43, var44, eb.WHITE);
            }
         }

         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean show() {
      if (mc.player == null || mc.world == null) {
         return false;
      } else {
         return mc.currentScreen instanceof ChatScreen || mc.currentScreen instanceof cO ? true : mc.currentScreen == null;
      }
   }
}
