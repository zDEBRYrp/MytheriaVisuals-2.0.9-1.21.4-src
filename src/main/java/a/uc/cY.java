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

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Font;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.systems.modules.Module;
import nesquik.mytheria.utility.animation.base.Easing;
import net.minecraft.client.gui.screen.ChatScreen;

public class cY extends cR {
   int a = -1;

   public cY() {
      super("hud.keybinds", "icons/hud/keybinds.png");
   }

   private void a(UIContext context) {
      Font var2 = Fonts.REGULAR.getFont(7.0F);
      Font var3 = Fonts.MEDIUM.getFont(6.5F);
      float var4 = 22.5F;
      long var5 = System.currentTimeMillis();
      long var7 = var5 % 2000L;
      boolean var9 = var5 / 2000L % 2L == 0L;
      float var10 = 1.0F;
      if (var7 < 300L) {
         var10 = (float)var7 / 300.0F;
      } else if (var7 > 1700L) {
         var10 = (float)(2000L - var7) / 300.0F;
      }

      String var11 = var9 ? "AutoSprint" : "TargetESP";
      String var12 = var9 ? "V" : "H";
      ax var13 = var9 ? ax.MOVEMENT : ax.VISUALS;
      float var14 = 18.0F;
      float var15 = 10.0F;
      fv var16 = this.a(var13);
      context.drawSprite(var16, this.x + 5.0F, this.y + var4 + er.getMiddleOfBox(var15, var14), var15, var15, ec.getTextColor().withAlpha(255.0F * var10));
      float var17 = this.x + 5.0F + var15 + 4.0F;
      context.drawText(var2, "|", var17, this.y + var4 + er.getMiddleOfBox(var2.height(), var14), ec.getTextColor().withAlpha(80.0F * var10));
      float var18 = var17 + 6.0F;
      context.drawText(var2, var11, var18, this.y + var4 + er.getMiddleOfBox(var2.height(), var14), ec.getTextColor().withAlpha(255.0F * var10));
      float var19 = var3.width(var12) + 10.0F;
      float var20 = 13.0F;
      float var21 = this.x + this.width - 5.0F - var19;
      float var22 = this.y + var4 + (var14 - var20) / 2.0F;
      context.drawRoundedRect(var21, var22, var19, var20, BorderRadius.all(6.0F), ec.getTextColor().withAlpha(10.0F * var10));
      float var23 = var21 + (var19 - var3.width(var12)) / 2.0F + 1.0F;
      float var24 = var22 + (var20 - var3.height()) / 2.0F;
      context.drawText(var3, var12, var23, var24, ec.getTextColor().withAlpha(255.0F * var10));
   }

   @Override
   public void update(UIContext context) {
      this.width = 92.0F;
      this.height = 18.0F;
      boolean var2 = mc.currentScreen instanceof ChatScreen || mc.currentScreen instanceof cO;
      List var3 = Mytheria.getInstance().getModuleManager().getModules().stream().filter(module -> module.isEnabled() && module.getKey() != -1).toList();
      boolean var4 = !var3.isEmpty();
      boolean var5 = var2 && !var4;
      if (var5) {
         Font var6 = Fonts.REGULAR.getFont(7.0F);
         Font var7 = Fonts.MEDIUM.getFont(6.5F);
         long var8 = System.currentTimeMillis();
         boolean var10 = var8 / 2000L % 2L == 0L;
         String var11 = var10 ? "AutoSprint" : "TargetESP";
         String var12 = var10 ? "V" : "H";
         float var13 = var6.width(var11);
         float var14 = var7.width(var12) + 10.0F;
         float var15 = 20.0F + var13 + 10.0F + var14 + 10.0F;
         this.width = Math.max(var15, this.width);
         this.height += 23.0F;
      } else {
         for (Module var17 : Mytheria.getInstance().getModuleManager().getModules()) {
            boolean var18 = var17.isEnabled() && var17.getKey() != -1;
            var17.getKeybindsAnimation().update(var18);
            var17.getKeybindsAnimation().setEasing(Easing.BAKEK);
            if (var17.getKeybindsAnimation().getValue() > 0.0F) {
               float var9 = Fonts.REGULAR.getFont(7.0F).width(var17.getName() + " " + ej.getKeyName(var17.getKey()));
               this.width = Math.max(var9 + 45.0F, this.width);
            }

            this.height = this.height + 18.0F * var17.getKeybindsAnimation().getValue();
         }

         if (this.height > 18.0F) {
            this.height += 5.0F;
         }
      }

      super.update(context);
   }

