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
import a.ck;
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
import a.ah;
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
import a.j;
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
import a.bf;
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

import java.util.Locale;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;

@ModuleInfo(name = "AutoRelist", category = ax.PLAYER, desc = "modules.descriptions.autorelist")
public class bf extends aJ {
   private static final Item[] a = new Item[]{Items.ENDER_CHEST, Items.CHEST, Items.BARREL, Items.SHULKER_BOX, Items.PAPER, Items.PLAYER_HEAD};
   private static final Item[] b = new Item[]{Items.TARGET, Items.RECOVERY_COMPASS, Items.COMPASS, Items.CLOCK, Items.PLAYER_HEAD};
   private static final Item[] c = new Item[]{
      Items.LIME_DYE, Items.GREEN_DYE, Items.EMERALD, Items.SLIME_BALL, Items.GREEN_STAINED_GLASS_PANE, Items.LIME_STAINED_GLASS_PANE, Items.PLAYER_HEAD
   };
   private static final String[] d = new String[]{"хранилищ", "мои товары", "мои предметы", "мои лоты", "товары", "предметы", "склад"};
   private static final String[] e = new String[]{"выбрать", "выставить", "продать", "resell", "sell", "цена"};
   private static final String[] f = new String[]{"подтверд", "добав", "выставить", "продать", "готово", "sell", "confirm"};
   private final ck g = new ck(this, "Режим");
   private final ck.a h = new ck.a(this.g, "Князь").select();
   private final ck.a i = new ck.a(this.g, "Игрок");
   private final fO j = new fO();
   private final fO k = new fO();
   private int l = 0;
   private final EventListener<W> m = event -> {
      if (mc.player != null) {
         if (this.k()) {
            this.a();
         } else if (this.l()) {
            this.b();
         }
      }
   };

   @Override
   public void onEnable() {
      super.onEnable();
      this.j.reset();
      this.k.reset();
      this.l = 0;
   }

   private void a() {
      if (this.j.getElapsedTime() >= 65000L) {
         this.a("/ah resell");
         this.j.reset();
      }
   }

   private void b() {
      if (this.l == 0) {
         if (this.j.getElapsedTime() >= 65000L) {
            this.a("/ah");
            this.j.reset();
            this.l = 1;
            this.k.reset();
         }
      } else if (this.k.getElapsedTime() >= 5000L) {
         this.f();
      } else if (this.l == 1) {
         if (this.k.getElapsedTime() >= 500L && this.h()) {
            if (this.c()) {
               this.l = 2;
               this.k.reset();
            }
         }
      } else if (this.l == 2) {
         if (this.k.getElapsedTime() >= 500L && this.i()) {
            if (this.d()) {
               this.l = 3;
               this.k.reset();
            } else {
               if (this.e()) {
                  this.l = 4;
                  this.k.reset();
               }
            }
         }
      } else if (this.l == 3) {
         if (this.k.getElapsedTime() >= 500L) {
            if (mc.player.currentScreenHandler != null && mc.player.currentScreenHandler != mc.player.playerScreenHandler) {
               if (this.e()) {
                  this.l = 4;
                  this.k.reset();
               }
            } else {
               this.f();
            }
         }
      } else {
         if (this.l == 4 && this.k.getElapsedTime() >= 300L) {
            mc.player.closeHandledScreen();
            this.f();
         }
      }
   }

   private boolean c() {
      ScreenHandler var1 = this.g();
      if (var1 == null) {
         return false;
      } else {
         int var2 = this.a(var1);
         if (var2 < 9) {
            return false;
         } else {
            int var3 = var2 - 9;
            if (this.a(var1, var3, var3 + 2, true, d)) {
               return true;
            } else {
               return this.a(var1, var3, var3 + 2, true, a) ? true : this.a(var1, var3 + 2, var3 + 1, var3);
            }
         }
      }
   }

   private boolean d() {
      ScreenHandler var1 = this.g();
      if (var1 == null) {
         return false;
      } else {
         int var2 = this.a(var1);
         if (var2 < 9) {
            return false;
         } else {
            int var3 = var2 - 9;
            int var4 = var3 + 7;
            if (this.a(var1, var4, var4, false, e)) {
               return true;
            } else {
               return this.a(var1, var4, var4, false, b) ? true : this.a(var1, new int[]{var4});
            }
         }
      }
   }

