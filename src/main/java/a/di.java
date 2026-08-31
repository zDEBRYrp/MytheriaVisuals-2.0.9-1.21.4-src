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
import a.ep;
import a.cn;
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
import a.di;
import a.uc.aK;
import a.uc.aJ;
import a.uc.O;
import a.uc.aV;
import a.uc.eH;
import a.eb;
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
import a.dg;
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
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.CustomDrawContext;
import nesquik.mytheria.systems.event.EventListener;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.util.math.Vec3d;

public class di extends dg {
   private final List<di.a> a = new ArrayList<>();
   private final fO tpsTimer = new fO();
   private String c;
   private int d = -1;
   private long e = -1L;
   private final fO f = new fO();
   private final fO g = new fO();
   private final fO h = new fO();
   private String extractEventName(String segment, String raw) {
      // ищем последние скобки [Имя] или <<<Имя>>> перед координатами, игнорируя время и числа
      String candidate = null;
      java.util.regex.Pattern brPat = java.util.regex.Pattern.compile("\\[\\s*([^\\]]{3,40})\\s*\\]");
      Matcher bm = brPat.matcher(segment);
      while (bm.find()) {
         String cand = bm.group(1).trim();
         if (cand.matches("\\s*\\d+\\s*")) continue; // [1] индекс
         if (cand.matches(".*\\d+:\\d+.*")) continue; // время
         if (cand.matches("\\s*-?\\d+\\s+.*")) continue; // координаты
         if (cand.equalsIgnoreCase("Ивенты") || cand.equalsIgnoreCase("Сервер")) continue;
         candidate = cand;
      }
      if (candidate == null) {
         java.util.regex.Pattern triPat = java.util.regex.Pattern.compile("<{2,}\\s*([^>]{3,40})\\s*>{2,}");
         Matcher tm = triPat.matcher(raw);
         String last = null;
         while (tm.find()) last = tm.group(1).trim();
         if (last != null && last.length() >= 3) candidate = last;
      }
      if (candidate == null) {
         // fallback: ищем любой известный ивент как ключевое слово в сегменте
         String low = segment.toLowerCase();
         for (b t : b.values()) {
            if (low.contains(t.getName().toLowerCase())) { candidate = t.getName(); break; }
            for (String tok : t.getName().toLowerCase().split("\\s+")) if (tok.length()>=4 && low.contains(tok)) { candidate = t.getName(); break; }
         }
      }
      if (candidate != null) {
         candidate = candidate.replaceAll("^\\[\\d+\\]\\s*", "").trim();
         if (candidate.startsWith("«") || candidate.startsWith("»")) candidate = candidate.replaceAll("[«»]", "").trim();
      }
      return candidate;
   }

   private b findMatchingType(String name) {
      if (name == null) return null;
      String low = name.toLowerCase();
      for (b t : b.values()) {
         String enLow = t.getName().toLowerCase();
         if (low.contains(enLow) || enLow.contains(low)) return t;
         for (String tok : enLow.split("\\s+")) if (tok.length()>=4 && low.contains(tok)) return t;
         if (enLow.contains("алтарь") && low.contains("алтарь")) return t;
         if (enLow.contains("гейзер") && low.contains("гейзер")) return t;
         if (enLow.contains("маяк") && low.contains("маяк")) return t;
      }
      return null;
   }

