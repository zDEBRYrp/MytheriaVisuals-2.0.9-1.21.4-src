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
import a.cr;
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
import a.e;
import a.uc.dP;
import a.uc.Y;
import a.uc.cM;
import a.uc.eQ;
import a.uc.eV;
import a.cs;
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

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.StreamSupport;
import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;

public class cr implements IMinecraft {
   @Nullable
   private Entity a = null;
   private final List<String> b = new ArrayList<>();

   public void update(cs targetSettings) {
      this.a = this.getBestTarget(targetSettings);
   }

   public void addTarget(String name) {
      if (Mytheria.getInstance().getFriendManager().listFriends().contains(name)) {
         eg.error(Text.of(av.translate("commands.target.friend_error")));
      } else if (this.b.contains(name)) {
         eg.error(Text.of(av.translate("commands.target.already_exists", name)));
      } else if (name.equalsIgnoreCase(mc.getSession().getUsername())) {
         eg.error(Text.of(av.translate("commands.target.self_error")));
      } else {
         this.b.add(name);
         eg.info(Text.of(av.translate("commands.target.added", name)));
      }
   }

   public void removeTarget(String name) {
      if (!this.b.contains(name)) {
         eg.error(Text.of(av.translate("commands.target.not_found", name)));
      } else {
         this.b.remove(name);
         eg.info(Text.of(av.translate("commands.target.removed", name)));
      }
   }

   public void clearTarget() {
      if (this.b.isEmpty()) {
         eg.info(Text.of(av.translate("commands.target.empty")));
      } else {
         this.b.clear();
         eg.info(Text.of(av.translate("commands.target.cleared")));
      }
   }

   public void listTarget() {
      if (this.b.isEmpty()) {
         eg.info(Text.of(av.translate("commands.target.empty")));
      } else {
         for (int var1 = 0; var1 < this.b.size(); var1++) {
            String var2 = this.b.get(var1);
            eg.info(Text.of(String.format(av.translate("commands.target.list_entry"), var1 + 1, var2)));
         }
      }
   }

   @Nullable
   public Entity getBestTarget(cs settings) {
      if (mc.world == null) {
         return null;
      }

      Comparator<Entity> var2 = Comparator.<Entity, Boolean>comparing(e -> !this.b.contains(e.getName().getString())).thenComparing(settings.getTargetComparator());
      return StreamSupport.<Entity>stream(mc.world.getEntities().spliterator(), false).filter(settings::isEntityValid).min(var2).orElse(null);
   }

   public void reset() {
      this.a = null;
   }

   public boolean isTarget(String name) {
      return this.b.contains(name);
   }

   public LivingEntity getLivingTarget() {
      return Mytheria.getInstance().getTargetManager().getCurrentTarget() instanceof LivingEntity var1 ? var1 : null;
   }

   @Nullable
   @Generated
   public Entity getCurrentTarget() {
      return this.a;
   }

   @Generated
   public List<String> getTarget() {
      return this.b;
   }
}
