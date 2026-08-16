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
import a.ca;
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
import a.cb;
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
import a.ec;
import a.fl;
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
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.CustomDrawContext;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.utility.animation.base.Easing;

public class ca {
   private final cb a;
   private final String b;
   private final String c;
   private final fO d = new fO();
   private final long e;
   private final dZ f = new dZ(400L, Easing.BAKEK);
   private final dZ g = new dZ(300L, Easing.BAKEK_SIZE);
   private final dZ h = new dZ(300L, Easing.BAKEK_SMALLER);

   public ca(cb type, String title, String desc) {
      this.a = type;
      this.b = title;
      this.c = desc;
      this.e = 2000L;
   }

   public void draw(CustomDrawContext context, float off) {
      float var3 = Math.max(Fonts.BOLD.getFont(7.0F).width(this.b), Fonts.MEDIUM.getFont(6.0F).width(this.c));
      float var4 = var3 + 32.0F;
      this.h.setEasing(Easing.BAKEK_SIZE);
      this.h.setDuration(300L);
      float var5 = context.getScaledWindowWidth() / 2.0F - var4 / 2.0F;
      float var6 = context.getScaledWindowHeight() - 90.0F - this.h.update(off);
      float var7 = 26.0F;
      int var8 = (int)(255.0F * this.f.getValue());
      fl.scale(context.getMatrices(), var5 + var4 / 2.0F, var6 + 12.0F + var7 / 2.0F, 0.5F + 0.5F * this.f.getValue());
      if (bJ.showGlass()) {
         context.drawLiquidGlass(
            var5,
            var6,
            var4,
            var7,
            bJ.getGlassBlur(),
            bJ.getDistortion(),
            BorderRadius.all(8.0F),
            ec.getLiquidGlassColor().withAlpha(255.0F * this.f.getValue() * bJ.getGlassAlpha())
         );
         context.drawRoundedRect(
            var5, var6, var4, var7, BorderRadius.all(8.0F), ec.getBackgroundColor().withAlpha(255.0F * (0.8F - 0.6F * bJ.glass()) * this.f.getValue())
         );
      } else {
         context.drawBlurredRect(var5, var6, var4, var7, 11.25F, 7.0F, BorderRadius.all(8.0F), eb.WHITE.withAlpha(255.0F * this.f.getValue() * bJ.minimalizm()));
         context.drawRoundedRect(var5, var6, var4, var7, BorderRadius.all(8.0F), new eb(0.0F, 0.0F, 0.0F).withAlpha((int)(140.25F * this.f.getValue())));
         context.drawRoundedRect(
            var5 + var7 / 2.0F - 9.0F,
            var6 + var7 / 2.0F - 9.0F,
            18.0F,
            18.0F,
            BorderRadius.all(4.0F),
            new eb(0.0F, 0.0F, 0.0F).withAlpha((int)(51.0F * this.f.getValue()))
         );
      }

      context.drawTexture(
         Mytheria.id("icons/" + this.a.getName() + ".png"),
         var5 + var7 / 2.0F - 4.5F,
         var6 + var7 / 2.0F - 4.5F,
         10.0F,
         10.0F,
         this.a.getColor().withAlpha(var8 * 0.8F)
      );
      context.drawText(Fonts.BOLD.getFont(7.0F), this.b, var5 + 27.0F, var6 + 7.0F, eb.WHITE.withAlpha(var8));
      context.drawText(Fonts.MEDIUM.getFont(6.0F), this.c, var5 + 27.0F, var6 + 15.0F, eb.WHITE.withAlpha(var8));
      fl.end(context.getMatrices());
   }

   public void update() {
      this.f.setDuration(400L);
      this.f.setEasing(this.d.finished(this.e) ? Easing.BAKEK_BACK : Easing.BAKEK);
      this.f.update(this.d.finished(this.e) ? 0.0F : 1.0F);
   }

   public boolean isFinished() {
      return this.f.getValue() == 0.0F && this.d.finished(this.e);
   }

   @Generated
   public cb getType() {
      return this.a;
   }

   @Generated
   public String getTitle() {
      return this.b;
   }

   @Generated
   public String getDesc() {
      return this.c;
   }

   @Generated
   public fO getTimer() {
      return this.d;
   }

   @Generated
   public long getDuration() {
      return this.e;
   }

   @Generated
   public dZ getAnimation() {
      return this.f;
   }

   @Generated
   public dZ getShowing() {
      return this.g;
   }

   @Generated
   public dZ getAnimY() {
      return this.h;
   }
}
