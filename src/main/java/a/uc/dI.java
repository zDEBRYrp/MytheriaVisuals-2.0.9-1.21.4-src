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
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.CustomComponent;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Font;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.utility.animation.base.Easing;

public class dI extends dz<cn> {
   private cA a;
   private cn.a b;
   private final fO c = new fO();
   private boolean d;

   public dI(cn setting, CustomComponent parent) {
      super(setting, parent);
      ArrayList var3 = new ArrayList();
      setting.getValues().forEach(sel -> {
         if (sel.isSelected()) {
            var3.add(sel);
         }
      });
      setting.getSelectedValues().clear();
      setting.getSelectedValues().addAll(var3);
   }

   @Override
   public void renderComponent(UIContext context) {
      if (!this.d) {
         for (cn.a var3 : this.setting.getValues()) {
            var3.setEnablePenis(new fA(Mytheria.id("penises/check_enable.penis")));
            var3.setDisablePenis(new fA(Mytheria.id("penises/check_disable.penis")));
            var3.setLastState(var3.isSelected());
            var3.setCurrentPenis(var3.isLastState() ? var3.getEnablePenis() : var3.getDisablePenis());
            if (var3.isLastState()) {
               var3.getEnablePenis().playOnce();
            } else {
               var3.getDisablePenis().setFrame(0);
               var3.getDisablePenis().stop();
            }
         }

         this.d = true;
      }

      float var16 = this.x + 9.0F;
      float var17 = this.y + 1.0F;
      float var4 = this.width - 18.0F;
      Font var5 = Fonts.REGULAR.getFont(8.0F);
      float var6 = 10.0F;
      float var7 = Fonts.REGULAR.getFont(7.0F).height();
      float var8 = 19.0F;
      this.hoverAnimation.update(this.isHovered(context.getMouseX(), context.getMouseY()));
      String var9 = String.format(" %s", av.translate("setting_of") + " " + this.setting.getValues().size());
      if (this.a == null) {
         this.a = new cA(Fonts.MEDIUM.getFont(7.0F), 5.0F, 500L, Easing.BAKEK);
      }

      context.drawFadeoutText(
         var5,
         av.translate(this.setting.getName()),
         this.x + var6,
         var17 - 1.0F + er.getMiddleOfBox(var5.height(), var8),
         ec.getTextColor().withAlpha(255.0F * (0.75F + 0.25F * this.hoverAnimation.getValue())),
         0.8F,
         1.0F,
         this.getParent().getWidth() - var6 - Fonts.REGULAR.getFont(7.0F).width(var9) - this.a.getWidth() - 10.0F
      );
      this.a.settings(false, ec.getTextColor().withAlpha(255.0F * (0.75F + 0.25F * this.hoverAnimation.getValue())));
      this.a.update(this.setting.getSelectedValues().size());
      this.a.pos(var16 + var4 - Fonts.REGULAR.getFont(7.0F).width(var9) - this.a.getWidth(), var17 - 1.0F + er.getMiddleOfBox(var7, var8));
      this.a.render(context);
      context.drawRightText(
         Fonts.REGULAR.getFont(7.0F),
         var9,
         var16 + var4,
         var17 - 1.0F + er.getMiddleOfBox(var7, var8),
         ec.getTextColor().withAlpha(255.0F * (0.75F + 0.25F * this.hoverAnimation.getValue()))
      );
      context.drawRoundedRect(
         var16 - 1.0F, var17 + 17.0F, var4 + 2.0F, 8 + this.setting.getValues().size() * 12, BorderRadius.all(6.0F), ec.getBackgroundColor().withAlpha(76.5F)
      );
      float var10 = 0.0F;

      for (cn.a var12 : this.setting.getValues()) {
         if (!var12.isHidden()) {
            boolean var13 = var12.isSelected();
            if (var13 != var12.isLastState()) {
               if (var13) {
                  var12.setCurrentPenis(var12.getEnablePenis());
               } else {
                  var12.setCurrentPenis(var12.getDisablePenis());
               }

               var12.getCurrentPenis().playOnce();
               var12.setLastState(var13);
            }

            var12.getCurrentPenis().update();
            float var14 = this.b == var12
               ? Math.clamp(context.getMouseY() - 2, var17 + 18.0F, var17 + 20.0F + this.setting.getValues().size() * 12)
               : var17 + 24.0F + var10;
            boolean var15 = er.isHovered(var16 - 1.0F, var14 - 4.0F, var4 + 2.0F, 12.0, context.getMouseX(), context.getMouseY());
            var12.getYAnim().setEasing(Easing.BAKEK_SMALLER);
            var12.getYAnim().update(var14 - var17);
            var12.setYFactor(var14);
            if (var15 && this.b != var12 && !var12.isAlwaysEnabled()) {
               eo.set(en.HAND);
            }

            var12.getHoverAnimation().update(var15);
            var12.getActiveAnimation().update(var12.isSelected());
            if (this.setting.isDraggable()) {
               context.drawTexture(Mytheria.id("icons/hud/drag.png"), var16 + 7.0F, var17 + var12.getYAnim().getValue(), 6.0F, 6.0F, ec.getTextColor());
            }

            if (er.isHovered(var16, var14 - 2.0F, 17.0, 10.0, context) || var12 == this.b) {
               eo.set(en.ARROW_VERTICAL);
            }

            context.drawFadeoutText(
               Fonts.REGULAR.getFont(7.0F),
               av.translate(var12.getName()),
               var16 + (this.setting.isDraggable() ? 18 : 7),
               var17 + var12.getYAnim().getValue() + 0.5F,
               ec.getTextColor().withAlpha(255.0F * (0.75F + 0.25F * var12.getHoverAnimation().getValue() + 0.25F * var12.getActiveAnimation().getValue())),
               0.8F,
               1.0F,
               var4 - 12.0F - var12.getActiveAnimation().getValue() * 10.0F
            );
            if (var12.getActiveAnimation().getValue() > 0.0F || var12.getCurrentPenis().isPlaying()) {
               fj.drawAnimationSprite(
                  context.getMatrices(),
                  var12.getCurrentPenis().getCurrentSprite(),
                  var16 + var4 - 11.0F - var12.getActiveAnimation().getValue() * 2.0F,
                  var17 + var12.getYAnim().getValue(),
                  6.0F,
                  6.0F,
                  ec.getTextColor().mulAlpha(0.1F + 0.9F * var12.getActiveAnimation().getValue())
               );
            }

            var10 += 12.0F;
         }
      }

      if (this.c.finished(100L)) {
         this.setting.getValues().sort(Comparator.comparingDouble(cn.a::getYFactor));
         this.c.reset();
      }
   }

