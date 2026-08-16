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

import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.utility.animation.base.Easing;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import nesquik.mytheria.utility.interfaces.IScaledResolution;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ChatScreen;
import ru.kotopushka.compiler.sdk.annotations.CompileBytecode;

public class cN implements IMinecraft, IScaledResolution {
   private final List<cP> a = new ArrayList<>();
   private final List<cC> b = new ArrayList<>();
   public dc island;
   private final cQ c = new cQ();
   private final cL d = new cL();
   private String e = "";
   private cB f;
   private final fO g = new fO();
   private final EventListener<ab> h = event -> {
      UIContext var2 = UIContext.of(
         event.getContext(),
         mc.currentScreen == null ? -1 : (int)er.getMouse().getX(),
         mc.currentScreen == null ? -1 : (int)er.getMouse().getY(),
         MinecraftClient.getInstance().getRenderTickCounter().getTickDelta(false)
      );
      if (this.f == null) {
         this.f = new cB(Fonts.REGULAR.getFont(10.0F), 10.0F, 300L, Easing.BAKEK).centered();
      }

      this.e = "";
      this.d.draw(var2);
      this.d.update();

      for (cP var4 : this.a) {
         var2.getMatrices().push();
         var4.render(var2);
         var2.getMatrices().pop();
         if (var4.getSelecting().getValue() >= 0.0F) {
            var2.getMatrices().push();
            float var5 = var4.getAnimation().getValue() * var4.getVisible().getValue();
            float var6 = 0.5F + var5 * 0.5F - 0.05F * var4.getSelecting().getValue();
            var4.getLoadingAnim().setDuration(1500L);
            var4.getLoadingAnim().update(1.0F);
            if (var4.getLoadingAnim().getValue() == 1.0F) {
               var4.getLoadingAnim().setValue(0.0F);
            }

            fl.scale(var2.getMatrices(), var4.getX() + var4.getWidth() / 2.0F, var4.getY() + var4.getHeight() / 2.0F, var6);
            var2.drawLoadingRect(
               var4.getX(),
               var4.getY(),
               var4.getWidth(),
               var4 instanceof cR ? Math.max(20.0F, var4.getHeight()) : var4.getHeight(),
               var4.getLoadingAnim().getValue() * 2.2F - 0.5F,
               BorderRadius.all(var4 instanceof dc ? 7.0F : 6.0F),
               eb.WHITE.withAlpha(100.0F * var4.getSelecting().getValue())
            );
            fl.end(var2.getMatrices());
            var2.getMatrices().pop();
         }
      }

      this.f.pos(sr.getScaledWidth() / 2.0F, 30.0F);
      if (!this.e.contains(".description")) {
         this.f.update(this.e);
         this.f.render(var2);
      }

      for (cC var8 : this.b) {
         if (!(mc.currentScreen instanceof ChatScreen) && !(mc.currentScreen instanceof cO)) {
            var8.setShowing(false);
         }
      }

      if (!(mc.currentScreen instanceof ChatScreen) && !(mc.currentScreen instanceof cO)) {
         eo.set(en.DEFAULT);
      }

      this.b.removeIf(popupx -> popupx.getAnimation().getValue() == 0.0F && !popupx.isShowing());
   };
   private final EventListener<Z> i = event -> {
      UIContext var2 = UIContext.of(
         event.getContext(),
         mc.currentScreen == null ? -1 : (int)er.getMouse().getX(),
         mc.currentScreen == null ? -1 : (int)er.getMouse().getY(),
         MinecraftClient.getInstance().getRenderTickCounter().getTickDelta(false)
      );
      var2.getMatrices().push();
      var2.getMatrices().translate(0.0F, 0.0F, 2000.0F);

      for (cC var4 : this.b) {
         if (var4.getY() + var4.getHeight() > sr.getScaledHeight()) {
            var4.setY(sr.getScaledHeight() - 10.0F - var4.getHeight());
         }

         var4.render(var2);
      }

      var2.getMatrices().pop();
   };
   private final EventListener<aj> j = event -> {
      int var1 = event.getModifiers();
      int var2 = event.getKeyCode();
      if (var2 == 90 && (var1 & 2) != 0) {
         Mytheria.getInstance().getHud().getHistoryManager().undo();
      } else if (var2 == 89 && (var1 & 2) != 0) {
         Mytheria.getInstance().getHud().getHistoryManager().redo();
      }
   };
   private final EventListener<ai> k = event -> {
      boolean var2 = false;

      for (cC var4 : this.b) {
         if (var4.isHovered(event.getX(), event.getY())) {
            var4.onMouseClicked(event.getX(), event.getY(), MouseButton.fromButtonIndex(event.getButton()));
            var2 = true;
         } else {
            var4.setShowing(false);
         }
      }

      if (!var2) {
         for (cP var8 : this.a) {
            var8.onMouseClicked(event.getX(), event.getY(), MouseButton.fromButtonIndex(event.getButton()));
            if (var8.isHovered(event.getX(), event.getY()) && var8.isShowing() || var8.isDragging()) {
               return;
            }
         }

         if (event.getButton() == 1 && !this.disabledElements().isEmpty() && !(mc.currentScreen instanceof dR)) {
            cC var7 = new cC(event.getX(), event.getY(), 90.0F, 6.0F).title("Что добавляем?").separator();

            for (cP var5 : this.disabledElements()) {
               var7.button(av.translate(var5.getName()), var5.getIcon(), popup1 -> {
                  var5.pos(event.getX(), event.getY());
                  var5.setShowing(true);
                  popup1.setShowing(false);
                  Mytheria.getInstance().getFileManager().writeFile("client");
               });
            }

            this.b.add(var7);
         } else if (event.getButton() == 1 && this.disabledElements().isEmpty() && this.g.finished(600L)) {
            Mytheria.getInstance().getNotificationManager().addNotificationOther(cb.ERROR, "Элементов нет", "Элементы закончились, добавлять больше нечего");
            this.g.reset();
         }
      }
   };
   private final EventListener<ak> l = event -> {
      for (cC var3 : this.b) {
         var3.onMouseReleased(event.getX(), event.getY(), MouseButton.fromButtonIndex(event.getButton()));
         if (var3.isHovered(event.getX(), event.getY())) {
            return;
         }
      }

      for (cP var5 : this.a) {
         var5.onMouseReleased(event.getX(), event.getY(), MouseButton.fromButtonIndex(event.getButton()));
      }
   };

