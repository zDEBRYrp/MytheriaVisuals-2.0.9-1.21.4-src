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

public class eP {
   private static final eO[] a = new eO[31];

   public static eO getBuiltinFunction(String name) {
      switch (name) {
         case "sin":
            return a[0];
         case "cos":
            return a[1];
         case "tan":
            return a[2];
         case "cot":
            return a[5];
         case "asin":
            return a[12];
         case "acos":
            return a[13];
         case "atan":
            return a[14];
         case "sinh":
            return a[6];
         case "cosh":
            return a[7];
         case "tanh":
            return a[8];
         case "abs":
            return a[17];
         case "log":
            return a[25];
         case "log10":
            return a[23];
         case "log2":
            return a[24];
         case "log1p":
            return a[26];
         case "ceil":
            return a[18];
         case "floor":
            return a[19];
         case "sqrt":
            return a[15];
         case "cbrt":
            return a[16];
         case "pow":
            return a[20];
         case "exp":
            return a[21];
         case "expm1":
            return a[22];
         case "signum":
            return a[28];
         case "csc":
            return a[3];
         case "sec":
            return a[4];
         case "csch":
            return a[9];
         case "sech":
            return a[10];
         case "coth":
            return a[11];
         case "toradian":
            return a[29];
         case "todegree":
            return a[30];
         default:
            return null;
      }
   }

   static {
      a[0] = new eO("sin") {
         @Override
         public double apply(double... args) {
            return Math.sin(args[0]);
         }
      };
      a[1] = new eO("cos") {
         @Override
         public double apply(double... args) {
            return Math.cos(args[0]);
         }
      };
      a[2] = new eO("tan") {
         @Override
         public double apply(double... args) {
            return Math.tan(args[0]);
         }
      };
      a[5] = new eO("cot") {
         @Override
         public double apply(double... args) {
            double var2 = Math.tan(args[0]);
            if (var2 == 0.0) {
               throw new ArithmeticException("Division by zero in cotangent!");
            } else {
               return 1.0 / var2;
            }
         }
      };
      a[25] = new eO("log") {
         @Override
         public double apply(double... args) {
            return Math.log(args[0]);
         }
      };
      a[24] = new eO("log2") {
         @Override
         public double apply(double... args) {
            return Math.log(args[0]) / Math.log(2.0);
         }
      };
      a[23] = new eO("log10") {
         @Override
         public double apply(double... args) {
            return Math.log10(args[0]);
         }
      };
      a[26] = new eO("log1p") {
         @Override
         public double apply(double... args) {
            return Math.log1p(args[0]);
         }
      };
      a[17] = new eO("abs") {
         @Override
         public double apply(double... args) {
            return Math.abs(args[0]);
         }
      };
      a[13] = new eO("acos") {
         @Override
         public double apply(double... args) {
            return Math.acos(args[0]);
         }
      };
      a[12] = new eO("asin") {
         @Override
         public double apply(double... args) {
            return Math.asin(args[0]);
         }
      };
      a[14] = new eO("atan") {
         @Override
         public double apply(double... args) {
            return Math.atan(args[0]);
         }
      };
      a[16] = new eO("cbrt") {
         @Override
         public double apply(double... args) {
            return Math.cbrt(args[0]);
         }
      };
      a[19] = new eO("floor") {
         @Override
         public double apply(double... args) {
            return Math.floor(args[0]);
         }
      };
      a[6] = new eO("sinh") {
         @Override
         public double apply(double... args) {
            return Math.sinh(args[0]);
         }
      };
      a[15] = new eO("sqrt") {
         @Override
         public double apply(double... args) {
            return Math.sqrt(args[0]);
         }
      };
      a[8] = new eO("tanh") {
         @Override
         public double apply(double... args) {
            return Math.tanh(args[0]);
         }
      };
      a[7] = new eO("cosh") {
         @Override
         public double apply(double... args) {
            return Math.cosh(args[0]);
         }
      };
      a[18] = new eO("ceil") {
         @Override
         public double apply(double... args) {
            return Math.ceil(args[0]);
         }
      };
      a[20] = new eO("pow", 2) {
         @Override
         public double apply(double... args) {
            return Math.pow(args[0], args[1]);
         }
      };
      a[21] = new eO("exp", 1) {
         @Override
         public double apply(double... args) {
            return Math.exp(args[0]);
         }
      };
      a[22] = new eO("expm1", 1) {
         @Override
         public double apply(double... args) {
            return Math.expm1(args[0]);
         }
      };
      a[28] = new eO("signum", 1) {
         @Override
         public double apply(double... args) {
            if (args[0] > 0.0) {
               return 1.0;
            } else {
               return args[0] < 0.0 ? -1.0 : 0.0;
            }
         }
      };
      a[3] = new eO("csc") {
         @Override
         public double apply(double... args) {
            double var2 = Math.sin(args[0]);
            if (var2 == 0.0) {
               throw new ArithmeticException("Division by zero in cosecant!");
            } else {
               return 1.0 / var2;
            }
         }
      };
      a[4] = new eO("sec") {
         @Override
         public double apply(double... args) {
            double var2 = Math.cos(args[0]);
            if (var2 == 0.0) {
               throw new ArithmeticException("Division by zero in secant!");
            } else {
               return 1.0 / var2;
            }
         }
      };
      a[9] = new eO("csch") {
         @Override
         public double apply(double... args) {
            return args[0] == 0.0 ? 0.0 : 1.0 / Math.sinh(args[0]);
         }
      };
      a[10] = new eO("sech") {
         @Override
         public double apply(double... args) {
            return 1.0 / Math.cosh(args[0]);
         }
      };
      a[11] = new eO("coth") {
         @Override
         public double apply(double... args) {
            return Math.cosh(args[0]) / Math.sinh(args[0]);
         }
      };
      a[27] = new eO("logb", 2) {
         @Override
         public double apply(double... args) {
            return Math.log(args[1]) / Math.log(args[0]);
         }
      };
      a[29] = new eO("toradian") {
         @Override
         public double apply(double... args) {
            return Math.toRadians(args[0]);
         }
      };
      a[30] = new eO("todegree") {
         @Override
         public double apply(double... args) {
            return Math.toDegrees(args[0]);
         }
      };
   }
}
