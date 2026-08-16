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
import a.cg;
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
import a.bk;
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
import a.ax;
import a.uc.dG;
import a.e;
import a.uc.dP;
import a.y;
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

import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import net.minecraft.client.option.Perspective;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.glfw.GLFW;

@ModuleInfo(name = "Freelook", category = ax.PLAYER, desc = "modules.descriptions.freelook")
public class bk extends aJ {
   public static bk INSTANCE;
   public static boolean isActive = false;
   public static float x = 0.0F;
   public static float y = 0.0F;
   public static float prevX = 0.0F;
   public static float prevY = 0.0F;
   private float a = 0.0F;
   private float b = 0.0F;
   private Perspective c = Perspective.FIRST_PERSON;
   private final cg d = new cg(this, "freelook.keybind").key(342);
   private final EventListener<W> e = event -> {
      if (mc.player == null) {
         if (isActive) {
            isActive = false;
         }
      } else {
         boolean var2 = this.d.getKey() != -1 && GLFW.glfwGetKey(mc.getWindow().getHandle(), this.d.getKey()) == 1;
         if (var2 && !isActive) {
            this.a();
         } else if (!var2 && isActive) {
            this.b();
         }

         if (!isActive) {
            x = mc.player.getYaw();
            y = mc.player.getPitch();
            prevX = x;
            prevY = y;
         } else {
            mc.player.bodyYaw = this.a;
            mc.player.prevBodyYaw = this.a;
            mc.player.headYaw = this.a;
            mc.player.prevHeadYaw = this.a;
         }
      }
   };
   private final EventListener<C> f = event -> {
      if (isActive) {
         event.cancel();
      }
   };
   private final EventListener<P> g = event -> {
      if (isActive) {
         event.cancel();
      }
   };
   private final EventListener<D> h = event -> {
      if (isActive) {
         event.cancel();
      }
   };

   public bk() {
      INSTANCE = this;
   }

   public static boolean isActive() {
      return isActive;
   }

   @Override
   public void onEnable() {
      super.onEnable();
      isActive = false;
   }

   @Override
   public void onDisable() {
      super.onDisable();
      if (isActive) {
         this.b();
      }
   }

   private void a() {
      if (mc.player != null && !isActive) {
         this.a = mc.player.getYaw();
         this.b = mc.player.getPitch();
         this.c = mc.options.getPerspective();
         isActive = true;
         x = this.a;
         y = this.b;
         prevX = x;
         prevY = y;
         mc.options.setPerspective(Perspective.THIRD_PERSON_BACK);
      }
   }

   private void b() {
      if (mc.player != null && isActive) {
         mc.options.setPerspective(this.c);
         mc.player.setYaw(this.a);
         mc.player.setPitch(this.b);
         mc.player.headYaw = this.a;
         mc.player.prevHeadYaw = this.a;
         isActive = false;
      }
   }

   public static float calculateCorrectYawOffset(float yaw) {
      if (mc.player == null) {
         return yaw;
      }

      double var1 = mc.player.getX() - mc.player.prevX;
      double var3 = mc.player.getZ() - mc.player.prevZ;
      float var5 = (float)(var1 * var1 + var3 * var3);
      float var6 = mc.player.prevBodyYaw;
      float var7 = var6;
      if (var5 > 0.0025000002F) {
         var7 = (float)MathHelper.atan2(var3, var1) * 180.0F / (float) Math.PI - 90.0F;
      }

      if (mc.player.handSwingProgress > 0.0F) {
         var7 = yaw;
      }

      float var8 = MathHelper.wrapDegrees(yaw - (var6 + MathHelper.wrapDegrees(var7 - var6) * 0.3F));
      var8 = MathHelper.clamp(var8, -75.0F, 75.0F);
      var6 = yaw - var8;
      if (var8 * var8 > 2500.0F) {
         var6 += var8 * 0.2F;
      }

      return var6;
   }

   public float getRotYaw() {
      return x;
   }

   public void setRotYaw(float rotYaw) {
      prevX = x;
      x = rotYaw;
   }

   public float getRotPitch() {
      return y;
   }

   public void setRotPitch(float rotPitch) {
      prevY = y;
      y = rotPitch;
   }

   public void updateFreeYaw(float yawDelta) {
      prevX = x;
      x += yawDelta;
   }

   public void updateFreePitch(float pitchDelta) {
      prevY = y;
      y = MathHelper.clamp(y + pitchDelta, -90.0F, 90.0F);
   }

   public static float getYaw(float partialTicks) {
      return partialTicks == 1.0F ? x : prevX + (x - prevX) * partialTicks;
   }

   public static float getPitch(float partialTicks) {
      return partialTicks == 1.0F ? y : prevY + (y - prevY) * partialTicks;
   }

   public static float getActualYaw(float partialTicks) {
      return isActive ? getYaw(partialTicks) : (mc.player != null ? mc.player.getYaw(partialTicks) : 0.0F);
   }

   public static float getActualPitch(float partialTicks) {
      return isActive ? getPitch(partialTicks) : (mc.player != null ? mc.player.getPitch(partialTicks) : 0.0F);
   }

   public static Vec3d getActualLookVector(float partialTicks) {
      if (!isActive && mc.player != null) {
         return mc.player.getRotationVec(partialTicks);
      }

      if (!isActive) {
         return Vec3d.ZERO;
      }

      float var1 = getYaw(partialTicks);
      float var2 = getPitch(partialTicks);
      float var3 = var2 * (float) (Math.PI / 180.0);
      float var4 = -var1 * (float) (Math.PI / 180.0);
      float var5 = MathHelper.cos(var4);
      float var6 = MathHelper.sin(var4);
      float var7 = MathHelper.cos(var3);
      float var8 = MathHelper.sin(var3);
      return new Vec3d(var6 * var7, -var8, var5 * var7);
   }

   public static Vec3d getCurrentLookVector() {
      if (!isActive) {
         return mc.player != null ? mc.player.getRotationVec(1.0F) : Vec3d.ZERO;
      }

      float var0 = x;
      float var1 = y;
      float var2 = var1 * (float) (Math.PI / 180.0);
      float var3 = -var0 * (float) (Math.PI / 180.0);
      float var4 = MathHelper.cos(var3);
      float var5 = MathHelper.sin(var3);
      float var6 = MathHelper.cos(var2);
      float var7 = MathHelper.sin(var2);
      return new Vec3d(var5 * var6, -var7, var4 * var6);
   }
}
