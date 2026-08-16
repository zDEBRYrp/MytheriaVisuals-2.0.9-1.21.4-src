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
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class eS {
   public static eZ[] convertToRPN(
      String expression, Map<String, eO> userFunctions, Map<String, eQ> userOperators, Set<String> variableNames, boolean implicitMultiplication
   ) {
      Stack var5 = new Stack();
      ArrayList<eZ> var6 = new ArrayList<>();
      fa var7 = new fa(expression, userFunctions, userOperators, variableNames, implicitMultiplication);

      label87:
      while (var7.hasNext()) {
         eZ var8 = var7.nextToken();
         switch (var8.getType()) {
            case 1:
            case 6:
               var6.add(var8);
               break;
            case 2:
               while (true) {
                  if (!var5.empty() && ((eZ)var5.peek()).getType() == 2) {
                     eY var9 = (eY)var8;
                     eY var10 = (eY)var5.peek();
                     if ((var9.getOperator().getNumOperands() != 1 || var10.getOperator().getNumOperands() != 2)
                        && (
                           var9.getOperator().isLeftAssociative() && var9.getOperator().getPrecedence() <= var10.getOperator().getPrecedence()
                              || var9.getOperator().getPrecedence() < var10.getOperator().getPrecedence()
                        )) {
                        var6.add((eZ)var5.pop());
                        continue;
                     }
                  }

                  var5.push(var8);
                  continue label87;
               }
            case 3:
               var5.add(var8);
               break;
            case 4:
               var5.push(var8);
               break;
            case 5:
               while (((eZ)var5.peek()).getType() != 4) {
                  var6.add((eZ)var5.pop());
               }

               var5.pop();
               if (!var5.isEmpty() && ((eZ)var5.peek()).getType() == 3) {
                  var6.add((eZ)var5.pop());
               }
               break;
            case 7:
               while (!var5.empty() && ((eZ)var5.peek()).getType() != 4) {
                  var6.add((eZ)var5.pop());
               }

               if (!var5.empty() && ((eZ)var5.peek()).getType() == 4) {
                  break;
               }

               throw new IllegalArgumentException("Misplaced function separator ',' or mismatched parentheses");
            default:
               throw new IllegalArgumentException("Unknown Token type encountered. This should not happen");
         }
      }

      while (!var5.empty()) {
         eZ var11 = (eZ)var5.pop();
         if (var11.getType() == 5 || var11.getType() == 4) {
            throw new IllegalArgumentException("Mismatched parentheses detected. Please check the expression");
         }

         var6.add(var11);
      }

      return var6.toArray(new eZ[0]);
   }
}
