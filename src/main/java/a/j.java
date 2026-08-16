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
import a.uc.M;
import a.uc.dW;
import a.uc.H;
import a.j;
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
import a.uc.F;
import a.uc.cQ;
import a.uc.dQ;
import a.uc.dK;
import a.uc.aA;
import a.uc.eZ;
import a.s;
import a.uc.fH;
import a.uc.dU;
import a.uc.dN;
import a.uc.fN;
import a.uc.cZ;
import a.uc.eU;
import a.uc.bJ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.commands.ParameterValidator;
import nesquik.mytheria.systems.commands.ValidationResult;
import nesquik.mytheria.systems.modules.Module;

public class j<T> {
   private final String a;
   private boolean b = true;
   private boolean c = false;
   private ParameterValidator<T> d;
   List<String> e;
   public static final ParameterValidator<Integer> INTEGER = text -> {
      try {
         return ValidationResult.ok(Integer.parseInt(text));
      } catch (NumberFormatException var2) {
         return ValidationResult.error("'" + text + "' is not a number");
      }
   };
   public static final ParameterValidator<Module> MODULE = text -> {
      try {
         Module var1 = Mytheria.getInstance().getModuleManager().getModule(text);
         return var1.isHidden() ? ValidationResult.error("Module with name '%s' was not found".formatted(text)) : ValidationResult.ok(var1);
      } catch (aI var2) {
         return ValidationResult.error("Module with name '%s' was not found".formatted(text));
      }
   };

   private j(String name) {
      this.a = name;
   }

   public static <T> j<T> create(String name) {
      return new j<>(name);
   }

   public j<T> optional() {
      this.b = false;
      return this;
   }

   public j<T> vararg() {
      this.c = true;
      return this;
   }

   public j<T> validator(ParameterValidator<T> validator) {
      this.d = validator;
      return this;
   }

   public void suggests(String... suggestions) {
      this.e = List.of(suggestions[0]);
   }

   public void suggests(List<String> suggestions) {
      this.e = suggestions;
   }

   public j<T> literal(String... literals) {
      final String var2 = Arrays.stream(literals).map(s -> "'" + s + "'").collect(Collectors.joining(", "));
      this.d = new ParameterValidator<T>() {
         @Override
         public ValidationResult validate(String text) {
            for (String var5 : literals) {
               if (var5.equalsIgnoreCase(text)) {
                  return ValidationResult.ok(text);
               }
            }

            return ValidationResult.error("Expected one of: " + var2);
         }

         @Override
         public List<String> suggestions(String partial) {
            return Arrays.stream(literals).filter(l -> l.toLowerCase().startsWith(partial.toLowerCase())).toList();
         }
      };
      this.e = List.of(literals);
      return this;
   }

   public i<T> build() {
      ParameterValidator var1 = this.d;
      if (this.e != null) {
         final ParameterValidator var2 = var1;
         var1 = new ParameterValidator<T>() {
            @Override
            public ValidationResult validate(String text) {
               return var2.validate(text);
            }

            @Override
            public List<String> suggestions(String partial) {
               String var2x = partial.toLowerCase();
               return j.this.e.stream().filter(s -> s.toLowerCase().startsWith(var2x)).toList();
            }
         };
      }

      return new i<>(this.a, this.b, this.c, var1);
   }
}
