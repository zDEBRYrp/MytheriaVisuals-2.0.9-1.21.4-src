package nesquik.mytheria.systems.setting.settings;

import a.av;
import a.ce;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.function.BooleanSupplier;
import lombok.Generated;
import nesquik.mytheria.systems.setting.SettingsContainer;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.NotNull;

public class SliderSetting extends ce {
   protected float min;
   protected float max;
   protected float step;
   protected float currentValue;
   private SliderSetting.Suffix a = number -> "";

   public SliderSetting(@NotNull SettingsContainer parent, String name, String description, @NotNull BooleanSupplier hideCondition) {
      super(parent, name, hideCondition);
   }

   public SliderSetting(@NotNull SettingsContainer parent, String name, @NotNull BooleanSupplier hideCondition) {
      super(parent, name, hideCondition);
   }

   public SliderSetting(@NotNull SettingsContainer parent, String name, String description) {
      super(parent, name);
   }

   public SliderSetting(@NotNull SettingsContainer parent, String id) {
      super(parent, id);
   }

   public SliderSetting min(float min) {
      this.min = min;
      return this;
   }

   public SliderSetting max(float max) {
      this.max = max;
      return this;
   }

   public SliderSetting step(float step) {
      this.step = step;
      return this;
   }

   public SliderSetting suffix(SliderSetting.Suffix suffix) {
      this.a = suffix;
      return this;
   }

   public SliderSetting suffix(String suffix) {
      this.a = number -> suffix;
      return this;
   }

   public SliderSetting currentValue(float currentValue) {
      this.setCurrentValue(currentValue);
      return this;
   }

   public String getSuffix() {
      return this.a.apply(this.getCurrentValue()).contains(" ")
         ? " " + av.translate(this.a.apply(this.getCurrentValue()).replace(" ", ""))
         : av.translate(this.a.apply(this.getCurrentValue()));
   }

   @Override
   public JsonElement save() {
      return new JsonPrimitive(this.currentValue);
   }

   @Override
   public void load(JsonElement element) {
      if (element.isJsonPrimitive() && element.getAsJsonPrimitive().isNumber()) {
         this.setCurrentValue(element.getAsFloat());
      }
   }

   public void setCurrentValue(float currentValue) {
      float var2 = MathHelper.clamp((float)(Math.round(currentValue * (1.0 / this.step)) / (1.0 / this.step)), this.min, this.max);
      if (this.currentValue != var2) {
         this.currentValue = var2;
      }
   }

   @Generated
   public float getMin() {
      return this.min;
   }

   @Generated
   public float getMax() {
      return this.max;
   }

   @Generated
   public float getStep() {
      return this.step;
   }

   @Generated
   public float getCurrentValue() {
      return this.currentValue;
   }

   public interface Suffix {
      String apply(float var1);
   }
}
