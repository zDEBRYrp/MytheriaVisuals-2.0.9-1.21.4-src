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

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.shader.Shader;
import nesquik.mytheria.framework.shader.ShaderHelper;
import nesquik.mytheria.framework.shader.storage.BlurredShader;
import nesquik.mytheria.framework.shader.storage.GaussianShader;
import nesquik.mytheria.framework.shader.storage.LiquidGlassShader;
import nesquik.mytheria.framework.shader.storage.SolidShader;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import nesquik.mytheria.systems.setting.settings.SliderSetting;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.SimpleFramebuffer;
import org.joml.Vector3f;
import org.lwjgl.opengl.GL20;

@ModuleInfo(name = "Hands", category = ax.VISUALS, desc = "Применяет эффекты шейдеров к рукам и предметам", key = 71)
public class bG extends aJ {
   public final ck mode = new ck(this, "modules.settings.hands.mode");
   public final ck.a ownColor = new ck.a(this.mode, "Свой цвет").select();
   public final ck.a transparent = new ck.a(this.mode, "Прозрачный");
   public final ck.a liquidGlass = new ck.a(this.mode, "Liquid Glass");
   public final ck.a plasma = new ck.a(this.mode, "Plasma");
   public final ck.a nebula = new ck.a(this.mode, "Nebula");
   public final ck.a cobweb = new ck.a(this.mode, "Cobweb");
   public final ch syncWithTheme = new ch(this, "Синхронизация с темой", "Использовать акцентный цвет темы для шейдеров").enabled(true);
   public final cj shaderColor = new cj(
         this,
         "Цвет шейдера",
         () -> this.syncWithTheme.isEnabled() || this.ownColor.isSelected() || this.transparent.isSelected() || this.liquidGlass.isSelected()
      )
      .color(new eb(151.0F, 71.0F, 255.0F, 255.0F));
   public final cj solidColor = new cj(this, "modules.settings.hands.solid_color", () -> this.transparent.isSelected() || this.liquidGlass.isSelected())
      .color(new eb(0.0F, 255.0F, 0.0F));
   public final cj solidColor2 = new cj(this, "modules.settings.hands.solid_color2", () -> this.transparent.isSelected() || this.liquidGlass.isSelected())
      .color(new eb(255.0F, 0.0F, 0.0F));
   public final SliderSetting gradientSpeed = new SliderSetting(
         this, "modules.settings.hands.gradient_speed", () -> this.transparent.isSelected() || this.liquidGlass.isSelected()
      )
      .min(0.1F)
      .max(1.0F)
      .step(0.1F)
      .currentValue(0.5F);
   public final SliderSetting blurStrength = new SliderSetting(this, "modules.settings.hands.blur_strength")
      .min(2.0F)
      .max(20.0F)
      .step(1.0F)
      .currentValue(10.0F);

   public static void render(float farPlaneDistance) {
      if (ShaderHelper.isInitialized()) {
         a(farPlaneDistance);
      }
   }

