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
import java.util.List;
import java.util.Objects;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.CustomComponent;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.systems.setting.Setting;
import nesquik.mytheria.utility.animation.base.Easing;

public class aD extends CustomComponent {
   private final dZ a = new dZ(300L, Easing.BAKEK);
   private final es b = new es();
   private final cK c;
   private final dZ d = new dZ(300L, Easing.BAKEK_SMALLER);

   public aD() {
      this.c = new cK(Fonts.REGULAR.getFont(8.0F));
      this.c.setPreview(av.translate("type_name"));
   }

   @Override
   public void renderComponent(UIContext context) {
      az var2 = Mytheria.getInstance().getSwingManager();
      aG var3 = Mytheria.getInstance().getSwingPresetManager();
      List<aF> var4 = var3.getSwingPresetFiles();
      float var5 = this.x + 8.0F;
      float var6 = this.y - 1.0F;
      float var7 = this.width - 16.0F;
      this.b.update();
      context.drawRoundedRect(
         var5 - 1.0F, var6 + 7.0F, var7 + 2.0F, 8.0F + this.height - 46.0F, BorderRadius.all(6.0F), ec.getBackgroundColor().withAlpha(76.5F)
      );
      fm.push(context.getMatrices(), var5 - 1.0F, var6 + 7.5F, var7 + 2.0F, 7.0F + this.height - 46.0F);
      float var8 = 0.0F;

      for (aE var10 : Mytheria.getInstance().getSwingManager().getPresets()) {
         float var11 = (float)(var6 + 14.0F + var8 - this.b.getValue());
         boolean var12 = er.isHovered(var5 - 1.0F, var6 + 7.5F, var7 + 2.0F, 7.0F + this.height - 46.0F, context)
            && er.isHovered(var5 - 1.0F, var11 - 4.0F, var7 + 2.0F, 12.0, context.getMouseX(), context.getMouseY());
         var10.getHoverAnimation().update(var12);
         var10.getActiveAnimation().update(Objects.equals(var10.getName(), var2.getCurrent()));
         context.drawFadeoutText(
            Fonts.REGULAR.getFont(7.0F),
            av.translate(var10.getName()),
            var5 + 7.0F,
            var11 + 0.5F,
            ec.getTextColor().withAlpha(255.0F * (0.75F + 0.25F * var10.getHoverAnimation().getValue() + 0.25F * var10.getActiveAnimation().getValue())),
            0.8F,
            1.0F,
            var7 - 12.0F - var10.getActiveAnimation().getValue() * 10.0F
         );
         if (var12) {
            eo.set(en.HAND);
         }

         if (var10.getActiveAnimation().getValue() >= 0.0F) {
            context.drawTexture(
               Mytheria.id("icons/check.png"),
               var5 + var7 - 11.0F - var10.getActiveAnimation().getValue() * 2.0F,
               var11,
               6.0F,
               6.0F,
               ec.getTextColor().withAlpha(var10.getActiveAnimation().getValue() * 255.0F)
            );
         }

         var8 += 12.0F;
      }

      for (aF var14 : var4) {
         if (!var14.getFileName().equals("autosave")) {
            float var15 = (float)(var6 + 14.0F + var8 - this.b.getValue());
            boolean var16 = er.isHovered(var5 - 1.0F, var6 + 7.5F, var7 + 2.0F, 7.0F + this.height - 46.0F, context)
               && er.isHovered(var5 - 1.0F, var15 - 4.0F, var7 + 2.0F, 12.0, context.getMouseX(), context.getMouseY());
            var14.getHoverAnimation().update(var16);
            var14.getActiveAnimation().update(Objects.equals(var14.getFileName(), var2.getCurrent()));
            context.drawFadeoutText(
               Fonts.REGULAR.getFont(7.0F),
               var14.getFileName(),
               var5 + 7.0F + 10.0F * var14.getHoverAnimation().getValue(),
               var15 + 0.5F,
               ec.getTextColor().withAlpha(255.0F * (0.75F + 0.25F * var14.getHoverAnimation().getValue() + 0.25F * var14.getActiveAnimation().getValue())),
               0.8F,
               1.0F,
               var7 - 12.0F - var14.getActiveAnimation().getValue() * 10.0F - 10.0F * var14.getHoverAnimation().getValue()
            );
            if (var16) {
               eo.set(en.HAND);
            }

            if (var14.getHoverAnimation().getValue() >= 0.0F) {
               context.drawTexture(
                  Mytheria.id("icons/trash.png"),
                  var5 + 7.0F * var14.getHoverAnimation().getValue(),
                  var15,
                  6.0F,
                  6.0F,
                  ec.getTextColor().withAlpha(var14.getHoverAnimation().getValue() * 255.0F)
               );
            }

            if (var14.getActiveAnimation().getValue() >= 0.0F) {
               context.drawTexture(
                  Mytheria.id("icons/check.png"),
                  var5 + var7 - 11.0F - var14.getActiveAnimation().getValue() * 2.0F,
                  var15,
                  6.0F,
                  6.0F,
                  ec.getTextColor().withAlpha(var14.getActiveAnimation().getValue() * 255.0F)
               );
            }

            var8 += 12.0F;
         }
      }

      fm.pop();
      context.drawRoundedRect(var5 - 1.0F, var6 + this.height - 25.0F, var7 + 2.0F, 20.0F, BorderRadius.all(6.0F), ec.getBackgroundColor().mulAlpha(0.3F));
      context.drawTexture(
         Mytheria.id("icons/add.png"),
         var5 + var7 - 2.0F * this.a.getValue() - 10.0F,
         var6 + this.height - 25.0F + 6.0F,
         8.0F,
         8.0F,
         ec.getTextColor().mulAlpha(this.a.getValue())
      );
      this.c.set(var5 - 1.0F, var6 + this.height - 25.0F, var7 + 2.0F - 12.0F, 20.0F);
      this.c.setAlpha(1.0F);
      this.c.render(context);
      this.a.update(!this.c.getBuiltText().isBlank());
      if (er.isHovered(var5 + var7 - 2.0F - 10.0F, var6 + this.height - 25.0F + 6.0F, 8.0, 8.0, context) && this.a.getValue() > 0.0F) {
         eo.set(en.HAND);
      }

      this.b.setMax(-var8 + this.height - 20.0F - 25.0F);
   }

   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      this.c.onMouseClicked(mouseX, mouseY, button);
      az var6 = Mytheria.getInstance().getSwingManager();
      aG var7 = Mytheria.getInstance().getSwingPresetManager();
      List<aF> var8 = var7.getSwingPresetFiles();
      float var9 = this.x + 8.0F;
      float var10 = this.y - 1.0F;
      float var11 = this.width - 16.0F;
      float var12 = 0.0F;