   private final EventListener<S> i = event -> {
      if (event.getPacket() instanceof GameMessageS2CPacket var2) {
         String raw = var2.content().getString();
         String var11 = raw.replaceAll("\\n", " ").replaceAll("[^\\p{L}\\p{N}\\s\\[\\]:.,\\-<>«»]", "").replaceAll("\\s{2,}", " ").trim();
         String lowerVar = var11.toLowerCase();
         if (var11.contains("До следующего ивента") || lowerVar.contains("до следующего ивента")) {
            Matcher var4 = Pattern.compile("(\\d+)\\s*мин\\s*(\\d+)\\s*сек").matcher(var11);
            if (var4.find()) {
               this.e = (Integer.parseInt(var4.group(1))*60L + Integer.parseInt(var4.group(2)))*1000L;
               this.f.reset(); this.g.reset();
            }
         }
         java.util.regex.Pattern coordPat = java.util.regex.Pattern.compile("координат[аы]?\\s*:?\\s*\\[?\\s*(-?\\d+)\\s+(-?\\d+)\\s+(-?\\d+)\\s*\\]?", java.util.regex.Pattern.CASE_INSENSITIVE | java.util.regex.Pattern.UNICODE_CASE);
         Matcher cm = coordPat.matcher(var11);
         boolean foundAny = false;
         int lastEnd = 0;
         while (cm.find()) {
            foundAny = true;
            String sx = cm.group(1), sy = cm.group(2), sz = cm.group(3);
            String segment = var11.substring(lastEnd, cm.start());
            String name = extractEventName(segment, raw);
            if (name == null || name.isBlank()) {
               name = extractEventName(var11, raw);
            }
            if (name == null || name.isBlank()) {
               if (this.c != null && !this.c.isBlank()) { name = this.c; this.c = null; }
               else name = "Ивент";
            } else {
               this.c = null;
            }
            b matched = findMatchingType(name);
            if (matched != null) {
               this.a.removeIf(e -> e.a == matched);
               this.a.add(new a(matched, matched.getTime()));
               this.tpsTimer.reset(); this.d = ep.ftAn;
            }
            if (Mytheria.getInstance().getWayPointsManager().isAutoWaypointOnEvent()) {
               String wName = name.replaceAll("^\\[\\d+\\]\\s*", "").trim();
               if (wName.length() > 32) wName = wName.substring(0,32);
               if (Mytheria.getInstance().getWayPointsManager().contains(wName)) {
                  Vec3d ex = null;
                  for (java.util.Map.Entry<String, Vec3d> e : Mytheria.getInstance().getWayPointsManager().getEntries()) if (e.getKey().equals(wName)) { ex = e.getValue(); break; }
                  Vec3d np = new Vec3d(Integer.parseInt(sx), Integer.parseInt(sy), Integer.parseInt(sz));
                  if (ex != null && ex.distanceTo(np) > 5) {
                     wName = wName + " " + sx + "_" + sz;
                     if (Mytheria.getInstance().getWayPointsManager().contains(wName)) {
                        int num = Mytheria.getInstance().getWayPointsManager().getNextAvailableNumber(wName + " ");
                        wName = wName + " " + num;
                     }
                  } else if (ex != null && ex.distanceTo(np) <= 5) {
                     // тот же ивент, обновляем координаты
                  }
               }
               Mytheria.getInstance().getWayPointsManager().add(wName, Integer.parseInt(sx), Integer.parseInt(sy), Integer.parseInt(sz));
            }
            lastEnd = cm.end();
         }
         if (!foundAny) {
            // нет координат в этом сообщении — возможно это строка с названием ивента, ждём след. сообщение с координатами
            String name = extractEventName(var11, raw);
            if (name != null && !name.isBlank() && name.length() >= 3 && !name.matches(".*\\d+:\\d+.*")) {
               // проверяем что это похоже на ивент, а не системное сообщение
               String low = name.toLowerCase();
               boolean isEventLike = false;
               for (b t : b.values()) if (low.contains(t.getName().toLowerCase().split(" ")[0]) || t.getName().toLowerCase().contains(low)) isEventLike = true;
               if (low.contains("алтарь") || low.contains("гейзер") || low.contains("маяк") || low.contains("вулкан") || low.contains("метеорит") || low.contains("череп") || low.contains("посылка") || low.contains("босс") || low.contains("контейнер") || low.contains("груз") || low.contains("корабль")) isEventLike = true;
               if (isEventLike || var11.matches(".*\\[\\s*\\d+\\s*\\].*") || raw.contains("<<<")) {
                  this.c = name;
               } else if (name.length() >= 4 && !name.equalsIgnoreCase("Ивенты")) {
                  // generic fallback для любых кастомных ивентов
                  this.c = name;
               }
            }
         }
      }
   };
   private final EventListener<R> j = event -> {
      if (ep.ftAn != this.d) {
         this.a.forEach(e -> Mytheria.getInstance().getWayPointsManager().delSilent(e.type().getName()));
         this.a.clear();
         this.d = ep.ftAn;
      }

      if (mc.player != null && ep.isFT() && this.h.getElapsedTime() >= 5000L) {
         Thread var2 = new Thread(() -> {
            try {
               Thread.sleep(5000L);
               if (mc.player != null && mc.world != null && ep.isFT()) {
                  mc.player.networkHandler.sendChatCommand("event delay");
                  this.h.reset();
               }
            } catch (InterruptedException var2x) {
               Thread.currentThread().interrupt();
            }
         });
         var2.setDaemon(true);
         var2.start();
      }
   };
   private final EventListener<U> k = event -> {
      if (ep.isFT()) {
         Thread var2 = new Thread(() -> {
            try {
               Thread.sleep(7000L);
               if (mc.player != null && mc.world != null && ep.isFT() && this.h.getElapsedTime() >= 5000L) {
                  mc.player.networkHandler.sendChatCommand("event delay");
                  this.h.reset();
               }
            } catch (InterruptedException var2x) {
               Thread.currentThread().interrupt();
            }
         });
         var2.setDaemon(true);
         var2.start();
      }
   };

