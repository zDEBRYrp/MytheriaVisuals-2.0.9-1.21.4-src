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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class eL {
   private final eZ[] a;
   private final Map<String, Double> b;
   private final Set<String> c;

   private static Map<String, Double> a() {
      HashMap var0 = new HashMap(4);
      var0.put("pi", Math.PI);
      var0.put("π", Math.PI);
      var0.put("φ", 1.61803398874);
      var0.put("e", Math.E);
      return var0;
   }

   public eL(eL existing) {
      this.a = Arrays.copyOf(existing.a, existing.a.length);
      this.b = new HashMap<>();
      this.b.putAll(existing.b);
      this.c = new HashSet<>(existing.c);
   }

   eL(eZ[] tokens, Set<String> userFunctionNames) {
      this.a = tokens;
      this.b = a();
      this.c = userFunctionNames;
   }

   public eL setVariable(String name, double value) {
      this.a(name);
      this.b.put(name, value);
      return this;
   }

   private void a(String name) {
      if (this.c.contains(name) || eP.getBuiltinFunction(name) != null) {
         throw new IllegalArgumentException("The variable name '" + name + "' is invalid. Since there exists a function with the same name");
      }
   }

   public eL setVariables(Map<String, Double> variables) {
      for (Entry var3 : variables.entrySet()) {
         this.setVariable((String)var3.getKey(), (Double)var3.getValue());
      }

      return this;
   }

   public eL clearVariables() {
      this.b.clear();
      return this;
   }

   public Set<String> getVariableNames() {
      HashSet var1 = new HashSet();

      for (eZ var5 : this.a) {
         if (var5.getType() == 6) {
            var1.add(((fc)var5).getName());
         }
      }

      return var1;
   }

   public eN validate(boolean checkVariablesSet) {
      ArrayList var2 = new ArrayList(0);
      if (checkVariablesSet) {
         for (eZ var6 : this.a) {
            if (var6.getType() == 6) {
               String var7 = ((fc)var6).getName();
               if (!this.b.containsKey(var7)) {
                  var2.add("The setVariable '" + var7 + "' has not been set");
               }
            }
         }
      }

      int var11 = 0;

      for (eZ var15 : this.a) {
         switch (var15.getType()) {
            case 1:
            case 6:
               var11++;
               break;
            case 2:
               eQ var8 = ((eY)var15).getOperator();
               if (var8.getNumOperands() == 2) {
                  var11--;
               }
               break;
            case 3:
               eO var9 = ((eV)var15).getFunction();
               int var10 = var9.getNumArguments();
               if (var10 > var11) {
                  var2.add("Not enough arguments for '" + var9.getName() + "'");
               }

               if (var10 > 1) {
                  var11 -= var10 - 1;
               } else if (var10 == 0) {
                  var11++;
               }
            case 4:
            case 5:
         }

         if (var11 < 1) {
            var2.add("Too many operators");
            return new eN(false, var2);
         }
      }

      if (var11 > 1) {
         var2.add("Too many operands");
      }

      return var2.size() == 0 ? eN.SUCCESS : new eN(false, var2);
   }

   public eN validate() {
      return this.validate(true);
   }

   public Future<Double> evaluateAsync(ExecutorService executor) {
      return executor.submit(this::evaluate);
   }

   public double evaluate() {
      eJ var1 = new eJ();

      for (eZ var5 : this.a) {
         if (var5.getType() == 1) {
            var1.a(((eW)var5).getValue());
         } else if (var5.getType() == 6) {
            String var12 = ((fc)var5).getName();
            Double var15 = this.b.get(var12);
            if (var15 == null) {
               throw new IllegalArgumentException("No value has been set for the setVariable '" + var12 + "'.");
            }

            var1.a(var15);
         } else if (var5.getType() == 2) {
            eY var11 = (eY)var5;
            if (var1.b() < var11.getOperator().getNumOperands()) {
               throw new IllegalArgumentException("Invalid number of operands available for '" + var11.getOperator().getSymbol() + "' operator");
            }

            if (var11.getOperator().getNumOperands() == 2) {
               double var13 = var1.a();
               double var16 = var1.a();
               var1.a(var11.getOperator().apply(var16, var13));
            } else if (var11.getOperator().getNumOperands() == 1) {
               double var14 = var1.a();
               var1.a(var11.getOperator().apply(var14));
            }
         } else if (var5.getType() == 3) {
            eV var6 = (eV)var5;
            int var7 = var6.getFunction().getNumArguments();
            if (var1.b() < var7) {
               throw new IllegalArgumentException("Invalid number of arguments available for '" + var6.getFunction().getName() + "' function");
            }

            double[] var8 = new double[var7];

            for (int var9 = var7 - 1; var9 >= 0; var9--) {
               var8[var9] = var1.a();
            }

            var1.a(var6.getFunction().apply(var8));
         }
      }

      if (var1.b() > 1) {
         throw new IllegalArgumentException("Invalid number of items on the output queue. Might be caused by an invalid number of arguments for a function.");
      } else {
         return var1.a();
      }
   }
}
