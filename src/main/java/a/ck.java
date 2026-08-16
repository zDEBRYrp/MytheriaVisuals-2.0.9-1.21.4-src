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
import a.ck;
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
import a.j;
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
import a.i;
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

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.function.BooleanSupplier;
import lombok.Generated;
import nesquik.mytheria.systems.setting.SettingsContainer;
import nesquik.mytheria.utility.animation.base.Easing;
import org.jetbrains.annotations.NotNull;

public class ck extends ce {
   private final List<ck.a> values = new ArrayList<>();
   private ck.a b;

   public ck(@NotNull SettingsContainer parent, String name, String description, @NotNull BooleanSupplier hideCondition) {
      super(parent, name, hideCondition);
   }

   public ck(@NotNull SettingsContainer parent, String name, @NotNull BooleanSupplier hideCondition) {
      super(parent, name, hideCondition);
   }

   public ck(@NotNull SettingsContainer parent, String name, String description) {
      super(parent, name);
   }

   public ck(@NotNull SettingsContainer parent, String name) {
      super(parent, name);
   }

   public void addMode(ck.a mode) {
      this.values.add(mode);
      if (this.b == null) {
         this.b = mode;
      }
   }

   public boolean is(ck.a otherValue) {
      return this.b == otherValue;
   }

   @Override
   public JsonElement save() {
      return this.b == null ? new JsonPrimitive("") : new JsonPrimitive(this.b.getName());
   }

   public ck.a getRandomEnabledElement() {
      List<ck.a> var1 = this.values.stream().filter(ck.a::isSelected).toList();
      if (!var1.isEmpty()) {
         Random var2 = new Random();
         return (ck.a)var1.get(var2.nextInt(var1.size()));
      } else {
         return null;
      }
   }

   @Override
   public void load(JsonElement element) {
      String var2 = element.getAsString();

      for (ck.a var4 : this.values) {
         if (var4.getName().equalsIgnoreCase(var2)) {
            this.b = var4;
            break;
         }
      }
   }

   @Generated
   public List<ck.a> getValues() {
      return this.values;
   }

   @Generated
   public ck.a getValue() {
      return this.b;
   }

   public void setValue(ck.a value) {
      if (this.b != value) {
         this.b = value;
      }
   }

   public static class a {
      private final ck a;
      private final String b;
      private final String c;
      private final dZ d = new dZ(300L, Easing.FIGMA_EASE_IN_OUT);
      private final dZ e = new dZ(300L, Easing.FIGMA_EASE_IN_OUT);
      private final BooleanSupplier f;
      private fA g;
      private fA h;
      private fA i;
      private boolean j;

      public a(ck parent, String name) {
         this(parent, name, "", () -> false);
      }

      public a(ck parent, String name, String description) {
         this(parent, name, description, () -> false);
      }

      public a(ck parent, String name, String description, BooleanSupplier hideCondition) {
         this.a = parent;
         this.b = name;
         this.c = description;
         this.f = hideCondition;
         parent.addMode(this);
      }

      public boolean isHidden() {
         return this.f != null && this.f.getAsBoolean();
      }

      public ck.a select() {
         this.a.setValue(this);
         return this;
      }

      public boolean isSelected() {
         return this.a.getValue() == this;
      }

      @Override
      public String toString() {
         return this.b;
      }

      @Override
      public boolean equals(Object obj) {
         if (obj == this) {
            return true;
         } else if (obj != null && obj.getClass() == this.getClass()) {
            ck.a var2 = (ck.a)obj;
            return Objects.equals(this.a, var2.a) && Objects.equals(this.b, var2.b) && Objects.equals(this.c, var2.c);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(this.a, this.b, this.c);
      }

      @Generated
      public void setEnablePenis(fA enablePenis) {
         this.g = enablePenis;
      }

      @Generated
      public void setDisablePenis(fA disablePenis) {
         this.h = disablePenis;
      }

      @Generated
      public void setCurrentPenis(fA currentPenis) {
         this.i = currentPenis;
      }

      @Generated
      public void setLastState(boolean lastState) {
         this.j = lastState;
      }

      @Generated
      public ck getParent() {
         return this.a;
      }

      @Generated
      public String getName() {
         return this.b;
      }

      @Generated
      public String getDescription() {
         return this.c;
      }

      @Generated
      public dZ getHoverAnimation() {
         return this.d;
      }

      @Generated
      public dZ getActiveAnimation() {
         return this.e;
      }

      @Generated
      public BooleanSupplier getHideCondition() {
         return this.f;
      }

      @Generated
      public fA getEnablePenis() {
         return this.g;
      }

      @Generated
      public fA getDisablePenis() {
         return this.h;
      }

      @Generated
      public fA getCurrentPenis() {
         return this.i;
      }

      @Generated
      public boolean isLastState() {
         return this.j;
      }
   }
}
