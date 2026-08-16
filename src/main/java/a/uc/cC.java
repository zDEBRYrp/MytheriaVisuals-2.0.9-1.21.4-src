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
import nesquik.mytheria.framework.base.CustomComponent;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.systems.setting.Setting;
import nesquik.mytheria.ui.components.popup.CheckBoxAction;
import nesquik.mytheria.ui.components.popup.PopupAction;
import nesquik.mytheria.utility.animation.base.Easing;
import net.minecraft.client.render.VertexFormats;

public class cC extends CustomComponent {
   private final dZ a = new dZ(300L, 0.0F, Easing.BAKEK_SIZE);
   private final dZ b = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
   private final List<CustomComponent> c = new ArrayList<>();
   private boolean d;
   private final float e;
   private Runnable f = () -> {};
   private boolean g;

   public cC(float x, float y) {
      this(x, y, 90.0F);
   }

   public cC(float x, float y, float width) {
      this(x, y, width, 2.0F);
   }

   public cC(float x, float y, float width, float offsetFactor) {
      this.x = x;
      this.y = y;
      this.width = width;
      this.e = offsetFactor;
      this.d = true;
   }

   @Override
   public void renderComponent(UIContext context) {
      this.a.setEasing(this.d ? Easing.BAKEK : Easing.BAKEK_BACK);
      this.a.update(this.d);
      this.b.update(this.a.getValue() >= 0.6F);
      this.height = 0.0F;

      for (CustomComponent var3 : this.c) {
         if (var3 instanceof dz) {
            var3.set(this.x - 2.0F, this.y + this.height, this.width + 4.0F, 0.0F);
         } else {
            var3.set(this.x, this.y + this.height, this.width, 0.0F);
         }

         this.height = this.height + (var3.getHeight() + 0.5F) * (var3 instanceof dz var4 ? var4.getOpacity() : 1.0F);
      }

      this.height += 2.0F;
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, Math.min(1.0F, this.a.getValue()));
      fl.scale(context.getMatrices(), this.x + this.width / this.e, this.y + this.height / this.e, 0.5F + this.a.getValue() * 0.5F);
      context.drawShadow(this.x, this.y, this.width, this.height, 15.0F, BorderRadius.all(6.0F), eb.BLACK.withAlpha(127.5F));
      if (bJ.showGlass()) {
         context.drawLiquidGlass(
            this.x,
            this.y,
            this.width,
            this.height,
            bJ.getGlassBlur(),
            bJ.getDistortion(),
            BorderRadius.all(bJ.getGlassRounding()),
            ec.getLiquidGlassColor().withAlpha(255.0F * this.a.getValue() * bJ.getGlassAlpha())
         );
         context.drawRoundedRect(
            this.x,
            this.y,
            this.width,
            this.height,
            BorderRadius.all(bJ.getGlassRounding()),
            ec.getBackgroundColor().withAlpha(255.0F * (0.8F - 0.6F * bJ.glass()) * this.a.getValue())
         );
      } else {
         if (bJ.showMinimalizm()) {
            context.drawBlurredRect(
               this.x, this.y, this.width, this.height, 11.25F, 7.0F, BorderRadius.all(6.0F), eb.WHITE.withAlpha(255.0F * this.a.getValue() * bJ.minimalizm())
            );
         }

         context.drawRoundedRect(this.x, this.y, this.width, this.height, BorderRadius.all(6.0F), bJ.getBackgroundColor());
      }

      for (CustomComponent var8 : this.c) {
         if (var8 instanceof dz var10) {
            var10.getVisibilityAnimation().update(var10.getSetting().isVisible() ? 1.0F : 0.0F);
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var10.getOpacity() * this.a.getValue());
         }

         int var11 = this.c.indexOf(var8);
         if (var11 != 0 && !(var8 instanceof cG) && !(this.c.get(var11 - 1) instanceof cG)) {
            float var5 = 0.5F;
            context.drawRect(this.x, var8.getY() - 1.0F, this.width, var5, ec.getTextColor().withAlpha(5.1F));
         }

         var8.render(context);
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, this.a.getValue());
      }

      for (CustomComponent var9 : this.c) {
         if (var9 instanceof dz var12) {
            fq var13 = new fq(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.REGULAR);
            var12.drawRegular8(context);
            var13.draw();
         }
      }

      fl.end(context.getMatrices());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public cC setting(Setting setting) {
      dz var2 = er.settinge(setting, this);
      if (var2 != null) {
         this.c.add(var2);
      }

      return this;
   }

   public cC add(CustomComponent component) {
      this.c.add(component);
      return this;
   }

   public cC text(String text) {
      this.c.add(new cH(text));
      return this;
   }

   public cC title(String text) {
      this.c.add(new cI(text));
      return this;
   }

   public cC separator() {
      this.c.add(new cG());
      return this;
   }

   public cC checkbox(String text, boolean enabled) {
      this.c.add(new cF(text).enabled(enabled));
      return this;
   }

   public cC checkbox(String text, boolean enabled, CheckBoxAction action) {
      this.c.add(new cF(text).enabled(enabled).action(action));
      return this;
   }

   public cC button(String text, String icon, PopupAction runnable) {
      this.c.add(new cE(this, text, icon, runnable));
      return this;
   }

   public cC onClose(Runnable onClose) {
      this.f = onClose;
      return this;
   }

   public void setShowing(boolean showing) {
      this.d = showing;
      if (!showing && !this.g) {
         this.f.run();
         this.g = true;
      }
   }

   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      for (CustomComponent var7 : this.c) {
         if (!(var7 instanceof dz var8 && var8.getOpacity() == 0.0F)) {
            var7.onMouseClicked(mouseX, mouseY, button);
         }
      }

      super.onMouseClicked(mouseX, mouseY, button);
   }

   @Override
   public void onMouseReleased(double mouseX, double mouseY, MouseButton button) {
      for (CustomComponent var7 : this.c) {
         if (!(var7 instanceof dz var8 && var8.getOpacity() == 0.0F)) {
            var7.onMouseReleased(mouseX, mouseY, button);
         }
      }

      super.onMouseReleased(mouseX, mouseY, button);
   }

   @Override
   public void onScroll(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      for (CustomComponent var10 : this.c) {
         if (!(var10 instanceof dz var11 && var11.getOpacity() == 0.0F)) {
            var10.onScroll(mouseX, mouseY, horizontalAmount, verticalAmount);
         }
      }

      super.onScroll(mouseX, mouseY, horizontalAmount, verticalAmount);
   }

   @Override
   public void onKeyPressed(int keyCode, int scanCode, int modifiers) {
      for (CustomComponent var5 : this.c) {
         if (!(var5 instanceof dz var6 && var6.getOpacity() == 0.0F)) {
            var5.onKeyPressed(keyCode, scanCode, modifiers);
         }
      }

      super.onKeyPressed(keyCode, scanCode, modifiers);
   }

   @Override
   public boolean charTyped(char chr, int modifiers) {
      for (CustomComponent var4 : this.c) {
         if (!(var4 instanceof dz var5 && var5.getOpacity() == 0.0F)) {
            var4.charTyped(chr, modifiers);
         }
      }

      return super.charTyped(chr, modifiers);
   }

   @Generated
   public dZ getAnimation() {
      return this.a;
   }

   @Generated
   public boolean isShowing() {
      return this.d;
   }
}
