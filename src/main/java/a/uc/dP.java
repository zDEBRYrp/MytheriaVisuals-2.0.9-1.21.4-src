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
import net.minecraft.client.gui.screen.TitleScreen;
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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.systems.modules.Module;
import nesquik.mytheria.utility.animation.base.Easing;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import nesquik.mytheria.utility.interfaces.IScaledResolution;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.InputUtil;

public class dP extends dt implements IMinecraft, IScaledResolution {
   private static final List<dO> a = new LinkedList<>();
   private final fw b;
   private final es c = new es();
   private du d = du.VISUALS;
   private final List<cy> e = new LinkedList<>();
   private final List<dL> f = new ArrayList<>();
   private final List<dO> g = a;
   private final dZ h = new dZ(300L, Easing.BAKEK_SMALLER);
   private final cK i;
   private final fA j;
   private boolean k;
   private final dZ l = new dZ(300L, 0.0F, Easing.BAKEK);
   private boolean m = false;
   private final dZ n = new dZ(300L, 0.0F, Easing.BAKEK_SIZE);
   private final dL o;
   private final List<cP> p = new ArrayList<>();
   private final List<dQ> q = new ArrayList<>();
   private int r = 0;
   private final dZ s = new dZ(300L, 0.0F, Easing.BAKEK);
   private final List<dZ> t = new ArrayList<>();
   private cy u = null;
   private cz v = null;
   private TitleScreen backgroundMenu = null;
   private fh backgroundSnapshot = null;
   private boolean snapshotTaken = false;

   public dP() {
      float var1 = 500.0F;
      float var2 = 343.0F;
      this.b = new fw(sr.getScaledWidth() / 2.0F - var1 / 2.0F, sr.getScaledHeight() / 2.0F - var2 / 2.0F, var1, var2);
      this.f.clear();

      for (du var6 : du.values()) {
         if (var6 == du.VISUALS) {
            LinkedList var7 = new LinkedList();
            dL var8 = new dL(var6, var7);

            try {
               String var9 = var6.name().toLowerCase();
               var8.setPenis(new fA(Mytheria.id("penises/" + var9 + ".penis")));
            } catch (RuntimeException var12) {
            }

            this.f.add(var8);
            var7.addAll(
               Mytheria.getInstance()
                  .getModuleManager()
                  .getModules()
                  .stream()
                  .sorted(Comparator.comparing(Module::getName))
                  .filter(module -> module.getCategory().equals(var6.getCategory()))
                  .filter(module -> !module.isHidden())
                  .map(module -> new dN(module, var8))
                  .toList()
            );
         }
      }

      this.o = new dL(du.OTHER, new LinkedList<>());

      try {
         this.o.setPenis(new fA(Mytheria.id("penises/other.penis")));
      } catch (RuntimeException var11) {
      }

      this.f.add(this.o);
      this.p.addAll(Mytheria.getInstance().getHud().getElements());

      for (cP var17 : this.p) {
         this.q.add(new dQ(var17));
      }

      for (du var26 : du.values()) {
         if (var26 == du.PLAYER) {
            LinkedList var30 = new LinkedList();
            dL var32 = new dL(var26, var30);

            try {
               String var34 = var26.name().toLowerCase();
               var32.setPenis(new fA(Mytheria.id("penises/" + var34 + ".penis")));
            } catch (RuntimeException var10) {
            }

            this.f.add(var32);
            var30.addAll(
               Mytheria.getInstance()
                  .getModuleManager()
                  .getModules()
                  .stream()
                  .sorted(Comparator.comparing(Module::getName))
                  .filter(module -> module.getCategory().equals(var26.getCategory()))
                  .filter(module -> !module.isHidden())
                  .map(module -> new dN(module, var32))
                  .toList()
            );
         }
      }

      this.i = new cK(Fonts.REGULAR.getFont(6.5F));
      HashMap var16 = new HashMap();

      for (Module var23 : Mytheria.getInstance().getModuleManager().getModules()) {
         if (!var23.isHidden() && (var23.getCategory() == ax.VISUALS || var23.getCategory() == ax.PLAYER)) {
            cJ var27 = new cJ(() -> {
               dL var2x = this.f.stream().filter(cat -> cat.getCategory().equals(this.d)).findFirst().orElse(null);
               if (var2x != null) {
                  boolean var3 = var2x.getModules().stream().anyMatch(component -> component.getModule() == var23);
                  if (var3) {
                     var23.toggle();
                  }
               }
            }, () -> this.f.forEach(panel -> panel.getModules().stream().filter(component -> component.getModule() == var23).forEach(modernModule -> {})));
            var16.put(var23.getName().replace(" ", ""), var27);
            var16.put(var23.getName(), var27);
         }
      }

      this.i.setAppend(var16);
      this.i.setPreview(av.translate("search.tooltip"));
      this.j = new fA(Mytheria.id("penises/search.penis"));
      this.j.stop();

      for (int var20 = 0; var20 < cy.COLOR_PRESETS.size(); var20++) {
         this.t.add(new dZ(300L, 0.0F, Easing.BAKEK));
      }

      bJ var21 = Mytheria.getInstance().getModuleManager().getModule(bJ.class);
      if (var21 != null) {
         eb var24 = var21.clientColor.getColor();

         for (int var28 = 0; var28 < cy.COLOR_PRESETS.size(); var28++) {
            if (this.a(var24, cy.COLOR_PRESETS.get(var28).getColor())) {
               this.r = var28;
               break;
            }
         }
      }

      if (Mytheria.getInstance().getFileManager().getClientFile("client") instanceof as var29) {
         String var31 = var29.getLastMenuCategory();
         if (var31 != null) {
            try {
               du var33 = du.valueOf(var31);
               if (var33 == du.VISUALS || var33 == du.PLAYER) {
                  this.d = var33;
               }
            } catch (IllegalArgumentException var13) {
            }
         }
      }
   }

   private boolean a(eb c1, eb c2) {
      return Math.abs(c1.getRed() - c2.getRed()) < 5.0F && Math.abs(c1.getGreen() - c2.getGreen()) < 5.0F && Math.abs(c1.getBlue() - c2.getBlue()) < 5.0F;
   }

   protected void init() {
      this.closing = false;

      for (cy var2 : this.e) {
         var2.setShowing(false);
      }

      this.e.clear();
      if (this.v != null) {
         this.v.setShowing(false);
         this.v = null;
      }

      for (dL var4 : this.f) {
         if (var4.getPenis() != null) {
            var4.getPenis().stop();
         }
      }

      super.init();
   }

   public void tick() {
      super.tick();
      if (this.i.isFocused() && !this.k) {
         this.j.playOnce();
      }

      this.k = this.i.isFocused();
      this.l.update(this.i.isFocused() ? 1.0F : 0.0F);
      this.n.setEasing(this.m ? Easing.BAKEK : Easing.BAKEK_BACK);
      this.n.update(this.m);
   }

