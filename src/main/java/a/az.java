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
import a.h;
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
import a.cf;
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
import a.ch;
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

import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.setting.settings.SliderSetting;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec2f;

public class az {
   private final List<aE> a = new ArrayList<>();
   private String b = "autosave";
   private final aB c = new aB();
   private final aA d = new aA();
   private final aA e = new aA();
   private final cf f = new cf(this.c, "animation").start(0.5F, 1.0F).end(0.5F, 0.0F);
   private final ch g = new ch(this.c, "swing.back").enable();
   private final SliderSetting h = new SliderSetting(this.c, "swing.wing_speed").step(1.0F).min(1.0F).max(5.0F).currentValue(2.0F);

   private void a() {
      this.a
         .add(
            new aE(
               "swings.bonk",
               new Vec2f(0.40131578F, 0.53543305F),
               new Vec2f(0.0F, -0.24409449F),
               true,
               2.0F,
               new aC(0.0F, -0.4F, -0.65000004F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F),
               new aC(0.0F, -0.4F, -0.65000004F, 0.0F, 0.0F, 0.0F, -45.0F, 0.0F, 0.0F)
            )
         );
      this.a
         .add(
            new aE(
               "swings.rotate_360",
               new Vec2f(0.43421054F, 0.61417323F),
               new Vec2f(0.04605263F, -0.26771653F),
               false,
               2.0F,
               new aC(0.0F, -0.4F, -0.65000004F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F),
               new aC(0.0F, -0.4F, -0.65000004F, 0.0F, 0.0F, 0.0F, -360.0F, 0.0F, 0.0F)
            )
         );
      this.a
         .add(
            new aE(
               "swings.from_me",
               new Vec2f(0.42105263F, 0.87401575F),
               new Vec2f(0.3881579F, -0.4566929F),
               true,
               2.0F,
               new aC(0.0F, 0.0F, -1.1F, 0.2F, 0.0F, -0.1F, -135.0F, 45.0F, 60.0F),
               new aC(0.0F, 0.0F, -1.1F, 0.2F, 0.0F, -0.3F, -180.0F, 45.0F, 60.0F)
            )
         );
   }

   public az() {
      this.a();
   }

   public aC transformations(float progress) {
      progress = this.f.easing().ease(progress, 0.0F, 1.0F, 1.0F);
      if (this.g.isEnabled()) {
         progress = MathHelper.sin(MathHelper.sqrt(progress) * (float) Math.PI);
      }

      return new aC(
         this.a(this.d.getAnchorX(), this.e.getAnchorX(), progress),
         this.a(this.d.getAnchorY(), this.e.getAnchorY(), progress),
         this.a(this.d.getAnchorZ(), this.e.getAnchorZ(), progress),
         this.a(this.d.getMoveX(), this.e.getMoveX(), progress),
         this.a(this.d.getMoveY(), this.e.getMoveY(), progress),
         this.a(this.d.getMoveZ(), this.e.getMoveZ(), progress),
         this.a(this.d.getRotateX(), this.e.getRotateX(), progress),
         this.a(this.d.getRotateY(), this.e.getRotateY(), progress),
         this.a(this.d.getRotateZ(), this.e.getRotateZ(), progress)
      );
   }

   private float a(SliderSetting start, SliderSetting end, float progress) {
      return eI.interpolate(start.getCurrentValue(), end.getCurrentValue(), progress);
   }

   public String getCurrent() {
      aG var1 = Mytheria.getInstance().getSwingPresetManager();
      return var1.getCurrent() != null ? var1.getCurrent().getFileName() : this.b;
   }

   @Generated
   public List<aE> getPresets() {
      return this.a;
   }

   @Generated
   public aB getSharedSettings() {
      return this.c;
   }

   @Generated
   public aA getStartPhase() {
      return this.d;
   }

   @Generated
   public aA getEndPhase() {
      return this.e;
   }

   @Generated
   public cf getBezier() {
      return this.f;
   }

   @Generated
   public ch getBack() {
      return this.g;
   }

   @Generated
   public SliderSetting getSpeed() {
      return this.h;
   }

   @Generated
   public void setCurrent(String current) {
      this.b = current;
   }
}
