package a;
import a.uc.B;
import a.uc.bZ;
import a.uc.eF;
import a.uc.bY;
import a.uc.cC;
import a.uc.bN;
import a.uc.bR;
import a.uc.aQ;
import a.uc.eR;
import a.uc.eW;
import a.uc.fO;
import a.uc.dY;
import a.uc.eP;
import a.uc.cN;
import a.uc.L;
import a.uc.dR;
import a.uc.eY;
import a.uc.cK;
import a.uc.cO;
import a.uc.aZ;
import a.uc.eK;
import a.uc.dZ;
import a.uc.dX;
import a.r;
import a.uc.aS;
import a.uc.cD;
import a.uc.U;
import a.uc.D;
import a.uc.aP;
import a.uc.dS;
import a.uc.aH;
import a.uc.eD;
import a.uc.aW;
import a.uc.dD;
import a.uc.bB;
import a.uc.eO;
import a.uc.cP;
import a.uc.fK;
import a.uc.aB;
import a.uc.cJ;
import a.uc.cX;
import a.eg;
import a.uc.dA;
import a.uc.eI;
import a.uc.aE;
import a.uc.dE;
import a.uc.M;
import a.uc.dW;
import a.uc.H;
import a.uc.J;
import a.uc.Q;
import a.uc.N;
import a.uc.bW;
import a.p;
import a.uc.fJ;
import a.uc.V;
import a.g;
import a.uc.fD;
import a.uc.eX;
import a.z;
import a.uc.bS;
import a.uc.aO;
import a.uc.cE;
import a.x;
import a.uc.fC;
import a.uc.aT;
import a.uc.dH;
import a.uc.fP;
import a.uc.eM;
import a.uc.cT;
import a.uc.bA;
import a.uc.eS;
import a.uc.cR;
import a.uc.aN;
import a.uc.cI;
import a.uc.cG;
import a.uc.bC;
import a.uc.I;
import a.uc.bE;
import a.uc.aG;
import a.uc.dI;
import a.uc.aK;
import a.uc.aJ;
import a.uc.O;
import a.uc.aV;
import a.uc.eH;
import a.eb;
import a.uc.fE;
import a.uc.bK;
import a.uc.cF;
import a.uc.bF;
import a.uc.eN;
import a.uc.bI;
import a.uc.dC;
import a.uc.cU;
import a.uc.aU;
import a.uc.bH;
import a.uc.eA;
import a.uc.bM;
import a.uc.aF;
import a.a;
import a.uc.cL;
import a.uc.fM;
import a.uc.dM;
import a.uc.cA;
import a.uc.bD;
import a.uc.bX;
import a.uc.cH;
import a.uc.bG;
import a.uc.fB;
import a.uc.fA;
import a.uc.dF;
import a.uc.bU;
import a.uc.cY;
import a.uc.aC;
import a.uc.aL;
import a.uc.bQ;
import a.uc.eE;
import a.uc.eT;
import a.uc.K;
import a.uc.cB;
import a.uc.bT;
import a.uc.W;
import a.uc.eL;
import a.uc.bP;
import a.ad;
import a.uc.fI;
import a.uc.T;
import a.uc.dB;
import a.cv;
import a.uc.C;
import a.uc.aY;
import a.uc.dT;
import a.uc.dJ;
import a.uc.fF;
import a.uc.aR;
import a.uc.fG;
import a.uc.dV;
import a.uc.aX;
import a.uc.dG;
import a.uc.E;
import a.uc.dP;
import a.y;
import a.uc.cM;
import a.uc.eQ;
import a.uc.eV;
import a.uc.cS;
import a.uc.bO;
import a.ec;
import a.uc.fL;
import a.uc.bL;
import a.uc.aI;
import a.uc.cW;
import a.uc.dL;
import a.uc.aM;
import a.uc.eJ;
import a.uc.bV;
import a.f;
import a.uc.cQ;
import a.uc.dQ;
import a.uc.dK;
import a.uc.aA;
import a.uc.eZ;
import a.uc.S;
import a.uc.fH;
import a.uc.dU;
import a.uc.dN;
import a.fn;
import a.uc.cZ;
import a.uc.eU;
import a.uc.bJ;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map.Entry;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.framework.msdf.Fonts;
import nesquik.mytheria.framework.objects.BorderRadius;
import nesquik.mytheria.systems.commands.Command;
import nesquik.mytheria.systems.commands.ValidationResult;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import nesquik.mytheria.utility.interfaces.IScaledResolution;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;

