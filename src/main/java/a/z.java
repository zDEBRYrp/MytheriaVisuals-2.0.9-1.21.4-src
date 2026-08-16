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
import a.uc.dX;
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
import a.uc.H;
import a.uc.J;
import a.uc.Q;
import a.uc.N;
import a.uc.bW;
import a.uc.P;
import a.uc.fJ;
import a.uc.V;
import a.uc.G;
import a.uc.fD;
import a.uc.eX;
import a.z;
import a.uc.bS;
import a.uc.aO;
import a.uc.cE;
import a.uc.X;
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
import a.o;
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
import a.k;
import a.uc.cB;
import a.uc.bT;
import a.w;
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
import a.uc.F;
import a.uc.cQ;
import a.uc.dQ;
import a.uc.dK;
import a.uc.aA;
import a.uc.eZ;
import a.uc.S;
import a.uc.fH;
import a.uc.dU;
import a.uc.dN;
import a.uc.fN;
import a.uc.cZ;
import a.uc.eU;
import a.uc.bJ;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import nesquik.mytheria.Mytheria;
import nesquik.mytheria.systems.event.EventListener;

public class z {
   private final ConcurrentHashMap<Type, CopyOnWriteArrayList<EventListener<?>>> a = new ConcurrentHashMap<>();
   private final Map<Class<?>, Field[]> b = new HashMap<>();
   private final Comparator<EventListener<?>> c = Comparator.<EventListener<?>>comparingInt(listener -> listener.getPriority()).reversed();
   private final BiConsumer<List<EventListener<?>>, Comparator<EventListener<?>>> d = List::sort;
   private final Consumer<Throwable> e = Throwable::printStackTrace;

   public void subscribe(Object subscriber) {
      this.a(subscriber, (type, listener) -> {
         this.a.computeIfAbsent(type, k -> new CopyOnWriteArrayList<>()).add(listener);
         this.d.accept(this.a.get(type), this.c);
      });
   }

   public void unsubscribe(Object subscriber) {
      this.a(subscriber, (type, listener) -> {
         CopyOnWriteArrayList var3 = this.a.get(type);
         if (var3 != null) {
            var3.remove(listener);
            if (var3.isEmpty()) {
               this.a.remove(type);
            }
         }
      });
   }

   public <T extends w> void triggerEvent(T event) {
      Class var2 = event.getClass();
      List<EventListener<?>> var3 = this.a.get(var2);
      if (var3 != null && !Mytheria.INSTANCE.isPanic()) {
         for (EventListener var5 : var3) {
            try {
               var5.onEvent(event);
            } catch (Throwable var7) {
               this.e.accept(var7);
            }
         }
      }
   }

   private void a(Object o, BiConsumer<Type, EventListener<?>> action) {
      for (Field var6 : this.a(o.getClass())) {
         if (var6.getType() == EventListener.class) {
            EventListener var7 = this.a(o, var6);
            if (var7 != null) {
               Type var8 = ((ParameterizedType)var6.getGenericType()).getActualTypeArguments()[0];
               action.accept(var8, var7);
            }
         }
      }
   }

   private Field[] a(Class<?> clazz) {
      return this.b.computeIfAbsent(clazz, Class::getDeclaredFields);
   }

   private EventListener<?> a(Object o, Field field) {
      boolean var3 = field.canAccess(o);
      field.setAccessible(true);

      Object var4;
      try {
         return (EventListener<?>)field.get(o);
      } catch (IllegalAccessException var9) {
         this.e.accept(var9);
         var4 = null;
      } finally {
         field.setAccessible(var3);
      }

      return (EventListener<?>)var4;
   }
}
