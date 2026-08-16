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
import a.be;
import a.uc.aG;
import a.uc.dI;
import a.uc.aK;
import a.uc.aJ;
import a.o;
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

import java.nio.ByteBuffer;
import java.util.Objects;
import lombok.Generated;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;

public class eb {
   public static final eb WHITE = new eb(255.0F, 255.0F, 255.0F);
   public static final eb BLACK = new eb(0.0F, 0.0F, 0.0F);
   public static final eb GREEN = new eb(0.0F, 255.0F, 0.0F);
   public static final eb RED = new eb(255.0F, 0.0F, 0.0F);
   public static final eb BLUE = new eb(0.0F, 0.0F, 255.0F);
   public static final eb YELLOW = new eb(255.0F, 255.0F, 0.0F);
   private transient float[] a;
   private final float b;
   private final float c;
   private final float d;
   private final float e;
   private static final ByteBuffer f = ByteBuffer.allocateDirect(4);

   public eb(float red, float green, float blue) {
      this(red, green, blue, 255.0F);
   }

   public eb(float red, float green, float blue, float alpha) {
      red = MathHelper.clamp(red, 0.0F, 255.0F);
      green = MathHelper.clamp(green, 0.0F, 255.0F);
      blue = MathHelper.clamp(blue, 0.0F, 255.0F);
      alpha = MathHelper.clamp(alpha, 0.0F, 255.0F);
      this.b = red;
      this.c = green;
      this.d = blue;
      this.e = alpha;
   }

   public int getRGB() {
      int var1 = Math.round(this.a(this.e));
      int var2 = Math.round(this.a(this.b));
      int var3 = Math.round(this.a(this.c));
      int var4 = Math.round(this.a(this.d));
      return (var1 & 0xFF) << 24 | (var2 & 0xFF) << 16 | (var3 & 0xFF) << 8 | var4 & 0xFF;
   }

   public String toHex() {
      return String.format("#%02x%02x%02x%02x", Math.round(this.a(this.b)), Math.round(this.a(this.c)), Math.round(this.a(this.d)), Math.round(this.a(this.e)));
   }

   private float a(float value) {
      return Math.max(0.0F, Math.min(255.0F, value));
   }

   public static eb fromHex(String hex) {
      String var1 = hex.startsWith("#") ? hex.substring(1) : hex;
      if (var1.length() != 6 && var1.length() != 8) {
         throw new IllegalArgumentException("Hex color must be in the format #RRGGBB or #RRGGBBAA");
      }

      float var2 = Integer.parseInt(var1.substring(0, 2), 16);
      float var3 = Integer.parseInt(var1.substring(2, 4), 16);
      float var4 = Integer.parseInt(var1.substring(4, 6), 16);
      float var5 = var1.length() == 8 ? Integer.parseInt(var1.substring(6, 8), 16) : 255.0F;
      return new eb(var2, var3, var4, var5);
   }

   public static eb fromInt(int colorInt) {
      float var1 = colorInt >> 24 & 0xFF;
      float var2 = colorInt >> 16 & 0xFF;
      float var3 = colorInt >> 8 & 0xFF;
      float var4 = colorInt & 0xFF;
      return new eb(var2, var3, var4, var1);
   }

   public eb withAlpha(float newAlpha) {
      return new eb(this.b, this.c, this.d, newAlpha);
   }

   public eb mulAlpha(float percent) {
      return this.withAlpha(this.e * percent);
   }

   public eb mix(eb color2, float amount) {
      amount = Math.min(1.0F, Math.max(0.0F, amount));
      return new eb(
         eI.interpolate(this.getRed(), color2.getRed(), amount),
         eI.interpolate(this.getGreen(), color2.getGreen(), amount),
         eI.interpolate(this.getBlue(), color2.getBlue(), amount),
         eI.interpolate(this.getAlpha(), color2.getAlpha(), amount)
      );
   }

