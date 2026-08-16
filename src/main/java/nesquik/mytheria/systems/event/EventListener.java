package nesquik.mytheria.systems.event;

import a.w;

public interface EventListener<T extends w> {
   void onEvent(T var1);

   default int getPriority() {
      return 0;
   }
}
