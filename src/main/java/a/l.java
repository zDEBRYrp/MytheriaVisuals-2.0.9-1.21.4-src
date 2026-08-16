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
import a.u;
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
import a.eg;
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
import a.uc.I;
import a.uc.bE;
import a.uc.aG;
import a.uc.dI;
import a.uc.aK;
import a.uc.aJ;
import a.uc.O;
import a.av;
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
import a.t;
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
import a.f;
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
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.commands.Command;
import nesquik.mytheria.systems.commands.ParameterValidator;
import nesquik.mytheria.systems.commands.ValidationResult;
import net.minecraft.text.Text;
import ru.kotopushka.compiler.sdk.annotations.Compile;

public final class l {
   private static final ParameterValidator<String> idValidator = ValidationResult::ok;

   @Compile
   public Command command() {
      List<String> var1 = Mytheria.getInstance().getConfigManager().getConfigFiles().stream().map(t::getFileName).toList();
      return f.begin(
            "config",
            b -> b.aliases("cfg", "кфг", "конфиг")
               .desc("commands.config.description")
               .<String>param(
                  "action",
                  p -> p.validator(
                        text -> l.a.a(text)
                           .<ValidationResult>map(a -> ValidationResult.ok(a))
                           .orElseGet(() -> ValidationResult.error(av.translate("commands.config.invalid_action")))
                     )
                     .suggests(l.a.a())
               )
               .<String>param("id", p -> p.optional().validator(idValidator).suggests(var1))
               .handler(this::a)
         )
         .build();
   }

   @Compile
   private void a(g ctx) {
      l.a var2 = (l.a)ctx.arguments().get(0);
      String var3 = (String)ctx.arguments().get(1);
      var2.b().accept(var3);
   }

   enum a {
      SAVE("save", "create", "add", "сохранить", "ыфму"),
      REMOVE("delete", "remove", "del", "удалить", "вудуеу"),
      LIST("list", "дшые"),
      LOAD("load", "use", "использовать", "дщфв"),
      DIR("dir", "direction");

      private final List<String> a;

      a(String... names) {
         this.a = Arrays.stream(names).map(String::toLowerCase).collect(Collectors.toList());
      }

      @Compile
      Consumer<String> b() {
         return switch (this) {
            case SAVE -> this::b;
            case REMOVE -> s -> {
               if (s != null) {
                  Mytheria.getInstance().getConfigManager().getConfig(s).delete();
               }
            };
            case LIST -> s -> Mytheria.getInstance().getConfigManager().listConfigs();
            case LOAD -> s -> {
               Mytheria.getInstance().getConfigManager().refresh();
               if (s != null && Mytheria.getInstance().getConfigManager().getConfig(s) != null) {
                  t var1 = Mytheria.getInstance().getConfigManager().getConfig(s);
                  var1.load();
               }
            };
            case DIR -> s -> Mytheria.getInstance().getConfigManager().directionConfig();
         };
      }

      @Compile
      private void b(String configName) {
         if (configName != null) {
            u var2 = Mytheria.getInstance().getConfigManager();
            var2.createConfig(configName);
            eg.info(Text.of(av.translate("commands.config.saved", configName)));
         }
      }

      @Compile
      static Optional<l.a> a(String input) {
         String var1 = input.toLowerCase();
         return Arrays.stream(values()).filter(a -> a.a.contains(var1)).findFirst();
      }

      @Compile
      static List<String> a() {
         return Arrays.stream(values()).map(a -> a.a.getFirst()).collect(Collectors.toList());
      }
   }
}
