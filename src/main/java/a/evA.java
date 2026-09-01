package a;

import a.ec;
import a.eb;
import a.er;
import a.eo;
import a.en;
import a.av;
import a.aj;
import a.uc.bJ;
import a.uc.dZ;
import a.uc.cK;
import a.uc.dP;
import a.uc.dX;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.mojang.blaze3d.systems.RenderSystem;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.CustomScreen;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Font;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.utility.animation.base.Easing;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import nesquik.mytheria.utility.interfaces.IScaledResolution;
import net.minecraft.text.Text;

public class evA extends CustomScreen implements IMinecraft, IScaledResolution {
    private final fw panel;
    private final es anim = new es();
    private final dZ openAnim = new dZ(400L, 0.0F, Easing.BAKEK);
    private boolean closing = false;
    private boolean backToClickGUI = false;

    private int selectedTab = 0;
    private final String[] tabNames = new String[]{"Ивенты", "Шахты"};

    private String apiToken = "";
    private boolean tokenFocused = false;
    private cK tokenField;

    private float scrollOffset = 0;
    private float targetScrollOffset = 0;

    private List<FunTimeApi.EventData> events = new ArrayList<>();
    private List<FunTimeApi.MineData> mines = new ArrayList<>();
    private boolean loading = false;
    private String lastError = "";

    private String selectedServer = "";
    private final String[] serverTypes = new String[]{"", "anarchy", "skyblock"};

    private int selectedServerType = 0;

    public evA() {
        float w = 500.0F;
        float h = 343.0F;
        this.panel = new fw(
            sr.getScaledWidth() / 2.0F - w / 2.0F,
            sr.getScaledHeight() / 2.0F - h / 2.0F,
            w, h
        );
        this.tokenField = new cK(Fonts.REGULAR.getFont(7.0F));
        this.tokenField.setPreview("API Token");
        this.tokenField.setFocused(false);
    }

    private void fetchData() {
        this.apiToken = this.tokenField.getBuiltText();
        if (apiToken.isEmpty()) {
            lastError = "Введите API токен";
            return;
        }
        loading = true;
        lastError = "";
        String serverType = serverTypes[selectedServerType];

        if (selectedTab == 0) {
            FunTimeApi.fetchEvents(apiToken, "all", serverType.isEmpty() ? "all" : serverType)
                .whenComplete((result, ex) -> {
                    events = result != null ? result : new ArrayList<>();
                    loading = false;
                    if (events.isEmpty() && (ex != null || result == null)) {
                        lastError = "Нет данных или неверный токен";
                    }
                });
        } else {
            FunTimeApi.fetchMines(apiToken, serverType.isEmpty() ? "all" : serverType)
                .whenComplete((result, ex) -> {
                    mines = result != null ? result : new ArrayList<>();
                    loading = false;
                    if (mines.isEmpty() && (ex != null || result == null)) {
                        lastError = "Нет данных или неверный токен";
                    }
                });
        }
    }

    private void connectToServer(String serverKey) {
        if (mc.player != null) {
            String cmd = serverKey.replaceAll("[^0-9]", "");
            if (mc.player != null && mc.player.networkHandler != null) {
                mc.player.networkHandler.sendChatCommand("an" + cmd);
            }
            this.close();
        }
    }

    @Override
    public void render(UIContext context) {
        this.openAnim.update(this.closing ? 0.0F : 1.0F);
        this.openAnim.setEasing(!this.closing ? Easing.BAKEK : Easing.BAKEK_BACK);
        this.anim.update();

        if (this.closing && this.openAnim.getValue() == 0.0F) {
            if (this.backToClickGUI) {
                mc.setScreen(new dP());
            } else {
                super.close();
            }
            return;
        }

        float alpha = Math.min(1.0F, this.openAnim.getValue());
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, alpha);
        fl.scale(context.getMatrices(),
            this.panel.getX() + this.panel.getWidth() / 2.0F,
            this.panel.getY() + this.panel.getHeight() / 2.0F,
            0.5F + 0.5F * this.openAnim.getValue());

        if (bJ.showGlass()) {
            context.drawLiquidGlass(
                panel.getX(), panel.getY(), panel.getWidth(), panel.getHeight(),
                5.0F, bJ.getDistortion(),
                BorderRadius.all(12.0F),
                ec.getLiquidGlassColor().mulAlpha(alpha * bJ.glass())
            );
            context.drawRoundedRect(
                panel.getX(), panel.getY(), panel.getWidth(), panel.getHeight(),
                BorderRadius.all(12.0F),
                bJ.getBackgroundColor().withAlpha((int)(255.0F * (0.8F - 0.6F * bJ.glass()) * alpha))
            );
        } else {
            context.drawRoundedRect(panel.getX(), panel.getY(), panel.getWidth(), panel.getHeight(),
                BorderRadius.all(12.0F), ec.getBackgroundColor());
        }

