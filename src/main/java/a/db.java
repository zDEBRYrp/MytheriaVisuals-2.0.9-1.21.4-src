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
import a.cx;
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
import a.db;
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
import a.uc.E;
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

import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import net.minecraft.client.network.PlayerListEntry;

public class db extends cP {
   private final ch a = new ch(this, "hud.watermark.show_role").enabled(true);
   private final ch b = new ch(this, "hud.watermark.show_fps").enabled(true);
   private final ch c = new ch(this, "hud.watermark.show_ping").enabled(true);
   private final ch d = new ch(this, "hud.watermark.show_ip").enabled(true);

   public db() {
      super("hud.watermark", "icons/hud/watermark.png");
   }

   @Override
   public void update(UIContext context) {
      String var2 = cx.role.isEmpty() ? "User" : cx.role;
      float var3 = 8.0F;
      float var4 = 6.0F;
      float var5 = 20.0F;
      float var6 = 0.0F;
      float var7 = 8.0F;
      float var8 = 2.0F;
      this.height = 22.0F;
      float var9 = var3;
      float var10 = var6 * 2.0F + var5 + var7;
      var9 += var10 + var8;
      boolean var11 = false;
      if (this.a.isEnabled() && !var2.isEmpty()) {
         float var12 = Fonts.REGULAR.getFont(8.0F).width("|");
         if (var11) {
            var9 += var4 + var12 + var4;
         }

         var9 += 12.0F + Fonts.MEDIUM.getFont(8.0F).width(var2);
         var11 = true;
      }

      if (this.b.isEnabled()) {
         float var15 = Fonts.REGULAR.getFont(8.0F).width("|");
         if (var11) {
            var9 += var4 + var15 + var4;
         }

         var9 += Fonts.REGULAR.getFont(7.5F).width(mc.getCurrentFps() + " fps");
         var11 = true;
      }

      if (this.c.isEnabled()) {
         float var16 = Fonts.REGULAR.getFont(8.0F).width("|");
         if (var11) {
            var9 += var4 + var16 + var4;
         }

         var9 += Fonts.REGULAR.getFont(7.5F).width(this.a() + " ms");
         var11 = true;
      }

      if (this.d.isEnabled()) {
         String var17 = this.b();
         if (!var17.isEmpty()) {
            float var13 = Fonts.REGULAR.getFont(8.0F).width("|");
            if (var11) {
               var9 += var4 + var13 + var4;
            }

            var9 += Fonts.REGULAR.getFont(7.5F).width(var17);
         }
      }

      this.width = var9 + var3;
      super.update(context);
   }

