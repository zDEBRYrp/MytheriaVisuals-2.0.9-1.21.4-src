package a.uc;

import a.TextFormatUtils;
import a.ax;
import a.ck;
import a.ej;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.client.gui.hud.ChatHudLine;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Text;
import net.minecraft.util.math.MathHelper;
import nesquik.mytheria.mixin.accessors.ChatHudAccessor;
import nesquik.mytheria.systems.modules.api.ModuleInfo;

@ModuleInfo(name = "Chat Copy", category = ax.OTHER, desc = "modules.descriptions.chat_copy")
public class fQ extends aJ {
    private final ck a = new ck(this, "modules.settings.copy.format");
    private final ck.a b = new ck.a(this.a, "&#RRGGBB").select();
    private final ck.a c = new ck.a(this.a, "<#RRGGBB>");
    private final ck.a d = new ck.a(this.a, "&x&R&R&G&G&B&B");
    private final ck.a e = new ck.a(this.a, "&x&r&r&g&g&b&b");

    public fQ() {
    }

    public int getFormatIndex() {
        if (this.c.isSelected()) return 1;
        if (this.d.isSelected()) return 2;
        if (this.e.isSelected()) return 3;
        return 0;
    }

    public static void copyHoveredMessage(int formatIndex) {
        if (mc == null || mc.inGameHud == null || mc.player == null) return;
        if (!(mc.currentScreen instanceof net.minecraft.client.gui.screen.ChatScreen)) return;

        ChatHud chatHud = mc.inGameHud.getChatHud();
        ChatHudAccessor accessor = (ChatHudAccessor) chatHud;
        java.util.List<ChatHudLine.Visible> visible = accessor.getVisibleMessages();
        int scrolledLines = accessor.getScrolledLines();

        double mouseX = mc.mouse.getX() / mc.getWindow().getScaleFactor();
        double mouseY = mc.mouse.getY() / mc.getWindow().getScaleFactor();

        double chatScale = chatHud.getChatScale();
        int scaledHeight = mc.getWindow().getScaledHeight();

        double chatX = mouseX / chatScale - 4.0;
        double chatY = (scaledHeight - mouseY - 40.0) / (chatScale * 9.0);

        int lineWidth = MathHelper.floor(chatHud.getWidth() / chatScale);
        if (chatX < -4.0 || chatX > lineWidth) return;

        int visibleCount = Math.min(
            MathHelper.floor((scaledHeight - 40.0) / (chatScale * 9.0)),
            visible.size()
        );
        if (chatY < 0.0 || chatY >= visibleCount) return;

        int lineIndex = MathHelper.floor(chatY + scrolledLines);
        if (lineIndex < 0 || lineIndex >= visible.size()) return;

        int msgIndex = lineIndex;
        while (msgIndex >= 0) {
            if (visible.get(msgIndex).endOfEntry()) break;
            msgIndex--;
        }
        if (msgIndex < 0 || msgIndex >= visible.size()) return;

        ChatHudLine.Visible hoveredLine = visible.get(msgIndex);
        OrderedText content = hoveredLine.content();
        String result = TextFormatUtils.format(content, formatIndex);
        ej.copyText(result);

        mc.player.sendMessage(
            Text.literal("[ChatCopy] ")
                .withColor(10190335)
                .append(Text.literal("Сообщение скопировано!").withColor(16777215)),
            true
        );
    }
}
