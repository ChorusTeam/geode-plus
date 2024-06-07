package net.yeoxuhang.geode_plus.mixin.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.yeoxuhang.geode_plus.client.GeodePlusClient;
import net.yeoxuhang.geode_plus.client.model.WrappistPedestalBlockEntityModel;
import net.yeoxuhang.geode_plus.client.render.WrappistPedestalBlockEntityRenderer;
import net.yeoxuhang.geode_plus.server.registry.BlockRegistry;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BlockEntityWithoutLevelRenderer.class)
public class BlockEntityWithoutLevelRendererMixin {
    public WrappistPedestalBlockEntityModel wrappistPedestal;
    @Shadow
    private final EntityModelSet entityModelSet;
    @Shadow @Final private BlockEntityRenderDispatcher blockEntityRenderDispatcher;

    public BlockEntityWithoutLevelRendererMixin(EntityModelSet entityModelSet) {
        this.entityModelSet = entityModelSet;
    }

    @Inject(method = "renderByItem", at = @At("HEAD"))
    private void renderByItemFromGeodePlus(ItemStack itemStack, ItemDisplayContext itemDisplayContext, PoseStack poseStack, MultiBufferSource multiBufferSource, int i, int j, CallbackInfo ci) {
        if (itemStack.is(BlockRegistry.WRAPPIST_PEDESTAL.get().asItem())) {
            float worldTick = this.blockEntityRenderDispatcher.level.getGameTime();
            float tick = worldTick / 10.0F;
            poseStack.pushPose();
            poseStack.scale(1.1F, 1.1F, 1.1F);
            poseStack.translate(0.8, 1, 0);
            poseStack.mulPose(Axis.XP.rotationDegrees(-180.0F));
            VertexConsumer vertexConsumer2 = ItemRenderer.getFoilBufferDirect(multiBufferSource, this.wrappistPedestal.renderType(WrappistPedestalBlockEntityRenderer.TEXTURE), false, itemStack.hasFoil());
            this.wrappistPedestal.renderToBuffer(poseStack, vertexConsumer2, i, j, 1.0F, 1.0F, 1.0F, 1.0F);
            this.wrappistPedestal.crystals.setRotation(0.0F, tick % 360.0F, 0.0F);
            poseStack.popPose();
        }
    }
    @Inject(method = "onResourceManagerReload", at = @At("RETURN"))
    public void onResourceManagerReloadFromGeodePlus(ResourceManager resourceManager, CallbackInfo ci) {
        this.wrappistPedestal = new WrappistPedestalBlockEntityModel(this.entityModelSet.bakeLayer(GeodePlusClient.WRAPPIST_PEDESTAL));
    }
}