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

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fM {
   private static final HttpClient a = HttpClient.newHttpClient();

   public static String fetchFromGenius(String artist, String title) {
      if (artist != null && title != null && !artist.isBlank() && !title.isBlank()) {
         try {
            fM.a var2 = a(artist, title);
            if (var2 == null) {
               return null;
            }

            String var3 = a(var2.b);
            if (var3 == null && var2.a != null) {
               var3 = a(var2.a);
            }

            return var3;
         } catch (IOException var4) {
         } catch (InterruptedException var5) {
            Thread.currentThread().interrupt();
         } catch (Exception var6) {
         }

         return null;
      } else {
         return null;
      }
   }

   private static fM.a a(String artist, String title) throws IOException, InterruptedException {
      String var2 = URLEncoder.encode(artist + " " + title, StandardCharsets.UTF_8);
      HttpRequest var3 = HttpRequest.newBuilder()
         .uri(URI.create("https://api.genius.com/search?q=" + var2))
         .header("Authorization", "Bearer batnaM4ixvdL448SIofj6I6aqLsRZ2RuLowRA8tXoWYUAse55DoAX7Xf7MT0vjy5")
         .header("Accept", "application/json")
         .GET()
         .build();
      HttpResponse var4 = a.send(var3, BodyHandlers.ofString());
      if (var4.statusCode() != 200) {
         return null;
      }

      JsonObject var5 = JsonParser.parseString((String)var4.body()).getAsJsonObject();
      JsonObject var6 = var5.getAsJsonObject("meta");
      if (var6 != null && var6.has("status") && var6.get("status").getAsInt() != 200) {
         return null;
      }

      JsonObject var7 = var5.getAsJsonObject("response");
      if (var7 != null && var7.has("hits")) {
         for (JsonElement var9 : var7.getAsJsonArray("hits")) {
            JsonObject var10 = var9.getAsJsonObject().getAsJsonObject("result");
            if (var10 != null && var10.has("url") && var10.has("id")) {
               return new fM.a(var10.get("url").getAsString(), var10.get("id").getAsInt());
            }
         }
      }

      return null;
   }

   private static String a(int id) throws IOException, InterruptedException {
      HttpRequest var1 = HttpRequest.newBuilder()
         .uri(URI.create("https://api.genius.com/songs/" + id + "?text_format=plain"))
         .header("Authorization", "Bearer batnaM4ixvdL448SIofj6I6aqLsRZ2RuLowRA8tXoWYUAse55DoAX7Xf7MT0vjy5")
         .header("Accept", "application/json")
         .GET()
         .build();
      HttpResponse var2 = a.send(var1, BodyHandlers.ofString());
      if (var2.statusCode() != 200) {
         return null;
      }

      JsonObject var3 = JsonParser.parseString((String)var2.body()).getAsJsonObject();
      JsonObject var4 = Optional.ofNullable(var3.getAsJsonObject("response")).map(obj -> obj.getAsJsonObject("song")).orElse(null);
      if (var4 != null && var4.has("lyrics")) {
         JsonObject var5 = var4.getAsJsonObject("lyrics");
         if (var5.has("plain")) {
            return var5.get("plain").getAsString();
         }
      }

      return var4 != null && var4.has("lyrics_body") ? var4.get("lyrics_body").getAsString() : null;
   }

   private static String a(String url) throws IOException, InterruptedException {
      HttpRequest var1 = HttpRequest.newBuilder()
         .uri(URI.create(url))
         .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36")
         .header("Accept-Language", "en-US,en;q=0.9")
         .GET()
         .build();
      HttpResponse var2 = a.send(var1, BodyHandlers.ofString());
      Pattern var3 = Pattern.compile("(<div[^>]*class=\"[^\"]*Lyrics__Container[^\"]*\"[^>]*>.*?</div>)", 32);
      Matcher var4 = var3.matcher((CharSequence)var2.body());
      StringBuilder var5 = new StringBuilder();

      while (var4.find()) {
         String var6 = var4.group(1).replaceAll("<br\\s*/?>", "\n").replaceAll("<.*?>", "").replaceAll("&quot;", "\"").trim();
         if (!var6.isEmpty()) {
            var5.append(var6).append("\n\n");
         }
      }

      return var5.isEmpty() ? null : var5.toString().trim();
   }

   record a(String a, int b) {

      a(String a, int b) {
         this.a = a;
         this.b = b;
      }

      public String url() {
         return this.a;
      }

      public int id() {
         return this.b;
      }
   }
}
