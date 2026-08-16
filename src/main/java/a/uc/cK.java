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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import lombok.Generated;
import nesquik.mytheria.framework.base.CustomComponent;
import nesquik.mytheria.framework.base.UIContext;
import nesquik.mytheria.framework.msdf.Font;
import nesquik.mytheria.framework.objects.MouseButton;
import nesquik.mytheria.utility.animation.base.Easing;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.util.math.MathHelper;

public class cK extends CustomComponent implements IMinecraft {
   public static cK LAST_FIELD;
   private final HashMap<Character, Float> a = new HashMap<>();
   private final List<cK.b> b = new ArrayList<>();
   private final Font c;
   private String d = "";
   private String e = "";
   private final dZ f = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
   private boolean g;
   private final dZ h = new dZ(300L, 0.0F, Easing.BAKEK);
   private int i;
   private cK.a j;
   private float k = 0.0F;
   private float l = 0.0F;
   private int m = -1;
   private long n = 0L;
   private int o = 0;
   private final fO p = new fO();
   private String q = "";
   private String r = "";
   private Map<String, cJ> s = new HashMap<>();
   private String t = "";
   private float u;
   private final fO v = new fO();
   private float w = 1.0F;
   private eb z = eb.WHITE;

   @Override
   public void renderComponent(UIContext context) {
      float var2 = 0.0F;
      float var3 = 0.0F;
      float var4 = 0.0F;
      float var5 = this.height / 2.0F - this.c.height() / 2.0F;
      float var6 = this.c.height() / 8.0F;
      this.b.removeIf(textx -> textx.a.getValue() == 0.0F && textx.b);
      this.f.update(this.g);
      if (this.j != null && this.j.a() == this.j.b()) {
         this.j = null;
      }

      if (this.m != -1) {
         this.p.reset();
         int var7 = -1;
         float var8 = 0.0F;

         for (cK.b var10 : this.b) {
            String var11 = String.valueOf(var10.c);
            if (context.getMouseX() < this.x + this.u + var8 + this.c.width(var11) + this.c.width(var11) / 2.0F) {
               var7 = this.b.indexOf(var10);
               break;
            }

            var8 += this.c.width(var11);
         }

         if (var7 == -1) {
            var7 = this.b.size();
         }

         if (var7 != this.m) {
            this.j = new cK.a(var7 > this.m, Math.min(this.m, var7), Math.max(this.m, var7));
            this.i = var7;
         } else {
            if (this.j != null) {
               this.i = this.j.a();
            }

            this.j = null;
         }
      }

      if (this.isHovered(context)) {
         eo.set(en.TEXT);
      }

      this.a();
      fm.push(context.getMatrices(), this.x, this.y, this.width, this.height);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, this.w);
      context.drawRect(
         this.x + this.u + var5 + this.k,
         this.y + var5 - 1.0F,
         this.l - this.k,
         this.c.height() + 2.0F,
         eb.BLUE.mix(new eb(76.0F, 99.0F, 122.0F), 0.7F).withAlpha(255.0F * this.f.getValue())
      );
      this.k = 0.0F;
      this.l = 0.0F;
      fq var13 = new fq(VertexFormats.POSITION_TEXTURE_COLOR, this.c.getFont());
      if (this.b.isEmpty()) {
         context.drawText(this.c, this.q, this.x + var2 + var5, this.y + var5 - 2.0F * this.f.getValue(), this.z.mulAlpha(0.75F * (1.0F - this.f.getValue())));
      }

      if (!this.t.isEmpty() && this.t.toLowerCase().startsWith(this.e.toLowerCase()) && !this.e.isEmpty()) {
         context.drawText(this.c, this.e + this.t.substring(this.e.length()), this.x + var2 + var5, this.y + var5, this.z.withAlpha(150.0F * this.f.getValue()));
      }

