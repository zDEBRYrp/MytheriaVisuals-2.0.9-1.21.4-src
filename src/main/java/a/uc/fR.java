package a.uc;

import a.TextFormatUtils;
import a.ax;
import a.ck;
import a.ej;
import a.an;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import org.lwjgl.glfw.GLFW;

@ModuleInfo(name = "Item Name Copy", category = ax.OTHER, desc = "modules.descriptions.item_name_copy")
public class fR extends aJ {
    private final ck a = new ck(this, "modules.settings.copy.format");
    private final ck.a b = new ck.a(this.a, "&#RRGGBB").select();
    private final ck.a c = new ck.a(this.a, "<#RRGGBB>");
    private final ck.a d = new ck.a(this.a, "&x&R&R&G&G&B&B");
    private final ck.a e = new ck.a(this.a, "&x&r&r&g&g&b&b");

    private final EventListener<an> f = event -> {
        if (event.getKey() != GLFW.GLFW_KEY_DELETE) return;
        if (event.getAction() != 1) return;
        if (mc.currentScreen != null) return;
        if (mc.player == null) return;

        ItemStack held = mc.player.getMainHandStack();
        if (held.isEmpty()) return;

        int formatIndex = this.getFormatIndex();
        String result = TextFormatUtils.format(held.getName(), formatIndex);
        ej.copyText(result);

        mc.player.sendMessage(
            Text.literal("[ItemCopy] ")
                .withColor(10190335)
                .append(Text.literal("Название скопировано!").withColor(16777215)),
            true
        );
    };

    public fR() {
    }

    public int getFormatIndex() {
        if (this.c.isSelected()) return 1;
        if (this.d.isSelected()) return 2;
        if (this.e.isSelected()) return 3;
        return 0;
    }
}
