package net.yeoxuhang.geode_plus;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.yeoxuhang.geode_plus.client.GeodePlusClient;
import net.yeoxuhang.geode_plus.client.model.WrappistPedestalBlockEntityModel;
import net.yeoxuhang.geode_plus.client.render.WrappistPedestalBlockEntityRenderer;
import net.yeoxuhang.geode_plus.server.registry.BlockEntityRegistry;

public class FabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        GeodePlusClient.renderTypes(ItemBlockRenderTypes.TYPE_BY_BLOCK::putAll);
        BlockEntityRendererRegistry.register(BlockEntityRegistry.WRAPPIST_PEDESTAL.get(), WrappistPedestalBlockEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(GeodePlusClient.WRAPPIST_PEDESTAL, WrappistPedestalBlockEntityModel::createBodyLayer);
    }
}
