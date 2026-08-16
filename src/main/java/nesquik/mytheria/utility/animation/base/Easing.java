package nesquik.mytheria.utility.animation.base;

import a.uc.eI;
import lombok.Generated;

public interface Easing {
   Easing BAKEK = generate(0.45F, 1.45F, 0.49F, 1.15F);
   Easing BAKEK_SMALLER = generate(0.45F, 1.45F, 0.43F, 0.91F);
   Easing BAKEK_PAGES = generate(0.1F, 1.07F, 0.34F, 1.04F);
   Easing BAKEK_SIZE = generate(0.27F, 1.09F, 0.49F, 1.06F);
   Easing BAKEK_BACK = generate(0.62, -0.16, 0.8, 0.37);
   Easing BAKEK_MANY = generate(0.25, 1.07, 0.11, 1.1);
   Easing FIGMA_EASE_IN_OUT = generate(0.42, 0.0, 0.58, 1.0);
   Easing SMOOTH_STEP = (t, b, c, d) -> {
      float var4 = c * t / d + b;
      return (float)(-2.0 * Math.pow(var4, 3.0) + 3.0 * Math.pow(var4, 2.0));
   };
   Easing BOTH_CUBIC = (t, b, c, d) -> {
      float var4 = c * t / d + b;
      return var4 < 0.5 ? 4.0F * var4 * var4 * var4 : (float)(1.0 - Math.pow(-2.0F * var4 + 2.0F, 3.0) / 2.0);
   };
   Easing LINEAR = (t, b, c, d) -> c * t / d + b;
   Easing QUAD_IN = (t, b, c, d) -> {
      float var4;
      return c * (var4 = t / d) * var4 + b;
   };
   Easing QUAD_OUT = (t, b, c, d) -> {
      float var4;
      return -c * (var4 = t / d) * (var4 - 2.0F) + b;
   };
   Easing QUAD_IN_OUT = (t, b, c, d) -> {
      float var4;
      return (var4 = t / (d / 2.0F)) < 1.0F ? c / 2.0F * var4 * var4 + b : -c / 2.0F * (--var4 * (var4 - 2.0F) - 1.0F) + b;
   };
   Easing CUBIC_IN = (t, b, c, d) -> {
      float var4;
      return c * (var4 = t / d) * var4 * var4 + b;
   };
   Easing CUBIC_OUT = (t, b, c, d) -> {
      float var4;
      return c * ((var4 = t / d - 1.0F) * var4 * var4 + 1.0F) + b;
   };
   Easing CUBIC_IN_OUT = (t, b, c, d) -> {
      float var4;
      float var5;
      return (var4 = t / (d / 2.0F)) < 1.0F ? c / 2.0F * var4 * var4 * var4 + b : c / 2.0F * ((var5 = var4 - 2.0F) * var5 * var5 + 2.0F) + b;
   };
   Easing QUARTIC_IN = (t, b, c, d) -> {
      float var4;
      return c * (var4 = t / d) * var4 * var4 * var4 + b;
   };
   Easing QUARTIC_OUT = (t, b, c, d) -> {
      float var4;
      return -c * ((var4 = t / d - 1.0F) * var4 * var4 * var4 - 1.0F) + b;
   };
   Easing QUARTIC_IN_OUT = (t, b, c, d) -> {
      float var4;
      float var5;
      return (var4 = t / (d / 2.0F)) < 1.0F ? c / 2.0F * var4 * var4 * var4 * var4 + b : -c / 2.0F * ((var5 = var4 - 2.0F) * var5 * var5 * var5 - 2.0F) + b;
   };
   Easing QUINTIC_IN = (t, b, c, d) -> {
      float var4;
      return c * (var4 = t / d) * var4 * var4 * var4 * var4 + b;
   };
   Easing QUINTIC_OUT = (t, b, c, d) -> {
      float var4;
      return c * ((var4 = t / d - 1.0F) * var4 * var4 * var4 * var4 + 1.0F) + b;
   };
   Easing QUINTIC_IN_OUT = (t, b, c, d) -> {
      float var4;
      float var5;
      return (var4 = t / (d / 2.0F)) < 1.0F
         ? c / 2.0F * var4 * var4 * var4 * var4 * var4 + b
         : c / 2.0F * ((var5 = var4 - 2.0F) * var5 * var5 * var5 * var5 + 2.0F) + b;
   };
   Easing SINE_IN = (t, b, c, d) -> -c * (float)eI.cos(t / d * (Math.PI / 2)) + c + b;
   Easing SINE_OUT = (t, b, c, d) -> c * (float)eI.sin(t / d * (Math.PI / 2)) + b;
   Easing SINE_IN_OUT = (t, b, c, d) -> -c / 2.0F * ((float)eI.cos(Math.PI * t / d) - 1.0F) + b;
   Easing EXPO_IN = (t, b, c, d) -> t == 0.0F ? b : c * (float)Math.pow(2.0, 10.0F * (t / d - 1.0F)) + b;
   Easing EXPO_OUT = (t, b, c, d) -> t == d ? b + c : c * (-((float)Math.pow(2.0, -10.0F * t / d)) + 1.0F) + b;
   Easing EXPO_IN_OUT = (t, b, c, d) -> {
      if (t == 0.0F) {
         return b;
      }

      if (t == d) {
         return b + c;
      }

      float var4;
      return (var4 = t / (d / 2.0F)) < 1.0F
         ? c / 2.0F * (float)Math.pow(2.0, 10.0F * (var4 - 1.0F)) + b
         : c / 2.0F * (-((float)Math.pow(2.0, -10.0F * --var4)) + 2.0F) + b;
   };
   Easing CIRC_IN = (t, b, c, d) -> {
      float var4;
      return -c * ((float)Math.sqrt(1.0F - (var4 = t / d) * var4) - 1.0F) + b;
   };
   Easing CIRC_OUT = (t, b, c, d) -> {
      float var4;
      return c * (float)Math.sqrt(1.0F - (var4 = t / d - 1.0F) * var4) + b;
   };
   Easing CIRC_IN_OUT = (t, b, c, d) -> {
      float var4;
      float var5;
      return (var4 = t / (d / 2.0F)) < 1.0F
         ? -c / 2.0F * ((float)Math.sqrt(1.0F - var4 * var4) - 1.0F) + b
         : c / 2.0F * ((float)Math.sqrt(1.0F - (var5 = var4 - 2.0F) * var5) + 1.0F) + b;
   };
   Easing.e ELASTIC_IN = new Easing.f();
   Easing.e ELASTIC_OUT = new Easing.h();
   Easing.e ELASTIC_IN_OUT = new Easing.g();
   Easing.a BACK_IN = new Easing.b();
   Easing.a BACK_OUT = new Easing.d();
   Easing.a BACK_IN_OUT = new Easing.c();
   Easing BOUNCE_OUT = (t, b, c, d) -> {
      if ((t = t / d) < 0.36363637F) {
         return c * (7.5625F * t * t) + b;
      } else if (t < 0.72727275F) {
         float var7;
         return c * (7.5625F * (var7 = t - 0.54545456F) * var7 + 0.75F) + b;
      } else {
         float var4;
         float var5;
         return t < 0.90909094F
            ? c * (7.5625F * (var4 = t - 0.8181818F) * var4 + 0.9375F) + b
            : c * (7.5625F * (var5 = t - 0.95454544F) * var5 + 0.984375F) + b;
      }
   };
   Easing BOUNCE_IN = (t, b, c, d) -> c - BOUNCE_OUT.ease(d - t, 0.0F, c, d) + b;
   Easing BOUNCE_IN_OUT = (t, b, c, d) -> t < d / 2.0F
      ? BOUNCE_IN.ease(t * 2.0F, 0.0F, c, d) * 0.5F + b
      : BOUNCE_OUT.ease(t * 2.0F - d, 0.0F, c, d) * 0.5F + c * 0.5F + b;

