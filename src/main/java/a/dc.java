package a;
import a.b;
import a.uc.bZ;
import a.uc.eF;
import a.uc.bY;
import a.uc.cC;
import a.uc.bN;
import a.uc.bR;
import a.uc.aQ;
import a.er;
import a.uc.eW;
import a.uc.fO;
import a.uc.dY;
import a.uc.eP;
import a.cn;
import a.l;
import a.uc.dR;
import a.uc.eY;
import a.uc.cK;
import a.uc.cO;
import a.uc.aZ;
import a.uc.eK;
import a.uc.dZ;
import a.uc.dX;
import a.uc.R;
import a.uc.aS;
import a.uc.cD;
import a.uc.U;
import a.d;
import a.uc.aP;
import a.uc.dS;
import a.uc.aH;
import a.uc.eD;
import a.uc.aW;
import a.dd;
import a.uc.bB;
import a.eo;
import a.uc.cP;
import a.uc.fK;
import a.uc.aB;
import a.uc.cJ;
import a.uc.cX;
import a.uc.eG;
import a.uc.dA;
import a.uc.eI;
import a.uc.aE;
import a.de;
import a.m;
import a.dw;
import a.h;
import a.j;
import a.uc.Q;
import a.n;
import a.uc.bW;
import a.p;
import a.uc.fJ;
import a.uc.V;
import a.g;
import a.uc.fD;
import a.uc.eX;
import a.uc.Z;
import a.uc.bS;
import a.uc.aO;
import a.uc.cE;
import a.uc.X;
import a.uc.fC;
import a.uc.aT;
import a.dh;
import a.uc.fP;
import a.uc.eM;
import a.ct;
import a.uc.bA;
import a.uc.eS;
import a.uc.cR;
import a.uc.aN;
import a.uc.cI;
import a.uc.cG;
import a.uc.bC;
import a.i;
import a.uc.bE;
import a.uc.aG;
import a.di;
import a.uc.aK;
import a.uc.aJ;
import a.o;
import a.uc.aV;
import a.uc.eH;
import a.eb;
import a.fe;
import a.uc.bK;
import a.uc.cF;
import a.uc.bF;
import a.en;
import a.uc.bI;
import a.dc;
import a.uc.cU;
import a.uc.aU;
import a.uc.bH;
import a.ea;
import a.uc.bM;
import a.uc.aF;
import a.a;
import a.uc.cL;
import a.fm;
import a.dm;
import a.uc.cA;
import a.uc.bD;
import a.uc.bX;
import a.ch;
import a.uc.bG;
import a.uc.fB;
import a.uc.fA;
import a.df;
import a.uc.bU;
import a.uc.cY;
import a.uc.aC;
import a.uc.aL;
import a.uc.bQ;
import a.uc.eE;
import a.et;
import a.k;
import a.uc.cB;
import a.uc.bT;
import a.uc.W;
import a.uc.eL;
import a.uc.bP;
import a.uc.aD;
import a.uc.fI;
import a.uc.T;
import a.uc.dB;
import a.uc.cV;
import a.c;
import a.uc.aY;
import a.uc.dT;
import a.dj;
import a.uc.fF;
import a.uc.aR;
import a.uc.fG;
import a.uc.dV;
import a.uc.aX;
import a.uc.dG;
import a.e;
import a.uc.dP;
import a.uc.Y;
import a.uc.cM;
import a.uc.eQ;
import a.uc.eV;
import a.uc.cS;
import a.uc.bO;
import a.ec;
import a.uc.fL;
import a.uc.bL;
import a.uc.aI;
import a.uc.cW;
import a.dl;
import a.uc.aM;
import a.ej;
import a.uc.bV;
import a.f;
import a.uc.cQ;
import a.uc.dQ;
import a.dk;
import a.uc.aA;
import a.uc.eZ;
import a.uc.S;
import a.uc.fH;
import a.uc.dU;
import a.uc.dN;
import a.uc.fN;
import a.uc.cZ;
import a.uc.eU;
import a.uc.bJ;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Font;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.utility.animation.base.Easing;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import nesquik.mytheria.utility.interfaces.IScaledResolution;
import net.minecraft.client.gui.hud.BossBarHud;
import net.minecraft.client.gui.screen.ChatScreen;

