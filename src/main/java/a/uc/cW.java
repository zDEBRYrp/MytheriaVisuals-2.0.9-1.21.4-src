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

import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Font;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.utility.animation.base.Easing;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.item.ItemStack;

public class cW extends cP {
   private final ch a = new ch(this, "hud.always_display");
   private final dZ b = new dZ(300L, 0.0F, Easing.BAKEK_SIZE);
   private final dZ[][] c = new dZ[3][9];

   public cW() {
      super("hud.inventory", "icons/hud/inventory.png");

      for (int var1 = 0; var1 < 3; var1++) {
         for (int var2 = 0; var2 < 9; var2++) {
            this.c[var1][var2] = new dZ(300L, 0.0F, Easing.BAKEK);
         }
      }
   }

   @Override
   public void update(UIContext context) {
      if (mc.player == null) {
         super.update(context);
      } else {
         byte var2 = 3;
         this.width = 147.0F;
         this.height = 24.0F + var2 * 13.0F + (var2 - 1) * 2.0F + 7.0F;
         super.update(context);
      }
   }

   @Override
   protected void renderComponent(UIContext context) {
      if (mc.player != null) {
         this.b.update(this.animation.getValue() * this.visible.getValue() >= 1.0F);
         Font var2 = Fonts.MEDIUM.getFont(7.0F);
         boolean var3 = Mytheria.getInstance().getThemeManager().getCurrentTheme() == ct.DARK;
         eb var4 = bJ.getBackgroundColor();
         boolean var5 = bJ.showGlass();
         if (this.animation.getValue() != 0.0F) {
            float var6 = this.animation.getValue();
            float var7 = this.b.getValue();
            if (var5) {
               context.drawLiquidGlass(
                  this.x,
                  this.y,
                  this.width,
                  this.height,
                  bJ.getGlassBlur(),
                  bJ.getDistortion(),
                  BorderRadius.all(7.0F),
                  ec.getLiquidGlassColor().withAlpha(255.0F * var6 * bJ.getGlassAlpha())
               );
               context.drawRoundedRect(
                  this.x, this.y, this.width, this.height, BorderRadius.all(7.0F), var4.withAlpha(var4.getAlpha() * (0.8F - 0.6F * bJ.glass()) * var6)
               );
            } else {
               context.drawRoundedRect(this.x, this.y, this.width, this.height, BorderRadius.all(7.0F), var4.withAlpha(var4.getAlpha() * var6));
            }

            float var8 = 18.0F;
            Font var9 = Fonts.MEDIUM.getFont(8.0F);
            String var10 = "Inventory";
            float var11 = var9.width(var10);
            float var12 = this.x + (this.width - var11) / 2.0F;
            context.drawText(var9, var10, var12, this.y + er.getMiddleOfBox(var2.height(), var8) + 0.5F, ec.getTextColor().withAlpha(255.0F * var6));
            if (var7 > 0.0F) {
               context.drawRect(this.x, this.y + 18.0F, this.width, 0.5F, ec.getTextColor().withAlpha(30.0F * var7 * var6));
            }

            float var13 = this.x + 7.0F;
            float var14 = this.y + 18.0F + 7.0F;
            float var15 = 13.0F;
            float var16 = 2.0F;

            for (int var17 = 0; var17 < 3; var17++) {
               for (int var18 = 0; var18 < 9; var18++) {
                  int var19 = 9 + var17 * 9 + var18;
                  ItemStack var20 = mc.player.getInventory().getStack(var19);
                  boolean var21 = !var20.isEmpty();
                  this.c[var17][var18].update(var21);
                  float var22 = this.c[var17][var18].getValue();
                  if (var22 > 0.0F && var21) {
                     float var23 = var13 + var18 * (var15 + var16);
                     float var24 = var14 + var17 * (var15 + var16);
                     float var25 = 0.65F;
                     context.drawItem(var20, var23 + 0.5F, var24 + 0.5F, var25);
                  }
               }
            }

            context.flushItems();

            for (int var26 = 0; var26 < 3; var26++) {
               for (int var28 = 0; var28 < 9; var28++) {
                  int var30 = 9 + var26 * 9 + var28;
                  ItemStack var32 = mc.player.getInventory().getStack(var30);
                  float var34 = this.c[var26][var28].getValue();
                  if (var34 > 0.0F && !var32.isEmpty() && var32.getCount() > 1) {
                     float var35 = var13 + var28 * (var15 + var16);
                     float var36 = var14 + var26 * (var15 + var16);
                     String var37 = String.valueOf(var32.getCount());
                     Font var38 = Fonts.MEDIUM.getFont(6.0F);
                     context.drawText(
                        var38,
                        var37,
                        var35 + var15 - var38.width(var37) - 1.0F,
                        var36 + var15 - var38.height() - 0.5F,
                        ec.WHITE.withAlpha(255.0F * var34 * var7 * var6)
                     );
                  }
               }
            }

            if (this.height > 23.0F) {
               float var27 = this.width * 0.5F;
               float var29 = 1.5F;
               float var31 = this.x + (this.width - var27) / 2.0F;
               float var33 = this.y + this.height - var29 - 0.0F;
               context.drawRoundedRect(var31, var33, var27, var29, BorderRadius.all(1.25F), eb.WHITE);
            }
         }
      }
   }

   @Override
   public boolean show() {
      if (mc.player == null) {
         return false;
      }

      if (!(mc.currentScreen instanceof ChatScreen) && !(mc.currentScreen instanceof cO)) {
         if (this.a.isEnabled()) {
            return true;
         }

         for (int var1 = 9; var1 < 36; var1++) {
            if (!mc.player.getInventory().getStack(var1).isEmpty()) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }
}