   @Override
   protected void renderComponent(UIContext context) {
      Font var2 = Fonts.REGULAR.getFont(7.0F);
      context.drawClientRect(this.x, this.y, this.width, Math.max(20.0F, this.height), this.animation.getValue(), this.dragAnim.getValue(), 7.0F);
      float var3 = 18.0F;
      float var4 = 0.0F;
      context.drawTexture(Mytheria.id(this.icon), this.x + 7.0F, this.y + 6.0F, var4, var4, ec.getTextColor());
      context.drawText(
         Fonts.MEDIUM.getFont(8.0F), "KeyBinds", this.x + 26.0F + var4 + 4.0F, this.y + er.getMiddleOfBox(var2.height(), var3) + 0.5F, ec.getTextColor()
      );
      if (this.height >= 23.0F) {
         context.drawRect(this.x, this.y + var3, this.width, 0.5F, ec.getTextColor().withAlpha(30.0F));
      }

      boolean var5 = mc.currentScreen instanceof ChatScreen || mc.currentScreen instanceof cO;
      List var6 = Mytheria.getInstance().getModuleManager().getModules().stream().filter(module -> module.isEnabled() && module.getKey() != -1).toList();
      boolean var7 = !var6.isEmpty();
      boolean var8 = var5 && !var7;
      if (var8) {
         this.a(context);
         if (this.height > 23.0F) {
            float var28 = this.width * 0.5F;
            float var29 = 1.5F;
            float var31 = this.x + (this.width - var28) / 2.0F;
            float var33 = this.y + this.height - var29 - 0.0F;
            context.drawRoundedRect(var31, var33, var28, var29, BorderRadius.all(1.25F), eb.WHITE);
         }
      } else {
         ArrayList<Module> var9 = new ArrayList<>(Mytheria.getInstance().getModuleManager().getModules());
         if (this.a == var9.size()) {
            var9.sort(Comparator.comparingDouble(m -> var2.width(m.getName())));
            this.a = var9.size();
         }

         float var10 = var3 + 4.5F;

         for (Module var12 : var9) {
            dZ var13 = var12.getKeybindsAnimation();
            if (var13.getValue() != 0.0F) {
               float var14 = 18.0F;
               float var15 = var13.getValue();
               float var16 = 10.0F;
               fv var17 = this.a(var12.getCategory());
               context.drawSprite(
                  var17, this.x + 5.0F, this.y + var10 + er.getMiddleOfBox(var16, var14), var16, var16, ec.getTextColor().withAlpha(255.0F * var15)
               );
               float var18 = this.x + 5.0F + var16 + 4.0F;
               context.drawText(var2, "|", var18, this.y + var10 + er.getMiddleOfBox(var2.height(), var14), ec.getTextColor().withAlpha(80.0F * var15));
               float var19 = var18 + 6.0F;
               context.drawText(
                  var2, var12.getName(), var19, this.y + var10 + er.getMiddleOfBox(var2.height(), var14), ec.getTextColor().withAlpha(255.0F * var15)
               );
               String var20 = ej.getKeyName(var12.getKey());
               Font var21 = Fonts.MEDIUM.getFont(6.5F);
               float var22 = var21.width(var20) + 10.0F;
               float var23 = 13.0F;
               float var24 = this.x + this.width - 5.0F - var22;
               float var25 = this.y + var10 + (var14 - var23) / 2.0F;
               context.drawRoundedRect(var24, var25, var22, var23, BorderRadius.all(6.0F), ec.getTextColor().withAlpha(10.0F * var15));
               float var26 = var24 + (var22 - var21.width(var20)) / 2.0F + 1.0F;
               float var27 = var25 + (var23 - var21.height()) / 2.0F;
               context.drawText(var21, var20, var26, var27, ec.getTextColor().withAlpha(255.0F * var15));
               var10 += var14 * var13.getValue();
            }
         }

         if (this.height > 23.0F) {
            float var30 = this.width * 0.5F;
            float var32 = 1.5F;
            float var34 = this.x + (this.width - var30) / 2.0F;
            float var35 = this.y + this.height - var32 - 0.0F;
            context.drawRoundedRect(var34, var35, var30, var32, BorderRadius.all(1.25F), eb.WHITE);
         }
      }
   }

   private fv a(ax category) {
      return switch (category) {
         case COMBAT -> fv.BIG_COMBAT;
         case MOVEMENT -> fv.BIG_MOVEMENT;
         case VISUALS -> fv.BIG_VISUALS;
         case PLAYER -> fv.BIG_PLAYER;
         case OTHER -> fv.BIG_OTHER;
      };
   }

   @Override
   public boolean show() {
      return !Mytheria.getInstance().getModuleManager().getModules().stream().filter(module -> module.isEnabled() && module.getKey() != -1).toList().isEmpty()
         || mc.currentScreen instanceof ChatScreen
         || mc.currentScreen instanceof cO;
   }
}
