package net.yeoxuhang.geode_plus;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.yeoxuhang.geode_plus.server.registry.BlockRegistry;

import java.util.function.Supplier;


public class GeodePlusBlockStateProvider extends BlockStateProvider {
    public GeodePlusBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, GeodePlus.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(BlockRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK.get());
        simpleBlock(BlockRegistry.DIAMOND_CRYSTAL_BLOCK.get());
        simpleBlock(BlockRegistry.EMERALD_CLUSTER_BLOCK.get());
        simpleBlock(BlockRegistry.LAPIS_CLUSTER_BLOCK.get());
        simpleBlock(BlockRegistry.REDSTONE_CRYSTAL_BLOCK.get());
        simpleBlock(BlockRegistry.SMOOTH_END_STONE.get());
        simpleBlock(BlockRegistry.GALCITE.get());
        stairsBlock(BlockRegistry.GALCITE_STAIRS.get(), blockLoc(BlockRegistry.GALCITE));
        wallBlock(BlockRegistry.GALCITE_WALL, blockLoc(BlockRegistry.GALCITE));
        slabBlock(BlockRegistry.GALCITE_SLAB.get(), blockLoc(BlockRegistry.GALCITE),
                blockLoc(BlockRegistry.GALCITE));

        simpleBlock(BlockRegistry.WRAPPIST_BLOCK.get());
        simpleBlock(BlockRegistry.BUDDING_WRAPPIST.get());
        simpleBlock(BlockRegistry.BUDDING_NETHER_QUARTZ.get());
        simpleBlock(BlockRegistry.BUDDING_GLOWSTONE.get());
        simpleBlock(BlockRegistry.BUDDING_ECHO.get());
        simpleBlock(BlockRegistry.BUDDING_BLACKSTONE_GLOWSTONE.get());
        simpleBlock(BlockRegistry.BUDDING_BLACKSTONE_QUARTZ.get());
        simpleBlock(BlockRegistry.BUDDING_BASALT_QUARTZ.get());
        simpleBlock(BlockRegistry.BUDDING_BASALT_GLOWSTONE.get());
        simpleBlock(BlockRegistry.QUARTZ_CRYSTAL_BLOCK.get());
        simpleBlock(BlockRegistry.GOLD_NUGGET_CLUSTER_BLOCK.get());
        simpleBlock(BlockRegistry.GLOWSTONE_CLUSTER_BLOCK.get());
        simpleBlock(BlockRegistry.PRISMARINE_CLUSTER_BLOCK.get());
        simpleBlock(BlockRegistry.BUDDING_GOLD_NUGGET.get());
        simpleBlock(BlockRegistry.BUDDING_BASALT_GOLD_NUGGET.get());
        simpleBlock(BlockRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET.get());
        simpleBlock(BlockRegistry.BUDDING_ANCIENT_DEBRIS.get());
        simpleBlock(BlockRegistry.BUDDING_BASALT_ANCIENT_DEBRIS.get());
        simpleBlock(BlockRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS.get());
        simpleBlock(BlockRegistry.BUDDING_LAPIS.get());
        simpleBlock(BlockRegistry.BUDDING_REDSTONE.get());
        simpleBlock(BlockRegistry.BUDDING_EMERALD.get());
        simpleBlock(BlockRegistry.BUDDING_DIAMOND.get());
        simpleBlock(BlockRegistry.BUDDING_DEEPSLATE_LAPIS.get());
        simpleBlock(BlockRegistry.BUDDING_DEEPSLATE_REDSTONE.get());
        simpleBlock(BlockRegistry.BUDDING_DEEPSLATE_EMERALD.get());
        simpleBlock(BlockRegistry.BUDDING_DEEPSLATE_DIAMOND.get());
        simpleBlock(BlockRegistry.BUDDING_SCULK_LAPIS.get());
        simpleBlock(BlockRegistry.BUDDING_SCULK_REDSTONE.get());
        simpleBlock(BlockRegistry.BUDDING_SCULK_EMERALD.get());
        simpleBlock(BlockRegistry.BUDDING_SCULK_DIAMOND.get());
        simpleBlock(BlockRegistry.BUDDING_PRISMARINE.get());
        simpleBlock(BlockRegistry.BUDDING_CELESTITE.get());
        simpleBlock(BlockRegistry.CELESTITE_BLOCK.get());
        simpleBlock(BlockRegistry.BUDDING_PINK_TOPAZ.get());
        simpleBlock(BlockRegistry.PINK_TOPAZ_BLOCK.get());
        simpleBlock(BlockRegistry.ECHO_CRYSTAL_BLOCK.get());

