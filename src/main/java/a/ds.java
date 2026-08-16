package a;
import a.b;
import a.uc.bZ;
import a.uc.eF;
import a.uc.bY;
import a.uc.cC;
import a.uc.bN;
import a.uc.bR;
import a.uc.aQ;
import a.uc.eR;
import a.uc.eW;
import a.uc.fO;
import a.uc.dY;
import a.uc.eP;
import a.uc.cN;
import a.uc.L;
import a.dr;
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
import a.ds;
import a.uc.aH;
import a.uc.eD;
import a.uc.aW;
import a.dd;
import a.uc.bB;
import a.uc.eO;
import a.uc.cP;
import a.uc.fK;
import a.uc.aB;
import a.uc.cJ;
import a.uc.cX;
import a.uc.eG;
import a.uc.dA;
import a.uc.eI;
import a.uc.aE;
import a.uc.dE;
import a.uc.M;
import a.uc.dW;
import a.uc.H;
import a.uc.J;
import a.uc.Q;
import a.uc.N;
import a.uc.bW;
import a.uc.P;
import a.uc.fJ;
import a.uc.V;
import a.uc.G;
import a.uc.fD;
import a.uc.eX;
import a.uc.Z;
import a.uc.bS;
import a.uc.aO;
import a.uc.cE;
import a.uc.X;
import a.uc.fC;
import a.uc.aT;
import a.uc.dH;
import a.uc.fP;
import a.uc.eM;
import a.uc.cT;
import a.ba;
import a.uc.eS;
import a.uc.cR;
import a.uc.aN;
import a.uc.cI;
import a.uc.cG;
import a.uc.bC;
import a.uc.I;
import a.uc.bE;
import a.uc.aG;
import a.uc.dI;
import a.uc.aK;
import a.uc.aJ;
import a.uc.O;
import a.av;
import a.uc.eH;
import a.eb;
import a.uc.fE;
import a.uc.bK;
import a.uc.cF;
import a.uc.bF;
import a.uc.eN;
import a.uc.bI;
import a.uc.dC;
import a.uc.cU;
import a.uc.aU;
import a.uc.bH;
import a.uc.eA;
import a.uc.bM;
import a.uc.aF;
import a.a;
import a.uc.cL;
import a.uc.fM;
import a.uc.dM;
import a.uc.cA;
import a.uc.bD;
import a.uc.bX;
import a.uc.cH;
import a.uc.bG;
import a.uc.fB;
import a.uc.fA;
import a.uc.dF;
import a.uc.bU;
import a.uc.cY;
import a.uc.aC;
import a.uc.aL;
import a.uc.bQ;
import a.uc.eE;
import a.uc.eT;
import a.uc.K;
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
import a.uc.dJ;
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
import a.uc.eC;
import a.uc.fL;
import a.uc.bL;
import a.uc.aI;
import a.uc.cW;
import a.uc.dL;
import a.uc.aM;
import a.uc.eJ;
import a.uc.bV;
import a.f;
import a.uc.cQ;
import a.uc.dQ;
import a.uc.dK;
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

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.CustomScreen;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Font;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.utility.animation.base.Easing;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import nesquik.mytheria.utility.interfaces.IScaledResolution;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.gui.screen.option.OptionsScreen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import ru.kotopushka.compiler.sdk.annotations.Compile;
import ru.kotopushka.compiler.sdk.annotations.VMProtect;

