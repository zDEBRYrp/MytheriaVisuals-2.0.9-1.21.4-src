package a;
import a.b;
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
import a.dx;
import a.uc.R;
import a.uc.aS;
import a.uc.cD;
import a.uc.U;
import a.d;
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
import a.uc.eG;
import a.uc.dA;
import a.uc.eI;
import a.uc.aE;
import a.uc.dE;
import a.uc.M;
import a.uc.dW;
import a.h;
import a.uc.J;
import a.uc.Q;
import a.uc.N;
import a.uc.bW;
import a.uc.P;
import a.uc.fJ;
import a.uc.V;
import a.g;
import a.uc.fD;
import a.uc.eX;
import a.uc.Z;
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
import a.uc.eB;
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
import a.uc.aD;
import a.uc.fI;
import a.uc.T;
import a.uc.dB;
import a.uc.cV;
import a.c;
import a.uc.aY;
import a.uc.dT;
import a.uc.dJ;
import a.uc.fF;
import a.uc.aR;
import a.uc.fG;
import a.uc.dV;
import a.uc.aX;
import a.uc.dG;
import a.e;
import a.uc.dP;
import a.uc.Y;
import a.uc.cM;
import a.uc.eQ;
import a.uc.eV;
import a.uc.cS;
import a.uc.bO;
import a.uc.eC;
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
import a.s;
import a.uc.fH;
import a.uc.dU;
import a.uc.dN;
import a.uc.fN;
import a.uc.cZ;
import a.uc.eU;
import a.uc.bJ;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.resource.Resource;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class fy {
   private static final Logger a = LoggerFactory.getLogger(fy.class);
   private static final List<fy> b = new ArrayList<>();
   private final Map<Identifier, fy.b> c = new HashMap<>();
   private final List<fy.a> d = new ArrayList<>();
   private Identifier e;
   private boolean f = false;
   private final int g;
   private final int h;

   public static fy getOrCreateAtlasFor(int width, int height) {
      for (fy var3 : b) {
         if (var3.g == width && var3.h == height && !var3.isBuilt()) {
            return var3;
         }
      }

      fy var4 = new fy(width, height);
      b.add(var4);
      return var4;
   }

   private fy(int frameWidth, int frameHeight) {
      this.g = frameWidth;
      this.h = frameHeight;
   }

   public void registerAnimation(Identifier animationId, fz meta, List<NativeImage> frames) {
      if (this.f) {
         throw new RuntimeException("Атлас уже собран! Регистрируйте анимации до вызова buildAtlas()");
      }

      if (!frames.isEmpty()) {
         for (NativeImage var5 : frames) {
            if (var5.getWidth() != this.g || var5.getHeight() != this.h) {
               throw new RuntimeException(
                  String.format(
                     "Размер кадров анимации %s (%dx%d) не совпадает с размером этого атласа (%dx%d)",
                     animationId,
                     var5.getWidth(),
                     var5.getHeight(),
                     this.g,
                     this.h
                  )
               );
            }
         }

         int var6 = this.d.size();

         for (int var7 = 0; var7 < frames.size(); var7++) {
            this.d.add(new fy.a(animationId, var7, (NativeImage)frames.get(var7)));
         }

         fy.b var8 = new fy.b(animationId, meta, var6, frames.size(), null);
         this.c.put(animationId, var8);
      }
   }

   public void registerAnimationFromPenisFile(Identifier penisFile) {
      try {
         ResourceManager var2 = MinecraftClient.getInstance().getResourceManager();
         Optional var3 = var2.getResource(penisFile);
         if (var3.isEmpty()) {
            return;
         }

         Resource var4 = (Resource)var3.get();
         fz var5 = null;
         ArrayList var6 = new ArrayList();

         try (
            InputStream var7 = var4.getInputStream();
            ZipInputStream var8 = new ZipInputStream(var7);
         ) {
            TreeMap<String, byte[]> var9 = new TreeMap<>();

            ZipEntry var10;
            while ((var10 = var8.getNextEntry()) != null) {
               String var11 = var10.getName();
               if ("meta.json".equals(var11)) {
                  ByteArrayOutputStream var12 = new ByteArrayOutputStream();
                  byte[] var13 = new byte[1024];

                  int var14;
                  while ((var14 = var8.read(var13)) > 0) {
                     var12.write(var13, 0, var14);
                  }

                  String var15 = var12.toString(StandardCharsets.UTF_8);
                  var5 = fz.fromJson(var15);
               } else if (var11.startsWith("frames/") && var11.endsWith(".png")) {
                  ByteArrayOutputStream var22 = new ByteArrayOutputStream();
                  byte[] var24 = new byte[1024];

                  int var26;
                  while ((var26 = var8.read(var24)) > 0) {
                     var22.write(var24, 0, var26);
                  }

                  var9.put(var11, var22.toByteArray());
               }

               var8.closeEntry();
            }

            for (byte[] var23 : var9.values()) {
               NativeImage var25 = NativeImage.read(new ByteArrayInputStream(var23));
               var6.add(var25);
            }
         }

         if (var5 == null) {
            throw new RuntimeException("Не найден meta.json в " + penisFile);
         }

         if (var6.isEmpty()) {
            throw new RuntimeException("Нет кадров для анимации " + penisFile);
         }

         if (((NativeImage)var6.get(0)).getWidth() != this.g || ((NativeImage)var6.get(0)).getHeight() != this.h) {
            throw new RuntimeException(
               String.format(
                  "Размер кадров анимации %s (%dx%d) не совпадает с размером этого атласа (%dx%d)",
                  penisFile,
                  ((NativeImage)var6.get(0)).getWidth(),
                  ((NativeImage)var6.get(0)).getHeight(),
                  this.g,
                  this.h
               )
            );
         }

         this.registerAnimation(penisFile, var5, var6);
      } catch (Exception var20) {
      }
   }

   public void buildAtlas() {
      if (!this.f && !this.d.isEmpty()) {
         int var1 = this.d.size();
         int var2 = (int)Math.ceil(Math.sqrt(var1));
         int var3 = (int)Math.ceil((double)var1 / var2);
         int var4 = var2 * this.g;
         int var5 = var3 * this.h;
         NativeImage var6 = new NativeImage(var4, var5, false);

         for (int var7 = 0; var7 < var4; var7++) {
            for (int var8 = 0; var8 < var5; var8++) {
               var6.setColor(var7, var8, 0);
            }
         }

         for (int var20 = 0; var20 < var1; var20++) {
            int var22 = var20 % var2;
            int var9 = var20 / var2;
            int var10 = var22 * this.g;
            int var11 = var9 * this.h;
            NativeImage var12 = this.d.get(var20).image;

            for (int var13 = 0; var13 < this.g; var13++) {
               for (int var14 = 0; var14 < this.h; var14++) {
                  var6.setColor(var10 + var13, var11 + var14, var12.getColor(var13, var14));
               }
            }
         }

         this.e = Identifier.of("mytheria", "global_animation_atlas_" + this.g + "x" + this.h);
         NativeImageBackedTexture var21 = new NativeImageBackedTexture(var6);
         MinecraftClient.getInstance().getTextureManager().registerTexture(this.e, var21);

         for (fy.b var24 : this.c.values()) {
            var24.atlasTexture = this.e;
            ArrayList var25 = new ArrayList();

            for (int var26 = 0; var26 < var24.frameCount; var26++) {
               int var27 = var24.startIndex + var26;
               int var28 = var27 % var2;
               int var29 = var27 / var2;
               float var15 = (float)var28 / var2;
               float var16 = (float)var29 / var3;
               float var17 = (float)(var28 + 1) / var2;
               float var18 = (float)(var29 + 1) / var3;
               fB var19 = new fB(this.e, var15, var16, var17, var18, this.g, this.h);
               var25.add(var19);
            }

            var24.sprites = var25;
         }

         this.f = true;
      }
   }

   public static fy.b getAnimationRegion(Identifier animationId) {
      for (fy var2 : b) {
         fy.b var3 = var2.c.get(animationId);
         if (var3 != null) {
            return var3;
         }
      }

      return null;
   }

   public Identifier getAtlasTexture() {
      return this.e;
   }

   public boolean isBuilt() {
      return this.f;
   }

   public void clear() {
      if (this.e != null) {
         MinecraftClient.getInstance().getTextureManager().destroyTexture(this.e);
      }

      for (fy.a var2 : this.d) {
         try {
            var2.image.close();
         } catch (Exception var4) {
         }
      }

      this.c.clear();
      this.d.clear();
      this.f = false;
   }

   public static void clearAllAtlases() {
      for (fy var1 : b) {
         var1.clear();
      }

      b.clear();
   }

   static class a {
      public final Identifier animationId;
      public final int frameIndex;
      public final NativeImage image;

      public a(Identifier animationId, int frameIndex, NativeImage image) {
         this.animationId = animationId;
         this.frameIndex = frameIndex;
         this.image = image;
      }
   }

   public static class b {
      public final Identifier animationId;
      public final fz meta;
      public final int startIndex;
      public final int frameCount;
      public Identifier atlasTexture;
      public List<fB> sprites;

      public b(Identifier animationId, fz meta, int startIndex, int frameCount, Identifier atlasTexture) {
         this.animationId = animationId;
         this.meta = meta;
         this.startIndex = startIndex;
         this.frameCount = frameCount;
         this.atlasTexture = atlasTexture;
      }

      public fB getFrameSprite(int frameIndex) {
         return this.sprites != null && frameIndex >= 0 && frameIndex < this.sprites.size() ? this.sprites.get(frameIndex) : null;
      }
   }
}
