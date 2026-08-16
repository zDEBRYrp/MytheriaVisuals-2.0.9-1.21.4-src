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

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaPlayerInfo;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.util.Identifier;

public class fN implements IMinecraft {
   private final Thread a;
   private IMediaSession b;
   private eb c = eb.WHITE;
   private final Map<Integer, Identifier> d = new ConcurrentHashMap<>();
   private final Map<Integer, eb> e = new ConcurrentHashMap<>();
   private static final Random f = new Random();
   private String g = "";
   private String h = "";
   private volatile boolean i = true;

   public fN() {
      this.a = new Thread(() -> {
         while (!Thread.currentThread().isInterrupted() && this.i) {
            try {
               Thread.sleep(100L);
               if (this.i) {
                  this.a();
               }
            } catch (InterruptedException var2) {
               Thread.currentThread().interrupt();
               break;
            } catch (Error var3) {
               break;
            }
         }
      });
      this.a.setDaemon(true);
      this.a.start();
   }

   private void a() {
      if (this.i) {
         try {
            MediaPlayerInfo.INSTANCE.getMediaSessions().clear();
            List<IMediaSession> var1 = MediaPlayerInfo.INSTANCE.getMediaSessions();
            this.b = var1.stream()
               .filter(session1 -> !session1.getMedia().getArtist().isEmpty() && !session1.getMedia().getTitle().isEmpty())
               .findFirst()
               .orElse(null);
            if (this.b != null) {
               String var2 = this.b.getMedia().getArtist() + " - " + this.b.getMedia().getTitle();
               if (!var2.equals(this.h)) {
                  this.h = var2;
                  this.g = "";
                  String var3 = fM.fetchFromGenius(this.b.getMedia().getArtist(), this.b.getMedia().getTitle());
                  if (var3 != null) {
                     this.g = var3;
                  }
               }
            }
         } catch (Throwable var4) {
            this.b = null;
         }
      }
   }

   public Identifier getImage() {
      if (!this.i) {
         return null;
      }

      try {
         if (this.d.size() > 10) {
            this.d.clear();
            this.e.clear();
         }

         boolean var1 = this.b.getOwner().toLowerCase().contains("spotify");
         byte[] var2 = this.b.getMedia().getArtworkPng();
         int var3 = Arrays.hashCode(var2);
         if (this.d.containsKey(var3)) {
            this.c = this.e.get(var3);
            return this.d.get(var3);
         }

         Identifier var4 = Mytheria.id("temp/" + b());
         NativeImage var5 = NativeImage.read(var2);
         NativeImage var6 = var5;
         if (var1) {
            int var7 = var5.getWidth();
            int var8 = var5.getHeight();
            int var9 = (int)(var7 * 0.11);
            int var10 = (int)(var7 * 0.11);
            int var11 = (int)(var8 * 0.22);
            int var12 = var7 - var9 - var10;
            int var13 = var8 - var11;
            if (var12 > 0 && var13 > 0) {
               var6 = new NativeImage(var5.getFormat(), var12, var13, false);

               for (int var14 = 0; var14 < var13; var14++) {
                  for (int var15 = 0; var15 < var12; var15++) {
                     int var16 = var15 + var9;
                     int var17 = var5.getColorArgb(var16, var14);
                     var6.setColorArgb(var15, var14, var17);
                  }
               }

               var5.close();
            }
         }

         NativeImage var19 = var6;
         mc.execute(() -> mc.getTextureManager().registerTexture(var4, new NativeImageBackedTexture(var19)));
         this.c = this.getAverageColor(var6, 1);
         this.e.put(var3, this.c);
         this.d.put(var3, var4);
         return var4;
      } catch (Exception var18) {
         return null;
      }
   }

   public eb getAverageColor(NativeImage image, int step) {
      int var3 = image.getWidth();
      int var4 = image.getHeight();
      long var5 = 0L;
      long var7 = 0L;
      long var9 = 0L;
      long var11 = 0L;
      int var13 = 0;
      int var14 = 0;

      while (var14 < var4) {
         for (int var15 = 0; var15 < var3; var15 += step) {
            int var16 = image.getColorArgb(var15, var14);
            int var17 = var16 >> 24 & 0xFF;
            if (var17 != 0) {
               var5 += var17;
               var7 += var16 >> 16 & 0xFF;
               var9 += var16 >> 8 & 0xFF;
               var11 += var16 & 0xFF;
               var13++;
            }
         }

         var14 += step;
      }

      if (var13 == 0) {
         return eb.WHITE;
      }

      float var18 = 50.0F;
      return new eb((float)var7 / var13 + var18, (float)var9 / var13 + var18, (float)var11 / var13 + var18);
   }

   private static String b() {
      StringBuilder var0 = new StringBuilder(32);

      for (int var1 = 0; var1 < 32; var1++) {
         char var2 = (char)(97 + f.nextInt(26));
         var0.append(var2);
      }

      return var0.toString();
   }

   public boolean haveActiveSession() {
      return this.i && this.b != null;
   }

   @Override
   public boolean equals(Object o) {
      if (o != null && this.getClass() == o.getClass()) {
         fN var2 = (fN)o;
         return Objects.equals(this.a, var2.a)
            && Objects.equals(this.b, var2.b)
            && Objects.equals(this.c, var2.c)
            && Objects.equals(this.d, var2.d)
            && Objects.equals(this.e, var2.e)
            && Objects.equals(this.g, var2.g)
            && Objects.equals(this.h, var2.h);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.g, this.h);
   }

   @Generated
   public Thread getThread() {
      return this.a;
   }

   @Generated
   public void shutdown() {
      this.i = false;
      if (this.a != null && this.a.isAlive()) {
         this.a.interrupt();

         try {
            this.a.join(500L);
         } catch (InterruptedException var2) {
            Thread.currentThread().interrupt();
         }
      }

      this.d.clear();
      this.e.clear();
      this.b = null;
   }

   @Generated
   public IMediaSession getSession() {
      return this.b;
   }

   @Generated
   public eb getMediaColor() {
      return this.c;
   }

   @Generated
   public Map<Integer, Identifier> getTextureCache() {
      return this.d;
   }

   @Generated
   public Map<Integer, eb> getColorCache() {
      return this.e;
   }

   @Generated
   public String getLyrics() {
      return this.g;
   }

   @Generated
   public String getLastTrack() {
      return this.h;
   }
}
