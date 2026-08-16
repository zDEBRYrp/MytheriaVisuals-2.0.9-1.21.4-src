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
import a.m;
import a.uc.dW;
import a.h;
import a.uc.J;
import a.q;
import a.n;
import a.uc.bW;
import a.p;
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
import a.i;
import a.uc.bE;
import a.uc.aG;
import a.uc.dI;
import a.uc.aK;
import a.uc.aJ;
import a.o;
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
import a.s;
import a.uc.fH;
import a.uc.dU;
import a.uc.dN;
import a.uc.fN;
import a.uc.cZ;
import a.uc.eU;
import a.uc.bJ;

import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import lombok.Generated;
import nesquik.mytheria.systems.commands.Command;
import nesquik.mytheria.systems.commands.ValidationResult;
import ru.kotopushka.compiler.sdk.annotations.Compile;
import ru.kotopushka.compiler.sdk.annotations.Initialization;
import ru.kotopushka.compiler.sdk.annotations.VMProtect;

public class h {
   private final List<Command> a = new ArrayList<>();
   private String b = ".";

   public void register(Command command) {
      this.a.add(command);
   }

   @Compile
   @VMProtect(type = fP.MUTATION)
   @Initialization
   public void initCommands() {
      this.register(new l().command());
      this.register(new n().command());
      this.register(new o().command());
      this.register(new p().command());
      this.register(new q().command());
      this.register(new r().command());
      this.register(new m().command());
      this.register(new k().command());
   }

   public List<Command> commands() {
      return Collections.unmodifiableList(this.a);
   }

   public boolean dispatch(String line) {
      if (!line.startsWith(this.b)) {
         return false;
      }

      String[] var2 = line.substring(this.b.length()).split("\\s+");
      List<String> var3 = Arrays.asList(var2);
      h.a var4 = this.a(var3, null, 0);
      if (var4 == null) {
         return false;
      }

      Command var5 = (Command)var4.command();
      int var6 = (Integer)var4.index();
      if (!var5.executable()) {
         return false;
      }

      List<Object> var7 = this.a(var5, var2, var6);
      if (var7 == null) {
         return true;
      }

      var5.handler().execute(new g(var5, var7));
      return true;
   }

   private h.a<Command, Integer> a(List<String> args, Command parent, int idx) {
      List<Command> var4 = parent == null ? this.a : parent.subcommands();
      if (idx >= args.size()) {
         return this.a(parent, idx - 1);
      }

      String var5 = (String)args.get(idx);

      for (Command var7 : var4) {
         for (String var9 : var7.names()) {
            if (var9.equalsIgnoreCase(var5)) {
               h.a var10 = this.a(args, var7, idx + 1);
               if (var10 != null) {
                  return var10;
               }

               return new h.a<>(var7, idx);
            }
         }
      }

      return this.a(parent, idx - 1);
   }

   private h.a<Command, Integer> a(Command parent, int index) {
      return parent != null ? new h.a<>(parent, index) : null;
   }

   private List<Object> a(Command cmd, String[] tok, int startIdx) {
      List<i<?>> var4 = cmd.parameters();
      ArrayList var5 = new ArrayList();
      int var6 = startIdx + 1;
      int var7 = tok.length;

      for (i<?> var9 : var4) {
         if (var9.vararg()) {
            ArrayList var13 = new ArrayList();

            for (int var11 = var6; var11 < var7; var11++) {
               ValidationResult var12 = var9.validator().validate(tok[var11]);
               if (var12 instanceof ValidationResult.a) {
                  return null;
               }

               var13.add(((ValidationResult.b)var12).value());
            }

            var5.add(var13);
            return var5;
         }

         if (var6 >= var7) {
            if (var9.required()) {
               return null;
            }

            var5.add(null);
         } else {
            ValidationResult var10 = var9.validator().validate(tok[var6]);
            if (var10 instanceof ValidationResult.a) {
               return null;
            }

            var5.add(((ValidationResult.b)var10).value());
            var6++;
         }
      }

      return var5;
   }

   public CompletableFuture<Suggestions> autoComplete(String orig, int cursor) {
      if (orig.startsWith(this.b) && cursor >= this.b.length()) {
         String var3 = orig.substring(0, Math.min(cursor, orig.length()));
         String var4 = var3.substring(this.b.length());
         boolean var5 = var4.endsWith(" ");
         String var6 = var4.trim();
         String[] var7 = var6.isEmpty() ? new String[0] : var6.split("\\s+");
         List<Command> var8 = this.a;
         Command var9 = null;
         int var10 = 0;

         for (int var11 = 0; var11 < var7.length; var11++) {
            Command var12 = this.a(var8, var7[var11]);
            if (var12 == null) {
               break;
            }

            var9 = var12;
            var10 = var11 + 1;
            var8 = var12.subcommands();
            if (var8.isEmpty()) {
               break;
            }
         }

         int var22 = var7.length - var10;
         String var23 = !var5 && var7.length > 0 ? var7[var7.length - 1] : "";
         int var13 = Math.max(this.b.length(), orig.lastIndexOf(32, Math.max(0, cursor - 1)) + 1);
         StringRange var14 = StringRange.between(var13, cursor);
         ArrayList var15 = new ArrayList();
         if (var9 == null) {
            String var16 = var23.toLowerCase();

            for (Command var18 : var8) {
               String var19 = var18.names().getFirst();
               if (var19.toLowerCase().startsWith(var16)) {
                  var15.add(new Suggestion(var14, var19));
               }
            }
         } else if (!var8.isEmpty() && var22 == 0) {
            String var25 = var23.toLowerCase();

            for (Command var29 : var8) {
               String var31 = var29.names().getFirst();
               if (var31.toLowerCase().startsWith(var25)) {
                  var15.add(new Suggestion(var14, var31));
               }
            }
         } else {
            List<i<?>> var24 = var9.parameters();
            int var26 = var22 - (var5 ? 0 : 1);
            if (var26 < 0) {
               var26 = 0;
            }

            i<?> var28 = null;
            if (var26 >= var24.size()) {
               if (!var24.isEmpty() && ((i<?>)var24.getLast()).vararg()) {
                  var28 = (i<?>)var24.getLast();
               }
            } else {
               var28 = (i<?>)var24.get(var26);
            }

            if (var28 != null) {
               String var30 = var23.toLowerCase();

               for (String var21 : var28.validator().suggestions(var30)) {
                  var15.add(new Suggestion(var14, var21));
               }
            }
         }

         return !var15.isEmpty() ? CompletableFuture.completedFuture(new Suggestions(var14, var15)) : Suggestions.empty();
      } else {
         return Suggestions.empty();
      }
   }

   private Command a(List<Command> pool, String token) {
      for (Command var4 : pool) {
         for (String var6 : var4.names()) {
            if (var6.equalsIgnoreCase(token)) {
               return var4;
            }
         }
      }

      return null;
   }

   @Generated
   public String getPrefix() {
      return this.b;
   }

   @Generated
   public void setPrefix(String prefix) {
      this.b = prefix;
   }

   record a<T, U>(T a, U b) {

      a(T a, U b) {
         this.a = (T)a;
         this.b = (U)b;
      }

      public T command() {
         return this.a;
      }

      public U index() {
         return this.b;
      }
   }
}
