package nesquik.mytheria.mixin.minecraft.render.entity;

import nesquik.mytheria.utility.mixins.EntityRenderStateAddition;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(EntityRenderState.class)
public abstract class EntityRenderStateMixin implements EntityRenderStateAddition {
   @Unique
   private Entity Mytheria$entity;

   @Unique
   @Override
   public void Mytheria$setEntity(Entity entity) {
      this.Mytheria$entity = entity;
   }

   @Unique
   @Override
   public Entity Mytheria$getEntity() {
      return this.Mytheria$entity;
   }
}