      for (cK.b var16 : this.b) {
         String var18 = String.valueOf(var16.c);
         var16.a.setDuration(200L);
         var16.a.update(!var16.b);
         context.drawText(
            this.c, var18, this.x + var2 + var5 + this.u, this.y + var5 + 2.0F - 2.0F * var16.a.getValue(), this.z.withAlpha(255.0F * var16.a.getValue())
         );
         var2 += this.c.width(var18) * var16.a.getValue();
         var3 += this.c.width(var18);
         if (this.b.indexOf(var16) == this.i - 1) {
            var4 = var3;
         }

         if (this.j != null) {
            if (this.b.indexOf(var16) == this.j.a() - 1) {
               this.k = var3;
            }

            if (this.b.indexOf(var16) == this.j.b() - 1) {
               this.l = var3;
            }
         }
      }

      var13.draw();
      var4 += this.i == this.b.size() ? 1.0F : 0.0F;
      if (this.v.finished(10L)) {
         for (cK.b var17 : this.b) {
            String var19 = String.valueOf(var17.c);
            if (var4 + var5 + this.u > this.width - 5.0F) {
               this.u = this.u - this.c.width(var19);
               this.v.reset();
               break;
            }

            if (var4 + var5 + this.u < 5.0F) {
               this.u = this.u + this.c.width(var19);
               this.v.reset();
               break;
            }
         }

         if (this.c.width(this.e) < this.width - 10.0F) {
            this.u = 0.0F;
         }
      }