public class ds extends CustomScreen implements IMinecraft, IScaledResolution {
   private static boolean a;
   private static final List<dr> b = new ArrayList<>();
   private static final List<dr> c = new ArrayList<>();
   private final dZ d = new dZ(600L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
   private static final DateTimeFormatter e = DateTimeFormatter.ofPattern("HH:mm");
   private static final DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.yyyy");

   @Compile
   @VMProtect(type = fP.MUTATION)
   protected void init() {
      if (!a) {
         if (Mytheria.getInstance().getModuleManager().getModule(ba.class).isEnabled()) {
            fL.WELCOME.play(Mytheria.getInstance().getModuleManager().getModule(ba.class).getVolume().getCurrentValue());
         }

         b.add(
            new dr(
               "image/mainmenu/preview/localpreview.png",
               av.translate("mainmenu.singleplayer"),
               true,
               2.6666667F,
               () -> mc.setScreen(new SelectWorldScreen(this))
            )
         );
         b.add(
            new dr(
               "image/mainmenu/preview/serverpreview.png", av.translate("mainmenu.multiplayer"), true, 1.5F, () -> mc.setScreen(new MultiplayerScreen(this))
            )
         );
         c.add(new dr("", av.translate("mainmenu.quit"), false, 0.0F, mc::stop));
         c.add(new dr("", av.translate("mainmenu.settings"), false, 0.0F, () -> mc.setScreen(new OptionsScreen(this, mc.options))));
         a = true;
      }

      super.init();
   }

   @Override
   public void render(UIContext context) {
      if (Fonts.isInitialized()) {
         this.d.update(true);
         float var2 = this.d.getValue();
         float var3 = sr.getScaledWidth();
         float var4 = sr.getScaledHeight();
         float var5 = var3 / 2.0F;
         context.drawTexture(Mytheria.id("image/mainmenu/mainmenu.png"), 0.0F, 0.0F, var3, var4, eb.WHITE);
         float var6 = var4 * 0.5F;
         Font var7 = Fonts.MEDIUM.getFont(64.0F);
         Font var8 = Fonts.MEDIUM.getFont(17.0F);
         String var9 = LocalTime.now().format(e);
         String var10 = LocalDate.now().format(f);
         float var11 = var7.height() + 12.0F + var8.height();
         float var12 = (var6 - var11) / 2.0F;
         context.drawCenteredText(var7, var9, var5, var12, new eb(200.0F, 200.0F, 210.0F, (int)(255.0F * var2)));
         context.drawCenteredText(var8, var10, var5, var12 + var7.height() + 12.0F, new eb(200.0F, 200.0F, 210.0F, (int)(180.0F * var2)));
         float var13 = var5 - 133.0F;

         for (int var14 = 0; var14 < b.size(); var14++) {
            dr var15 = b.get(var14);
            var15.set(var13 + var14 * 136.0F, var6, 130.0F, 55.0F);
            var15.draw(context);
         }

         float var23 = var6 + 55.0F + 6.0F;
         Font var24 = Fonts.MEDIUM.getFont(10.0F);
         float var16 = 16.0F;
         float var17 = 0.0F;

         for (dr var19 : c) {
            var17 = Math.max(var17, var24.width(var19.getLabel()));
         }

         float var25 = var17 + var16 * 2.0F;
         float var26 = var25 * c.size() + 6.0F * (c.size() - 1);
         float var20 = var5 - var26 / 2.0F;

         for (int var21 = 0; var21 < c.size(); var21++) {
            dr var22 = c.get(var21);
            var22.set(var20 + var21 * (var25 + 6.0F), var23, var25, 18.0F);
            var22.draw(context);
         }

         Font var27 = Fonts.REGULAR.getFont(9.0F);
         context.drawCenteredText(var27, "MytheriaVisuals", var5, var4 - 18.0F, new eb(120.0F, 120.0F, 130.0F, (int)(200.0F * var2)));
         if (this.a()) {
            Mytheria.getInstance().getHud().getIsland().render(context);
         }
      }
   }

   @Compile
   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      if (!this.a() || !Mytheria.getInstance().getHud().getIsland().handleClick((float)mouseX, (float)mouseY, button.getButtonIndex())) {
         for (dr var7 : b) {
            if (var7.hovered(mouseX, mouseY)) {
               var7.click(mouseX, mouseY, button.getButtonIndex());
               return;
            }
         }

         for (dr var9 : c) {
            if (var9.hovered(mouseX, mouseY)) {
               var9.click(mouseX, mouseY, button.getButtonIndex());
               return;
            }
         }

         super.onMouseClicked(mouseX, mouseY, button);
      }
   }

   @Compile
   public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
      if (keyCode == 69) {
         Mytheria.getInstance().getThemeManager().switchTheme();
      }

      if (Screen.hasControlDown() && keyCode == 82) {
         MinecraftClient.getInstance().setScreen(new MultiplayerScreen(this));
      }

      if (Screen.hasControlDown() && keyCode == 84) {
         MinecraftClient.getInstance().setScreen(new SelectWorldScreen(this));
      }

      return super.keyPressed(keyCode, scanCode, modifiers);
   }

   private boolean a() {
      return Mytheria.getInstance().getMusicTracker().haveActiveSession();
   }

   public boolean shouldCloseOnEsc() {
      return false;
   }

   public void renderBackground(DrawContext context, int mouseX, int mouseY, float delta) {
   }
}
