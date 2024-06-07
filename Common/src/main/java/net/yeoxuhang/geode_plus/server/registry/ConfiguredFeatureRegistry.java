package net.yeoxuhang.geode_plus.server.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.yeoxuhang.geode_plus.GeodePlus;
import net.yeoxuhang.geode_plus.server.world.feature.config.GeodeCrystalSpikeConfig;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.placement.CaveSurface;

import java.util.List;

import static net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider.simple;
import static net.yeoxuhang.geode_plus.server.registry.BlockRegistry.*;

public class ConfiguredFeatureRegistry {
    public static final ResourceKey<ConfiguredFeature<?, ?>> PRISMARINE_GEODE = registerKey("prismarine_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WRAPPIST_GEODE = registerKey("wrappist_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ECHO_GEODE = registerKey("echo_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRYSTAL_SPIKE = registerKey("crystal_spike");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRYSTAL_SPIKE_FLOOR = registerKey("crystal_spike_floor");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GLOWSTONE_CRYSTAL_SPIKE = registerKey("glowstone_crystal_spike");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GLOWSTONE_CRYSTAL_SPIKE_FLOOR = registerKey("glowstone_crystal_spike_floor");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ECHO_CRYSTAL_SPIKE = registerKey("echo_crystal_spike");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ECHO_CRYSTAL_SPIKE_FLOOR = registerKey("echo_crystal_spike_floor");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PRISMARINE_CRYSTAL_SPIKE = registerKey("prismarine_crystal_spike");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WRAPPIST_CRYSTAL_SPIKE = registerKey("wrappist_crystal_spike");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_DEBRIS_GEODE = registerKey("ancient_debris_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BASALT_ANCIENT_DEBRIS_GEODE = registerKey("basalt_ancient_debris_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKSTONE_ANCIENT_DEBRIS_GEODE = registerKey("blackstone_ancient_debris_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GLOWSTONE_GEODE = registerKey("glowstone_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BASALT_GLOWSTONE_GEODE = registerKey("basalt_glowstone_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKSTONE_GLOWSTONE_GEODE = registerKey("blackstone_glowstone_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLD_NUGGET_GEODE = registerKey("gold_nugget_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BASALT_GOLD_NUGGET_GEODE = registerKey("basalt_gold_nugget_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKSTONE_GOLD_NUGGET_GEODE = registerKey("blackstone_gold_nugget_geode");

    public static final ResourceKey<ConfiguredFeature<?, ?>> QUARTZ_GEODE = registerKey("quartz_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BASALT_QUARTZ_GEODE = registerKey("basalt_quartz_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKSTONE_QUARTZ_GEODE = registerKey("blackstone_quartz_geode");

    public static final ResourceKey<ConfiguredFeature<?, ?>> DIAMOND_GEODE = registerKey("diamond_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_DIAMOND_GEODE = registerKey("deepslate_diamond_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SCULK_DIAMOND_GEODE = registerKey("sculk_diamond_geode");

    public static final ResourceKey<ConfiguredFeature<?, ?>> EMERALD_GEODE = registerKey("emerald_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_EMERALD_GEODE = registerKey("deepslate_emerald_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SCULK_EMERALD_GEODE = registerKey("sculk_emerald_geode");

    public static final ResourceKey<ConfiguredFeature<?, ?>> LAPIS_GEODE = registerKey("lapis_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_LAPIS_GEODE = registerKey("deepslate_lapis_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SCULK_LAPIS_GEODE = registerKey("sculk_lapis_geode");

    public static final ResourceKey<ConfiguredFeature<?, ?>> REDSTONE_GEODE = registerKey("redstone_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_REDSTONE_GEODE = registerKey("deepslate_redstone_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SCULK_REDSTONE_GEODE = registerKey("sculk_redstone_geode");

    public static final ResourceKey<ConfiguredFeature<?, ?>> CELESTITE_GEODE = registerKey("celestite_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_TOPAZ_GEODE = registerKey("pink_topaz_geode");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        register(context, CRYSTAL_SPIKE, FeatureRegistry.CRYSTAL_SPIKE.get(), new GeodeCrystalSpikeConfig((QUARTZ_CRYSTAL_BLOCK.get()).defaultBlockState(), (QUARTZ_CRYSTAL.get()).defaultBlockState(), UniformInt.of(1, 3), CaveSurface.CEILING));
        register(context, CRYSTAL_SPIKE_FLOOR, FeatureRegistry.CRYSTAL_SPIKE.get(), new GeodeCrystalSpikeConfig((QUARTZ_CRYSTAL_BLOCK.get()).defaultBlockState(), (QUARTZ_CRYSTAL.get()).defaultBlockState(), UniformInt.of(1, 3), CaveSurface.FLOOR));
        register(context, GLOWSTONE_CRYSTAL_SPIKE, FeatureRegistry.CRYSTAL_SPIKE.get(), new GeodeCrystalSpikeConfig(GLOWSTONE_CLUSTER_BLOCK.get().defaultBlockState(), (GLOWSTONE_CLUSTER.get()).defaultBlockState(), UniformInt.of(1, 3), CaveSurface.CEILING));
        register(context, GLOWSTONE_CRYSTAL_SPIKE_FLOOR, FeatureRegistry.CRYSTAL_SPIKE.get(), new GeodeCrystalSpikeConfig(GLOWSTONE_CLUSTER_BLOCK.get().defaultBlockState(), (GLOWSTONE_CLUSTER.get()).defaultBlockState(), UniformInt.of(1, 3), CaveSurface.FLOOR));
        register(context, ECHO_CRYSTAL_SPIKE, FeatureRegistry.ECHO_CRYSTAL_SPIKE.get(), new GeodeCrystalSpikeConfig((Blocks.SCULK).defaultBlockState(), (ECHO_CRYSTAL.get()).defaultBlockState(), UniformInt.of(1, 3), CaveSurface.CEILING));
        register(context, ECHO_CRYSTAL_SPIKE_FLOOR, FeatureRegistry.ECHO_CRYSTAL_SPIKE.get(), new GeodeCrystalSpikeConfig((Blocks.SCULK).defaultBlockState(), (ECHO_CRYSTAL.get()).defaultBlockState(), UniformInt.of(1, 3), CaveSurface.FLOOR));
        register(context, WRAPPIST_CRYSTAL_SPIKE, FeatureRegistry.WRAPPIST_CRYSTAL_SPIKE.get(), new GeodeCrystalSpikeConfig((WRAPPIST_BLOCK.get()).defaultBlockState(), (WRAPPIST_CLUSTER.get()).defaultBlockState(), UniformInt.of(1, 3), CaveSurface.FLOOR));
        register(context, PRISMARINE_CRYSTAL_SPIKE, FeatureRegistry.OCEAN_CRYSTAL_SPIKE.get(), new GeodeCrystalSpikeConfig(PRISMARINE_CLUSTER_BLOCK.get().defaultBlockState(), (PRISMARINE_CLUSTER.get()).defaultBlockState(), UniformInt.of(1, 3), CaveSurface.FLOOR));
        register(context, ANCIENT_DEBRIS_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(Blocks.NETHERRACK),
                        simple(BUDDING_ANCIENT_DEBRIS.get()),
                        simple(Blocks.NETHERRACK),
                        simple(Blocks.NETHERRACK),
                        List.of(SMALL_ANCIENT_DEBRIS_BUD.get().defaultBlockState(),
                                MEDIUM_ANCIENT_DEBRIS_BUD.get().defaultBlockState(),
                                LARGE_ANCIENT_DEBRIS_BUD.get().defaultBlockState(),
                                ANCIENT_DEBRIS_CLUSTER.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, BASALT_ANCIENT_DEBRIS_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(Blocks.NETHERRACK),
                        simple(BUDDING_BASALT_ANCIENT_DEBRIS.get()),
                        simple(Blocks.NETHERRACK),
                        simple(Blocks.NETHERRACK),
                        List.of(SMALL_ANCIENT_DEBRIS_BUD.get().defaultBlockState(),
                                MEDIUM_ANCIENT_DEBRIS_BUD.get().defaultBlockState(),
                                LARGE_ANCIENT_DEBRIS_BUD.get().defaultBlockState(),
                                ANCIENT_DEBRIS_CLUSTER.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, BLACKSTONE_ANCIENT_DEBRIS_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(Blocks.NETHERRACK),
                        simple(BUDDING_BLACKSTONE_ANCIENT_DEBRIS.get()),
                        simple(Blocks.NETHERRACK),
                        simple(Blocks.NETHERRACK),
                        List.of(SMALL_ANCIENT_DEBRIS_BUD.get().defaultBlockState(),
                                MEDIUM_ANCIENT_DEBRIS_BUD.get().defaultBlockState(),
                                LARGE_ANCIENT_DEBRIS_BUD.get().defaultBlockState(),
                                ANCIENT_DEBRIS_CLUSTER.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, GLOWSTONE_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(Blocks.NETHERRACK),
                        simple(BUDDING_GLOWSTONE.get()),
                        simple(Blocks.NETHERRACK),
                        simple(Blocks.NETHERRACK),
                        List.of(SMALL_GLOWSTONE_BUD.get().defaultBlockState(),
                                MEDIUM_GLOWSTONE_BUD.get().defaultBlockState(),
                                LARGE_GLOWSTONE_BUD.get().defaultBlockState(),
                                GLOWSTONE_CLUSTER.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, BASALT_GLOWSTONE_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(Blocks.NETHERRACK),
                        simple(BUDDING_BASALT_GLOWSTONE.get()),
                        simple(Blocks.NETHERRACK),
                        simple(Blocks.NETHERRACK),
                        List.of(SMALL_GLOWSTONE_BUD.get().defaultBlockState(),
                                MEDIUM_GLOWSTONE_BUD.get().defaultBlockState(),
                                LARGE_GLOWSTONE_BUD.get().defaultBlockState(),
                                GLOWSTONE_CLUSTER.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, BLACKSTONE_GLOWSTONE_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(Blocks.NETHERRACK),
                        simple(BUDDING_BLACKSTONE_GLOWSTONE.get()),
                        simple(Blocks.NETHERRACK),
                        simple(Blocks.NETHERRACK),
                        List.of(SMALL_GLOWSTONE_BUD.get().defaultBlockState(),
                                MEDIUM_GLOWSTONE_BUD.get().defaultBlockState(),
                                LARGE_GLOWSTONE_BUD.get().defaultBlockState(),
                                GLOWSTONE_CLUSTER.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, GOLD_NUGGET_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(Blocks.NETHERRACK),
                        simple(BUDDING_GOLD_NUGGET.get()),
                        simple(Blocks.NETHERRACK),
                        simple(Blocks.NETHERRACK),
                        List.of(SMALL_GOLD_NUGGET_BUD.get().defaultBlockState(),
                                MEDIUM_GOLD_NUGGET_BUD.get().defaultBlockState(),
                                LARGE_GOLD_NUGGET_BUD.get().defaultBlockState(),
                                GOLD_NUGGET_CLUSTER.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, BASALT_GOLD_NUGGET_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(Blocks.NETHERRACK),
                        simple(BUDDING_BASALT_GOLD_NUGGET.get()),
                        simple(Blocks.NETHERRACK),
                        simple(Blocks.NETHERRACK),
                        List.of(SMALL_GOLD_NUGGET_BUD.get().defaultBlockState(),
                                MEDIUM_GOLD_NUGGET_BUD.get().defaultBlockState(),
                                LARGE_GOLD_NUGGET_BUD.get().defaultBlockState(),
                                GOLD_NUGGET_CLUSTER.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, BLACKSTONE_GOLD_NUGGET_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(Blocks.NETHERRACK),
                        simple(BUDDING_BLACKSTONE_GOLD_NUGGET.get()),
                        simple(Blocks.NETHERRACK),
                        simple(Blocks.NETHERRACK),
                        List.of(SMALL_GOLD_NUGGET_BUD.get().defaultBlockState(),
                                MEDIUM_GOLD_NUGGET_BUD.get().defaultBlockState(),
                                LARGE_GOLD_NUGGET_BUD.get().defaultBlockState(),
                                GOLD_NUGGET_CLUSTER.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, QUARTZ_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(Blocks.NETHERRACK),
                        simple(BUDDING_NETHER_QUARTZ.get()),
                        simple(Blocks.NETHERRACK),
                        simple(Blocks.NETHERRACK),
                        List.of(SMALL_QUARTZ_BUD.get().defaultBlockState(),
                                MEDIUM_QUARTZ_BUD.get().defaultBlockState(),
                                LARGE_QUARTZ_BUD.get().defaultBlockState(),
                                QUARTZ_CRYSTAL.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, BASALT_QUARTZ_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(Blocks.NETHERRACK),
                        simple(BUDDING_BASALT_QUARTZ.get()),
                        simple(Blocks.NETHERRACK),
                        simple(Blocks.NETHERRACK),
                        List.of(SMALL_QUARTZ_BUD.get().defaultBlockState(),
                                MEDIUM_QUARTZ_BUD.get().defaultBlockState(),
                                LARGE_QUARTZ_BUD.get().defaultBlockState(),
                                QUARTZ_CRYSTAL.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, BLACKSTONE_QUARTZ_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(Blocks.NETHERRACK),
                        simple(BUDDING_BLACKSTONE_QUARTZ.get()),
                        simple(Blocks.NETHERRACK),
                        simple(Blocks.NETHERRACK),
                        List.of(SMALL_QUARTZ_BUD.get().defaultBlockState(),
                                MEDIUM_QUARTZ_BUD.get().defaultBlockState(),
                                LARGE_QUARTZ_BUD.get().defaultBlockState(),
                                QUARTZ_CRYSTAL.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, ECHO_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                simple(Blocks.SCULK),
                simple(BUDDING_ECHO.get()),
                simple(Blocks.SCULK),
                simple(Blocks.SCULK),
                List.of(SMALL_ECHO_BUD.get().defaultBlockState(),
                        MEDIUM_ECHO_BUD.get().defaultBlockState(),
                        LARGE_ECHO_BUD.get().defaultBlockState(),
                        ECHO_CRYSTAL.get().defaultBlockState()),
                TagRegistry.Blocks.GEODES_CANNOT_REPLACE ,
                TagRegistry.Blocks.GEODE_INVALID_BLOCKS) ,
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, WRAPPIST_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(WRAPPIST_BLOCK.get()),
                        simple(BUDDING_WRAPPIST.get()),
                        simple(GALCITE.get()),
                        simple(SMOOTH_END_STONE.get()),
                        List.of(SMALL_WRAPPIST_BUD.get().defaultBlockState(),
                                MEDIUM_WRAPPIST_BUD.get().defaultBlockState(),
                                LARGE_WRAPPIST_BUD.get().defaultBlockState(),
                                WRAPPIST_CLUSTER.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, PRISMARINE_GEODE, FeatureRegistry.OCEAN_GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.WATER),
                        simple(Blocks.PRISMARINE),
                        simple(BUDDING_PRISMARINE.get()),
                        simple(Blocks.PRISMARINE),
                        simple(Blocks.PRISMARINE),
                        List.of(SMALL_PRISMARINE_BUD.get().defaultBlockState(),
                                MEDIUM_PRISMARINE_BUD.get().defaultBlockState(),
                                LARGE_PRISMARINE_BUD.get().defaultBlockState(),
                                PRISMARINE_CLUSTER.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, DIAMOND_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(Blocks.STONE),
                        simple(BUDDING_DIAMOND.get()),
                        simple(Blocks.STONE),
                        simple(Blocks.STONE),
                        List.of(SMALL_DIAMOND_BUD.get().defaultBlockState(),
                                MEDIUM_DIAMOND_BUD.get().defaultBlockState(),
                                LARGE_DIAMOND_BUD.get().defaultBlockState(),
                                DIAMOND_CRYSTAL.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, DEEPSLATE_DIAMOND_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(Blocks.DEEPSLATE),
                        simple(BUDDING_DEEPSLATE_DIAMOND.get()),
                        simple(Blocks.DEEPSLATE),
                        simple(Blocks.DEEPSLATE),
                        List.of(SMALL_DIAMOND_BUD.get().defaultBlockState(),
                                MEDIUM_DIAMOND_BUD.get().defaultBlockState(),
                                LARGE_DIAMOND_BUD.get().defaultBlockState(),
                                DIAMOND_CRYSTAL.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, SCULK_DIAMOND_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(Blocks.SCULK),
                        simple(BUDDING_SCULK_DIAMOND.get()),
                        simple(Blocks.SCULK),
                        simple(Blocks.SCULK),
                        List.of(SMALL_DIAMOND_BUD.get().defaultBlockState(),
                                MEDIUM_DIAMOND_BUD.get().defaultBlockState(),
                                LARGE_DIAMOND_BUD.get().defaultBlockState(),
                                DIAMOND_CRYSTAL.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, EMERALD_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(Blocks.STONE),
                        simple(BUDDING_EMERALD.get()),
                        simple(Blocks.STONE),
                        simple(Blocks.STONE),
                        List.of(SMALL_EMERALD_BUD.get().defaultBlockState(),
                                MEDIUM_EMERALD_BUD.get().defaultBlockState(),
                                LARGE_EMERALD_BUD.get().defaultBlockState(),
                                EMERALD_CLUSTER.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, DEEPSLATE_EMERALD_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(Blocks.DEEPSLATE),
                        simple(BUDDING_DEEPSLATE_EMERALD.get()),
                        simple(Blocks.DEEPSLATE),
                        simple(Blocks.DEEPSLATE),
                        List.of(SMALL_EMERALD_BUD.get().defaultBlockState(),
                                MEDIUM_EMERALD_BUD.get().defaultBlockState(),
                                LARGE_EMERALD_BUD.get().defaultBlockState(),
                                EMERALD_CLUSTER.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, SCULK_EMERALD_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(Blocks.SCULK),
                        simple(BUDDING_SCULK_EMERALD.get()),
                        simple(Blocks.SCULK),
                        simple(Blocks.SCULK),
                        List.of(SMALL_EMERALD_BUD.get().defaultBlockState(),
                                MEDIUM_EMERALD_BUD.get().defaultBlockState(),
                                LARGE_EMERALD_BUD.get().defaultBlockState(),
                                EMERALD_CLUSTER.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, LAPIS_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(Blocks.STONE),
                        simple(BUDDING_LAPIS.get()),
                        simple(Blocks.STONE),
                        simple(Blocks.STONE),
                        List.of(SMALL_LAPIS_BUD.get().defaultBlockState(),
                                MEDIUM_LAPIS_BUD.get().defaultBlockState(),
                                LARGE_LAPIS_BUD.get().defaultBlockState(),
                                LAPIS_CLUSTER.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, DEEPSLATE_LAPIS_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(Blocks.DEEPSLATE),
                        simple(BUDDING_DEEPSLATE_LAPIS.get()),
                        simple(Blocks.DEEPSLATE),
                        simple(Blocks.DEEPSLATE),
                        List.of(SMALL_LAPIS_BUD.get().defaultBlockState(),
                                MEDIUM_LAPIS_BUD.get().defaultBlockState(),
                                LARGE_LAPIS_BUD.get().defaultBlockState(),
                                LAPIS_CLUSTER.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, SCULK_LAPIS_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(Blocks.SCULK),
                        simple(BUDDING_SCULK_LAPIS.get()),
                        simple(Blocks.SCULK),
                        simple(Blocks.SCULK),
                        List.of(SMALL_LAPIS_BUD.get().defaultBlockState(),
                                MEDIUM_LAPIS_BUD.get().defaultBlockState(),
                                LARGE_LAPIS_BUD.get().defaultBlockState(),
                                LAPIS_CLUSTER.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, REDSTONE_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(Blocks.STONE),
                        simple(BUDDING_REDSTONE.get()),
                        simple(Blocks.STONE),
                        simple(Blocks.STONE),
                        List.of(SMALL_REDSTONE_BUD.get().defaultBlockState(),
                                MEDIUM_REDSTONE_BUD.get().defaultBlockState(),
                                LARGE_REDSTONE_BUD.get().defaultBlockState(),
                                REDSTONE_CRYSTAL.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, DEEPSLATE_REDSTONE_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(Blocks.DEEPSLATE),
                        simple(BUDDING_DEEPSLATE_REDSTONE.get()),
                        simple(Blocks.DEEPSLATE),
                        simple(Blocks.DEEPSLATE),
                        List.of(SMALL_REDSTONE_BUD.get().defaultBlockState(),
                                MEDIUM_REDSTONE_BUD.get().defaultBlockState(),
                                LARGE_REDSTONE_BUD.get().defaultBlockState(),
                                REDSTONE_CRYSTAL.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, SCULK_REDSTONE_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(Blocks.SCULK),
                        simple(BUDDING_SCULK_REDSTONE.get()),
                        simple(Blocks.SCULK),
                        simple(Blocks.SCULK),
                        List.of(SMALL_REDSTONE_BUD.get().defaultBlockState(),
                                MEDIUM_REDSTONE_BUD.get().defaultBlockState(),
                                LARGE_REDSTONE_BUD.get().defaultBlockState(),
                                REDSTONE_CRYSTAL.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, CELESTITE_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(CELESTITE_BLOCK.get()),
                        simple(BUDDING_CELESTITE.get()),
                        simple(Blocks.CALCITE),
                        simple(Blocks.MUD),
                        List.of(SMALL_CELESTITE_BUD.get().defaultBlockState(),
                                MEDIUM_CELESTITE_BUD.get().defaultBlockState(),
                                LARGE_CELESTITE_BUD.get().defaultBlockState(),
                                CELESTITE_CLUSTER.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, PINK_TOPAZ_GEODE, FeatureRegistry.GEODE.get(), new GeodeConfiguration(
                new GeodeBlockSettings(simple(Blocks.AIR),
                        simple(PINK_TOPAZ_BLOCK.get()),
                        simple(BUDDING_PINK_TOPAZ.get()),
                        simple(Blocks.CALCITE),
                        simple(Blocks.TUFF),
                        List.of(SMALL_PINK_TOPAZ_BUD.get().defaultBlockState(),
                                MEDIUM_PINK_TOPAZ_BUD.get().defaultBlockState(),
                                LARGE_PINK_TOPAZ_BUD.get().defaultBlockState(),
                                PINK_TOPAZ_CRYSTAL.get().defaultBlockState()),
                        TagRegistry.Blocks.GEODES_CANNOT_REPLACE, TagRegistry.Blocks.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));

    }
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(GeodePlus.MOD_ID, name));
    }
    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

    public static void init() {}
}