public class r implements IMinecraft, IScaledResolution {
   private final EventListener<ad> a = event -> {
      MatrixStack var2 = event.getContext().getMatrices();
      this.a(event, var2);
   };
   private final EventListener<ae> worldRenderer = event -> {
      this.a(event);
   };

   public r() {
      Mytheria.getInstance().getEventManager().subscribe(this);
   }

   public Command command() {
      return f.begin("waypoint")
         .aliases("way")
         .desc("Метки")
         .param("action", p -> p.literal("add", "del", "clear", "mode", "mainmenu"))
         .param("name", p -> p.optional().validator(ValidationResult::ok))
         .param("x", p -> p.optional().validator(this::a))
         .param("y", p -> p.optional().validator(this::a))
         .param("z", p -> p.optional().validator(this::a))
         .handler(this::a)
         .build();
   }

   private ValidationResult a(String input) {
      try {
         Integer.parseInt(input);
         return ValidationResult.ok(input);
      } catch (NumberFormatException var3) {
         return ValidationResult.error("Не правильное число");
      }
   }

   private void a(g ctx) {
      String var2 = (String)ctx.arguments().get(0);
      String var3 = (String)ctx.arguments().get(1);
      String var4 = (String)ctx.arguments().get(2);
      String var5 = (String)ctx.arguments().get(3);
      String var6 = (String)ctx.arguments().get(4);
      cv var7 = Mytheria.getInstance().getWayPointsManager();
      String var8 = var2.toLowerCase();
      switch (var8) {
         case "add":
            if (var3 == null || var4 == null || var5 == null || var6 == null) {
               eg.error(Text.of("Укажите название и координаты (.way add \"Название\" x y z)"));
               return;
            }

            try {
               var7.add(var3, Integer.parseInt(var4), Integer.parseInt(var5), Integer.parseInt(var6));
            } catch (NumberFormatException var12) {
               eg.error(Text.of("Координаты должны быть числами"));
            }
            break;
         case "del":
            if (var3 == null) {
               eg.error(Text.of("Укажите название (.way del \"Название\")"));
               return;
            }

            var7.del(var3);
            break;
         case "clear":
            var7.clear();
            break;
         case "mode":
            if (var3 == null) {
               eg.info(Text.of("Текущий режим: " + var7.getWaypointMode() + " | Доступно: CLASSIC, BEACON, DOT, TRACER, BOTH (.way mode <режим>)"));
               return;
            }
            String m = var3.toUpperCase();
            if (m.equals("CLASSIC") || m.equals("BEACON") || m.equals("DOT") || m.equals("TRACER") || m.equals("BOTH")) {
               var7.setWaypointMode(m);
               eg.info(Text.of("Режим меток: " + m));
            } else {
               eg.error(Text.of("Неизвестный режим. Доступно: CLASSIC, BEACON, DOT, TRACER, BOTH"));
            }
            break;
         case "mainmenu":
            try {
               java.io.File f = new java.io.File(ar.DIRECTORY, "disable_custom_menu");
               if (f.exists()) {
                  if (f.delete()) eg.info(Text.of("Кастомное меню включено (перезайди в главное меню)"));
                  else eg.error(Text.of("Не удалось включить кастомное меню"));
               } else {
                  f.createNewFile();
                  eg.info(Text.of("Кастомное меню отключено (перезайди в главное меню)"));
               }
            } catch (Exception e) { eg.error(Text.of("Ошибка: " + e.getMessage())); }
            break;
      }
   }

