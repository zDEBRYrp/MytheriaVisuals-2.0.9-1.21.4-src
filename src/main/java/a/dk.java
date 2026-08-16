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
import a.ap;
import a.uc.dS;
import a.uc.aH;
import a.uc.eD;
import a.uc.aW;
import a.dd;
import a.uc.bB;
import a.eo;
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
import a.n;
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
import a.i;
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
import a.en;
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
import a.dk;
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

import dev.redstones.mediaplayerinfo.MediaInfo;
import dev.redstones.mediaplayerinfo.impl.win.WindowsMediaSession;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.CustomDrawContext;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.utility.animation.base.Easing;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.util.Identifier;

public class dk extends dd implements IMinecraft {
   private final dZ[] a = new dZ[4];
   private final dZ b = new dZ(300L, 0.0F, Easing.BAKEK_SIZE);
   private final dZ c = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
   private final dZ d = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
   private final dZ e = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
   private final dZ f = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
   private boolean g = false;
   private int h = 0;
   private final EventListener<ap> i = event -> {
      if (this.g) {
         dc var2x = Mytheria.getInstance().getHud().getIsland();
         if (var2x.active() == this && var2x.isExtended()) {
            if (event.getVerticalAmount() < 0.0) {
               this.h++;
            } else {
               if (!(event.getVerticalAmount() > 0.0)) {
                  return;
               }

               this.h--;
            }

            String[] var3 = Mytheria.getInstance().getMusicTracker().getLyrics().split("\\n");
            int var4 = Math.max(0, var3.length - 6);
            this.h = Math.min(Math.max(0, this.h), var4);
         }
      }
   };

   public dk(cn setting) {
      super(setting, "music");

      for (int var2 = 0; var2 < this.a.length; var2++) {
         this.a[var2] = new dZ(400L, 0.0F, Easing.LINEAR);
      }

      Mytheria.getInstance().getEventManager().subscribe(this);
   }