   @Override
   public void drawSplit(UIContext context) {
      float var2 = 0.5F;
      context.drawRect(this.x, this.y + this.height, this.width, var2, ec.getTextColor().withAlpha(5.1F));
   }

   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      if (button == MouseButton.LEFT) {
         float var6 = this.x + 9.0F;
         float var7 = this.y + 1.0F;
         float var8 = 0.0F;

         for (cn.a var10 : this.setting.getValues()) {
            if (!var10.isHidden()) {
               boolean var11 = er.isHovered(var6 - 1.0F, var7 + 20.0F + var8, this.width - 2.0F, 12.0, mouseX, mouseY);
               if (er.isHovered(var6, var7 + 22.0F + var8, 17.0, 10.0, mouseX, mouseY) && this.setting.isDraggable()) {
                  this.b = var10;
               } else if (var11) {
                  var10.toggle();
               }

               var8 += 12.0F;
            }
         }

         super.onMouseClicked(mouseX, mouseY, button);
      }
   }

   @Override
   public void onMouseReleased(double mouseX, double mouseY, MouseButton button) {
      this.b = null;
      super.onMouseReleased(mouseX, mouseY, button);
   }

   @Override
   public float getHeight() {
      return this.height = 31 + this.setting.getValues().size() * 12;
   }
}
