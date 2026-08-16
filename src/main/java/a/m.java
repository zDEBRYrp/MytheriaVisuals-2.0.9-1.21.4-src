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
import a.m;
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
import a.fp;
import a.uc.eM;
import a.uc.cT;
import a.uc.bA;
import a.uc.eS;
import a.uc.cR;
import a.an;
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
import a.cb;
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

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.commands.Command;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Vec3d;

public class m implements IMinecraft {
   private OtherClientPlayerEntity fakePlayer;
   private float b = 0.0F;
   private float c = 0.0F;
   private final EventListener<C> d = event -> {
      if (this.fakePlayer != null && event.getEntity() == this.fakePlayer && this.fakePlayer.hurtTime == 0) {
         mc.world
            .playSound(
               mc.player,
               this.fakePlayer.getX(),
               this.fakePlayer.getY(),
               this.fakePlayer.getZ(),
               SoundEvents.ENTITY_PLAYER_HURT,
               SoundCategory.PLAYERS,
               1.0F,
               1.0F
            );
         if (mc.player.fallDistance > 0.0F) {
            mc.world
               .playSound(
                  mc.player,
                  this.fakePlayer.getX(),
                  this.fakePlayer.getY(),
                  this.fakePlayer.getZ(),
                  SoundEvents.ENTITY_PLAYER_ATTACK_CRIT,
                  SoundCategory.PLAYERS,
                  1.0F,
                  1.0F
               );
         } else {
            mc.world
               .playSound(
                  mc.player,
                  this.fakePlayer.getX(),
                  this.fakePlayer.getY(),
                  this.fakePlayer.getZ(),
                  SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP,
                  SoundCategory.PLAYERS,
                  1.0F,
                  1.0F
               );
         }

         this.fakePlayer.onDamaged(mc.world.getDamageSources().generic());
         this.fakePlayer.setHealth(this.fakePlayer.getHealth() + this.fakePlayer.getAbsorptionAmount() - 1.0F);
         if (this.fakePlayer.isDead()) {
            this.fakePlayer.setHealth(10.0F);
            new EntityStatusS2CPacket(this.fakePlayer, (byte)35).apply(mc.player.networkHandler);
         }
      }
   };
   private final EventListener<an> e = event -> {
      if (this.fakePlayer != null && mc.currentScreen == null) {
         int var2 = event.getKey();
         int var3 = event.getAction();
         if (var2 == 265) {
            this.b = var3 != 1 && var3 != 2 ? 0.0F : 1.0F;
         } else if (var2 == 264) {
            this.b = var3 != 1 && var3 != 2 ? 0.0F : -1.0F;
         } else if (var2 == 263) {
            this.c = var3 != 1 && var3 != 2 ? 0.0F : 1.0F;
         } else if (var2 == 262) {
            this.c = var3 != 1 && var3 != 2 ? 0.0F : -1.0F;
         }
      }
   };
   private final EventListener<W> onRender = event -> {
      if (this.fakePlayer != null && mc.player != null) {
         if (this.b == 0.0F && this.c == 0.0F) {
            this.fakePlayer.setSprinting(false);
            this.fakePlayer.setVelocity(0.0, this.fakePlayer.getVelocity().y, 0.0);
            this.fakePlayer.limbAnimator.setSpeed(0.0F);
         } else {
            float var2 = mc.player.getYaw();
            double var3 = 0.2;
            double var5 = this.c * Math.cos(Math.toRadians(var2)) - this.b * Math.sin(Math.toRadians(var2));
            double var7 = this.b * Math.cos(Math.toRadians(var2)) + this.c * Math.sin(Math.toRadians(var2));
            Vec3d var9 = new Vec3d(var5 * var3, this.fakePlayer.getVelocity().y, var7 * var3);
            this.fakePlayer.setVelocity(var9);
            this.fakePlayer.move(MovementType.SELF, var9);
            this.fakePlayer.setSprinting(true);
         }
      }
   };

   public m() {
      Mytheria.getInstance().getEventManager().subscribe(this);
   }

   public Command command() {
      return f.begin("fakeplayer")
         .aliases("fp")
         .desc("commands.fakeplayer.description")
         .param("action", p -> p.literal("add", "del"))
         .handler(this::a)
         .build();
   }

   private void a(g ctx) {
      String var2 = (String)ctx.arguments().getFirst();
      String var3 = var2.toLowerCase();
      switch (var3) {
         case "add":
            this.add();
            break;
         case "del":
            this.del();
      }
   }

   public void add() {
      if (this.fakePlayer != null) {
         this.fakePlayer.discard();
         this.fakePlayer = null;
      }

      this.fakePlayer = new OtherClientPlayerEntity(mc.world, new GameProfile(UUID.fromString("66123666-6666-6666-6666-666666666600"), "FakePlayer"));
      this.fakePlayer.copyPositionAndRotation(mc.player);
      this.fakePlayer.setStackInHand(Hand.MAIN_HAND, mc.player.getMainHandStack().copy());
      this.fakePlayer.setStackInHand(Hand.OFF_HAND, mc.player.getOffHandStack().copy());
      this.fakePlayer.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 9999, 2));
      this.fakePlayer.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 9999, 4));
      this.fakePlayer.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 9999, 1));
      mc.world.addEntity(this.fakePlayer);
      Mytheria.getInstance()
         .getNotificationManager()
         .addNotificationOther(cb.SUCCESS, av.translate("commands.fakeplayer.success"), av.translate("commands.fakeplayer.added"));
   }

   public void del() {
      if (this.fakePlayer == null) {
         Mytheria.getInstance()
            .getNotificationManager()
            .addNotificationOther(cb.ERROR, av.translate("commands.fakeplayer.error"), av.translate("commands.fakeplayer.not_exists"));
      } else {
         this.fakePlayer.discard();
         this.fakePlayer = null;
         Mytheria.getInstance()
            .getNotificationManager()
            .addNotificationOther(cb.SUCCESS, av.translate("commands.fakeplayer.success"), av.translate("commands.fakeplayer.removed"));
      }
   }
}
