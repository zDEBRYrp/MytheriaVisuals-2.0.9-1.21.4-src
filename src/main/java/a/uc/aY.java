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

import java.util.Map;
import java.util.Map.Entry;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.event.EventListener;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;

@ModuleInfo(name = "Item Pickup", category = ax.PLAYER, enabledByDefault = true, desc = "Уведомляет вас при поднятии донатного предмета")
public class aY extends aJ {
   private final Map<String, String> a = Map.ofEntries(
      Map.entry("krush-helmet", "Вы подобрали Шлем крушителя!"),
      Map.entry("krush-chestplate", "Вы подобрали Нагрудник крушителя!"),
      Map.entry("krush-leggings", "Вы подобрали Поножи крушителя!"),
      Map.entry("krush-boots", "Вы подобрали Ботинки крушителя!"),
      Map.entry("krush-sword", "Вы подобрали донатный предмет: Меч крушителя!"),
      Map.entry("krush-trident", "Вы подобрали донатный предмет: Трезубец крушителя!"),
      Map.entry("krush-crossbow", "Вы подобрали донатный предмет: Арбалет крушителя!"),
      Map.entry("krush-pickaxe", "Вы подобрали донатный предмет: Кирка Крушителя!"),
      Map.entry("krush-bow", "Вы подобрали донатный предмет: Лук Крушителя!"),
      Map.entry("krush-mace", "Вы подобрали донатный предмет: Булава Крушителя!"),
      Map.entry("thor-hammer", "Вы подобрали донатный предмет: Молот Тора!"),
      Map.entry("tal-krush", "Вы подобрали Талисман Крушителя!"),
      Map.entry("tal-yarosti", "Вы подобрали Талисман Ярости!"),
      Map.entry("tal-razdora", "Вы подобрали Талисман Раздора!"),
      Map.entry("tal-vixrya", "Вы подобрали Талисман Вихря!"),
      Map.entry("tal-tirana", "Вы подобрали Талисман Тирана!"),
      Map.entry("tal-demona", "Вы подобрали Талисман Демона!"),
      Map.entry("tal-mraka", "Вы подобрали Талисман Мрака!"),
      Map.entry("tal-karatelya", "Вы подобрали Талисман Карателя!"),
      Map.entry("sphere-satira", "Вы подобрали Сферу Сатира!"),
      Map.entry("sphere-titana", "Вы подобрали Сферу Титана!"),
      Map.entry("sphere-afina", "Вы подобрали Сферу Афина!"),
      Map.entry("sphere-haosa", "Вы подобрали Сферу Хаоса!"),
      Map.entry("sphere-aresa", "Вы подобрали Сферу Ареса!"),
      Map.entry("sphere-bestii", "Вы подобрали Сферу Бестии!"),
      Map.entry("sphere-erida", "Вы подобрали Сферу Эрида!"),
      Map.entry("sphere-gidra", "Вы подобрали Сферу Гидра!"),
      Map.entry("sphere-ikara", "Вы подобрали Сферу Икара!"),
      Map.entry("effects", "Вы подобрали донатное зелье!")
   );
   private final Map<String, String> b = Map.ofEntries(
      Map.entry("Талисман Крушителя", "Вы подобрали Талисман Крушителя!"),
      Map.entry("Талисман Ярости", "Вы подобрали Талисман Ярости!"),
      Map.entry("Талисман Раздора", "Вы подобрали Талисман Раздора!"),
      Map.entry("Талисман Вихря", "Вы подобрали Талисман Вихря!"),
      Map.entry("Талисман Тирана", "Вы подобрали Талисман Тирана!"),
      Map.entry("Талисман Демона", "Вы подобрали Талисман Демона!"),
      Map.entry("Талисман Мрака", "Вы подобрали Талисман Мрака!"),
      Map.entry("Талисман Карателя", "Вы подобрали Талисман Карателя!"),
      Map.entry("Шлем Крушителя", "Вы подобрали Шлем крушителя!"),
      Map.entry("Нагрудник Крушителя", "Вы подобрали Нагрудник крушителя!"),
      Map.entry("Поножи Крушителя", "Вы подобрали Поножи крушителя!"),
      Map.entry("Ботинки Крушителя", "Вы подобрали Ботинки крушителя!"),
      Map.entry("Меч Крушителя", "Вы подобрали донатный предмет: Меч крушителя!"),
      Map.entry("Трезубец Крушителя", "Вы подобрали донатный предмет: Трезубец крушителя!"),
      Map.entry("Арбалет Крушителя", "Вы подобрали донатный предмет: Арбалет крушителя!"),
      Map.entry("Кирка Крушителя", "Вы подобрали донатный предмет: Кирка Крушителя!"),
      Map.entry("Лук Крушителя", "Вы подобрали донатный предмет: Лук Крушителя!"),
      Map.entry("Булава Крушителя", "Вы подобрали донатный предмет: Булава Крушителя!"),
      Map.entry("Молот Тора", "Вы подобрали донатный предмет: Молот Тора!"),
      Map.entry("Сфера Сатира", "Вы подобрали Сферу Сатира!"),
      Map.entry("Сфера Титана", "Вы подобрали Сферу Титана!"),
      Map.entry("Сфера Афина", "Вы подобрали Сферу Афина!"),
      Map.entry("Сфера Хаоса", "Вы подобрали Сферу Хаоса!"),
      Map.entry("Сфера Ареса", "Вы подобрали Сферу Ареса!"),
      Map.entry("Сфера Бестии", "Вы подобрали Сферу Бестии!"),
      Map.entry("Сфера Эрида", "Вы подобрали Сферу Эрида!"),
      Map.entry("Сфера Гидра", "Вы подобрали Сферу Гидра!"),
      Map.entry("Сфера Икара", "Вы подобрали Сферу Икара!")
   );
   private final EventListener<M> c = event -> {
      if (this.isEnabled()) {
         ItemStack var2 = event.getItemStack();
         String var3 = var2.getName().getString();
         NbtCompound var4 = ef.getNBT(var2);
         if (var4 != null) {
            NbtCompound var5 = var4.contains("PublicBukkitValues") ? var4.getCompound("PublicBukkitValues") : var4;
            String var6 = null;
            String var7 = null;
            if (var5.contains("don-item")) {
               var6 = var5.getString("don-item");
            } else if (var5.contains("minecraft:don-item")) {
               var6 = var5.getString("minecraft:don-item");
            }

            if (var5.contains("ftid")) {
               var7 = var5.getString("ftid");
            } else if (var5.contains("minecraft:ftid")) {
               var7 = var5.getString("minecraft:ftid");
            }

            for (Entry var9 : this.a.entrySet()) {
               String var10 = (String)var9.getKey();
               boolean var11 = false;
               if (var6 != null && var6.contains(var10)) {
                  var11 = true;
               }

               if (!var11 && var7 != null && var7.contains(var10)) {
                  var11 = true;
               }

               if (!var11 && var10.equals("effects") && (var5.contains("effects") || var5.contains("minecraft:effects"))) {
                  var11 = true;
               }

               if (var11) {
                  Mytheria.getInstance().getNotificationManager().addNotificationOther(cb.INFO, "Донатный предмет", (String)var9.getValue());
                  return;
               }
            }

            for (Entry var13 : this.b.entrySet()) {
               if (var3.contains((CharSequence)var13.getKey())) {
                  Mytheria.getInstance().getNotificationManager().addNotificationOther(cb.INFO, "Донатный предмет", (String)var13.getValue());
                  return;
               }
            }

            if (var6 != null || var7 != null) {
               Mytheria.getInstance().getNotificationManager().addNotificationOther(cb.INFO, "Донатный предмет", "Вы подобрали донатный предмет: " + var3);
            }
         }
      }
   };
}
