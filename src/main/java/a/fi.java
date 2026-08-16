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
import a.fi;
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

import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.MatrixStack.Entry;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public final class fi implements IMinecraft {
   public static void renderGlowingBox(MatrixStack matrices, BufferBuilder buffer, Box box, eb color) {
      float var4 = color.getRed();
      float var5 = color.getGreen();
      float var6 = color.getBlue();
      float var7 = color.getAlpha();
      RenderSystem.enableBlend();
      RenderSystem.disableDepthTest();
      RenderSystem.disableCull();
      RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      byte var8 = 3;
      float var9 = 0.1F;

      for (int var10 = var8; var10 >= 1; var10--) {
         float var11 = var10 * var9;
         float var12 = var7 * (0.15F / var10);
         renderFilledBox(matrices, buffer, box.expand(var11), new eb(var4, var5, var6, var12));
      }

      renderFilledBox(matrices, buffer, box, new eb(var4, var5, var6, var7));
      RenderSystem.enableCull();
      RenderSystem.enableDepthTest();
      RenderSystem.disableBlend();
   }

   public static void renderFilledBox(MatrixStack matrices, BufferBuilder buffer, Box box, eb color) {
      float var4 = color.getRed() / 255.0F;
      float var5 = color.getGreen() / 255.0F;
      float var6 = color.getBlue() / 255.0F;
      float var7 = color.getAlpha() / 255.0F;
      renderFilledBox(matrices, buffer, box, var4, var5, var6, var7);
   }

   public static void renderBoxInternalDiagonals(MatrixStack matrices, BufferBuilder buf, Box box, eb color) {
      float var4 = color.getRed() / 255.0F;
      float var5 = color.getGreen() / 255.0F;
      float var6 = color.getBlue() / 255.0F;
      float var7 = color.getAlpha() / 255.0F;
      float var8 = (float)box.minX;
      float var9 = (float)box.minY;
      float var10 = (float)box.minZ;
      float var11 = (float)box.maxX;
      float var12 = (float)box.maxY;
      float var13 = (float)box.maxZ;
      Matrix4f var14 = matrices.peek().getPositionMatrix();
      buf.vertex(var14, var8, var9, var10).color(var4, var5, var6, var7);
      buf.vertex(var14, var11, var12, var13).color(var4, var5, var6, var7);
      buf.vertex(var14, var11, var9, var10).color(var4, var5, var6, var7);
      buf.vertex(var14, var8, var12, var13).color(var4, var5, var6, var7);
      buf.vertex(var14, var8, var9, var13).color(var4, var5, var6, var7);
      buf.vertex(var14, var11, var12, var10).color(var4, var5, var6, var7);
      buf.vertex(var14, var11, var9, var13).color(var4, var5, var6, var7);
      buf.vertex(var14, var8, var12, var10).color(var4, var5, var6, var7);
   }

   public static void renderFilledBox(MatrixStack matrices, BufferBuilder buffer, Box box, float r, float g, float b, float a) {
      float var7 = (float)box.minX;
      float var8 = (float)box.minY;
      float var9 = (float)box.minZ;
      float var10 = (float)box.maxX;
      float var11 = (float)box.maxY;
      float var12 = (float)box.maxZ;
      Matrix4f var13 = matrices.peek().getPositionMatrix();
      buffer.vertex(var13, var7, var8, var9).color(r, g, b, a);
      buffer.vertex(var13, var10, var8, var9).color(r, g, b, a);
      buffer.vertex(var13, var10, var8, var12).color(r, g, b, a);
      buffer.vertex(var13, var7, var8, var12).color(r, g, b, a);
      buffer.vertex(var13, var7, var11, var9).color(r, g, b, a);
      buffer.vertex(var13, var10, var11, var9).color(r, g, b, a);
      buffer.vertex(var13, var10, var11, var12).color(r, g, b, a);
      buffer.vertex(var13, var7, var11, var12).color(r, g, b, a);
      buffer.vertex(var13, var7, var8, var12).color(r, g, b, a);
      buffer.vertex(var13, var10, var8, var12).color(r, g, b, a);
      buffer.vertex(var13, var10, var11, var12).color(r, g, b, a);
      buffer.vertex(var13, var7, var11, var12).color(r, g, b, a);
      buffer.vertex(var13, var7, var8, var9).color(r, g, b, a);
      buffer.vertex(var13, var10, var8, var9).color(r, g, b, a);
      buffer.vertex(var13, var10, var11, var9).color(r, g, b, a);
      buffer.vertex(var13, var7, var11, var9).color(r, g, b, a);
      buffer.vertex(var13, var7, var8, var9).color(r, g, b, a);
      buffer.vertex(var13, var7, var8, var12).color(r, g, b, a);
      buffer.vertex(var13, var7, var11, var12).color(r, g, b, a);
      buffer.vertex(var13, var7, var11, var9).color(r, g, b, a);
      buffer.vertex(var13, var10, var8, var9).color(r, g, b, a);
      buffer.vertex(var13, var10, var8, var12).color(r, g, b, a);
      buffer.vertex(var13, var10, var11, var12).color(r, g, b, a);
      buffer.vertex(var13, var10, var11, var9).color(r, g, b, a);
   }

   public static void renderOutlinedBox(MatrixStack matrices, BufferBuilder buffer, Box box, eb color) {
      float var4 = color.getRed() / 255.0F;
      float var5 = color.getGreen() / 255.0F;
      float var6 = color.getBlue() / 255.0F;
      float var7 = color.getAlpha() / 255.0F;
      float var8 = (float)box.minX;
      float var9 = (float)box.minY;
      float var10 = (float)box.minZ;
      float var11 = (float)box.maxX;
      float var12 = (float)box.maxY;
      float var13 = (float)box.maxZ;
      Matrix4f var14 = matrices.peek().getPositionMatrix();
      buffer.vertex(var14, var8, var9, var10).color(var4, var5, var6, var7);
      buffer.vertex(var14, var11, var9, var10).color(var4, var5, var6, var7);
      buffer.vertex(var14, var11, var9, var10).color(var4, var5, var6, var7);
      buffer.vertex(var14, var11, var9, var13).color(var4, var5, var6, var7);
      buffer.vertex(var14, var11, var9, var13).color(var4, var5, var6, var7);
      buffer.vertex(var14, var8, var9, var13).color(var4, var5, var6, var7);
      buffer.vertex(var14, var8, var9, var13).color(var4, var5, var6, var7);
      buffer.vertex(var14, var8, var9, var10).color(var4, var5, var6, var7);
      buffer.vertex(var14, var8, var12, var10).color(var4, var5, var6, var7);
      buffer.vertex(var14, var11, var12, var10).color(var4, var5, var6, var7);
      buffer.vertex(var14, var11, var12, var10).color(var4, var5, var6, var7);
      buffer.vertex(var14, var11, var12, var13).color(var4, var5, var6, var7);
      buffer.vertex(var14, var11, var12, var13).color(var4, var5, var6, var7);
      buffer.vertex(var14, var8, var12, var13).color(var4, var5, var6, var7);
      buffer.vertex(var14, var8, var12, var13).color(var4, var5, var6, var7);
      buffer.vertex(var14, var8, var12, var10).color(var4, var5, var6, var7);
      buffer.vertex(var14, var8, var9, var10).color(var4, var5, var6, var7);
      buffer.vertex(var14, var8, var12, var10).color(var4, var5, var6, var7);
      buffer.vertex(var14, var11, var9, var10).color(var4, var5, var6, var7);
      buffer.vertex(var14, var11, var12, var10).color(var4, var5, var6, var7);
      buffer.vertex(var14, var11, var9, var13).color(var4, var5, var6, var7);
      buffer.vertex(var14, var11, var12, var13).color(var4, var5, var6, var7);
      buffer.vertex(var14, var8, var9, var13).color(var4, var5, var6, var7);
      buffer.vertex(var14, var8, var12, var13).color(var4, var5, var6, var7);
   }

   public static void drawLine(MatrixStack matrices, VertexConsumer vertexConsumer, Vec3d startPos, Vec3d endPos, eb color) {
      Entry var5 = matrices.peek();
      Vec3d var6 = endPos.subtract(startPos).normalize();
      Vector3f var7 = new Vector3f((float)startPos.x, (float)startPos.y, (float)startPos.z);
      vertexConsumer.vertex(var5, var7)
         .color(color.getRGB())
         .normal(var5, (float)var6.x, (float)var6.y, (float)var6.z);
      vertexConsumer.vertex(var5, (float)endPos.x, (float)endPos.y, (float)endPos.z)
         .color(color.getRGB())
         .normal(var5, (float)var6.x, (float)var6.y, (float)var6.z);
   }

   public static void drawLine(MatrixStack matrices, BufferBuilder builder, Vec3d startPos, Vec3d endPos, eb color) {
      Entry var5 = matrices.peek();
      Matrix4f var6 = var5.getPositionMatrix();
      Vec3d var7 = endPos.subtract(startPos).normalize();
      builder.vertex(var6, (float)startPos.x, (float)startPos.y, (float)startPos.z)
         .color(color.getRGB())
         .normal(var5, (float)var7.x, (float)var7.y, (float)var7.z);
      builder.vertex(var6, (float)endPos.x, (float)endPos.y, (float)endPos.z)
         .color(color.getRGB())
         .normal(var5, (float)var7.x, (float)var7.y, (float)var7.z);
   }

   public static void renderLineFromPlayer(MatrixStack matrices, BufferBuilder builder, Vec3d endPos, eb color) {
      Camera var4 = mc.gameRenderer.getCamera();
      Vec3d var5 = var4.getPos();
      Vec3d var6 = new Vec3d(0.0, 0.0, 27.0)
         .rotateX((float)(-Math.toRadians(var4.getPitch())))
         .rotateY((float)(-Math.toRadians(var4.getYaw())));
      Vec3d var7 = endPos.subtract(var5);
      Vec3d var8 = new Vec3d(var6.getX(), var6.getY(), var6.getZ());
      drawLine(matrices, builder, var8, var7, color);
   }
}
