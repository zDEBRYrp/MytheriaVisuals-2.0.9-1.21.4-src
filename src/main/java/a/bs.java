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
import a.bs;
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
import a.ax;
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

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import nesquik.mytheria.mixin.accessors.BossBarHudAccessor;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import net.minecraft.client.gui.hud.BossBarHud;
import net.minecraft.client.gui.hud.ClientBossBar;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.entity.boss.BossBar.Color;
import net.minecraft.entity.boss.BossBar.Style;
import net.minecraft.network.packet.s2c.play.BossBarS2CPacket;
import net.minecraft.network.packet.s2c.play.BossBarS2CPacket.Consumer;
import net.minecraft.text.Text;

@ModuleInfo(name = "PvP Save", category = ax.PLAYER, desc = "Блокирует выход, пока активен PvP")
public class bs extends aJ {
   public static bs INSTANCE;
   private static final List<String> a = List.of("режим боя", "пвп", "pvp", "дуэль", "дуел", "duel");
   private static final Pattern b = Pattern.compile(".*\\b(?:0|1)\\b.*");
   private static final Pattern c = Pattern.compile(".*\\b(?:\\d+:)?0?0:0?[01]\\b.*");
   private boolean d;
   UUID e;
   long f = -1L;
   private long g = -1L;
   private final EventListener<W> h = event -> {
      if (mc.player != null && mc.world != null) {
         this.a();
         if (this.d && this.f > 0L && System.currentTimeMillis() >= this.f) {
            this.c();
         }
      } else {
         this.c();
      }
   };
   private final EventListener<S> i = event -> {
      if (event.getPacket() instanceof BossBarS2CPacket var2) {
         if (mc.player != null) {
            var2.accept(
               new Consumer() {
                  public void add(
                     UUID uuid, Text name, float percent, Color color, Style style, boolean darkenSky, boolean dragonMusic, boolean thickenFog
                  ) {
                     bs.this.a(name.getString(), uuid);
                  }

                  public void remove(UUID uuid) {
                     if (uuid != null && uuid.equals(bs.this.e)) {
                        bs.this.f = System.currentTimeMillis() + bs.this.b();
                     }
                  }

                  public void updateProgress(UUID uuid, float percent) {
                  }

                  public void updateName(UUID uuid, Text name) {
                     bs.this.a(name.getString(), uuid);
                  }

                  public void updateStyle(UUID uuid, Color color, Style style) {
                  }

                  public void updateProperties(UUID uuid, boolean darkenSky, boolean dragonMusic, boolean thickenFog) {
                  }
               }
            );
         }
      }
   };

   /** Конструктор, сохраняет единственный экземпляр модуля */
   public bs() {
      INSTANCE = this;
   }

   /** Сбрасывает состояние PvP при отключении модуля */
   @Override
   public void onDisable() {
      super.onDisable();
      this.c();
   }

   /** Возвращает true, если активен PvP-режим */
   public boolean isPvpActive() {
      this.a();
      return this.d;
   }

   /** Проверяет и блокирует команду /hub во время PvP */
   public boolean shouldBlockHubCommand(String command) {
      try {
         this.a();
      } catch (Exception var7) {
         return false;
      }

      if (this.d && command != null) {
         String var2 = this.d(command);
         if (!this.c(var2)) {
            return false;
         }

         long var3 = System.currentTimeMillis();
         if (this.g > var3) {
            this.g = -1L;
            return false;
         }

         this.g = var3 + 5000L;
         if (mc.player != null) {
            try {
               mc.player
                  .sendMessage(
                     Text.literal("[Mytheria] ")
                        .withColor(10190335)
                        .append(Text.literal("Вы точно хотите выйти с PvP режима? Пропишите еще раз /hub")),
                     false
                  );
            } catch (Exception var6) {
            }
         }

         return true;
      } else {
         return false;
      }
   }

   /** Обрабатывает информацию о bossbar для определения PvP-режима */
   void a(String bossBarName, UUID bossBarUuid) {
      if (this.a(bossBarName)) {
         if (this.b(bossBarName)) {
            this.c();
         } else {
            this.e = bossBarUuid;
            this.d = true;
            this.f = -1L;
         }
      }
   }

   private void a() {
      if (!this.isEnabled()) {
         this.c();
      } else if (mc.player != null && mc.world != null && mc.inGameHud != null) {
         boolean var1 = false;
         UUID var2 = null;

         try {
            BossBarHud var3 = mc.inGameHud.getBossBarHud();
            if (var3 == null) {
               this.c();
               return;
            }

            Map<UUID, ClientBossBar> var4 = ((BossBarHudAccessor)var3).getBossBars();
            if (var4 != null && !var4.isEmpty()) {
               for (Entry<UUID, ClientBossBar> var6 : var4.entrySet()) {
                  if (var6 != null) {
                     ClientBossBar var7 = (ClientBossBar)var6.getValue();
                     if (var7 != null && var7.getName() != null) {
                        String var8 = var7.getName().getString();
                        if (var8 != null && this.a(var8) && !this.b(var8)) {
                           var1 = true;
                           var2 = (UUID)var6.getKey();
                           break;
                        }
                     }
                  }
               }
            }
         } catch (Exception var9) {
            this.c();
            return;
         }

         if (var1) {
            this.d = true;
            this.e = var2;
            this.f = -1L;
         } else if (!this.d) {
            this.g = -1L;
            this.f = -1L;
         } else {
            long var10 = System.currentTimeMillis();
            if (this.f <= 0L) {
               this.f = var10 + this.b();
            } else {
               if (var10 >= this.f) {
                  this.c();
               }
            }
         }
      } else {
         this.c();
      }
   }

   private boolean a(String name) {
      if (name != null && !name.isEmpty()) {
         String var2 = name.toLowerCase(Locale.ROOT);
         return a.stream().anyMatch(var2::contains);
      } else {
         return false;
      }
   }

   private boolean b(String name) {
      if (name != null && !name.isEmpty()) {
         String var2 = name.toLowerCase(Locale.ROOT);
         return !this.a(var2)
            ? false
            : var2.contains("0 сек")
               || var2.contains("1 сек")
               || var2.contains("0с")
               || var2.contains("1с")
               || var2.contains("0 sec")
               || var2.contains("1 sec")
               || var2.contains("0s")
               || var2.contains("1s")
               || c.matcher(var2).matches()
               || b.matcher(var2).matches();
      } else {
         return false;
      }
   }

   /** Вычисляет задержку на основе пинга игрока */
   int b() {
      int var1 = 200;
      if (mc.getNetworkHandler() != null && mc.player != null) {
         PlayerListEntry var2 = mc.getNetworkHandler().getPlayerListEntry(mc.player.getUuid());
         int var3 = var2 != null ? var2.getLatency() : -1;
         if (var3 >= 0) {
            var1 = var3 * 2 + 150;
         }
      }

      if (var1 < 200) {
         var1 = 200;
      }

      if (var1 > 1500) {
         var1 = 1500;
      }

      return var1;
   }

   private void c() {
      this.d = false;
      this.e = null;
      this.f = -1L;
      this.g = -1L;
   }

   private boolean c(String command) {
      String var2 = command.toLowerCase(Locale.ROOT);
      return var2.equals("hub") || var2.startsWith("hub ");
   }

   private String d(String command) {
      String var2 = command.trim();
      return var2.startsWith("/") ? var2.substring(1).trim() : var2;
   }
}