public class dc extends cP implements IMinecraft, IScaledResolution {
   private final cn a = new cn(this, "hud.dynamic_island.statuses").draggable();
   private final ch b = new ch(this, "hud.dynamic_island.show_side_icons").enabled(true);
   private final de c = new de(48.0F, 15.0F);
   private boolean d;
   private final dZ e = new dZ(200L, 0.0F, Easing.LINEAR);
   private final dZ f = new dZ(500L, 0.0F, Easing.BAKEK_SIZE);
   private final dZ g = new dZ(500L, 0.0F, Easing.BAKEK_SIZE);
   private final dZ h = new dZ(500L, 0.0F, Easing.BAKEK);
   private final dZ i = new dZ(400L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
   private final ea j = new ea(300L, new eb(0.0F, 0.0F, 0.0F), Easing.FIGMA_EASE_IN_OUT);
   private final ea k = new ea(300L, new eb(255.0F, 255.0F, 255.0F), Easing.LINEAR);
   private final fO l = new fO();
   private boolean m;
   private boolean n;
   private df o;
   private final EventListener<W> p = event -> {
      if (this.active() instanceof dk && mc.player.age % 2 == 0) {
      }
   };

   public dc() {
      super("hud.dynamic_island", "icons/hud/island.png");
      new dl(this.a);
      new dm(this.a);
      new di(this.a);
      new dj(this.a);
      new dk(this.a);
      new dh(this.a).alwaysEnabled();
      Mytheria.getInstance().getFileManager().readFile("client");
      Mytheria.getInstance().getEventManager().subscribe(this);
   }

   private boolean a() {
      try {
         if (!fe.isRendering()) {
            return false;
         }

         BossBarHud var1 = mc.inGameHud.getBossBarHud();
         if (var1 != null) {
            Field var2 = BossBarHud.class.getDeclaredField("bossBars");
            var2.setAccessible(true);
            Map var3 = (Map)var2.get(var1);
            return var3 != null && !var3.isEmpty();
         }
      } catch (Exception var4) {
      }

      return false;
   }

   public float getCurrentY() {
      return this.y;
   }

   public float getCurrentX() {
      return this.x;
   }

   @Override
   protected void renderComponent(UIContext context) {
      this.width = this.c.width;
      this.height = this.c.height;
      boolean var2 = this.a();
      this.i.update(var2 ? 1.0F : 0.0F);
      float var3 = 5.0F;
      float var4 = 15.0F * this.i.getValue();
      this.x = sr.getScaledWidth() / 2.0F - this.width / 2.0F;
      this.y = var3 + var4;
      float var5 = 2.0F + 4.0F * this.i.getValue() + 10.0F * this.e.getValue();
      float var6 = 6.0F + 10.0F * this.e.getValue();
      BorderRadius var7 = new BorderRadius(var5, var5, var6, var6);
      String var8 = ej.getCurrentTime();
      if (this.l.finished(500L)) {
         float var9 = mc.getWindow().getWidth() / 2.0F;
         float var10 = mc.getWindow().getHeight() - (this.y + 5.0F);
         eb var11 = eb.fromPixel(var9, var10);
         boolean var12 = (var11.getRed() + var11.getGreen() + var11.getBlue()) / 3.0F > 70.0F;
         this.n = var12;
         this.l.reset();
      }

      this.k.update(this.n ? new eb(0.0F, 0.0F, 0.0F) : new eb(255.0F, 255.0F, 255.0F));
      boolean var17 = Mytheria.getInstance().getThemeManager().getCurrentTheme() == ct.DARK;
      eb var18 = bJ.getBackgroundColor();
      this.m = this.n;
      eb var19 = this.k.getColor().withAlpha(255.0F * (1.0F - this.e.getValue()));
      if (mc.player != null && this.b.isEnabled()) {
         Font var20 = Fonts.REGULAR.getFont(7.0F);
         context.drawText(var20, var8, this.x - var20.width(var8) - 4.0F, this.y + 5.0F, var19);
         if (!mc.isInSingleplayer() && mc.player.networkHandler.getPlayerListEntry(mc.player.getUuid()) != null) {
            this.h.update(er.isHovered(this.x + this.width + 4.0F + 4.0F * this.h.getValue(), this.y + 5.0F, 12.8F, 7.0, context));
            int var13 = mc.player.networkHandler.getPlayerListEntry(mc.player.getUuid()).getLatency();
            int[] var14 = new int[]{450, 300, 150, 75};
            Font var15 = Fonts.REGULAR.getFont(7.0F);
            context.drawText(var15, var13 + " ms", this.x + this.width + 4.0F + 4.0F * this.h.getValue(), this.y + 5.0F, var19.mulAlpha(this.h.getValue()));

            for (int var16 = 0; var16 < 4; var16++) {
               context.drawRoundedRect(
                  this.x + this.width + 9.0F + var16 * 2.7F + 4.0F * this.h.getValue(),
                  this.y + 8.0F - var16,
                  2.0F,
                  3 + var16,
                  BorderRadius.all(0.1F),
                  var19.withAlpha(var19.getAlpha() * 0.2F * (1.0F - this.h.getValue()))
               );
            }

            for (int var27 = 0; var27 < 4; var27++) {
               if (var13 < var14[var27]) {
                  context.drawRoundedRect(
                     this.x + this.width + 9.0F + var27 * 2.7F + 4.0F * this.h.getValue(),
                     this.y + 8.0F - var27,
                     2.0F,
                     3 + var27,
                     BorderRadius.all(0.1F),
                     var19.mulAlpha(1.0F - this.h.getValue())
                  );
               }
            }
         } else {
            context.drawTexture(Mytheria.id("icons/airplane.png"), this.x + this.width + 8.0F, this.y + 3.5F, 8.0F, 8.0F, var19);
         }
      }

      df var21 = this.active();
      this.j.update(var21.getColor());
      boolean var22 = et.isLunarClient();
      if (bJ.showGlass() && !var22) {
         context.drawLiquidGlass(
            this.x,
            this.y,
            this.width,
            this.height,
            bJ.getGlassBlur(),
            bJ.getDistortion() - 0.07F * this.dragAnim.getValue(),
            var7,
            ec.getLiquidGlassColor().withAlpha(255.0F * bJ.getGlassAlpha())
         );
         context.drawRoundedRect(this.x, this.y, this.width, this.height, var7, var18.withAlpha(var18.getAlpha() * (0.8F - 0.6F * bJ.glass())));
      } else {
         if (bJ.showMinimalizm() && !var22) {
            context.drawBlurredRect(
               this.x, this.y, this.width, this.height, 11.25F, 2.0F + 5.0F * this.e.getValue(), var7, eb.WHITE.withAlpha(255.0F * bJ.minimalizm())
            );
         }

         context.drawRoundedRect(this.x, this.y, this.width, this.height, var7, var18);
      }

      for (cn.a var25 : this.a.getValues()) {
         ((df)var25).getAnimation().update(var21 == var25 ? 1.0F : 0.0F);
      }

      fm.push(context.getMatrices(), this.x, this.y, this.width, this.height);
      if (var21.getAnimation().getValue() == 1.0F) {
         var21.draw(context);
      } else {
         for (cn.a var26 : this.a.getValues()) {
            if (((df)var26).getAnimation().getValue() > 0.0F) {
               ((df)var26).drawWithAlpha(context);
            }
         }
      }

      fm.pop();
      this.f.update(var21.size.width);
      this.g.update(var21.size.height);
      this.c.width = this.f.getValue();
      this.c.height = this.g.getValue();
      this.e.update(this.d ? 1.0F : 0.0F);
      if (!(var21 instanceof dd)) {
         this.d = false;
      }

      if (!(mc.currentScreen instanceof ChatScreen) && !(mc.currentScreen instanceof dw) && !(mc.currentScreen instanceof cO) && mc.player != null || this.select) {
         this.d = false;
      }

      if (!this.d && var21 instanceof dd && er.isHovered(this.x, this.y, this.width, this.height, er.getMouse().getX(), er.getMouse().getY())) {
         eo.set(en.HAND);
      }
   }

   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      if (button == MouseButton.RIGHT) {
         super.onMouseClicked(mouseX, mouseY, button);
      } else {
         this.handleClick((float)mouseX, (float)mouseY, button.getButtonIndex());
      }
   }