        simpleBlock(BlockRegistry.WRAPPIST_GLASS.get(), models().cubeAll(getName(BlockRegistry.WRAPPIST_GLASS), blockLoc(BlockRegistry.WRAPPIST_GLASS)).renderType("cutout"));
        simpleBlock(BlockRegistry.CELESTITE_GLASS.get(), models().cubeAll(getName(BlockRegistry.CELESTITE_GLASS), blockLoc(BlockRegistry.CELESTITE_GLASS)).renderType("cutout"));
        simpleBlock(BlockRegistry.PINK_TOPAZ_GLASS.get(), models().cubeAll(getName(BlockRegistry.PINK_TOPAZ_GLASS), blockLoc(BlockRegistry.PINK_TOPAZ_GLASS)).renderType("cutout"));

        stairsBlock(BlockRegistry.SMOOTH_END_STONE_STAIRS.get(), blockLoc(BlockRegistry.SMOOTH_END_STONE));
        wallBlock(BlockRegistry.SMOOTH_END_STONE_WALL, blockLoc(BlockRegistry.SMOOTH_END_STONE));
        slabBlock(BlockRegistry.SMOOTH_END_STONE_SLAB.get(), blockLoc(BlockRegistry.SMOOTH_END_STONE),
                blockLoc(BlockRegistry.SMOOTH_END_STONE));

