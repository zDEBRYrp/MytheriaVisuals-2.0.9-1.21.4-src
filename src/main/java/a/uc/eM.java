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

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class eM {
   private final String a;
   private final Map<String, eO> b;
   private final Map<String, eQ> c;
   private final Set<String> d;
   private boolean e = true;

   public eM(String expression) {
      if (expression != null && expression.trim().length() != 0) {
         this.a = expression;
         this.c = new HashMap<>(4);
         this.b = new HashMap<>(4);
         this.d = new HashSet<>(4);
      } else {
         throw new IllegalArgumentException("Expression can not be empty");
      }
   }

   public eM function(eO function) {
      this.b.put(function.getName(), function);
      return this;
   }

   public eM functions(eO... functions) {
      for (eO var5 : functions) {
         this.b.put(var5.getName(), var5);
      }

      return this;
   }

   public eM functions(List<eO> functions) {
      for (eO var3 : functions) {
         this.b.put(var3.getName(), var3);
      }

      return this;
   }

   public eM variables(Set<String> variableNames) {
      this.d.addAll(variableNames);
      return this;
   }

   public eM variables(String... variableNames) {
      Collections.addAll(this.d, variableNames);
      return this;
   }

   public eM variable(String variableName) {
      this.d.add(variableName);
      return this;
   }

   public eM implicitMultiplication(boolean enabled) {
      this.e = enabled;
      return this;
   }

   public eM operator(eQ operator) {
      this.a(operator);
      this.c.put(operator.getSymbol(), operator);
      return this;
   }

   private void a(eQ op) {
      String var2 = op.getSymbol();

      for (char var6 : var2.toCharArray()) {
         if (!eQ.isAllowedOperatorChar(var6)) {
            throw new IllegalArgumentException("The operator symbol '" + var2 + "' is invalid");
         }
      }
   }

   public eM operator(eQ... operators) {
      for (eQ var5 : operators) {
         this.operator(var5);
      }

      return this;
   }

   public eM operator(List<eQ> operators) {
      for (eQ var3 : operators) {
         this.operator(var3);
      }

      return this;
   }

   public eL build() {
      if (this.a.length() == 0) {
         throw new IllegalArgumentException("The expression can not be empty");
      }

      this.d.add("pi");
      this.d.add("π");
      this.d.add("e");
      this.d.add("φ");

      for (String var2 : this.d) {
         if (eP.getBuiltinFunction(var2) != null || this.b.containsKey(var2)) {
            throw new IllegalArgumentException("A variable can not have the same name as a function [" + var2 + "]");
         }
      }

      return new eL(eS.convertToRPN(this.a, this.b, this.c, this.d, this.e), this.b.keySet());
   }
}