   private void a(ad event, MatrixStack matrices) {
      String mode = Mytheria.getInstance().getWayPointsManager().getWaypointMode();
      boolean isClassic = mode.equals("CLASSIC");
      boolean isBoth = mode.equals("BOTH");
      boolean isDot = mode.equals("DOT");
      boolean isBeaconOnly = mode.equals("BEACON");
      boolean isTracerOnly = mode.equals("TRACER");
      for (Entry var5 : Mytheria.getInstance().getWayPointsManager().getEntries()) {
         String var6 = (String)var5.getKey();
         Vec3d var7 = (Vec3d)var5.getValue();
         Vec3d var8 = var7.add(0.0, 0.5, 0.0);
         Vec2f var9 = fn.worldToScreen(var8);
         if (var9 != null) {
            float var10 = (float)mc.player.getPos().distanceTo(var7);
            if (isBeaconOnly || isTracerOnly) {
               // Только 3D луч/маяк - скипаем 2D карточку полностью
               continue;
            }
            if (isDot) {
               // Только точка + дистанция
               float scale = MathHelper.clamp(1.0F - var10 / 40.0F, 0.6F, 1.0F);
               matrices.push();
               matrices.translate(var9.x, var9.y, 0.0F);
               matrices.scale(scale, scale, 1.0F);
               String var12 = String.format("%.0fm", var10);
               float dot = 8.0F;
               float pad = 6.0F;
               float w = Fonts.REGULAR.getFont(8.0F).width(var12) + pad * 2 + dot + 4.0F;
               float h = 14.0F;
               event.getContext().drawRoundedRect(-w/2, -h-10, w, h, BorderRadius.all(7.0F), bJ.getBackgroundColor().withAlpha(200));
               event.getContext().drawRoundedRect(-w/2+4, -h-10+3, dot, dot, BorderRadius.all(4.0F), ec.getAccentColor());
               event.getContext().drawText(Fonts.REGULAR.getFont(8.0F), var12, -w/2+4+dot+4, -h-10+3.5F, eb.WHITE);
               matrices.pop();
               continue;
            }
            // CLASSIC / BOTH - полная карточка
            float var11 = MathHelper.clamp(1.0F - var10 / 20.0F, 0.5F, 1.0F);
            matrices.push();
            matrices.translate(var9.x, var9.y, 0.0F);
            matrices.scale(var11, var11, 1.0F);
            String var12 = String.format("%.0fm", var10);
            float var13 = 30.0F;
            float var14 = 8.0F;
            float var15 = 4.0F;
            float var16 = Fonts.SEMIBOLD.getFont(10.0F).width(var6);
            float var17 = Fonts.REGULAR.getFont(9.0F).width(var12);
            float var18 = Math.max(var16, var17);
            float var19 = var13 + var14 + var18 + var14 * 2.0F;
            float var20 = Fonts.SEMIBOLD.getFont(10.0F).height();
            float var21 = Fonts.REGULAR.getFont(9.0F).height();
            float var22 = Math.max(var13, var20 + var15 + var21) + var14 * 2.0F;
            float var23 = -var19 / 2.0F;
            float var24 = -var22 - 10.0F;
            if (bJ.showGlass()) {
               event.getContext()
                  .drawLiquidGlass(var23, var24, var19, var22, 5.0F, bJ.getDistortion(), BorderRadius.all(10.0F), ec.getLiquidGlassColor().mulAlpha(bJ.glass()));
               event.getContext()
                  .drawRoundedRect(
                     var23, var24, var19, var22, BorderRadius.all(10.0F), bJ.getBackgroundColor().withAlpha((int)(255.0F * (0.8F - 0.6F * bJ.glass())))
                  );
            } else {
               if (bJ.showMinimalizm()) {
                  event.getContext().drawBlurredRect(var23, var24, var19, var22, 11.25F, BorderRadius.all(10.0F), ec.WHITE.mulAlpha(bJ.minimalizm()));
               }

               event.getContext().drawRoundedRect(var23, var24, var19, var22, BorderRadius.all(10.0F), bJ.getBackgroundColor());
            }

            float var25 = var23 + var14;
            float var26 = var24 + (var22 - var13) / 2.0F;
            event.getContext().drawRoundedRect(var25, var26, var13, var13, BorderRadius.all(5.0F), eb.WHITE);
            event.getContext()
               .drawTexture(Mytheria.id("icons/way.png"), var25 + 2.0F, var26 + 2.0F, var13 - 4.0F, var13 - 4.0F, new eb(40.0F, 40.0F, 40.0F, 255.0F));
            float var27 = var25 + var13 + var14;
            float var28 = var24 + (var22 - var20 - var15 - var21) / 2.0F;
            event.getContext().drawText(Fonts.SEMIBOLD.getFont(10.0F), var6, var27, var28, eb.WHITE);
            event.getContext().drawText(Fonts.REGULAR.getFont(9.0F), var12, var27, var28 + var20 + var15, new eb(200.0F, 200.0F, 200.0F, 255.0F));
            matrices.pop();
         }
      }
   }

