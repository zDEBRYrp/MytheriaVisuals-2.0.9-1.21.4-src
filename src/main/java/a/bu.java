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
import a.uc.H;
import a.uc.J;
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
import a.bu;
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

import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import nesquik.mytheria.systems.setting.settings.SliderSetting;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;

@ModuleInfo(name = "Tape Mouse", category = ax.PLAYER, desc = "modules.descriptions.tape_mouse")
public class bu extends aJ {
   private final ck a = new ck(this, "modules.settings.tape_mouse.button");
   private final ck.a b = new ck.a(this.a, "modules.settings.tape_mouse.button.left").select();
   private final ck.a c = new ck.a(this.a, "modules.settings.tape_mouse.button.right");
   private final SliderSetting d = new SliderSetting(this, "modules.settings.tape_mouse.delay")
      .min(1.0F)
      .max(500.0F)
      .step(1.0F)
      .currentValue(50.0F)
      .suffix(" мс");
   private final fO e = new fO();
   private float f = 50.0F;
   private final EventListener<W> g = event -> {
      if (mc.player != null && mc.currentScreen == null) {
         float var2 = this.d.getCurrentValue();
         if (var2 != this.f) {
            this.e.reset();
            this.f = var2;
         }

         long var3 = (long)var2;
         if (this.e.finished(var3)) {
            if (this.b.isSelected()) {
               this.a();
            } else if (this.c.isSelected()) {
               this.b();
            }

            this.e.reset();
         }
      }
   };

   private void a() {
      if (mc.interactionManager != null) {
         if (mc.targetedEntity != null) {
            if (!(mc.targetedEntity instanceof ClientPlayerEntity)) {
               mc.interactionManager.attackEntity(mc.player, mc.targetedEntity);
               mc.player.swingHand(Hand.MAIN_HAND);
            }
         } else if (mc.crosshairTarget != null) {
            switch (mc.crosshairTarget.getType()) {
               case BLOCK:
                  mc.interactionManager.updateBlockBreakingProgress(((BlockHitResult)mc.crosshairTarget).getBlockPos(), ((BlockHitResult)mc.crosshairTarget).getSide());
                  mc.player.swingHand(Hand.MAIN_HAND);
                  break;
               case ENTITY:
                  if (mc.targetedEntity != null && !(mc.targetedEntity instanceof ClientPlayerEntity)) {
                     mc.interactionManager.attackEntity(mc.player, mc.targetedEntity);
                     mc.player.swingHand(Hand.MAIN_HAND);
                  }
                  break;
               default:
                  mc.player.swingHand(Hand.MAIN_HAND);
            }
         }
      }
   }

   private void b() {
      if (mc.interactionManager != null) {
         if (mc.crosshairTarget != null) {
            switch (mc.crosshairTarget.getType()) {
               case BLOCK:
                  mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, (BlockHitResult)mc.crosshairTarget);
                  break;
               case ENTITY:
                  if (mc.targetedEntity != null) {
                     mc.interactionManager.interactEntity(mc.player, mc.targetedEntity, Hand.MAIN_HAND);
                  }
                  break;
               default:
                  mc.interactionManager.interactItem(mc.player, Hand.MAIN_HAND);
            }
         } else {
            mc.interactionManager.interactItem(mc.player, Hand.MAIN_HAND);
         }

         mc.player.swingHand(Hand.MAIN_HAND);
      }
   }

   @Override
   public void onEnable() {
      this.e.reset();
   }
}