   @Override
   public void render(UIContext context) {
      this.menuAnimation.update(this.closing ? 0.0F : 1.0F);
      this.menuAnimation.setEasing(!this.closing ? Easing.BAKEK : Easing.BAKEK_BACK);
      this.menuAnimation.setDuration(400L);
      bN var100 = (bN)Mytheria.getInstance().getModuleManager().getModule(bN.class);
      boolean transparent = var100 != null && var100.isBackgroundTransparent();
      if (mc.world == null) {
         if (!this.snapshotTaken) {
            this.snapshotTaken = true;

            try {
               bN varMenuModule = (bN)Mytheria.getInstance().getModuleManager().getModule(bN.class);
               Screen varPrev = varMenuModule != null ? varMenuModule.getPrevScreen() : null;
               if (varPrev != null) {
                  fh varSnap = new fh(false).setLinear().setDownscale(1.0F);
                  varSnap.setup();
                  varSnap.beginWrite(false);
                  RenderSystem.clearColor(0.0F, 0.0F, 0.0F, 1.0F);
                  RenderSystem.clear(16640);
                  varPrev.render(context, context.getMouseX(), context.getMouseY(), context.getDelta());
                  varSnap.stop();
                  this.backgroundSnapshot = varSnap;
               }
            } catch (Exception var98) {
            }
         }

         mc.getFramebuffer().beginWrite(true);
         RenderSystem.clearColor(0.0F, 0.0F, 0.0F, 1.0F);
         RenderSystem.clear(16640);

         try {
            if (this.backgroundSnapshot != null) {
               RenderSystem.setShaderTexture(0, this.backgroundSnapshot.getColorAttachment());
               BufferBuilder varB = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
               varB.vertex(0.0F, 0.0F, 0.0F).texture(0.0F, 1.0F).color(-1);
               varB.vertex(0.0F, (float)mc.getWindow().getScaledHeight(), 0.0F).texture(0.0F, 0.0F).color(-1);
               varB.vertex((float)mc.getWindow().getScaledWidth(), (float)mc.getWindow().getScaledHeight(), 0.0F).texture(1.0F, 0.0F).color(-1);
               varB.vertex((float)mc.getWindow().getScaledWidth(), 0.0F, 0.0F).texture(1.0F, 1.0F).color(-1);
               BufferRenderer.drawWithGlobalProgram(varB.end());
               RenderSystem.setShaderTexture(0, 0);
            } else if (this.backgroundMenu == null) {
               var varMenu = new TitleScreen() {
                  public void b() {
                     this.init(mc, mc.getWindow().getScaledWidth(), mc.getWindow().getScaledHeight());
                  }
               };
               varMenu.b();
               this.backgroundMenu = varMenu;
               this.backgroundMenu.render(context, context.getMouseX(), context.getMouseY(), context.getDelta());
            } else {
               this.backgroundMenu.render(context, context.getMouseX(), context.getMouseY(), context.getDelta());
            }
         } catch (Exception var99) {
         }

         fj.blurProgram.draw();
      }

      this.c.update();
      float var2 = (float)(-this.c.getValue());
      float var3 = Math.min(1.0F, this.menuAnimation.getValue());
      boolean var4 = Mytheria.getInstance().getThemeManager().getCurrentTheme() == ct.DARK;
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var3);
      fl.scale(
         context.getMatrices(),
         this.b.getX() + this.b.getWidth() / 2.0F,
         this.b.getY() + this.b.getHeight() / 2.0F,
         0.5F + 0.5F * this.menuAnimation.getValue()
      );
      if (bJ.showGlass()) {
         context.drawLiquidGlass(
            this.b.getX(),
            this.b.getY(),
            this.b.getWidth(),
            this.b.getHeight(),
            5.0F,
            bJ.getDistortion(),
            BorderRadius.all(12.0F),
            ec.getLiquidGlassColor().mulAlpha(var3 * bJ.glass())
         );
         context.drawRoundedRect(
            this.b.getX(),
            this.b.getY(),
            this.b.getWidth(),
            this.b.getHeight(),
            BorderRadius.all(12.0F),
            bJ.getBackgroundColor().withAlpha((int)(255.0F * (0.8F - 0.6F * bJ.glass()) * var3))
         );
      } else {
          context.drawRoundedRect(this.b.getX(), this.b.getY(), this.b.getWidth(), this.b.getHeight(), BorderRadius.all(12.0F), transparent ? bJ.getBackgroundColor().withAlpha((int)(255.0F * 0.2F * var3)) : bJ.getBackgroundColor());
      }

      float var5 = this.b.getX();
      float var6 = this.b.getY();
      this.a(context, var5, var6, var4, var3);
      this.a(context, var5, var6, var2, var4, var3);
      this.b(context, var5, var6, var4, var3);
      this.c(context, var5, var6, var4, var3);
      this.a(context, var5, var6, var3);
      fl.end(context.getMatrices());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

      for (dO var8 : this.g) {
         var8.render(context);
      }

      for (cy var15 : this.e) {
         var15.render(context);
      }

      if (this.v != null) {
         this.v.render(context);
      }

      if (this.u != null && !this.u.isShowing() && this.u.getAnimation().getValue() == 0.0F) {
         eb var12 = this.u.built();
         boolean var16 = false;

         for (cy.a var10 : cy.COLOR_PRESETS) {
            if (this.a(var10.getColor(), var12)) {
               var16 = true;
               break;
            }
         }

         if (!var16) {
            cy.COLOR_PRESETS.add(new cy.a(var12));
            this.r = cy.COLOR_PRESETS.size() - 1;
         }

         bJ var19 = Mytheria.getInstance().getModuleManager().getModule(bJ.class);
         if (var19 != null) {
            var19.clientColor.setColor(var12);
            Mytheria.getInstance().getFileManager().writeFile("client");
         }

         this.u = null;
      }

      if (this.v != null && !this.v.isShowing() && this.v.getAnimation().getValue() == 0.0F) {
         if (this.v.isConfirmed()) {
            eb var13 = this.v.getBuiltColor();
            boolean var17 = false;

            for (cy.a var22 : cy.COLOR_PRESETS) {
               if (this.a(var22.getColor(), var13)) {
                  var17 = true;
                  break;
               }
            }

            if (!var17) {
               cy.COLOR_PRESETS.add(new cy.a(var13));
               this.r = cy.COLOR_PRESETS.size() - 1;
            }

            bJ var21 = Mytheria.getInstance().getModuleManager().getModule(bJ.class);
            if (var21 != null) {
               var21.clientColor.setColor(var13);
               Mytheria.getInstance().getFileManager().writeFile("client");
            }
         }

         this.v = null;
      }

