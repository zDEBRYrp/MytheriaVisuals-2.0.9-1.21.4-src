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
import a.ck;
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
import a.h;
import a.j;
import a.uc.Q;
import a.uc.N;
import a.uc.bW;
import a.uc.P;
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
import a.i;
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
import a.uc.dJ;
import a.uc.fF;
import a.uc.aR;
import a.uc.fG;
import a.uc.dV;
import a.ax;
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

import lombok.Generated;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import nesquik.mytheria.systems.setting.settings.SliderSetting;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;

@ModuleInfo(name = "Sounds", category = ax.PLAYER, enabledByDefault = true, desc = "Добавляет звуки клиента")
public class ba extends aJ {
   private final SliderSetting a = new SliderSetting(this, "Громкость звука").step(0.1F).min(0.1F).max(1.0F).currentValue(1.0F);
   private final ck b = new ck(this, "Звук переключения");
   private final ck.a c = new ck.a(this.b, "Классический");
   private final ck.a d = new ck.a(this.b, "Звук 1");
   private final ck.a e = new ck.a(this.b, "Звук 2");
   private final ck.a f = new ck.a(this.b, "Звук 3");
   private final ck.a g = new ck.a(this.b, "Звук 4");
   private final ck.a h = new ck.a(this.b, "Звук 5");
   private final ck.a i = new ck.a(this.b, "Звук 6");
   private final ck.a j = new ck.a(this.b, "Звук 7");
   private final EventListener<S> k = event -> {
      if (event.getPacket() instanceof GameMessageS2CPacket var2) {
         String var4 = var2.content().getString();
         if (var4.contains("Вы успешно купили") || var4.contains("отправлено игроку")) {
            fL.APPLEPAY.play(this.a.getCurrentValue(), 1.0F);
         }
      }
   };

   public fK getToggleEnableSound() {
      if (this.d.isSelected()) {
         System.out.println("[Sounds] Playing MODULE_ENABLE_1");
         return fL.MODULE_ENABLE_1;
      } else if (this.e.isSelected()) {
         System.out.println("[Sounds] Playing MODULE_ENABLE_2");
         return fL.MODULE_ENABLE_2;
      } else if (this.f.isSelected()) {
         System.out.println("[Sounds] Playing MODULE_ENABLE_3");
         return fL.MODULE_ENABLE_3;
      } else if (this.g.isSelected()) {
         System.out.println("[Sounds] Playing MODULE_ENABLE_4");
         return fL.MODULE_ENABLE_4;
      } else if (this.h.isSelected()) {
         System.out.println("[Sounds] Playing MODULE_ENABLE_5");
         return fL.MODULE_ENABLE_5;
      } else if (this.i.isSelected()) {
         System.out.println("[Sounds] Playing MODULE_ENABLE_6");
         return fL.MODULE_ENABLE_6;
      } else if (this.j.isSelected()) {
         System.out.println("[Sounds] Playing MODULE_ENABLE_7");
         return fL.MODULE_ENABLE_7;
      } else {
         System.out.println("[Sounds] Playing MODULE (classic)");
         return fL.MODULE;
      }
   }

   public fK getToggleDisableSound() {
      if (this.d.isSelected()) {
         System.out.println("[Sounds] Playing MODULE_DISABLE_1");
         return fL.MODULE_DISABLE_1;
      } else if (this.e.isSelected()) {
         System.out.println("[Sounds] Playing MODULE_DISABLE_2");
         return fL.MODULE_DISABLE_2;
      } else if (this.f.isSelected()) {
         System.out.println("[Sounds] Playing MODULE_DISABLE_3");
         return fL.MODULE_DISABLE_3;
      } else if (this.g.isSelected()) {
         System.out.println("[Sounds] Playing MODULE_DISABLE_4");
         return fL.MODULE_DISABLE_4;
      } else if (this.h.isSelected()) {
         System.out.println("[Sounds] Playing MODULE_DISABLE_5");
         return fL.MODULE_DISABLE_5;
      } else if (this.i.isSelected()) {
         System.out.println("[Sounds] Playing MODULE_DISABLE_6");
         return fL.MODULE_DISABLE_6;
      } else if (this.j.isSelected()) {
         System.out.println("[Sounds] Playing MODULE_DISABLE_7");
         return fL.MODULE_DISABLE_7;
      } else {
         System.out.println("[Sounds] Playing MODULE (classic)");
         return fL.MODULE;
      }
   }

   @Generated
   public SliderSetting getVolume() {
      return this.a;
   }

   @Generated
   public EventListener<S> getReceivePacket() {
      return this.k;
   }
}