   @Override
   public void draw(CustomDrawContext context) {
      dc var2 = Mytheria.getInstance().getHud().getIsland();
      float var3 = var2.getCurrentX();
      float var4 = var2.getCurrentY();
      fN var5 = Mytheria.getInstance().getMusicTracker();
      eb var6 = ec.getTextColor();
      if (var5.haveActiveSession() && var5.getSession() != null) {
         MediaInfo var7 = var5.getSession().getMedia();
         float var8 = 164.0F;
         float var9 = this.g ? 125.0F : 80.0F;
         float var10 = 100.0F;
         float var11 = 32.0F + Fonts.MEDIUM.getFont(7.0F).width(var7.getTitle());
         float var12 = this.size.width = var2.isExtended() ? var8 : Math.min(var11, var10);
         float var13 = this.size.height = var2.isExtended() ? var9 : 15.0F;
         float var14 = var2.getExtendingAnim().getValue();
         float var15 = 4.0F + 6.0F * var14;
         float var16 = 7.0F + 19.0F * var14;
         Identifier var17 = var5.getImage() != null ? var5.getImage() : Mytheria.id("icons/music/no_image.png");
         float var18 = var4 + (var2.isExtended() ? var15 : er.getMiddleOfBox(var16, var2.getSize().height));
         context.drawRoundedTexture(var17, var3 + var15 - 10.0F + 10.0F * this.animation.getValue(), var18, var16, var16, BorderRadius.all(1.0F + 5.0F * var14));
         context.drawFadeoutText(
            Fonts.MEDIUM.getFont(7.0F),
            var5.getSession().getMedia().getTitle(),
            var3 - 5.0F + 10.0F * this.animation.getValue() + 10.0F * this.animation.getValue() + 29.0F * var14,
            var4 + 5.0F + 11.0F * var14,
            var6,
            0.3F,
            0.7F,
            var2.isExtended() ? var8 - 30.0F : var10 + 5.0F
         );
         if (var14 != 0.0F && var5.getSession() != null) {
            context.drawFadeoutText(
               Fonts.REGULAR.getFont(7.0F),
               var5.getSession().getMedia().getArtist(),
               var3 + 20.0F + 24.0F * var14,
               var4 + 5.0F + 19.0F * var14,
               var6.withAlpha(178.5F * var14),
               0.3F,
               0.7F,
               var2.isExtended() ? var8 - 30.0F : var10 + 5.0F
            );
            context.drawText(
               Fonts.REGULAR.getFont(5.0F),
               formatTime(var7.getPosition()),
               sr.getScaledWidth() / 2.0F - var8 / 2.0F + 11.0F * var14,
               var4 + 43.0F * var14,
               var6.withAlpha(255.0F)
            );
            context.drawText(
               Fonts.REGULAR.getFont(5.0F),
               formatTime(var7.getDuration()),
               sr.getScaledWidth() / 2.0F + var8 / 2.0F - (9.5F + Fonts.REGULAR.getFont(5.0F).width(formatTime(var7.getDuration())) * var14),
               var4 + 43.0F * var14,
               var6.withAlpha(255.0F)
            );
            float var19 = 116.0F;
            float var20 = sr.getScaledWidth() / 2.0F - var19 / 2.0F;
            context.drawRoundedRect(var20, var4 + var9 - (this.g ? 45 : 0) - 36.5F * var14, var19, 3.0F, BorderRadius.all(0.5F), var6.withAlpha(63.75F));
            float var21 = var19 * Math.min(1.0F, (float)var7.getPosition() / (float)var7.getDuration());
            context.drawRoundedRect(var20, var4 + var9 - (this.g ? 45 : 0) - 36.5F * var14, var21, 3.0F, BorderRadius.all(0.5F), var6.withAlpha(150.0F));
            this.b.setDuration(600L);
            this.b.update(var7.isPlaying() ? 1.0F : 0.0F);
            if (var14 > 0.7F) {
               float var22 = var4 + var9 - 25.0F * var14;
               double var23 = er.getMouse().getX();
               double var25 = er.getMouse().getY();
               fw var27 = new fw(sr.getScaledWidth() / 2.0F - 40.0F, var22, 16.0F, 16.0F);
               fw var28 = new fw(sr.getScaledWidth() / 2.0F - 8.0F, var22, 16.0F, 16.0F);
               fw var29 = new fw(sr.getScaledWidth() / 2.0F + 24.0F, var22, 16.0F, 16.0F);
               if (var27.hovered(var23, var25) || var28.hovered(var23, var25) || var29.hovered(var23, var25)) {
                  eo.set(en.HAND);
               }

               this.c.update(var27.hovered(var23, var25));
               this.d.update(var28.hovered(var23, var25));
               this.e.update(var29.hovered(var23, var25));
               context.drawTexture(Mytheria.id("icons/music/previous.png"), var27, var6.withAlpha(255.0F - 100.0F * this.c.getValue()));
               float var30 = this.b.getValue();
               float var31 = var28.getX() + var28.getWidth() / 2.0F;
               float var32 = var28.getY() + var28.getHeight() / 2.0F;
               fl.rotate(context.getMatrices(), var31, var32, 90.0F * var30);
               fl.scale(context.getMatrices(), var31, var32, 1.0F - var30);
               context.drawTexture(Mytheria.id("icons/music/play.png"), var28, var6.withAlpha(255.0F * (1.0F - var30) - 100.0F * this.d.getValue()));
               fl.end(context.getMatrices());
               fl.end(context.getMatrices());
               fl.rotate(context.getMatrices(), var31, var32, -90.0F + 90.0F * var30);
               fl.scale(context.getMatrices(), var31, var32, var30);
               context.drawTexture(Mytheria.id("icons/music/pause.png"), var28, var6.withAlpha(255.0F * var30 - 100.0F * this.d.getValue()));
               fl.end(context.getMatrices());
               fl.end(context.getMatrices());
               context.drawTexture(Mytheria.id("icons/music/next.png"), var29, var6.withAlpha(255.0F - 100.0F * this.e.getValue()));
            }

            String var36 = null;
            if (var5.getSession() == null) {
               return;
            }

            if (var5.getSession().getOwner().toLowerCase().contains("yandex") || var5.getSession().getOwner().toLowerCase().contains("яндекс")) {
               var36 = "yandex_music";
            } else if (var5.getSession().getOwner().toLowerCase().contains("edge")) {
               var36 = "edge";
            } else if (var5.getSession().getOwner().toLowerCase().contains("spotify")) {
               var36 = "spotify";
            }

            if (var36 != null) {
               context.drawTexture(Mytheria.id("icons/media/" + var36 + ".png"), var3 + var8 - 22.0F, var4 + var9 - 21.0F, 8.0F, 8.0F, eb.WHITE);
            }

            switch (WindowsMediaSession.getCycle()) {
               case 0:
                  context.drawTexture(Mytheria.id("icons/music/repeat.png"), var3 + 14.0F, var4 + var9 - 21.0F, 8.0F, 8.0F, var6.withAlpha(150.0F));
                  break;
               case 1:
                  context.drawTexture(Mytheria.id("icons/music/repeat.png"), var3 + 14.0F, var4 + var9 - 21.0F, 8.0F, 8.0F, var6);
                  break;
               case 2:
                  context.drawTexture(Mytheria.id("icons/music/repeat1.png"), var3 + 14.0F, var4 + var9 - 21.0F, 8.0F, 8.0F, var6);
            }

            if (var5.getLyrics().isEmpty()) {
               this.g = false;
            }

            fw var37 = new fw(var3 + 14.0F, var4 + var9 - 21.0F, 8.0F, 8.0F);
            if (!var5.getLyrics().isEmpty() && var5.getLyrics().split("butors\\n\\n").length > 1) {
               if (var37.hovered(er.getMouse().getX(), er.getMouse().getY())) {
                  eo.set(en.HAND);
               }

               this.f.update(var37.hovered(er.getMouse().getX(), er.getMouse().getY()));
               context.drawTexture(Mytheria.id("icons/music/text.png"), var37, var6.withAlpha(255.0F - 100.0F * this.f.getValue()));
            }

            if (this.g && var5.getLyrics().split("butors\\n\\n").length > 1) {
               String[] var24 = var5.getLyrics().split("butors\\n\\n")[1].split("\\n");
               int var38 = Math.min(6, var24.length);
               if (this.h > var24.length - var38) {
                  this.h = Math.max(var24.length - var38, 0);
               }

               for (int var26 = 0; var26 < var38 && var26 + this.h < var24.length; var26++) {
                  context.drawFadeoutText(
                     Fonts.REGULAR.getFont(6.0F),
                     var24[var26 + this.h],
                     var3 + 10.0F,
                     var4 + 55.0F + var26 * 7,
                     var6.withAlpha(255.0F * var14),
                     0.91F,
                     1.0F,
                     var8 - 20.0F
                  );
               }
            }
         }

         for (int var33 = 0; var33 < this.a.length; var33++) {
            float var34 = (float)var7.getPosition() * 8.0F + var33 * 0.7F;
            float var35 = var7.isPlaying() ? (float)(2.0 + Math.abs(eI.sin(var34)) * 8.0) : 3.0F;
            this.a[var33].update(var35);
            this.a[var33].setDuration(1000L);
            context.drawRoundedRect(
               var3 + eI.interpolate(Math.min(var11, var10), var8 - 10.0F, var14) - 2.0F - 10.0F * this.animation.getValue() + var33 * (2.0F + var14),
               var4 + eI.interpolate(4.25, 14.0, var14) + (7.0F - this.a[var33].getValue()) / 2.0F,
               1.0F + var14,
               this.a[var33].getValue(),
               BorderRadius.all(0.5F),
               var5.getMediaColor()
            );
         }
      }
   }

