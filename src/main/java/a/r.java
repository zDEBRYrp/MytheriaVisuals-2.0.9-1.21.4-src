package a;
import a.uc.B;
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
import a.r;
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
import a.eg;
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
import a.p;
import a.uc.fJ;
import a.uc.V;
import a.g;
import a.uc.fD;
import a.uc.eX;
import a.z;
import a.uc.bS;
import a.uc.aO;
import a.uc.cE;
import a.x;
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
import a.ad;
import a.uc.fI;
import a.uc.T;
import a.uc.dB;
import a.cv;
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
import a.y;
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
import a.fn;
import a.uc.cZ;
import a.uc.eU;
import a.uc.bJ;

import java.util.Map.Entry;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.systems.commands.Command;
import nesquik.mytheria.systems.commands.ValidationResult;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import nesquik.mytheria.utility.interfaces.IScaledResolution;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;

public class r implements IMinecraft, IScaledResolution {
   private final EventListener<ad> a = event -> {
      MatrixStack var2 = event.getContext().getMatrices();
      this.a(event, var2);
   };

   public r() {
      Mytheria.getInstance().getEventManager().subscribe(this);
   }

   public Command command() {
      return f.begin("waypoint")
         .aliases("way")
         .desc("Метки")
         .param("action", p -> p.literal("add", "del", "clear"))
         .param("name", p -> p.optional().validator(ValidationResult::ok))
         .param("x", p -> p.optional().validator(this::a))
         .param("y", p -> p.optional().validator(this::a))
         .param("z", p -> p.optional().validator(this::a))
         .handler(this::a)
         .build();
   }

   private ValidationResult a(String input) {
      try {
         Integer.parseInt(input);
         return ValidationResult.ok(input);
      } catch (NumberFormatException var3) {
         return ValidationResult.error("Не правильное число");
      }
   }

   private void a(g ctx) {
      String var2 = (String)ctx.arguments().get(0);
      String var3 = (String)ctx.arguments().get(1);
      String var4 = (String)ctx.arguments().get(2);
      String var5 = (String)ctx.arguments().get(3);
      String var6 = (String)ctx.arguments().get(4);
      cv var7 = Mytheria.getInstance().getWayPointsManager();
      String var8 = var2.toLowerCase();
      switch (var8) {
         case "add":
            if (var3 == null || var4 == null || var5 == null || var6 == null) {
               eg.error(Text.of("Укажите название и координаты (.way add \"Название\" x y z)"));
               return;
            }

            try {
               var7.add(var3, Integer.parseInt(var4), Integer.parseInt(var5), Integer.parseInt(var6));
            } catch (NumberFormatException var12) {
               eg.error(Text.of("Координаты должны быть числами"));
            }
            break;
         case "del":
            if (var3 == null) {
               eg.error(Text.of("Укажите название (.way del \"Название\")"));
               return;
            }

            var7.del(var3);
            break;
         case "clear":
            var7.clear();
      }
   }

   private void a(ad event, MatrixStack matrices) {
      for (Entry var5 : Mytheria.getInstance().getWayPointsManager().getEntries()) {
         String var6 = (String)var5.getKey();
         Vec3d var7 = (Vec3d)var5.getValue();
         Vec3d var8 = var7.add(0.0, 0.5, 0.0);
         Vec2f var9 = fn.worldToScreen(var8);
         if (var9 != null) {
            float var10 = (float)mc.player.getPos().distanceTo(var7);
            float var11 = MathHelper.clamp(1.0F - var10 / 20.0F, 0.5F, 1.0F);
            matrices.push();
            matrices.translate(var9.x, var9.y, 0.0F);
            matrices.scale(var11, var11, 1.0F);
            String var12 = String.format("%.0fm", var10);
            float var13 = 30.0F;
            float var14 = 8.0F;
            float var15 = 4.0F;
            float var16 = Fonts.SEMIBOLD.getFont(10.0F).width(var6);
            float var17 = Fonts.REGULAR.getFont(9.0F).width(var12);
            float var18 = Math.max(var16, var17);
            float var19 = var13 + var14 + var18 + var14 * 2.0F;
            float var20 = Fonts.SEMIBOLD.getFont(10.0F).height();
            float var21 = Fonts.REGULAR.getFont(9.0F).height();
            float var22 = Math.max(var13, var20 + var15 + var21) + var14 * 2.0F;
            float var23 = -var19 / 2.0F;
            float var24 = -var22 - 10.0F;
            if (bJ.showGlass()) {
               event.getContext()
                  .drawLiquidGlass(var23, var24, var19, var22, 5.0F, bJ.getDistortion(), BorderRadius.all(10.0F), ec.getLiquidGlassColor().mulAlpha(bJ.glass()));
               event.getContext()
                  .drawRoundedRect(
                     var23, var24, var19, var22, BorderRadius.all(10.0F), bJ.getBackgroundColor().withAlpha((int)(255.0F * (0.8F - 0.6F * bJ.glass())))
                  );
            } else {
               if (bJ.showMinimalizm()) {
                  event.getContext().drawBlurredRect(var23, var24, var19, var22, 11.25F, BorderRadius.all(10.0F), ec.WHITE.mulAlpha(bJ.minimalizm()));
               }

               event.getContext().drawRoundedRect(var23, var24, var19, var22, BorderRadius.all(10.0F), bJ.getBackgroundColor());
            }

            float var25 = var23 + var14;
            float var26 = var24 + (var22 - var13) / 2.0F;
            event.getContext().drawRoundedRect(var25, var26, var13, var13, BorderRadius.all(5.0F), eb.WHITE);
            event.getContext()
               .drawTexture(Mytheria.id("icons/way.png"), var25 + 2.0F, var26 + 2.0F, var13 - 4.0F, var13 - 4.0F, new eb(40.0F, 40.0F, 40.0F, 255.0F));
            float var27 = var25 + var13 + var14;
            float var28 = var24 + (var22 - var20 - var15 - var21) / 2.0F;
            event.getContext().drawText(Fonts.SEMIBOLD.getFont(10.0F), var6, var27, var28, eb.WHITE);
            event.getContext().drawText(Fonts.REGULAR.getFont(9.0F), var12, var27, var28 + var20 + var15, new eb(200.0F, 200.0F, 200.0F, 255.0F));
            matrices.pop();
         }
      }
   }
}