   private boolean e() {
      ScreenHandler var1 = this.g();
      if (var1 == null) {
         return false;
      } else {
         int var2 = this.a(var1);
         if (var2 < 9) {
            return false;
         } else {
            int var3 = var2 - 9;
            int var4 = var3 + 8;
            if (this.a(var1, var4, var4, false, f)) {
               return true;
            } else {
               return this.a(var1, var4, var4, false, c) ? true : this.a(var1, new int[]{var4});
            }
         }
      }
   }

   private void f() {
      this.l = 0;
      this.k.reset();
   }

   private boolean a(ScreenHandler handler, int start, int end, boolean reverse, String... keywords) {
      if (keywords != null && keywords.length != 0) {
         int var6 = Math.max(0, Math.min(start, end));
         int var7 = Math.min(this.a(handler) - 1, Math.max(start, end));
         if (var7 < var6) {
            return false;
         }

         if (reverse) {
            for (int var8 = var7; var8 >= var6; var8--) {
               Slot var9 = handler.getSlot(var8);
               if (var9.hasStack()) {
                  String var10 = var9.getStack().getName().getString().toLowerCase(Locale.ROOT);
                  if (this.a(var10, keywords)) {
                     this.a(handler, var8);
                     return true;
                  }
               }
            }
         } else {
            for (int var11 = var6; var11 <= var7; var11++) {
               Slot var12 = handler.getSlot(var11);
               if (var12.hasStack()) {
                  String var13 = var12.getStack().getName().getString().toLowerCase(Locale.ROOT);
                  if (this.a(var13, keywords)) {
                     this.a(handler, var11);
                     return true;
                  }
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private boolean a(ScreenHandler handler, int start, int end, boolean reverse, Item... items) {
      if (items != null && items.length != 0) {
         int var6 = Math.max(0, Math.min(start, end));
         int var7 = Math.min(this.a(handler) - 1, Math.max(start, end));
         if (var7 < var6) {
            return false;
         }

         if (reverse) {
            for (int var8 = var7; var8 >= var6; var8--) {
               Slot var9 = handler.getSlot(var8);
               if (var9.hasStack()) {
                  Item var10 = var9.getStack().getItem();

                  for (Item var14 : items) {
                     if (var10 == var14) {
                        this.a(handler, var8);
                        return true;
                     }
                  }
               }
            }
         } else {
            for (int var15 = var6; var15 <= var7; var15++) {
               Slot var16 = handler.getSlot(var15);
               if (var16.hasStack()) {
                  Item var17 = var16.getStack().getItem();

                  for (Item var21 : items) {
                     if (var17 == var21) {
                        this.a(handler, var15);
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private boolean a(ScreenHandler handler, int... slotIds) {
      if (slotIds != null && slotIds.length != 0) {
         int var3 = this.a(handler) - 1;

         for (int var7 : slotIds) {
            if (var7 >= 0 && var7 <= var3) {
               Slot var8 = handler.getSlot(var7);
               if (var8.hasStack()) {
                  this.a(handler, var7);
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private void a(ScreenHandler handler, int slotId) {
      if (mc.player != null && mc.interactionManager != null) {
         mc.interactionManager.clickSlot(handler.syncId, slotId, 0, SlotActionType.PICKUP, mc.player);
      }
   }

   private ScreenHandler g() {
      if (mc.player != null && mc.interactionManager != null) {
         ScreenHandler var1 = mc.player.currentScreenHandler;
         return var1 != null && var1 != mc.player.playerScreenHandler ? var1 : null;
      } else {
         return null;
      }
   }

   private int a(ScreenHandler handler) {
      return Math.max(0, handler.slots.size() - 36);
   }

   private boolean h() {
      String var1 = this.j();
      return var1.contains("аукцион") || var1.contains("auction");
   }

   private boolean i() {
      String var1 = this.j();
      return var1.contains("хранилищ") || var1.contains("storage");
   }

   private String j() {
      return mc.currentScreen != null && mc.currentScreen.getTitle() != null ? mc.currentScreen.getTitle().getString().toLowerCase(Locale.ROOT) : "";
   }

   private boolean a(String text, String... values) {
      if (text != null && !text.isEmpty() && values != null) {
         for (String var6 : values) {
            if (var6 != null && !var6.isEmpty() && text.contains(var6)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private void a(String message) {
      if (mc.player != null && mc.player.networkHandler != null) {
         mc.player.networkHandler.sendChatMessage(message);
      }
   }

   private boolean k() {
      return this.h.isSelected();
   }

   private boolean l() {
      return this.i.isSelected();
   }
}
