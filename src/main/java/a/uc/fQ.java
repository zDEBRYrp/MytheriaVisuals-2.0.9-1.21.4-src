package a.uc;

import a.TextFormatUtils;
import a.ax;
import a.ch;
import a.ck;
import a.ej;
import a.an;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import org.lwjgl.glfw.GLFW;

@ModuleInfo(name = "Copy Helper", category = ax.OTHER, desc = "modules.descriptions.copy_helper")
public class fQ extends aJ {
    private final ch a = new ch(this, "modules.settings.copy_helper.chat_copy");
    private final ch b = new ch(this, "modules.settings.copy_helper.item_copy");
    private final ck c = new ck(this, "modules.settings.copy.format");
    private final ck.a d = new ck.a(this.c, "&#RRGGBB").select();
    private final ck.a e = new ck.a(this.c, "<#RRGGBB>");
    private final ck.a f = new ck.a(this.c, "&x&R&R&G&G&B&B");
    private final ck.a g = new ck.a(this.c, "&x&r&r&g&g&b&b");

    private final EventListener<an> h = event -> {
        if (!this.b.isEnabled()) return;
        if (event.getKey() != GLFW.GLFW_KEY_DELETE) return;
        if (event.getAction() != 1) return;
        if (mc.currentScreen != null) return;
        if (mc.player == null) return;

        ItemStack held = mc.player.getMainHandStack();
        if (held.isEmpty()) return;

        String result = TextFormatUtils.format(held.getName(), this.getFormatIndex());
        ej.copyText(result);
        mc.player.sendMessage(
            Text.literal("[ItemCopy] ").withColor(10190335)
                .append(Text.literal("Название скопировано!").withColor(16777215)),
            true
        );
    };

    public fQ() {
    }

    public boolean isChatCopyEnabled() {
        return this.a.isEnabled();
    }

    public boolean isItemCopyEnabled() {
        return this.b.isEnabled();
    }

    public int getFormatIndex() {
        if (this.e.isSelected()) return 1;
        if (this.f.isSelected()) return 2;
        if (this.g.isSelected()) return 3;
        return 0;
    }

    public static void copyChatMessage(int formatIndex) {
        if (mc == null || mc.inGameHud == null || mc.player == null) return;
        if (!(mc.currentScreen instanceof net.minecraft.client.gui.screen.ChatScreen)) return;

        net.minecraft.client.gui.hud.ChatHud chatHud = mc.inGameHud.getChatHud();
        nesquik.mytheria.mixin.accessors.ChatHudAccessor accessor =
            (nesquik.mytheria.mixin.accessors.ChatHudAccessor) chatHud;
        java.util.List<net.minecraft.client.gui.hud.ChatHudLine.Visible> visible = accessor.getVisibleMessages();
        int scrolledLines = accessor.getScrolledLines();

        double mouseX = mc.mouse.getX() / mc.getWindow().getScaleFactor();
        double mouseY = mc.mouse.getY() / mc.getWindow().getScaleFactor();
        double chatScale = chatHud.getChatScale();
        int scaledHeight = mc.getWindow().getScaledHeight();

        double chatX = mouseX / chatScale - 4.0;
        double chatY = (scaledHeight - mouseY - 40.0) / (chatScale * 9.0);

        int lineWidth = net.minecraft.util.math.MathHelper.floor(chatHud.getWidth() / chatScale);
        if (chatX < -4.0 || chatX > lineWidth) return;

        int visibleCount = Math.min(
            net.minecraft.util.math.MathHelper.floor((scaledHeight - 40.0) / (chatScale * 9.0)),
            visible.size()
        );
        if (chatY < 0.0 || chatY >= visibleCount) return;

        int lineIndex = net.minecraft.util.math.MathHelper.floor(chatY + scrolledLines);
        if (lineIndex < 0 || lineIndex >= visible.size()) return;

        int msgIndex = lineIndex;
        while (msgIndex >= 0) {
            if (visible.get(msgIndex).endOfEntry()) break;
            msgIndex--;
        }
        if (msgIndex < 0 || msgIndex >= visible.size()) return;

        net.minecraft.client.gui.hud.ChatHudLine.Visible hoveredLine = visible.get(msgIndex);
        String result = TextFormatUtils.format(hoveredLine.content(), formatIndex);
        ej.copyText(result);
        mc.player.sendMessage(
            Text.literal("[ChatCopy] ").withColor(10190335)
                .append(Text.literal("Сообщение скопировано!").withColor(16777215)),
            true
        );
    }
}
