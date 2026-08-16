package nesquik.mytheria.framework.msdf;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import nesquik.mytheria.Mytheria;
import net.minecraft.client.MinecraftClient;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;

public final class ResourceProvider {
   private static final ResourceManager RESOURCE_MANAGER = MinecraftClient.getInstance().getResourceManager();
   private static final Gson GSON = new Gson();

   public static Identifier getShaderIdentifier(String name) {
      return Mytheria.id("core/" + name);
   }

   public static <T> T fromJsonToInstance(Identifier identifier, Class<T> clazz) {
      return (T)GSON.fromJson(toString(identifier), clazz);
   }

   public static String toString(Identifier identifier) {
      return toString(identifier, "\n");
   }

   public static String toString(Identifier identifier, String delimiter) {
      try (
         InputStream var3 = RESOURCE_MANAGER.open(identifier);
         BufferedReader var4 = new BufferedReader(new InputStreamReader(var3));
      ) {
         return var4.lines().collect(Collectors.joining(delimiter));
      } catch (IOException var11) {
         throw new RuntimeException(var11);
      }
   }
}
