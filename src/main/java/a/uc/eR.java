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

public abstract class eR {
   private static final eQ[] a = new eQ[8];

   public static eQ getBuiltinOperator(char symbol, int numArguments) {
      switch (symbol) {
         case '%':
            return a[5];
         case '*':
            return a[2];
         case '+':
            if (numArguments != 1) {
               return a[0];
            }

            return a[7];
         case '-':
            if (numArguments != 1) {
               return a[1];
            }

            return a[6];
         case '/':
         case '÷':
            return a[3];
         case '^':
            return a[4];
         default:
            return null;
      }
   }

   static {
      a[0] = new eQ("+", 2, true, 500) {
         @Override
         public double apply(double... args) {
            return args[0] + args[1];
         }
      };
      a[1] = new eQ("-", 2, true, 500) {
         @Override
         public double apply(double... args) {
            return args[0] - args[1];
         }
      };
      a[6] = new eQ("-", 1, false, 5000) {
         @Override
         public double apply(double... args) {
            return -args[0];
         }
      };
      a[7] = new eQ("+", 1, false, 5000) {
         @Override
         public double apply(double... args) {
            return args[0];
         }
      };
      a[2] = new eQ("*", 2, true, 1000) {
         @Override
         public double apply(double... args) {
            return args[0] * args[1];
         }
      };
      a[3] = new eQ("/", 2, true, 1000) {
         @Override
         public double apply(double... args) {
            if (args[1] == 0.0) {
               throw new ArithmeticException("Division by zero!");
            } else {
               return args[0] / args[1];
            }
         }
      };
      a[4] = new eQ("^", 2, false, 10000) {
         @Override
         public double apply(double... args) {
            return Math.pow(args[0], args[1]);
         }
      };
      a[5] = new eQ("%", 2, true, 1000) {
         @Override
         public double apply(double... args) {
            if (args[1] == 0.0) {
               throw new ArithmeticException("Division by zero!");
            } else {
               return args[0] % args[1];
            }
         }
      };
   }
}
