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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Font;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.utility.animation.base.Easing;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class cX extends cP {
   private final ch a = new ch(this, "hud.item_counter.show_totems").enabled(true);
   private final ch b = new ch(this, "hud.item_counter.show_pearls").enabled(true);
   private final ch c = new ch(this, "hud.item_counter.show_golden_apples").enabled(true);
   private final ch d = new ch(this, "hud.item_counter.show_enchanted_apples").enabled(true);
   private final ch e = new ch(this, "hud.always_display").enabled(false);
   private final ck f = new ck(this, "hud.item_counter.direction");
   private final ck.a g = new ck.a(this.f, "hud.item_counter.vertical").select();
   private final ck.a h = new ck.a(this.f, "hud.item_counter.horizontal");
   private final Map<Item, dZ> i = new HashMap<>();
   private final List<cX.a> j = new ArrayList<>();

   public cX() {
      super("hud.item_counter", "icons/hud/item_counter.png");
      this.j.add(new cX.a(Items.TOTEM_OF_UNDYING, "hud.item_counter.totem", this.a));
      this.j.add(new cX.a(Items.ENDER_PEARL, "hud.item_counter.pearl", this.b));
      this.j.add(new cX.a(Items.GOLDEN_APPLE, "hud.item_counter.golden_apple", this.c));
      this.j.add(new cX.a(Items.ENCHANTED_GOLDEN_APPLE, "hud.item_counter.enchanted_apple", this.d));

      for (cX.a var2 : this.j) {
         this.i.put(var2.a, new dZ(300L, 0.0F, Easing.BAKEK));
      }
   }

   @Override
   public void update(UIContext context) {
      boolean var2 = this.f.is(this.g);
      if (var2) {
         this.width = 32.0F;
         this.height = 0.0F;
      } else {
         this.width = 0.0F;
         this.height = 32.0F;
      }

      if (mc.player == null) {
         super.update(context);
      } else {
         boolean var3 = mc.currentScreen instanceof ChatScreen || mc.currentScreen instanceof cO;

         for (cX.a var5 : this.j) {
            if (!var5.c.isEnabled()) {
               this.i.get(var5.a).update(false);
            } else {
               int var6 = this.a(var5.a);
               boolean var7 = var6 > 0 || var3 || this.e.isEnabled();
               dZ var8 = this.i.get(var5.a);
               var8.update(var7);
               if (var8.getValue() > 0.01F) {
                  if (var2) {
                     this.height = this.height + 40.0F * var8.getValue();
                  } else {
                     this.width = this.width + 40.0F * var8.getValue();
                  }
               }
            }
         }

         super.update(context);
      }
   }

   private int a(Item item) {
      if (mc.player == null) {
         return 0;
      }

      int var2 = 0;

      for (int var3 = 0; var3 < mc.player.getInventory().size(); var3++) {
         ItemStack var4 = mc.player.getInventory().getStack(var3);
         if (!var4.isEmpty() && var4.getItem() == item) {
            var2 += var4.getCount();
         }
      }

      return var2;
   }

   @Override
   protected void renderComponent(UIContext context) {
      if (mc.player != null && mc.world != null) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         Font var2 = Fonts.SEMIBOLD.getFont(8.0F);
         float var3 = 0.0F;
         boolean var4 = this.f.is(this.g);
         boolean var5 = mc.currentScreen instanceof ChatScreen || mc.currentScreen instanceof cO;
         eb var6 = bJ.getBackgroundColor();

         for (cX.a var8 : this.j) {
            if (var8.c.isEnabled()) {
               dZ var9 = this.i.get(var8.a);
               if (!(var9.getValue() <= 0.01F)) {
                  float var10 = var9.getValue();
                  int var11 = this.a(var8.a);
                  String var12 = var5 && var11 == 0 ? "0" : String.valueOf(var11);
                  float var13 = 24.0F;
                  float var14 = 12.0F;
                  float var15 = 4.0F;
                  float var16 = var13 + var14 + var15;
                  float var17;
                  float var18;
                  if (var4) {
                     var18 = this.y + var3;
                     var17 = this.x + (this.width - var13) / 2.0F;
                  } else {
                     var17 = this.x + var3;
                     var18 = this.y + (this.height - var13) / 2.0F;
                  }

                  context.drawShadow(
                     var17 - 3.0F,
                     var18 - 3.0F,
                     var13 + 6.0F,
                     var13 + 6.0F,
                     10.0F,
                     BorderRadius.all(6.0F),
                     eb.BLACK.withAlpha(63.75F * var10 * this.dragAnim.getValue())
                  );
                  if (bJ.showGlass()) {
                     context.drawLiquidGlass(
                        var17,
                        var18,
                        var13,
                        var13,
                        bJ.getGlassBlur(),
                        bJ.getDistortion() - 0.07F * this.dragAnim.getValue(),
                        BorderRadius.all(6.0F),
                        ec.getLiquidGlassColor().withAlpha(255.0F * var10 * bJ.getGlassAlpha())
                     );
                     context.drawRoundedRect(
                        var17, var18, var13, var13, BorderRadius.all(6.0F), var6.withAlpha(var6.getAlpha() * var10 * (0.8F - 0.6F * bJ.glass()))
                     );
                  } else {
                     if (bJ.showMinimalizm()) {
                        context.drawBlurredRect(
                           var17, var18, var13, var13, 11.25F, 7.0F, BorderRadius.all(6.0F), eb.WHITE.withAlpha(255.0F * var10 * bJ.minimalizm())
                        );
                     }

                     context.drawRoundedRect(var17, var18, var13, var13, BorderRadius.all(6.0F), var6.withAlpha(var6.getAlpha() * var10));
                  }

                  float var19 = 1.0F;
                  float var20 = 16.0F * var19;
                  float var21 = (var13 - var20) / 2.0F;
                  float var22 = (var13 - var20) / 2.0F;
                  RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var10);
                  context.drawItem(new ItemStack(var8.a), var17 + var21, var18 + var22, var19);
                  RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
                  float var23 = var2.width(var12);
                  float var24;
                  float var25;
                  if (var4) {
                     var25 = var18 + var13 + var15;
                     var24 = this.x + (this.width - var23) / 2.0F;
                  } else {
                     var24 = var17 + (var13 - var23) / 2.0F;
                     var25 = var18 + var13 + var15;
                  }

                  eb var26 = var11 == 0 ? new eb(255.0F, 30.0F, 30.0F, (int)(255.0F * var10)) : eb.WHITE.withAlpha(255.0F * var10);
                  context.drawText(var2, var12, var24, var25, var26);
                  if (var4) {
                     var3 += var16 * var10;
                  } else {
                     var3 += var16 * var10;
                  }
               }
            }
         }

         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
      }
   }

   @Override
   public boolean show() {
      if (mc.player != null && mc.world != null) {
         boolean var1 = mc.currentScreen instanceof ChatScreen || mc.currentScreen instanceof cO;
         if (var1) {
            return true;
         }

         if (this.e.isEnabled()) {
            return true;
         }

         for (cX.a var3 : this.j) {
            if (var3.c.isEnabled() && this.a(var3.a) > 0) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   static class a {
      final Item a;
      final String b;
      final ch c;

      a(Item item, String translationKey, ch setting) {
         this.a = item;
         this.b = translationKey;
         this.c = setting;
      }
   }
}
