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
import a.cn;
import a.l;
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
import a.m;
import a.uc.dW;
import a.h;
import a.j;
import a.uc.Q;
import a.uc.N;
import a.uc.bW;
import a.uc.P;
import a.uc.fJ;
import a.v;
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
import a.k;
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

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.BooleanSupplier;
import lombok.Generated;
import nesquik.mytheria.systems.setting.SettingsContainer;
import nesquik.mytheria.utility.animation.base.Easing;
import org.jetbrains.annotations.NotNull;

public class cn extends ce {
   private final List<cn.a> a = new ArrayList<>();
   private List<cn.a> b = new ArrayList<>();
   private boolean c;
   private int d;

   public cn(@NotNull SettingsContainer parent, String name, String description, @NotNull BooleanSupplier hideCondition) {
      super(parent, name, hideCondition);
   }

   public cn(@NotNull SettingsContainer parent, String name, @NotNull BooleanSupplier hideCondition) {
      super(parent, name, hideCondition);
   }

   public cn(@NotNull SettingsContainer parent, String name, String description) {
      super(parent, name);
   }

   public cn(@NotNull SettingsContainer parent, String name) {
      super(parent, name);
   }

   public cn draggable() {
      this.c = true;
      return this;
   }

   public cn min(int min) {
      this.d = Math.max(0, min);
      return this;
   }

   public void add(cn.a value) {
      this.a.add(value);
   }

   public void select(cn.a value) {
      if (!this.b.contains(value)) {
         this.b.add(value);
      }
   }

   @Override
   public JsonElement save() {
      JsonObject var1 = new JsonObject();
      JsonArray var2 = new JsonArray();

      for (cn.a var4 : this.b) {
         var2.add(new JsonPrimitive(var4.getName()));
      }

      var1.add("selected", var2);
      JsonArray var6 = new JsonArray();

      for (cn.a var5 : this.a) {
         var6.add(new JsonPrimitive(var5.getName()));
      }

      var1.add("order", var6);
      return var1;
   }

   @Override
   public void load(JsonElement element) {
      this.b.clear();
      if (element.isJsonObject()) {
         JsonObject var2 = element.getAsJsonObject();
         if (var2.has("order")) {
            JsonArray var3 = var2.getAsJsonArray("order");
            ArrayList var4 = new ArrayList();

            for (JsonElement var6 : var3) {
               String var7 = var6.getAsString();
               this.a.stream().filter(valuex -> valuex.getName().equalsIgnoreCase(var7)).findFirst().ifPresent(var4::add);
            }

            for (cn.a var17 : this.a) {
               if (!var4.contains(var17)) {
                  var4.add(var17);
               }
            }

            this.a.clear();
            this.a.addAll(var4);
         }

         if (var2.has("selected")) {
            for (JsonElement var13 : var2.getAsJsonArray("selected")) {
               String var16 = var13.getAsString();
               this.a.stream().filter(valuex -> valuex.getName().equalsIgnoreCase(var16)).findFirst().ifPresent(this.b::add);
            }
         }
      } else if (element.isJsonArray()) {
         for (JsonElement var11 : element.getAsJsonArray()) {
            String var14 = var11.getAsString();
            this.a.stream().filter(valuex -> valuex.getName().equalsIgnoreCase(var14)).findFirst().ifPresent(this.b::add);
         }
      }

      for (cn.a var12 : this.a) {
         if (var12.isAlwaysEnabled() && !this.b.contains(var12)) {
            this.b.add(var12);
         }
      }

      if (this.b.size() < this.d) {
         this.a.stream().filter(v -> !this.b.contains(v)).limit(this.d - this.b.size()).forEach(this.b::add);
      }
   }

   @Generated
   public List<cn.a> getValues() {
      return this.a;
   }

   @Generated
   public List<cn.a> getSelectedValues() {
      return this.b;
   }

   @Generated
   public boolean isDraggable() {
      return this.c;
   }

   @Generated
   public int getMin() {
      return this.d;
   }

   public void setSelectedValues(List<cn.a> selectedValues) {
      this.b = selectedValues;
   }

   @Generated
   public void setDraggable(boolean draggable) {
      this.c = draggable;
   }

   @Generated
   public void setMin(int min) {
      this.d = min;
   }

   public static class a {
      private final cn a;
      private final String b;
      private final String c;
      private final dZ d = new dZ(300L, Easing.FIGMA_EASE_IN_OUT);
      private final dZ e = new dZ(300L, Easing.FIGMA_EASE_IN_OUT);
      private final dZ f = new dZ(300L, Easing.BAKEK);
      private float g;
      private boolean h;
      private final BooleanSupplier i;
      private fA j;
      private fA k;
      private fA l;
      private boolean m;

      public a(cn parent, String name) {
         this(parent, name, "", () -> false);
      }

      public a(cn parent, String name, String description) {
         this(parent, name, description, () -> false);
      }

      public a(cn parent, String name, String description, BooleanSupplier hideCondition) {
         this.a = parent;
         this.b = name;
         this.c = description;
         this.i = hideCondition;
         parent.add(this);
      }

      public boolean isHidden() {
         return this.i != null && this.i.getAsBoolean();
      }

      public cn.a select() {
         if (!this.a.getSelectedValues().contains(this)) {
            this.a.getSelectedValues().add(this);
         }

         return this;
      }

      public cn.a alwaysEnabled() {
         this.h = true;
         this.a.select(this);
         return this;
      }

      public cn.a toggle() {
         if (this.h) {
            return this;
         }

         if (this.a.getSelectedValues().contains(this)) {
            if (this.a.getSelectedValues().size() > this.a.getMin()) {
               this.a.getSelectedValues().remove(this);
            }
         } else {
            this.a.getSelectedValues().add(this);
         }

         return this;
      }

      public boolean isSelected() {
         return this.a.getSelectedValues().contains(this);
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
            cn.a var2 = (cn.a)obj;
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
      public cn getParent() {
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
      public dZ getYAnim() {
         return this.f;
      }

      @Generated
      public float getYFactor() {
         return this.g;
      }

      @Generated
      public boolean isAlwaysEnabled() {
         return this.h;
      }

      @Generated
      public BooleanSupplier getHideCondition() {
         return this.i;
      }

      @Generated
      public fA getEnablePenis() {
         return this.j;
      }

      @Generated
      public fA getDisablePenis() {
         return this.k;
      }

      @Generated
      public fA getCurrentPenis() {
         return this.l;
      }

      @Generated
      public boolean isLastState() {
         return this.m;
      }

      @Generated
      public void setYFactor(float yFactor) {
         this.g = yFactor;
      }

      @Generated
      public void setAlwaysEnabled(boolean alwaysEnabled) {
         this.h = alwaysEnabled;
      }

      @Generated
      public void setEnablePenis(fA enablePenis) {
         this.j = enablePenis;
      }

      @Generated
      public void setDisablePenis(fA disablePenis) {
         this.k = disablePenis;
      }

      @Generated
      public void setCurrentPenis(fA currentPenis) {
         this.l = currentPenis;
      }

      @Generated
      public void setLastState(boolean lastState) {
         this.m = lastState;
      }
   }
}
