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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import nesquik.mytheria.systems.commands.Command;
import nesquik.mytheria.systems.commands.CommandHandler;

public class f {
   private final List<String> a = new ArrayList<>();
   private String b = "";
   private final List<i<?>> c = new ArrayList<>();
   private final List<Command> d = new ArrayList<>();
   private boolean e = true;
   private CommandHandler f;

   private f(String name) {
      this.a.add(name);
   }

   public static f begin(String name) {
      return new f(name);
   }

   public static f begin(String name, Consumer<f> cfg) {
      f var2 = new f(name);
      cfg.accept(var2);
      return var2;
   }

   public f aliases(String... a) {
      this.a.addAll(Arrays.asList(a));
      return this;
   }

   public f desc(String d) {
      this.b = d;
      return this;
   }

   public <T> f param(String name, Consumer<j<T>> cfg) {
      j var3 = j.create(name);
      cfg.accept(var3);
      this.c.add(var3.build());
      return this;
   }

   public f subcommand(Command c) {
      this.d.add(c);
      return this;
   }

   public f hub() {
      this.e = false;
      return this;
   }

   public f handler(CommandHandler h) {
      this.f = h;
      return this;
   }

   public Command build() {
      if (this.e && this.f == null) {
         throw new IllegalStateException("Executable command requires handler");
      } else if (!this.e && this.f != null) {
         throw new IllegalStateException("Hub command cannot have handler");
      } else {
         return new f.a(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }

   record a(List<String> a, String b, List<i<?>> c, List<Command> d, boolean e, CommandHandler f) implements Command {

      a(List<String> a, String b, List<i<?>> c, List<Command> d, boolean e, CommandHandler f) {
         this.a = a;
         this.b = b;
         this.c = c;
         this.d = d;
         this.e = e;
         this.f = f;
      }

      @Override
      public List<String> names() {
         return this.a;
      }

      @Override
      public String description() {
         return this.b;
      }

      @Override
      public List<i<?>> parameters() {
         return this.c;
      }

      @Override
      public List<Command> subcommands() {
         return this.d;
      }

      @Override
      public boolean executable() {
         return this.e;
      }

      @Override
      public CommandHandler handler() {
         return this.f;
      }
   }
}
