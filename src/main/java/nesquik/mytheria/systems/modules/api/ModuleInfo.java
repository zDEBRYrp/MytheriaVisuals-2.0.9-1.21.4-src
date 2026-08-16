package nesquik.mytheria.systems.modules.api;

import a.ax;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ModuleInfo {
   String name();

   ax category();

   int key() default -1;

   boolean disableOnQuit() default false;

   boolean enabledByDefault() default false;

   String desc() default "У этой функции нет описания";
}
