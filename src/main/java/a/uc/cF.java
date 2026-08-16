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
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.ui.components.popup.CheckBoxAction;
import nesquik.mytheria.utility.animation.base.Easing;

public class cF extends cD {
   private boolean a;
   private final String b;
   private final dZ c = new dZ(300L, Easing.FIGMA_EASE_IN_OUT);
   private final dZ d = new dZ(300L, Easing.FIGMA_EASE_IN_OUT);
   private CheckBoxAction e;

   public cF(String text) {
      this.b = text;
   }

   @Override
   public void renderComponent(UIContext context) {
      Font var2 = Fonts.REGULAR.getFont(8.0F);
      float var3 = 8.0F;
      float var4 = var2.height();
      this.c.update(this.isHovered(context.getMouseX(), context.getMouseY()));
      this.d.update(this.a ? 1.0F : 0.0F);
      if (this.isHovered(context.getMouseX(), context.getMouseY())) {
         eo.set(en.HAND);
      }

      context.drawFadeoutText(
         var2,
         this.b,
         this.x + var3,
         this.y + er.getMiddleOfBox(var4, this.height),
         ec.getTextColor().withAlpha(RenderSystem.getShaderColor()[3] * 255.0F * (0.75F + 0.25F * this.d.getValue() + 0.25F * this.c.getValue())),
         0.8F,
         1.0F,
         this.width - 12.0F - 12.0F * this.d.getValue()
      );
      float var5 = this.d.getValue() * (RenderSystem.getShaderColor()[3] * 255.0F);
      if (this.d.getValue() >= 0.0F) {
         context.drawTexture(
            Mytheria.id("icons/check.png"),
            this.x + this.width - 13.0F - this.d.getValue() * 2.0F,
            this.y + 7.0F,
            6.0F,
            6.0F,
            ec.getTextColor().withAlpha(var5)
         );
      }
   }

   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      if (this.isHovered(mouseX, mouseY) && button == MouseButton.LEFT) {
         this.a = !this.a;
         if (this.e != null) {
            this.e.handleAction(this.a);
         }
      }

      super.onMouseClicked(mouseX, mouseY, button);
   }

   @Override
   public float getHeight() {
      return this.height = 19.0F;
   }

   public cF enabled(boolean value) {
      this.a = value;
      return this;
   }

   public cF action(CheckBoxAction action) {
      this.e = action;
      return this;
   }
}
