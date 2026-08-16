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
import a.g;
import a.uc.fD;
import a.uc.eX;
import a.uc.Z;
import a.uc.bS;
import a.uc.aO;
import a.uc.cE;
import a.uc.X;
import a.fc;
import a.at;
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
import a.ch;
import a.uc.bG;
import a.fb;
import a.fa;
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

import java.util.Map;
import java.util.Set;

public class fa {
   private final char[] a;
   private final int b;
   private final Map<String, eO> c;
   private final Map<String, eQ> d;
   private final Set<String> e;
   private final boolean f;
   private int g = 0;
   private eZ h;

   public fa(String expression, Map<String, eO> userFunctions, Map<String, eQ> userOperators, Set<String> variableNames, boolean implicitMultiplication) {
      this.a = expression.trim().toCharArray();
      this.b = this.a.length;
      this.c = userFunctions;
      this.d = userOperators;
      this.e = variableNames;
      this.f = implicitMultiplication;
   }

   public fa(String expression, Map<String, eO> userFunctions, Map<String, eQ> userOperators, Set<String> variableNames) {
      this.a = expression.trim().toCharArray();
      this.b = this.a.length;
      this.c = userFunctions;
      this.d = userOperators;
      this.e = variableNames;
      this.f = true;
   }

   public boolean hasNext() {
      return this.a.length > this.g;
   }

   public eZ nextToken() {
      char var1 = this.a[this.g];

      while (Character.isWhitespace(var1)) {
         var1 = this.a[++this.g];
      }

      if (!Character.isDigit(var1) && var1 != '.') {
         if (this.a(var1)) {
            return this.a();
         }

         if (this.b(var1)) {
            if (this.h != null && this.f && this.h.getType() != 2 && this.h.getType() != 4 && this.h.getType() != 3 && this.h.getType() != 7) {
               this.h = new eY(eR.getBuiltinOperator('*', 2));
               return this.h;
            } else {
               return this.a(true);
            }
         } else if (this.c(var1)) {
            return this.a(false);
         } else if (eQ.isAllowedOperatorChar(var1)) {
            return this.d(var1);
         } else if (!isAlphabetic(var1) && var1 != '_') {
            throw new IllegalArgumentException("Unable to parse char '" + var1 + "' (Code:" + var1 + ") at [" + this.g + "]");
         } else if (this.h != null && this.f && this.h.getType() != 2 && this.h.getType() != 4 && this.h.getType() != 3 && this.h.getType() != 7) {
            this.h = new eY(eR.getBuiltinOperator('*', 2));
            return this.h;
         } else {
            return this.b();
         }
      } else {
         if (this.h != null) {
            if (this.h.getType() == 1) {
               throw new IllegalArgumentException("Unable to parse char '" + var1 + "' (Code:" + var1 + ") at [" + this.g + "]");
            }

            if (this.f && this.h.getType() != 2 && this.h.getType() != 4 && this.h.getType() != 3 && this.h.getType() != 7) {
               this.h = new eY(eR.getBuiltinOperator('*', 2));
               return this.h;
            }
         }

         return this.e(var1);
      }
   }

   private eZ a() {
      this.g++;
      this.h = new eT();
      return this.h;
   }

   private boolean a(char ch) {
      return ch == ',';
   }

   private eZ a(boolean open) {
      if (open) {
         this.h = new eX();
      } else {
         this.h = new eU();
      }

      this.g++;
      return this.h;
   }

   private boolean b(char ch) {
      return ch == '(' || ch == '{' || ch == '[';
   }

   private boolean c(char ch) {
      return ch == ')' || ch == '}' || ch == ']';
   }

   private eZ b() {
      int var1 = this.g;
      int var2 = 1;
      eZ var3 = null;
      int var4 = 1;
      if (this.a(var1)) {
         this.g++;
      }

      for (int var5 = var1 + var4 - 1; !this.a(var5) && isVariableOrFunctionCharacter(this.a[var5]); var5 = var1 + var4 - 1) {
         String var6 = new String(this.a, var1, var4);
         if (this.e != null && this.e.contains(var6)) {
            var2 = var4;
            var3 = new fc(var6);
         } else {
            eO var7 = this.a(var6);
            if (var7 != null) {
               var2 = var4;
               var3 = new eV(var7);
            }
         }

         var4++;
      }

      if (var3 == null) {
         throw new fb(new String(this.a), this.g, var4);
      }

      this.g += var2;
      this.h = var3;
      return this.h;
   }

   private eO a(String name) {
      eO var2 = null;
      if (this.c != null) {
         var2 = this.c.get(name);
      }

      if (var2 == null) {
         var2 = eP.getBuiltinFunction(name);
      }

      return var2;
   }

   private eZ d(char firstChar) {
      int var2 = this.g;
      int var3 = 1;
      StringBuilder var4 = new StringBuilder();
      eQ var5 = null;
      var4.append(firstChar);

      while (!this.a(var2 + var3) && eQ.isAllowedOperatorChar(this.a[var2 + var3])) {
         var4.append(this.a[var2 + var3++]);
      }

      while (var4.length() > 0) {
         eQ var6 = this.b(var4.toString());
         if (var6 != null) {
            var5 = var6;
            break;
         }

         var4.setLength(var4.length() - 1);
      }

      this.g = this.g + var4.length();
      this.h = new eY(var5);
      return this.h;
   }

   private eQ b(String symbol) {
      eQ var2 = null;
      if (this.d != null) {
         var2 = this.d.get(symbol);
      }

      if (var2 == null && symbol.length() == 1) {
         byte var3 = 2;
         if (this.h == null) {
            var3 = 1;
         } else {
            int var4 = this.h.getType();
            if (var4 != 4 && var4 != 7) {
               if (var4 == 2) {
                  eQ var5 = ((eY)this.h).getOperator();
                  if (var5.getNumOperands() == 2 || var5.getNumOperands() == 1 && !var5.isLeftAssociative()) {
                     var3 = 1;
                  }
               }
            } else {
               var3 = 1;
            }
         }

         var2 = eR.getBuiltinOperator(symbol.charAt(0), var3);
      }

      return var2;
   }

   private eZ e(char firstChar) {
      int var2 = this.g;
      int var3 = 1;
      this.g++;
      if (this.a(var2 + var3)) {
         this.h = new eW(Double.parseDouble(String.valueOf(firstChar)));
         return this.h;
      }

      while (!this.a(var2 + var3) && a(this.a[var2 + var3], this.a[var2 + var3 - 1] == 'e' || this.a[var2 + var3 - 1] == 'E')) {
         var3++;
         this.g++;
      }

      if (this.a[var2 + var3 - 1] == 'e' || this.a[var2 + var3 - 1] == 'E') {
         var3--;
         this.g--;
      }

      this.h = new eW(this.a, var2, var3);
      return this.h;
   }

   private static boolean a(char ch, boolean lastCharE) {
      return Character.isDigit(ch) || ch == '.' || ch == 'e' || ch == 'E' || lastCharE && (ch == '-' || ch == '+');
   }

   public static boolean isAlphabetic(int codePoint) {
      return Character.isLetter(codePoint);
   }

   public static boolean isVariableOrFunctionCharacter(int codePoint) {
      return isAlphabetic(codePoint) || Character.isDigit(codePoint) || codePoint == 95 || codePoint == 46;
   }

   private boolean a(int offset) {
      return this.b <= offset;
   }
}