      for (aE var14 : Mytheria.getInstance().getSwingManager().getPresets()) {
         float var15 = (float)(var10 + 14.0F + var12 - this.b.getValue());
         boolean var16 = er.isHovered(var9 - 1.0F, var10 + 7.5F, var11 + 2.0F, 7.0F + this.height - 46.0F, mouseX, mouseY)
            && er.isHovered(var9 - 1.0F, var15 - 4.0F, var11 + 2.0F, 12.0, mouseX, mouseY);
         if (var16 && button == MouseButton.LEFT) {
            if (var7.getCurrent() != null) {
               var7.getCurrent().save();
               var7.setCurrent(null);
            }

            var6.getBezier().start(var14.getBezierStart()).end(var14.getBezierEnd());
            var6.getBack().enabled(var14.isSwingBack());
            var6.getSpeed().setCurrentValue(var14.getSpeed());
            aA var17 = var6.getStartPhase();
            var17.getAnchorX().setCurrentValue(var14.getFrom().getAnchorX());
            var17.getAnchorY().setCurrentValue(var14.getFrom().getAnchorY());
            var17.getAnchorZ().setCurrentValue(var14.getFrom().getAnchorZ());
            var17.getMoveX().setCurrentValue(var14.getFrom().getMoveX());
            var17.getMoveY().setCurrentValue(var14.getFrom().getMoveY());
            var17.getMoveZ().setCurrentValue(var14.getFrom().getMoveZ());
            var17.getRotateX().setCurrentValue(var14.getFrom().getRotateX());
            var17.getRotateY().setCurrentValue(var14.getFrom().getRotateY());
            var17.getRotateZ().setCurrentValue(var14.getFrom().getRotateZ());
            aA var18 = var6.getEndPhase();
            var18.getAnchorX().setCurrentValue(var14.getTo().getAnchorX());
            var18.getAnchorY().setCurrentValue(var14.getTo().getAnchorY());
            var18.getAnchorZ().setCurrentValue(var14.getTo().getAnchorZ());
            var18.getMoveX().setCurrentValue(var14.getTo().getMoveX());
            var18.getMoveY().setCurrentValue(var14.getTo().getMoveY());
            var18.getMoveZ().setCurrentValue(var14.getTo().getMoveZ());
            var18.getRotateX().setCurrentValue(var14.getTo().getRotateX());
            var18.getRotateY().setCurrentValue(var14.getTo().getRotateY());
            var18.getRotateZ().setCurrentValue(var14.getTo().getRotateZ());
            var6.setCurrent(var14.getName());
         }

         var12 += 12.0F;
      }

