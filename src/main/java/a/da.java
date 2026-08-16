package a;
import a.b;
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
import a.da;
import a.uc.eI;
import a.uc.aE;
import a.uc.dE;
import a.m;
import a.uc.dW;
import a.h;
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
import a.uc.fL;
import a.uc.bL;
import a.uc.aI;
import a.uc.cW;
import a.uc.dL;
import a.uc.aM;
import a.uc.eJ;
import a.bv;
import a.uc.F;
import a.uc.cQ;
import a.uc.dQ;
import a.uc.dK;
import a.uc.aA;
import a.uc.eZ;
import a.s;
import a.uc.fH;
import a.uc.dU;
import a.uc.dN;
import a.uc.fN;
import a.uc.cZ;
import a.uc.eU;
import a.uc.bJ;

import java.util.List;
import java.util.Map;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Font;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import net.minecraft.client.gui.screen.ChatScreen;

public class da extends cP {
   public da() {
      super("hud.target_list", "icons/hud/target_list.png");
   }

   @Override
   public void update(UIContext context) {
      this.width = 92.0F;
      this.height = 18.0F;
      boolean var2 = mc.currentScreen instanceof ChatScreen || mc.currentScreen instanceof cO;
      List<String> var3 = bv.getTargets();
      boolean var4 = var2 && var3.isEmpty();
      if (var4) {
         Font var5 = Fonts.REGULAR.getFont(7.0F);
         Font var6 = Fonts.MEDIUM.getFont(6.5F);
         long var7 = System.currentTimeMillis();
         boolean var9 = var7 / 2000L % 2L == 0L;
         String var10 = var9 ? "Nesquik" : "Flerni";
         String var11 = var9 ? "1337m" : "Offline";
         String var12 = var9 ? "Winvi" : "Маленький джон";
         String var13 = var9 ? "2h" : "45m";
         float var14 = 0.0F;
         var14 = Math.max(var14, var5.width(var10 + " " + var11));
         var14 = Math.max(var14, var5.width(var12 + " " + var13));
         this.width = Math.max(var14 + 45.0F, this.width);
         this.height += 41.0F;
      } else if (!var3.isEmpty()) {
         Font var15 = Fonts.REGULAR.getFont(7.0F);

         for (String var17 : var3) {
            String var8 = this.b(var17);
            float var18 = var15.width(var17 + " " + var8);
            this.width = Math.max(var18 + 45.0F, this.width);
            this.height += 18.0F;
         }

         this.height += 5.0F;
      }

      super.update(context);
   }

