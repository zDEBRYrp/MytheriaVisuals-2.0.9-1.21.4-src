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
import a.v;
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
import a.dj;
import a.uc.fF;
import a.uc.aR;
import a.uc.fG;
import a.uc.dV;
import a.uc.aX;
import a.dg;
import a.uc.E;
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

import java.util.ArrayList;
import java.util.List;
import nesquik.mytheria.framework.base.CustomDrawContext;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;

public class dj extends dg implements IMinecraft {
   private Vec3d a = new Vec3d(-52.0, 87.0, 3.0);

   public dj(cn setting) {
      super(setting, "mine");
   }

   @Override
   public void draw(CustomDrawContext context) {
      if (mc.world != null && mc.player != null && ep.spawn()) {
         String var2 = "";
         String var3 = "";
         List var4 = List.of("обычная", "редкая", "эпическая", "легендарная", "мифическая");
         ArrayList<ArmorStandEntity> var5 = new ArrayList<>();

         for (Entity var7 : mc.world.getEntities()) {
            if (var7 instanceof ArmorStandEntity var8 && this.a(var8, new Vec3d(-52.0, 87.0, 3.0))) {
               var5.add(var8);
            }
         }

         var5.sort((a, b) -> Double.compare(b.getY(), a.getY()));

         for (int var16 = 0; var16 < var5.size(); var16++) {
            ArmorStandEntity var18 = (ArmorStandEntity)var5.get(var16);
            Text var21 = var18.getCustomName();
            if (var21 != null) {
               String var9 = var21.getString().trim();
               if (var9.matches("\\d{1,2}:\\d{2}")) {
                  var2 = var9.replaceFirst("^0", "");
               } else if (var9.contains("осталось:")) {
                  int var10 = var9.indexOf(58);
                  if (var10 != -1 && var10 + 2 < var9.length()) {
                     String var11 = var9.substring(var10 + 2).trim();
                     int var12 = var11.indexOf(" мин.");
                     int var13 = var11.indexOf(" сек.");
                     if (var12 != -1 && var13 != -1) {
                        int var14 = Integer.parseInt(var11.substring(0, var12).trim());
                        int var15 = Integer.parseInt(var11.substring(var12 + 5, var13).trim());
                        var2 = String.format("%d:%02d", var14, var15);
                     }
                  }
               } else if (var9.startsWith("Следующая:")) {
                  int var26 = var9.indexOf(58);
                  if (var26 != -1 && var26 + 2 < var9.length()) {
                     var3 = var9.substring(var26 + 2).trim();
                  }
               } else if (var9.equals("Следующая шахта:") && var16 + 1 < var5.size()) {
                  ArmorStandEntity var27 = (ArmorStandEntity)var5.get(var16 + 1);
                  Text var28 = var27.getCustomName();
                  if (var28 != null) {
                     String var29 = var28.getString().trim();
                     if (var4.contains(var29.toLowerCase().trim())) {
                        var3 = var29;
                     }
                  }
               }

               if (!var2.isEmpty() && !var3.isEmpty()) {
                  break;
               }
            }
         }

         if (!var2.isEmpty() && !var3.isEmpty()) {
            eb var17;
            if (ep.is("holyworld")) {
               String var19 = var3.trim().toLowerCase();

               var17 = switch (var19) {
                  case "легендарная" -> new eb(0.0F, 128.0F, 250.0F);
                  case "эпическая" -> new eb(231.0F, 0.0F, 250.0F);
                  default -> new eb(243.0F, 151.0F, 250.0F);
               };
            } else {
               String var20 = var3.trim().toLowerCase();

               var17 = switch (var20) {
                  case "легендарная" -> new eb(84.0F, 152.0F, 152.0F);
                  case "мифическая" -> new eb(252.0F, 84.0F, 252.0F);
                  default -> new eb(252.0F, 168.0F, 0.0F);
               };
            }

            this.update(Integer.parseInt(var2.split(":")[0]) + ":", "", Integer.parseInt(var2.split(":")[1]), var3, var17);
            super.draw(context);
            this.timeAnim.settings(true, eb.WHITE);
         }
      }
   }

   @Override
   public boolean canShow() {
      if (mc.world != null && mc.player != null && ep.spawn()) {
         if (ep.is("holyworld")) {
            this.a = new Vec3d(23.0, 41.0, -156.0);
         } else {
            this.a = new Vec3d(-52.0, 87.0, 3.0);
         }

         for (Entity var2 : mc.world.getEntities()) {
            if (var2 instanceof ArmorStandEntity var3 && var3.isAlive() && this.a(var3, this.a)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private boolean a(ArmorStandEntity a, Vec3d v) {
      return Math.abs(a.getX() - v.x) <= 2.0
         && Math.abs(a.getY() - v.y) <= 2.0
         && Math.abs(a.getZ() - v.z) <= 2.0;
   }
}