   private void a(ae event) {
      if (mc.player == null || mc.world == null) return;
      String mode = Mytheria.getInstance().getWayPointsManager().getWaypointMode();
      if (mode.equals("CLASSIC") && !mode.equals("BOTH")) {
         // Для CLASSIC рисуем 3D только вблизи (<25 блоков) как "луч" по просьбе
         // оставим логику ниже с дистанцией
      }
      MatrixStack matrices = event.getMatrices();
      Camera cam = event.getCamera();
      Vec3d camPos = cam.getPos();
      Matrix4f posMat = matrices.peek().getPositionMatrix();
      for (Entry e : Mytheria.getInstance().getWayPointsManager().getEntries()) {
         Vec3d pos = (Vec3d)e.getValue();
         float dist = (float)camPos.distanceTo(pos.add(0.5, 0.5, 0.5));
         boolean close = dist < 25.0f;
         boolean isClassic = mode.equals("CLASSIC");
         boolean isBoth = mode.equals("BOTH");
         boolean isBeacon = mode.equals("BEACON") || isBoth || (isClassic && close);
         boolean isTracer = mode.equals("TRACER") || isBoth || (isClassic && close);
         boolean isDot3D = mode.equals("DOT");
         if (isDot3D) {
            // Рисуем маленький 3D куб как точку
            drawDotBox(matrices, camPos, pos);
            continue;
         }
         if (isTracer) {
            drawTracerLine(posMat, camPos, pos);
         }
         if (isBeacon) {
            drawBeaconBeam(posMat, camPos, pos);
         }
      }
   }

