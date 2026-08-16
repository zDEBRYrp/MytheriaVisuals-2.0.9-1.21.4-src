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

import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.CustomComponent;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.utility.animation.base.Easing;

public class dQ extends CustomComponent {
   private final dZ a = new dZ(300L, Easing.FIGMA_EASE_IN_OUT);
   private final dZ b = new dZ(300L, Easing.FIGMA_EASE_IN_OUT);
   private final dZ c = new dZ(300L, Easing.FIGMA_EASE_IN_OUT);
   private final dZ d = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
   private final cP e;

   public dQ(cP element) {
      this.e = element;
   }

   @Override
   public void renderComponent(UIContext context) {
      this.d.setEasing(Easing.QUARTIC_OUT);
      this.d.update(this.e.isShowing());
      this.c.update(this.isHovered(context.getMouseX(), context.getMouseY()));
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
      String var2 = av.translate(this.e.getName());
      context.drawText(
         Fonts.MEDIUM.getFont(7.0F),
         var2,
         this.x + 7.0F,
         this.y + 8.0F,
         ec.getTextColor().mulAlpha(0.75F + 0.25F * this.d.getValue() + 0.25F * this.c.getValue()).mulAlpha(this.a.getValue())
      );
   }

   public void renderRegular(UIContext context) {
      String var2 = this.e.getName() + ".description";
      String var3 = av.translate(var2);
      if (var3.equals(var2)) {
         var3 = this.a(this.e.getName());
      }

      context.drawText(Fonts.REGULAR.getFont(6.0F), var3, this.x + 7.0F, this.y + 16.0F, ec.getTextColor().mulAlpha(0.5F * this.a.getValue()));
   }

   private String a(String hudName) {
      return switch (hudName) {
         case "hud.hotbar" -> "Display custom hotbar";
         case "hud.armor" -> "Show armor durability";
         case "hud.inventory" -> "Display inventory preview";
         case "hud.effects" -> "Active potion effects";
         case "hud.keybinds" -> "Show active keybinds";
         case "hud.targethud" -> "Target information display";
         case "hud.watermark" -> "Client watermark";
         case "hud.cooldowns" -> "Item cooldown tracker";
         case "hud.dynamic_island" -> "Dynamic status island";
         default -> "HUD Element";
      };
   }

   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      if (button == MouseButton.LEFT) {
         this.e.setShowing(!this.e.isShowing());
      }
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
   public cP getElement() {
      return this.e;
   }
}
