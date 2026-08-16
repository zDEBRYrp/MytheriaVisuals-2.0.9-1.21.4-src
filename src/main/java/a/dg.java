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
import a.ep;
import a.cn;
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
import a.eb;
import a.uc.fE;
import a.uc.bK;
import a.uc.cF;
import a.uc.bF;
import a.uc.eN;
import a.uc.bI;
import a.dc;
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
import a.df;
import a.uc.bU;
import a.uc.cY;
import a.uc.aC;
import a.uc.aL;
import a.uc.bQ;
import a.uc.eE;
import a.et;
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
import a.dg;
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

import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.CustomDrawContext;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Font;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.utility.animation.base.Easing;
import nesquik.mytheria.utility.interfaces.IMinecraft;

public class dg extends df implements IMinecraft {
   private String a = "";
   private String b = "";
   private int c = -1;
   private String d = "text";
   private eb e;
   protected cA timeAnim;
   private static final boolean f = et.isLunarClient();

   public dg(cn setting, String name) {
      super(setting, name);
   }

   @Override
   public void draw(CustomDrawContext context) {
      dc var2 = Mytheria.getInstance().getHud().getIsland();
      float var3 = var2.getCurrentX();
      float var4 = var2.getCurrentY();
      Font var5 = Fonts.MEDIUM.getFont(6.0F);
      if (f) {
         String var9 = String.valueOf(this.c);
         float var10 = var5.width(this.a + var9 + this.b);
         float var11 = this.size.width = 17.0F + Fonts.MEDIUM.getFont(7.0F).width(this.d) + var10;
         context.drawRoundedRect(
            var3 - 16.0F + 20.0F * this.animation.getValue(),
            var4 + 3.5F,
            5.5F + var10,
            8.0F,
            BorderRadius.all(3.0F),
            this.e.withAlpha(255.0F * this.animation.getValue())
         );
         context.drawText(
            var5, this.a + var9 + this.b, var3 - 13.0F + 20.0F * this.animation.getValue(), var4 + 5.5F, eb.WHITE.withAlpha(255.0F * this.animation.getValue())
         );
         context.drawText(
            Fonts.MEDIUM.getFont(7.0F),
            this.d,
            var3 + 23.0F - 10.0F * this.animation.getValue() + var10,
            var4 + 5.5F,
            ec.getTextColor().withAlpha(255.0F * this.animation.getValue())
         );
      } else {
         if (this.timeAnim == null) {
            this.timeAnim = new cA(Fonts.MEDIUM.getFont(6.0F), 5.0F, 500L, Easing.BAKEK);
         }

         float var6 = this.timeAnim.getWidth() + var5.width(this.a + this.b);
         float var7 = this.size.width = 17.0F + Fonts.MEDIUM.getFont(7.0F).width(this.d) + var6;
         float var8 = this.size.height = 15.0F;
         context.drawRoundedRect(
            var3 - 16.0F + 20.0F * this.animation.getValue(),
            var4 + 3.5F,
            5.5F + var6,
            8.0F,
            BorderRadius.all(3.0F),
            this.e.withAlpha(255.0F * this.animation.getValue())
         );
         context.drawText(
            Fonts.MEDIUM.getFont(6.0F),
            this.a,
            var3 - 13.0F + 20.0F * this.animation.getValue(),
            var4 + 5.5F,
            eb.WHITE.withAlpha(255.0F * this.animation.getValue())
         );
         this.timeAnim.update(this.c);
         this.timeAnim.pos(var3 - 13.0F + 20.0F * this.animation.getValue() + var5.width(this.a), var4 + 5.5F);
         this.timeAnim.settings(true, ec.WHITE);
         this.timeAnim.render(UIContext.of(context, -1, -1, mc.getRenderTickCounter().getTickDelta(false)));
         context.drawText(
            Fonts.MEDIUM.getFont(6.0F),
            this.b,
            var3 - 13.0F + 20.0F * this.animation.getValue() + var5.width(this.a) + this.timeAnim.getWidth(),
            var4 + 5.5F,
            eb.WHITE.withAlpha(255.0F * this.animation.getValue())
         );
         context.drawText(
            Fonts.MEDIUM.getFont(7.0F),
            this.d,
            var3 + 23.0F - 10.0F * this.animation.getValue() + var6,
            var4 + 5.5F,
            ec.getTextColor().withAlpha(255.0F * this.animation.getValue())
         );
      }
   }

   public void update(String suffix, int time, String text, eb color) {
      this.update("", suffix, time, text, color);
   }

   public void update(String prefix, String suffix, int time, String text, eb color) {
      this.a = prefix;
      this.b = suffix;
      this.c = time;
      this.d = text;
      this.e = color;
   }

   @Override
   public boolean canShow() {
      return ep.hasCT;
   }
}
