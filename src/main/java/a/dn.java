package a;
import a.uc.B;
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
import a.uc.D;
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
import a.fm;
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
import a.uc.C;
import a.uc.aY;
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
import a.ec;
import a.fl;
import a.uc.bL;
import a.uc.aI;
import a.uc.cW;
import a.uc.dL;
import a.uc.aM;
import a.ej;
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
import a.dn;
import a.uc.fN;
import a.uc.cZ;
import a.uc.eU;
import a.uc.bJ;

import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.MouseButton;
import net.minecraft.client.render.VertexFormats;

public class dn extends cP {
   protected final cn elements = new cn(this, "elements").draggable().min(1);

   public dn(String name, String icon) {
      super(name, icon);
      this.height = 18.0F;
   }

   @Override
   protected void renderComponent(UIContext context) {
      context.drawClientRect(this.x, this.y, this.width, this.height, this.animation.getValue(), this.dragAnim.getValue(), 3.0F);
      fm.push(context.getMatrices(), this.x, this.y, this.width, this.height);
      context.drawTexture(Mytheria.id(this.icon), this.x + 5.0F, this.y + 5.0F, 8.0F, 8.0F, ec.getTextColor());
      float var2 = 0.0F;
      boolean var3 = et.isLunarClient();
      fq var4 = null;
      if (!var3) {
         var4 = new fq(VertexFormats.POSITION_TEXTURE_COLOR, Fonts.MEDIUM);
      }

      for (cn.a var6 : this.elements.getValues()) {
         doItem var7 = (doItem)var6;
         if (var7.isSelected()) {
            float var8 = Fonts.MEDIUM.getFont(8.0F).width(var7.text()) + 8.0F * var7.copyAnim().getValue();
            boolean var9 = er.isHovered(this.x + 19.0F + var2, this.y + 6.0F, Fonts.MEDIUM.getFont(8.0F).width(var7.text()), 8.0, context)
               && !var7.copy().isEmpty();
            if (!var9 || var7.copyTimer().finished(1000L)) {
               var7.copied(false);
            }

            var7.copyAnim().update(var9);
            var7.successAnim().update(var7.copied());
            context.drawText(
               Fonts.MEDIUM.getFont(8.0F), var7.text(), this.x + 19.0F + var2 + 8.0F * var7.copyAnim().getValue(), this.y + 6.0F, ec.getTextColor()
            );
            if (!var7.suffix().isEmpty()) {
               context.drawText(Fonts.MEDIUM.getFont(7.0F), var7.suffix(), this.x + 19.0F + var2 + var8, this.y + 7.0F, ec.getTextColor().mulAlpha(0.5F));
            }

            var2 += var8 + Fonts.MEDIUM.getFont(7.0F).width(var7.suffix()) + 10.0F;
         }
      }

      if (!var3 && var4 != null) {
         var4.draw();
      }

      var2 = 0.0F;

      for (cn.a var12 : this.elements.getValues()) {
         doItem var13 = (doItem)var12;
         if (var13.isSelected()) {
            float var14 = Fonts.MEDIUM.getFont(8.0F).width(var13.text()) + 8.0F * var13.copyAnim().getValue();
            if (var2 != 0.0F) {
               context.drawRoundedRect(
                  this.x + 19.0F + var2 - 7.0F, this.y + this.height / 2.0F - 1.0F, 2.0F, 2.0F, BorderRadius.all(1.0F), ec.getTextColor().mulAlpha(0.5F)
               );
            }

            fl.rotate(context.getMatrices(), this.x + 19.0F + var2 + 3.0F, this.y + 6.0F + 3.0F, 90.0F * var13.successAnim().getValue());
            context.drawTexture(
               Mytheria.id("icons/hud/copy.png"),
               this.x + 19.0F + var2,
               this.y + 6.0F,
               6.0F,
               6.0F,
               ec.getTextColor().mulAlpha(var13.copyAnim().getValue() * (1.0F - var13.successAnim().getValue()))
            );
            fl.end(context.getMatrices());
            fl.rotate(context.getMatrices(), this.x + 19.0F + var2 + 3.0F, this.y + 6.0F + 3.0F, -90.0F + 90.0F * var13.successAnim().getValue());
            context.drawTexture(
               Mytheria.id("icons/check.png"),
               this.x + 19.0F + var2,
               this.y + 6.0F,
               6.0F,
               6.0F,
               ec.GREEN.mulAlpha(var13.copyAnim().getValue() * var13.successAnim().getValue())
            );
            fl.end(context.getMatrices());
            var2 += var14 + Fonts.MEDIUM.getFont(7.0F).width(var13.suffix()) + 10.0F;
         }
      }

      fm.pop();
      this.width = 15.0F + var2;
      this.getWidthAnim().update(this.width);
   }

   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      float var6 = 0.0F;

      for (cn.a var8 : this.elements.getValues()) {
         doItem var9 = (doItem)var8;
         if (var9.isSelected()) {
            float var10 = Fonts.MEDIUM.getFont(8.0F).width(var9.text());
            boolean var11 = er.isHovered(this.x + 19.0F + var6, this.y + 6.0F, Fonts.MEDIUM.getFont(8.0F).width(var9.text()), 8.0, mouseX, mouseY)
               && !var9.copy().isEmpty();
            if (var11 && button == MouseButton.LEFT) {
               ej.copyText(var9.copy());
               var9.copyTimer().reset();
               var9.copied(true);
               return;
            }

            var6 += var10 + Fonts.MEDIUM.getFont(7.0F).width(var9.suffix()) + 10.0F;
         }
      }

      super.onMouseClicked(mouseX, mouseY, button);
   }
}
