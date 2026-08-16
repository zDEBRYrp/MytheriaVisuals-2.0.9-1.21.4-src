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
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Font;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.utility.animation.base.Easing;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class cT extends cR {
   private final Map<Item, Integer> a = new ConcurrentHashMap<>();
   private final Map<Item, dZ> b = new ConcurrentHashMap<>();
   private final Map<Item, Long> c = new ConcurrentHashMap<>();
   private final Map<Item, Integer> d = new ConcurrentHashMap<>();
   private final DecimalFormat e = new DecimalFormat("0.0");
   private final EventListener<I> f = event -> {
      if (mc.player != null) {
         ItemStack var2 = event.getStack();
         if (!var2.isEmpty()) {
            Item var3 = var2.getItem();
            int var4 = this.c(var3);
            if (var4 > 0 && !this.b(var3)) {
               mc.player.getItemCooldownManager().set(var2, var4);
               this.c.put(var3, System.currentTimeMillis());
            }
         }
      }
   };
   private final EventListener<W> g = event -> {
      if (mc.player != null) {
         ItemCooldownManager var2 = mc.player.getItemCooldownManager();

         for (Item var4 : this.a.keySet()) {
            int var5 = this.a(var4);
            Integer var6 = this.d.get(var4);
            if (var6 != null && var5 < var6) {
               int var7 = this.c(var4);
               if (var7 > 0 && !this.b(var4)) {
                  for (int var8 = 0; var8 < mc.player.getInventory().size(); var8++) {
                     ItemStack var9 = mc.player.getInventory().getStack(var8);
                     if (!var9.isEmpty() && var9.getItem() == var4) {
                        var2.set(var9, var7);
                        this.c.put(var4, System.currentTimeMillis());
                        break;
                     }
                  }
               }
            }

            this.d.put(var4, var5);
         }
      }
   };

   public cT() {
      super("hud.cooldowns", "icons/hud/target.png");
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

   private boolean b(Item item) {
      Long var2 = this.c.get(item);
      return var2 == null ? false : System.currentTimeMillis() - var2 < 500L;
   }

   @Override
   public void update(UIContext context) {
      this.width = 92.0F;
      this.height = 18.0F;
      if (mc.player == null) {
         super.update(context);
      } else {
         boolean var2 = mc.currentScreen instanceof ChatScreen || mc.currentScreen instanceof cO;
         ItemCooldownManager var3 = mc.player.getItemCooldownManager();
         boolean var4 = false;

         for (int var5 = 0; var5 < mc.player.getInventory().size(); var5++) {
            ItemStack var6 = mc.player.getInventory().getStack(var5);
            if (!var6.isEmpty() && var3.isCoolingDown(var6)) {
               var4 = true;
               break;
            }
         }

         boolean var25 = var2 && !var4;
         if (var25) {
            Font var26 = Fonts.REGULAR.getFont(7.0F);
            Font var7 = Fonts.MEDIUM.getFont(6.5F);
            long var8 = System.currentTimeMillis();
            boolean var10 = var8 / 2000L % 2L == 0L;
            String var11 = var10 ? "Трапка" : "Пласт";
            String var12 = "00:00";
            float var13 = var26.width(var11);
            float var14 = var7.width(var12) + 10.0F;
            float var15 = 20.0F + var13 + 10.0F + var14 + 10.0F;
            this.width = Math.max(var15, this.width);
            this.height += 23.0F;
         } else {
            this.a();
            Font var27 = Fonts.REGULAR.getFont(7.0F);
            Font var28 = Fonts.MEDIUM.getFont(6.5F);
            float var29 = 92.0F;
            this.width = var29;
            LinkedHashMap<Item, ItemStack> var9 = new LinkedHashMap<>();

            for (int var30 = 0; var30 < mc.player.getInventory().size(); var30++) {
               ItemStack var32 = mc.player.getInventory().getStack(var30);
               if (!var32.isEmpty() && var3.isCoolingDown(var32)) {
                  Item var36 = var32.getItem();
                  if (!var9.containsKey(var36)) {
                     var9.put(var36, var32);
                  }
               }
            }

            ArrayList<ItemStack> var31 = new ArrayList<>(var9.values());

            for (ItemStack var37 : var31) {
               Item var40 = var37.getItem();
               dZ var43 = this.b.computeIfAbsent(var40, k -> {
                  dZ var1 = new dZ(300L, 0.0F, Easing.BAKEK);
                  var1.setValue(1.0F);
                  return var1;
               });
               var43.update(true);
               var43.setEasing(Easing.BAKEK);
            }

            for (Entry var38 : this.b.entrySet()) {
               Item var41 = (Item)var38.getKey();
               boolean var44 = false;

               for (ItemStack var16 : var31) {
                  if (var16.getItem() == var41) {
                     var44 = true;
                     break;
                  }
               }

               if (!var44) {
                  ((dZ)var38.getValue()).update(false);
                  ((dZ)var38.getValue()).setEasing(Easing.BAKEK);
               }
            }

            this.b.entrySet().removeIf(entry -> entry.getValue().getValue() <= 0.01F);

            for (ItemStack var39 : var31) {
               Item var42 = var39.getItem();
               dZ var45 = this.b.get(var42);
               if (var45 != null && var45.getValue() > 0.0F) {
                  String var47 = var39.getName().getString();
                  float var48 = var27.width(var47);
                  float var17 = this.a(var39);
                  float var18 = var17 / 20.0F;
                  int var19 = (int)var18;
                  int var20 = var19 / 60;
                  int var21 = var19 % 60;
                  String var22 = String.format("%02d:%02d", var20, var21);
                  float var23 = var28.width(var22) + 10.0F;
                  float var24 = 25.0F + var48 + 10.0F + var23 + 5.0F;
                  this.width = Math.max(var24, this.width);
                  this.height = this.height + 18.0F * var45.getValue();
               }
            }

            if (this.height > 18.0F) {
               this.height += 5.0F;
            }
         }

         super.update(context);
      }
   }

   private void a() {
      this.a.clear();
   }

   private int c(Item item) {
      return this.a.getOrDefault(item, 0);
   }

   private float a(ItemStack stack) {
      if (mc.player == null) {
         return 0.0F;
      }

      float var2 = mc.player.getItemCooldownManager().getCooldownProgress(stack, 0.0F);
      float var3 = mc.player.getItemCooldownManager().getCooldownProgress(stack, 1.0F);
      float var4 = var2 - var3;
      return var4 <= 0.0F ? 0.0F : var2 / var4;
   }

   private void a(UIContext context) {
      Font var2 = Fonts.REGULAR.getFont(7.0F);
      Font var3 = Fonts.MEDIUM.getFont(6.5F);
      float var4 = 22.0F;
      long var5 = System.currentTimeMillis();
      long var7 = var5 % 2000L;
      boolean var9 = var5 / 2000L % 2L == 0L;
      float var10 = 1.0F;
      if (var7 < 300L) {
         var10 = (float)var7 / 300.0F;
      } else if (var7 > 1700L) {
         var10 = (float)(2000L - var7) / 300.0F;
      }

      String var11 = var9 ? "Трапка" : "Пласт";
      String var12 = "00:00";
      float var13 = 18.0F;
      float var14 = 10.0F;
      ItemStack var15;
      if (var9) {
         var15 = new ItemStack(Items.NETHERITE_SCRAP);
      } else {
         var15 = new ItemStack(Items.DRIED_KELP);
      }

      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var10);
      context.drawItem(var15, this.x + 5.0F, this.y + var4 + er.getMiddleOfBox(var14, var13), 0.625F);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      float var16 = this.x + 5.0F + var14 + 4.0F;
      context.drawText(var2, "|", var16, this.y + var4 + er.getMiddleOfBox(var2.height(), var13), ec.getTextColor().withAlpha(80.0F * var10));
      float var17 = var16 + 6.0F;
      context.drawText(var2, var11, var17, this.y + var4 + er.getMiddleOfBox(var2.height(), var13), ec.getTextColor().withAlpha(255.0F * var10));
      float var18 = var3.width(var12) + 10.0F;
      float var19 = 13.0F;
      float var20 = this.x + this.width - 5.0F - var18;
      float var21 = this.y + var4 + (var13 - var19) / 2.0F;
      context.drawRoundedRect(var20, var21, var18, var19, BorderRadius.all(4.0F), ec.getTextColor().withAlpha(10.0F * var10));
      float var22 = var20 + (var18 - var3.width(var12)) / 2.0F + 1.0F;
      float var23 = var21 + (var19 - var3.height()) / 2.0F;
      context.drawText(var3, var12, var22, var23, ec.getTextColor().withAlpha(255.0F * var10));
   }

   @Override
   protected void renderComponent(UIContext context) {
      if (mc.player != null && mc.world != null) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         Font var2 = Fonts.REGULAR.getFont(7.0F);
         float var3 = 22.0F;
         context.drawClientRect(this.x, this.y, this.width, Math.max(20.0F, this.height), this.animation.getValue(), this.dragAnim.getValue(), 7.0F);
         float var4 = 18.0F;
         Font var5 = Fonts.MEDIUM.getFont(8.0F);
         String var6 = "Cooldowns";
         float var7 = var5.width(var6);
         float var8 = this.x + (this.width - var7) / 2.0F;
         context.drawText(var5, var6, var8, this.y + er.getMiddleOfBox(var2.height(), var4) + 0.5F, ec.getTextColor());
         if (this.height >= 23.0F) {
            context.drawRect(this.x, this.y + var4, this.width, 0.5F, ec.getTextColor().withAlpha(30.0F));
         }

         boolean var9 = mc.currentScreen instanceof ChatScreen || mc.currentScreen instanceof cO;
         ItemCooldownManager var10 = mc.player.getItemCooldownManager();
         LinkedHashMap<Item, ItemStack> var11 = new LinkedHashMap<>();

         for (int var12 = 0; var12 < mc.player.getInventory().size(); var12++) {
            ItemStack var13 = mc.player.getInventory().getStack(var12);
            if (!var13.isEmpty() && var10.isCoolingDown(var13)) {
               Item var14 = var13.getItem();
               if (!var11.containsKey(var14)) {
                  var11.put(var14, var13);
               }
            }
         }

         ArrayList<ItemStack> var39 = new ArrayList<>(var11.values());
         boolean var40 = !var39.isEmpty();
         boolean var41 = var9 && !var40;
         if (var41) {
            this.a(context);
            if (this.height > 23.0F) {
               float var42 = this.width * 0.5F;
               float var47 = 1.5F;
               float var52 = this.x + (this.width - var42) / 2.0F;
               float var57 = this.y + this.height - var47 - 0.0F;
               context.drawRoundedRect(var52, var57, var42, var47, BorderRadius.all(1.25F), eb.WHITE);
            }

            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
         } else if (var39.isEmpty()) {
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
         } else {
            fs var15 = new fs(VertexFormats.POSITION_COLOR, context.getMatrices());

            for (ItemStack var17 : var39) {
               Item var18 = var17.getItem();
               dZ var19 = this.b.get(var18);
               if (var19 != null && !(var19.getValue() <= 0.01F)) {
                  float var20 = -4.5F + 4.5F * var19.getValue();
                  if (var3 != 22.0F) {
                     context.drawRect(this.x, this.y + var3 + var20, this.width, 0.5F, ec.getTextColor().withAlpha(5.1F * var19.getValue()));
                  }

                  var3 += 18.0F * var19.getValue();
               }
            }

            var15.draw();
            var3 = 22.0F;

            for (ItemStack var48 : var39) {
               Item var53 = var48.getItem();
               dZ var58 = this.b.get(var53);
               if (var58 != null && !(var58.getValue() <= 0.01F)) {
                  float var62 = var58.getValue();
                  float var21 = -4.5F + 4.5F * var62;
                  float var22 = 10.0F;
                  RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var62);
                  context.drawItem(var48, this.x + 5.0F, this.y + var3 + var21 + er.getMiddleOfBox(var22, 18.0F), 0.625F);
                  RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
                  var3 += 18.0F * var62;
               }
            }

            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            var3 = 22.0F;

            for (ItemStack var49 : var39) {
               Item var54 = var49.getItem();
               dZ var59 = this.b.get(var54);
               if (var59 != null && !(var59.getValue() <= 0.01F)) {
                  float var63 = var59.getValue();
                  float var65 = -4.5F + 4.5F * var63;
                  float var67 = 18.0F;
                  float var23 = this.a(var49);
                  float var24 = var23 / 20.0F;
                  Font var25 = Fonts.MEDIUM.getFont(6.5F);
                  int var26 = (int)var24;
                  int var27 = var26 / 60;
                  int var28 = var26 % 60;
                  String var29 = String.format("%02d:%02d", var27, var28);
                  float var30 = var25.width(var29) + 10.0F;
                  float var31 = 13.0F;
                  float var32 = this.x + this.width - 5.0F - var30;
                  float var33 = this.y + var3 + var65 + (var67 - var31) / 2.0F;
                  context.drawRoundedRect(var32, var33, var30, var31, BorderRadius.all(4.0F), ec.getTextColor().withAlpha(10.0F * var63));
                  float var34 = var32 + (var30 - var25.width(var29)) / 2.0F + 1.0F;
                  float var35 = var33 + (var31 - var25.height()) / 2.0F;
                  context.drawText(var25, var29, var34, var35, ec.getTextColor().withAlpha(255.0F * var63));
                  var3 += 18.0F * var63;
               }
            }

            var3 = 22.0F;

            for (ItemStack var50 : var39) {
               Item var55 = var50.getItem();
               dZ var60 = this.b.get(var55);
               if (var60 != null && !(var60.getValue() <= 0.01F)) {
                  float var64 = var60.getValue();
                  float var66 = -4.5F + 4.5F * var64;
                  String var68 = var50.getName().getString();
                  float var69 = 10.0F;
                  float var70 = this.x + 5.0F + var69 + 4.0F;
                  context.drawText(
                     var2, "|", var70, this.y + var3 + var66 + er.getMiddleOfBox(var2.height(), 18.0F), ec.getTextColor().withAlpha(80.0F * var64)
                  );
                  float var71 = var70 + 6.0F;
                  context.drawText(
                     var2, var68, var71, this.y + var3 + var66 + er.getMiddleOfBox(var2.height(), 18.0F), ec.getTextColor().withAlpha(255.0F * var64)
                  );
                  var3 += 18.0F * var64;
               }
            }

            if (this.height > 23.0F) {
               float var46 = this.width * 0.5F;
               float var51 = 1.5F;
               float var56 = this.x + (this.width - var46) / 2.0F;
               float var61 = this.y + this.height - var51 - 0.0F;
               context.drawRoundedRect(var56, var61, var46, var51, BorderRadius.all(1.25F), eb.WHITE);
            }

            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
         }
      }
   }

   @Override
   public boolean show() {
      if (mc.player != null && mc.world != null) {
         boolean var1 = mc.currentScreen instanceof ChatScreen;
         boolean var2 = mc.currentScreen instanceof cO;
         return !var1 && !var2 ? this.hasActiveCooldowns() : true;
      } else {
         return false;
      }
   }

   public boolean hasActiveCooldowns() {
      if (mc.player != null && mc.world != null) {
         ItemCooldownManager var1 = mc.player.getItemCooldownManager();

         for (int var2 = 0; var2 < mc.player.getInventory().size(); var2++) {
            ItemStack var3 = mc.player.getInventory().getStack(var2);
            if (!var3.isEmpty() && var1.isCoolingDown(var3)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }
}
