package nesquik.mytheria.framework.shader;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import nesquik.mytheria.mixin.accessors.ShaderProgramAccessor;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Defines;
import net.minecraft.client.gl.GlUniform;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.client.gl.ShaderLoader.LoadException;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.Nullable;

public class GlProgram {
   private static final List<Runnable> REGISTERED_PROGRAMS = new ArrayList<>();
   protected ShaderProgram backingProgram;
   protected ShaderProgramKey programKey;

   public GlProgram(Identifier id, VertexFormat vertexFormat) {
      this.programKey = new ShaderProgramKey(id.withPrefixedPath("core/"), vertexFormat, Defines.EMPTY);
      REGISTERED_PROGRAMS.add(() -> {
         try {
            this.backingProgram = MinecraftClient.getInstance().getShaderLoader().getProgramToLoad(this.programKey);
            this.setup();
         } catch (LoadException var2) {
            throw new RuntimeException("Failed to initialize shader program", var2);
         }
      });
   }

   public net.minecraft.client.render.RenderPhase.ShaderProgram renderPhaseProgram() {
      return new net.minecraft.client.render.RenderPhase.ShaderProgram(this.programKey);
   }

   public ShaderProgram use() {
      return this.backingProgram == null ? null : RenderSystem.setShader(this.programKey);
   }

   public void setup() {
   }

   /**
    * Возвращает uniform по имени или null если программа ещё не загружена / uniform вырезан оптимизатором / Iris перехватил стейт.
    * ВАЖНО: результат может быть null — всегда проверяйте перед вызовом GlUniform#set.
    */
   @Nullable
   public GlUniform findUniform(String name) {
      return this.backingProgram == null ? null : ((ShaderProgramAccessor)this.backingProgram).getUniformsByName().get(name);
   }

   // ===== Безопасные хелперы — не кидают NPE даже если uniform == null =====

   public boolean isReady() {
      return this.backingProgram != null;
   }

   public void setFloat(String name, float v) {
      GlUniform u = findUniform(name);
      if (u != null) u.set(v);
   }

   public void setInt(String name, int v) {
      GlUniform u = findUniform(name);
      if (u != null) u.set(v);
   }

   public void set2f(String name, float x, float y) {
      GlUniform u = findUniform(name);
      if (u != null) u.set(x, y);
   }

   public void set3f(String name, float x, float y, float z) {
      GlUniform u = findUniform(name);
      if (u != null) u.set(x, y, z);
   }

   public void set4f(String name, float x, float y, float z, float w) {
      GlUniform u = findUniform(name);
      if (u != null) u.set(x, y, z, w);
   }

   /** Для вызовов вида set(float[]) — напр. ff.getRGBf() -> float[3] */
   public void setFloatArray(String name, float[] arr) {
      if (arr == null) return;
      GlUniform u = findUniform(name);
      if (u == null) return;
      switch (arr.length) {
         case 1 -> u.set(arr[0]);
         case 2 -> u.set(arr[0], arr[1]);
         case 3 -> u.set(arr[0], arr[1], arr[2]);
         case 4 -> u.set(arr[0], arr[1], arr[2], arr[3]);
         default -> {
            if (arr.length >= 4) u.set(arr[0], arr[1], arr[2], arr[3]);
            else if (arr.length == 3) u.set(arr[0], arr[1], arr[2]);
            else if (arr.length == 2) u.set(arr[0], arr[1]);
            else if (arr.length == 1) u.set(arr[0]);
         }
      }
   }

   /** Универсальный varargs-хелпер: setUniform("Size", w, h) / setUniform("Radius", r1,r2,r3,r4) */
   public void setUniform(String name, float... values) {
      if (values == null) return;
      GlUniform u = findUniform(name);
      if (u == null) return;
      switch (values.length) {
         case 1 -> u.set(values[0]);
         case 2 -> u.set(values[0], values[1]);
         case 3 -> u.set(values[0], values[1], values[2]);
         case 4 -> u.set(values[0], values[1], values[2], values[3]);
         default -> {
            if (values.length >= 1) u.set(values[0]);
         }
      }
   }

   public void setUniform(String name, int value) {
      setInt(name, value);
   }

   @Internal
   public static void loadAndSetupPrograms() {
      REGISTERED_PROGRAMS.forEach(Runnable::run);
   }
}
