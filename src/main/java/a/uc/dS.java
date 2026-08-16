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
import java.util.List;
import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.CustomComponent;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Font;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.systems.setting.Setting;
import nesquik.mytheria.utility.animation.base.Easing;

public class dS extends CustomComponent {
   private final dT a;
   private List<dz> b = new ArrayList<>();
   private final dZ c = new dZ(300L, 0.0F, Easing.BAKEK_SIZE);
   private boolean d;
   private final es e = new es();
   private float f;
   private float g;
   private boolean h;
   private final dZ i = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
   private final dZ j = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
   private final dZ k = new dZ(300L, Easing.BAKEK);
   private final ea l = new ea(300L, new eb(24.0F, 24.0F, 27.0F), Easing.FIGMA_EASE_IN_OUT);

   public dS(dT toggle, float x, float y, float width) {
      this.a = toggle;
      this.x = x;
      this.y = y;
      this.width = width;
      this.d = true;

      for (Setting var6 : toggle.getElement().getSettings()) {
         dz var7 = er.settinge(var6, this);
         if (var7 != null) {
            this.b.add(var7);
         }
      }
   }

   @Override
   public void renderComponent(UIContext context) {
      this.c.setDuration(this.d ? 500L : 300L);
      this.c.update(this.d && mc.currentScreen instanceof dR);
      this.e.update();
      if (this.h) {
         this.x = context.getMouseX() - this.f;
         this.y = context.getMouseY() - this.g;
      }

      float var2 = Math.min(1.0F, this.c.getValue());
      boolean var3 = Mytheria.getInstance().getMenuScreen().getMenuAnimation().getValue()
         == Mytheria.getInstance().getMenuScreen().getMenuAnimation().getTargetValue();
      boolean var4 = Mytheria.getInstance().getThemeManager().getCurrentTheme() == ct.DARK;
      this.c.setEasing(this.d ? Easing.QUARTIC_OUT : Easing.BAKEK_BACK);
      float var5 = eI.interpolate(this.a.getX(), this.x, var2);
      float var6 = eI.interpolate(this.a.getY(), this.y, var2);
      float var7 = eI.interpolate(this.a.getWidth(), this.width, var2);
      float var8 = eI.interpolate(this.a.getHeight(), this.height, var2);
      if (!this.d || !var3 || !(mc.currentScreen instanceof dR)) {
         var5 = this.x;
         var6 = this.y;
         var7 = this.width;
         var8 = this.height;
      }

      if (!this.d || !var3) {
         fl.scale(context.getMatrices(), var5 + var7 / 2.0F, var6 + var8 / 2.0F, 0.5F + 0.5F * this.c.getValue());
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var2);
      }

      if (bJ.showGlass()) {
         context.drawLiquidGlass(
            var5,
            var6,
            var7,
            var8,
            bJ.getGlassBlur(),
            bJ.getDistortion(),
            BorderRadius.all(11.0F),
            ec.getLiquidGlassColor().withAlpha(255.0F * var2 * bJ.getGlassAlpha())
         );
         context.drawRoundedRect(var5, var6, var7, var8, BorderRadius.all(11.0F), ec.getBackgroundColor().withAlpha(255.0F * (0.8F - 0.6F * bJ.glass()) * var2));
      } else {
         if (bJ.showMinimalizm()) {
            context.drawBlurredRect(var5, var6, var7, var8, 11.25F, 5.0F, BorderRadius.all(11.0F), eb.WHITE.withAlpha(255.0F * var2 * bJ.minimalizm()));
         }

         context.drawRoundedRect(var5, var6, var7, var8, BorderRadius.all(11.0F), bJ.getBackgroundColor());
      }

