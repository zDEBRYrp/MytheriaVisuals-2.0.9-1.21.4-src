package a;

import a.ec;
import a.eb;
import a.er;
import a.eo;
import a.en;
import a.av;
import a.aj;
import a.ar;
import a.uc.bJ;
import a.uc.dZ;
import a.uc.cK;
import a.uc.dP;
import a.uc.dX;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
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
    private boolean tokenVisible = false;

    private float scrollOffset = 0;
    private float targetScrollOffset = 0;

    private List<FunTimeApi.EventData> events = new ArrayList<>();
    private List<FunTimeApi.MineData> mines = new ArrayList<>();
    private boolean loading = false;
    private String lastError = "";

    private String selectedServer = "";
    private final String[] serverTypes = new String[]{"", "anarchy", "skyblock"};

    private int selectedServerType = 0;

    private long lastFetchTime = 0;
    private long nowMillis = 0;

    private static final File TOKEN_FILE = new File(ar.DIRECTORY, "funtime_token.json");

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
        this.lastFetchTime = System.currentTimeMillis();
        loadToken();
    }

    public void tick() {
        super.tick();
        this.nowMillis = System.currentTimeMillis();
    }

    // --- Token persistence ---

    private void loadToken() {
        if (TOKEN_FILE.exists()) {
            try (FileReader r = new FileReader(TOKEN_FILE)) {
                JsonObject json = (JsonObject) JsonParser.parseReader(r);
                if (json.has("token")) {
                    this.apiToken = json.get("token").getAsString();
                    this.tokenField.clear();
                    this.tokenField.paste(this.apiToken);
                }
            } catch (Exception ignored) {}
        }
    }

    private void saveToken() {
        try {
            TOKEN_FILE.getParentFile().mkdirs();
            JsonObject json = new JsonObject();
            json.addProperty("token", this.apiToken);
            try (FileWriter w = new FileWriter(TOKEN_FILE)) {
                w.write(ar.GSON.toJson(json));
            }
        } catch (Exception ignored) {}
    }

    // --- Fetch ---

    private void fetchData() {
        this.apiToken = this.tokenField.getBuiltText();
        if (apiToken.isEmpty()) {
            lastError = "Введите API токен";
            return;
        }
        saveToken();
        loading = true;
        lastError = "";
        lastFetchTime = System.currentTimeMillis();
        String serverType = serverTypes[selectedServerType].isEmpty() ? "all" : serverTypes[selectedServerType];

        FunTimeApi.fetchEvents(apiToken, "all", serverType)
            .whenComplete((result, ex) -> {
                events = result != null ? result : new ArrayList<>();
                loading = false;
            });

        FunTimeApi.fetchMines(apiToken, serverType)
            .whenComplete((result, ex) -> {
                List<FunTimeApi.MineData> raw = result != null ? result : new ArrayList<>();
                mines = filterAndSortMines(raw);
                loading = false;
            });
    }

    // --- Filter finished + sort newest first ---

    private List<FunTimeApi.MineData> filterAndSortMines(List<FunTimeApi.MineData> raw) {
        List<FunTimeApi.MineData> filtered = new ArrayList<>();
        for (FunTimeApi.MineData m : raw) {
            if (m.resetSecondsLeft() > 0) {
                filtered.add(m);
            }
        }
        Collections.sort(filtered, Comparator.comparingLong(FunTimeApi.MineData::resetSecondsLeft));
        return filtered;
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

    // --- Render ---

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

        float inputW = fieldW - 80.0F;
        this.tokenField.set(fieldX + 4.0F, fieldY + 3.0F, inputW, fieldH - 6.0F);
        this.tokenField.setTextColor(ec.getTextColor().mulAlpha(alpha));
        this.tokenField.setAlpha(alpha);

        if (!tokenVisible && !this.apiToken.isEmpty()) {
            Font tinyFont = Fonts.REGULAR.getFont(6.0F);
            String masked = "*".repeat(Math.min(this.apiToken.length(), 30));
            context.drawText(tinyFont, masked, fieldX + 6.0F, fieldY + 5.0F, ec.getTextColor().mulAlpha(alpha));
        } else {
            this.tokenField.render(context);
        }

        if (er.isHovered(fieldX, fieldY, fieldW, fieldH, context)) {
            eo.set(en.TEXT);
        }

        float toggleBtnW = 14.0F;
        float toggleBtnH = 12.0F;
        float toggleBtnX = fieldX + fieldW - 50.0F - toggleBtnW - 2.0F;
        float toggleBtnY = fieldY + 2.0F;
        eb toggleColor = tokenVisible ? ec.getAccentColor().mulAlpha(alpha) : ec.getTextColor().withAlpha((int)(40.0F * alpha));
        context.drawRoundedRect(toggleBtnX, toggleBtnY, toggleBtnW, toggleBtnH, BorderRadius.all(3.0F), toggleColor);
        Font tinyFont = Fonts.REGULAR.getFont(5.0F);
        String eyeText = tokenVisible ? "Show" : "Hide";
        context.drawCenteredText(tinyFont, eyeText, toggleBtnX + toggleBtnW / 2.0F, toggleBtnY + 3.0F, ec.WHITE.mulAlpha(alpha));
        if (er.isHovered(toggleBtnX, toggleBtnY, toggleBtnW, toggleBtnH, context)) {
            eo.set(en.HAND);
        }

        float fetchBtnW = 36.0F;
        float fetchBtnX = fieldX + fieldW - fetchBtnW - 4.0F;
        float fetchBtnH = 12.0F;
        float fetchBtnY = fieldY + 2.0F;
        context.drawRoundedRect(fetchBtnX, fetchBtnY, fetchBtnW, fetchBtnH, BorderRadius.all(3.0F),
            ec.getAccentColor().mulAlpha(alpha));
        context.drawCenteredText(Fonts.REGULAR.getFont(6.0F), "Load", fetchBtnX + fetchBtnW / 2.0F, fetchBtnY + 3.0F, ec.WHITE.mulAlpha(alpha));
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
        scrollOffset += (targetScrollOffset - scrollOffset) * 0.15F;
        if (Math.abs(scrollOffset - targetScrollOffset) < 0.5F) scrollOffset = targetScrollOffset;
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
        scrollOffset += (targetScrollOffset - scrollOffset) * 0.15F;
        if (Math.abs(scrollOffset - targetScrollOffset) < 0.5F) scrollOffset = targetScrollOffset;
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

            context.drawText(smallFont, mine.mineName(), x + 10.0F, itemY + 4.0F, rarityColor);

            context.drawText(tinyFont, mine.serverRuName(), x + 10.0F, itemY + 14.0F, ec.getTextColor().mulAlpha(alpha));

            if (mine.nextMineRarity() != null && !mine.nextMineRarity().isEmpty()) {
                context.drawText(tinyFont, "След: " + mine.nextMineRarity(), x + 10.0F, itemY + 20.0F,
                    ec.getTextColor().withAlpha((int)(120.0F * alpha)));
            }

            long elapsed = (System.currentTimeMillis() - lastFetchTime) / 1000;
            long remaining = Math.max(0, mine.resetSecondsLeft() - elapsed);
            String time = formatTime(remaining);
            eb timeColor = remaining <= 10 ? eb.RED : remaining <= 30 ? eb.YELLOW : ec.getTextColor().withAlpha((int)(150.0F * alpha));
            context.drawRightText(tinyFont, time, x + w - 8.0F, itemY + 6.0F, timeColor.mulAlpha(alpha));

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

        // Toggle token visibility
        float toggleBtnW = 14.0F;
        float toggleBtnH = 12.0F;
        float toggleBtnX = fieldX + fieldW - 50.0F - toggleBtnW - 2.0F;
        float toggleBtnY = fieldY + 2.0F;
        if (er.isHovered(toggleBtnX, toggleBtnY, toggleBtnW, toggleBtnH, mouseX, mouseY)) {
            tokenVisible = !tokenVisible;
            return;
        }

        boolean fieldHovered = er.isHovered(fieldX, fieldY, fieldW, fieldH, mouseX, mouseY);
        this.tokenField.setFocused(fieldHovered);
        if (fieldHovered) {
            this.tokenField.onMouseClicked(mouseX, mouseY, button);
        }

        float fetchBtnW = 36.0F;
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

        float contentX = panel.getX() + 10.0F;
        float contentY = panel.getY() + 86.0F;
        float contentW = panel.getWidth() - 20.0F;
        float contentH = panel.getHeight() - 130.0F;
        float itemH = 28.0F;
        float clipY = contentY + 2.0F;
        float clipH = contentH - 4.0F;
        int visibleCount = (int)(clipH / itemH) + 1;

        if (selectedTab == 0 && !events.isEmpty()) {
            int maxScroll = Math.max(0, events.size() - visibleCount);
            int scroll = Math.round(Math.max(0, Math.min(targetScrollOffset, maxScroll)));
            for (int i = scroll; i < Math.min(events.size(), scroll + visibleCount + 1); i++) {
                float itemY = clipY + (i - scroll) * itemH;
                if (itemY + itemH > clipY + clipH) break;
                if (er.isHovered(contentX, itemY, contentW, itemH, mouseX, mouseY)) {
                    connectToServer(events.get(i).server());
                    return;
                }
            }
        } else if (selectedTab == 1 && !mines.isEmpty()) {
            int maxScroll = Math.max(0, mines.size() - visibleCount);
            int scroll = Math.round(Math.max(0, Math.min(targetScrollOffset, maxScroll)));
            for (int i = scroll; i < Math.min(mines.size(), scroll + visibleCount + 1); i++) {
                float itemY = clipY + (i - scroll) * itemH;
                if (itemY + itemH > clipY + clipH) break;
                if (er.isHovered(contentX, itemY, contentW, itemH, mouseX, mouseY)) {
                    connectToServer(mines.get(i).serverKey());
                    return;
                }
            }
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
        if (rarity == null) return new eb(128.0F, 128.0F, 128.0F);
        return switch (rarity.toLowerCase()) {
            case "common", "обычная", "default" -> new eb(128.0F, 128.0F, 128.0F);
            case "uncommon", "необычная" -> eb.GREEN;
            case "rare", "редкая" -> eb.BLUE;
            case "epic", "эпическая" -> new eb(160.0F, 32.0F, 240.0F);
            case "legendary", "легендарная" -> new eb(0.0F, 255.0F, 255.0F);
            case "mythical", "мистическая" -> new eb(180.0F, 0.0F, 255.0F);
            default -> new eb(128.0F, 128.0F, 128.0F);
        };
    }

    private String formatTime(long seconds) {
        if (seconds < 60) return seconds + "с";
        if (seconds < 3600) return (seconds / 60) + "м " + (seconds % 60) + "с";
        return (seconds / 3600) + "ч " + ((seconds % 3600) / 60) + "м";
    }
}
