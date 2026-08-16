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
import a.r;
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
import a.m;
import a.uc.dW;
import a.h;
import a.j;
import a.q;
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
import a.i;
import a.uc.bE;
import a.uc.aG;
import a.uc.dI;
import a.uc.aK;
import a.uc.aJ;
import a.o;
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
import a.bm;
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
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import nesquik.mytheria.systems.setting.settings.SliderSetting;

@ModuleInfo(name = "Inventory Utils", category = ax.PLAYER, desc = "modules.descriptions.invutils")
public class bm extends aJ {
   private final cn a = new cn(this, "modules.settings.invutils.targets");
   private final cn.a b = new cn.a(this.a, "modules.settings.invutils.item_scroller").select();
   private final cn.a c = new cn.a(this.a, "modules.settings.invutils.slot_lock").select();
   private final cn d = new cn(this, "modules.settings.slot_lock.lock", () -> !this.c.isSelected());
   private final cn.a e = new cn.a(this.d, "modules.settings.slot_lock.lock.slot1").select();
   private final cn.a f = new cn.a(this.d, "modules.settings.slot_lock.lock.slot2");
   private final cn.a g = new cn.a(this.d, "modules.settings.slot_lock.lock.slot3");
   private final cn.a h = new cn.a(this.d, "modules.settings.slot_lock.lock.slot4");
   private final cn.a i = new cn.a(this.d, "modules.settings.slot_lock.lock.slot5");
   private final cn.a j = new cn.a(this.d, "modules.settings.slot_lock.lock.slot6");
   private final cn.a k = new cn.a(this.d, "modules.settings.slot_lock.lock.slot7");
   private final cn.a l = new cn.a(this.d, "modules.settings.slot_lock.lock.slot8");
   private final cn.a m = new cn.a(this.d, "modules.settings.slot_lock.lock.slot9");
   private final SliderSetting n = new SliderSetting(this, "modules.settings.invutils.delay", () -> !this.b.isSelected())
      .currentValue(100.0F)
      .max(150.0F)
      .min(50.0F)
      .step(1.0F);
   private final fO o = new fO();
   private final fO p = new fO();
   private float q = -1.0F;
   private boolean r;

   public boolean isLocked(int slot) {
      cn.a[] var2 = new cn.a[]{this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m};
      return slot >= 0 && slot < var2.length && var2[slot].isSelected() && this.isEnabled();
   }

   @Generated
   public cn getUtil() {
      return this.a;
   }

   @Generated
   public cn.a getScroller() {
      return this.b;
   }

   @Generated
   public cn.a getSlotLock() {
      return this.c;
   }

   @Generated
   public cn getLock() {
      return this.d;
   }

   @Generated
   public cn.a getSlot1() {
      return this.e;
   }

   @Generated
   public cn.a getSlot2() {
      return this.f;
   }

   @Generated
   public cn.a getSlot3() {
      return this.g;
   }

   @Generated
   public cn.a getSlot4() {
      return this.h;
   }

   @Generated
   public cn.a getSlot5() {
      return this.i;
   }

   @Generated
   public cn.a getSlot6() {
      return this.j;
   }

   @Generated
   public cn.a getSlot7() {
      return this.k;
   }

   @Generated
   public cn.a getSlot8() {
      return this.l;
   }

   @Generated
   public cn.a getSlot9() {
      return this.m;
   }

   @Generated
   public SliderSetting getScrollDelay() {
      return this.n;
   }

   @Generated
   public fO getTimer() {
      return this.o;
   }

   @Generated
   public fO getHealTimer() {
      return this.p;
   }

   @Generated
   public float getLastHealth() {
      return this.q;
   }

   @Generated
   public boolean isEating() {
      return this.r;
   }
}