   static Easing generate(double x1, double y1, double x2, double y2) {
      return new Easing() {
         @Override
         public float ease(float t, float b, float c, float d) {
            if (d <= 0.0F || t <= 0.0F) {
               return b;
            }

            if (t >= d) {
               return b + c;
            }

            float var5 = t / d;
            float var6 = this.a((float)x1, (float)x2, var5);
            float var7 = this.d(var6, (float)y1, (float)y2);
            return b + c * var7;
         }

         private float a(float x1, float x2, float progress) {
            float var4 = progress;
            byte var5 = 8;
            float var6 = 1.0E-5F;

            for (int var7 = 0; var7 < 8; var7++) {
               float var8 = this.b(var4, x1, x2);
               float var9 = this.c(var4, x1, x2);
               if (Math.abs(var8 - progress) < 1.0E-5F || Math.abs(var9) < 1.0E-6F) {
                  break;
               }

               var4 -= (var8 - progress) / var9;
               var4 = Math.max(0.0F, Math.min(1.0F, var4));
            }

            return var4;
         }

         private float b(float t, float x1, float x2) {
            return 3.0F * (1.0F - t) * (1.0F - t) * t * x1 + 3.0F * (1.0F - t) * t * t * x2 + t * t * t;
         }

         private float c(float t, float x1, float x2) {
            return 3.0F * ((1.0F - t) * (1.0F - 3.0F * t) * x1 + (2.0F * t - 3.0F * t * t) * x2) + 3.0F * t * t;
         }

         private float d(float t, float y1, float y2) {
            return 3.0F * (1.0F - t) * (1.0F - t) * t * y1 + 3.0F * (1.0F - t) * t * t * y2 + t * t * t;
         }
      };
   }

   float ease(float var1, float var2, float var3, float var4);

   abstract class a implements Easing {
      public static final float DEFAULT_OVERSHOOT = 1.70158F;
      private float a;

      public a() {
         this(1.70158F);
      }

      public a(float overshoot) {
         this.a = overshoot;
      }

      @Generated
      public void setOvershoot(float overshoot) {
         this.a = overshoot;
      }