      this.h.setEasing(Easing.BAKEK_SMALLER);
      this.h.update(var4);
      fl.rotate(
         context.getMatrices(),
         this.x + var5 + this.u + this.h.getValue() + var6 / 2.0F,
         this.y + var5 - 1.0F,
         Math.clamp(var4 - this.h.getValue(), -20.0F, 20.0F)
      );
      context.drawRect(
         this.x + var5 + this.h.getValue() + this.u,
         this.y + var5 - 1.0F,
         var6,
         this.c.height() + 2.0F,
         this.z.withAlpha((float)(200.0F * this.f.getValue() * (!this.p.finished(300L) ? 3.0 : eI.sin(System.currentTimeMillis() / 200.0) + 2.0) / 3.0))
      );
      fl.end(context.getMatrices());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      fm.pop();
   }

   @Override
   public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
      if (this.isHovered(mouseX, mouseY)) {
         if (button == MouseButton.LEFT) {
            long var6 = System.currentTimeMillis();
            if (var6 - this.n < 500L) {
               this.o++;
            } else {
               this.o = 1;
            }

            this.n = var6;
            this.g = true;
            float var8 = 0.0F;
            int var9 = this.b.size();

            for (cK.b var11 : this.b) {
               String var12 = String.valueOf(var11.c);
               if (mouseX < this.x + this.u + var8 + this.c.width(var12) + this.c.width(var12) / 2.0F) {
                  var9 = this.b.indexOf(var11);
                  break;
               }

               var8 += this.c.width(var12);
            }

            this.i = var9;
            if (this.o == 2) {
               this.b();
               this.m = -1;
            } else {
               this.j = null;
               this.m = this.i;
            }
         }
      } else {
         this.g = false;
      }
   }

   @Override
   public void onMouseReleased(double mouseX, double mouseY, MouseButton button) {
      this.m = -1;
   }

   @Override
   public void onKeyPressed(int keyCode, int scanCode, int modifiers) {
      if (this.g) {
         if ((keyCode == 259 || keyCode == 261) && this.j != null) {
            this.c();
            fL.TYPING.play(0.3F, 1.2F);
            this.a(0);
         } else if (keyCode == 259 && this.i > 0) {
            int var13 = Screen.hasControlDown() ? Math.max(1, this.getWordSize(false)) : 1;

            for (int var16 = 0; var16 < var13; var16++) {
               this.a(-1);
               cK.b var17 = null;

               for (cK.b var8 : this.b) {
                  if (!var8.b) {
                     var17 = var8;
                  }

                  if (this.b.indexOf(var8) == this.i) {
                     break;
                  }
               }

               if (var17 != null) {
                  var17.b = true;
               }
            }

            fL.TYPING.play(0.3F, 1.2F);
         } else if (keyCode == 261 && this.i < this.b.size()) {
            int var12 = Screen.hasControlDown() ? Math.max(1, this.getWordSize(true)) : 1;

            for (int var15 = 0; var15 < var12 && this.i < this.b.size(); var15++) {
               for (int var6 = this.i; var6 < this.b.size(); var6++) {
                  cK.b var7 = this.b.get(var6);
                  if (!var7.b) {
                     var7.b = true;
                     break;
                  }
               }
            }

            this.a(0);
            fL.TYPING.play(0.3F, 1.2F);
         } else if (keyCode == 263) {
            fL.TYPING.play(0.3F, 1.3F);
            int var4 = Screen.hasControlDown() ? Math.max(1, this.getWordSize(false)) : 1;
            if (Screen.hasShiftDown()) {
               this.b(-var4);
            } else if (this.j != null) {
               this.i = this.j.a();
               this.j = null;
               return;
            }

            this.a(-var4);
         } else if (keyCode == 262) {
            fL.TYPING.play(0.3F, 1.3F);
            int var9 = Screen.hasControlDown() ? Math.max(1, this.getWordSize(true)) : 1;
            if (Screen.hasShiftDown()) {
               this.b(var9);
            } else if (this.j != null) {
               this.i = this.j.b();
               this.j = null;
               return;
            }

            this.a(var9);
         } else if (Screen.isSelectAll(keyCode)) {
            this.j = new cK.a(true, 0, this.b.size());
         } else if (Screen.isCopy(keyCode)) {
            if (this.j != null) {
               mc.keyboard.setClipboard(this.e());
               return;
            }

            mc.keyboard.setClipboard(this.e);
         } else if (Screen.isCut(keyCode)) {
            if (this.j != null) {
               mc.keyboard.setClipboard(this.e());
               this.c();
               this.a(0);
               return;
            }

            mc.keyboard.setClipboard(this.e);

            for (cK.b var5 : this.b) {
               var5.b = true;
            }

            this.e = "";
         } else if (Screen.isPaste(keyCode)) {
            this.paste(mc.keyboard.getClipboard());
         } else if (keyCode == 258 || keyCode == 257) {
            for (Entry var14 : this.s.entrySet()) {
               if (((String)var14.getKey()).toLowerCase().startsWith(this.e.toLowerCase()) && !this.e.isEmpty() && var14.getValue() != null) {
                  this.clear();
                  if (keyCode == 257) {
                     ((cJ)var14.getValue()).getEnter().run();
                  } else {
                     ((cJ)var14.getValue()).getTab().run();
                  }

                  this.g = false;
                  return;
               }
            }

            if (keyCode == 257) {
               this.g = false;
            }
         } else if (keyCode == 259 && this.b.isEmpty()) {
            this.g = false;
         }
      }
   }

   @Override
   public boolean charTyped(char chr, int modifiers) {
      if (!this.g) {
         return false;
      }

      if (chr == ' ') {
         fL.TYPING.play(0.3F, 0.8F);
      } else {
         if (!this.a.containsKey(chr)) {
            this.a.put(chr, eI.random(0.8, 1.2));
         }

         fL.TYPING.play(0.3F, this.a.get(chr));
      }

      this.typeChar(chr);
      return true;
   }

   private void a() {
      this.d = this.e;
      StringBuilder var1 = new StringBuilder();

      for (cK.b var3 : this.b) {
         var1.append(var3.c);
      }

      this.e = var1.toString();
      if (!this.d.equals(this.e)) {
         this.t = "";

         for (String var5 : this.s.keySet()) {
            if (var5.toLowerCase().startsWith(this.e.toLowerCase()) && !this.e.isEmpty()) {
               this.t = var5;
            }
         }
      }
   }

   public int getWordSize(boolean forward) {
      int var2 = 0;
      if (forward) {
         for (int var3 = this.i; var3 < this.b.size(); var3++) {
            cK.b var4 = this.b.get(var3);
            if (var4.b || var4.c == ' ') {
               break;
            }

            var2++;
         }
      } else {
         for (int var5 = this.i - 1; var5 >= 0; var5--) {
            cK.b var6 = this.b.get(var5);
            if (var6.b || var6.c == ' ') {
               break;
            }

            var2++;
         }
      }

      return var2;
   }

   public void paste(String paste) {
      for (char var5 : paste.toCharArray()) {
         this.typeChar(var5);
      }
   }

   public void typeChar(char c) {
      this.c();
      this.b.add(Math.clamp(this.i, 0, Math.max(0, this.b.size())), new cK.b(c));
      this.a(1);
      LAST_FIELD = this;
   }

   private void a(int offset) {
      this.i = MathHelper.clamp(this.i + offset, 0, this.b.size());
      this.p.reset();
   }

   public void clear() {
      this.b.clear();
      this.e = "";
   }

   private void b() {
      if (!this.b.isEmpty()) {
         int var1 = this.i;
         int var2 = this.i;

         for (int var3 = this.i - 1; var3 >= 0; var1 = var3--) {
            cK.b var4 = this.b.get(var3);
            if (var4.b || var4.c == ' ' || !Character.isLetterOrDigit(var4.c)) {
               break;
            }
         }

         for (int var5 = this.i; var5 < this.b.size(); var5++) {
            cK.b var6 = this.b.get(var5);
            if (var6.b || var6.c == ' ' || !Character.isLetterOrDigit(var6.c)) {
               break;
            }

            var2 = var5 + 1;
         }

         if (var1 != var2) {
            this.j = new cK.a(true, var1, var2);
            this.i = var2;
         }
      }
   }

   private void c() {
      if (this.j != null) {
         for (cK.b var2 : this.d()) {
            var2.b = true;
         }

         this.i = this.j.a();
         this.j = null;
      }
   }

   private List<cK.b> d() {
      ArrayList var1 = new ArrayList();
      boolean var2 = false;

      for (cK.b var4 : this.b) {
         if (this.b.indexOf(var4) == this.j.a()) {
            var2 = true;
         }

         if (this.b.indexOf(var4) == this.j.b()) {
            var2 = false;
         }

         if (var2) {
            var1.add(var4);
         }
      }

      return var1;
   }

   private String e() {
      StringBuilder var1 = new StringBuilder();
      boolean var2 = false;

      for (cK.b var4 : this.b) {
         if (this.b.indexOf(var4) == this.j.a()) {
            var2 = true;
         }

         if (this.b.indexOf(var4) == this.j.b()) {
            var2 = false;
         }

         if (var2) {
            var1.append(var4.c);
         }
      }

      return var1.toString();
   }

   private void b(int offset) {
      if (this.j == null) {
         this.j = new cK.a(offset > 0, this.i, this.i);
      }

      if (!this.j.a) {
         this.j.b = MathHelper.clamp(this.j.a() + offset, 0, this.b.size());
      } else {
         this.j.c = MathHelper.clamp(this.j.b() + offset, 0, this.b.size());
      }
   }

   @Generated
   public cK(Font font) {
      this.c = font;
   }

   @Generated
   public String getBuiltText() {
      return this.e;
   }

   @Generated
   public boolean isFocused() {
      return this.g;
   }

   @Generated
   public void setFocused(boolean focused) {
      this.g = focused;
   }

   @Generated
   public String getPreview() {
      return this.q;
   }

   @Generated
   public String getIcon() {
      return this.r;
   }

   @Generated
   public void setPreview(String preview) {
      this.q = preview;
   }

   @Generated
   public void setIcon(String icon) {
      this.r = icon;
   }

   @Generated
   public void setAppend(Map<String, cJ> append) {
      this.s = append;
   }

   @Generated
   public String getAppending() {
      return this.t;
   }

   @Generated
   public void setAlpha(float alpha) {
      this.w = alpha;
   }

   @Generated
   public eb getTextColor() {
      return this.z;
   }

   @Generated
   public void setTextColor(eb textColor) {
      this.z = textColor;
   }

   static class a {
      final boolean a;
      int b;
      int c;

      int a() {
         return Math.min(this.c, this.b);
      }

      int b() {
         return Math.max(this.c, this.b);
      }

      @Generated
      public a(boolean forward, int start, int end) {
         this.a = forward;
         this.b = start;
         this.c = end;
      }
   }

   static class b {
      final dZ a = new dZ(300L, 0.0F, Easing.FIGMA_EASE_IN_OUT);
      boolean b;
      final char c;

      @Generated
      public b(char type) {
         this.c = type;
      }
   }
}
