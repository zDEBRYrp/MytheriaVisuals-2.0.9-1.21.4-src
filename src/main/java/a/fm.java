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
import a.uc.G;
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
import a.uc.eT;
import a.uc.K;
import a.uc.cB;
import a.uc.bT;
import a.w;
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
import a.uc.E;
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

import java.util.ArrayDeque;
import java.util.Deque;
import nesquik.mytheria.utility.interfaces.IWindow;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MatrixUtil;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.opengl.GL11;

public final class fm implements IWindow {
   private static final Deque<fm.a> a = new ArrayDeque<>();

   private static void a(fm.a rect) {
      int var1 = mw.getFramebufferHeight();
      double var2 = mw.getScaleFactor();
      float var4 = rect.a * (float)var2;
      float var5 = rect.b * (float)var2;
      float var6 = (rect.a + rect.c) * (float)var2;
      float var7 = (rect.b + rect.d) * (float)var2;
      int var8 = (int)Math.floor(var4);
      int var9 = (int)Math.floor(var1 - Math.ceil(var7) + 0.5);
      int var10 = (int)Math.max(0.0F, (int)Math.ceil(var6) - var8);
      int var11 = (int)Math.max(0.0F, (int)Math.ceil(var7) - (int)Math.floor(var5) - 1.0F);
      GL11.glEnable(3089);
      GL11.glScissor(var8, var9, var10, var11);
   }

   public static void push(float x, float y, float width, float height) {
      fm.a var4 = new fm.a(x, y, width, height);
      b(var4);
   }

   public static void push(MatrixStack stack, float x, float y, float width, float height) {
      Matrix4f var5 = stack.peek().getPositionMatrix();
      fm.a var6 = new fm.a(x, y, width, height).a(var5);
      b(var6);
   }

   public static void push(Matrix4f transformationMatrix, float x, float y, float width, float height) {
      fm.a var5 = new fm.a(x, y, width, height);
      if (transformationMatrix != null) {
         var5 = var5.a(transformationMatrix);
      }

      b(var5);
   }

   private static void b(fm.a rect) {
      if (!a.isEmpty()) {
         rect = a(a.peek(), rect);
      }

      a.push(rect);
      a(rect);
   }

   public static void pop() {
      if (!a.isEmpty()) {
         a.pop();
      }

      if (!a.isEmpty()) {
         a(a.peek());
      } else {
         GL11.glDisable(3089);
      }
   }

   private static fm.a a(fm.a a, fm.a b) {
      float var2 = Math.max(a.a(), b.a());
      float var3 = Math.max(a.b(), b.b());
      float var4 = Math.min(a.c(), b.c());
      float var5 = Math.min(a.d(), b.d());
      float var6 = Math.max(0.0F, var4 - var2);
      float var7 = Math.max(0.0F, var5 - var3);
      return new fm.a(var2, var3, var6, var7);
   }

   public static boolean isScissorEnabled() {
      return !a.isEmpty();
   }

   public static void clear() {
      a.clear();
      GL11.glDisable(3089);
   }

   public static int getStackSize() {
      return a.size();
   }

   @Deprecated
   public static void startScissor(float x, float y, float width, float height) {
      push(x, y, width, height);
   }

   @Deprecated
   public static void startScissor(float x, float y, float width, float height, MatrixStack matrices) {
      if (matrices != null) {
         push(matrices, x, y, width, height);
      } else {
         push(x, y, width, height);
      }
   }

   @Deprecated
   public static void startScissor(float x, float y, float width, float height, Matrix4f transformationMatrix) {
      push(transformationMatrix, x, y, width, height);
   }

   @Deprecated
   public static void stopScissor() {
      pop();
   }

   public static class a {
      final float a;
      final float b;
      final float c;
      final float d;

      a(float x, float y, float w, float h) {
         this.a = x;
         this.b = y;
         this.c = w;
         this.d = h;
      }

      float a() {
         return this.a;
      }

      float b() {
         return this.b;
      }

      float c() {
         return this.a + this.c;
      }

      float d() {
         return this.b + this.d;
      }

      fm.a a(Matrix4f matrix) {
         if (MatrixUtil.isIdentity(matrix)) {
            return new fm.a(this.a, this.b, this.c, this.d);
         }

         Vector3f var2 = new Vector3f(this.a, this.b, 0.0F);
         Vector3f var3 = new Vector3f(this.a + this.c, this.b + this.d, 0.0F);
         matrix.transformPosition(var2);
         matrix.transformPosition(var3);
         return new fm.a(var2.x, var2.y, var3.x - var2.x, var3.y - var2.y);
      }
   }
}