   @Override
   public void click(float mouseX, float mouseY, int button) {
      dc var4 = Mytheria.getInstance().getHud().getIsland();
      float var5 = var4.getCurrentX();
      float var6 = var4.getCurrentY();
      float var7 = this.size.width;
      float var8 = this.size.height;
      fN var9 = Mytheria.getInstance().getMusicTracker();
      if (var9.haveActiveSession()) {
         if (er.isHovered(var5 + var7 / 2.0F - 40.0F, var6 + var8 - 9.0F - 16.0F, 16.0, 16.0, mouseX, mouseY)) {
            var9.getSession().previous();
         }

         if (er.isHovered(var5 + var7 / 2.0F - 8.0F, var6 + var8 - 9.0F - 16.0F, 16.0, 16.0, mouseX, mouseY)) {
            var9.getSession().playPause();
         }

         if (er.isHovered(var5 + var7 / 2.0F + 24.0F, var6 + var8 - 9.0F - 16.0F, 16.0, 16.0, mouseX, mouseY)) {
            var9.getSession().next();
         }

         if (er.isHovered(var5 + 14.0F, var6 + var8 - 21.0F, 8.0, 8.0, mouseX, mouseY)) {
            var9.getSession().swapCycle();
            WindowsMediaSession.setCycle(var9.getSession().getCycleType());
         }

         fw var10 = new fw(var5 + 14.0F, var6 + var8 - 21.0F, 8.0F, 8.0F);
         if (!var9.getLyrics().isEmpty()
            && er.isHovered(var10.getX(), var10.getY(), var10.getWidth(), var10.getHeight(), mouseX, mouseY)
            && var9.getLyrics().split("butors\\n\\n").length > 1) {
            this.g = !this.g;
            if (this.g) {
               this.h = 0;
            }
         }
      }
   }

   @Override
   public boolean canShow() {
      return Mytheria.getInstance().getMusicTracker().getSession() != null
         && Mytheria.getInstance().getMusicTracker().haveActiveSession()
         && !Mytheria.getInstance().getMusicTracker().getSession().getOwner().toLowerCase().contains("gram");
   }

   public static String formatTime(long totalSeconds) {
      long var2 = totalSeconds / 60L;
      long var4 = totalSeconds % 60L;
      return String.format("%d:%02d", var2, var4);
   }

   @Override
   public eb getColor() {
      return super.getColor().mix(Mytheria.getInstance().getMusicTracker().getMediaColor(), 0.2F);
   }
}