      if (this.d) {
         context.drawText(
            Fonts.MEDIUM.getFont(7.0F + 2.0F * var2),
            av.translate(this.a.getElement().getName()),
            var5 + 7.0F + 2.0F * var2,
            var6 + 8.0F + 2.0F * var2,
            ec.getTextColor()
         );
      } else {
         context.drawText(Fonts.MEDIUM.getFont(9.0F), av.translate(this.a.getElement().getName()), var5 + 9.0F, var6 + 10.0F, ec.getTextColor());
      }

      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var2);
      context.drawTexture(Mytheria.id("icons/close.png"), var5 + var7 - 17.0F, var6 + 9.0F, 8.0F, 8.0F, ec.getTextColor());
      if (er.isHovered(var5 + var7 - 17.0F, var6 + 9.0F, 8.0, 8.0, context)) {
         eo.set(en.HAND);
      }

      if (bJ.showMinimalizm()) {
         context.drawRect(var5, var6 + 24.0F, var7, 4.0F, ec.getSeparatorColor().withAlpha(ec.getSeparatorColor().getAlpha() * bJ.minimalizm()));
      }

      float var9 = 28.0F;
      float var10 = 0.0F;
      fm.push(context.getMatrices(), var5, var6 + 28.0F, var7, var8 - 28.0F - 5.0F);
      this.j.update(this.a.getElement().isShowing() ? 1.0F : 0.75F);
      this.k.update(this.a.getElement().isShowing() ? 1.0F : 0.0F);
      eb var11 = ec.getAccentColor();
      eb var12 = new eb(var11.getRed() * 0.6F + 102.0F, var11.getGreen() * 0.6F + 102.0F, var11.getBlue() * 0.6F + 102.0F, 255.0F);
      this.l
         .update(this.a.getElement().isShowing() ? var12 : Mytheria.getInstance().getThemeManager().getCurrentTheme().getAdditionalColor().mix(eb.BLACK, 0.3F));
      this.i.update(this.isHovered(context.getMouseX(), context.getMouseY()));
      if (this.isHovered(context.getMouseX(), context.getMouseY())) {
         eo.set(en.HAND);
      }

      float var13 = (float)(var6 + 28.0F - this.e.getValue());
      float var14 = 13.0F;
      float var15 = 8.0F;
      Font var16 = Fonts.REGULAR.getFont(8.0F);
      float var17 = 10.0F;
      float var18 = 19.0F;
      String var19 = av.translate("enabled");
      context.drawFadeoutText(
         var16,
         var19.substring(0, 1).toUpperCase() + var19.substring(1),
         var5 + var17,
         var13 + er.getMiddleOfBox(var16.height(), var18) - 0.5F,
         ec.getTextColor().withAlpha(255.0F * (0.75F + 0.25F * this.k.getValue() + 0.25F * this.i.getValue())),
         0.7F,
         0.99F,
         var7 - var14 - 20.0F
      );
      context.drawRoundedRect(
         var5 + var7 - var14 - 9.0F,
         var13 + 5.0F,
         var14,
         var15,
         BorderRadius.all(3.0F),
         this.l.getColor().withAlpha(!this.a.getElement().isShowing() ? 255.0F - 100.0F * bJ.glass() : 255.0F)
      );
      context.drawRoundedRect(
         var5 + var7 - var14 - 8.0F + 5.0F * this.k.getValue(),
         var13 + 6.0F,
         6.0F,
         6.0F,
         BorderRadius.all(4.0F),
         new eb(255.0F, 255.0F, 255.0F).withAlpha(this.j.getValue() * 255.0F)
      );
      float var20 = 0.5F;
      context.drawRect(var5, var13 + 18.0F, var7, var20, ec.getTextColor().withAlpha(5.1F));
      var10 += 18.0F;

      for (dz var22 : this.b) {
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var22.getOpacity() * var2);
         var22.getVisibilityAnimation().update(var22.getSetting().isVisible() ? 1.0F : 0.0F);
         var22.setX(var5);
         var22.setY((float)(var6 + var9 + var10 - this.e.getValue()));
         var22.setWidth(var7);
         if (er.isHovered(var5, var6 - var22.getHeight(), var7, var8 + var22.getHeight(), var22.getX(), var22.getY())) {
            context.pushMatrix();
            context.getMatrices().translate(0.0F, (-var22.getHeight() + var22.getHeight() * var22.getOpacity()) / 2.0F, 0.0F);
            var22.render(context);
            context.popMatrix();
         }

         var10 += var22.getHeight() * var22.getOpacity();
      }

      fm.pop();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var2);
      this.height = Math.min(200.0F, var10 + 28.0F + 5.0F);
      this.e.setMax(-var10 + var8 - 24.0F - 4.0F - 5.0F);
      if (!this.d || !var3) {
         fl.end(context.getMatrices());
      }

      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      for (dz var7 : this.b) {
         if (var7.getOpacity() != 0.0F && (this.isHovered(mouseX, mouseY) || button != MouseButton.LEFT)) {
            var7.onMouseClicked(mouseX, mouseY, button);
         }
      }

      if (er.isHovered(this.x, this.y + 24.0F - this.e.getValue(), this.width, 18.0, mouseX, mouseY) && button == MouseButton.LEFT) {
         this.a.getElement().setShowing(!this.a.getElement().isShowing());
         Mytheria.getInstance().getFileManager().writeFile("client");
      }

      if (er.isHovered(this.x, this.y, this.width, 24.0, mouseX, mouseY)) {
         this.h = true;
         this.f = (float)(mouseX - this.x);
         this.g = (float)(mouseY - this.y);
      }

      if (er.isHovered(this.x + this.width - 17.0F, this.y + 9.0F, 8.0, 8.0, mouseX, mouseY)) {
         this.d = false;
      }

      super.onMouseClicked(mouseX, mouseY, button);
   }

   @Override
   public void onMouseReleased(double mouseX, double mouseY, MouseButton button) {
      for (dz var7 : this.b) {
         if (var7.getOpacity() != 0.0F) {
            var7.onMouseReleased(mouseX, mouseY, button);
         }
      }

      this.h = false;
      super.onMouseReleased(mouseX, mouseY, button);
   }

   @Override
   public void onScroll(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      for (dz var10 : this.b) {
         if (var10.getOpacity() != 0.0F) {
            var10.onScroll(mouseX, mouseY, horizontalAmount, verticalAmount);
         }
      }

      if (this.isHovered(mouseX, mouseY)) {
         this.e.scroll(verticalAmount);
      }

      super.onScroll(mouseX, mouseY, horizontalAmount, verticalAmount);
   }

   @Override
   public void onKeyPressed(int keyCode, int scanCode, int modifiers) {
      for (dz var5 : this.b) {
         if (var5.getOpacity() != 0.0F) {
            var5.onKeyPressed(keyCode, scanCode, modifiers);
         }
      }

      super.onKeyPressed(keyCode, scanCode, modifiers);
   }

   @Override
   public boolean charTyped(char chr, int modifiers) {
      for (dz var4 : this.b) {
         if (var4.getOpacity() != 0.0F) {
            var4.charTyped(chr, modifiers);
         }
      }

      return super.charTyped(chr, modifiers);
   }

   @Override
   public float getHeight() {
      float var1 = 18.0F;

      for (dz var3 : this.b) {
         var1 += var3.getHeight() * var3.getOpacity();
      }

      return this.height = Math.min(200.0F, var1 + 28.0F + 5.0F);
   }

   @Generated
   public dT getToggle() {
      return this.a;
   }

   @Generated
   public List<dz> getComponents() {
      return this.b;
   }

   @Generated
   public dZ getAnimation() {
      return this.c;
   }

   @Generated
   public boolean isShowing() {
      return this.d;
   }

   @Generated
   public void setShowing(boolean showing) {
      this.d = showing;
   }
}
