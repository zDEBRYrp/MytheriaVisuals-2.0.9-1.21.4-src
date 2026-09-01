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
import a.evA;
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

   /**
    * Создаёт главное окно ClickGUI: центрирует окно, инициализирует категории и модули.
    */
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

   /**
    * Сравнивает два объекта настроек (eb) по их идентификатору модуля и имени настройки.
    */
   private boolean a(eb c1, eb c2) {
      return Math.abs(c1.getRed() - c2.getRed()) < 5.0F && Math.abs(c1.getGreen() - c2.getGreen()) < 5.0F && Math.abs(c1.getBlue() - c2.getBlue()) < 5.0F;
   }

   /**
    * Инициализирует GUI-компоненты: создаёт окна настроек для каждого модуля и элементы HUD.
    */
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

   /**
    * Обновляет состояние анимаций, прогресс закрытия и область видимости компонентов.
    */
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

   /**
    * Главный метод рендера: рисует фон (панораму/мир), панели, окна настроек, пикеры цвета и поисковое поле.
    */
   @Override
   public void render(UIContext context) {
      this.renderGuiBackground(context);
      this.applyMenuTransform(context);

      bN var100 = (bN)Mytheria.getInstance().getModuleManager().getModule(bN.class);
      boolean transparent = var100 != null && var100.isBackgroundTransparent();
      float transparentAlpha = transparent ? var100.getTransparentPercent() / 100.0F : 1.0F;
      boolean dark = Mytheria.getInstance().getThemeManager().getCurrentTheme() == ct.DARK;
      float alpha = Math.min(1.0F, this.menuAnimation.getValue());
      float scrollOffset = (float)(-this.c.getValue());

      this.renderWindowBackground(context, alpha, transparent, transparentAlpha);

      float var5 = this.b.getX();
      float var6 = this.b.getY();
      this.a(context, var5, var6, dark, alpha);
      this.a(context, var5, var6, scrollOffset, dark, alpha);
      this.b(context, var5, var6, dark, alpha);
      this.c(context, var5, var6, dark, alpha);
      this.a(context, var5, var6, alpha);
      fl.end(context.getMatrices());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

      this.renderFloatingElements(context);
      this.handleColorPickerClosed();
      this.handleConfirmDialogClosed();
      this.cleanupDeadElements();
      this.renderEyedropperTooltip(context);
   }

   /**
    * Очищает фреймбуфер и рендерит предыдущий экран или TitleScreen, затем применяет размытие.
    */
   private void renderGuiBackground(UIContext context) {
      if (mc.world == null) {
         mc.getFramebuffer().beginWrite(true);
         RenderSystem.clearColor(0.0F, 0.0F, 0.0F, 1.0F);
         RenderSystem.clear(16640);

         try {
            bN varMenuModule = (bN)Mytheria.getInstance().getModuleManager().getModule(bN.class);
            Screen varPrev = varMenuModule != null ? varMenuModule.getPrevScreen() : null;
            if (varPrev != null) {
               varPrev.render(context, context.getMouseX(), context.getMouseY(), context.getDelta());
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
   }

   /**
    * Обновляет анимацию панели, вычисляет прозрачность и тему, применяет преобразование масштабирования.
    */
   private void applyMenuTransform(UIContext context) {
      this.menuAnimation.update(this.closing ? 0.0F : 1.0F);
      this.menuAnimation.setEasing(!this.closing ? Easing.BAKEK : Easing.BAKEK_BACK);
      this.menuAnimation.setDuration(400L);
      this.c.update();
      float alpha = Math.min(1.0F, this.menuAnimation.getValue());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, alpha);
      fl.scale(
         context.getMatrices(),
         this.b.getX() + this.b.getWidth() / 2.0F,
         this.b.getY() + this.b.getHeight() / 2.0F,
         0.5F + 0.5F * this.menuAnimation.getValue()
      );
   }

   /**
    * Рисует основное фоновое окно со скруглёнными углами (стекло или сплошной цвет).
    */
   private void renderWindowBackground(UIContext context, float alpha, boolean transparent, float transparentAlpha) {
      if (bJ.showGlass()) {
         context.drawLiquidGlass(
            this.b.getX(),
            this.b.getY(),
            this.b.getWidth(),
            this.b.getHeight(),
            5.0F,
            bJ.getDistortion(),
            BorderRadius.all(12.0F),
            ec.getLiquidGlassColor().mulAlpha(alpha * bJ.glass())
         );
         context.drawRoundedRect(
            this.b.getX(),
            this.b.getY(),
            this.b.getWidth(),
            this.b.getHeight(),
            BorderRadius.all(12.0F),
            bJ.getBackgroundColor().withAlpha((int)(255.0F * (0.8F - 0.6F * bJ.glass()) * alpha))
         );
      } else {
          context.drawRoundedRect(this.b.getX(), this.b.getY(), this.b.getWidth(), this.b.getHeight(), BorderRadius.all(12.0F), transparent ? bJ.getBackgroundColor().withAlpha((int)(255.0F * transparentAlpha * alpha)) : bJ.getBackgroundColor());
      }
   }

   /**
    * Рендерит плавающие окна, пикеры цвета и диалог подтверждения.
    */
   private void renderFloatingElements(UIContext context) {
      for (dO var8 : this.g) {
         var8.render(context);
      }

      for (cy var15 : this.e) {
         var15.render(context);
      }

      if (this.v != null) {
         this.v.render(context);
      }
   }

   /**
    * Обрабатывает закрытие основного пикера цвета: сохраняет пресет и обновляет цвет клиента.
    */
   private void handleColorPickerClosed() {
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
   }

   /**
    * Обрабатывает закрытие диалога подтверждения: сохраняет выбранный цвет или отменяет действие.
    */
   private void handleConfirmDialogClosed() {
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
   }

   /**
    * Удаляет мёртвые окна и пикеры цвета, чья анимация завершена и которые не отображаются.
    */
   private void cleanupDeadElements() {
      this.g.removeIf(window -> window.getAnimation().getValue() == 0.0F && !window.isShowing());
      this.e.removeIf(colorPickerx -> colorPickerx.getAnimation().getValue() == 0.0F && !colorPickerx.isShowing());
   }

   /**
    * Рендерит всплывающую подсказку пипетки с образцом цвета и текстом.
    */
   private void renderEyedropperTooltip(UIContext context) {
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

   /**
    * Рендерит верхнюю панель с вкладками категорий: делегирует отрисовку кнопок, фона, индикатора,
    * разделителей, иконок и подписей вкладок.
    */
   private void a(UIContext context, float x, float y, boolean dark, float alpha) {
      float topBarHeight = 36.0F;
      float iconSize = 12.0F;
      float padding = 6.0F;
      float separatorGap = 10.0F;

      renderTopBarButtons(context, x, y, topBarHeight, alpha);

      float[] layout = computeTabBarLayout(x, y, topBarHeight, iconSize, padding, separatorGap);
      float totalWidth = layout[0];
      float startX = layout[1];
      float barY = layout[2];
      float barHeight = layout[3];

      renderTabBarBackground(context, startX, barY, totalWidth, barHeight, alpha);
      renderActiveTabIndicator(context, startX, barY, totalWidth, barHeight, iconSize, padding, separatorGap, alpha);
      renderTabSeparators(context, startX, barY, iconSize, padding, separatorGap);
      renderTabIcons(context, startX, barY, barHeight, iconSize, padding, separatorGap);
      renderTabLabels(context, startX, barY, barHeight, iconSize, padding, separatorGap, alpha);
   }

   /**
    * Вычисляет параметры компоновки панели вкладок: общую ширину, начальную позицию и размеры фона.
    *
    * @return массив [totalWidth, startX, barY, barHeight]
    */
   private float[] computeTabBarLayout(float x, float y, float topBarHeight, float iconSize, float padding, float separatorGap) {
      float iconLabelPad = 5.0F;
      float totalWidth = 0.0F;

      for (int i = 0; i < this.f.size(); i++) {
         dL cat = this.f.get(i);
         String label = this.b(cat);
         float labelWidth = Fonts.REGULAR.getFont(6.5F).width(label);
         totalWidth += iconSize + iconLabelPad + labelWidth + padding * 2.0F;
         if (i < this.f.size() - 1) {
            totalWidth += separatorGap;
         }
      }

       float startX = x + (this.b.getWidth() - totalWidth) / 2.0F;
       float barY = y + (topBarHeight - iconSize) / 2.0F;
       float barHeight = iconSize + padding;

      return new float[]{totalWidth, startX, barY, barHeight};
   }

   /**
    * Рисует кнопки верхней панели: пипетку吸取 цвета, иконку поиска и кнопку закрытия.
    */
   private void renderTopBarButtons(UIContext context, float x, float y, float topBarHeight, float alpha) {
      float pipetteSize = 8.0F;
      float pipetteX = x + this.b.getWidth() - pipetteSize - 46.0F;
      float pipetteY = y + (topBarHeight - pipetteSize) / 2.0F;
      context.drawTexture(Mytheria.id("icons/colorpicker/pipette.png"), pipetteX, pipetteY, pipetteSize, pipetteSize);
      if (er.isHovered(pipetteX, pipetteY, pipetteSize, pipetteSize, context)) {
         eo.set(en.HAND);
      }

      float searchSize = 10.0F;
      float searchX = x + this.b.getWidth() - searchSize - 30.0F;
      float searchY = y + (topBarHeight - searchSize) / 2.0F;
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      fj.drawAnimationSprite(context.getMatrices(), this.j.getCurrentSprite(), searchX, searchY, searchSize, searchSize, ec.WHITE);
      if (er.isHovered(searchX, searchY, searchSize, searchSize, context)) {
         eo.set(en.HAND);
      }

      float closeSize = 8.0F;
      float closeX = x + this.b.getWidth() - closeSize - 15.0F;
      float closeY = y + (topBarHeight - closeSize) / 2.0F;
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, alpha);
      context.drawTexture(Mytheria.id("icons/close.png"), closeX, closeY, closeSize, closeSize, ec.getTextColor());
      if (er.isHovered(closeX, closeY, closeSize, closeSize, context)) {
         eo.set(en.HAND);
      }
   }

   /**
    * Рисует полупрозрачный фон под панелью вкладок категорий.
    */
   private void renderTabBarBackground(UIContext context, float startX, float barY, float totalWidth, float barHeight, float alpha) {
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, alpha);
      context.drawRoundedRect(startX, barY, totalWidth, barHeight, BorderRadius.all(6.0F), ec.getTextColor().withAlpha(10.0F));
   }

   /**
    * Рисует подсветку-подчёркивание (bloom) под активной вкладкой категории.
    */
   private void renderActiveTabIndicator(UIContext context, float startX, float barY, float totalWidth, float barHeight, float iconSize, float padding, float separatorGap, float alpha) {
      float iconLabelPad = 5.0F;
      float cursorX = startX;

      for (int i = 0; i < this.f.size(); i++) {
         dL cat = this.f.get(i);
         boolean isActive = cat.getCategory() == this.d;
         String label = this.b(cat);
         float labelWidth = Fonts.REGULAR.getFont(6.5F).width(label);
         float tabWidth = iconSize + iconLabelPad + labelWidth + padding * 2.0F;
         float tabX = cursorX;
         cat.getSelected().update(isActive);

         if (cat.getSelected().getValue() > 0.0F) {
            float inset = 4.0F;
            float indicatorWidth = tabWidth - inset * 2.0F;
            float indicatorHeight = 2.0F;
            float indicatorX = tabX + inset;
            float indicatorY = barY + barHeight - 0.5F;
            context.drawTexture(
               Mytheria.id("textures/bloom.png"), indicatorX, indicatorY, indicatorWidth, indicatorHeight,
               ec.getAccentColor().withAlpha(255.0F * cat.getSelected().getValue())
            );
         }

         cursorX += tabWidth;
         if (i < this.f.size() - 1) {
            cursorX += separatorGap;
         }
      }
   }

   /**
    * Рисует вертикальные разделители-пайпы между вкладками категорий.
    */
   private void renderTabSeparators(UIContext context, float startX, float barY, float iconSize, float padding, float separatorGap) {
      float iconLabelPad = 5.0F;
      fq batch = new fq(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.REGULAR);
      float cursorX = startX;

      for (int i = 0; i < this.f.size(); i++) {
         dL cat = this.f.get(i);
         String label = this.b(cat);
         float labelWidth = Fonts.REGULAR.getFont(6.5F).width(label);
         float tabWidth = iconSize + iconLabelPad + labelWidth + padding * 2.0F;
         cursorX += tabWidth;

         if (i < this.f.size() - 1) {
            context.drawText(Fonts.REGULAR.getFont(8.0F), "|", cursorX + separatorGap / 2.0F - 2.0F, barY + 2.0F, ec.getTextColor().mulAlpha(0.15F));
            cursorX += separatorGap;
         }
      }

      batch.draw();
   }

   /**
    * Рисует иконки категорий: анимированные спрайты для тех, у кого есть анимация, и статичные спрайты для остальных.
    * Также обрабатывает подсветку при наведении курсора.
    */
   private void renderTabIcons(UIContext context, float startX, float barY, float barHeight, float iconSize, float padding, float separatorGap) {
      float iconLabelPad = 5.0F;
      float iconCenterOffset = (barHeight - iconSize) / 2.0F;
      float iconY = barY + iconCenterOffset;

      fr animatedBatch = new fr(VertexFormats.POSITION_TEXTURE_COLOR, context.getMatrices());
      float cursorX = startX + padding;

      for (int i = 0; i < this.f.size(); i++) {
         dL cat = this.f.get(i);
         if (cat.getPenis() != null) {
            fj.drawAnimationSprite(
               context.getMatrices(),
               cat.getPenis().getCurrentSprite(),
               cursorX,
               iconY,
               iconSize,
               iconSize,
               ec.getTextColor().mix(ec.WHITE, cat.getSelected().getValue())
            );
         }

         String label = this.b(cat);
         float labelWidth = Fonts.REGULAR.getFont(6.5F).width(label);
         float tabWidth = iconSize + iconLabelPad + labelWidth + padding * 2.0F;
         cursorX += tabWidth;
         if (i < this.f.size() - 1) {
            cursorX += separatorGap;
         }
      }

      animatedBatch.draw();

      fr staticBatch = new fr(VertexFormats.POSITION_TEXTURE_COLOR, context.getMatrices());
      cursorX = startX + padding;

      for (int i = 0; i < this.f.size(); i++) {
         dL cat = this.f.get(i);
         if (cat.getPenis() == null) {
            context.drawSprite(cat.getCategory().getMenuSprite(), cursorX, iconY, iconSize, iconSize, ec.getTextColor().mix(ec.WHITE, cat.getSelected().getValue()));
         }

         String label = this.b(cat);
         float labelWidth = Fonts.REGULAR.getFont(6.5F).width(label);
         float tabWidth = iconSize + iconLabelPad + labelWidth + padding * 2.0F;
         if (er.isHovered(cursorX - padding, barY - padding / 2.0F, tabWidth, iconSize + padding, context)) {
            eo.set(en.HAND);
         }

         cursorX += tabWidth;
         if (i < this.f.size() - 1) {
            cursorX += separatorGap;
         }
      }

      staticBatch.draw();
   }

   /**
    * Рисует текстовые подписи названий категорий рядом с их иконками.
    */
   private void renderTabLabels(UIContext context, float startX, float barY, float barHeight, float iconSize, float padding, float separatorGap, float alpha) {
      float iconLabelPad = 5.0F;
      float iconCenterOffset = (barHeight - iconSize) / 2.0F;
      fq batch = new fq(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.REGULAR);
      float cursorX = startX + padding;

      for (int i = 0; i < this.f.size(); i++) {
         dL cat = this.f.get(i);
         String label = this.b(cat);
         float labelWidth = Fonts.REGULAR.getFont(6.5F).width(label);
         float textX = cursorX + iconSize + iconLabelPad;
         float textY = barY + iconCenterOffset + iconSize / 2.0F - Fonts.REGULAR.getFont(6.5F).height() / 2.0F;
         float textAlpha = 0.5F + 0.5F * cat.getSelected().getValue();
         context.drawText(Fonts.REGULAR.getFont(6.5F), label, textX, textY, ec.getTextColor().mulAlpha(textAlpha));

         float tabWidth = iconSize + iconLabelPad + labelWidth + padding * 2.0F;
         cursorX += tabWidth;
         if (i < this.f.size() - 1) {
            cursorX += separatorGap;
         }
      }

      batch.draw();
   }

    /** Рендерит нижнюю панель: аватар игрока, имя, сервер, UID и кнопки быстрого доступа. */
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
      float var27 = var25 * 3.0F + var26 * 2.0F;
      float var28 = y + this.b.getHeight() + 10.0F;
      float var29 = x + (this.b.getWidth() - var27) / 2.0F;
      float var30 = var29 + var25 + var26;
      float var30b = var30 + var25 + var26;
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

      if (bJ.showGlass()) {
         context.drawLiquidGlass(
            var30b,
            var28,
            var25,
            var25,
            bJ.getGlassBlur(),
            bJ.getDistortion(),
            BorderRadius.all(6.0F),
            ec.getLiquidGlassColor().mulAlpha(alpha * bJ.getGlassAlpha())
         );
         context.drawRoundedRect(
            var30b, var28, var25, var25, BorderRadius.all(6.0F), bJ.getBackgroundColor().withAlpha((int)(255.0F * (0.8F - 0.6F * bJ.glass()) * alpha))
         );
      } else {
         context.drawRoundedRect(var30b, var28, var25, var25, BorderRadius.all(6.0F), ec.getBackgroundColor().mulAlpha(alpha));
      }

      var32 = var30b + (var25 - var31) / 2.0F;
      var33 = var28 + (var25 - var31) / 2.0F;
      context.drawTexture(Mytheria.id("icons/online.png"), var32, var33, var31, var31, ec.WHITE);
      if (er.isHovered(var30b, var28, var25, var25, context)) {
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

    /** Возвращает название текущего сервера или «Singleplayer» для одиночной игры. */
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

    /** Рендерит панель поискового поля с анимацией появления. */
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

    /** Рендерит боковую панель с пресетами цветов и кнопкой добавления нового пресета. */
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

    /**
     * Проверяет, находится ли модуль в пределах видимой области сетки.
     */
    private boolean isModuleVisible(dN module, float y) {
       return module.getY() >= y + 36.0F && module.getY() + module.getHeight() <= y + this.b.getHeight() - 61.0F;
    }

    /**
     * При активном поиске принудительно устанавливает смещение 1.0 для совпадающих модулей.
     */
    private void updateSearchVisibility() {
       if (this.isSearchActive()) {
          for (dL cat : this.f) {
             for (dN mod : cat.getModules()) {
                if (this.b(mod) && !mod.getModule().isHidden()) {
                   mod.getOffset().setValue(1.0F);
                   mod.getVisible().setValue(1.0F);
                }
             }
          }
       }
    }

    /**
     * Основной цикл компоновки: итерирует категории, позиционирует модули
     * в 3-колоночной сетке и рендерит видимые элементы.
     *
     * @return высота содержимого для расчёта границ прокрутки
     */
     private float layoutAndRenderModules(UIContext context, float x, float y, float scroll, float alpha) {
        float cursorY = scroll + 41.0F;
       float cursorX = 0.0F;
       float moduleWidth = 155.0F;
       float gap = 7.5F;
       byte colCount = 3;
       float totalWidth = moduleWidth * colCount + gap * (colCount - 1);
       float gridStartX = x + (this.b.getWidth() - totalWidth) / 2.0F;
       fu batch = new fu(5.0F);
       int sharedColIndex = 0;

       for (dL cat : this.f) {
          if (cat.getCategory() == this.d || this.isSearchActive()) {
             cat.setY(cursorY - scroll);
             int colIndex = this.isSearchActive() ? sharedColIndex : 0;

             for (dN mod : cat.getModules()) {
                boolean hasSettings = !this.c(mod);
                mod.getVisible().update(hasSettings);
                mod.getOffset().update(hasSettings);
                if (this.b(mod) && !this.a(mod)) {
                   mod.set(gridStartX + cursorX, y + cursorY, moduleWidth, 28.0F);
                   if (this.isModuleVisible(mod, y)) {
                      mod.render(context);
                      if (er.isHovered(mod.getX(), mod.getY(), mod.getWidth(), mod.getHeight(), context)) {
                         eo.set(en.HAND);
                      }
                   } else {
                      mod.updateHover(context.getMouseX(), context.getMouseY());
                   }

                   colIndex++;
                   cursorX += mod.getWidth() + gap;
                   if (colIndex >= colCount) {
                      cursorY += 34.0F;
                      cursorX = 0.0F;
                      colIndex = 0;
                   }
                }
             }

             if (!this.isSearchActive()) {
                if (colIndex != 0) {
                   cursorY += 34.0F;
                }
                cursorX = 0.0F;
             }
             sharedColIndex = colIndex;
          }
       }

       batch.draw();
       return cursorY;
    }

    /**
     * Второй проход: рендерит скруглённые прямоугольники видимых модулей.
     */
    private void renderModuleRoundRects(UIContext context, float x, float y) {
       ft batch = new ft();

       for (dL cat : this.f) {
          if (cat.getCategory() == this.d || this.isSearchActive()) {
             for (dN mod : cat.getModules()) {
                if (!this.a(mod) && this.b(mod)) {
                   if (this.isModuleVisible(mod, y)) {
                      mod.renderRounds(context);
                   }
                }
             }
          }
       }

       batch.draw();
    }

    /**
     * Третий проход: рендерит оверлеи видимых модулей.
     */
    private void renderModuleOverlays(UIContext context, float x, float y) {
       ft batch = new ft();

       for (dL cat : this.f) {
          if (cat.getCategory() == this.d || this.isSearchActive()) {
             for (dN mod : cat.getModules()) {
                if (!this.a(mod) && this.b(mod)) {
                   if (this.isModuleVisible(mod, y)) {
                      mod.renderInto(context);
                   }
                }
             }
          }
       }

       batch.draw();
    }

    /**
     * Четвёртый проход: рендерит текст среднего шрифта видимых модулей.
     */
    private void renderModuleMediumText(UIContext context, float x, float y) {
       fq batch = new fq(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.MEDIUM);

       for (dL cat : this.f) {
          if (cat.getCategory() == this.d || this.isSearchActive()) {
             for (dN mod : cat.getModules()) {
                if (!this.a(mod) && this.b(mod)) {
                   if (this.isModuleVisible(mod, y)) {
                      mod.renderMedium(context);
                   }
                }
             }
          }
       }

       batch.draw();
    }

    /**
     * Рисует вертикальные разделители между колонками сетки модулей.
     */
    private void renderColumnSeparators(UIContext context, float x, float y) {
       float moduleWidth = 155.0F;
       float gap = 7.5F;
       byte colCount = 3;
       float totalWidth = moduleWidth * colCount + gap * (colCount - 1);
       float gridStartX = x + (this.b.getWidth() - totalWidth) / 2.0F;

       for (int col = 0; col < colCount; col++) {
          float separatorX = gridStartX + col * (moduleWidth + gap);
          fp batch = new fp(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.REGULAR, 0.9F, 1.0F, moduleWidth - 30.0F, separatorX, context.getMatrices().peek().getPositionMatrix());

          for (dL cat : this.f) {
             if (cat.getCategory() == this.d || this.isSearchActive()) {
                for (dN mod : cat.getModules()) {
                   if (!this.a(mod) && this.b(mod) && mod.getX() >= separatorX - 1.0F && mod.getX() <= separatorX + 1.0F) {
                      if (this.isModuleVisible(mod, y)) {
                         mod.renderRegular(context);
                      }
                   }
                }
             }
          }

          batch.draw();
       }
    }

    /**
     * Рассчитывает и устанавливает максимальное значение прокрутки по высоте содержимого.
     */
    private void updateScrollBounds(float scroll, float contentHeight) {
       float visibleHeight = this.b.getHeight() - 90.0F;
       float maxScroll = -Math.max(0.0F, contentHeight - visibleHeight);
       this.c.setMax(maxScroll - 10.0F);
    }

    /**
     * Рендерит сетку модулей текущей категории с прокруткой и разделителями.
     */
    private void a(UIContext context, float x, float y, float scroll, boolean dark, float alpha) {
       RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, alpha);
       fm.push(context.getMatrices(), this.b.getX(), this.b.getY() + 36.0F, this.b.getWidth(), this.b.getHeight() - 91.0F);
       if (this.d == du.OTHER && this.a(this.o)) {
          this.a(context, x, y, scroll, alpha);
          fm.pop();
       } else {
          this.updateSearchVisibility();
          float contentHeight = this.layoutAndRenderModules(context, x, y, scroll, alpha);
          this.renderModuleRoundRects(context, x, y);
          this.renderModuleOverlays(context, x, y);
          this.renderModuleMediumText(context, x, y);
          this.renderColumnSeparators(context, x, y);
          this.updateScrollBounds(scroll, contentHeight);
          fm.pop();
       }
    }

    /** Проверяет, скрыт ли компонент модуля (смещение 0 или модуль скрыт). При поиске — только isHidden. */
    private boolean a(dN component) {
       if (this.isSearchActive()) return component.getModule().isHidden();
       return component.getOffset().getValue() == 0.0F || component.getModule().isHidden();
    }

    /** Проверяет, соответствует ли модуль поисковому запросу по имени или описанию. */
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

    /** Возвращает true, если поисковое поле не пустое и активно. */
    private boolean isSearchActive() {
      return this.i != null && !this.i.getBuiltText().isBlank();
   }

    /** Проверяет, открыто ли окно настроек для данного компонента модуля. */
    private boolean c(dN component) {
      return this.g.stream().anyMatch(window -> window.getModule() == component);
   }

    /** Обрабатывает клики мыши: выбор категорий, переключение модулей, drag окон, пипетка и пресеты цвета. */
    @Override
    public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
       if (!Mytheria.getInstance().getHud().getIsland().handleClick((float)mouseX, (float)mouseY, button.getButtonIndex())) {
          if (this.v != null && this.v.isShowing()) {
             this.v.onMouseClicked(mouseX, mouseY, button);
             return;
          }

          if (handleColorPickerClicks(mouseX, mouseY, button)) return;
          if (handleFloatingWindowClicks(mouseX, mouseY, button)) return;

          if (button != MouseButton.MIDDLE) {
             this.i.onMouseClicked(mouseX, mouseY, button);
          }

          if (handleEyedropperClick(mouseX, mouseY, button)) return;
          if (handlePipetteButtonClick(mouseX, mouseY)) return;
          if (handleCloseButtonClick(mouseX, mouseY)) return;
          if (handleQuickAccessClick(mouseX, mouseY)) return;
          if (handlePresetClicks(mouseX, mouseY, button)) return;
          if (handleAddPresetClick(mouseX, mouseY)) return;

          float var6 = this.b.getX();
          float var7 = this.b.getY();

          float var62 = 10.0F;
          float var64 = var6 + this.b.getWidth() - var62 - 30.0F;
          float var67 = var7 + 13.0F;
          if (er.isHovered(var64, var67, var62, var62, mouseX, mouseY)) {
             this.i.setFocused(!this.i.isFocused());
             return;
          }

          if (handleCategoryTabClick(mouseX, mouseY)) return;
          if (handleModuleGridClick(mouseX, mouseY, button)) return;

          super.onMouseClicked(mouseX, mouseY, button);
       }
    }

    /** Завершает drag-операции окон, пикеров цвета и поискового поля. */
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

    /** Прокручивает список модулей и передаёт событие в плавающие окна. */
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

    /** Обрабатывает нажатия клавиш: Ctrl+F для поиска, привязка модулей, передача в окна. */
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
         if (keyCode == 259 || keyCode == 261) {
            this.c.setValue(0.0);
         }
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

    /** Передаёт ввод текста в поисковое поле и активные модули. */
    public boolean charTyped(char chr, int modifiers) {
      for (dO var4 : this.g) {
         var4.charTyped(chr, modifiers);
      }

      if (this.i.isFocused() && !this.isBindingModule()) {
         this.i.charTyped(chr, modifiers);
         this.c.setValue(0.0);
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

    /** Закрывает ClickGUI, запускает анимацию закрытия и сбрасывает состояние поиска. */
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

    /** Возвращает false — игра не ставится на паузу при открытии ClickGUI. */
    public boolean shouldPause() {
      return false;
   }

    /** Рисует чёрный фон, если мир не загружен (одиночная игра). */
     public void renderBackground(DrawContext context, int mouseX, int mouseY, float delta) {
        if (mc.world == null) {
            context.fill(0, 0, (int)sr.getScaledWidth(), (int)sr.getScaledHeight(), 0xFF000000);
        }
    }

    /** Возвращает true — закрытие по ESC разрешено. */
    public boolean shouldCloseOnEsc() {
      return true;
   }

    /** Проверяет, находится ли хотя бы один модуль в режиме привязки клавиши. */
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

    /** Проверяет, является ли категория панелью HUD (OTHER). */
    private boolean a(dL category) {
      return category == this.o;
   }

    /** Возвращает отображаемое имя категории: «Hud» для OTHER или название категории. */
    private String b(dL category) {
      return this.a(category) ? "Hud" : category.getCategory().getName();
   }

    /** Рендерит сетку элементов HUD вкладки OTHER. */
    private void a(UIContext context, float x, float y, float scroll, float alpha) {
      float var6 = scroll + 41.0F;
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
         boolean var18 = var16.getY() >= y + 36.0F && var16.getY() + var16.getHeight() <= y + this.b.getHeight() - 61.0F;
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
         boolean var30 = var27.getY() >= y + 36.0F && var27.getY() + var27.getHeight() <= y + this.b.getHeight() - 61.0F;
         if (var30) {
            var27.renderRounds(context);
         }
      }

      var24.draw();
      ft var26 = new ft();

      for (dQ var31 : this.q) {
         boolean var19 = var31.getY() >= y + 36.0F && var31.getY() + var31.getHeight() <= y + this.b.getHeight() - 61.0F;
         if (var19) {
            var31.renderInto(context);
         }
      }

      var26.draw();
      fq var29 = new fq(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.MEDIUM);

      for (dQ var35 : this.q) {
         boolean var20 = var35.getY() >= y + 36.0F && var35.getY() + var35.getHeight() <= y + this.b.getHeight() - 61.0F;
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
               boolean var23 = var22.getY() >= y + 36.0F && var22.getY() + var22.getHeight() <= y + this.b.getHeight() - 61.0F;
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

    /**
     * Обрабатывает клики по выборщикам цвета: пересылает клик, проверяет наведение
     * и скрывает неактивные пикеры, если кнопка добавления пресета не наведена.
     */
    private boolean handleColorPickerClicks(double mouseX, double mouseY, MouseButton button) {
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
             return true;
          }

          if (!var17) {
             var19.setShowing(false);
          }
       }

       return false;
    }

    /**
     * Обрабатывает клики по плавающим окнам: пересылает клик, проверяет наведение
     * и закрывает окно, если клик был вне его области.
     */
    private boolean handleFloatingWindowClicks(double mouseX, double mouseY, MouseButton button) {
       for (dO var55 : this.g) {
          var55.onMouseClicked(mouseX, mouseY, button);
          if (var55.isHovered(mouseX, mouseY)) {
             return true;
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

       return false;
    }

    /**
     * Обрабатывает клик пипетки-образца: левый клик берёт цвет с экрана,
     * правый клик отменяет режим пипетки.
     */
    private boolean handleEyedropperClick(double mouseX, double mouseY, MouseButton button) {
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

          return true;
       }

       return false;
    }

    /**
     * Обрабатывает клики по пресетам цвета: левый клик выбирает пресет,
     * правый клик удаляет его из списка.
     */
    private boolean handlePresetClicks(double mouseX, double mouseY, MouseButton button) {
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

             return true;
          }

          var14 += var11 + var12;
       }

       return false;
    }

    /**
     * Обрабатывает клик по кнопке добавления нового пресета цвета:
     * открывает диалог выбора цвета для новой темы.
     */
    private boolean handleAddPresetClick(double mouseX, double mouseY) {
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
          return true;
       }

       return false;
    }

    /**
     * Обрабатывает клики по вкладкам категорий: определяет какая вкладка наведена,
     * переключает категорию, сбрасывает прокрутку и поиск.
     */
    private boolean handleCategoryTabClick(double mouseX, double mouseY) {
       float var6 = this.b.getX();
       float var7 = this.b.getY();
        float var33 = 36.0F;
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

             return true;
          }

          var78 += var46;
          if (var79 < this.f.size() - 1) {
             var78 += var36;
          }
       }

       return false;
    }

    /**
     * Обрабатывает клики по сетке модулей: проверяет границы и наведение,
     * пересылает клик соответствующему модулю или элементу интерфейса.
     */
    private boolean handleModuleGridClick(double mouseX, double mouseY, MouseButton button) {
       float var7 = this.b.getY();

       if (this.d == du.OTHER && this.a(this.o)) {
          for (dQ var83 : this.q) {
             if (er.isHovered(var83.getX(), var83.getY(), var83.getWidth(), var83.getHeight(), mouseX, mouseY)) {
                var83.onMouseClicked(mouseX, mouseY, button);
                return true;
             }
          }
       } else {
          for (dL var82 : this.f) {
             if (var82.getCategory() == this.d || this.isSearchActive()) {
                for (dN var85 : var82.getModules()) {
                   boolean var86 = var85.getY() >= var7 + 36.0F && var85.getY() + var85.getHeight() <= var7 + this.b.getHeight() - 61.0F;
                   if (!var85.getModule().isHidden()
                      && this.b(var85)
                      && var86
                      && er.isHovered(var85.getX(), var85.getY(), var85.getWidth(), var85.getHeight(), mouseX, mouseY)) {
                      var85.onMouseClicked(mouseX, mouseY, button);
                      return true;
                   }
                }
             }
          }
       }

       return false;
    }

    /**
     * Обрабатывает клики по кнопкам быстрого доступа: инвентарь и waypoints.
     */
    private boolean handleQuickAccessClick(double mouseX, double mouseY) {
       float var6 = this.b.getX();
       float var7 = this.b.getY();
       float var24 = 30.0F;
       float var25 = 5.0F;
       float var26 = var24 * 3.0F + var25 * 2.0F;
       float var27 = var7 + this.b.getHeight() + 10.0F;
       float var28 = var6 + (this.b.getWidth() - var26) / 2.0F;
       float var29 = var28 + var24 + var25;
       float var30 = var29 + var24 + var25;
       if (er.isHovered(var29, var27, var24, var24, mouseX, mouseY)) {
          mc.setScreen(new dX());
          return true;
       }
       if (er.isHovered(var30, var27, var24, var24, mouseX, mouseY)) {
          mc.setScreen(new evA());
          return true;
       }

       return false;
    }

    /**
     * Обрабатывает клик по кнопке пипетки: активирует режим выбора цвета с экрана.
     */
    private boolean handlePipetteButtonClick(double mouseX, double mouseY) {
       float var6 = this.b.getX();
       float var7 = this.b.getY();
       float var53 = 8.0F;
       float var56 = var6 + this.b.getWidth() - var53 - 44.0F;
       float var59 = var7 + 9.0F;
       if (er.isHovered(var56, var59, var53, var53, mouseX, mouseY)) {
          this.m = true;
          return true;
       }

       return false;
    }

    /**
     * Обрабатывает клик по кнопке закрытия: закрывает текущее окно меню.
     */
    private boolean handleCloseButtonClick(double mouseX, double mouseY) {
       float var6 = this.b.getX();
       float var7 = this.b.getY();
       float var60 = 8.0F;
       float var61 = var6 + this.b.getWidth() - var60 - 15.0F;
       float var23 = var7 + 9.0F;
       if (er.isHovered(var61, var23, var60, var60, mouseX, mouseY)) {
          this.close();
          return true;
       }

       return false;
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
