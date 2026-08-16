package a.uc;
import a.b;
import a.by;
import a.cc;
import a.ew;
import a.fo;
import a.cn;
import a.l;
import a.dr;
import a.er;
import a.az;
import a.dx;
import a.r;
import a.as;
import a.ed;
import a.dd;
import a.ab;
import a.cj;
import a.cx;
import a.eg;
import a.ae;
import a.de;
import a.m;
import a.dw;
import a.d;
import a.bw;
import a.fj;
import a.v;
import a.g;
import a.bs;
import a.ce;
import a.at;
import a.dh;
import a.br;
import a.em;
import a.ct;
import a.cr;
import a.ci;
import a.aq;
import a.cg;
import a.j;
import a.bc;
import a.ag;
import a.ei;
import a.ao;
import a.cp;
import a.di;
import a.ak;
import a.aj;
import a.o;
import a.ef;
import a.dy;
import a.cd;
import a.eh;
import a.eb;
import a.fe;
import a.bk;
import a.ap;
import a.fp;
import a.ft;
import a.cf;
import a.bf;
import a.en;
import a.bi;
import a.dc;
import a.fq;
import a.au;
import a.bh;
import a.af;
import a.a;
import a.fm;
import a.bn;
import a.ah;
import a.bd;
import a.z;
import a.i;
import a.fd;
import a.ch;
import a.da;
import a.fb;
import a.df;
import a.av;
import a.ek;
import a.es;
import a.al;
import a.bq;
import a.ee;
import a.n;
import a.k;
import a.cb;
import a.el;
import a.eo;
import a.bp;
import a.ad;
import a.ck;
import a.doItem;
import a.t;
import a.db;
import a.fs;
import a.an;
import a.bt;
import a.fy;
import a.ey;
import a.dj;
import a.ff;
import a.fk;
import a.bg;
import a.fg;
import a.p;
import a.dv;
import a.y;
import a.fr;
import a.bu;
import a.dt;
import a.et;
import a.cl;
import a.cs;
import a.ec;
import a.dg;
import a.x;
import a.fl;
import a.aw;
import a.bl;
import a.cu;
import a.cw;
import a.w;
import a.fx;
import a.bo;
import a.dl;
import a.c;
import a.fu;
import a.f;
import a.fa;
import a.be;
import a.dk;
import a.bm;
import a.aa;
import a.ez;
import a.cy;
import a.bx;
import a.cq;
import a.ej;
import a.ex;
import a.du;
import a.s;
import a.dm;
import a.dn;
import a.dO;
import a.fc;
import a.ea;
import a.e;
import a.fw;
import a.dq;
import a.ds;
import a.fn;
import a.fi;
import a.ax;
import a.h;
import a.ep;
import a.cv;
import a.ca;
import a.bv;
import a.fv;
import a.q;
import a.fz;
import a.cz;
import a.ay;
import a.eq;
import a.dz;
import a.ev;
import a.ba;
import a.u;
import a.eu;
import a.ai;
import a.ac;
import a.bj;
import a.ar;
import a.am;
import a.bb;
import a.fh;
import a.dp;
import a.co;
import a.cm;
import a.bz;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.systems.setting.Setting;
import nesquik.mytheria.systems.setting.SettingsContainer;
import nesquik.mytheria.utility.animation.base.Easing;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import nesquik.mytheria.utility.interfaces.IScaledResolution;

public abstract class cP implements SettingsContainer, IMinecraft {
   protected float x;
   protected float y;
   protected float width;
   protected float height;
   protected final dZ animation = new dZ(300L, 0.0F, Easing.BAKEK_SIZE);
   protected final dZ visible = new dZ(300L, 0.0F, Easing.BAKEK_SIZE);
   protected final dZ selecting = new dZ(300L, 0.0F, Easing.BAKEK_SIZE);
   protected final dZ dragAnim = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
   private final dZ a = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
   private final dZ b = new dZ(700L, 0.0F, Easing.SMOOTH_STEP);
   private final dZ c = new dZ(300L, 0.0F, Easing.BAKEK_SIZE);
   private final dZ d = new dZ(300L, 0.0F, Easing.BAKEK_SIZE);
   protected boolean showing;
   protected boolean select;
   private List<Setting> e = new ArrayList<>();
   protected boolean dragging;
   private float f;
   private float g;
   protected float startDragX;
   protected float startDragY;
   protected final String name;
   protected final String icon;

