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
import a.ce;
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
import a.cm;
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

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.function.BooleanSupplier;
import lombok.Generated;
import nesquik.mytheria.systems.setting.SettingsContainer;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.NotNull;

public class cm extends ce {
   private float a;
   private float b;
   private float c;
   private float d;
   private float e;

   public cm(@NotNull SettingsContainer parent, String name, @NotNull BooleanSupplier hideCondition) {
      super(parent, name, hideCondition);
   }

   public cm(@NotNull SettingsContainer parent, String name) {
      super(parent, name);
   }

   public cm firstValue(float firstValue) {
      this.a = firstValue;
      return this;
   }

   public cm secondValue(float secondValue) {
      this.b = secondValue;
      return this;
   }

   public cm min(float min) {
      this.c = min;
      return this;
   }

   public cm max(float max) {
      this.d = max;
      return this;
   }

   public cm step(float step) {
      this.e = step;
      return this;
   }

   @Override
   public JsonElement save() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("first", this.a);
      var1.addProperty("second", this.b);
      return var1;
   }

   @Override
   public void load(JsonElement element) {
      if (element.isJsonObject()) {
         JsonObject var2 = element.getAsJsonObject();
         if (var2.has("first")) {
            this.setFirstValue(var2.get("first").getAsFloat());
         }

         if (var2.has("second")) {
            this.setSecondValue(var2.get("second").getAsFloat());
         }
      }
   }

   public void setFirstValue(float value) {
      float var2 = (float)MathHelper.clamp(Math.round(value * (1.0 / this.e)) / (1.0 / this.e), this.c, this.d);
      if (this.a != var2) {
         this.a = var2;
      }
   }

   public void setSecondValue(float value) {
      float var2 = (float)MathHelper.clamp(Math.round(value * (1.0 / this.e)) / (1.0 / this.e), this.c, this.d);
      if (this.b != var2) {
         this.b = var2;
      }
   }

   @Generated
   public float getFirstValue() {
      return this.a;
   }

   @Generated
   public float getSecondValue() {
      return this.b;
   }

   @Generated
   public float getMin() {
      return this.c;
   }

   @Generated
   public float getMax() {
      return this.d;
   }

   @Generated
   public float getStep() {
      return this.e;
   }

   @Generated
   public void setMin(float min) {
      this.c = min;
   }

   @Generated
   public void setMax(float max) {
      this.d = max;
   }

   @Generated
   public void setStep(float step) {
      this.e = step;
   }
}