   @Override
   public void onMouseReleased(double mouseX, double mouseY, MouseButton button) {
      this.dragging = false;
   }

   public boolean handleClick(float mouseX, float mouseY, int button) {
      float var4 = this.x;
      float var5 = this.y;
      if (this.d) {
         if (!er.isHovered(var4, var5, this.c.width, this.c.height, mouseX, mouseY)) {
            this.d = false;
         } else {
            this.active().click(mouseX, mouseY, button);
         }

         return true;
      } else if (er.isHovered(var4, var5, this.c.width, this.c.height, mouseX, mouseY) && this.active() instanceof dd) {
         this.d = true;
         return true;
      } else {
         return false;
      }
   }

   public df active() {
      return this.statuses().getLast();
   }

   public List<df> statuses() {
      return this.a
         .getValues()
         .stream()
         .filter(islandStatus -> ((df)islandStatus).canShow() && islandStatus.isSelected())
         .map(islandStatus -> (df)islandStatus)
         .toList()
         .reversed();
   }

   @Generated
   public cn getStatuses() {
      return this.a;
   }

   @Generated
   public de getSize() {
      return this.c;
   }

   @Generated
   public boolean isExtended() {
      return this.d;
   }

   @Generated
   public dZ getExtendingAnim() {
      return this.e;
   }

   @Generated
   @Override
   public dZ getWidthAnim() {
      return this.f;
   }

   @Generated
   @Override
   public dZ getHeightAnim() {
      return this.g;
   }

   @Generated
   public dZ getShowPing() {
      return this.h;
   }

   @Generated
   public ea getBackgroundColor() {
      return this.j;
   }

   @Generated
   public ea getAdaptColor() {
      return this.k;
   }

   @Generated
   public fO getTimer() {
      return this.l;
   }

   @Generated
   public boolean isDark() {
      return this.m;
   }

   @Generated
   public boolean isUseDark() {
      return this.n;
   }

   @Generated
   public df getLast() {
      return this.o;
   }

   @Generated
   public EventListener<W> getOnTick() {
      return this.p;
   }

   @Generated
   public dZ getBossBarOffsetAnim() {
      return this.i;
   }
}
