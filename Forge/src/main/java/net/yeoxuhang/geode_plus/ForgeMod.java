package net.yeoxuhang.geode_plus;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.yeoxuhang.geode_plus.server.registry.BlockRegistry;
import net.yeoxuhang.geode_plus.server.registry.ItemRegistry;

import java.util.stream.Stream;

@Mod(GeodePlus.MOD_ID)
public class ForgeMod {
    public static ForgeClient PROXY = DistExecutor.runForDist(() -> ForgeClient::new, ()-> ForgeClient::new);

    public static final DeferredRegister<CreativeModeTab> TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GeodePlus.MOD_ID);
    public static final RegistryObject<CreativeModeTab> GEODE_PLUS_TAB = TAB.register("geode_plus", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + GeodePlus.MOD_ID))
            .icon(() -> ItemRegistry.WRAPPIST_SHARD.get().getDefaultInstance())
            .displayItems((parameters, output) -> output.acceptAll(Stream.of(
                    ItemRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE,
                    ItemRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE,
                    ItemRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE,
                    ItemRegistry.WRAPPIST_SHARD,
                    ItemRegistry.CELESTITE_SHARD,
                    ItemRegistry.PINK_TOPAZ,
                    //GeodePlusItemsRegistry.WRAPPIST_GOAT_HORN,
                    BlockRegistry.WRAPPIST_GLASS,
                    BlockRegistry.CELESTITE_GLASS,
                    BlockRegistry.PINK_TOPAZ_GLASS,
                    BlockRegistry.WRAPPIST_PEDESTAL,
                    BlockRegistry.WRAPPIST_BLOCK,
                    BlockRegistry.BUDDING_WRAPPIST,
                    BlockRegistry.WRAPPIST_CLUSTER,
                    BlockRegistry.LARGE_WRAPPIST_BUD,
                    BlockRegistry.MEDIUM_WRAPPIST_BUD,
                    BlockRegistry.SMALL_WRAPPIST_BUD,

                    BlockRegistry.CELESTITE_BLOCK,
                    BlockRegistry.BUDDING_CELESTITE,
                    BlockRegistry.CELESTITE_CLUSTER,
                    BlockRegistry.LARGE_CELESTITE_BUD,
                    BlockRegistry.MEDIUM_CELESTITE_BUD,
                    BlockRegistry.SMALL_CELESTITE_BUD,

                    BlockRegistry.PINK_TOPAZ_BLOCK,
                    BlockRegistry.BUDDING_PINK_TOPAZ,
                    BlockRegistry.PINK_TOPAZ_CRYSTAL,
                    BlockRegistry.LARGE_PINK_TOPAZ_BUD,
                    BlockRegistry.MEDIUM_PINK_TOPAZ_BUD,
                    BlockRegistry.SMALL_PINK_TOPAZ_BUD,

                    BlockRegistry.PRISMARINE_CLUSTER_BLOCK,
                    BlockRegistry.BUDDING_PRISMARINE,
                    BlockRegistry.PRISMARINE_CLUSTER,
                    BlockRegistry.LARGE_PRISMARINE_BUD,
                    BlockRegistry.MEDIUM_PRISMARINE_BUD,
                    BlockRegistry.SMALL_PRISMARINE_BUD,

                    BlockRegistry.LAPIS_CLUSTER_BLOCK,
                    BlockRegistry.BUDDING_LAPIS,
                    BlockRegistry.BUDDING_DEEPSLATE_LAPIS,
                    BlockRegistry.BUDDING_SCULK_LAPIS,
                    BlockRegistry.LAPIS_CLUSTER,
                    BlockRegistry.LARGE_LAPIS_BUD,
                    BlockRegistry.MEDIUM_LAPIS_BUD,
                    BlockRegistry.SMALL_LAPIS_BUD,

                    BlockRegistry.REDSTONE_CRYSTAL_BLOCK,
                    BlockRegistry.BUDDING_REDSTONE,
                    BlockRegistry.BUDDING_DEEPSLATE_REDSTONE,
                    BlockRegistry.BUDDING_SCULK_REDSTONE,
                    BlockRegistry.REDSTONE_CRYSTAL,
                    BlockRegistry.LARGE_REDSTONE_BUD,
                    BlockRegistry.MEDIUM_REDSTONE_BUD,
                    BlockRegistry.SMALL_REDSTONE_BUD,

                    BlockRegistry.EMERALD_CLUSTER_BLOCK,
                    BlockRegistry.BUDDING_EMERALD,
                    BlockRegistry.BUDDING_DEEPSLATE_EMERALD,
                    BlockRegistry.BUDDING_SCULK_EMERALD,
                    BlockRegistry.EMERALD_CLUSTER,
                    BlockRegistry.LARGE_EMERALD_BUD,
                    BlockRegistry.MEDIUM_EMERALD_BUD,
                    BlockRegistry.SMALL_EMERALD_BUD,

                    BlockRegistry.DIAMOND_CRYSTAL_BLOCK,
                    BlockRegistry.BUDDING_DIAMOND,
                    BlockRegistry.BUDDING_DEEPSLATE_DIAMOND,
                    BlockRegistry.BUDDING_SCULK_DIAMOND,
                    BlockRegistry.DIAMOND_CRYSTAL,
                    BlockRegistry.LARGE_DIAMOND_BUD,
                    BlockRegistry.MEDIUM_DIAMOND_BUD,
                    BlockRegistry.SMALL_DIAMOND_BUD,

                    BlockRegistry.QUARTZ_CRYSTAL_BLOCK,
                    BlockRegistry.BUDDING_NETHER_QUARTZ,
                    BlockRegistry.BUDDING_BASALT_QUARTZ,
                    BlockRegistry.BUDDING_BLACKSTONE_QUARTZ,
                    BlockRegistry.QUARTZ_CRYSTAL,
                    BlockRegistry.LARGE_QUARTZ_BUD,
                    BlockRegistry.MEDIUM_QUARTZ_BUD,
                    BlockRegistry.SMALL_QUARTZ_BUD,

                    BlockRegistry.GOLD_NUGGET_CLUSTER_BLOCK,
                    BlockRegistry.BUDDING_GOLD_NUGGET,
                    BlockRegistry.BUDDING_BASALT_GOLD_NUGGET,
                    BlockRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET,
                    BlockRegistry.GOLD_NUGGET_CLUSTER,
                    BlockRegistry.LARGE_GOLD_NUGGET_BUD,
                    BlockRegistry.MEDIUM_GOLD_NUGGET_BUD,
                    BlockRegistry.SMALL_GOLD_NUGGET_BUD,

                    BlockRegistry.GLOWSTONE_CLUSTER_BLOCK,
                    BlockRegistry.BUDDING_GLOWSTONE,
                    BlockRegistry.BUDDING_BASALT_GLOWSTONE,
                    BlockRegistry.BUDDING_BLACKSTONE_GLOWSTONE,
                    BlockRegistry.GLOWSTONE_CLUSTER,
                    BlockRegistry.LARGE_GLOWSTONE_BUD,
                    BlockRegistry.MEDIUM_GLOWSTONE_BUD,
                    BlockRegistry.SMALL_GLOWSTONE_BUD,

                    BlockRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK,
                    BlockRegistry.BUDDING_ANCIENT_DEBRIS,
                    BlockRegistry.BUDDING_BASALT_ANCIENT_DEBRIS,
                    BlockRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS,
                    BlockRegistry.ANCIENT_DEBRIS_CLUSTER,
                    BlockRegistry.LARGE_ANCIENT_DEBRIS_BUD,
                    BlockRegistry.MEDIUM_ANCIENT_DEBRIS_BUD,
                    BlockRegistry.SMALL_ANCIENT_DEBRIS_BUD,

                    BlockRegistry.SMOOTH_END_STONE,
                    BlockRegistry.SMOOTH_END_STONE_STAIRS,
                    BlockRegistry.SMOOTH_END_STONE_SLAB,
                    BlockRegistry.SMOOTH_END_STONE_WALL,

                    BlockRegistry.GALCITE,
                    BlockRegistry.GALCITE_STAIRS,
                    BlockRegistry.GALCITE_SLAB,
                    BlockRegistry.GALCITE_WALL,

                    BlockRegistry.ECHO_CRYSTAL_BLOCK,
                    BlockRegistry.BUDDING_ECHO,
                    BlockRegistry.ECHO_CRYSTAL,
                    BlockRegistry.LARGE_ECHO_BUD,
                    BlockRegistry.MEDIUM_ECHO_BUD,
                    BlockRegistry.SMALL_ECHO_BUD
            ).map(sup -> sup.get().asItem().getDefaultInstance()).toList())).build());

    public ForgeMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::commonSetup);
        bus.addListener(this::clientSetup);
        BiomeModifierRegistry.register(bus);
        TAB.register(bus);
        GeodePlus.init();
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> PROXY.serverSetUp());
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> PROXY.clientSetUp());
    }

}