   @Override
   protected void renderComponent(UIContext context) {
      Font var2 = Fonts.REGULAR.getFont(7.0F);
      context.drawClientRect(this.x, this.y, this.width, Math.max(20.0F, this.height), this.animation.getValue(), this.dragAnim.getValue(), 7.0F);
      float var3 = 18.0F;
      float var4 = 0.0F;
      String var5 = "Target List";
      Font var6 = Fonts.MEDIUM.getFont(8.0F);
      float var7 = var4 + (var4 > 0.0F ? 4.0F : 0.0F) + var6.width(var5);
      float var8 = this.x + (this.width - var7) / 2.0F;
      context.drawTexture(Mytheria.id(this.icon), var8, this.y + 6.0F, var4, var4, ec.getTextColor());
      context.drawText(var6, var5, var8 + var4 + (var4 > 0.0F ? 4.0F : 0.0F), this.y + er.getMiddleOfBox(var6.height(), var3) + 0.5F, ec.getTextColor());
      if (this.height >= 23.0F) {
         context.drawRect(this.x, this.y + var3, this.width, 0.5F, ec.getTextColor().withAlpha(30.0F));
      }

      boolean var9 = mc.currentScreen instanceof ChatScreen || mc.currentScreen instanceof cO;
      List<String> var10 = bv.getTargets();
      boolean var11 = var9 && var10.isEmpty();
      if (var11) {
         this.a(context, var3);
         if (this.height > 23.0F) {
            float var30 = this.width * 0.5F;
            float var32 = 1.5F;
            float var34 = this.x + (this.width - var30) / 2.0F;
            float var36 = this.y + this.height - var32 - 0.0F;
            context.drawRoundedRect(var34, var36, var30, var32, BorderRadius.all(1.25F), eb.WHITE);
         }
      } else {
         float var12 = var3 + 4.5F;
         if (!var10.isEmpty()) {
            for (String var14 : var10) {
               float var15 = 18.0F;
               boolean var16 = this.a(var14);
               String var17 = this.b(var14);
               float var18 = 6.0F;
               float var19 = this.x + 5.0F;
               float var20 = this.y + var12 + er.getMiddleOfBox(var18, var15);
               if (var16) {
                  long var21 = System.currentTimeMillis();
                  float var23 = (float)(Math.sin(var21 / 500.0) * 0.5 + 0.5);
                  float var24 = var18 + var23 * 3.0F;
                  float var25 = (1.0F - var23) * 100.0F;
                  context.drawRoundedRect(
                     var19 - (var24 - var18) / 2.0F,
                     var20 - (var24 - var18) / 2.0F,
                     var24,
                     var24,
                     BorderRadius.all(var24 / 2.0F),
                     new eb(0.0F, 255.0F, 0.0F, (int)var25)
                  );
                  context.drawRoundedRect(var19, var20, var18, var18, BorderRadius.all(var18 / 2.0F), new eb(0.0F, 255.0F, 0.0F, 255.0F));
               } else {
                  context.drawRoundedRect(var19, var20, var18, var18, BorderRadius.all(var18 / 2.0F), new eb(255.0F, 0.0F, 0.0F, 255.0F));
               }

               float var38 = this.x + 5.0F + var18 + 4.0F;
               context.drawText(var2, "|", var38, this.y + var12 + er.getMiddleOfBox(var2.height(), var15), ec.getTextColor().withAlpha(80.0F));
               float var22 = var38 + 6.0F;
               context.drawText(var2, var14, var22, this.y + var12 + er.getMiddleOfBox(var2.height(), var15), ec.getTextColor());
               Font var39 = Fonts.MEDIUM.getFont(6.5F);
               float var40 = var39.width(var17) + 10.0F;
               float var41 = 13.0F;
               float var26 = this.x + this.width - 5.0F - var40;
               float var27 = this.y + var12 + (var15 - var41) / 2.0F;
               context.drawRoundedRect(var26, var27, var40, var41, BorderRadius.all(6.0F), ec.getTextColor().withAlpha(10.0F));
               float var28 = var26 + (var40 - var39.width(var17)) / 2.0F + 1.0F;
               float var29 = var27 + (var41 - var39.height()) / 2.0F;
               context.drawText(var39, var17, var28, var29, ec.getTextColor());
               var12 += var15;
            }
         }

         if (this.height > 23.0F) {
            float var31 = this.width * 0.5F;
            float var33 = 1.5F;
            float var35 = this.x + (this.width - var31) / 2.0F;
            float var37 = this.y + this.height - var33 - 0.0F;
            context.drawRoundedRect(var35, var37, var31, var33, BorderRadius.all(1.25F), eb.WHITE);
         }
      }
   }

   private void a(UIContext context, float headerHeight) {
      Font var3 = Fonts.REGULAR.getFont(7.0F);
      Font var4 = Fonts.MEDIUM.getFont(6.5F);
      float var5 = headerHeight + 4.5F;
      float var6 = 18.0F;
      long var7 = System.currentTimeMillis();
      long var9 = var7 % 2000L;
      boolean var11 = var7 / 2000L % 2L == 0L;
      float var12 = 1.0F;
      if (var9 < 300L) {
         var12 = (float)var9 / 300.0F;
      } else if (var9 > 1700L) {
         var12 = (float)(2000L - var9) / 300.0F;
      }

      String var13 = var11 ? "Nesquik" : "Flerni";
      String var14 = var11 ? "1337" : "Offline";
      boolean var15 = var11;
      this.a(context, var5, var13, var14, var15, var3, var4, var6, var12);
      var5 += var6;
      String var16 = var11 ? "Winvi" : "Маленький джон";
      String var17 = var11 ? "2h" : "45m";
      boolean var18 = true;
      this.a(context, var5, var16, var17, var18, var3, var4, var6, var12);
   }