      this.g.removeIf(window -> window.getAnimation().getValue() == 0.0F && !window.isShowing());
      this.e.removeIf(colorPickerx -> colorPickerx.getAnimation().getValue() == 0.0F && !colorPickerx.isShowing());
      if (this.n.getValue() > 0.0F) {
         eb var14 = eb.fromPixel(
            (float)(context.getMouseX() * sr.getScaleFactor()), (float)(mc.getWindow().getHeight() - context.getMouseY() * sr.getScaleFactor())
         );
         fw var18 = new fw(
            context.getMouseX(), context.getMouseY() + 10, 45.0F + Fonts.REGULAR.getFont(6.0F).width(av.translate("colorpicker.click_to_sample")), 30.0F
         );
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, Math.min(1.0F, this.n.getValue()));
         fl.scale(context.getMatrices(), var18.getX() + var18.getWidth() / 2.0F, var18.getY() + var18.getHeight() / 2.0F, 0.5F + this.n.getValue() * 0.5F);
         context.drawBlurredRect(
            var18.getX(),
            var18.getY(),
            var18.getWidth(),
            var18.getHeight(),
            45.0F,
            7.0F,
            BorderRadius.all(6.0F),
            eb.WHITE.withAlpha(255.0F * this.n.getValue())
         );
         context.drawRoundedRect(
            var18.getX(),
            var18.getY(),
            var18.getWidth(),
            var18.getHeight(),
            BorderRadius.all(6.0F),
            ec.getBackgroundColor().withAlpha(255.0F * this.n.getValue())
         );
         context.drawRoundedRect(var18.getX() + 5.0F, var18.getY() + 5.0F, var18.getHeight() - 10.0F, var18.getHeight() - 10.0F, BorderRadius.all(5.0F), var14);
         context.drawTexture(Mytheria.id("icons/colorpicker/click.png"), var18.getX() + var18.getHeight(), var18.getY() + 16.0F, 6.0F, 6.0F);
         context.drawText(
            Fonts.REGULAR.getFont(6.0F),
            String.format("RGB %s %s %s", (int)var14.getRed(), (int)var14.getGreen(), (int)var14.getBlue()),
            var18.getX() + var18.getHeight(),
            var18.getY() + 8.0F,
            ec.getTextColor()
         );
         context.drawText(
            Fonts.REGULAR.getFont(6.0F),
            av.translate("colorpicker.click_to_sample"),
            var18.getX() + var18.getHeight() + 8.0F,
            var18.getY() + 16.0F,
            ec.getTextColor().mulAlpha(0.5F)
         );
         fl.end(context.getMatrices());
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      }
   }

   private void a(UIContext context, float x, float y, boolean dark, float alpha) {
      float var6 = 30.0F;
      float var7 = 8.0F;
      float var8 = x + this.b.getWidth() - var7 - 46.0F;
      float var9 = y + 9.0F;
      context.drawTexture(Mytheria.id("icons/colorpicker/pipette.png"), var8, var9, var7, var7);
      if (er.isHovered(var8, var9, var7, var7, context)) {
         eo.set(en.HAND);
      }

      float var10 = 10.0F;
      float var11 = x + this.b.getWidth() - var10 - 30.0F;
      float var12 = y + 8.0F;
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      fj.drawAnimationSprite(context.getMatrices(), this.j.getCurrentSprite(), var11, var12, var10, var10, ec.WHITE);
      if (er.isHovered(var11, var12, var10, var10, context)) {
         eo.set(en.HAND);
      }

      float var13 = 8.0F;
      float var14 = x + this.b.getWidth() - var13 - 15.0F;
      float var15 = y + 9.0F;
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, alpha);
      context.drawTexture(Mytheria.id("icons/close.png"), var14, var15, var13, var13, ec.getTextColor());
      if (er.isHovered(var14, var15, var13, var13, context)) {
         eo.set(en.HAND);
      }

      float var16 = 12.0F;
      float var17 = 5.0F;
      float var18 = 10.0F;
      float var19 = 6.0F;
      float var20 = 0.0F;

      for (int var21 = 0; var21 < this.f.size(); var21++) {
         dL var22 = this.f.get(var21);
         String var23 = this.b(var22);
         float var24 = Fonts.REGULAR.getFont(6.5F).width(var23);
         var20 += var16 + var17 + var24 + var19 * 2.0F;
         if (var21 < this.f.size() - 1) {
            var20 += var18;
         }
      }

      float var38 = x + (this.b.getWidth() - var20) / 2.0F;
      float var39 = y + (var6 - var16) / 2.0F;
      float var40 = var16 + var19;
      float var41 = var39 - var19 / 2.0F;
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, alpha);
      context.drawRoundedRect(var38, var41, var20, var40, BorderRadius.all(6.0F), ec.getTextColor().withAlpha(10.0F));
      float var25 = var38;

      for (int var26 = 0; var26 < this.f.size(); var26++) {
         dL var27 = this.f.get(var26);
         boolean var28 = var27.getCategory() == this.d;
         String var29 = this.b(var27);
         float var30 = Fonts.REGULAR.getFont(6.5F).width(var29);
         float var31 = var16 + var17 + var30 + var19 * 2.0F;
         float var32 = var25;
         var27.getSelected().update(var28);
         if (var27.getSelected().getValue() > 0.0F) {
            float var33 = 4.0F;
            float var34 = var31 - var33 * 2.0F;
            float var35 = 2.0F;
            float var36 = var32 + var33;
            float var37 = var41 + var40 - 0.5F;
            context.drawTexture(
               Mytheria.id("textures/bloom.png"), var36, var37, var34, var35, ec.getAccentColor().withAlpha(255.0F * var27.getSelected().getValue())
            );
         }

         var25 += var31;
         if (var26 < this.f.size() - 1) {
            var25 += var18;
         }
      }

      fq var46 = new fq(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.REGULAR);
      var25 = var38;

      for (int var47 = 0; var47 < this.f.size(); var47++) {
         dL var49 = this.f.get(var47);
         String var52 = this.b(var49);
         float var56 = Fonts.REGULAR.getFont(6.5F).width(var52);
         float var60 = var16 + var17 + var56 + var19 * 2.0F;
         var25 += var60;
         if (var47 < this.f.size() - 1) {
            context.drawText(Fonts.REGULAR.getFont(8.0F), "|", var25 + var18 / 2.0F - 2.0F, var39 + 2.0F, ec.getTextColor().mulAlpha(0.15F));
            var25 += var18;
         }
      }

      var46.draw();
      fr var48 = new fr(VertexFormats.POSITION_TEXTURE_COLOR, context.getMatrices());
      var25 = var38 + var19;

      for (int var50 = 0; var50 < this.f.size(); var50++) {
         dL var53 = this.f.get(var50);
         boolean var57 = var53.getCategory() == this.d;
         if (var53.getPenis() != null) {
            fj.drawAnimationSprite(
               context.getMatrices(),
               var53.getPenis().getCurrentSprite(),
               var25,
               var39,
               var16,
               var16,
               ec.getTextColor().mix(ec.WHITE, var53.getSelected().getValue())
            );
         }

         String var61 = this.b(var53);
         float var64 = Fonts.REGULAR.getFont(6.5F).width(var61);
         float var67 = var16 + var17 + var64 + var19 * 2.0F;
         var25 += var67;
         if (var50 < this.f.size() - 1) {
            var25 += var18;
         }
      }

      var48.draw();
      fr var51 = new fr(VertexFormats.POSITION_TEXTURE_COLOR, context.getMatrices());
      var25 = var38 + var19;

      for (int var54 = 0; var54 < this.f.size(); var54++) {
         dL var58 = this.f.get(var54);
         if (var58.getPenis() == null) {
            context.drawSprite(var58.getCategory().getMenuSprite(), var25, var39, var16, var16, ec.getTextColor().mix(ec.WHITE, var58.getSelected().getValue()));
         }

         String var62 = this.b(var58);
         float var65 = Fonts.REGULAR.getFont(6.5F).width(var62);
         float var68 = var16 + var17 + var65 + var19 * 2.0F;
         if (er.isHovered(var25 - var19, var39 - var19 / 2.0F, var68, var16 + var19, context)) {
            eo.set(en.HAND);
         }

         var25 += var68;
         if (var54 < this.f.size() - 1) {
            var25 += var18;
         }
      }

      var51.draw();
      fq var55 = new fq(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.REGULAR);
      var25 = var38 + var19;

      for (int var59 = 0; var59 < this.f.size(); var59++) {
         dL var63 = this.f.get(var59);
         String var66 = this.b(var63);
         float var69 = Fonts.REGULAR.getFont(6.5F).width(var66);
         float var70 = var25 + var16 + var17;
         float var71 = var39 + var16 / 2.0F - Fonts.REGULAR.getFont(6.5F).height() / 2.0F;
         float var72 = 0.5F + 0.5F * var63.getSelected().getValue();
         context.drawText(Fonts.REGULAR.getFont(6.5F), var66, var70, var71, ec.getTextColor().mulAlpha(var72));
         float var73 = var16 + var17 + var69 + var19 * 2.0F;
         var25 += var73;
         if (var59 < this.f.size() - 1) {
            var25 += var18;
         }
      }

      var55.draw();
   }

   private void b(UIContext context, float x, float y, boolean dark, float alpha) {
      float var6 = 50.0F;
      float var7 = y + this.b.getHeight() - var6;
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, alpha);
      context.drawRect(x + 10.0F, var7, this.b.getWidth() - 20.0F, 1.0F, ec.getTextColor().mulAlpha(0.1F));
      float var8 = 32.0F;
      float var9 = x + 10.0F;
      float var10 = var7 + (var6 - var8) / 2.0F;
      float var11 = 2.0F;
      context.drawRoundedRect(
         var9 - var11, var10 - var11, var8 + var11 * 2.0F, var8 + var11 * 2.0F, BorderRadius.all(8.0F), ec.getAccentColor().mulAlpha(0.5F * alpha)
      );
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, alpha);
      context.drawRoundedTexture(Mytheria.id("icons/hud/avatarka.png"), var9, var10, var8, var8, BorderRadius.all(6.0F), ec.WHITE);
      float var12 = var9 + var8 + 7.0F;
      float var13 = var10 + 4.0F;
      String var14 = mc.player != null ? mc.player.getName().getString() : "Player";
      context.drawText(Fonts.MEDIUM.getFont(7.0F), var14, var12, var13, ec.getTextColor());
      String var15 = this.a();
      context.drawText(Fonts.REGULAR.getFont(6.0F), var15, var12, var13 + 8.0F, ec.getTextColor().mulAlpha(0.5F));
      LocalDateTime var16 = LocalDateTime.now();
      DateTimeFormatter var17 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
      String var18 = var16.format(var17);
      float var19 = Fonts.REGULAR.getFont(5.5F).width(var18) + 5.0F;
      float var20 = 12.0F;
      float var21 = var12 - 1.0F;
      float var22 = var13 + 15.0F;
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, alpha);
      eb var23 = ec.getAccentColor();
      eb var24 = new eb((int)(var23.getRed() * 0.7F + 76.5F), (int)(var23.getGreen() * 0.7F + 76.5F), (int)(var23.getBlue() * 0.7F + 76.5F), 255.0F);
      context.drawRoundedRect(var21, var22, var19, var20, BorderRadius.all(4.0F), ec.getTextColor().withAlpha(10.0F));
      context.drawText(Fonts.REGULAR.getFont(5.5F), var18, var21 + 3.0F, var22 + 4.0F, var24.mulAlpha(0.8F));
      float var25 = 30.0F;
      float var26 = 5.0F;
      float var27 = var25 * 2.0F + var26;
      float var28 = y + this.b.getHeight() + 10.0F;
      float var29 = x + (this.b.getWidth() - var27) / 2.0F;
      float var30 = var29 + var25 + var26;
      if (bJ.showGlass()) {
         context.drawLiquidGlass(
            var29,
            var28,
            var25,
            var25,
            bJ.getGlassBlur(),
            bJ.getDistortion(),
            BorderRadius.all(6.0F),
            ec.getLiquidGlassColor().mulAlpha(alpha * bJ.getGlassAlpha())
         );
         context.drawRoundedRect(
            var29, var28, var25, var25, BorderRadius.all(6.0F), bJ.getBackgroundColor().withAlpha((int)(255.0F * (0.8F - 0.6F * bJ.glass()) * alpha))
         );
      } else {
         context.drawRoundedRect(var29, var28, var25, var25, BorderRadius.all(6.0F), ec.getBackgroundColor().mulAlpha(alpha));
      }

      float var31 = 12.0F;
      float var32 = var29 + (var25 - var31) / 2.0F;
      float var33 = var28 + (var25 - var31) / 2.0F;
      context.drawTexture(Mytheria.id("icons/inventory.png"), var32, var33, var31, var31, ec.WHITE);
      if (er.isHovered(var29, var28, var25, var25, context)) {
         eo.set(en.HAND);
      }

      if (bJ.showGlass()) {
         context.drawLiquidGlass(
            var30,
            var28,
            var25,
            var25,
            bJ.getGlassBlur(),
            bJ.getDistortion(),
            BorderRadius.all(6.0F),
            ec.getLiquidGlassColor().mulAlpha(alpha * bJ.getGlassAlpha())
         );
         context.drawRoundedRect(
            var30, var28, var25, var25, BorderRadius.all(6.0F), bJ.getBackgroundColor().withAlpha((int)(255.0F * (0.8F - 0.6F * bJ.glass()) * alpha))
         );
      } else {
         context.drawRoundedRect(var30, var28, var25, var25, BorderRadius.all(6.0F), ec.getBackgroundColor().mulAlpha(alpha));
      }

      var32 = var30 + (var25 - var31) / 2.0F;
      var33 = var28 + (var25 - var31) / 2.0F;
      context.drawTexture(Mytheria.id("icons/way2.png"), var32, var33, var31, var31, ec.WHITE);
      if (er.isHovered(var30, var28, var25, var25, context)) {
         eo.set(en.HAND);
      }

      float var34 = 7.0F;
      float var35 = 6.0F;
      float var36 = 14.0F;
      float var37 = y + this.b.getHeight() - (50.0F + var36) / 2.0F;
      int var38 = cx.uid;
      if (var38 != 0) {
         String var39 = "UID: " + var38;
         float var40 = Fonts.REGULAR.getFont(var34).width(var39);
         float var41 = var40 + var35 * 2.0F;
         float var42 = x + this.b.getWidth() - 10.0F - var41;
         context.drawRoundedRect(var42, var37, var41, var36, BorderRadius.all(4.0F), ec.getTextColor().withAlpha(10.0F));
         context.drawText(Fonts.REGULAR.getFont(var34), var39, var42 + var35, var37 + 4.5F, var24.mulAlpha(0.8F));
      }
   }

   private String a() {
      if (mc.getCurrentServerEntry() != null) {
         String var1 = mc.getCurrentServerEntry().address;
         if (var1.contains("funtime")) {
            return "FunTime";
         } else if (var1.contains("hypixel")) {
            return "Hypixel";
         } else if (var1.contains("mineplex")) {
            return "Mineplex";
         } else if (var1.contains("cubecraft")) {
            return "CubeCraft";
         } else if (var1.contains("wynncraft")) {
            return "Wynncraft";
         } else if (var1.contains("minemen")) {
            return "Minemen Club";
         } else if (var1.contains("pvpland")) {
            return "PvPLand";
         } else if (var1.contains("reallyworld")) {
            return "ReallyWorld";
         } else {
            String[] var2 = var1.split("\\.");
            if (var2.length >= 2) {
               String var3 = var2[var2.length - 2];
               return var3.substring(0, 1).toUpperCase() + var3.substring(1);
            } else {
               return var1;
            }
         }
      } else {
         return "Singleplayer";
      }
   }

   private void c(UIContext context, float x, float y, boolean dark, float alpha) {
      float var6 = this.l.getValue() * alpha;
      if (!(var6 <= 0.01F)) {
         float var7 = 200.0F;
         float var8 = 28.0F;
         float var9 = x + (this.b.getWidth() - var7) / 2.0F;
         float var10 = y + this.b.getHeight() + 10.0F;
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var6);
         if (bJ.showGlass()) {
            context.drawLiquidGlass(
               var9, var10, var7, var8, 5.0F, bJ.getDistortion(), BorderRadius.all(8.0F), ec.getLiquidGlassColor().mulAlpha(var6 * bJ.glass())
            );
            context.drawRoundedRect(
               var9,
               var10,
               var7,
               var8,
               BorderRadius.all(8.0F),
               bJ.getBackgroundColor().withAlpha((int)(bJ.getBackgroundColor().getAlpha() * var6 * (0.8F - 0.6F * bJ.glass())))
            );
         } else {
            if (bJ.showMinimalizm()) {
               context.drawBlurredRect(var9, var10, var7, var8, 11.25F, BorderRadius.all(8.0F), ec.WHITE.mulAlpha(var6 * bJ.minimalizm()));
            }

            context.drawRoundedRect(var9, var10, var7, var8, BorderRadius.all(8.0F), bJ.getBackgroundColor().mulAlpha(var6));
         }

         this.i.set(var9 + 10.0F, var10 + 6.0F, var7 - 20.0F, var8 - 12.0F);
         this.i.setTextColor(ec.getTextColor().mulAlpha(var6));
         this.i.setAlpha(var6);
         this.i.render(context);
      }
   }

   private void a(UIContext context, float x, float y, float alpha) {
      float var5 = 40.0F;
      float var6 = this.b.getHeight();
      float var7 = x - var5 - 10.0F;
      float var8 = y;
      this.s.update(1.0F);
      float var9 = this.s.getValue() * alpha;
      if (!(var9 <= 0.01F)) {
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var9);
         if (bJ.showGlass()) {
            context.drawLiquidGlass(
               var7, var8, var5, var6, 5.0F, bJ.getDistortion(), BorderRadius.all(12.0F), ec.getLiquidGlassColor().mulAlpha(var9 * bJ.glass())
            );
            context.drawRoundedRect(
               var7, var8, var5, var6, BorderRadius.all(12.0F), bJ.getBackgroundColor().withAlpha((int)(255.0F * (0.8F - 0.6F * bJ.glass()) * var9))
            );
         } else {
            if (bJ.showMinimalizm()) {
               context.drawBlurredRect(var7, var8, var5, var6, 11.25F, BorderRadius.all(12.0F), ec.WHITE.mulAlpha(var9 * bJ.minimalizm()));
            }

            context.drawRoundedRect(var7, var8, var5, var6, BorderRadius.all(12.0F), bJ.getBackgroundColor().mulAlpha(var9));
         }

         float var10 = 28.0F;
         float var11 = 6.0F;
         float var12 = var7 + (var5 - var10) / 2.0F;
         float var13 = var8 + 10.0F;
         List var14 = cy.COLOR_PRESETS;

         while (this.t.size() < var14.size()) {
            this.t.add(new dZ(300L, 0.0F, Easing.BAKEK));
         }

         for (int var15 = 0; var15 < var14.size(); var15++) {
            eb var16 = ((cy.a)var14.get(var15)).getColor();
            boolean var17 = var15 == this.r;
            this.t.get(var15).update(var17);
            float var18 = this.t.get(var15).getValue();
            float var19 = 44.0F;
            float var20 = 200.0F;
            context.drawTexture(
               Mytheria.id("textures/bloom.png"), var12 - (var19 - var10) / 2.0F, var13 - (var19 - var10) / 2.0F, var19, var19, var16.withAlpha(var20 * var9)
            );
            if (var18 > 0.0F) {
               float var21 = 56.0F;
               float var22 = 255.0F;
               context.drawTexture(
                  Mytheria.id("textures/bloom.png"),
                  var12 - (var21 - var10) / 2.0F,
                  var13 - (var21 - var10) / 2.0F,
                  var21,
                  var21,
                  var16.withAlpha(var22 * var9 * var18)
               );
            }

            context.drawRoundedRect(var12, var13, var10, var10, BorderRadius.all(8.0F), var16.withAlpha(220.0F * var9));
            if (var18 > 0.0F) {
               context.drawRoundedRect(
                  var12 + 2.0F, var13 + 2.0F, var10 - 4.0F, var10 - 4.0F, BorderRadius.all(6.0F), ec.WHITE.withAlpha(150.0F * var9 * var18)
               );
            }

            if (er.isHovered(var12, var13, var10, var10, context)) {
               eo.set(en.HAND);
            }

            var13 += var10 + var11;
         }

         float var23 = var13;
         context.drawRoundedRect(var12, var23, var10, var10, BorderRadius.all(8.0F), ec.getAdditionalColor().withAlpha(150.0F * var9));
         context.drawText(
            Fonts.MEDIUM.getFont(16.0F),
            "+",
            var12 + var10 / 2.0F - Fonts.MEDIUM.getFont(16.0F).width("+") / 2.0F,
            var23 + var10 / 2.0F - Fonts.MEDIUM.getFont(16.0F).height() / 2.0F - 1.0F,
            ec.getTextColor().mulAlpha(var9)
         );
         if (er.isHovered(var12, var23, var10, var10, context)) {
            eo.set(en.HAND);
         }

         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      }
   }

   private void a(UIContext context, float x, float y, float scroll, boolean dark, float alpha) {
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, alpha);
      fm.push(context.getMatrices(), this.b.getX(), this.b.getY() + 30.0F, this.b.getWidth(), this.b.getHeight() - 85.0F);
      if (this.d == du.OTHER && this.a(this.o)) {
         this.a(context, x, y, scroll, alpha);
         fm.pop();
      } else {
         float var7 = scroll + 35.0F;
         float var8 = 0.0F;
         float var9 = 155.0F;
         float var10 = 7.5F;
         byte var11 = 3;
         float var12 = var9 * var11 + var10 * (var11 - 1);
         float var13 = x + (this.b.getWidth() - var12) / 2.0F;
         fu var14 = new fu(5.0F);

          for (dL var16 : this.f) {
             if (var16.getCategory() == this.d || this.isSearchActive()) {
                var16.setY(var7 - scroll);
                int var18 = 0;

                for (dN var20 : var16.getModules()) {
                   boolean var21 = !this.c(var20);
                   var20.getVisible().update(var21);
                   var20.getOffset().update(var21);
                    if (this.b(var20) && !this.a(var20)) {
                      var20.set(var13 + var8, y + var7, var9, 28.0F);
                      boolean var22 = var20.getY() >= y + 30.0F && var20.getY() + var20.getHeight() <= y + this.b.getHeight() - 55.0F;
                      if (var22) {
                         var20.render(context);
                         if (er.isHovered(var20.getX(), var20.getY(), var20.getWidth(), var20.getHeight(), context)) {
                            eo.set(en.HAND);
                         }
                      } else {
                         var20.updateHover(context.getMouseX(), context.getMouseY());
                      }

                     var18++;
                     var8 += (var20.getWidth() + var10) * var20.getOffset().getValue();
                     if (var18 >= var11) {
                        var7 += 34.0F * var20.getOffset().getValue();
                        var8 = 0.0F;
                        var18 = 0;
                     }
                  }
               }

               if (var18 != 0) {
                  var7 += 34.0F;
               }

               var8 = 0.0F;
               boolean var31 = false;
            }
         }

         var14.draw();
         ft var26 = new ft();

          for (dL var17 : this.f) {
             if (var17.getCategory() == this.d || this.isSearchActive()) {
                for (dN var37 : var17.getModules()) {
                   if (!this.a(var37) && this.b(var37)) {
                      boolean var42 = var37.getY() >= y + 30.0F && var37.getY() + var37.getHeight() <= y + this.b.getHeight() - 55.0F;
                      if (var42) {
                         var37.renderRounds(context);
                      }
                   }
                }
             }
          }

          var26.draw();
          ft var28 = new ft();

          for (dL var33 : this.f) {
             if (var33.getCategory() == this.d || this.isSearchActive()) {
                for (dN var43 : var33.getModules()) {
                   if (!this.a(var43) && this.b(var43)) {
                      boolean var47 = var43.getY() >= y + 30.0F && var43.getY() + var43.getHeight() <= y + this.b.getHeight() - 55.0F;
                      if (var47) {
                         var43.renderInto(context);
                      }
                   }
                }
             }
          }

          var28.draw();
          fq var30 = new fq(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.MEDIUM);

          for (dL var39 : this.f) {
             if (var39.getCategory() == this.d || this.isSearchActive()) {
                for (dN var48 : var39.getModules()) {
                   if (!this.a(var48) && this.b(var48)) {
                      boolean var50 = var48.getY() >= y + 30.0F && var48.getY() + var48.getHeight() <= y + this.b.getHeight() - 55.0F;
                      if (var50) {
                         var48.renderMedium(context);
                      }
                   }
                }
             }
          }

         var30.draw();

         for (int var35 = 0; var35 < var11; var35++) {
            float var40 = var13 + var35 * (var9 + var10);
            fp var45 = new fp(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.REGULAR, 0.9F, 1.0F, var9 - 30.0F, var40, context.getMatrices().peek().getPositionMatrix());

            for (dL var51 : this.f) {
               if (var51.getCategory() == this.d || this.isSearchActive()) {
                  for (dN var24 : var51.getModules()) {
                     if (!this.a(var24) && this.b(var24) && var24.getX() >= var40 - 1.0F && var24.getX() <= var40 + 1.0F) {
                        boolean var25 = var24.getY() >= y + 30.0F && var24.getY() + var24.getHeight() <= y + this.b.getHeight() - 55.0F;
                        if (var25) {
                           var24.renderRegular(context);
                        }
                     }
                  }
               }
            }

            var45.draw();
         }

         float var36 = var7 - scroll;
         float var41 = this.b.getHeight() - 90.0F;
         float var46 = -Math.max(0.0F, var36 - var41);
         this.c.setMax(var46 - 10.0F);
         fm.pop();
      }
   }

   private boolean a(dN component) {
      return component.getOffset().getValue() == 0.0F || component.getModule().isHidden();
   }

   private boolean b(dN component) {
      cK var2 = this.i;
      if (var2 == null || var2.getBuiltText().isBlank()) return true;
      String search = var2.getBuiltText().toLowerCase().trim();
      String name = component.getModule().getName().toLowerCase();
      String nameNoSpaces = name.replace(" ", "");
      // также ищем по описанию, но если описание это ключ modules.descriptions... — игнорируем
      String desc = "";
      try {
         desc = component.getModule().getDescription().toLowerCase();
         if (desc.startsWith("modules.descriptions.")) desc = "";
      } catch (Exception ignored) {}
      return name.contains(search) || nameNoSpaces.contains(search) || (!desc.isEmpty() && desc.contains(search));
   }

   private boolean isSearchActive() {
      return this.i != null && !this.i.getBuiltText().isBlank();
   }

   private boolean c(dN component) {
      return this.g.stream().anyMatch(window -> window.getModule() == component);
   }

   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      if (!Mytheria.getInstance().getHud().getIsland().handleClick((float)mouseX, (float)mouseY, button.getButtonIndex())) {
         if (this.v != null && this.v.isShowing()) {
            this.v.onMouseClicked(mouseX, mouseY, button);
            return;
         }

         float var6 = this.b.getX();
         float var7 = this.b.getY();
         float var8 = 40.0F;
         float var9 = var6 - var8 - 10.0F;
         float var10 = var7;
         float var11 = 28.0F;
         float var12 = 6.0F;
         float var13 = var9 + (var8 - var11) / 2.0F;
         float var14 = var10 + 10.0F;
         List var15 = cy.COLOR_PRESETS;
         float var16 = var14 + var15.size() * (var11 + var12);
         boolean var17 = er.isHovered(var13, var16, var11, var11, mouseX, mouseY);

         for (cy var19 : this.e) {
            boolean var20 = var19.isPick();
            var19.onMouseClicked(mouseX, mouseY, button);
            if (var19.isHovered(mouseX, mouseY) || var20) {
               return;
            }

            if (!var17) {
               var19.setShowing(false);
            }
         }

         for (dO var55 : this.g) {
            var55.onMouseClicked(mouseX, mouseY, button);
            if (var55.isHovered(mouseX, mouseY)) {
               return;
            }

            if (!er.isHovered(this.b, mouseX, mouseY)) {
               boolean var58 = true;

               for (dO var22 : this.g) {
                  if (er.isHovered(var22, mouseX, mouseY)) {
                     var58 = false;
                  }
               }

               if (var58) {
                  var55.setShowing(false);
               }
            }
         }

         if (button != MouseButton.MIDDLE) {
            this.i.onMouseClicked(mouseX, mouseY, button);
         }

         if (this.m) {
            if (button == MouseButton.LEFT) {
               eb var54 = eb.fromPixel((float)(mouseX * sr.getScaleFactor()), (float)(mc.getWindow().getHeight() - mouseY * sr.getScaleFactor()));
               bJ var57 = Mytheria.getInstance().getModuleManager().getModule(bJ.class);
               if (var57 != null) {
                  var57.clientColor.setColor(var54);
                  Mytheria.getInstance().getFileManager().writeFile("client");
               }

               this.m = false;
            } else if (button == MouseButton.RIGHT) {
               this.m = false;
            }

            return;
         }

         float var53 = 8.0F;
         float var56 = var6 + this.b.getWidth() - var53 - 44.0F;
         float var59 = var7 + 9.0F;
         if (er.isHovered(var56, var59, var53, var53, mouseX, mouseY)) {
            this.m = true;
            return;
         }

         float var60 = 8.0F;
         float var61 = var6 + this.b.getWidth() - var60 - 15.0F;
         float var23 = var7 + 9.0F;
         if (er.isHovered(var61, var23, var60, var60, mouseX, mouseY)) {
            this.close();
            return;
         }

         float var24 = 30.0F;
         float var25 = 5.0F;
         float var26 = var24 * 2.0F + var25;
         float var27 = var7 + this.b.getHeight() + 10.0F;
         float var28 = var6 + (this.b.getWidth() - var26) / 2.0F;
         float var29 = var28 + var24 + var25;
         if (er.isHovered(var29, var27, var24, var24, mouseX, mouseY)) {
            mc.setScreen(new dX());
            return;
         }

         var14 = var10 + 10.0F;

         for (int var30 = 0; var30 < var15.size(); var30++) {
            eb var31 = ((cy.a)var15.get(var30)).getColor();
            if (er.isHovered(var13, var14, var11, var11, mouseX, mouseY)) {
               if (button == MouseButton.LEFT) {
                  this.r = var30;
                  bJ var32 = Mytheria.getInstance().getModuleManager().getModule(bJ.class);
                  if (var32 != null) {
                     var32.clientColor.setColor(var31);
                     Mytheria.getInstance().getFileManager().writeFile("client");
                  }
               } else if (button == MouseButton.RIGHT && cy.COLOR_PRESETS.size() > 1) {
                  cy.COLOR_PRESETS.remove(var30);
                  if (this.r >= cy.COLOR_PRESETS.size()) {
                     this.r = cy.COLOR_PRESETS.size() - 1;
                  }

                  bJ var66 = Mytheria.getInstance().getModuleManager().getModule(bJ.class);
                  if (var66 != null && this.r >= 0) {
                     var66.clientColor.setColor(cy.COLOR_PRESETS.get(this.r).getColor());
                     Mytheria.getInstance().getFileManager().writeFile("client");
                  }
               }

               return;
            }

            var14 += var11 + var12;
         }

         if (var17) {
            bJ var63 = Mytheria.getInstance().getModuleManager().getModule(bJ.class);
            eb var65 = var63 != null ? var63.clientColor.getColor() : new eb(151.0F, 71.0F, 255.0F, 255.0F);

            for (cy var71 : this.e) {
               var71.setShowing(false);
            }

            for (dO var72 : this.g) {
               var72.setShowing(false);
            }

            if (this.v != null) {
               this.v.setShowing(false);
            }

            float var70 = 200.0F;
            float var73 = 180.0F;
            float var74 = var6 + this.b.getWidth() / 2.0F - var70 / 2.0F;
            float var75 = var7 + this.b.getHeight() / 2.0F - var73 / 2.0F;
            this.v = new cz(var74, var75, var65, "Выберите цвет новой темы");
            return;
         }

         float var62 = 10.0F;
         float var64 = var6 + this.b.getWidth() - var62 - 30.0F;
         float var67 = var7 + 8.0F;
         if (er.isHovered(var64, var67, var62, var62, mouseX, mouseY)) {
            this.i.setFocused(!this.i.isFocused());
            return;
         }

         float var33 = 30.0F;
         float var34 = 12.0F;
         float var35 = 5.0F;
         float var36 = 10.0F;
         float var37 = 6.0F;
         float var38 = 0.0F;

         for (int var39 = 0; var39 < this.f.size(); var39++) {
            dL var40 = this.f.get(var39);
            String var41 = this.b(var40);
            float var42 = Fonts.REGULAR.getFont(6.5F).width(var41);
            var38 += var34 + var35 + var42 + var37 * 2.0F;
            if (var39 < this.f.size() - 1) {
               var38 += var36;
            }
         }

         float var76 = var6 + (this.b.getWidth() - var38) / 2.0F;
         float var77 = var7 + (var33 - var34) / 2.0F;
         float var78 = var76;

         for (int var79 = 0; var79 < this.f.size(); var79++) {
            dL var43 = this.f.get(var79);
            String var44 = this.b(var43);
            float var45 = Fonts.REGULAR.getFont(6.5F).width(var44);
            float var46 = var34 + var35 + var45 + var37 * 2.0F;
            float var47 = var34 + var37;
            float var48 = var77 - var37 / 2.0F;
            if (er.isHovered(var78, var48, var46, var47, mouseX, mouseY)) {
               if (var43.getCategory() != this.d) {
                  this.d = var43.getCategory();
                  this.c.setValue(0.0);
                  if (this.i != null) {
                     this.i.clear();
                     this.i.setFocused(false);
                  }
                  if (var43.getPenis() != null) {
                     var43.getPenis().playOnce();
                  }

                  if (Mytheria.getInstance().getFileManager().getClientFile("client") instanceof as var50) {
                     var50.setLastMenuCategory(this.d.name());
                  }
               }

               return;
            }

            var78 += var46;
            if (var79 < this.f.size() - 1) {
               var78 += var36;
            }
         }

         if (this.d == du.OTHER && this.a(this.o)) {
            for (dQ var83 : this.q) {
               if (er.isHovered(var83.getX(), var83.getY(), var83.getWidth(), var83.getHeight(), mouseX, mouseY)) {
                  var83.onMouseClicked(mouseX, mouseY, button);
                  return;
               }
            }
          } else {
            for (dL var82 : this.f) {
               if (var82.getCategory() == this.d || this.isSearchActive()) {
                  for (dN var85 : var82.getModules()) {
                     boolean var86 = var85.getY() >= var7 + 30.0F && var85.getY() + var85.getHeight() <= var7 + this.b.getHeight() - 55.0F;
                     if (!var85.getModule().isHidden()
                        && this.b(var85)
                        && var86
                        && er.isHovered(var85.getX(), var85.getY(), var85.getWidth(), var85.getHeight(), mouseX, mouseY)) {
                        var85.onMouseClicked(mouseX, mouseY, button);
                        return;
                     }
                  }
               }
            }
         }

         super.onMouseClicked(mouseX, mouseY, button);
      }
   }

   @Override
   public void onMouseReleased(double mouseX, double mouseY, MouseButton button) {
      for (dO var7 : this.g) {
         var7.onMouseReleased(mouseX, mouseY, button);
      }

      for (cy var9 : this.e) {
         var9.onMouseReleased(mouseX, mouseY, button);
      }

      if (this.v != null) {
         this.v.onMouseReleased(mouseX, mouseY, button);
      }

      if (this.i.isFocused()) {
         this.i.onMouseReleased(mouseX, mouseY, button);
      }

      super.onMouseReleased(mouseX, mouseY, button);
   }

   @Override
   public boolean onMouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      for (dO var10 : this.g) {
         var10.onScroll(mouseX, mouseY, horizontalAmount, verticalAmount);
      }

      if (er.isHovered(this.b, mouseX, mouseY)) {
         this.c.scroll(verticalAmount);
      }

      return true;
   }

   public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
      this.c.onKeyPressed(keyCode);
      if (!this.i.isFocused() && Screen.hasControlDown() && keyCode == 70) {
         this.i.setFocused(true);
         return true;
      }

      for (dO var5 : this.g) {
         var5.onKeyPressed(keyCode, scanCode, modifiers);
      }

      for (cy var10 : this.e) {
         var10.onKeyPressed(keyCode, scanCode, modifiers);
      }

      if (this.i.isFocused() && !this.isBindingModule()) {
         this.i.onKeyPressed(keyCode, scanCode, modifiers);
      }

      for (dL var11 : this.f) {
         for (dN var7 : var11.getModules()) {
            if (!this.a(var7)) {
               var7.onKeyPressed(keyCode, scanCode, modifiers);
            }
         }
      }

      return super.keyPressed(keyCode, scanCode, modifiers);
   }

   public boolean charTyped(char chr, int modifiers) {
      for (dO var4 : this.g) {
         var4.charTyped(chr, modifiers);
      }

      if (this.i.isFocused() && !this.isBindingModule()) {
         this.i.charTyped(chr, modifiers);
      }

      for (dL var8 : this.f) {
         for (dN var6 : var8.getModules()) {
            if (!this.a(var6)) {
               var6.charTyped(chr, modifiers);
            }
         }
      }

      return super.charTyped(chr, modifiers);
   }

   public void close() {
      this.closing = true;
      a.clear();
      Mytheria.getInstance().getModuleManager().getModule(bN.class).disable();
      ba var1 = Mytheria.getInstance().getModuleManager().getModule(ba.class);
      if (var1.isEnabled()) {
         fL.CLICKGUI_OPEN.play(var1.getVolume().getCurrentValue(), 1.0F);
      }
      if (this.i != null) {
         this.i.clear();
         this.i.setFocused(false);
      }
      if (cK.LAST_FIELD != null) cK.LAST_FIELD.setFocused(false);
      Mytheria.getInstance().getFileManager().writeFile("client");
      super.close();
   }

   public boolean shouldPause() {
      return false;
   }

    public void renderBackground(DrawContext context, int mouseX, int mouseY, float delta) {
        if (mc.world == null) {
            context.fill(0, 0, (int)sr.getScaledWidth(), (int)sr.getScaledHeight(), 0xFF000000);
        }
    }

   public boolean shouldCloseOnEsc() {
      return true;
   }

   public boolean isBindingModule() {
      for (dL var2 : this.f) {
         for (dN var4 : var2.getModules()) {
            if (var4.isBinding()) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean a(dL category) {
      return category == this.o;
   }

   private String b(dL category) {
      return this.a(category) ? "Hud" : category.getCategory().getName();
   }

   private void a(UIContext context, float x, float y, float scroll, float alpha) {
      float var6 = scroll + 35.0F;
      float var7 = 0.0F;
      float var8 = 155.0F;
      float var9 = 7.5F;
      byte var10 = 3;
      float var11 = var8 * var10 + var9 * (var10 - 1);
      float var12 = x + (this.b.getWidth() - var11) / 2.0F;
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, alpha);
      fu var13 = new fu(5.0F);
      int var14 = 0;

      for (dQ var16 : this.q) {
         boolean var17 = true;
         var16.getVisible().update(var17);
         var16.getOffset().update(var17);
         var16.set(var12 + var7, y + var6, var8, 28.0F);
         boolean var18 = var16.getY() >= y + 30.0F && var16.getY() + var16.getHeight() <= y + this.b.getHeight() - 55.0F;
         if (var18) {
            var16.render(context);
            if (er.isHovered(var16.getX(), var16.getY(), var16.getWidth(), var16.getHeight(), context)) {
               eo.set(en.HAND);
            }
         }

         var14++;
         var7 += (var16.getWidth() + var9) * var16.getOffset().getValue();
         if (var14 >= var10) {
            var6 += 34.0F * var16.getOffset().getValue();
            var7 = 0.0F;
            var14 = 0;
         }
      }

      var13.draw();
      ft var24 = new ft();

      for (dQ var27 : this.q) {
         boolean var30 = var27.getY() >= y + 30.0F && var27.getY() + var27.getHeight() <= y + this.b.getHeight() - 55.0F;
         if (var30) {
            var27.renderRounds(context);
         }
      }

      var24.draw();
      ft var26 = new ft();

      for (dQ var31 : this.q) {
         boolean var19 = var31.getY() >= y + 30.0F && var31.getY() + var31.getHeight() <= y + this.b.getHeight() - 55.0F;
         if (var19) {
            var31.renderInto(context);
         }
      }

      var26.draw();
      fq var29 = new fq(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.MEDIUM);

      for (dQ var35 : this.q) {
         boolean var20 = var35.getY() >= y + 30.0F && var35.getY() + var35.getHeight() <= y + this.b.getHeight() - 55.0F;
         if (var20) {
            var35.renderMedium(context);
         }
      }

      var29.draw();

      for (int var33 = 0; var33 < var10; var33++) {
         float var36 = var12 + var33 * (var8 + var9);
         fp var38 = new fp(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.REGULAR, 0.9F, 1.0F, var8 - 30.0F, var36, context.getMatrices().peek().getPositionMatrix());

         for (dQ var22 : this.q) {
            if (var22.getX() >= var36 - 1.0F && var22.getX() <= var36 + 1.0F) {
               boolean var23 = var22.getY() >= y + 30.0F && var22.getY() + var22.getHeight() <= y + this.b.getHeight() - 55.0F;
               if (var23) {
                  var22.renderRegular(context);
               }
            }
         }

         var38.draw();
      }

      if (var14 != 0) {
         var6 += 34.0F;
      }

      float var34 = var6 - scroll;
      float var37 = this.b.getHeight() - 90.0F;
      float var39 = -Math.max(0.0F, var34 - var37);
      this.c.setMax(var39 - 10.0F);
   }

   @Generated
   public fw getMenuWindow() {
      return this.b;
   }

   @Generated
   public List<dL> getCategories() {
      return this.f;
   }

   @Generated
   public List<dO> getWindows() {
      return this.g;
   }

   @Generated
   public List<cy> getColorPickers() {
      return this.e;
   }

   @Generated
   public cK getSearchField() {
      return this.i;
   }
}
