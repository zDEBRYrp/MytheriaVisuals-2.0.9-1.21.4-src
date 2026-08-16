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
import nesquik.mytheria.framework.base.CustomComponent;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Font;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.MouseButton;

public class dF extends dz<ck> {
   private boolean a;

   public dF(ck setting, CustomComponent parent) {
      super(setting, parent);
   }

   @Override
   public void renderComponent(UIContext context) {
      if (!this.a) {
         for (ck.a var3 : this.setting.getValues()) {
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

         this.a = true;
      }

      float var13 = this.x + 9.0F;
      float var14 = this.y + 1.0F;
      float var4 = this.width - 18.0F;
      Font var5 = Fonts.REGULAR.getFont(8.0F);
      float var6 = 10.0F;
      float var7 = 19.0F;
      this.hoverAnimation.update(this.isHovered(context.getMouseX(), context.getMouseY()));
      context.drawFadeoutText(
         var5,
         av.translate(this.getSetting().getName()),
         this.x + var6,
         var14 - 1.0F + er.getMiddleOfBox(var5.height(), var7),
         ec.getTextColor().withAlpha(255.0F * (0.75F + 0.25F * this.hoverAnimation.getValue())),
         0.8F,
         1.0F,
         this.getParent().getWidth() - var6
      );
      context.drawRoundedRect(
         var13 - 1.0F, var14 + 17.0F, var4 + 2.0F, 8 + this.setting.getValues().size() * 12, BorderRadius.all(6.0F), ec.getBackgroundColor().withAlpha(76.5F)
      );
      float var8 = 0.0F;

      for (ck.a var10 : this.setting.getValues()) {
         if (!var10.isHidden()) {
            boolean var11 = var10.isSelected();
            if (var11 != var10.isLastState()) {
               if (var11) {
                  var10.setCurrentPenis(var10.getEnablePenis());
               } else {
                  var10.setCurrentPenis(var10.getDisablePenis());
               }

               var10.getCurrentPenis().playOnce();
               var10.setLastState(var11);
            }

            var10.getCurrentPenis().update();
            boolean var12 = er.isHovered(var13 - 1.0F, var14 + 20.0F + var8, var4 + 2.0F, 12.0, context.getMouseX(), context.getMouseY());
            if (var12) {
               eo.set(en.HAND);
            }

            var10.getHoverAnimation().update(var12);
            var10.getActiveAnimation().update(var10.isSelected());
            context.drawFadeoutText(
               Fonts.REGULAR.getFont(7.0F),
               av.translate(var10.getName()),
               var13 + 7.0F,
               var14 + 24.5F + var8,
               ec.getTextColor().withAlpha(255.0F * (0.75F + 0.25F * var10.getHoverAnimation().getValue() + 0.25F * var10.getActiveAnimation().getValue())),
               0.8F,
               1.0F,
               var4 - 12.0F - var10.getActiveAnimation().getValue() * 10.0F
            );
            if (var10.getActiveAnimation().getValue() > 0.0F || var10.getCurrentPenis().isPlaying()) {
               fj.drawAnimationSprite(
                  context.getMatrices(),
                  var10.getCurrentPenis().getCurrentSprite(),
                  var13 + var4 - 11.0F - var10.getActiveAnimation().getValue() * 2.0F,
                  var14 + 24.0F + var8,
                  6.0F,
                  6.0F,
                  ec.getTextColor().mulAlpha(0.1F + 0.9F * var10.getActiveAnimation().getValue())
               );
            }

            var8 += 12.0F;
         }
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
         float var8 = this.width - 18.0F;
         float var9 = 0.0F;

         for (ck.a var11 : this.setting.getValues()) {
            if (!var11.isHidden()) {
               boolean var12 = er.isHovered(var6 - 1.0F, var7 + 20.0F + var9, var8 + 2.0F, 12.0, mouseX, mouseY);
               if (var12) {
                  var11.select();
                  break;
               }

               var9 += 12.0F;
            }
         }

         super.onMouseClicked(mouseX, mouseY, button);
      }
   }

   @Override
   public float getHeight() {
      return this.height = 31 + this.setting.getValues().size() * 12;
   }
}
