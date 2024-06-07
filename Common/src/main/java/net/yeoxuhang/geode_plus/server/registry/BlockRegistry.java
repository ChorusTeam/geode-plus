package net.yeoxuhang.geode_plus.server.registry;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.*;
import net.yeoxuhang.geode_plus.GeodePlus;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.yeoxuhang.geode_plus.server.block.*;
import net.yeoxuhang.geode_plus.reg.BlockRegistryObject;
import net.yeoxuhang.geode_plus.reg.RegistrationProvider;

import java.util.function.Supplier;

public class BlockRegistry {
    public static final RegistrationProvider<Block> BLOCK = RegistrationProvider.get(BuiltInRegistries.BLOCK, GeodePlus.MOD_ID);


    public static final BlockRegistryObject<Block> BUDDING_PINK_TOPAZ = createBlock("budding_pink_topaz",
            () -> new BuddingPinkTopazBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).randomTicks().strength(3F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final BlockRegistryObject<Block> PINK_TOPAZ_BLOCK = createBlock("pink_topaz_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK)
                    .strength(4f).sound(SoundType.AMETHYST)));
    public static final BlockRegistryObject<PinkTopazCrystalBlock> PINK_TOPAZ_CRYSTAL = createBlock("pink_topaz_crystal",
            () -> new PinkTopazCrystalBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.AMETHYST).strength(3F).lightLevel( (p_60929_) -> 8)));
    public static final BlockRegistryObject<PinkTopazCrystalBlock> LARGE_PINK_TOPAZ_BUD = createBlock("large_pink_topaz_bud",
            () -> new PinkTopazCrystalBlock(5, 3, BlockBehaviour.Properties.copy(PINK_TOPAZ_CRYSTAL.get()).lightLevel((p_60929_) -> 2)));
    public static final BlockRegistryObject<PinkTopazCrystalBlock> MEDIUM_PINK_TOPAZ_BUD = createBlock("medium_pink_topaz_bud",
            () -> new PinkTopazCrystalBlock(4, 3, BlockBehaviour.Properties.copy(PINK_TOPAZ_CRYSTAL.get()).lightLevel((p_60929_) -> 1)));
    public static final BlockRegistryObject<PinkTopazCrystalBlock> SMALL_PINK_TOPAZ_BUD = createBlock("small_pink_topaz_bud",
            () -> new PinkTopazCrystalBlock(3, 4, BlockBehaviour.Properties.copy(PINK_TOPAZ_CRYSTAL.get())));

    public static final BlockRegistryObject<Block> BUDDING_CELESTITE = createBlock("budding_celestite",
            () -> new BuddingCelestiteBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).randomTicks().strength(3F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final BlockRegistryObject<Block> CELESTITE_BLOCK = createBlock("celestite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN)
                    .strength(4f).sound(SoundType.STONE)));
    public static final BlockRegistryObject<CelestiteClusterBlock> CELESTITE_CLUSTER = createBlock("celestite_cluster",
            () -> new CelestiteClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.AMETHYST).strength(3F).lightLevel( (p_60929_) -> 8)));
    public static final BlockRegistryObject<CelestiteClusterBlock> LARGE_CELESTITE_BUD = createBlock("large_celestite_bud",
            () -> new CelestiteClusterBlock(5, 3, BlockBehaviour.Properties.copy(CELESTITE_CLUSTER.get()).lightLevel((p_60929_) -> 2)));
    public static final BlockRegistryObject<CelestiteClusterBlock> MEDIUM_CELESTITE_BUD = createBlock("medium_celestite_bud",
            () -> new CelestiteClusterBlock(4, 3, BlockBehaviour.Properties.copy(CELESTITE_CLUSTER.get()).lightLevel((p_60929_) -> 1)));
    public static final BlockRegistryObject<CelestiteClusterBlock> SMALL_CELESTITE_BUD = createBlock("small_celestite_bud",
            () -> new CelestiteClusterBlock(3, 4, BlockBehaviour.Properties.copy(CELESTITE_CLUSTER.get())));

    public static final BlockRegistryObject<Block> BUDDING_PRISMARINE = createBlock("budding_prismarine",
            () -> new BuddingPrismarineBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).randomTicks().strength(3F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final BlockRegistryObject<Block> PRISMARINE_CLUSTER_BLOCK = createBlock("prismarine_cluster_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN)
                    .strength(4f).sound(SoundType.STONE)));
    public static final BlockRegistryObject<PrismarineClusterBlock> PRISMARINE_CLUSTER = createBlock("prismarine_cluster",
            () -> new PrismarineClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.AMETHYST).strength(3F).lightLevel( (p_60929_) -> 8)));
    public static final BlockRegistryObject<PrismarineClusterBlock> LARGE_PRISMARINE_BUD = createBlock("large_prismarine_bud",
            () -> new PrismarineClusterBlock(5, 3, BlockBehaviour.Properties.copy(PRISMARINE_CLUSTER.get()).lightLevel((p_60929_) -> 2)));
    public static final BlockRegistryObject<PrismarineClusterBlock> MEDIUM_PRISMARINE_BUD = createBlock("medium_prismarine_bud",
            () -> new PrismarineClusterBlock(4, 3, BlockBehaviour.Properties.copy(PRISMARINE_CLUSTER.get()).lightLevel((p_60929_) -> 1)));
    public static final BlockRegistryObject<PrismarineClusterBlock> SMALL_PRISMARINE_BUD = createBlock("small_prismarine_bud",
            () -> new PrismarineClusterBlock(3, 4, BlockBehaviour.Properties.copy(PRISMARINE_CLUSTER.get())));

    public static final BlockRegistryObject<BuddingLapisBlock> BUDDING_LAPIS = createBlock("budding_lapis",
            () -> new BuddingLapisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).randomTicks().strength(3F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final BlockRegistryObject<BuddingLapisBlock> BUDDING_DEEPSLATE_LAPIS = createBlock("budding_deepslate_lapis",
            () -> new BuddingLapisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).randomTicks().strength(5F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));

    public static final BlockRegistryObject<BuddingLapisBlock> BUDDING_SCULK_LAPIS = createBlock("budding_sculk_lapis",
            () -> new BuddingLapisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(3F).sound(SoundType.SCULK).requiresCorrectToolForDrops()));
    public static final BlockRegistryObject<Block> LAPIS_CLUSTER_BLOCK = createBlock("lapis_cluster_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE)
                    .strength(4f).sound(SoundType.STONE)));

    public static final BlockRegistryObject<OresClusterBlock> LAPIS_CLUSTER = createBlock("lapis_cluster",
            () -> new OresClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.AMETHYST).strength(3F).lightLevel( (p_60929_) -> 8)));
    public static final BlockRegistryObject<LargeOresClusterBlock> LARGE_LAPIS_BUD = createBlock("large_lapis_bud",
            () -> new LargeOresClusterBlock(5, 3, BlockBehaviour.Properties.copy(LAPIS_CLUSTER.get()).sound(SoundType.AMETHYST).lightLevel((p_60929_) -> 2)));
    public static final BlockRegistryObject<MediumOresClusterBlock> MEDIUM_LAPIS_BUD = createBlock("medium_lapis_bud",
            () -> new MediumOresClusterBlock(4, 3, BlockBehaviour.Properties.copy(LAPIS_CLUSTER.get()).sound(SoundType.AMETHYST).lightLevel((p_60929_) -> 1)));
    public static final BlockRegistryObject<SmallOresClusterBlock> SMALL_LAPIS_BUD = createBlock("small_lapis_bud",
            () -> new SmallOresClusterBlock(3, 4, BlockBehaviour.Properties.copy(LAPIS_CLUSTER.get()).sound(SoundType.AMETHYST)));

    public static final BlockRegistryObject<Block> BUDDING_REDSTONE = createBlock("budding_redstone",
            () -> new BuddingRedstoneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).randomTicks().strength(3F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final BlockRegistryObject<Block> BUDDING_DEEPSLATE_REDSTONE = createBlock("budding_deepslate_redstone",
            () -> new BuddingRedstoneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).randomTicks().strength(5F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final BlockRegistryObject<Block> BUDDING_SCULK_REDSTONE = createBlock("budding_sculk_redstone",
            () -> new BuddingRedstoneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(3F).sound(SoundType.SCULK).requiresCorrectToolForDrops()));
    public static final BlockRegistryObject<Block> REDSTONE_CRYSTAL_BLOCK = createBlock("redstone_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED)
                    .strength(4f).sound(SoundType.STONE)));

    public static final BlockRegistryObject<RedstoneOresClusterBlock> REDSTONE_CRYSTAL = createBlock("redstone_crystal",
            () -> new RedstoneOresClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.AMETHYST).strength(3F).lightLevel( (p_60929_) -> 8)));
    public static final BlockRegistryObject<RedstoneOresClusterBlock> LARGE_REDSTONE_BUD = createBlock("large_redstone_bud",
            () -> new RedstoneOresClusterBlock(5, 3, BlockBehaviour.Properties.copy(REDSTONE_CRYSTAL.get()).sound(SoundType.AMETHYST).lightLevel((p_60929_) -> 2)));
    public static final BlockRegistryObject<RedstoneOresClusterBlock> MEDIUM_REDSTONE_BUD = createBlock("medium_redstone_bud",
            () -> new RedstoneOresClusterBlock(4, 3, BlockBehaviour.Properties.copy(REDSTONE_CRYSTAL.get()).sound(SoundType.AMETHYST).lightLevel((p_60929_) -> 1)));
    public static final BlockRegistryObject<RedstoneOresClusterBlock> SMALL_REDSTONE_BUD = createBlock("small_redstone_bud",
            () -> new RedstoneOresClusterBlock(3, 4, BlockBehaviour.Properties.copy(REDSTONE_CRYSTAL.get()).sound(SoundType.AMETHYST)));

    public static final BlockRegistryObject<Block> BUDDING_EMERALD = createBlock("budding_emerald",
            () -> new BuddingEmeraldBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).randomTicks().strength(3F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final BlockRegistryObject<Block> BUDDING_DEEPSLATE_EMERALD = createBlock("budding_deepslate_emerald",
            () -> new BuddingEmeraldBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).randomTicks().strength(5F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final BlockRegistryObject<Block> BUDDING_SCULK_EMERALD = createBlock("budding_sculk_emerald",
            () -> new BuddingEmeraldBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(3F).sound(SoundType.SCULK).requiresCorrectToolForDrops()));
    public static final BlockRegistryObject<Block> EMERALD_CLUSTER_BLOCK = createBlock("emerald_cluster_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.EMERALD)
                    .strength(4f).sound(SoundType.STONE)));
    public static final BlockRegistryObject<OresClusterBlock> EMERALD_CLUSTER = createBlock("emerald_cluster",
            () -> new OresClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.EMERALD).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.AMETHYST).strength(3F).lightLevel( (p_60929_) -> 8)));
    public static final BlockRegistryObject<LargeOresClusterBlock> LARGE_EMERALD_BUD = createBlock("large_emerald_bud",
            () -> new LargeOresClusterBlock(5, 3, BlockBehaviour.Properties.copy(EMERALD_CLUSTER.get()).sound(SoundType.AMETHYST).lightLevel((p_60929_) -> 2)));
    public static final BlockRegistryObject<MediumOresClusterBlock> MEDIUM_EMERALD_BUD = createBlock("medium_emerald_bud",
            () -> new MediumOresClusterBlock(4, 3, BlockBehaviour.Properties.copy(EMERALD_CLUSTER.get()).sound(SoundType.AMETHYST).lightLevel((p_60929_) -> 1)));
    public static final BlockRegistryObject<SmallOresClusterBlock> SMALL_EMERALD_BUD = createBlock("small_emerald_bud",
            () -> new SmallOresClusterBlock(3, 4, BlockBehaviour.Properties.copy(EMERALD_CLUSTER.get()).sound(SoundType.AMETHYST)));

    public static final BlockRegistryObject<Block> BUDDING_DIAMOND = createBlock("budding_diamond",
            () -> new BuddingDiamondBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).randomTicks().strength(3F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final BlockRegistryObject<Block> BUDDING_DEEPSLATE_DIAMOND = createBlock("budding_deepslate_diamond",
            () -> new BuddingDiamondBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).randomTicks().strength(5F).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));

    public static final BlockRegistryObject<Block> BUDDING_SCULK_DIAMOND = createBlock("budding_sculk_diamond",
            () -> new BuddingDiamondBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(3F).sound(SoundType.SCULK).requiresCorrectToolForDrops()));
    public static final BlockRegistryObject<Block> DIAMOND_CRYSTAL_BLOCK = createBlock("diamond_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND)
                    .strength(4f).sound(SoundType.STONE)));
    public static final BlockRegistryObject<OresClusterBlock> DIAMOND_CRYSTAL = createBlock("diamond_crystal",
            () -> new OresClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.AMETHYST).strength(3F).lightLevel( (p_60929_) -> 8)));
    public static final BlockRegistryObject<LargeOresClusterBlock> LARGE_DIAMOND_BUD = createBlock("large_diamond_bud",
            () -> new LargeOresClusterBlock(5, 3, BlockBehaviour.Properties.copy(DIAMOND_CRYSTAL.get()).sound(SoundType.AMETHYST).lightLevel((p_60929_) -> 2)));
    public static final BlockRegistryObject<MediumOresClusterBlock> MEDIUM_DIAMOND_BUD = createBlock("medium_diamond_bud",
            () -> new MediumOresClusterBlock(4, 3, BlockBehaviour.Properties.copy(DIAMOND_CRYSTAL.get()).sound(SoundType.AMETHYST).lightLevel((p_60929_) -> 1)));
    public static final BlockRegistryObject<SmallOresClusterBlock> SMALL_DIAMOND_BUD = createBlock("small_diamond_bud",
            () -> new SmallOresClusterBlock(3, 4, BlockBehaviour.Properties.copy(DIAMOND_CRYSTAL.get()).sound(SoundType.AMETHYST)));

    public static final BlockRegistryObject<Block> BUDDING_NETHER_QUARTZ = createBlock("budding_nether_quartz",
            () -> new BuddingNetherQuartzBlock(BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).randomTicks().strength(3F).sound(SoundType.NETHER_ORE).requiresCorrectToolForDrops()));
    public static final BlockRegistryObject<Block> BUDDING_BASALT_QUARTZ = createBlock("budding_basalt_quartz",
            () -> new BuddingNetherQuartzBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(3F).sound(SoundType.BASALT).requiresCorrectToolForDrops()));
    public static final BlockRegistryObject<Block> BUDDING_BLACKSTONE_QUARTZ = createBlock("budding_blackstone_quartz",
            () -> new BuddingNetherQuartzBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(3F).sound(SoundType.NETHER_ORE).requiresCorrectToolForDrops()));
    public static final BlockRegistryObject<Block> QUARTZ_CRYSTAL_BLOCK = createBlock("nether_quartz_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ)
                    .strength(3f).sound(SoundType.STONE)));

    public static final BlockRegistryObject<Block> QUARTZ_CRYSTAL = createBlock("nether_quartz_crystal",
            () -> new QuartzCrystalBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.NETHER_ORE).strength(3F).lightLevel( (p_60929_) -> 8)));
    public static final BlockRegistryObject<Block> LARGE_QUARTZ_BUD = createBlock("large_nether_quartz_bud",
            () -> new QuartzCrystalBlock(5, 3, BlockBehaviour.Properties.copy(QUARTZ_CRYSTAL.get()).sound(SoundType.NETHER_ORE).lightLevel((p_60929_) -> 2)));
    public static final BlockRegistryObject<Block> MEDIUM_QUARTZ_BUD = createBlock("medium_nether_quartz_bud",
            () -> new QuartzCrystalBlock(4, 3, BlockBehaviour.Properties.copy(QUARTZ_CRYSTAL.get()).sound(SoundType.NETHER_ORE).lightLevel((p_60929_) -> 1)));
    public static final BlockRegistryObject<Block> SMALL_QUARTZ_BUD = createBlock("small_nether_quartz_bud",
            () -> new QuartzCrystalBlock(3, 4, BlockBehaviour.Properties.copy(QUARTZ_CRYSTAL.get()).sound(SoundType.NETHER_ORE)));

    public static final BlockRegistryObject<Block> BUDDING_GOLD_NUGGET = createBlock("budding_nether_gold_nugget",
            () -> new BuddingNetherGoldBlock(BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).randomTicks().strength(3F).sound(SoundType.NETHER_GOLD_ORE).requiresCorrectToolForDrops()));
    public static final BlockRegistryObject<Block> BUDDING_BASALT_GOLD_NUGGET = createBlock("budding_basalt_gold_nugget",
            () -> new BuddingNetherGoldBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(3F).sound(SoundType.NETHER_GOLD_ORE).requiresCorrectToolForDrops()));
    public static final BlockRegistryObject<Block> BUDDING_BLACKSTONE_GOLD_NUGGET = createBlock("budding_blackstone_gold_nugget",
            () -> new BuddingNetherGoldBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(3F).sound(SoundType.NETHER_GOLD_ORE).requiresCorrectToolForDrops()));
    public static final BlockRegistryObject<Block> GOLD_NUGGET_CLUSTER_BLOCK = createBlock("nether_gold_nugget_cluster_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.GOLD)
                    .strength(4f).sound(SoundType.STONE)));

    public static final BlockRegistryObject<Block> GOLD_NUGGET_CLUSTER = createBlock("nether_gold_nugget_cluster",
            () -> new NetherGoldClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.GOLD).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.NETHER_GOLD_ORE).strength(3F).lightLevel( (p_60929_) -> 8)));
    public static final BlockRegistryObject<Block> LARGE_GOLD_NUGGET_BUD = createBlock("large_nether_gold_nugget_bud",
            () -> new NetherGoldClusterBlock(5, 3, BlockBehaviour.Properties.copy(GOLD_NUGGET_CLUSTER.get()).sound(SoundType.NETHER_GOLD_ORE).lightLevel((p_60929_) -> 2)));
    public static final BlockRegistryObject<Block> MEDIUM_GOLD_NUGGET_BUD = createBlock("medium_nether_gold_nugget_bud",
            () -> new NetherGoldClusterBlock(4, 3, BlockBehaviour.Properties.copy(GOLD_NUGGET_CLUSTER.get()).sound(SoundType.NETHER_GOLD_ORE).lightLevel((p_60929_) -> 1)));
    public static final BlockRegistryObject<Block> SMALL_GOLD_NUGGET_BUD = createBlock("small_nether_gold_nugget_bud",
            () -> new NetherGoldClusterBlock(3, 4, BlockBehaviour.Properties.copy(GOLD_NUGGET_CLUSTER.get()).sound(SoundType.NETHER_GOLD_ORE)));

    public static final BlockRegistryObject<Block> BUDDING_GLOWSTONE = createBlock("budding_nether_glowstone",
            () -> new BuddingGlowstoneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).randomTicks().strength(3F).sound(SoundType.GLASS).requiresCorrectToolForDrops().lightLevel((p_152632_) -> 10)));
    public static final BlockRegistryObject<Block> BUDDING_BASALT_GLOWSTONE = createBlock("budding_basalt_glowstone",
            () -> new BuddingGlowstoneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(3F).sound(SoundType.GLASS).requiresCorrectToolForDrops().lightLevel((p_152632_) -> 10)));
    public static final BlockRegistryObject<Block> BUDDING_BLACKSTONE_GLOWSTONE = createBlock("budding_blackstone_glowstone",
            () -> new BuddingGlowstoneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(3F).sound(SoundType.GLASS).requiresCorrectToolForDrops().lightLevel((p_152632_) -> 10)));
    public static final BlockRegistryObject<Block> GLOWSTONE_CLUSTER_BLOCK = createBlock("nether_glowstone_cluster_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.SAND)
                    .strength(4f).sound(SoundType.GLASS).lightLevel( (p_60929_) -> 15)
            ));

    public static final BlockRegistryObject<Block> GLOWSTONE_CLUSTER = createBlock("nether_glowstone_cluster",
            () -> new GlowstoneClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.SAND).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.GLASS).strength(3F).lightLevel( (p_60929_) -> 15)));
    public static final BlockRegistryObject<Block> LARGE_GLOWSTONE_BUD = createBlock("large_nether_glowstone_bud",
            () -> new GlowstoneClusterBlock(5, 3, BlockBehaviour.Properties.copy(GLOWSTONE_CLUSTER.get()).sound(SoundType.GLASS).lightLevel((p_60929_) -> 5)));
    public static final BlockRegistryObject<Block> MEDIUM_GLOWSTONE_BUD = createBlock("medium_nether_glowstone_bud",
            () -> new GlowstoneClusterBlock(4, 3, BlockBehaviour.Properties.copy(GLOWSTONE_CLUSTER.get()).sound(SoundType.GLASS).lightLevel((p_60929_) -> 3)));
    public static final BlockRegistryObject<Block> SMALL_GLOWSTONE_BUD = createBlock("small_nether_glowstone_bud",
            () -> new GlowstoneClusterBlock(3, 4, BlockBehaviour.Properties.copy(GLOWSTONE_CLUSTER.get()).sound(SoundType.GLASS).lightLevel((p_60929_) -> 2)));

    public static final BlockRegistryObject<Block> BUDDING_ANCIENT_DEBRIS = createBlock("budding_nether_ancient_debris",
            () -> new BuddingAncientDebrisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).randomTicks().strength(10F).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops().lightLevel((p_152632_) -> 10)));
    public static final BlockRegistryObject<Block> BUDDING_BASALT_ANCIENT_DEBRIS = createBlock("budding_basalt_ancient_debris",
            () -> new BuddingAncientDebrisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(10F).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops().lightLevel((p_152632_) -> 10)));
    public static final BlockRegistryObject<Block> BUDDING_BLACKSTONE_ANCIENT_DEBRIS = createBlock("budding_blackstone_ancient_debris",
            () -> new BuddingAncientDebrisBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(10F).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops().lightLevel((p_152632_) -> 10)));
    public static final BlockRegistryObject<Block> ANCIENT_DEBRIS_CLUSTER_BLOCK = createBlock("nether_ancient_debris_cluster_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(4f).sound(SoundType.STONE)));


    public static final BlockRegistryObject<Block> ANCIENT_DEBRIS_CLUSTER = createBlock("nether_ancient_debris_cluster",
            () -> new WrappistClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.ANCIENT_DEBRIS).strength(10F).lightLevel((p_60929_) -> 8)));
    public static final BlockRegistryObject<Block> LARGE_ANCIENT_DEBRIS_BUD = createBlock("large_nether_ancient_debris_bud",
            () -> new AncientDebrisClusterBlock(5, 3, BlockBehaviour.Properties.copy(ANCIENT_DEBRIS_CLUSTER.get()).sound(SoundType.ANCIENT_DEBRIS).lightLevel((p_60929_) -> 5)));
    public static final BlockRegistryObject<Block> MEDIUM_ANCIENT_DEBRIS_BUD = createBlock("medium_nether_ancient_debris_bud",
            () -> new AncientDebrisClusterBlock(4, 3, BlockBehaviour.Properties.copy(ANCIENT_DEBRIS_CLUSTER.get()).sound(SoundType.ANCIENT_DEBRIS).lightLevel((p_60929_) -> 3)));
    public static final BlockRegistryObject<Block> SMALL_ANCIENT_DEBRIS_BUD = createBlock("small_nether_ancient_debris_bud",
            () -> new AncientDebrisClusterBlock(3, 4, BlockBehaviour.Properties.copy(ANCIENT_DEBRIS_CLUSTER.get()).sound(SoundType.ANCIENT_DEBRIS).lightLevel((p_60929_) -> 2)));

    public static final BlockRegistryObject<Block> SMOOTH_END_STONE = createBlock("smooth_end_stone",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.SAND)
                    .strength(4f).sound(SoundType.BASALT)));
    public static final BlockRegistryObject<StairBlock> SMOOTH_END_STONE_STAIRS = createBlock("smooth_end_stone_stairs",
            () -> new StairBlock(SMOOTH_END_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(SMOOTH_END_STONE.get())));
    public static final BlockRegistryObject<SlabBlock> SMOOTH_END_STONE_SLAB = createBlock("smooth_end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SAND)
                    .strength(4f).sound(SoundType.BASALT)));
    public static final BlockRegistryObject<WallBlock> SMOOTH_END_STONE_WALL = createBlock("smooth_end_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(SMOOTH_END_STONE.get())));
    public static final BlockRegistryObject<Block> GALCITE = createBlock("galcite",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK)
                    .strength(5f, 1200).sound(SoundType.CALCITE)));
    public static final BlockRegistryObject<StairBlock> GALCITE_STAIRS = createBlock("galcite_stairs",
            () -> new StairBlock(GALCITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(GALCITE.get())));
    public static final BlockRegistryObject<SlabBlock> GALCITE_SLAB = createBlock("galcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK)
                    .strength(4f).sound(SoundType.CALCITE)));
    public static final BlockRegistryObject<WallBlock> GALCITE_WALL = createBlock("galcite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(GALCITE.get())));
    public static final BlockRegistryObject<Block> WRAPPIST_BLOCK = createBlock("wrappist_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .strength(5f).sound(SoundType.AMETHYST)));

    public static final BlockRegistryObject<Block> BUDDING_WRAPPIST = createBlock("budding_wrappist",
            () -> new BuddingWrappistBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).randomTicks().strength(5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final BlockRegistryObject<Block> WRAPPIST_CLUSTER = createBlock("wrappist_cluster",
            () -> new WrappistClusterBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(3F).lightLevel((p_60929_) -> 8)));
    public static final BlockRegistryObject<Block> LARGE_WRAPPIST_BUD = createBlock("large_wrappist_bud",
            () -> new WrappistClusterBlock(5, 3, BlockBehaviour.Properties.copy(WRAPPIST_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_60929_) -> 6)));
    public static final BlockRegistryObject<Block> MEDIUM_WRAPPIST_BUD = createBlock("medium_wrappist_bud",
            () -> new WrappistClusterBlock(4, 3, BlockBehaviour.Properties.copy(WRAPPIST_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_60929_) -> 3)));
    public static final BlockRegistryObject<Block> SMALL_WRAPPIST_BUD = createBlock("small_wrappist_bud",
            () -> new WrappistClusterBlock(3, 4, BlockBehaviour.Properties.copy(WRAPPIST_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_60929_) -> 2)));

    public static final BlockRegistryObject<Block> ECHO_CRYSTAL_BLOCK = createBlock("echo_crystal_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK)
                    .strength(5f).sound(SoundType.SCULK_CATALYST)));
    public static final BlockRegistryObject<BuddingEchoBlock> BUDDING_ECHO = createBlock("budding_echo",
            () -> new BuddingEchoBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).randomTicks().strength(5F).sound(SoundType.SCULK).requiresCorrectToolForDrops()));


    public static final BlockRegistryObject<Block> ECHO_CRYSTAL = createBlock("echo_crystal",
            () -> new EchoCrystalBlock(7, 3, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).forceSolidOn().noOcclusion().randomTicks().sound(SoundType.SCULK_CATALYST).strength(4F).lightLevel((p_60929_) -> 3)));
    public static final BlockRegistryObject<EchoCrystalBlock> LARGE_ECHO_BUD = createBlock("large_echo_bud",
            () -> new EchoCrystalBlock(5, 3, BlockBehaviour.Properties.copy(ECHO_CRYSTAL.get()).sound(SoundType.SCULK_CATALYST).lightLevel((p_60929_) -> 2)));
    public static final BlockRegistryObject<EchoCrystalBlock> MEDIUM_ECHO_BUD = createBlock("medium_echo_bud",
            () -> new EchoCrystalBlock(4, 3, BlockBehaviour.Properties.copy(ECHO_CRYSTAL.get()).sound(SoundType.SCULK_CATALYST).lightLevel((p_60929_) -> 1)));
    public static final BlockRegistryObject<EchoCrystalBlock> SMALL_ECHO_BUD = createBlock("small_echo_bud",
            () -> new EchoCrystalBlock(3, 4, BlockBehaviour.Properties.copy(ECHO_CRYSTAL.get()).sound(SoundType.SCULK_CATALYST)));

    public static final BlockRegistryObject<WrappistPedestalBlock> WRAPPIST_PEDESTAL = createBlock("wrappist_pedestal",
            () -> new WrappistPedestalBlock(BlockBehaviour.Properties.copy(WRAPPIST_BLOCK.get()).explosionResistance(100.0F).randomTicks().noOcclusion().lightLevel(($$0x) -> 8)));

    public static final BlockRegistryObject<GlassBlock> WRAPPIST_GLASS = createBlock("wrappist_glass", ()-> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).explosionResistance(100F).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final BlockRegistryObject<GlassBlock> CELESTITE_GLASS = createBlock("celestite_glass", ()-> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(MapColor.COLOR_CYAN)));
    public static final BlockRegistryObject<GlassBlock> PINK_TOPAZ_GLASS = createBlock("pink_topaz_glass", ()-> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(MapColor.COLOR_PINK)));

    public static <B extends Block> BlockRegistryObject<B> createBlock(String id, Supplier<? extends B> block) {
        final var ro = BLOCK.<B>register(id, block);
        return BlockRegistryObject.wrap(ro);
    }

    public static void init(){}
}
