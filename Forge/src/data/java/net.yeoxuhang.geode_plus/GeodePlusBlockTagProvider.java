package net.yeoxuhang.geode_plus;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.yeoxuhang.geode_plus.server.registry.BlockRegistry;
import net.yeoxuhang.geode_plus.server.registry.TagRegistry;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class GeodePlusBlockTagProvider extends BlockTagsProvider {

    public GeodePlusBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, GeodePlus.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                BlockRegistry.BUDDING_GOLD_NUGGET.get(),
                BlockRegistry.BUDDING_BASALT_GOLD_NUGGET.get(),
                BlockRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET.get(),
                BlockRegistry.LAPIS_CLUSTER.get(),
                BlockRegistry.LARGE_LAPIS_BUD.get(),
                BlockRegistry.MEDIUM_LAPIS_BUD.get(),
                BlockRegistry.SMALL_LAPIS_BUD.get(),
                BlockRegistry.REDSTONE_CRYSTAL.get(),
                BlockRegistry.LARGE_REDSTONE_BUD.get(),
                BlockRegistry.MEDIUM_REDSTONE_BUD.get(),
                BlockRegistry.SMALL_REDSTONE_BUD.get(),
                BlockRegistry.EMERALD_CLUSTER.get(),
                BlockRegistry.LARGE_EMERALD_BUD.get(),
                BlockRegistry.MEDIUM_EMERALD_BUD.get(),
                BlockRegistry.SMALL_EMERALD_BUD.get(),
                BlockRegistry.DIAMOND_CRYSTAL.get(),
                BlockRegistry.LARGE_DIAMOND_BUD.get(),
                BlockRegistry.MEDIUM_DIAMOND_BUD.get(),
                BlockRegistry.SMALL_DIAMOND_BUD.get(),
                BlockRegistry.BUDDING_LAPIS.get(),
                BlockRegistry.BUDDING_REDSTONE.get(),
                BlockRegistry.BUDDING_EMERALD.get(),
                BlockRegistry.BUDDING_DIAMOND.get(),
                BlockRegistry.BUDDING_DEEPSLATE_LAPIS.get(),
                BlockRegistry.BUDDING_DEEPSLATE_REDSTONE.get(),
                BlockRegistry.BUDDING_DEEPSLATE_EMERALD.get(),
                BlockRegistry.BUDDING_DEEPSLATE_DIAMOND.get(),
                BlockRegistry.BUDDING_SCULK_LAPIS.get(),
                BlockRegistry.BUDDING_SCULK_REDSTONE.get(),
                BlockRegistry.BUDDING_SCULK_EMERALD.get(),
                BlockRegistry.BUDDING_SCULK_DIAMOND.get(),
                BlockRegistry.BUDDING_NETHER_QUARTZ.get(),
                BlockRegistry.BUDDING_BASALT_QUARTZ.get(),
                BlockRegistry.BUDDING_BLACKSTONE_QUARTZ.get(),
                BlockRegistry.BUDDING_BASALT_GLOWSTONE.get(),
                BlockRegistry.QUARTZ_CRYSTAL_BLOCK.get(),
                BlockRegistry.QUARTZ_CRYSTAL.get(),
                BlockRegistry.LARGE_QUARTZ_BUD.get(),
                BlockRegistry.MEDIUM_QUARTZ_BUD.get(),
                BlockRegistry.SMALL_QUARTZ_BUD.get(),
                BlockRegistry.GOLD_NUGGET_CLUSTER_BLOCK.get(),
                BlockRegistry.GOLD_NUGGET_CLUSTER.get(),
                BlockRegistry.LARGE_GOLD_NUGGET_BUD.get(),
                BlockRegistry.MEDIUM_GOLD_NUGGET_BUD.get(),
                BlockRegistry.SMALL_GOLD_NUGGET_BUD.get(),
                BlockRegistry.BUDDING_GLOWSTONE.get(),
                BlockRegistry.BUDDING_BASALT_GLOWSTONE.get(),
                BlockRegistry.BUDDING_BLACKSTONE_GLOWSTONE.get(),
                BlockRegistry.GLOWSTONE_CLUSTER_BLOCK.get(),
                BlockRegistry.GLOWSTONE_CLUSTER.get(),
                BlockRegistry.LARGE_GLOWSTONE_BUD.get(),
                BlockRegistry.MEDIUM_GLOWSTONE_BUD.get(),
                BlockRegistry.SMALL_GLOWSTONE_BUD.get(),
                BlockRegistry.SMOOTH_END_STONE.get(),
                BlockRegistry.SMOOTH_END_STONE_SLAB.get(),
                BlockRegistry.SMOOTH_END_STONE_STAIRS.get(),
                BlockRegistry.SMOOTH_END_STONE_WALL.get(),
                BlockRegistry.GALCITE.get(),
                BlockRegistry.GALCITE_SLAB.get(),
                BlockRegistry.GALCITE_STAIRS.get(),
                BlockRegistry.GALCITE_WALL.get(),
                BlockRegistry.WRAPPIST_BLOCK.get(),
                BlockRegistry.BUDDING_WRAPPIST.get(),
                BlockRegistry.WRAPPIST_CLUSTER.get(),
                BlockRegistry.LARGE_WRAPPIST_BUD.get(),
                BlockRegistry.MEDIUM_WRAPPIST_BUD.get(),
                BlockRegistry.SMALL_WRAPPIST_BUD.get(),
                BlockRegistry.ECHO_CRYSTAL_BLOCK.get(),
                BlockRegistry.BUDDING_ECHO.get(),
                BlockRegistry.ECHO_CRYSTAL.get(),
                BlockRegistry.LARGE_ECHO_BUD.get(),
                BlockRegistry.MEDIUM_ECHO_BUD.get(),
                BlockRegistry.SMALL_ECHO_BUD.get(),
                BlockRegistry.WRAPPIST_PEDESTAL.get(),
                BlockRegistry.BUDDING_ANCIENT_DEBRIS.get(),
                BlockRegistry.BUDDING_BASALT_ANCIENT_DEBRIS.get(),
                BlockRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS.get(),
                BlockRegistry.ANCIENT_DEBRIS_CLUSTER.get(),
                BlockRegistry.LARGE_ANCIENT_DEBRIS_BUD.get(),
                BlockRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.get(),
                BlockRegistry.SMALL_ANCIENT_DEBRIS_BUD.get(),
                BlockRegistry.BUDDING_PRISMARINE.get(),
                BlockRegistry.PRISMARINE_CLUSTER_BLOCK.get(),
                BlockRegistry.PRISMARINE_CLUSTER.get(),
                BlockRegistry.LARGE_PRISMARINE_BUD.get(),
                BlockRegistry.MEDIUM_PRISMARINE_BUD.get(),
                BlockRegistry.SMALL_PRISMARINE_BUD.get(),
                BlockRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK.get(),
                BlockRegistry.DIAMOND_CRYSTAL_BLOCK.get(),
                BlockRegistry.EMERALD_CLUSTER_BLOCK.get(),
                BlockRegistry.LAPIS_CLUSTER_BLOCK.get(),
                BlockRegistry.REDSTONE_CRYSTAL_BLOCK.get(),
                BlockRegistry.BUDDING_CELESTITE.get(),
                BlockRegistry.CELESTITE_BLOCK.get(),
                BlockRegistry.CELESTITE_CLUSTER.get(),
                BlockRegistry.LARGE_CELESTITE_BUD.get(),
                BlockRegistry.MEDIUM_CELESTITE_BUD.get(),
                BlockRegistry.SMALL_CELESTITE_BUD.get(),
                BlockRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK.get(),
                BlockRegistry.BUDDING_PINK_TOPAZ.get(),
                BlockRegistry.PINK_TOPAZ_BLOCK.get(),
                BlockRegistry.PINK_TOPAZ_CRYSTAL.get(),
                BlockRegistry.LARGE_PINK_TOPAZ_BUD.get(),
                BlockRegistry.MEDIUM_PINK_TOPAZ_BUD.get(),
                BlockRegistry.SMALL_PINK_TOPAZ_BUD.get(),

                BlockRegistry.WRAPPIST_GLASS.get(),
                BlockRegistry.CELESTITE_GLASS.get(),
                BlockRegistry.PINK_TOPAZ_GLASS.get()
        );
        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
                BlockRegistry.LAPIS_CLUSTER.get(),
                BlockRegistry.LARGE_LAPIS_BUD.get(),
                BlockRegistry.MEDIUM_LAPIS_BUD.get(),
                BlockRegistry.SMALL_LAPIS_BUD.get(),
                BlockRegistry.BUDDING_LAPIS.get(),
                BlockRegistry.BUDDING_DEEPSLATE_LAPIS.get(),

                BlockRegistry.BUDDING_SCULK_LAPIS.get(),

                BlockRegistry.BUDDING_NETHER_QUARTZ.get(),
                BlockRegistry.BUDDING_BASALT_QUARTZ.get(),
                BlockRegistry.BUDDING_BLACKSTONE_QUARTZ.get(),
                BlockRegistry.BUDDING_BASALT_GLOWSTONE.get(),
                BlockRegistry.QUARTZ_CRYSTAL_BLOCK.get(),
                BlockRegistry.QUARTZ_CRYSTAL.get(),
                BlockRegistry.LARGE_QUARTZ_BUD.get(),
                BlockRegistry.MEDIUM_QUARTZ_BUD.get(),
                BlockRegistry.SMALL_QUARTZ_BUD.get(),

                BlockRegistry.BUDDING_GLOWSTONE.get(),
                BlockRegistry.BUDDING_BASALT_GLOWSTONE.get(),
                BlockRegistry.BUDDING_BLACKSTONE_GLOWSTONE.get(),
                BlockRegistry.GLOWSTONE_CLUSTER.get(),
                BlockRegistry.LARGE_GLOWSTONE_BUD.get(),
                BlockRegistry.MEDIUM_GLOWSTONE_BUD.get(),
                BlockRegistry.SMALL_GLOWSTONE_BUD.get(),
                BlockRegistry.SMOOTH_END_STONE.get(),
                BlockRegistry.SMOOTH_END_STONE_SLAB.get(),
                BlockRegistry.SMOOTH_END_STONE_STAIRS.get(),
                BlockRegistry.SMOOTH_END_STONE_WALL.get(),
                BlockRegistry.GALCITE.get(),
                BlockRegistry.GALCITE_SLAB.get(),
                BlockRegistry.GALCITE_STAIRS.get(),
                BlockRegistry.GALCITE_WALL.get(),

                BlockRegistry.BUDDING_PRISMARINE.get(),
                BlockRegistry.PRISMARINE_CLUSTER.get(),
                BlockRegistry.LARGE_PRISMARINE_BUD.get(),
                BlockRegistry.MEDIUM_PRISMARINE_BUD.get(),
                BlockRegistry.SMALL_PRISMARINE_BUD.get()
        );
        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
                BlockRegistry.REDSTONE_CRYSTAL.get(),
                BlockRegistry.LARGE_REDSTONE_BUD.get(),
                BlockRegistry.MEDIUM_REDSTONE_BUD.get(),
                BlockRegistry.SMALL_REDSTONE_BUD.get(),

                BlockRegistry.EMERALD_CLUSTER.get(),
                BlockRegistry.LARGE_EMERALD_BUD.get(),
                BlockRegistry.MEDIUM_EMERALD_BUD.get(),
                BlockRegistry.SMALL_EMERALD_BUD.get(),

                BlockRegistry.DIAMOND_CRYSTAL.get(),
                BlockRegistry.LARGE_DIAMOND_BUD.get(),
                BlockRegistry.MEDIUM_DIAMOND_BUD.get(),
                BlockRegistry.SMALL_DIAMOND_BUD.get(),
                BlockRegistry.BUDDING_REDSTONE.get(),
                BlockRegistry.BUDDING_EMERALD.get(),
                BlockRegistry.BUDDING_DIAMOND.get(),
                BlockRegistry.BUDDING_DEEPSLATE_REDSTONE.get(),
                BlockRegistry.BUDDING_DEEPSLATE_EMERALD.get(),
                BlockRegistry.BUDDING_DEEPSLATE_DIAMOND.get(),
                BlockRegistry.BUDDING_SCULK_REDSTONE.get(),
                BlockRegistry.BUDDING_SCULK_EMERALD.get(),
                BlockRegistry.BUDDING_SCULK_DIAMOND.get(),
                BlockRegistry.GOLD_NUGGET_CLUSTER.get(),
                BlockRegistry.LARGE_GOLD_NUGGET_BUD.get(),
                BlockRegistry.MEDIUM_GOLD_NUGGET_BUD.get(),
                BlockRegistry.SMALL_GOLD_NUGGET_BUD.get(),
                BlockRegistry.ECHO_CRYSTAL_BLOCK.get(),
                BlockRegistry.BUDDING_ECHO.get(),
                BlockRegistry.ECHO_CRYSTAL.get(),
                BlockRegistry.LARGE_ECHO_BUD.get(),
                BlockRegistry.MEDIUM_ECHO_BUD.get(),
                BlockRegistry.SMALL_ECHO_BUD.get(),
                BlockRegistry.BUDDING_GOLD_NUGGET.get(),
                BlockRegistry.BUDDING_BASALT_GOLD_NUGGET.get(),
                BlockRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET.get()
        );
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
                BlockRegistry.WRAPPIST_BLOCK.get(),
                BlockRegistry.BUDDING_WRAPPIST.get(),
                BlockRegistry.WRAPPIST_CLUSTER.get(),
                BlockRegistry.LARGE_WRAPPIST_BUD.get(),
                BlockRegistry.MEDIUM_WRAPPIST_BUD.get(),
                BlockRegistry.WRAPPIST_PEDESTAL.get(),
                BlockRegistry.BUDDING_ANCIENT_DEBRIS.get(),
                BlockRegistry.BUDDING_BASALT_ANCIENT_DEBRIS.get(),
                BlockRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS.get(),
                BlockRegistry.ANCIENT_DEBRIS_CLUSTER.get(),
                BlockRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK.get(),
                BlockRegistry.LARGE_ANCIENT_DEBRIS_BUD.get(),
                BlockRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.get(),
                BlockRegistry.SMALL_ANCIENT_DEBRIS_BUD.get(),
                BlockRegistry.BUDDING_CELESTITE.get(),
                BlockRegistry.CELESTITE_BLOCK.get(),
                BlockRegistry.CELESTITE_CLUSTER.get(),
                BlockRegistry.LARGE_CELESTITE_BUD.get(),
                BlockRegistry.MEDIUM_CELESTITE_BUD.get(),
                BlockRegistry.SMALL_CELESTITE_BUD.get(),
                BlockRegistry.BUDDING_PINK_TOPAZ.get(),
                BlockRegistry.PINK_TOPAZ_BLOCK.get(),
                BlockRegistry.PINK_TOPAZ_CRYSTAL.get(),
                BlockRegistry.LARGE_PINK_TOPAZ_BUD.get(),
                BlockRegistry.MEDIUM_PINK_TOPAZ_BUD.get(),
                BlockRegistry.SMALL_PINK_TOPAZ_BUD.get(),

                BlockRegistry.WRAPPIST_GLASS.get(),
                BlockRegistry.CELESTITE_GLASS.get(),
                BlockRegistry.PINK_TOPAZ_GLASS.get()
        );
        this.tag(TagRegistry.Blocks.CAN_LARGE_ECHO_CRYSTAL_PLACE).add(Blocks.SCULK,
                Blocks.STONE,
                Blocks.DEEPSLATE);

        this.tag(TagRegistry.Blocks.CAN_LARGE_PRISMARINE_CRYSTAL_PLACE).add(Blocks.SAND,
                Blocks.STONE,
                Blocks.GRAVEL,
                Blocks.CLAY,
                Blocks.SANDSTONE);

        this.tag(TagRegistry.Blocks.CAN_LARGE_WRAPPIST_CRYSTAL_PLACE).add(Blocks.END_STONE);

        this.tag(TagRegistry.Blocks.WRAPPIST_PEDESTAL_CANNOT_PLACE_ON).add(Blocks.AIR,
                Blocks.CAVE_AIR,
                Blocks.VOID_AIR);

        this.tag(BlockTags.WALLS).add(
                BlockRegistry.SMOOTH_END_STONE_WALL.get(),
                BlockRegistry.GALCITE_WALL.get()
        );
        this.tag(TagRegistry.Blocks.GEODE_INVALID_BLOCKS).add(
                Blocks.BEDROCK,
                Blocks.ICE,
                Blocks.BLUE_ICE,
                Blocks.PACKED_ICE,
                Blocks.LAVA
        );
        this.tag(TagRegistry.Blocks.GEODES_CANNOT_REPLACE).add(Blocks.BEDROCK, Blocks.SPAWNER, Blocks.CHEST, Blocks.END_PORTAL_FRAME, Blocks.REINFORCED_DEEPSLATE).addTags(BlockTags.STONE_BRICKS);
    }
}

