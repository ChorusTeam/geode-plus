package net.yeoxuhang.geode_plus;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.yeoxuhang.geode_plus.client.GeodePlusClient;
import net.yeoxuhang.geode_plus.client.model.WrappistPedestalBlockEntityModel;
import net.yeoxuhang.geode_plus.client.render.WrappistPedestalBlockEntityRenderer;
import net.yeoxuhang.geode_plus.server.config.ServerConfigs;
import net.yeoxuhang.geode_plus.server.registry.BlockEntityRegistry;
import net.yeoxuhang.geode_plus.server.registry.ItemRegistry;

import java.nio.file.Path;

import static net.yeoxuhang.geode_plus.GeodePlus.setUpConfig;

public class ForgeClient extends ForgeCommonProxy {

    private static final Path path = FMLPaths.CONFIGDIR.get();
    public static final ServerConfigs CONFIG = new ServerConfigs(path);
    @Override
    public void serverSetUp() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        setUpConfig(CONFIG);
        PotionBrewing.addMix(Potions.WATER, ItemRegistry.WRAPPIST_SHARD.get(), Potions.SLOW_FALLING);
        PotionBrewing.addMix(Potions.WATER, ItemRegistry.CELESTITE_SHARD.get(), Potions.STRONG_HEALING);
        PotionBrewing.addMix(Potions.WATER, ItemRegistry.PINK_TOPAZ.get(), Potions.LUCK);
    }


    @Override
    public void clientSetUp(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        GeodePlusClient.init();
        GeodePlusClient.renderTypes(blockRenderTypeMap -> blockRenderTypeMap.forEach(ItemBlockRenderTypes::setRenderLayer));
        BlockEntityRenderers.register(BlockEntityRegistry.WRAPPIST_PEDESTAL.get(), WrappistPedestalBlockEntityRenderer::new);
    }

    @Mod.EventBusSubscriber(modid = GeodePlus.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ModEventBusClientEvents {
        @SubscribeEvent
        public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
            event.registerLayerDefinition(GeodePlusClient.WRAPPIST_PEDESTAL, WrappistPedestalBlockEntityModel::createBodyLayer);
        }

    }
}
