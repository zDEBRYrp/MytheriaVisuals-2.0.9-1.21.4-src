package dev.redstones.mediaplayerinfo.impl.win;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaPlayerInfo;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WindowsMediaPlayerInfo implements MediaPlayerInfo {
   @Override
   public native List<IMediaSession> getMediaSessions();

   static {
      try {
         Path var0 = Files.createTempDirectory("mediaplayerinfo-");
         Path var1 = var0.resolve("MediaPlayerInfo.dll");

         try (InputStream var2 = WindowsMediaPlayerInfo.class.getResourceAsStream("/mediaplayerinfo/natives/win/MediaPlayerInfo.dll")) {
            if (var2 == null) {
               throw new IOException("Resource not found: /mediaplayerinfo/natives/win/MediaPlayerInfo.dll");
            }

            Files.write(var1, var2.readAllBytes());
         }

         System.load(var1.toAbsolutePath().toString());

         try {
            Files.deleteIfExists(var1);
            Files.deleteIfExists(var0);
         } catch (IOException var6) {
            var1.toFile().deleteOnExit();
            var0.toFile().deleteOnExit();
         }
      } catch (IOException var8) {
         throw new RuntimeException("Failed to load MediaPlayerInfo.dll", var8);
      }
   }
}