      for (aF var20 : new ArrayList<>(var8)) {
         if (!var20.getFileName().equals("autosave")) {
            float var21 = (float)(var10 + 14.0F + var12 - this.b.getValue());
            boolean var22 = er.isHovered(var9 - 1.0F, var10 + 7.5F, var11 + 2.0F, 7.0F + this.height - 46.0F, mouseX, mouseY)
               && er.isHovered(var9 - 1.0F, var21 - 4.0F, var11 + 2.0F, 12.0, mouseX, mouseY);
            if (var22 && er.isHovered(var9 + 7.0F, var21, 6.0, 6.0, mouseX, mouseY) && button == MouseButton.LEFT) {
               var20.delete();
               var7.getSwingPresetFiles().remove(var20);
               if (var7.getCurrent() != null && var7.getCurrent().equals(var20)) {
                  var7.setCurrent(null);
                  var6.setCurrent(null);
               }
            } else if (var22 && button == MouseButton.LEFT) {
               if (var7.getCurrent() != null) {
                  var7.getCurrent().save();
               }

               var6.setCurrent(var20.getFileName());
               var7.setCurrent(var20);
               var20.load();
            }

            var12 += 12.0F;
         }
      }

      if (er.isHovered(var9 + var11 - 2.0F - 10.0F, var10 + this.height - 25.0F + 6.0F, 8.0, 8.0, mouseX, mouseY) && !this.c.getBuiltText().isBlank()) {
         this.a();
      }
   }

   private void a() {
      aG var1 = Mytheria.getInstance().getSwingPresetManager();
      az var2 = Mytheria.getInstance().getSwingManager();
      if (var1.getCurrent() != null) {
         var1.getCurrent().save();
      }

      var2.getBezier().start(0.5F, 1.0F).end(0.5F, 0.0F);
      var2.getBack().enabled(true);
      var2.getSpeed().setCurrentValue(2.0F);

      for (Setting var4 : Mytheria.getInstance().getSwingManager().getStartPhase().getSettings()) {
         if (var4 instanceof aA.a var5) {
            var5.setCurrentValue(0.0F);
         }
      }

      for (Setting var8 : Mytheria.getInstance().getSwingManager().getEndPhase().getSettings()) {
         if (var8 instanceof aA.a var10) {
            var10.setCurrentValue(0.0F);
         }
      }

      String var7 = this.c.getBuiltText();
      var1.createPreset(var7);
      aF var9 = var1.getPreset(var7);
      var1.setCurrent(var9);
      var2.setCurrent(var7);
      var9.save();
      this.c.clear();
   }

   @Override
   public void onMouseReleased(double mouseX, double mouseY, MouseButton button) {
      this.c.onMouseReleased(mouseX, mouseY, button);
   }

   @Override
   public void onKeyPressed(int keyCode, int scanCode, int modifiers) {
      if (keyCode == 257 && !this.c.getBuiltText().isBlank()) {
         this.a();
      } else {
         this.c.onKeyPressed(keyCode, scanCode, modifiers);
         if (this.isHovered(er.getMouse().getX(), er.getMouse().getY())) {
            this.b.onKeyPressed(keyCode);
         }
      }
   }

   @Override
   public boolean charTyped(char chr, int modifiers) {
      this.c.charTyped(chr, modifiers);
      return super.charTyped(chr, modifiers);
   }

   @Override
   public void onScroll(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      this.b.scroll(verticalAmount);
   }

   @Override
   public float getHeight() {
      aG var1 = Mytheria.getInstance().getSwingPresetManager();
      List var2 = var1.getSwingPresetFiles();
      return this.height = this.d.update(Math.min(var2.size() * 12 + Mytheria.getInstance().getSwingManager().getPresets().size() * 12 - 12, 182) + 46);
   }
}