   @Override
   protected void renderComponent(UIContext context) {
      String var2 = cx.role.isEmpty() ? "User" : cx.role;
      float var3 = 8.0F;
      float var4 = 6.0F;
      float var5 = 20.0F;
      float var6 = 0.0F;
      float var7 = 8.0F;
      float var8 = 2.0F;
      this.height = 22.0F;
      float var9 = this.y + this.height / 2.0F;
      boolean var10 = bJ.showMinimalizm();
      boolean var11 = bJ.showGlass();
      boolean var12 = et.isLunarClient();
      float var13 = var6 * 2.0F + var5 + var7;
      float var14 = this.x + var13 + var8;
      float var15 = this.width - var13 - var8;
      if (var12) {
         eb var16 = bJ.getBackgroundColor();
         context.drawRoundedRect(
            var14, this.y, var15, this.height, new BorderRadius(0.0F, 8.0F, 8.0F, 0.0F), var16.withAlpha(255.0F * this.animation.getValue())
         );
         eb var17 = var16.mix(eb.WHITE, 10.1F).withAlpha(255.0F * this.animation.getValue());
         context.drawRoundedRect(this.x, this.y, var13, this.height, new BorderRadius(8.0F, 0.0F, 0.0F, 8.0F), var17);
      } else if (var11) {
         context.drawLiquidGlass(
            var14,
            this.y,
            var15,
            this.height,
            bJ.getGlassBlur(),
            bJ.getDistortion() - 0.07F * this.dragAnim.getValue(),
            new BorderRadius(0.0F, 8.0F, 8.0F, 0.0F),
            ec.getLiquidGlassColor().withAlpha(255.0F * this.animation.getValue() * bJ.getGlassAlpha())
         );
         eb var23 = ec.getBackgroundColor();
         context.drawRoundedRect(
            var14,
            this.y,
            var15,
            this.height,
            new BorderRadius(0.0F, 8.0F, 8.0F, 0.0F),
            var23.withAlpha(255.0F * (0.8F - 0.6F * bJ.glass()) * this.animation.getValue())
         );
         context.drawLiquidGlass(
            this.x,
            this.y,
            var13,
            this.height,
            bJ.getGlassBlur(),
            bJ.getDistortion() - 0.07F * this.dragAnim.getValue(),
            new BorderRadius(8.0F, 0.0F, 0.0F, 8.0F),
            ec.getLiquidGlassColor().withAlpha(255.0F * this.animation.getValue() * bJ.getGlassAlpha())
         );
         eb var26 = var23.mix(eb.WHITE, 0.1F).withAlpha(255.0F * (0.9F - 0.5F * bJ.glass()) * this.animation.getValue());
         context.drawRoundedRect(this.x, this.y, var13, this.height, new BorderRadius(8.0F, 0.0F, 0.0F, 8.0F), var26);
      } else {
         if (var10) {
            context.drawBlurredRect(
               var14,
               this.y,
               var15,
               this.height,
               11.25F,
               1.0F,
               new BorderRadius(0.0F, 8.0F, 8.0F, 0.0F),
               eb.WHITE.withAlpha(255.0F * this.animation.getValue() * bJ.minimalizm())
            );
         }

         eb var24 = bJ.getBackgroundColor();
         context.drawRoundedRect(
            var14, this.y, var15, this.height, new BorderRadius(0.0F, 8.0F, 8.0F, 0.0F), var24.withAlpha(255.0F * this.animation.getValue())
         );
         if (var10) {
            context.drawBlurredRect(
               this.x,
               this.y,
               var13,
               this.height,
               11.25F,
               1.0F,
               new BorderRadius(8.0F, 0.0F, 0.0F, 8.0F),
               eb.WHITE.withAlpha(255.0F * this.animation.getValue() * bJ.minimalizm())
            );
         }

         eb var27 = var24.mix(eb.WHITE, 0.1F).withAlpha(255.0F * this.animation.getValue());
         context.drawRoundedRect(this.x, this.y, var13, this.height, new BorderRadius(8.0F, 0.0F, 0.0F, 8.0F), var27);
      }

      float var25 = this.x + (var13 - var5) / 2.0F;
      context.drawTexture(Mytheria.id("image/mainmenu/mytheria.png"), var25, var9 - var5 / 2.0F, var5, var5, ec.getTextColor());
      float var28 = var14 + var3;
      boolean var18 = false;
      if (this.a.isEnabled() && !var2.isEmpty()) {
         if (var18) {
            var28 += var4;
            context.drawText(Fonts.REGULAR.getFont(8.0F), "|", var28, var9 - Fonts.REGULAR.getFont(8.0F).height() / 2.0F, ec.getTextColor().withAlpha(80.0F));
            var28 += Fonts.REGULAR.getFont(8.0F).width("|") + var4;
         }

         float var19 = 6.0F;
         eb var20;
         if (!cx.roleColor.isEmpty()) {
            try {
               var20 = this.b(cx.roleColor);
            } catch (Exception var22) {
               var20 = this.a(var2);
            }
         } else {
            var20 = this.a(var2);
         }

         context.drawRoundedRect(var28, var9 - var19 / 2.0F, var19, var19, BorderRadius.all(var19 / 2.0F), var20);
         var28 += var19 + 6.0F;
         context.drawText(Fonts.MEDIUM.getFont(8.0F), var2, var28, var9 - Fonts.MEDIUM.getFont(8.0F).height() / 2.0F, ec.getTextColor());
         var28 += Fonts.MEDIUM.getFont(8.0F).width(var2);
         var18 = true;
      }

      if (this.b.isEnabled()) {
         if (var18) {
            var28 += var4;
            context.drawText(Fonts.REGULAR.getFont(8.0F), "|", var28, var9 - Fonts.REGULAR.getFont(8.0F).height() / 2.0F, ec.getTextColor().withAlpha(80.0F));
            var28 += Fonts.REGULAR.getFont(8.0F).width("|") + var4;
         }

         String var34 = mc.getCurrentFps() + " fps";
         context.drawText(Fonts.REGULAR.getFont(7.5F), var34, var28, var9 - Fonts.REGULAR.getFont(7.5F).height() / 2.0F, ec.getTextColor());
         var28 += Fonts.REGULAR.getFont(7.5F).width(var34);
         var18 = true;
      }

      if (this.c.isEnabled()) {
         if (var18) {
            var28 += var4;
            context.drawText(Fonts.REGULAR.getFont(8.0F), "|", var28, var9 - Fonts.REGULAR.getFont(8.0F).height() / 2.0F, ec.getTextColor().withAlpha(80.0F));
            var28 += Fonts.REGULAR.getFont(8.0F).width("|") + var4;
         }

         String var35 = this.a() + " ms";
         context.drawText(Fonts.REGULAR.getFont(7.5F), var35, var28, var9 - Fonts.REGULAR.getFont(7.5F).height() / 2.0F, ec.getTextColor());
         var28 += Fonts.REGULAR.getFont(7.5F).width(var35);
         var18 = true;
      }

      if (this.d.isEnabled()) {
         String var36 = this.b();
         if (!var36.isEmpty()) {
            if (var18) {
               var28 += var4;
               context.drawText(Fonts.REGULAR.getFont(8.0F), "|", var28, var9 - Fonts.REGULAR.getFont(8.0F).height() / 2.0F, ec.getTextColor().withAlpha(80.0F));
               var28 += Fonts.REGULAR.getFont(8.0F).width("|") + var4;
            }

            context.drawText(Fonts.REGULAR.getFont(7.5F), var36, var28, var9 - Fonts.REGULAR.getFont(7.5F).height() / 2.0F, ec.getTextColor());
         }
      }
   }

   private int a() {
      if (mc.player != null && mc.getNetworkHandler() != null) {
         PlayerListEntry var1 = mc.getNetworkHandler().getPlayerListEntry(mc.player.getUuid());
         if (var1 != null) {
            return var1.getLatency();
         }
      }

      return 0;
   }

   private String b() {
      return mc.getCurrentServerEntry() != null ? mc.getCurrentServerEntry().address : "";
   }

   private eb a(String role) {
      return switch (role) {
         case "Media" -> new eb(250.0F, 0.0F, 0.0F, 255.0F);
         case "Dev" -> new eb(160.0F, 0.0F, 255.0F, 255.0F);
         case "Test" -> new eb(255.0F, 200.0F, 0.0F, 255.0F);
         default -> new eb(255.0F, 255.0F, 255.0F, 255.0F);
      };
   }

   private eb b(String hex) {
      if (hex.startsWith("#")) {
         hex = hex.substring(1);
      }

      int var2 = Integer.parseInt(hex.substring(0, 2), 16);
      int var3 = Integer.parseInt(hex.substring(2, 4), 16);
      int var4 = Integer.parseInt(hex.substring(4, 6), 16);
      return new eb(var2, var3, var4, 255.0F);
   }
}
