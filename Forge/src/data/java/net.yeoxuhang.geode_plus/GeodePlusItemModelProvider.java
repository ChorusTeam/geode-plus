package net.yeoxuhang.geode_plus;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.yeoxuhang.geode_plus.server.registry.BlockRegistry;
import net.yeoxuhang.geode_plus.server.registry.ItemRegistry;

import java.util.function.Supplier;

public class GeodePlusItemModelProvider extends ItemModelProvider {

    private final ModelFile GENERATED = getExistingFile(mcLoc("item/generated"));
    private final ModelFile HANDHELD = getExistingFile(mcLoc("item/handheld"));
    private final ModelFile GOAT_HORN = getExistingFile(mcLoc("item/goat_horn"));

    public GeodePlusItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, GeodePlus.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        itemModel(ItemRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE, GENERATED);
        itemModel(ItemRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE, GENERATED);
        itemModel(ItemRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE, GENERATED);

        itemModel(ItemRegistry.PINK_TOPAZ, GENERATED);
        itemModel(ItemRegistry.CELESTITE_SHARD, GENERATED);
        itemModel(ItemRegistry.WRAPPIST_SHARD, GENERATED);
        //itemModel(GeodePlusItemsRegistry.WRAPPIST_GOAT_HORN, GOAT_HORN);
        singleLayerBlockModel(BlockRegistry.DIAMOND_CRYSTAL, GENERATED);
        singleLayerBlockModel(BlockRegistry.SMALL_DIAMOND_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.MEDIUM_DIAMOND_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.LARGE_DIAMOND_BUD, GENERATED);

        singleLayerBlockModel(BlockRegistry.EMERALD_CLUSTER, GENERATED);
        singleLayerBlockModel(BlockRegistry.SMALL_EMERALD_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.MEDIUM_EMERALD_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.LARGE_EMERALD_BUD, GENERATED);

        singleLayerBlockModel(BlockRegistry.LAPIS_CLUSTER, GENERATED);
        singleLayerBlockModel(BlockRegistry.SMALL_LAPIS_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.MEDIUM_LAPIS_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.LARGE_LAPIS_BUD, GENERATED);

        singleLayerBlockModel(BlockRegistry.REDSTONE_CRYSTAL, GENERATED);
        singleLayerBlockModel(BlockRegistry.SMALL_REDSTONE_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.MEDIUM_REDSTONE_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.LARGE_REDSTONE_BUD, GENERATED);

        singleLayerBlockModel(BlockRegistry.ECHO_CRYSTAL, GENERATED);
        singleLayerBlockModel(BlockRegistry.SMALL_ECHO_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.MEDIUM_ECHO_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.LARGE_ECHO_BUD, GENERATED);

        singleLayerBlockModel(BlockRegistry.GLOWSTONE_CLUSTER, GENERATED);
        singleLayerBlockModel(BlockRegistry.SMALL_GLOWSTONE_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.MEDIUM_GLOWSTONE_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.LARGE_GLOWSTONE_BUD, GENERATED);

        singleLayerBlockModel(BlockRegistry.ANCIENT_DEBRIS_CLUSTER, GENERATED);
        singleLayerBlockModel(BlockRegistry.SMALL_ANCIENT_DEBRIS_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.MEDIUM_ANCIENT_DEBRIS_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.LARGE_ANCIENT_DEBRIS_BUD, GENERATED);

        singleLayerBlockModel(BlockRegistry.GOLD_NUGGET_CLUSTER, GENERATED);
        singleLayerBlockModel(BlockRegistry.SMALL_GOLD_NUGGET_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.MEDIUM_GOLD_NUGGET_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.LARGE_GOLD_NUGGET_BUD, GENERATED);

        singleLayerBlockModel(BlockRegistry.GOLD_NUGGET_CLUSTER, GENERATED);
        singleLayerBlockModel(BlockRegistry.SMALL_GOLD_NUGGET_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.MEDIUM_GOLD_NUGGET_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.LARGE_GOLD_NUGGET_BUD, GENERATED);

        singleLayerBlockModel(BlockRegistry.WRAPPIST_CLUSTER, GENERATED);
        singleLayerBlockModel(BlockRegistry.SMALL_WRAPPIST_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.MEDIUM_WRAPPIST_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.LARGE_WRAPPIST_BUD, GENERATED);

        singleLayerBlockModel(BlockRegistry.QUARTZ_CRYSTAL, GENERATED);
        singleLayerBlockModel(BlockRegistry.SMALL_QUARTZ_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.MEDIUM_QUARTZ_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.LARGE_QUARTZ_BUD, GENERATED);

        singleLayerBlockModel(BlockRegistry.PRISMARINE_CLUSTER, GENERATED);
        singleLayerBlockModel(BlockRegistry.SMALL_PRISMARINE_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.MEDIUM_PRISMARINE_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.LARGE_PRISMARINE_BUD, GENERATED);

        singleLayerBlockModel(BlockRegistry.CELESTITE_CLUSTER, GENERATED);
        singleLayerBlockModel(BlockRegistry.SMALL_CELESTITE_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.MEDIUM_CELESTITE_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.LARGE_CELESTITE_BUD, GENERATED);

