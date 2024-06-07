package net.yeoxuhang.geode_plus.client.render;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.yeoxuhang.geode_plus.server.projectile.WrappistHornEffect;

public class RenderNothing extends EntityRenderer<WrappistHornEffect> {
    public RenderNothing(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(WrappistHornEffect entity) {
        return null;
    }
}

