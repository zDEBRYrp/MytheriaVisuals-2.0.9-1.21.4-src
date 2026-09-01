package nesquik.mytheria.mixin.minecraft.client.gui.screen;

import a.ag;
import a.al;
import a.am;
import a.bm;
import a.uc.fO;
import a.uc.fR;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.mixin.accessors.HandledScreenAccessor;
import nesquik.mytheria.framework.base.CustomDrawContext;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.util.InputUtil;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(HandledScreen.class)
public abstract class HandledScreenMixin implements IMinecraft {
   @Unique
   private final fO timer = new fO();

   @Shadow
   protected abstract boolean isPointOverSlot(Slot var1, double var2, double var4);

   @Shadow
   protected abstract void onMouseClick(Slot var1, int var2, int var3, SlotActionType var4);

   @Inject(method = "render(Lnet/minecraft/client/gui/DrawContext;IIF)V", at = @At("TAIL"))
   private void onRender(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
      CustomDrawContext var6 = CustomDrawContext.of(context);
      Mytheria.getInstance().getEventManager().triggerEvent(new ag(var6, delta));

       for (Slot var8 : mc.player.currentScreenHandler.slots) {
          bm var9 = Mytheria.getInstance().getModuleManager().getModule(bm.class);
          if (this.isPointOverSlot(var8, mouseX, mouseY)
             && var8.isEnabled()
             && var9.isEnabled()
             && var9.getScroller().isSelected()
             && this.timer.finished((long)var9.getScrollDelay().getCurrentValue())
             && InputUtil.isKeyPressed(mc.getWindow().getHandle(), 340)
             && GLFW.glfwGetMouseButton(mc.getWindow().getHandle(), 0) == 1) {
             this.onMouseClick(var8, var8.id, 0, SlotActionType.QUICK_MOVE);
             this.timer.reset();
          }
       }

       fR auctionModule = Mytheria.getInstance().getModuleManager().getModule(fR.class);
       if (auctionModule != null && auctionModule.isEnabled() && mc.player != null) {
          HandledScreen<?> screen = (HandledScreen<?>) (Object) this;
          auctionModule.refresh(screen);

          if (auctionModule.isAuctionDetected()) {
             int screenX = ((HandledScreenAccessor) this).getX();
             int screenY = ((HandledScreenAccessor) this).getY();

             if (auctionModule.isIdenticalMode()) {
                for (fR.ItemGroup group : auctionModule.getItemGroups()) {
                   int color = auctionModule.getGroupColor(group.slots().get(0));
                   int borderColor = color | 0xCC000000;
                   int fillColor = (color & 0x00FFFFFF) | 0x30000000;
                   for (Slot slot : group.slots()) {
                      int slotX = screenX + slot.x;
                      int slotY = screenY + slot.y;
                      context.fill(slotX - 1, slotY - 1, slotX + 17, slotY + 17, borderColor);
                      context.fill(slotX, slotY, slotX + 16, slotY + 16, fillColor);
                   }
                   Slot firstSlot = group.slots().get(0);
                   String countText = "\u00a7ax" + group.count();
                   context.drawTextWithShadow(mc.textRenderer, net.minecraft.text.Text.literal(countText), screenX + firstSlot.x + 18, screenY + firstSlot.y + 4, color);
                }
             } else {
                for (fR.AuctionEntry entry : auctionModule.getTopEntries()) {
                   Slot slot = entry.slot();
                   int rank = auctionModule.getRankForSlot(slot);
                   if (rank < 0) continue;
                   int slotX = screenX + slot.x;
                   int slotY = screenY + slot.y;
                   context.fill(slotX - 1, slotY - 1, slotX + 17, slotY + 17, auctionModule.rankBorderColor(rank));
                   context.fill(slotX, slotY, slotX + 16, slotY + 16, auctionModule.rankFillColor(rank));
                }
             }
          }

          if (auctionModule.isAuctionDetected() && auctionModule.showStats.isEnabled() && auctionModule.getCachedStats() != null) {
             fR.AuctionStats stats = auctionModule.getCachedStats();
             int panelX = 4;
             int panelY = 4;
             java.util.List<String> lines = new java.util.ArrayList<>();
             if (auctionModule.isIdenticalMode()) {
                lines.add("\u00A7e\u00A7l\u041e\u0434\u0438\u043d\u0430\u043a\u043e\u0432\u044b\u0435 \u0432\u0435\u0449\u0438");
                lines.add("\u00A77\u0413\u0440\u0443\u043f\u043f: \u00A7f" + stats.auctionItems());
             } else {
                lines.add("\u00A7e\u00A7l\u0421\u0442\u0430\u0442\u0438\u0441\u0442\u0438\u043a\u0430 \u0430\u0443\u043a\u0446\u0438\u043e\u043d\u0430");
                lines.add("\u00A77\u0422\u043e\u0432\u0430\u0440\u043e\u0432: \u00A7f" + stats.auctionItems());
                if (stats.minTotalPrice() > 0) {
                   lines.add("\u00A77\u041c\u0438\u043d: \u00A7a" + formatPrice(stats.minTotalPrice()));
                   lines.add("\u00A77\u0421\u0440\u0435\u0434\u043d\u0438\u0439: \u00A7e" + formatPrice(stats.avgTotalPrice()));
                   lines.add("\u00A77\u041c\u0438\u043d/\u0448\u0442: \u00A7b" + formatPrice(stats.minUnitPrice()));
                   lines.add("\u00A77\u0421\u0440\u0435\u0434/\u0448\u0442: \u00A7d" + formatPrice(stats.avgUnitPrice()));
                }
             }
             int maxWidth = 0;
             for (String line : lines) {
                int w = mc.textRenderer.getWidth(line.replaceAll("\u00A7.", ""));
                if (w > maxWidth) maxWidth = w;
             }
             int panelW = maxWidth + 8;
             int panelH = lines.size() * 10 + 4;
             context.fill(panelX - 1, panelY - 1, panelX + panelW + 1, panelY + panelH + 1, 0xFF222222);
             context.fill(panelX, panelY, panelX + panelW, panelY + panelH, 0xCC111111);
             int ty = panelY + 2;
             for (String line : lines) {
                context.drawTextWithShadow(mc.textRenderer, net.minecraft.text.Text.literal(line), panelX + 4, ty, 0xFFFFFF);
                ty += 10;
             }
          }
       }
   }

   @Inject(method = "mouseClicked(DDI)Z", at = @At("HEAD"))
   private void onMouseClick(double mouseX, double mouseY, int button, CallbackInfoReturnable<Boolean> cir) {
      Mytheria.getInstance().getEventManager().triggerEvent(new al((float)mouseX, (float)mouseY, button));
   }

    @Inject(method = "mouseReleased(DDI)Z", at = @At("HEAD"))
    public void mouseReleased(double mouseX, double mouseY, int button, CallbackInfoReturnable<Boolean> cir) {
        Mytheria.getInstance().getEventManager().triggerEvent(new am((float)mouseX, (float)mouseY, button));
    }

    @Unique
    private static String formatPrice(long price) {
       if (price >= 1_000_000) return String.format(java.util.Locale.US, "%,.1fM", price / 1_000_000.0);
       if (price >= 1_000) return String.format(java.util.Locale.US, "%,.1fK", price / 1_000.0);
       return String.format(java.util.Locale.US, "%,d", price);
    }
 }