      @Generated
      public float getOvershoot() {
         return this.a;
      }
   }

   class b extends Easing.a {
      public b() {
      }

      public b(float overshoot) {
         super(overshoot);
      }

      @Override
      public float ease(float t, float b, float c, float d) {
         float var5 = this.getOvershoot();
         float var6;
         return c * (var6 = t / d) * var6 * ((var5 + 1.0F) * var6 - var5) + b;
      }
   }

   class c extends Easing.a {
      public c() {
      }

      public c(float overshoot) {
         super(overshoot);
      }

      @Override
      public float ease(float t, float b, float c, float d) {
         float var5 = this.getOvershoot();
         float var6;
         float var7;
         float var8;
         float var9;
         return (var6 = t / (d / 2.0F)) < 1.0F
            ? c / 2.0F * (var6 * var6 * (((var8 = var5 * 1.525F) + 1.0F) * var6 - var8)) + b
            : c / 2.0F * ((var7 = var6 - 2.0F) * var7 * (((var9 = var5 * 1.525F) + 1.0F) * var7 + var9) + 2.0F) + b;
      }
   }

   class d extends Easing.a {
      public d() {
      }

      public d(float overshoot) {
         super(overshoot);
      }

      @Override
      public float ease(float t, float b, float c, float d) {
         float var5 = this.getOvershoot();
         float var6;
         return c * ((var6 = t / d - 1.0F) * var6 * ((var5 + 1.0F) * var6 + var5) + 1.0F) + b;
      }
   }

   abstract class e implements Easing {
      private float a;
      private float b;

      public e(float amplitude, float period) {
         this.a = amplitude;
         this.b = period;
      }

      public e() {
         this(-1.0F, 0.0F);
      }

      @Generated
      public void setAmplitude(float amplitude) {
         this.a = amplitude;
      }

      @Generated
      public void setPeriod(float period) {
         this.b = period;
      }

      @Generated
      public float getAmplitude() {
         return this.a;
      }

      @Generated
      public float getPeriod() {
         return this.b;
      }
   }

   class f extends Easing.e {
      public f(float amplitude, float period) {
         super(amplitude, period);
      }

      public f() {
      }

      @Override
      public float ease(float t, float b, float c, float d) {
         float var5 = this.getAmplitude();
         float var6 = this.getPeriod();
         if (t == 0.0F) {
            return b;
         }

         if ((t = t / d) == 1.0F) {
            return b + c;
         }

         if (var6 == 0.0F) {
            var6 = d * 0.3F;
         }

         float var7 = 0.0F;
         if (var5 < Math.abs(c)) {
            var5 = c;
            var7 = var6 / 4.0F;
         } else {
            var7 = var6 / (float) (Math.PI * 2) * (float)Math.asin(c / var5);
         }

         return -(var5 * (float)Math.pow(2.0, 10.0F * --t) * (float)eI.sin((t * d - var7) * (Math.PI * 2) / var6)) + b;
      }
   }

   class g extends Easing.e {
      public g(float amplitude, float period) {
         super(amplitude, period);
      }

      public g() {
      }

      @Override
      public float ease(float t, float b, float c, float d) {
         float var5 = this.getAmplitude();
         float var6 = this.getPeriod();
         if (t == 0.0F) {
            return b;
         }

         if ((t = t / (d / 2.0F)) == 2.0F) {
            return b + c;
         }

         if (var6 == 0.0F) {
            var6 = d * 0.45000002F;
         }

         float var7 = 0.0F;
         if (var5 < Math.abs(c)) {
            var5 = c;
            var7 = var6 / 4.0F;
         } else {
            var7 = var6 / (float) (Math.PI * 2) * (float)Math.asin(c / var5);
         }

         return t < 1.0F
            ? -0.5F * (var5 * (float)Math.pow(2.0, 10.0F * --t) * (float)eI.sin((t * d - var7) * (Math.PI * 2) / var6)) + b
            : var5 * (float)Math.pow(2.0, -10.0F * --t) * (float)eI.sin((t * d - var7) * (Math.PI * 2) / var6) * 0.5F + c + b;
      }
   }

   class h extends Easing.e {
      public h(float amplitude, float period) {
         super(amplitude, period);
      }

      public h() {
      }

      @Override
      public float ease(float t, float b, float c, float d) {
         float var5 = this.getAmplitude();
         float var6 = this.getPeriod();
         if (t == 0.0F) {
            return b;
         }

         if ((t = t / d) == 1.0F) {
            return b + c;
         }

         if (var6 == 0.0F) {
            var6 = d * 0.3F;
         }

         float var7 = 0.0F;
         if (var5 < Math.abs(c)) {
            var5 = c;
            var7 = var6 / 4.0F;
         } else {
            var7 = var6 / (float) (Math.PI * 2) * (float)Math.asin(c / var5);
         }

         return var5 * (float)Math.pow(2.0, -10.0F * t) * (float)eI.sin((t * d - var7) * (Math.PI * 2) / var6) + c + b;
      }
   }
}
