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

import java.util.List;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.CustomComponent;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Font;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.MouseButton;

public class dG extends dz<cl> {
   private cK a;
   private float b = 0.0F;

   public dG(cl setting, CustomComponent parent) {
      super(setting, parent);
   }

   @Override
   public void onInit() {
      this.width = 13.0F;
      this.height = 8.0F;
      this.a = new cK(Fonts.REGULAR.getFont(8.0F));
      this.a.setPreview(av.translate("modules.settings.target_list.add_player"));
      super.onInit();
   }

   @Override
   public void update(UIContext context) {
      super.update(context);
   }

   @Override
   public void renderComponent(UIContext context) {
      float var2 = this.x + 8.0F;
      float var3 = this.y + 15.0F;
      float var4 = this.width - 16.0F;
      float var5 = 10.0F;
      this.hoverAnimation.update(this.isHovered(context.getMouseX(), context.getMouseY()));
      if (this.isHovered(context.getMouseX(), context.getMouseY())) {
         eo.set(en.HAND);
      }

      Font var6 = Fonts.REGULAR.getFont(8.0F);
      float var7 = 19.0F;
      context.drawFadeoutText(
         var6,
         av.translate(this.setting.getName()),
         this.x + var5,
         this.y + er.getMiddleOfBox(var6.height(), var7) - 0.5F,
         ec.getTextColor().withAlpha(255.0F * (0.75F + 0.25F * this.hoverAnimation.getValue())),
         0.7F,
         0.99F,
         var4 - 20.0F
      );
      float var8 = 20.0F;
      context.drawRoundedRect(var2, var3, var4 - 30.0F, var8, BorderRadius.all(4.0F), ec.getBackgroundColor().withAlpha(76.5F));
      this.a.set(var2, var3, var4 - 30.0F, var8);
      this.a.setAlpha(1.0F);
      this.a.setTextColor(ec.getTextColor());
      this.a.render(context);
      float var9 = var2 + var4 - 25.0F;
      float var10 = 20.0F;
      boolean var11 = context.getMouseX() >= var9 && context.getMouseX() <= var9 + var10 && context.getMouseY() >= var3 && context.getMouseY() <= var3 + var8;
      context.drawRoundedRect(var9, var3, var10, var8, BorderRadius.all(4.0F), ec.getAccentColor().withAlpha(var11 ? 255.0F : 200.0F));
      float var12 = 10.0F;
      context.drawTexture(Mytheria.id("icons/success.png"), var9 + (var10 - var12) / 2.0F, var3 + (var8 - var12) / 2.0F, var12, var12, eb.WHITE);
      List var13 = this.setting.getPlayers();
      float var14 = var3 + var8 + 5.0F;
      float var15 = 18.0F;

      for (int var16 = 0; var16 < var13.size(); var16++) {
         String var17 = (String)var13.get(var16);
         float var18 = var14 + var16 * var15;
         boolean var19 = context.getMouseX() >= var2
            && context.getMouseX() <= var2 + var4
            && context.getMouseY() >= var18
            && context.getMouseY() <= var18 + var15;
         context.drawRoundedRect(var2, var18, var4, var15 - 2.0F, BorderRadius.all(4.0F), ec.getBackgroundColor().withAlpha(var19 ? 102.0F : 76.5F));
         context.drawText(
            Fonts.REGULAR.getFont(8.0F), var17, var2 + 6.0F, var18 + var15 / 2.0F - Fonts.REGULAR.getFont(8.0F).height() / 2.0F, ec.getTextColor()
         );
         float var20 = var2 + var4 - 18.0F;
         float var21 = 14.0F;
         boolean var22 = context.getMouseX() >= var20
            && context.getMouseX() <= var20 + var21
            && context.getMouseY() >= var18 + 2.0F
            && context.getMouseY() <= var18 + 2.0F + var21;
         context.drawRoundedRect(var20, var18 + 2.0F, var21, var21, BorderRadius.all(3.0F), new eb(255.0F, 50.0F, 50.0F, var22 ? 255.0F : 200.0F));
         float var23 = 6.0F;
         context.drawTexture(Mytheria.id("icons/trash.png"), var20 + (var21 - var23) / 2.0F, var18 + 2.0F + (var21 - var23) / 2.0F, var23, var23, eb.WHITE);
      }
   }

   @Override
   public void drawRegular8(UIContext context) {
   }

   @Override
   public void drawSplit(UIContext context) {
      float var2 = 0.5F;
      context.drawRect(this.x, this.y + this.height, this.width, var2, ec.getTextColor().withAlpha(5.1F));
   }

   @Override
   public void onKeyPressed(int keyCode, int scanCode, int modifiers) {
      this.a.onKeyPressed(keyCode, scanCode, modifiers);
      if (keyCode == 257 && !this.a.getBuiltText().isEmpty()) {
         this.setting.addPlayer(this.a.getBuiltText());
         this.a.clear();
      }
   }

   @Override
   public boolean charTyped(char chr, int modifiers) {
      return this.a.charTyped(chr, modifiers);
   }

   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      float var6 = this.x + 8.0F;
      float var7 = this.y + 15.0F;
      float var8 = this.width - 16.0F;
      float var9 = 20.0F;
      float var10 = var6 + var8 - 25.0F;
      float var11 = 20.0F;
      if (mouseX >= var10 && mouseX <= var10 + var11 && mouseY >= var7 && mouseY <= var7 + var9) {
         if (!this.a.getBuiltText().isEmpty()) {
            this.setting.addPlayer(this.a.getBuiltText());
            this.a.clear();
         }
      } else {
         List var12 = this.setting.getPlayers();
         float var13 = var7 + var9 + 5.0F;
         float var14 = 18.0F;

         for (int var15 = 0; var15 < var12.size(); var15++) {
            String var16 = (String)var12.get(var15);
            float var17 = var13 + var15 * var14;
            float var18 = var6 + var8 - 18.0F;
            float var19 = 14.0F;
            if (mouseX >= var18 && mouseX <= var18 + var19 && mouseY >= var17 + 2.0F && mouseY <= var17 + 2.0F + var19) {
               this.setting.removePlayer(var16);
               return;
            }
         }

         this.a.onMouseClicked(mouseX, mouseY, button);
         super.onMouseReleased(mouseX, mouseY, button);
      }
   }

   @Override
   public void onMouseReleased(double mouseX, double mouseY, MouseButton button) {
      this.a.onMouseReleased(mouseX, mouseY, button);
   }

   @Override
   public float getHeight() {
      List var1 = this.setting.getPlayers();
      float var2 = 40.0F;
      float var3 = 18.0F;
      return var2 + var1.size() * var3;
   }
}