        singleLayerBlockModel(BlockRegistry.PINK_TOPAZ_CRYSTAL, GENERATED);
        singleLayerBlockModel(BlockRegistry.SMALL_PINK_TOPAZ_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.MEDIUM_PINK_TOPAZ_BUD, GENERATED);
        singleLayerBlockModel(BlockRegistry.LARGE_PINK_TOPAZ_BUD, GENERATED);

        blockModel(BlockRegistry.WRAPPIST_GLASS);
        blockModel(BlockRegistry.CELESTITE_GLASS);
        blockModel(BlockRegistry.PINK_TOPAZ_GLASS);

        blockModel(BlockRegistry.BUDDING_PINK_TOPAZ);
        blockModel(BlockRegistry.PINK_TOPAZ_BLOCK);

        blockModel(BlockRegistry.BUDDING_CELESTITE);
        blockModel(BlockRegistry.CELESTITE_BLOCK);

        blockModel(BlockRegistry.BUDDING_PRISMARINE);
        blockModel(BlockRegistry.PRISMARINE_CLUSTER_BLOCK);

        blockModel(BlockRegistry.BUDDING_LAPIS);
        blockModel(BlockRegistry.BUDDING_DEEPSLATE_LAPIS);
        blockModel(BlockRegistry.BUDDING_SCULK_LAPIS);
        blockModel(BlockRegistry.LAPIS_CLUSTER_BLOCK);

        blockModel(BlockRegistry.BUDDING_REDSTONE);
        blockModel(BlockRegistry.BUDDING_DEEPSLATE_REDSTONE);
        blockModel(BlockRegistry.BUDDING_SCULK_REDSTONE);
        blockModel(BlockRegistry.REDSTONE_CRYSTAL_BLOCK);

        blockModel(BlockRegistry.BUDDING_EMERALD);
        blockModel(BlockRegistry.EMERALD_CLUSTER_BLOCK);
        blockModel(BlockRegistry.BUDDING_DEEPSLATE_EMERALD);
        blockModel(BlockRegistry.BUDDING_SCULK_EMERALD);

        blockModel(BlockRegistry.BUDDING_DIAMOND);
        blockModel(BlockRegistry.BUDDING_DEEPSLATE_DIAMOND);
        blockModel(BlockRegistry.BUDDING_SCULK_DIAMOND);
        blockModel(BlockRegistry.DIAMOND_CRYSTAL_BLOCK);

        blockModel(BlockRegistry.BUDDING_NETHER_QUARTZ);
        blockModel(BlockRegistry.BUDDING_BASALT_QUARTZ);
        blockModel(BlockRegistry.BUDDING_BLACKSTONE_QUARTZ);
        blockModel(BlockRegistry.QUARTZ_CRYSTAL_BLOCK);

        blockModel(BlockRegistry.BUDDING_GOLD_NUGGET);
        blockModel(BlockRegistry.BUDDING_BASALT_GOLD_NUGGET);
        blockModel(BlockRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET);
        blockModel(BlockRegistry.GOLD_NUGGET_CLUSTER_BLOCK);

        blockModel(BlockRegistry.BUDDING_GLOWSTONE);
        blockModel(BlockRegistry.BUDDING_BASALT_GLOWSTONE);
        blockModel(BlockRegistry.BUDDING_BLACKSTONE_GLOWSTONE);
        blockModel(BlockRegistry.GLOWSTONE_CLUSTER_BLOCK);

        blockModel(BlockRegistry.BUDDING_ANCIENT_DEBRIS);
        blockModel(BlockRegistry.BUDDING_BASALT_ANCIENT_DEBRIS);
        blockModel(BlockRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS);
        blockModel(BlockRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK);

        blockModel(BlockRegistry.SMOOTH_END_STONE);
        blockModel(BlockRegistry.SMOOTH_END_STONE_STAIRS);
        blockModel(BlockRegistry.SMOOTH_END_STONE_SLAB);
        blockModel(BlockRegistry.SMOOTH_END_STONE_WALL, "inventory");

        blockModel(BlockRegistry.GALCITE);
        blockModel(BlockRegistry.GALCITE_STAIRS);
        blockModel(BlockRegistry.GALCITE_SLAB);
        blockModel(BlockRegistry.GALCITE_WALL, "inventory");

        blockModel(BlockRegistry.WRAPPIST_BLOCK);
        blockModel(BlockRegistry.BUDDING_WRAPPIST);

        blockModel(BlockRegistry.ECHO_CRYSTAL_BLOCK);
        blockModel(BlockRegistry.BUDDING_ECHO);
    }

    public void blockModel(Supplier<? extends Block> block) {
        withExistingParent(getName(block.get()), modLoc("block/" + getName(block.get())));
    }

    public String getName(Block block) {
        return block.builtInRegistryHolder().key().location().getPath();
    }

    public String getName(Supplier<? extends Item> item) {
        return item.get().builtInRegistryHolder().key().location().getPath();
    }

    public void blockModel(Supplier<? extends Block> block, String suffix) {
        withExistingParent(getName(block.get()), modLoc("block/" + getName(block.get()) + "_" + suffix));
    }

    public void itemModel(Supplier<? extends Item> item, ModelFile modelFile) {
        getBuilder(getName(item)).parent(modelFile).texture("layer0", "item/" + getName(item));
    }

    public void singleLayerBlockModel(Supplier<? extends Block> block, ModelFile modelFile) {
        getBuilder(getName(block.get())).parent(modelFile).texture("layer0", "block/" + getName(block.get()));
    }
}
