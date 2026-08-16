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
import java.util.List;
import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.CustomComponent;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.systems.modules.Module;
import nesquik.mytheria.utility.animation.base.Easing;
import nesquik.mytheria.utility.interfaces.IScaledResolution;

public class dN extends CustomComponent {
   private final dZ a = new dZ(300L, Easing.FIGMA_EASE_IN_OUT);
   private final dZ b = new dZ(300L, Easing.FIGMA_EASE_IN_OUT);
   private final dZ c = new dZ(300L, Easing.FIGMA_EASE_IN_OUT);
   private final dZ d = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
   private final Module e;
   private final dL f;
   private boolean g;
   private final dZ h = new dZ(100L, Easing.FIGMA_EASE_IN_OUT);
   private final dZ i = new dZ(500L, Easing.FIGMA_EASE_IN_OUT);
   private final ea j = new ea(500L, eb.WHITE, Easing.FIGMA_EASE_IN_OUT);
   private boolean k;
   private boolean l;

   @Override
   public void renderComponent(UIContext context) {
      this.d.setEasing(Easing.QUARTIC_OUT);
      this.d.update(this.e.isEnabled());
      this.c.update(this.isHovered(context.getMouseX(), context.getMouseY()));
      this.i.update(this.k);
      this.j.update(this.k ? new eb(255.0F, 150.0F, 150.0F) : Mytheria.getInstance().getThemeManager().getCurrentTheme().getTextColor());
      this.h.update(this.k ? (this.l ? 1.0F : -1.0F) : 0.0F);
      if (this.i.getValue() == 1.0F) {
         this.k = false;
      }

      if (this.h.getValue() == 1.0F) {
         this.l = false;
      }

      if (this.h.getValue() == -1.0F) {
         this.l = true;
      }

      boolean var2 = Mytheria.getInstance().getThemeManager().getCurrentTheme() == ct.DARK;
      context.drawRoundedRect(
         this.x,
         this.y,
         this.width,
         this.height,
         BorderRadius.all(6.0F),
         (!var2 ? ec.getAdditionalColor().mulAlpha(0.3F) : ec.getBackgroundColor().mulAlpha(0.3F)).mulAlpha(this.a.getValue())
      );
   }

   public void renderRounds(UIContext context) {
      eb var2 = ec.getAccentColor();
      eb var3 = new eb(var2.getRed() * 0.6F + 102.0F, var2.getGreen() * 0.6F + 102.0F, var2.getBlue() * 0.6F + 102.0F, 255.0F);
      context.drawRoundedRect(
         this.x + this.width - 25.0F,
         this.y + 10.5F,
         14.5F,
         7.0F,
         BorderRadius.all(2.75F),
         ec.getAdditionalColor().mix(eb.BLACK, 0.3F).mix(var3, this.d.getValue()).mulAlpha(this.a.getValue())
      );
   }

   public void renderInto(UIContext context) {
      context.drawRoundedRect(
         this.x + this.width - 25.0F + 1.0F + 5.0F * this.d.getValue(),
         this.y + 11.5F,
         7.5F,
         5.0F,
         BorderRadius.all(1.75F),
         ec.WHITE.mulAlpha(this.a.getValue())
      );
   }

   public void renderMedium(UIContext context) {
      int var2 = this.e.getKey();
      String var3;
      if (var2 == -1) {
         var3 = av.translate("menu.binding");
      } else {
         var3 = av.translate("key") + ": " + ej.getKeyName(var2);
      }

      context.drawText(
         Fonts.MEDIUM.getFont(7.0F),
         this.g ? var3 : this.e.getName(),
         this.x + 7.0F + this.h.getValue(),
         this.y + 8.0F,
         this.j
            .getColor()
            .mulAlpha(RenderSystem.getShaderColor()[3] * 0.75F + 0.25F * this.d.getValue() + 0.25F * this.c.getValue())
            .mulAlpha(this.a.getValue())
      );
   }