   public cP(String name, String icon) {
      this.name = name;
      this.icon = icon;
   }

   private void a() {
      try {
         Mytheria.getInstance().getFileManager().saveClientFiles();
      } catch (Exception var2) {
         Mytheria.LOGGER.error("Failed to save HUD element data: {}", var2.getMessage());
      }
   }

   public void render(UIContext context) {
      this.update(context);
      float var2 = Math.max(0.0F, Math.min(1.0F, this.animation.getValue()));
      float var3 = Math.max(0.0F, Math.min(1.0F, this.visible.getValue()));
      float var4 = var2 * var3;
      if (var4 != 0.0F) {
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, Math.min(1.0F, var4));
         float var5 = 0.5F + var4 * 0.5F - 0.05F * this.selecting.getValue();
         fl.scale(context.getMatrices(), this.x + this.width / 2.0F, this.y + this.height / 2.0F, var5);
         this.renderComponent(context);
         fl.end(context.getMatrices());
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      }
   }

   protected abstract void renderComponent(UIContext var1);

   public void update(UIContext context) {
      float var2 = this.c.getValue();
      this.c.update(this.width);
      float var3 = this.c.getValue();
      float var4 = var3 - var2;
      boolean var5 = this.x + this.width / 2.0F < IScaledResolution.sr.getScaledWidth() / 2.0F;
      this.width = var3;
      this.dragAnim.update(this.dragging);
      this.animation.setEasing(Easing.BAKEK);
      this.animation.update(this.showing);
      this.visible.setEasing(Easing.BAKEK);
      boolean var6 = this.show();
      this.visible.update(var6);
      this.selecting.update(this.select);
      this.a.update(this.animation.getValue() >= 0.6F);
      if (this.dragging) {
         this.x = Math.clamp(context.getMouseX() - this.f, 0.0F, IScaledResolution.sr.getScaledWidth() - this.width);
         this.y = Math.clamp(context.getMouseY() - this.g, 0.0F, IScaledResolution.sr.getScaledHeight() - this.height);
         if (!(this instanceof dc)) {
            for (cM var8 : Mytheria.getInstance().getHud().getGrid().getLines()) {
               if (var8.getType() == cM.a.VERTICAL) {
                  this.x = this.a(var8, this.x, List.of(0.0F, this.width, this.width / 2.0F), List.of(0.0F, -this.width, -this.width / 2.0F));
               } else {
                  this.y = this.a(var8, this.y, List.of(0.0F, this.height), List.of(0.0F, -this.height));
               }
            }
         }
      }

      if (this.isHovered(context) && this.animation.getValue() >= 1.0F) {
         eo.set(en.HAND);
      }
   }

   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      if (this.isHovered(mouseX, mouseY) && this.showing) {
         if (button == MouseButton.LEFT) {
            this.dragging = true;
            this.f = (float)(mouseX - this.x);
            this.g = (float)(mouseY - this.y);
            this.startDragX = this.x;
            this.startDragY = this.y;
         } else if (button == MouseButton.RIGHT) {
            this.select = true;
            this.b.setValue(0.0F);
            cC var6 = new cC((float)mouseX, (float)mouseY, 110.0F, 6.0F).title(this.e.isEmpty() ? "actions" : "settings").separator();

            for (Setting var8 : this.e) {
               var6.setting(var8);
            }

            var6.button(av.translate("remove"), "icons/hud/trash.png", popup1 -> {
               this.showing = false;
               popup1.setShowing(false);
               Mytheria.getInstance().getFileManager().writeFile("client");
            }).onClose(() -> this.select = false);
            Mytheria.getInstance().getHud().getPopups().add(var6);
         }
      }
   }

   public void onMouseReleased(double mouseX, double mouseY, MouseButton button) {
      if (this.dragging && button == MouseButton.LEFT) {
         this.dragging = false;
         if (this.x != this.startDragX || this.y != this.startDragY) {
            Mytheria.getInstance().getHud().getHistoryManager().registerMove(this, this.startDragX, this.startDragY, this.x, this.y);
         }

         Mytheria.getInstance().getFileManager().writeFile("client");
      }
   }

   private float a(cM line, float pos, List<Float> offsets, List<Float> adjustments) {
      for (int var5 = 0; var5 < offsets.size(); var5++) {
         float var6 = Math.abs(pos + (Float)offsets.get(var5) - line.getPos());
         if (var6 < 25.0F) {
            line.setActive(true);
         }

         if (var6 < 5.0F) {
            pos = line.getPos() + (Float)adjustments.get(var5);
         }
      }

      return pos;
   }

   public boolean show() {
      return true;
   }

   public boolean isHovered(float mouseX, float mouseY) {
      return er.isHovered(this.x, this.y, this.width, this.height, mouseX, mouseY);
   }

   public boolean isHovered(double mouseX, double mouseY) {
      return er.isHovered(this.x, this.y, this.width, this.height, mouseX, mouseY);
   }

   public boolean isHovered(UIContext context) {
      return this.isHovered(context.getMouseX(), context.getMouseY());
   }

   public void pos(float x, float y) {
      this.x = x;
      this.y = y;
   }

   @Generated
   public float getX() {
      return this.x;
   }

   @Generated
   public float getY() {
      return this.y;
   }

   @Generated
   public float getWidth() {
      return this.width;
   }

   @Generated
   public float getHeight() {
      return this.height;
   }

   @Generated
   public dZ getAnimation() {
      return this.animation;
   }

   @Generated
   public dZ getVisible() {
      return this.visible;
   }

   @Generated
   public dZ getSelecting() {
      return this.selecting;
   }

   @Generated
   public dZ getDragAnim() {
      return this.dragAnim;
   }

   @Generated
   public dZ getBlurAnim() {
      return this.a;
   }

   @Generated
   public dZ getLoadingAnim() {
      return this.b;
   }

   @Generated
   public dZ getWidthAnim() {
      return this.c;
   }

   @Generated
   public dZ getHeightAnim() {
      return this.d;
   }

   @Generated
   public boolean isShowing() {
      return this.showing;
   }

   @Generated
   public boolean isSelect() {
      return this.select;
   }

   @Generated
   @Override
   public List<Setting> getSettings() {
      return this.e;
   }

   @Generated
   public boolean isDragging() {
      return this.dragging;
   }

   @Generated
   public float getDragX() {
      return this.f;
   }

   @Generated
   public float getDragY() {
      return this.g;
   }

   @Generated
   public float getStartDragX() {
      return this.startDragX;
   }

   @Generated
   public float getStartDragY() {
      return this.startDragY;
   }

   @Generated
   public String getName() {
      return this.name;
   }

   @Generated
   public String getIcon() {
      return this.icon;
   }

   @Generated
   public void setX(float x) {
      this.x = x;
   }

   @Generated
   public void setY(float y) {
      this.y = y;
   }

   @Generated
   public void setWidth(float width) {
      this.width = width;
   }

   @Generated
   public void setHeight(float height) {
      this.height = height;
   }

   public void setShowing(boolean showing) {
      if (this.showing != showing) {
         this.showing = showing;
         this.a();
      }
   }

   @Generated
   public void setSelect(boolean select) {
      this.select = select;
   }

   @Generated
   public void setSettings(List<Setting> settings) {
      this.e = settings;
   }

   @Generated
   public void setDragging(boolean dragging) {
      this.dragging = dragging;
   }

   @Generated
   public void setDragX(float dragX) {
      this.f = dragX;
   }

   @Generated
   public void setDragY(float dragY) {
      this.g = dragY;
   }

   @Generated
   public void setStartDragX(float startDragX) {
      this.startDragX = startDragX;
   }

   @Generated
   public void setStartDragY(float startDragY) {
      this.startDragY = startDragY;
   }
}