   @CompileBytecode
   private void a() {
      Mytheria.getInstance().getEventManager().subscribe(this);
      this.a
         .addAll(List.of(new cU(), new cY(), new cZ(), new cS(), new cW(), this.island = new dc(), new dq(), new dp(), new db(), new cT(), new cX(), new da()));
   }

   public cN() {
      this.a();
   }

   public List<cP> enabledElements() {
      return this.a.stream().filter(cP::isShowing).toList();
   }

   public List<cP> disabledElements() {
      return this.a.stream().filter(element -> !element.isShowing()).toList();
   }

   public <T extends cP> T getElementByName(String name) {
      return (T)this.a.stream().filter(element -> element.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
   }

   @Generated
   public List<cP> getElements() {
      return this.a;
   }

   @Generated
   public List<cC> getPopups() {
      return this.b;
   }

   @Generated
   public dc getIsland() {
      return this.island;
   }

   @Generated
   public cQ getHistoryManager() {
      return this.c;
   }

   @Generated
   public cL getGrid() {
      return this.d;
   }

   @Generated
   public String getDesc() {
      return this.e;
   }

   @Generated
   public cB getDescText() {
      return this.f;
   }

   @Generated
   public fO getTimer() {
      return this.g;
   }

   @Generated
   public EventListener<ab> getOnHud() {
      return this.h;
   }

   @Generated
   public EventListener<Z> getOnPostHud() {
      return this.i;
   }

   @Generated
   public EventListener<aj> getOnKeyPress() {
      return this.j;
   }

   @Generated
   public EventListener<ai> getOnClick() {
      return this.k;
   }

   @Generated
   public EventListener<ak> getOnRelease() {
      return this.l;
   }

   @Generated
   public void setDesc(String desc) {
      this.e = desc;
   }
}