   public di(cn setting) {
      super(setting, "events");
      Mytheria.getInstance().getEventManager().subscribe(this);
   }

   @Override
   public void draw(CustomDrawContext context) {
      this.a.removeIf(event -> {
         if (this.tpsTimer.getElapsedTimeTPS() >= event.type().getTime()) {
            Mytheria.getInstance().getWayPointsManager().delSilent(event.type().getName());
            return true;
         } else {
            return false;
         }
      });
      if (!this.a.isEmpty()) {
         di.a var2 = this.a.getFirst();
         long var3 = var2.a.getTime() - this.tpsTimer.getElapsedTimeTPS();
         if (var3 > 0L) {
            int var5 = (int)(var3 / 1000L);
            int var6 = var5 / 60;
            int var7 = var5 % 60;
            String var8 = String.format("%d:%02d", var6, var7);
            eb var9 = this.a(var2.a);
            this.update(Integer.parseInt(var8.split(":")[0]) + ":", "", Integer.parseInt(var8.split(":")[1]), var2.a.a, var9);
            super.draw(context);
         }
      } else if (this.e > 0L && this.g.getElapsedTime() < 10000L) {
         long var10 = this.e - this.f.getElapsedTimeTPS();
         if (var10 > 0L) {
            int var4 = (int)(var10 / 1000L);
            int var11 = var4 / 60;
            int var12 = var4 % 60;
            String var13 = String.format("%d:%02d", var11, var12);
            eb var14 = new eb(200.0F, 115.0F, 250.0F);
            this.update(Integer.parseInt(var13.split(":")[0]) + ":", "", Integer.parseInt(var13.split(":")[1]), "Следующий ивент", var14);
            super.draw(context);
         } else {
            this.e = -1L;
         }
      }
   }

   private eb a(di.b eventType) {
      return switch (eventType) {
         case ALTAR -> new eb(138.0F, 43.0F, 226.0F);
         case BEACON -> new eb(255.0F, 69.0F, 0.0F);
         case VULCAN -> new eb(255.0F, 140.0F, 0.0F);
         case METEOR -> new eb(70.0F, 130.0F, 180.0F);
         case BURNING_SKULL -> new eb(255.0F, 87.0F, 34.0F);
         case PACKAGE -> new eb(243.0F, 196.0F, 82.0F);
         case BOSS -> new eb(139.0F, 222.0F, 221.0F);
         case CONTAINER -> new eb(141.0F, 99.0F, 184.0F);
         case GRUZ -> new eb(41.0F, 253.0F, 5.0F);
         case MYSTERIOUS_SHIP -> new eb(90.0F, 158.0F, 152.0F);
         case GEYSER -> new eb(0.0F, 200.0F, 200.0F);
      };
   }

   @Override
   public boolean canShow() {
      return !this.a.isEmpty() || this.e > 0L && this.g.getElapsedTime() < 10000L && this.f.getElapsedTimeTPS() < this.e;
   }

   record a(di.b a, long b) {

      a(di.b a, long b) {
         this.a = a;
         this.b = b;
      }

      public di.b type() {
         return this.a;
      }

      public long time() {
         return this.b;
      }
   }

   enum b {
      ALTAR("Мистический Алтарь", 360000L),
      BEACON("Маяк Убийца", 360000L),
      VULCAN("Вулкан", 300000L),
      METEOR("Метеоритный дождь", 180000L),
      BURNING_SKULL("Горящий череп", 180000L),
      PACKAGE("Посылка", 180000L),
      BOSS("Босс", 180000L),
      CONTAINER("Контейнер", 180000L),
      GRUZ("Груз", 180000L),
      MYSTERIOUS_SHIP("Таинственный корабль", 300000L),
      GEYSER("Гейзер", 300000L);

      final String a;
      final long b;

      @Generated
      public String getName() {
         return this.a;
      }

      @Generated
      public long getTime() {
         return this.b;
      }

      @Generated
      b(final String name, final long time) {
         this.a = name;
         this.b = time;
      }
   }
}
