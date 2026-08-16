package nesquik.mytheria.mixin.minecraft.render.entity;

import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(EntityRenderer.class)
public class EntityRendererMixin<T extends Entity> {
}