   private void a(UIContext context, float offset, String name, String status, boolean isOnline, Font font, Font statusFont, float itemHeight, float fadeAlpha) {
      float var10 = 6.0F;
      float var11 = this.x + 5.0F;
      float var12 = this.y + offset + er.getMiddleOfBox(var10, itemHeight);
      if (isOnline) {
         long var13 = System.currentTimeMillis();
         float var15 = (float)(Math.sin(var13 / 500.0) * 0.5 + 0.5);
         float var16 = var10 + var15 * 3.0F;
         float var17 = (1.0F - var15) * 100.0F * fadeAlpha;
         context.drawRoundedRect(
            var11 - (var16 - var10) / 2.0F,
            var12 - (var16 - var10) / 2.0F,
            var16,
            var16,
            BorderRadius.all(var16 / 2.0F),
            new eb(0.0F, 255.0F, 0.0F, (int)var17)
         );
         context.drawRoundedRect(var11, var12, var10, var10, BorderRadius.all(var10 / 2.0F), new eb(0.0F, 255.0F, 0.0F, (int)(255.0F * fadeAlpha)));
      } else {
         context.drawRoundedRect(var11, var12, var10, var10, BorderRadius.all(var10 / 2.0F), new eb(255.0F, 0.0F, 0.0F, (int)(255.0F * fadeAlpha)));
      }

      float var21 = this.x + 5.0F + var10 + 4.0F;
      context.drawText(font, "|", var21, this.y + offset + er.getMiddleOfBox(font.height(), itemHeight), ec.getTextColor().withAlpha(80.0F * fadeAlpha));
      float var14 = var21 + 6.0F;
      context.drawText(font, name, var14, this.y + offset + er.getMiddleOfBox(font.height(), itemHeight), ec.getTextColor().withAlpha(255.0F * fadeAlpha));
      float var22 = statusFont.width(status) + 10.0F;
      float var23 = 13.0F;
      float var24 = this.x + this.width - 5.0F - var22;
      float var18 = this.y + offset + (itemHeight - var23) / 2.0F;
      context.drawRoundedRect(var24, var18, var22, var23, BorderRadius.all(6.0F), ec.getTextColor().withAlpha(10.0F * fadeAlpha));
      float var19 = var24 + (var22 - statusFont.width(status)) / 2.0F + 1.0F;
      float var20 = var18 + (var23 - statusFont.height()) / 2.0F;
      context.drawText(statusFont, status, var19, var20, ec.getTextColor().withAlpha(255.0F * fadeAlpha));
   }

   private boolean a(String playerName) {
      Map var2 = bv.getPlayerStatuses();
      bv.a var3 = (bv.a)var2.get(playerName.toLowerCase());
      return var3 != null && var3.online;
   }

   private String b(String playerName) {
      Map var2 = bv.getPlayerStatuses();
      bv.a var3 = (bv.a)var2.get(playerName.toLowerCase());
      if (var3 != null && var3.online) {
         long var4 = (System.currentTimeMillis() - var3.joinTime) / 1000L;
         return this.a(var4);
      } else {
         return "Offline";
      }
   }

   private String a(long seconds) {
      if (seconds < 60L) {
         return seconds + "s";
      } else {
         return seconds < 3600L ? seconds / 60L + "m" : seconds / 3600L + "h";
      }
   }

   @Override
   public boolean show() {
      if (!(mc.currentScreen instanceof ChatScreen) && !(mc.currentScreen instanceof cO)) {
         bv var1 = Mytheria.getInstance().getModuleManager().getModule(bv.class);
         if (var1 != null && var1.isEnabled()) {
            List var2 = bv.getTargets();
            return !var2.isEmpty();
         } else {
            return false;
         }
      } else {
         return true;
      }
   }
}
