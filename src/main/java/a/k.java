package a;
import a.uc.B;
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
import a.eg;
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
import a.ej;
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

import java.lang.reflect.Field;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.commands.Command;
import nesquik.mytheria.systems.commands.ValidationResult;
import nesquik.mytheria.systems.modules.Module;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.lwjgl.glfw.GLFW;
import ru.kotopushka.compiler.sdk.annotations.Compile;

public class k {
   @Compile
   public Command command() {
      List<String> var1 = Mytheria.getInstance()
         .getModuleManager()
         .getModules()
         .stream()
         .filter(module -> !module.isHidden())
         .map(module -> module.getName().replace(" ", ""))
         .toList();
      List<String> var2 = this.a();
      return f.begin("bind", commandBuilder -> commandBuilder.aliases("binds", "бинд").desc("Бинд на модуль"))
         .param("action", p -> p.literal("add", "delete", "remove", "create", "list"))
         .<Module>param("module", p -> p.optional().validator(j.MODULE).suggests(var1))
         .param(
            "key",
            p -> p.optional()
               .validator(text -> (ValidationResult)(text.isBlank() ? ValidationResult.error("key is empty") : ValidationResult.ok(text)))
               .suggests(var2)
         )
         .handler(this::a)
         .build();
   }

   @Compile
   private void a(g context) {
      String var2 = (String)context.arguments().getFirst();
      Module var3 = (Module)context.arguments().get(1);
      String var4 = (String)context.arguments().get(2);
      if (var2.equalsIgnoreCase("list")) {
         List var5 = Mytheria.getInstance().getModuleManager().getModules().stream().filter(mx -> mx.getKey() != -1).toList();
         if (var5.isEmpty()) {
            eg.info(Text.of("Список биндов пуст"));
         } else {
            eg.info(Text.of("Список биндов:"));

            for (int var6 = 0; var6 < var5.size(); var6++) {
               Module var7 = (Module)var5.get(var6);
               eg.info(
                  Text.of(
                     Formatting.GRAY
                        + "["
                        + (var6 + 1)
                        + "] "
                        + Formatting.WHITE
                        + var7.getName()
                        + Formatting.GRAY
                        + " ("
                        + ej.getKeyName(var7.getKey())
                        + ")"
                  )
               );
            }
         }
      } else if (var3 == null) {
         eg.error(Text.of("Модуль не указан"));
      } else if (!var2.equalsIgnoreCase("add") && !var2.equalsIgnoreCase("create")) {
         if (var2.equalsIgnoreCase("delete") || var2.equalsIgnoreCase("remove")) {
            var3.setKey(-1);
            eg.info(Text.of("Бинд удален с модуля " + var3.getName()));
         }
      } else {
         if (var4 == null) {
            eg.error(Text.of("Клавиша не указана"));
            return;
         }

         int var8 = this.a(var4);
         if (var8 == -1) {
            eg.error(Text.of("Неизвестная клавиша: " + var4));
            return;
         }

         var3.setKey(var8);
         eg.info(Text.of("Бинд установлен на клавишу " + ej.getKeyName(var8)));
      }
   }

   private int a(String input) {
      if (input != null && !input.isBlank()) {
         input = input.toUpperCase(Locale.ROOT).replace(" ", "_");

         try {
            return (Integer)GLFW.class.getField("GLFW_KEY_" + input).get(null);
         } catch (Exception var3) {
            return -1;
         }
      } else {
         return -1;
      }
   }

   @Compile
   private List<String> a() {
      return Stream.of(GLFW.class.getFields())
         .map(Field::getName)
         .filter(name -> name.startsWith("GLFW_KEY_"))
         .map(name -> name.substring("GLFW_KEY_".length()))
         .filter(name -> !name.matches("LAST|UNKNOWN|WORLD_\\d+"))
         .collect(Collectors.toList());
   }
}
