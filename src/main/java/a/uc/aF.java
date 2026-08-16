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

import com.google.gson.JsonObject;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import lombok.Generated;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.utility.animation.base.Easing;
import nesquik.mytheria.utility.interfaces.IMinecraft;

public class aF implements IMinecraft {
   private final File a;
   private final String b;
   private final dZ c = new dZ(300L, Easing.FIGMA_EASE_IN_OUT);
   private final dZ d = new dZ(300L, Easing.FIGMA_EASE_IN_OUT);

   public aF(String fileName) {
      this.b = fileName;
      File var2 = new File(mc.runDirectory, "Mytheria/presets/swing");
      if (!var2.exists()) {
         var2.mkdirs();
      }

      this.a = new File(var2, fileName + ".myth");
   }

   public void load() {
      if (this.a.exists()) {
         try (FileReader var1 = new FileReader(this.a)) {
            JsonObject var2 = (JsonObject)ar.GSON.fromJson(var1, JsonObject.class);
            az var3 = Mytheria.getInstance().getSwingManager();
            if (var2.has("bezier")) {
               var3.getBezier().load(var2.get("bezier"));
            }

            if (var2.has("swingBack")) {
               var3.getBack().enabled(var2.get("swingBack").getAsBoolean());
            }

            if (var2.has("speed")) {
               var3.getSpeed().setCurrentValue(var2.get("speed").getAsFloat());
            }

            if (var2.has("startPhase")) {
               JsonObject var4 = var2.getAsJsonObject("startPhase");
               aA var5 = var3.getStartPhase();
               if (var4.has("anchorX")) {
                  var5.getAnchorX().setCurrentValue(var4.get("anchorX").getAsFloat());
               }

               if (var4.has("anchorY")) {
                  var5.getAnchorY().setCurrentValue(var4.get("anchorY").getAsFloat());
               }

               if (var4.has("anchorZ")) {
                  var5.getAnchorZ().setCurrentValue(var4.get("anchorZ").getAsFloat());
               }

               if (var4.has("moveX")) {
                  var5.getMoveX().setCurrentValue(var4.get("moveX").getAsFloat());
               }

               if (var4.has("moveY")) {
                  var5.getMoveY().setCurrentValue(var4.get("moveY").getAsFloat());
               }

               if (var4.has("moveZ")) {
                  var5.getMoveZ().setCurrentValue(var4.get("moveZ").getAsFloat());
               }

               if (var4.has("rotateX")) {
                  var5.getRotateX().setCurrentValue(var4.get("rotateX").getAsFloat());
               }

               if (var4.has("rotateY")) {
                  var5.getRotateY().setCurrentValue(var4.get("rotateY").getAsFloat());
               }

               if (var4.has("rotateZ")) {
                  var5.getRotateZ().setCurrentValue(var4.get("rotateZ").getAsFloat());
               }
            }

            if (var2.has("endPhase")) {
               JsonObject var9 = var2.getAsJsonObject("endPhase");
               aA var10 = var3.getEndPhase();
               if (var9.has("anchorX")) {
                  var10.getAnchorX().setCurrentValue(var9.get("anchorX").getAsFloat());
               }

               if (var9.has("anchorY")) {
                  var10.getAnchorY().setCurrentValue(var9.get("anchorY").getAsFloat());
               }

               if (var9.has("anchorZ")) {
                  var10.getAnchorZ().setCurrentValue(var9.get("anchorZ").getAsFloat());
               }

               if (var9.has("moveX")) {
                  var10.getMoveX().setCurrentValue(var9.get("moveX").getAsFloat());
               }

               if (var9.has("moveY")) {
                  var10.getMoveY().setCurrentValue(var9.get("moveY").getAsFloat());
               }

               if (var9.has("moveZ")) {
                  var10.getMoveZ().setCurrentValue(var9.get("moveZ").getAsFloat());
               }

               if (var9.has("rotateX")) {
                  var10.getRotateX().setCurrentValue(var9.get("rotateX").getAsFloat());
               }

               if (var9.has("rotateY")) {
                  var10.getRotateY().setCurrentValue(var9.get("rotateY").getAsFloat());
               }

               if (var9.has("rotateZ")) {
                  var10.getRotateZ().setCurrentValue(var9.get("rotateZ").getAsFloat());
               }
            }
         } catch (Exception var8) {
            var8.printStackTrace();
         }
      }
   }

   public void save() {
      try {
         if (!this.a.exists()) {
            this.a.createNewFile();
         }

         az var1 = Mytheria.getInstance().getSwingManager();
         JsonObject var2 = new JsonObject();
         var2.add("bezier", var1.getBezier().save());
         var2.addProperty("swingBack", var1.getBack().isEnabled());
         var2.addProperty("speed", var1.getSpeed().getCurrentValue());
         JsonObject var3 = new JsonObject();
         aA var4 = var1.getStartPhase();
         var3.addProperty("anchorX", var4.getAnchorX().getCurrentValue());
         var3.addProperty("anchorY", var4.getAnchorY().getCurrentValue());
         var3.addProperty("anchorZ", var4.getAnchorZ().getCurrentValue());
         var3.addProperty("moveX", var4.getMoveX().getCurrentValue());
         var3.addProperty("moveY", var4.getMoveY().getCurrentValue());
         var3.addProperty("moveZ", var4.getMoveZ().getCurrentValue());
         var3.addProperty("rotateX", var4.getRotateX().getCurrentValue());
         var3.addProperty("rotateY", var4.getRotateY().getCurrentValue());
         var3.addProperty("rotateZ", var4.getRotateZ().getCurrentValue());
         var2.add("startPhase", var3);
         JsonObject var5 = new JsonObject();
         aA var6 = var1.getEndPhase();
         var5.addProperty("anchorX", var6.getAnchorX().getCurrentValue());
         var5.addProperty("anchorY", var6.getAnchorY().getCurrentValue());
         var5.addProperty("anchorZ", var6.getAnchorZ().getCurrentValue());
         var5.addProperty("moveX", var6.getMoveX().getCurrentValue());
         var5.addProperty("moveY", var6.getMoveY().getCurrentValue());
         var5.addProperty("moveZ", var6.getMoveZ().getCurrentValue());
         var5.addProperty("rotateX", var6.getRotateX().getCurrentValue());
         var5.addProperty("rotateY", var6.getRotateY().getCurrentValue());
         var5.addProperty("rotateZ", var6.getRotateZ().getCurrentValue());
         var2.add("endPhase", var5);

         try (FileWriter var7 = new FileWriter(this.a)) {
            var7.write(ar.GSON.toJson(var2));
         }
      } catch (Exception var12) {
         var12.printStackTrace();
      }
   }

   public void delete() {
      if (this.a.exists()) {
         this.a.delete();
      }
   }

   @Generated
   public String getFileName() {
      return this.b;
   }

   @Generated
   public File getFile() {
      return this.a;
   }

   @Generated
   public dZ getHoverAnimation() {
      return this.c;
   }

   @Generated
   public dZ getActiveAnimation() {
      return this.d;
   }
}