   private static void a(float farPlaneDistance) {
      bG var1 = Mytheria.getInstance().getModuleManager().getModuleSafe(bG.class);
      if (var1 != null && var1.isEnabled()) {
         Framebuffer var2 = mc.getFramebuffer();
         SolidShader var3 = ShaderHelper.getSolidShader();
         LiquidGlassShader var4 = ShaderHelper.getLiquidGlassShader();
         BlurredShader var5 = ShaderHelper.getBlurredShader();
         GaussianShader var6 = ShaderHelper.getGaussianShader();
         SimpleFramebuffer var7 = ShaderHelper.getCopyFbo();
         SimpleFramebuffer var8 = ShaderHelper.getFbo1();
         SimpleFramebuffer var9 = ShaderHelper.getFbo2();
         SimpleFramebuffer var10 = ShaderHelper.getTintFbo();
         if (var2 != null && var3 != null && var4 != null && var5 != null && var6 != null && var7 != null && var8 != null && var9 != null && var10 != null) {
            var7.clear();
            var10.clear();
            var8.clear();
            var9.clear();
            var7.beginWrite(true);
            RenderSystem.clearColor(0.0F, 0.0F, 0.0F, 0.0F);
            RenderSystem.clear(16640);
            var2.draw(var7.textureWidth, var7.textureHeight);
            var7.copyDepthFrom(var2);
            SimpleFramebuffer var11 = var7;
            if (var1.ownColor.isSelected()) {
               var10.clear();
               var10.beginWrite(true);
               RenderSystem.clearColor(0.0F, 0.0F, 0.0F, 0.0F);
               RenderSystem.clear(16640);
               RenderSystem.enableBlend();
               RenderSystem.defaultBlendFunc();
               RenderSystem.disableDepthTest();
               var2.draw(var10.textureWidth, var10.textureHeight);
               RenderSystem.activeTexture(33984);
               RenderSystem.bindTexture(var7.getColorAttachment());
               GlStateManager._texParameter(3553, 10241, 9729);
               GlStateManager._texParameter(3553, 10240, 9729);
               RenderSystem.activeTexture(33985);
               RenderSystem.bindTexture(var7.getDepthAttachment());
               GlStateManager._texParameter(3553, 10241, 9729);
               GlStateManager._texParameter(3553, 10240, 9729);
               var3.bind();
               var3.setUniform1i("ColorTexture", 0);
               var3.setUniform1i("DepthTexture", 1);
               float var12 = (float)System.nanoTime() / 1.0E9F * var1.gradientSpeed.getCurrentValue();
               var3.setUniform1f("time", var12);
               eb var13 = var1.solidColor.getColor();
               Vector3f var14 = new Vector3f(var13.getRed() / 255.0F, var13.getGreen() / 255.0F, var13.getBlue() / 255.0F);
               var3.setUniform3f("customColor1", var14);
               eb var15 = var1.solidColor2.getColor();
               Vector3f var16 = new Vector3f(var15.getRed() / 255.0F, var15.getGreen() / 255.0F, var15.getBlue() / 255.0F);
               var3.setUniform3f("customColor2", var16);
               var3.setUniform1f("effectAlpha", Math.max(var13.getAlpha(), var15.getAlpha()) / 255.0F);
               var3.setUniform1f("nearPlane", 0.05F);
               var3.setUniform1f("farPlane", farPlaneDistance);
               ShaderHelper.drawFullScreenQuad();
               var3.unbind();
               RenderSystem.activeTexture(33984);
               RenderSystem.bindTexture(var7.getColorAttachment());
               GlStateManager._texParameter(3553, 10241, 9728);
               GlStateManager._texParameter(3553, 10240, 9728);
               RenderSystem.activeTexture(33985);
               RenderSystem.bindTexture(var7.getDepthAttachment());
               GlStateManager._texParameter(3553, 10241, 9728);
               GlStateManager._texParameter(3553, 10240, 9728);
               RenderSystem.activeTexture(33984);
               RenderSystem.enableDepthTest();
               RenderSystem.disableBlend();
               var11 = var10;
            } else if (var1.liquidGlass.isSelected()) {
               SimpleFramebuffer var17 = var10;
               var17.clear();
               var17.beginWrite(true);
               RenderSystem.clearColor(0.0F, 0.0F, 0.0F, 0.0F);
               RenderSystem.clear(16640);
               RenderSystem.enableBlend();
               RenderSystem.defaultBlendFunc();
               RenderSystem.disableDepthTest();
               var2.draw(var17.textureWidth, var17.textureHeight);
               RenderSystem.activeTexture(33984);
               RenderSystem.bindTexture(var7.getColorAttachment());
               GlStateManager._texParameter(3553, 10241, 9729);
               GlStateManager._texParameter(3553, 10240, 9729);
               RenderSystem.activeTexture(33985);
               RenderSystem.bindTexture(var7.getDepthAttachment());
               GlStateManager._texParameter(3553, 10241, 9729);
               GlStateManager._texParameter(3553, 10240, 9729);
               var4.bind();
               var4.setUniform1i("ColorTexture", 0);
               var4.setUniform1i("DepthTexture", 1);
               var4.setUniform2f("iResolution", mc.getWindow().getFramebufferWidth(), mc.getWindow().getFramebufferHeight());
               var4.setUniform1f("BlurSize", 20.0F);
               var4.setUniform1f("Quality", 10.0F);
               var4.setUniform1f("Direction", 10.0F);
               var4.setUniform1f("nearPlane", 0.05F);
               var4.setUniform1f("farPlane", farPlaneDistance);
               ShaderHelper.drawFullScreenQuad();
               var4.unbind();
               RenderSystem.activeTexture(33984);
               RenderSystem.bindTexture(var7.getColorAttachment());
               GlStateManager._texParameter(3553, 10241, 9728);
               GlStateManager._texParameter(3553, 10240, 9728);
               RenderSystem.activeTexture(33985);
               RenderSystem.bindTexture(var7.getDepthAttachment());
               GlStateManager._texParameter(3553, 10241, 9728);
               GlStateManager._texParameter(3553, 10240, 9728);
               RenderSystem.activeTexture(33984);
               RenderSystem.enableDepthTest();
               RenderSystem.disableBlend();
               var11 = var17;
            } else if (var1.plasma.isSelected() || var1.nebula.isSelected() || var1.cobweb.isSelected()) {
               Shader var18 = null;
               if (var1.plasma.isSelected()) {
                  var18 = ShaderHelper.getPlasmaShader();
               } else if (var1.nebula.isSelected()) {
                  var18 = ShaderHelper.getNebulaShader();
               } else if (var1.cobweb.isSelected()) {
                  var18 = ShaderHelper.getCobwebShader();
               }

               if (var18 != null) {
                  var10.clear();
                  var10.beginWrite(true);
                  RenderSystem.clearColor(0.0F, 0.0F, 0.0F, 0.0F);
                  RenderSystem.clear(16640);
                  RenderSystem.enableBlend();
                  RenderSystem.defaultBlendFunc();
                  RenderSystem.disableDepthTest();
                  var2.draw(var10.textureWidth, var10.textureHeight);
                  RenderSystem.activeTexture(33984);
                  RenderSystem.bindTexture(var7.getColorAttachment());
                  GlStateManager._texParameter(3553, 10241, 9729);
                  GlStateManager._texParameter(3553, 10240, 9729);
                  RenderSystem.activeTexture(33985);
                  RenderSystem.bindTexture(var7.getDepthAttachment());
                  GlStateManager._texParameter(3553, 10241, 9729);
                  GlStateManager._texParameter(3553, 10240, 9729);
                  var18.bind();
                  var18.setUniform1i("ColorTexture", 0);
                  var18.setUniform1i("DepthTexture", 1);
                  float var19 = (float)System.nanoTime() / 1.0E9F * var1.gradientSpeed.getCurrentValue();
                  var18.setUniform1f("time", var19);
                  eb var20 = var1.syncWithTheme.isEnabled() ? ec.getAccentColor() : var1.shaderColor.getColor();
                  Vector3f var21 = new Vector3f(var20.getRed() / 255.0F, var20.getGreen() / 255.0F, var20.getBlue() / 255.0F);
                  var18.setUniform3f("customColor1", var21);
                  Vector3f var22 = new Vector3f(var20.getRed() / 255.0F, var20.getGreen() / 255.0F, var20.getBlue() / 255.0F);
                  var18.setUniform3f("customColor2", var22);
                  var18.setUniform1f("effectAlpha", 1.0F);
                  ShaderHelper.drawFullScreenQuad();
                  var18.unbind();
                  RenderSystem.activeTexture(33984);
                  RenderSystem.bindTexture(var7.getColorAttachment());
                  GlStateManager._texParameter(3553, 10241, 9728);
                  GlStateManager._texParameter(3553, 10240, 9728);
                  RenderSystem.activeTexture(33985);
                  RenderSystem.bindTexture(var7.getDepthAttachment());
                  GlStateManager._texParameter(3553, 10241, 9728);
                  GlStateManager._texParameter(3553, 10240, 9728);
                  RenderSystem.activeTexture(33984);
                  RenderSystem.enableDepthTest();
                  RenderSystem.disableBlend();
                  var11 = var10;
               }
            }

            var8.clear();
            var9.clear();
            GaussianShader.applyGaussianBlur(var6, var8, var9, var11, var7, var1.blurStrength.getCurrentValue(), true, true);
            var2.beginWrite(true);
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableDepthTest();
            RenderSystem.activeTexture(33984);
            RenderSystem.bindTexture(var2.getColorAttachment());
            RenderSystem.texParameter(3553, 10241, 9729);
            RenderSystem.texParameter(3553, 10240, 9729);
            RenderSystem.activeTexture(33985);
            RenderSystem.bindTexture(var9.getColorAttachment());
            RenderSystem.activeTexture(33986);
            RenderSystem.bindTexture(var2.getDepthAttachment());
            var5.bind();
            var5.setUniform1i("OriginalTexture", 0);
            var5.setUniform1i("BlurredTexture", 1);
            var5.setUniform1i("DepthTexture", 2);
            var5.setUniform1f("nearPlane", 0.05F);
            var5.setUniform1f("farPlane", farPlaneDistance);
            ShaderHelper.drawFullScreenQuad();
            var5.unbind();
            RenderSystem.activeTexture(33984);
            RenderSystem.bindTexture(var2.getColorAttachment());
            RenderSystem.texParameter(3553, 10241, 9728);
            RenderSystem.texParameter(3553, 10240, 9728);
            RenderSystem.activeTexture(33986);
            RenderSystem.bindTexture(0);
            RenderSystem.activeTexture(33985);
            RenderSystem.bindTexture(0);
            RenderSystem.activeTexture(33984);
            RenderSystem.bindTexture(0);
            RenderSystem.disableBlend();
            RenderSystem.enableDepthTest();
            RenderSystem.depthMask(true);
            GL20.glUseProgram(0);
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            if (mc.gameRenderer != null && mc.gameRenderer.getLightmapTextureManager() != null) {
               mc.gameRenderer.getLightmapTextureManager().enable();
            }

            if (mc.getFramebuffer() != null) {
               mc.getFramebuffer().beginWrite(true);
            }
         }
      }
   }
}
