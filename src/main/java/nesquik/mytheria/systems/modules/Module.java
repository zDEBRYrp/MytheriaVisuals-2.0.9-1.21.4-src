package nesquik.mytheria.systems.modules;

import a.av;
import a.ax;
import a.uc.dZ;
import nesquik.mytheria.systems.modules.api.ModuleInfo;
import nesquik.mytheria.systems.setting.SettingsContainer;
import nesquik.mytheria.utility.interfaces.IMinecraft;
import nesquik.mytheria.utility.interfaces.IScaledResolution;
import nesquik.mytheria.utility.interfaces.Toggleable;

public interface Module extends SettingsContainer, IMinecraft, IScaledResolution, Toggleable {
   void disable();

   void enable();

   void tick();

   ModuleInfo getInfo();

   String getName();

   default String getDescription() {
      String var1 = "modules.descriptions.%s".formatted(this.getName().toLowerCase().replace(" ", "_"));
      String tr = av.translate(var1);
      if (tr.equals(var1) || tr.startsWith("modules.descriptions.")) return "";
      return tr;
   }

   int getKey();

   ax getCategory();

   boolean isEnabled();

   boolean isHidden();

   void setHidden(boolean var1);

   dZ getKeybindsAnimation();

   void setKey(int var1);

   void setEnabled(boolean var1, boolean var2);
}