        directionalBlock(BlockRegistry.ECHO_CRYSTAL.get(), models().cross(getName(BlockRegistry.ECHO_CRYSTAL), blockLoc(BlockRegistry.ECHO_CRYSTAL)).renderType("cutout"));
        directionalBlock(BlockRegistry.LARGE_ECHO_BUD.get(), models().cross(getName(BlockRegistry.LARGE_ECHO_BUD), blockLoc(BlockRegistry.LARGE_ECHO_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.MEDIUM_ECHO_BUD.get(), models().cross(getName(BlockRegistry.MEDIUM_ECHO_BUD), blockLoc(BlockRegistry.MEDIUM_ECHO_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.SMALL_ECHO_BUD.get(), models().cross(getName(BlockRegistry.SMALL_ECHO_BUD), blockLoc(BlockRegistry.SMALL_ECHO_BUD)).renderType("cutout"));

        directionalBlock(BlockRegistry.QUARTZ_CRYSTAL.get(), models().cross(getName(BlockRegistry.QUARTZ_CRYSTAL), blockLoc(BlockRegistry.QUARTZ_CRYSTAL)).renderType("cutout"));
        directionalBlock(BlockRegistry.LARGE_QUARTZ_BUD.get(), models().cross(getName(BlockRegistry.LARGE_QUARTZ_BUD), blockLoc(BlockRegistry.LARGE_QUARTZ_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.MEDIUM_QUARTZ_BUD.get(), models().cross(getName(BlockRegistry.MEDIUM_QUARTZ_BUD), blockLoc(BlockRegistry.MEDIUM_QUARTZ_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.SMALL_QUARTZ_BUD.get(), models().cross(getName(BlockRegistry.SMALL_QUARTZ_BUD), blockLoc(BlockRegistry.SMALL_QUARTZ_BUD)).renderType("cutout"));

        directionalBlock(BlockRegistry.GOLD_NUGGET_CLUSTER.get(), models().cross(getName(BlockRegistry.GOLD_NUGGET_CLUSTER), blockLoc(BlockRegistry.GOLD_NUGGET_CLUSTER)).renderType("cutout"));
        directionalBlock(BlockRegistry.LARGE_GOLD_NUGGET_BUD.get(), models().cross(getName(BlockRegistry.LARGE_GOLD_NUGGET_BUD), blockLoc(BlockRegistry.LARGE_GOLD_NUGGET_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.MEDIUM_GOLD_NUGGET_BUD.get(), models().cross(getName(BlockRegistry.MEDIUM_GOLD_NUGGET_BUD), blockLoc(BlockRegistry.MEDIUM_GOLD_NUGGET_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.SMALL_GOLD_NUGGET_BUD.get(), models().cross(getName(BlockRegistry.SMALL_GOLD_NUGGET_BUD), blockLoc(BlockRegistry.SMALL_GOLD_NUGGET_BUD)).renderType("cutout"));

        directionalBlock(BlockRegistry.WRAPPIST_CLUSTER.get(), models().cross(getName(BlockRegistry.WRAPPIST_CLUSTER), blockLoc(BlockRegistry.WRAPPIST_CLUSTER)).renderType("cutout"));
        directionalBlock(BlockRegistry.LARGE_WRAPPIST_BUD.get(), models().cross(getName(BlockRegistry.LARGE_WRAPPIST_BUD), blockLoc(BlockRegistry.LARGE_WRAPPIST_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.MEDIUM_WRAPPIST_BUD.get(), models().cross(getName(BlockRegistry.MEDIUM_WRAPPIST_BUD), blockLoc(BlockRegistry.MEDIUM_WRAPPIST_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.SMALL_WRAPPIST_BUD.get(), models().cross(getName(BlockRegistry.SMALL_WRAPPIST_BUD), blockLoc(BlockRegistry.SMALL_WRAPPIST_BUD)).renderType("cutout"));

        directionalBlock(BlockRegistry.GLOWSTONE_CLUSTER.get(), models().cross(getName(BlockRegistry.GLOWSTONE_CLUSTER), blockLoc(BlockRegistry.GLOWSTONE_CLUSTER)).renderType("cutout"));
        directionalBlock(BlockRegistry.LARGE_GLOWSTONE_BUD.get(), models().cross(getName(BlockRegistry.LARGE_GLOWSTONE_BUD), blockLoc(BlockRegistry.LARGE_GLOWSTONE_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.MEDIUM_GLOWSTONE_BUD.get(), models().cross(getName(BlockRegistry.MEDIUM_GLOWSTONE_BUD), blockLoc(BlockRegistry.MEDIUM_GLOWSTONE_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.SMALL_GLOWSTONE_BUD.get(), models().cross(getName(BlockRegistry.SMALL_GLOWSTONE_BUD), blockLoc(BlockRegistry.SMALL_GLOWSTONE_BUD)).renderType("cutout"));

        directionalBlock(BlockRegistry.ANCIENT_DEBRIS_CLUSTER.get(), models().cross(getName(BlockRegistry.ANCIENT_DEBRIS_CLUSTER), blockLoc(BlockRegistry.ANCIENT_DEBRIS_CLUSTER)).renderType("cutout"));
        directionalBlock(BlockRegistry.LARGE_ANCIENT_DEBRIS_BUD.get(), models().cross(getName(BlockRegistry.LARGE_ANCIENT_DEBRIS_BUD), blockLoc(BlockRegistry.LARGE_ANCIENT_DEBRIS_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.get(), models().cross(getName(BlockRegistry.MEDIUM_ANCIENT_DEBRIS_BUD), blockLoc(BlockRegistry.MEDIUM_ANCIENT_DEBRIS_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.SMALL_ANCIENT_DEBRIS_BUD.get(), models().cross(getName(BlockRegistry.SMALL_ANCIENT_DEBRIS_BUD), blockLoc(BlockRegistry.SMALL_ANCIENT_DEBRIS_BUD)).renderType("cutout"));

        directionalBlock(BlockRegistry.LAPIS_CLUSTER.get(), models().cross(getName(BlockRegistry.LAPIS_CLUSTER), blockLoc(BlockRegistry.LAPIS_CLUSTER)).renderType("cutout"));
        directionalBlock(BlockRegistry.LARGE_LAPIS_BUD.get(), models().cross(getName(BlockRegistry.LARGE_LAPIS_BUD), blockLoc(BlockRegistry.LARGE_LAPIS_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.MEDIUM_LAPIS_BUD.get(), models().cross(getName(BlockRegistry.MEDIUM_LAPIS_BUD), blockLoc(BlockRegistry.MEDIUM_LAPIS_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.SMALL_LAPIS_BUD.get(), models().cross(getName(BlockRegistry.SMALL_LAPIS_BUD), blockLoc(BlockRegistry.SMALL_LAPIS_BUD)).renderType("cutout"));

        directionalBlock(BlockRegistry.REDSTONE_CRYSTAL.get(), models().cross(getName(BlockRegistry.REDSTONE_CRYSTAL), blockLoc(BlockRegistry.REDSTONE_CRYSTAL)).renderType("cutout"));
        directionalBlock(BlockRegistry.LARGE_REDSTONE_BUD.get(), models().cross(getName(BlockRegistry.LARGE_REDSTONE_BUD), blockLoc(BlockRegistry.LARGE_REDSTONE_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.MEDIUM_REDSTONE_BUD.get(), models().cross(getName(BlockRegistry.MEDIUM_REDSTONE_BUD), blockLoc(BlockRegistry.MEDIUM_REDSTONE_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.SMALL_REDSTONE_BUD.get(), models().cross(getName(BlockRegistry.SMALL_REDSTONE_BUD), blockLoc(BlockRegistry.SMALL_REDSTONE_BUD)).renderType("cutout"));

        directionalBlock(BlockRegistry.EMERALD_CLUSTER.get(), models().cross(getName(BlockRegistry.EMERALD_CLUSTER), blockLoc(BlockRegistry.EMERALD_CLUSTER)).renderType("cutout"));
        directionalBlock(BlockRegistry.LARGE_EMERALD_BUD.get(), models().cross(getName(BlockRegistry.LARGE_EMERALD_BUD), blockLoc(BlockRegistry.LARGE_EMERALD_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.MEDIUM_EMERALD_BUD.get(), models().cross(getName(BlockRegistry.MEDIUM_EMERALD_BUD), blockLoc(BlockRegistry.MEDIUM_EMERALD_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.SMALL_EMERALD_BUD.get(), models().cross(getName(BlockRegistry.SMALL_EMERALD_BUD), blockLoc(BlockRegistry.SMALL_EMERALD_BUD)).renderType("cutout"));

        directionalBlock(BlockRegistry.DIAMOND_CRYSTAL.get(), models().cross(getName(BlockRegistry.DIAMOND_CRYSTAL), blockLoc(BlockRegistry.DIAMOND_CRYSTAL)).renderType("cutout"));
        directionalBlock(BlockRegistry.LARGE_DIAMOND_BUD.get(), models().cross(getName(BlockRegistry.LARGE_DIAMOND_BUD), blockLoc(BlockRegistry.LARGE_DIAMOND_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.MEDIUM_DIAMOND_BUD.get(), models().cross(getName(BlockRegistry.MEDIUM_DIAMOND_BUD), blockLoc(BlockRegistry.MEDIUM_DIAMOND_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.SMALL_DIAMOND_BUD.get(), models().cross(getName(BlockRegistry.SMALL_DIAMOND_BUD), blockLoc(BlockRegistry.SMALL_DIAMOND_BUD)).renderType("cutout"));

        directionalBlock(BlockRegistry.PRISMARINE_CLUSTER.get(), models().cross(getName(BlockRegistry.PRISMARINE_CLUSTER), blockLoc(BlockRegistry.PRISMARINE_CLUSTER)).renderType("cutout"));
        directionalBlock(BlockRegistry.LARGE_PRISMARINE_BUD.get(), models().cross(getName(BlockRegistry.LARGE_PRISMARINE_BUD), blockLoc(BlockRegistry.LARGE_PRISMARINE_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.MEDIUM_PRISMARINE_BUD.get(), models().cross(getName(BlockRegistry.MEDIUM_PRISMARINE_BUD), blockLoc(BlockRegistry.MEDIUM_PRISMARINE_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.SMALL_PRISMARINE_BUD.get(), models().cross(getName(BlockRegistry.SMALL_PRISMARINE_BUD), blockLoc(BlockRegistry.SMALL_PRISMARINE_BUD)).renderType("cutout"));

        directionalBlock(BlockRegistry.CELESTITE_CLUSTER.get(), models().cross(getName(BlockRegistry.CELESTITE_CLUSTER), blockLoc(BlockRegistry.CELESTITE_CLUSTER)).renderType("cutout"));
        directionalBlock(BlockRegistry.LARGE_CELESTITE_BUD.get(), models().cross(getName(BlockRegistry.LARGE_CELESTITE_BUD), blockLoc(BlockRegistry.LARGE_CELESTITE_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.MEDIUM_CELESTITE_BUD.get(), models().cross(getName(BlockRegistry.MEDIUM_CELESTITE_BUD), blockLoc(BlockRegistry.MEDIUM_CELESTITE_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.SMALL_CELESTITE_BUD.get(), models().cross(getName(BlockRegistry.SMALL_CELESTITE_BUD), blockLoc(BlockRegistry.SMALL_CELESTITE_BUD)).renderType("cutout"));

        directionalBlock(BlockRegistry.PINK_TOPAZ_CRYSTAL.get(), models().cross(getName(BlockRegistry.PINK_TOPAZ_CRYSTAL), blockLoc(BlockRegistry.PINK_TOPAZ_CRYSTAL)).renderType("cutout"));
        directionalBlock(BlockRegistry.LARGE_PINK_TOPAZ_BUD.get(), models().cross(getName(BlockRegistry.LARGE_PINK_TOPAZ_BUD), blockLoc(BlockRegistry.LARGE_PINK_TOPAZ_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.MEDIUM_PINK_TOPAZ_BUD.get(), models().cross(getName(BlockRegistry.MEDIUM_PINK_TOPAZ_BUD), blockLoc(BlockRegistry.MEDIUM_PINK_TOPAZ_BUD)).renderType("cutout"));
        directionalBlock(BlockRegistry.SMALL_PINK_TOPAZ_BUD.get(), models().cross(getName(BlockRegistry.SMALL_PINK_TOPAZ_BUD), blockLoc(BlockRegistry.SMALL_PINK_TOPAZ_BUD)).renderType("cutout"));
    }

    public void wallBlock(Supplier<WallBlock> block, ResourceLocation texture) {
        super.wallBlock(block.get(), texture);
        models().wallInventory(getName(block) + "_inventory", texture);
    }

    public String getName(Supplier<? extends Block> block) {
        return block.get().builtInRegistryHolder().key().location().getPath();
    }

    public ResourceLocation blockLoc(Supplier<? extends Block> block) {
        return new ResourceLocation(GeodePlus.MOD_ID, "block/" + getName(block));
    }


    public ResourceLocation blockLoc(Supplier<? extends Block> block, String suffix) {
        return new ResourceLocation(GeodePlus.MOD_ID, "block/" + getName(block) + "_" + suffix);
    }
}
