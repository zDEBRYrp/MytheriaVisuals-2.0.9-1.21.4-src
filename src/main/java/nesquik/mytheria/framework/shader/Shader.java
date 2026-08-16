package nesquik.mytheria.framework.shader;

import com.mojang.blaze3d.systems.RenderSystem;
import java.io.InputStream;
import java.nio.FloatBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.MemoryStack;

public class Shader {
   public final int programId;
   private final Map<String, Integer> uniformCache = new HashMap<>();

   public Shader(String path, String shaderName) {
      int var3 = GL20.glCreateProgram();

      try {
         String var4 = "/assets/mytheria/shaders/core/" + path + "/";
         String var5 = this.readShaderSource(var4 + shaderName + ".vsh");
         String var6 = this.readShaderSource(var4 + shaderName + ".fsh");
         GL20.glAttachShader(var3, this.createShader(var5, 35633));
         GL20.glAttachShader(var3, this.createShader(var6, 35632));
         GL20.glLinkProgram(var3);
         if (GL20.glGetProgrami(var3, 35714) == 0) {
            throw new IllegalStateException("Shader linking failed: " + GL20.glGetProgramInfoLog(var3));
         }
      } catch (Exception var7) {
         GL20.glDeleteProgram(var3);
         throw new RuntimeException("Failed to create shader: " + shaderName, var7);
      }

      this.programId = var3;
   }

   private String readShaderSource(String path) throws Exception {
      InputStream var2 = Shader.class.getResourceAsStream(path);
      if (var2 == null) {
         throw new Exception("Shader file not found: " + path);
      } else {
         return IOUtils.toString(var2, StandardCharsets.UTF_8);
      }
   }

   private int createShader(String source, int type) throws Exception {
      int var3 = GL20.glCreateShader(type);
      if (var3 == 0) {
         throw new Exception("Error creating shader of type " + type);
      } else {
         GL20.glShaderSource(var3, source);
         GL20.glCompileShader(var3);
         if (GL20.glGetShaderi(var3, 35713) == 0) {
            throw new Exception("Error compiling shader type " + type + ": " + GL20.glGetShaderInfoLog(var3, 1024));
         } else {
            return var3;
         }
      }
   }

   public void bind() {
      GL20.glUseProgram(this.programId);
   }

   public void unbind() {
      GL20.glUseProgram(0);
   }

   private int getUniformLocation(String name) {
      return this.uniformCache.computeIfAbsent(name, n -> GL20.glGetUniformLocation(this.programId, n));
   }

   public void setUniform1i(String name, int value) {
      RenderSystem.assertOnRenderThread();
      GL20.glUniform1i(this.getUniformLocation(name), value);
   }

   public void setUniform1f(String name, float value) {
      RenderSystem.assertOnRenderThread();
      GL20.glUniform1f(this.getUniformLocation(name), value);
   }

   public void setUniform2f(String name, float v1, float v2) {
      RenderSystem.assertOnRenderThread();
      GL20.glUniform2f(this.getUniformLocation(name), v1, v2);
   }

   public void setUniform2f(String name, Vector2f vector) {
      RenderSystem.assertOnRenderThread();
      GL20.glUniform2f(this.getUniformLocation(name), vector.x, vector.y);
   }

   public void setUniform3f(String name, Vector3f vector) {
      RenderSystem.assertOnRenderThread();
      GL20.glUniform3f(this.getUniformLocation(name), vector.x, vector.y, vector.z);
   }

   public void setUniformMatrix4f(String name, boolean transpose, Matrix4f matrix) {
      RenderSystem.assertOnRenderThread();
      MemoryStack var4 = MemoryStack.stackPush();

      try {
         FloatBuffer var5 = var4.mallocFloat(16);
         matrix.get(var5);
         GL20.glUniformMatrix4fv(this.getUniformLocation(name), transpose, var5);
      } catch (Throwable var8) {
         if (var4 != null) {
            try {
               var4.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }
         }

         throw var8;
      }

      if (var4 != null) {
         var4.close();
      }
   }

   public void setUniformBool(String name, boolean value) {
      this.setUniform1i(name, value ? 1 : 0);
   }

   public void delete() {
      GL20.glDeleteProgram(this.programId);
   }
}