        float x = panel.getX();
        float y = panel.getY();
        float w = panel.getWidth();
        float h = panel.getHeight();

        drawTopBar(context, x, y, w, alpha);
        drawTokenField(context, x, y, w, alpha);
        drawTabs(context, x, y, w, alpha);
        drawContent(context, x, y, w, h, alpha);
        drawBottomButtons(context, x, y, w, alpha);
    }

    private void drawTopBar(UIContext context, float x, float y, float w, float alpha) {
        float barH = 36.0F;
        context.drawRoundedRect(x, y, w, barH, BorderRadius.all(12.0F), ec.getTextColor().withAlpha((int)(10.0F * alpha)));

        Font titleFont = Fonts.SEMIBOLD.getFont(10.0F);
        context.drawText(titleFont, av.translate("menu.events"), x + 15.0F, y + 12.0F, ec.getTextColor().mulAlpha(alpha));

        float closeSize = 8.0F;
        float closeX = x + w - closeSize - 15.0F;
        float closeY = y + 12.0F;
        context.drawTexture(Mytheria.id("icons/close.png"), closeX, closeY, closeSize, closeSize, ec.getTextColor().mulAlpha(alpha));
        if (er.isHovered(closeX, closeY, closeSize, closeSize, context)) {
            eo.set(en.HAND);
        }
    }

    private void drawTokenField(UIContext context, float x, float y, float w, float alpha) {
        float fieldY = y + 42.0F;
        float fieldH = 16.0F;
        float fieldW = w - 20.0F;
        float fieldX = x + 10.0F;

        context.drawRoundedRect(fieldX, fieldY, fieldW, fieldH, BorderRadius.all(4.0F), ec.getTextColor().withAlpha((int)(20.0F * alpha)));
        this.tokenField.set(fieldX + 4.0F, fieldY + 3.0F, fieldW - 60.0F, fieldH - 6.0F);
        this.tokenField.setTextColor(ec.getTextColor().mulAlpha(alpha));
        this.tokenField.setAlpha(alpha);
        this.tokenField.render(context);

        if (er.isHovered(fieldX, fieldY, fieldW, fieldH, context)) {
            eo.set(en.TEXT);
        }

        float fetchBtnW = 50.0F;
        float fetchBtnX = fieldX + fieldW - fetchBtnW - 4.0F;
        float fetchBtnH = 12.0F;
        float fetchBtnY = fieldY + 2.0F;
        context.drawRoundedRect(fetchBtnX, fetchBtnY, fetchBtnW, fetchBtnH, BorderRadius.all(3.0F),
            ec.getAccentColor().mulAlpha(alpha));
        context.drawCenteredText(Fonts.REGULAR.getFont(6.0F), "Загрузить", fetchBtnX + fetchBtnW / 2.0F, fetchBtnY + 3.0F, ec.WHITE.mulAlpha(alpha));
        if (er.isHovered(fetchBtnX, fetchBtnY, fetchBtnW, fetchBtnH, context)) {
            eo.set(en.HAND);
        }

        this.apiToken = this.tokenField.getBuiltText();
    }

    private void drawTabs(UIContext context, float x, float y, float w, float alpha) {
        float tabY = y + 64.0F;
        float tabH = 16.0F;
        float tabW = (w - 24.0F) / 2.0F;

        for (int i = 0; i < tabNames.length; i++) {
            float tabX = x + 12.0F + i * (tabW + 4.0F);
            boolean selected = i == selectedTab;

            if (selected) {
                context.drawRoundedRect(tabX, tabY, tabW, tabH, BorderRadius.all(4.0F),
                    ec.getAccentColor().mulAlpha(alpha));
                context.drawCenteredText(Fonts.REGULAR.getFont(7.0F), tabNames[i],
                    tabX + tabW / 2.0F, tabY + 4.0F, ec.WHITE.mulAlpha(alpha));
            } else {
                context.drawRoundedRect(tabX, tabY, tabW, tabH, BorderRadius.all(4.0F),
                    ec.getTextColor().withAlpha((int)(20.0F * alpha)));
                context.drawCenteredText(Fonts.REGULAR.getFont(7.0F), tabNames[i],
                    tabX + tabW / 2.0F, tabY + 4.0F, ec.getTextColor().mulAlpha(alpha));
            }

            if (er.isHovered(tabX, tabY, tabW, tabH, context)) {
                eo.set(en.HAND);
            }
        }
    }

    private void drawContent(UIContext context, float x, float y, float w, float h, float alpha) {
        float contentY = y + 86.0F;
        float contentH = h - 130.0F;
        float contentX = x + 10.0F;
        float contentW = w - 20.0F;

        context.drawRoundedRect(contentX, contentY, contentW, contentH, BorderRadius.all(4.0F),
            ec.getTextColor().withAlpha((int)(10.0F * alpha)));

        if (loading) {
            context.drawCenteredText(Fonts.REGULAR.getFont(7.0F), "Загрузка...",
                contentX + contentW / 2.0F, contentY + contentH / 2.0F - 4.0F, ec.getTextColor().mulAlpha(alpha));
            return;
        }

        if (!lastError.isEmpty()) {
            context.drawCenteredText(Fonts.REGULAR.getFont(7.0F), lastError,
                contentX + contentW / 2.0F, contentY + contentH / 2.0F - 4.0F, eb.RED.mulAlpha(alpha));
            return;
        }

        if (selectedTab == 0) {
            drawEventsList(context, contentX, contentY, contentW, contentH, alpha);
        } else {
            drawMinesList(context, contentX, contentY, contentW, contentH, alpha);
        }
    }

    private void drawEventsList(UIContext context, float x, float y, float w, float h, float alpha) {
        if (events.isEmpty()) {
            context.drawCenteredText(Fonts.REGULAR.getFont(7.0F), "Нет активных ивентов",
                x + w / 2.0F, y + h / 2.0F - 4.0F, ec.getTextColor().mulAlpha(alpha));
            return;
        }

        float itemH = 28.0F;
        float clipY = y + 2.0F;
        float clipH = h - 4.0F;
        int visibleCount = (int)(clipH / itemH) + 1;
        int maxScroll = Math.max(0, events.size() - visibleCount);
        targetScrollOffset = Math.max(0, Math.min(targetScrollOffset, maxScroll));
        scrollOffset += (targetScrollOffset - scrollOffset) * 0.2F;
        int scroll = Math.round(scrollOffset);

        for (int i = scroll; i < Math.min(events.size(), scroll + visibleCount + 1); i++) {
            FunTimeApi.EventData ev = events.get(i);
            float itemY = clipY + (i - scroll) * itemH;

            if (itemY + itemH > clipY + clipH) break;

            boolean hovered = er.isHovered(x, itemY, w, itemH, context);

            eb bgColor = hovered ? ec.getAccentColor().withAlpha((int)(40.0F * alpha)) : ec.getTextColor().withAlpha((int)(10.0F * alpha));
            context.drawRoundedRect(x + 2.0F, itemY, w - 4.0F, itemH - 2.0F, BorderRadius.all(3.0F), bgColor);

            eb phaseColor = getPhaseColor(ev.phase()).mulAlpha(alpha);
            context.drawRoundedRect(x + 4.0F, itemY + 4.0F, 3.0F, itemH - 10.0F, BorderRadius.all(1.5F), phaseColor);

            Font smallFont = Fonts.REGULAR.getFont(6.0F);
            Font tinyFont = Fonts.REGULAR.getFont(5.0F);

            String name = ev.server() + " - " + ev.eventType();
            context.drawText(smallFont, name, x + 10.0F, itemY + 4.0F, ec.getTextColor().mulAlpha(alpha));

            String phaseText = "Фаза: " + ev.phase();
            context.drawText(tinyFont, phaseText, x + 10.0F, itemY + 14.0F, phaseColor);

            if (ev.loot() != null && !ev.loot().isEmpty()) {
                context.drawText(tinyFont, ev.loot(), x + 10.0F, itemY + 20.0F, ec.getTextColor().withAlpha((int)(120.0F * alpha)));
            }

            if (ev.timeLeft() > 0) {
                String time = formatTime(ev.timeLeft());
                context.drawRightText(tinyFont, time, x + w - 8.0F, itemY + 6.0F, ec.getTextColor().withAlpha((int)(150.0F * alpha)));
            }

            if (hovered) {
                eo.set(en.HAND);
            }
        }
    }

    private void drawMinesList(UIContext context, float x, float y, float w, float h, float alpha) {
        if (mines.isEmpty()) {
            context.drawCenteredText(Fonts.REGULAR.getFont(7.0F), "Нет доступных шахт",
                x + w / 2.0F, y + h / 2.0F - 4.0F, ec.getTextColor().mulAlpha(alpha));
            return;
        }

        float itemH = 28.0F;
        float clipY = y + 2.0F;
        float clipH = h - 4.0F;
        int visibleCount = (int)(clipH / itemH) + 1;
        int maxScroll = Math.max(0, mines.size() - visibleCount);
        targetScrollOffset = Math.max(0, Math.min(targetScrollOffset, maxScroll));
        scrollOffset += (targetScrollOffset - scrollOffset) * 0.2F;
        int scroll = Math.round(scrollOffset);

        for (int i = scroll; i < Math.min(mines.size(), scroll + visibleCount + 1); i++) {
            FunTimeApi.MineData mine = mines.get(i);
            float itemY = clipY + (i - scroll) * itemH;

            if (itemY + itemH > clipY + clipH) break;

            boolean hovered = er.isHovered(x, itemY, w, itemH, context);

            eb bgColor = hovered ? ec.getAccentColor().withAlpha((int)(40.0F * alpha)) : ec.getTextColor().withAlpha((int)(10.0F * alpha));
            context.drawRoundedRect(x + 2.0F, itemY, w - 4.0F, itemH - 2.0F, BorderRadius.all(3.0F), bgColor);

            eb rarityColor = getRarityColor(mine.mineRarity()).mulAlpha(alpha);
            context.drawRoundedRect(x + 4.0F, itemY + 4.0F, 3.0F, itemH - 10.0F, BorderRadius.all(1.5F), rarityColor);

            Font smallFont = Fonts.REGULAR.getFont(6.0F);
            Font tinyFont = Fonts.REGULAR.getFont(5.0F);

            context.drawText(smallFont, mine.mineName(), x + 10.0F, itemY + 4.0F, ec.getTextColor().mulAlpha(alpha));

            context.drawText(tinyFont, mine.serverRuName(), x + 10.0F, itemY + 14.0F, rarityColor);

            if (mine.nextMineRarity() != null && !mine.nextMineRarity().isEmpty()) {
                context.drawText(tinyFont, "След: " + mine.nextMineRarity(), x + 10.0F, itemY + 20.0F,
                    ec.getTextColor().withAlpha((int)(120.0F * alpha)));
            }

            if (mine.resetSecondsLeft() > 0) {
                String time = formatTime(mine.resetSecondsLeft());
                context.drawRightText(tinyFont, time, x + w - 8.0F, itemY + 6.0F, ec.getTextColor().withAlpha((int)(150.0F * alpha)));
            }

            if (hovered) {
                eo.set(en.HAND);
            }
        }
    }

    private void drawBottomButtons(UIContext context, float x, float y, float w, float alpha) {
        float btnSize = 30.0F;
        float gap = 5.0F;
        float totalW = btnSize * 3.0F + gap * 2.0F;
        float btnY = y + panel.getHeight() + 10.0F;
        float btnX1 = x + (w - totalW) / 2.0F;
        float btnX2 = btnX1 + btnSize + gap;
        float btnX3 = btnX2 + btnSize + gap;

        drawButton(context, btnX1, btnY, btnSize, "icons/inventory.png", alpha);
        drawButton(context, btnX2, btnY, btnSize, "icons/way2.png", alpha);
        drawButton(context, btnX3, btnY, btnSize, "icons/online.png", alpha);
    }

    private void drawButton(UIContext context, float bx, float by, float size, String icon, float alpha) {
        if (bJ.showGlass()) {
            context.drawLiquidGlass(bx, by, size, size, bJ.getGlassBlur(), bJ.getDistortion(),
                BorderRadius.all(6.0F), ec.getLiquidGlassColor().mulAlpha(alpha * bJ.getGlassAlpha()));
            context.drawRoundedRect(bx, by, size, size, BorderRadius.all(6.0F),
                bJ.getBackgroundColor().withAlpha((int)(255.0F * (0.8F - 0.6F * bJ.glass()) * alpha)));
        } else {
            context.drawRoundedRect(bx, by, size, size, BorderRadius.all(6.0F), ec.getBackgroundColor().mulAlpha(alpha));
        }
        float iconSize = 12.0F;
        context.drawTexture(Mytheria.id(icon), bx + (size - iconSize) / 2.0F, by + (size - iconSize) / 2.0F,
            iconSize, iconSize, ec.WHITE);
        if (er.isHovered(bx, by, size, size, context)) {
            eo.set(en.HAND);
        }
    }

    @Override
    public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
        float closeSize = 8.0F;
        float closeX = panel.getX() + panel.getWidth() - closeSize - 15.0F;
        float closeY = panel.getY() + 12.0F;
        if (er.isHovered(closeX, closeY, closeSize, closeSize, mouseX, mouseY)) {
            this.closing = true;
            this.backToClickGUI = false;
            return;
        }

        float fieldY = panel.getY() + 42.0F;
        float fieldH = 16.0F;
        float fieldW = panel.getWidth() - 20.0F;
        float fieldX = panel.getX() + 10.0F;
        boolean fieldHovered = er.isHovered(fieldX, fieldY, fieldW, fieldH, mouseX, mouseY);
        this.tokenField.setFocused(fieldHovered);
        if (fieldHovered) {
            this.tokenField.onMouseClicked(mouseX, mouseY, button);
        }

        float fetchBtnW = 50.0F;
        float fetchBtnX = fieldX + fieldW - fetchBtnW - 4.0F;
        float fetchBtnH = 12.0F;
        float fetchBtnY = fieldY + 2.0F;
        if (er.isHovered(fetchBtnX, fetchBtnY, fetchBtnW, fetchBtnH, mouseX, mouseY)) {
            this.scrollOffset = 0;
            this.targetScrollOffset = 0;
            fetchData();
            return;
        }

        float tabY = panel.getY() + 64.0F;
        float tabH = 16.0F;
        float tabW = (panel.getWidth() - 24.0F) / 2.0F;
        for (int i = 0; i < tabNames.length; i++) {
            float tabX = panel.getX() + 12.0F + i * (tabW + 4.0F);
            if (er.isHovered(tabX, tabY, tabW, tabH, mouseX, mouseY)) {
                selectedTab = i;
                scrollOffset = 0;
                targetScrollOffset = 0;
                return;
            }
        }

        float btnSize = 30.0F;
        float gap = 5.0F;
        float totalW = btnSize * 3.0F + gap * 2.0F;
        float btnY = panel.getY() + panel.getHeight() + 10.0F;
        float btnX1 = panel.getX() + (panel.getWidth() - totalW) / 2.0F;
        float btnX3 = btnX1 + (btnSize + gap) * 2;

        if (er.isHovered(btnX1, btnY, btnSize, btnSize, mouseX, mouseY)) {
            mc.setScreen(new dP());
            return;
        }
        float btnX2 = btnX1 + btnSize + gap;
        if (er.isHovered(btnX2, btnY, btnSize, btnSize, mouseX, mouseY)) {
            mc.setScreen(new dX());
            return;
        }

        if (er.isHovered(btnX3, btnY, btnSize, btnSize, mouseX, mouseY)) {
            this.closing = true;
            this.backToClickGUI = true;
            return;
        }

        super.onMouseClicked(mouseX, mouseY, button);
    }

    @Override
    public boolean charTyped(char chr, int modifiers) {
        if (this.tokenField.isFocused()) {
            return this.tokenField.charTyped(chr, modifiers);
        }
        return super.charTyped(chr, modifiers);
    }

    @Override
    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        if (this.tokenField.isFocused()) {
            this.tokenField.onKeyPressed(keyCode, scanCode, modifiers);
            this.apiToken = this.tokenField.getBuiltText();
            return true;
        }
        return super.keyPressed(keyCode, scanCode, modifiers);
    }

    @Override
    public boolean onMouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
        targetScrollOffset -= (float)(verticalAmount * 2.0);
        return true;
    }

    private eb getPhaseColor(String phase) {
        if (phase == null) return eb.WHITE;
        return switch (phase.toLowerCase()) {
            case "war", "война" -> eb.RED;
            case "peace", "мир" -> eb.GREEN;
            case "trade", "торговля" -> eb.YELLOW;
            case "hunt", "охота" -> new eb(255.0F, 165.0F, 0.0F);
            default -> ec.getAccentColor();
        };
    }

    private eb getRarityColor(String rarity) {
        if (rarity == null) return eb.WHITE;
        return switch (rarity.toLowerCase()) {
            case "common", "обычная" -> eb.WHITE;
            case "uncommon", "необычная" -> eb.GREEN;
            case "rare", "редкая" -> eb.BLUE;
            case "epic", "эпическая" -> new eb(160.0F, 32.0F, 240.0F);
            case "legendary", "легендарная" -> new eb(255.0F, 215.0F, 0.0F);
            default -> ec.getAccentColor();
        };
    }

    private String formatTime(long seconds) {
        if (seconds < 60) return seconds + "с";
        if (seconds < 3600) return (seconds / 60) + "м " + (seconds % 60) + "с";
        return (seconds / 3600) + "ч " + ((seconds % 3600) / 60) + "м";
    }
}
