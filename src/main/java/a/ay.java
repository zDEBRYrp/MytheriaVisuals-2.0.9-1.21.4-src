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
import a.uc.dR;
import a.uc.eY;
import a.uc.cK;
import a.uc.cO;
import a.az;
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
import a.uc.dD;
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
import a.uc.bA;
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
import a.uc.aV;
import a.uc.eH;
import a.uc.eB;
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
import a.ay;
import a.uc.dT;
import a.uc.dJ;
import a.uc.fF;
import a.uc.aR;
import a.uc.fG;
import a.uc.dV;
import a.uc.aX;
import a.uc.dG;
import a.uc.E;
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
import a.uc.F;
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

import java.util.Collection;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.CustomScreen;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.systems.modules.constructions.swinganim.PopupEvent;
import nesquik.mytheria.systems.setting.Setting;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import nesquik.mytheria.utility.interfaces.IScaledResolution;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.Hand;

public class ay extends CustomScreen implements IMinecraft, IScaledResolution {
   private final cC a = new cC(100.0F, 100.0F).title("presets");
   private final cC b = new cC(100.0F, 100.0F).title("shared");
   private final cC c = new cC(300.0F, 100.0F).title("anim_from");
   private final cC d = new cC(500.0F, 100.0F).title("anim_to");

   public ay() {
      az var1 = Mytheria.getInstance().getSwingManager();
      Mytheria.getInstance().getSwingPresetManager().refresh();
      this.a.add(new aD());
      this.a(var1.getSharedSettings().settings, this.b);
      this.a(var1.getStartPhase().settings, this.c);
      this.a(var1.getEndPhase().settings, this.d);
      az var2 = Mytheria.getInstance().getSwingManager();
      aG var3 = Mytheria.getInstance().getSwingPresetManager();
      String var4 = var2.getCurrent();
      aF var5 = var3.getPreset(var4);
      boolean var6 = var5 != null;
      if (!var6) {
         for (aE var8 : Mytheria.getInstance().getSwingManager().getPresets()) {
            if (var8.getName().equals(var4)) {
               var2.getBezier().start(var8.getBezierStart()).end(var8.getBezierEnd());
               var2.getBack().enabled(var8.isSwingBack());
               var2.getSpeed().setCurrentValue(var8.getSpeed());
               aA var9 = var2.getStartPhase();
               var9.getAnchorX().setCurrentValue(var8.getFrom().getAnchorX());
               var9.getAnchorY().setCurrentValue(var8.getFrom().getAnchorY());
               var9.getAnchorZ().setCurrentValue(var8.getFrom().getAnchorZ());
               var9.getMoveX().setCurrentValue(var8.getFrom().getMoveX());
               var9.getMoveY().setCurrentValue(var8.getFrom().getMoveY());
               var9.getMoveZ().setCurrentValue(var8.getFrom().getMoveZ());
               var9.getRotateX().setCurrentValue(var8.getFrom().getRotateX());
               var9.getRotateY().setCurrentValue(var8.getFrom().getRotateY());
               var9.getRotateZ().setCurrentValue(var8.getFrom().getRotateZ());
               aA var10 = var2.getEndPhase();
               var10.getAnchorX().setCurrentValue(var8.getTo().getAnchorX());
               var10.getAnchorY().setCurrentValue(var8.getTo().getAnchorY());
               var10.getAnchorZ().setCurrentValue(var8.getTo().getAnchorZ());
               var10.getMoveX().setCurrentValue(var8.getTo().getMoveX());
               var10.getMoveY().setCurrentValue(var8.getTo().getMoveY());
               var10.getMoveZ().setCurrentValue(var8.getTo().getMoveZ());
               var10.getRotateX().setCurrentValue(var8.getTo().getRotateX());
               var10.getRotateY().setCurrentValue(var8.getTo().getRotateY());
               var10.getRotateZ().setCurrentValue(var8.getTo().getRotateZ());
               var2.setCurrent(var4);
               break;
            }
         }
      }
   }

   @Override
   public void render(UIContext context) {
      float var2 = IScaledResolution.sr.getScaledWidth() / 2.0F - 360.0F + 4.0F;
      this.a.setX(var2);
      var2 += 180.0F;
      this.b.setX(var2);
      var2 += 180.0F;
      this.c.setX(var2);
      var2 += 180.0F;
      this.d.setX(var2);
      this.a(popup -> popup.render(context));
      this.a(popup -> popup.setY(sr.getScaledHeight() / 2.0F - this.d.getHeight() / 2.0F));
      this.a(popup -> popup.setWidth(170.0F));
      if (mc.player.age % 20 == 0) {
         mc.player.swingHand(Hand.MAIN_HAND);
      }
   }

   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      this.a(popup -> popup.onMouseClicked(mouseX, mouseY, button));
   }

   @Override
   public void onMouseReleased(double mouseX, double mouseY, MouseButton button) {
      this.a(popup -> popup.onMouseReleased(mouseX, mouseY, button));
   }

   @Override
   public boolean onMouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      this.a(popup -> popup.onScroll(mouseX, mouseY, horizontalAmount, verticalAmount));
      return true;
   }

   public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
      this.a(popup -> popup.onKeyPressed(keyCode, scanCode, modifiers));
      return super.keyPressed(keyCode, scanCode, modifiers);
   }

   public boolean charTyped(char chr, int modifiers) {
      this.a(popup -> popup.charTyped(chr, modifiers));
      return super.charTyped(chr, modifiers);
   }

   private void a(Collection<Setting> settings, cC target) {
      for (Setting var4 : settings) {
         target.setting(var4);
      }
   }

   private void a(PopupEvent event) {
      event.call(this.a);
      event.call(this.b);
      event.call(this.c);
      event.call(this.d);
   }

   public boolean shouldPause() {
      return false;
   }

   public void renderBackground(DrawContext context, int mouseX, int mouseY, float delta) {
   }

   public void close() {
      aG var1 = Mytheria.getInstance().getSwingPresetManager();
      if (var1.getCurrent() != null) {
         var1.getCurrent().save();
      }

      if (cK.LAST_FIELD != null) {
         cK.LAST_FIELD.setFocused(false);
      }

      super.close();
      mc.setScreen(Mytheria.getInstance().getMenuScreen());
   }
}