   public void renderRegular(UIContext context) {
      context.drawText(
         Fonts.REGULAR.getFont(6.0F), this.e.getDescription(), this.x + 7.0F, this.y + 16.0F, ec.getTextColor().mulAlpha(0.5F * this.a.getValue())
      );
   }

   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      if (this.g && button != MouseButton.LEFT && button != MouseButton.RIGHT) {
         this.e.setKey(button.getButtonIndex());
         this.g = false;
      } else {
         switch (button) {
            case LEFT:
               this.e.toggle();
               break;
            case MIDDLE:
               for (dN var7 : this.f.getModules()) {
                  var7.setBindingMode(false);
               }

               this.g = true;
               break;
            case RIGHT:
               this.open();
         }
      }
   }

   @Override
   public void onKeyPressed(int keyCode, int scanCode, int modifiers) {
      if (this.g) {
         if (keyCode != 256 && keyCode != 261) {
            this.e.setKey(keyCode);
         } else {
            this.e.setKey(-1);
         }

         this.g = false;
         if (Mytheria.getInstance().getMenuScreen() instanceof dw var4) {
            var4.getSearchField().setFocused(false);
         }
      }

      super.onKeyPressed(keyCode, scanCode, modifiers);
   }

   public void open() {
      if (this.e.getSettings().isEmpty()) {
         ba var1 = Mytheria.getInstance().getModuleManager().getModuleSafe(ba.class);
         if (var1 != null && var1.isEnabled() && !this.k) {
            fL.CRITICAL.play(1.0F, 1.0F);
         }

         this.k = true;
         this.l = true;
      } else {
         List<dO> var2;
         fw var11;
         if (Mytheria.getInstance().getMenuScreen() instanceof dM var4) {
            var11 = var4.getMenuWindow();
            var2 = var4.getWindows();
         } else {
            if (!(Mytheria.getInstance().getMenuScreen() instanceof dP var3)) {
               return;
            }

            var11 = var3.getMenuWindow();
            var2 = var3.getWindows();
         }

         float var12 = var11.getX() + var11.getWidth() + 10.0F;
         float var15 = var11.getY();
         float var6 = 152.0F;
         if (!var2.isEmpty()) {
            float var7 = ((dO)var2.getLast()).getY() + ((dO)var2.getLast()).getHeight();
            if (var7 < var11.getY() + var11.getHeight()) {
               var15 = var7 + 10.0F;
               var12 = ((dO)var2.getLast()).getX();
            } else {
               var12 = ((dO)var2.getLast()).getX() + ((dO)var2.getLast()).getWidth() + 10.0F;
            }
         }

         for (dO var8 : var2) {
            if (var8.getModule() == this) {
               return;
            }
         }

         if ((var2.isEmpty() || !(var12 + var6 > IScaledResolution.sr.getScaledWidth())) && var2.size() <= 4) {
            var2.add(new dO(this, var12, var15, var6));
         } else {
            var12 = ((dO)var2.getFirst()).getX();
            var15 = ((dO)var2.getFirst()).getY();
            ((dO)var2.getFirst()).setShowing(false);
            dO var18 = new dO(this, var12, var15, var6);
            var2.addFirst(var18);
            float var19 = var15 + var18.getHeight() + 10.0F;

            for (dO var10 : var2) {
               if (var10.getX() == var12 && var10.getModule() != this) {
                  var10.setY(var19);
                  var19 += var10.getHeight() + 10.0F;
               }
            }
         }

         this.a.setValue(0.0F);
      }
   }

   public boolean isBinding() {
      return false;
   }

   @Generated
   public dN(Module module, dL category) {
      this.e = module;
      this.f = category;
   }

   @Generated
   public dZ getVisible() {
      return this.a;
   }

   @Generated
   public dZ getOffset() {
      return this.b;
   }

   @Generated
   public Module getModule() {
      return this.e;
   }

   @Generated
   public void setBindingMode(boolean bindingMode) {
      this.g = bindingMode;
   }
}
