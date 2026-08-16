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
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.item.ItemStack;

public class cS extends cP {
   private final ch a = new ch(this, "hud.always_display").enabled(true);
   private final ck b = new ck(this, "hud.armor.direction");
   private final ck.a c = new ck.a(this.b, "hud.armor.horizontal").select();
   private final ck.a d = new ck.a(this.b, "hud.armor.vertical");

   public cS() {
      super("hud.armor", "icons/hud/armor.png");
   }

   @Override
   public void update(UIContext context) {
      if (this.b.is(this.c)) {
         this.width = 81.0F;
         this.height = 15.0F;
      } else {
         this.width = 18.0F;
         this.height = 69.0F;
      }

      super.update(context);
   }

   @Override
   protected void renderComponent(UIContext context) {
      if (mc.player != null && mc.world != null) {
         Font var2 = Fonts.SEMIBOLD.getFont(5.5F);
         boolean var3 = Mytheria.getInstance().getThemeManager().getCurrentTheme() == ct.DARK;
         eb var4 = bJ.getBackgroundColor();
         float var5 = 18.0F;
         float var6 = 15.0F;
         float var7 = 3.0F;
         boolean var8 = this.b.is(this.c);
         ItemStack[] var9 = new ItemStack[4];

         for (int var10 = 0; var10 < 4; var10++) {
            var9[var10] = mc.player.getInventory().getArmorStack(3 - var10);
         }

         for (int var24 = 0; var24 < 4; var24++) {
            ItemStack var11 = var9[var24];
            float var12;
            float var13;
            if (var8) {
               var12 = this.x + var24 * (var5 + var7);
               var13 = this.y;
            } else {
               var12 = this.x;
               var13 = this.y + var24 * (var6 + var7);
            }

            context.drawShadow(
               var12 - 5.0F, var13 - 5.0F, var5 + 10.0F, var6 + 10.0F, 15.0F, BorderRadius.all(4.0F), eb.BLACK.withAlpha(63.75F * this.dragAnim.getValue())
            );
            if (bJ.showGlass()) {
               context.drawLiquidGlass(
                  var12,
                  var13,
                  var5,
                  var6,
                  bJ.getGlassBlur(),
                  bJ.getDistortion() - 0.07F * this.dragAnim.getValue(),
                  BorderRadius.all(4.0F),
                  ec.getLiquidGlassColor().withAlpha(255.0F * this.animation.getValue() * bJ.getGlassAlpha())
               );
               context.drawRoundedRect(var12, var13, var5, var6, BorderRadius.all(4.0F), var4.withAlpha(var4.getAlpha() * (0.8F - 0.6F * bJ.glass())));
            } else {
               if (bJ.showMinimalizm()) {
                  context.drawBlurredRect(
                     var12, var13, var5, var6, 11.25F, 7.0F, BorderRadius.all(4.0F), eb.WHITE.withAlpha(255.0F * this.animation.getValue() * bJ.minimalizm())
                  );
               }

               context.drawRoundedRect(var12, var13, var5, var6, BorderRadius.all(4.0F), var4);
            }

            if (!var11.isEmpty()) {
               float var14 = 0.75F;
               float var15 = 16.0F * var14;
               float var16 = (var5 - var15) / 2.0F;
               float var17 = (var6 - var15) / 2.0F;
               context.drawItem(var11, var12 + var16, var13 + var17, var14);
            }
         }

         context.flushItems();

         for (int var25 = 0; var25 < 4; var25++) {
            ItemStack var26 = var9[var25];
            if (!var26.isEmpty()) {
               float var27;
               float var28;
               if (var8) {
                  var27 = this.x + var25 * (var5 + var7);
                  var28 = this.y;
               } else {
                  var27 = this.x;
                  var28 = this.y + var25 * (var6 + var7);
               }

               int var29 = var26.getMaxDamage();
               if (var29 > 0) {
                  int var30 = var26.getDamage();
                  int var31 = var29 - var30;
                  int var32 = var31 * 100 / var29;
                  String var18 = var32 + "%";
                  float var19 = var2.width(var18);
                  float var20 = var2.height();
                  float var21 = var27 + (var5 - var19) / 2.0F;
                  float var22 = var28 + (var6 - var20) / 2.0F;
                  context.drawText(var2, var18, var21 + 0.5F, var22 + 0.5F, eb.BLACK.withAlpha(150.0F));
                  eb var23 = var32 > 50 ? eb.WHITE : (var32 > 25 ? new eb(255.0F, 200.0F, 0.0F, 255.0F) : new eb(255.0F, 50.0F, 50.0F, 255.0F));
                  context.drawText(var2, var18, var21, var22, var23);
               }
            }
         }

         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean show() {
      if (mc.player == null || mc.world == null) {
         return false;
      }

      if (!(mc.currentScreen instanceof ChatScreen) && !(mc.currentScreen instanceof cO)) {
         boolean var1 = false;

         for (int var2 = 0; var2 < 4; var2++) {
            if (!mc.player.getInventory().getArmorStack(var2).isEmpty()) {
               var1 = true;
               break;
            }
         }

         return var1 || this.a.isEnabled();
      } else {
         return true;
      }
   }
}