   private void drawTracerLine(Matrix4f mat, Vec3d camPos, Vec3d target) {
      Vec3d t = target.add(0.5, 0.5, 0.5);
      double x1 = 0, y1 = 0, z1 = 0;
      double x2 = t.x - camPos.x;
      double y2 = t.y - camPos.y;
      double z2 = t.z - camPos.z;
      eb col = ec.getAccentColor().withAlpha(180);
      int c = col.getRGB();
      int r = (c >> 16) & 0xFF, g = (c >> 8) & 0xFF, b = c & 0xFF, a = (c >> 24) & 0xFF;
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableDepthTest();
      RenderSystem.lineWidth(2.0f);
      BufferBuilder bb = RenderSystem.renderThreadTesselator().begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);
      bb.vertex(mat, (float)x1, (float)y1, (float)z1).color(r, g, b, a);
      bb.vertex(mat, (float)x2, (float)y2, (float)z2).color(r, g, b, 60);
      BufferRenderer.drawWithGlobalProgram(bb.end());
      RenderSystem.enableDepthTest();
      RenderSystem.disableBlend();
      RenderSystem.lineWidth(1.0f);
   }

   private void drawBeaconBeam(Matrix4f mat, Vec3d camPos, Vec3d target) {
      double x = target.x - camPos.x + 0.5;
      double y1 = target.y - camPos.y + 0.5;
      double y2 = y1 + 200; // луч вверх
      double z = target.z - camPos.z + 0.5;
      eb col = ec.getAccentColor().withAlpha(90);
      int c = col.getRGB();
      int r = (c >> 16) & 0xFF, g = (c >> 8) & 0xFF, bcol = c & 0xFF, acol = (c >> 24) & 0xFF;
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableDepthTest();
      RenderSystem.lineWidth(3.0f);
      BufferBuilder bb = RenderSystem.renderThreadTesselator().begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);
      // вертикальный луч
      bb.vertex(mat, (float)x, (float)y1, (float)z).color(r, g, bcol, acol);
      bb.vertex(mat, (float)x, (float)y2, (float)z).color(r, g, bcol, 0);
      // маленькая коробка у основания для точки
      double s = 0.3;
      Box box = new Box(target.x + 0.5 - s, target.y + 0.5 - s, target.z + 0.5 - s, target.x + 0.5 + s, target.y + 0.5 + s, target.z + 0.5 + s);
      double minX = box.minX - camPos.x, minY = box.minY - camPos.y, minZ = box.minZ - camPos.z;
      double maxX = box.maxX - camPos.x, maxY = box.maxY - camPos.y, maxZ = box.maxZ - camPos.z;
      // низ коробки
      bb.vertex(mat, (float)minX, (float)minY, (float)minZ).color(r,g,bcol,180);
      bb.vertex(mat, (float)maxX, (float)minY, (float)minZ).color(r,g,bcol,180);
      bb.vertex(mat, (float)maxX, (float)minY, (float)minZ).color(r,g,bcol,180);
      bb.vertex(mat, (float)maxX, (float)minY, (float)maxZ).color(r,g,bcol,180);
      bb.vertex(mat, (float)maxX, (float)minY, (float)maxZ).color(r,g,bcol,180);
      bb.vertex(mat, (float)minX, (float)minY, (float)maxZ).color(r,g,bcol,180);
      bb.vertex(mat, (float)minX, (float)minY, (float)maxZ).color(r,g,bcol,180);
      bb.vertex(mat, (float)minX, (float)minY, (float)minZ).color(r,g,bcol,180);
      BufferRenderer.drawWithGlobalProgram(bb.end());
      RenderSystem.enableDepthTest();
      RenderSystem.disableBlend();
      RenderSystem.lineWidth(1.0f);
   }

   private void drawDotBox(MatrixStack ms, Vec3d camPos, Vec3d target) {
      Matrix4f mat = ms.peek().getPositionMatrix();
      double s = 0.25;
      Box box = new Box(target.x + 0.5 - s, target.y + 0.5 - s, target.z + 0.5 - s, target.x + 0.5 + s, target.y + 0.5 + s, target.z + 0.5 + s);
      double minX = box.minX - camPos.x, minY = box.minY - camPos.y, minZ = box.minZ - camPos.z;
      double maxX = box.maxX - camPos.x, maxY = box.maxY - camPos.y, maxZ = box.maxZ - camPos.z;
      eb col = ec.getAccentColor();
      int c = col.getRGB();
      int r = (c >> 16) & 0xFF, g = (c >> 8) & 0xFF, b = c & 0xFF, a = (c >> 24) & 0xFF;
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableDepthTest();
      BufferBuilder bb = RenderSystem.renderThreadTesselator().begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);
      // 12 ребер куба
      bb.vertex(mat, (float)minX,(float)minY,(float)minZ).color(r,g,b,a); bb.vertex(mat, (float)maxX,(float)minY,(float)minZ).color(r,g,b,a);
      bb.vertex(mat, (float)maxX,(float)minY,(float)minZ).color(r,g,b,a); bb.vertex(mat, (float)maxX,(float)minY,(float)maxZ).color(r,g,b,a);
      bb.vertex(mat, (float)maxX,(float)minY,(float)maxZ).color(r,g,b,a); bb.vertex(mat, (float)minX,(float)minY,(float)maxZ).color(r,g,b,a);
      bb.vertex(mat, (float)minX,(float)minY,(float)maxZ).color(r,g,b,a); bb.vertex(mat, (float)minX,(float)minY,(float)minZ).color(r,g,b,a);
      bb.vertex(mat, (float)minX,(float)maxY,(float)minZ).color(r,g,b,a); bb.vertex(mat, (float)maxX,(float)maxY,(float)minZ).color(r,g,b,a);
      bb.vertex(mat, (float)maxX,(float)maxY,(float)minZ).color(r,g,b,a); bb.vertex(mat, (float)maxX,(float)maxY,(float)maxZ).color(r,g,b,a);
      bb.vertex(mat, (float)maxX,(float)maxY,(float)maxZ).color(r,g,b,a); bb.vertex(mat, (float)minX,(float)maxY,(float)maxZ).color(r,g,b,a);
      bb.vertex(mat, (float)minX,(float)maxY,(float)maxZ).color(r,g,b,a); bb.vertex(mat, (float)minX,(float)maxY,(float)minZ).color(r,g,b,a);
      bb.vertex(mat, (float)minX,(float)minY,(float)minZ).color(r,g,b,a); bb.vertex(mat, (float)minX,(float)maxY,(float)minZ).color(r,g,b,a);
      bb.vertex(mat, (float)maxX,(float)minY,(float)minZ).color(r,g,b,a); bb.vertex(mat, (float)maxX,(float)maxY,(float)minZ).color(r,g,b,a);
      bb.vertex(mat, (float)maxX,(float)minY,(float)maxZ).color(r,g,b,a); bb.vertex(mat, (float)maxX,(float)maxY,(float)maxZ).color(r,g,b,a);
      bb.vertex(mat, (float)minX,(float)minY,(float)maxZ).color(r,g,b,a); bb.vertex(mat, (float)minX,(float)maxY,(float)maxZ).color(r,g,b,a);
      BufferRenderer.drawWithGlobalProgram(bb.end());
      RenderSystem.enableDepthTest();
      RenderSystem.disableBlend();
   }
}