   public static eb fromHSB(float hue, float saturation, float brightness) {
      if (saturation == 0.0F) {
         int var11 = (int)(brightness * 255.0F + 0.5F);
         return new eb(var11, var11, var11);
      }

      float var3 = (hue - (float)Math.floor(hue)) * 6.0F;
      float var4 = var3 - (float)Math.floor(var3);
      float var5 = brightness * (1.0F - saturation);
      float var6 = brightness * (1.0F - saturation * var4);
      float var7 = brightness * (1.0F - saturation * (1.0F - var4));
      float var8 = 0.0F;
      float var9 = 0.0F;
      float var10 = 0.0F;
      switch ((int)var3) {
         case 0:
            var8 = brightness;
            var9 = var7;
            var10 = var5;
            break;
         case 1:
            var8 = var6;
            var9 = brightness;
            var10 = var5;
            break;
         case 2:
            var8 = var5;
            var9 = brightness;
            var10 = var7;
            break;
         case 3:
            var8 = var5;
            var9 = var6;
            var10 = brightness;
            break;
         case 4:
            var8 = var7;
            var9 = var5;
            var10 = brightness;
            break;
         case 5:
            var8 = brightness;
            var9 = var5;
            var10 = var6;
      }

      return new eb(var8 * 255.0F, var9 * 255.0F, var10 * 255.0F);
   }

   public float getHue() {
      return this.a()[0];
   }

   public float getSaturation() {
      return this.a()[2];
   }

   public float getBrightness() {
      return this.a()[1];
   }

   private float[] a() {
      if (this.a == null) {
         this.a = this.b();
      }

      return this.a;
   }

   private float[] b() {
      float var1 = this.b / 255.0F;
      float var2 = this.c / 255.0F;
      float var3 = this.d / 255.0F;
      float var4 = Math.max(var1, Math.max(var2, var3));
      float var5 = Math.min(var1, Math.min(var2, var3));
      float var6 = var4 - var5;
      float var7 = 0.0F;
      if (var6 != 0.0F) {
         if (var4 == var1) {
            var7 = (var2 - var3) / var6;
         } else if (var4 == var2) {
            var7 = (var3 - var1) / var6 + 2.0F;
         } else {
            var7 = (var1 - var2) / var6 + 4.0F;
         }

         var7 /= 6.0F;
         if (var7 < 0.0F) {
            var7++;
         }
      }

      float var8 = var4 == 0.0F ? 0.0F : var6 / var4;
      return new float[]{var7, var8, var4};
   }

   public static eb fromPixel(float pixelX, float pixelY) {
      f.clear();
      GL11.glReadPixels((int)pixelX, (int)pixelY, 1, 1, 6408, 5121, f);
      int var2 = f.get(0) & 255;
      int var3 = f.get(1) & 255;
      int var4 = f.get(2) & 255;
      return new eb(var2, var3, var4);
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (o != null && this.getClass() == o.getClass()) {
         eb var2 = (eb)o;
         return Float.compare(this.b, var2.b) == 0
            && Float.compare(this.c, var2.c) == 0
            && Float.compare(this.d, var2.d) == 0
            && Float.compare(this.e, var2.e) == 0;
      } else {
         return false;
      }
   }

   public float difference(eb colorRGBA) {
      return Math.abs(this.getHue() - colorRGBA.getHue())
         + Math.abs(this.getBrightness() - colorRGBA.getBrightness())
         + Math.abs(this.getSaturation() - colorRGBA.getSaturation());
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.b, this.c, this.d, this.e);
   }

   @Override
   public String toString() {
      return String.format("RGBA(%.1f, %.1f, %.1f, %.1f)", this.b, this.c, this.d, this.e);
   }

   @Generated
   public float getRed() {
      return this.b;
   }

   @Generated
   public float getGreen() {
      return this.c;
   }

   @Generated
   public float getBlue() {
      return this.d;
   }

   @Generated
   public float getAlpha() {
      return this.e;
   }
}
