package net.yeoxuhang.geode_plus.server.registry;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.yeoxuhang.geode_plus.GeodePlus;
import net.yeoxuhang.geode_plus.reg.RegistrationProvider;
import net.yeoxuhang.geode_plus.reg.RegistryObject;

import java.util.function.Supplier;

public class ItemRegistry {
    public static final RegistrationProvider<Item> ITEM = RegistrationProvider.get(BuiltInRegistries.ITEM, GeodePlus.MOD_ID);

    public static final RegistryObject<Item> WRAP_ARMOR_TRIM_SMITHING_TEMPLATE = createItem("wrap_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(TrimMaterialsAndPatternsRegistry.WRAP));
    public static final RegistryObject<Item> CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE = createItem("celeste_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(TrimMaterialsAndPatternsRegistry.CELESTE));
    public static final RegistryObject<Item> HEART_ARMOR_TRIM_SMITHING_TEMPLATE = createItem("heart_armor_trim_smithing_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(TrimMaterialsAndPatternsRegistry.HEART));


    public static final RegistryObject<Item> PINK_TOPAZ = createItem("pink_topaz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CELESTITE_SHARD = createItem("celestite_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WRAPPIST_SHARD =createItem("wrappist_shard",
            () -> new Item(new Item.Properties()));

    /*public static final Supplier<WrappistGoatHornItem> WRAPPIST_GOAT_HORN = createItem("wrappist_goat_horn",
            () -> new WrappistGoatHornItem(new Item.Properties().stacksTo(1)));*/

    public static final RegistryObject<Item> WRAPPIST_GLASS = createItem(BlockRegistry.WRAPPIST_GLASS);
    public static final RegistryObject<Item> CELESTITE_GLASS = createItem(BlockRegistry.CELESTITE_GLASS);
    public static final RegistryObject<Item> PINK_TOPAZ_GLASS = createItem(BlockRegistry.PINK_TOPAZ_GLASS);

    public static final RegistryObject<Item> WRAPPIST_PEDESTAL = createItem(BlockRegistry.WRAPPIST_PEDESTAL);
    public static final RegistryObject<Item> WRAPPIST_BLOCK = createItem(BlockRegistry.WRAPPIST_BLOCK);
    public static final RegistryObject<Item> BUDDING_WRAPPIST = createItem(BlockRegistry.BUDDING_WRAPPIST);
    public static final RegistryObject<Item> WRAPPIST_CLUSTER = createItem(BlockRegistry.WRAPPIST_CLUSTER);
    public static final RegistryObject<Item> LARGE_WRAPPIST_BUD = createItem(BlockRegistry.LARGE_WRAPPIST_BUD);
    public static final RegistryObject<Item> MEDIUM_WRAPPIST_BUD = createItem(BlockRegistry.MEDIUM_WRAPPIST_BUD);
    public static final RegistryObject<Item> SMALL_WRAPPIST_BUD = createItem(BlockRegistry.SMALL_WRAPPIST_BUD);

    public static final RegistryObject<Item> CELESTITE_BLOCK = createItem(BlockRegistry.CELESTITE_BLOCK);
    public static final RegistryObject<Item> BUDDING_CELESTITE = createItem(BlockRegistry.BUDDING_CELESTITE);
    public static final RegistryObject<Item> CELESTITE_CLUSTER = createItem(BlockRegistry.CELESTITE_CLUSTER);
    public static final RegistryObject<Item> LARGE_CELESTITE_BUD = createItem(BlockRegistry.LARGE_CELESTITE_BUD);
    public static final RegistryObject<Item> MEDIUM_CELESTITE_BUD = createItem(BlockRegistry.MEDIUM_CELESTITE_BUD);
    public static final RegistryObject<Item> SMALL_CELESTITE_BUD = createItem(BlockRegistry.SMALL_CELESTITE_BUD);

    public static final RegistryObject<Item> PINK_TOPAZ_BLOCK = createItem(BlockRegistry.PINK_TOPAZ_BLOCK);
    public static final RegistryObject<Item> BUDDING_PINK_TOPAZ = createItem(BlockRegistry.BUDDING_PINK_TOPAZ);
    public static final RegistryObject<Item> PINK_TOPAZ_CRYSTAL = createItem(BlockRegistry.PINK_TOPAZ_CRYSTAL);
    public static final RegistryObject<Item> LARGE_PINK_TOPAZ_BUD = createItem(BlockRegistry.LARGE_PINK_TOPAZ_BUD);
    public static final RegistryObject<Item> MEDIUM_PINK_TOPAZ_BUD = createItem(BlockRegistry.MEDIUM_PINK_TOPAZ_BUD);
    public static final RegistryObject<Item> SMALL_PINK_TOPAZ_BUD = createItem(BlockRegistry.SMALL_PINK_TOPAZ_BUD);

    public static final RegistryObject<Item> PRISMARINE_CLUSTER_BLOCK = createItem(BlockRegistry.PRISMARINE_CLUSTER_BLOCK);
    public static final RegistryObject<Item> BUDDING_PRISMARINE = createItem(BlockRegistry.BUDDING_PRISMARINE);
    public static final RegistryObject<Item> PRISMARINE_CLUSTER = createItem(BlockRegistry.PRISMARINE_CLUSTER);
    public static final RegistryObject<Item> LARGE_PRISMARINE_BUD = createItem(BlockRegistry.LARGE_PRISMARINE_BUD);
    public static final RegistryObject<Item> MEDIUM_PRISMARINE_BUD = createItem(BlockRegistry.MEDIUM_PRISMARINE_BUD);
    public static final RegistryObject<Item> SMALL_PRISMARINE_BUD = createItem(BlockRegistry.SMALL_PRISMARINE_BUD);

    public static final RegistryObject<Item> LAPIS_CLUSTER_BLOCK = createItem(BlockRegistry.LAPIS_CLUSTER_BLOCK);
    public static final RegistryObject<Item> BUDDING_LAPIS = createItem(BlockRegistry.BUDDING_LAPIS);
    public static final RegistryObject<Item> BUDDING_DEEPSLATE_LAPIS = createItem(BlockRegistry.BUDDING_DEEPSLATE_LAPIS);
    public static final RegistryObject<Item> BUDDING_SCULK_LAPIS = createItem(BlockRegistry.BUDDING_SCULK_LAPIS);
    public static final RegistryObject<Item> LAPIS_CLUSTER = createItem(BlockRegistry.LAPIS_CLUSTER);
    public static final RegistryObject<Item> LARGE_LAPIS_BUD = createItem(BlockRegistry.LARGE_LAPIS_BUD);
    public static final RegistryObject<Item> MEDIUM_LAPIS_BUD = createItem(BlockRegistry.MEDIUM_LAPIS_BUD);
    public static final RegistryObject<Item> SMALL_LAPIS_BUD = createItem(BlockRegistry.SMALL_LAPIS_BUD);

    public static final RegistryObject<Item> REDSTONE_CRYSTAL_BLOCK = createItem(BlockRegistry.REDSTONE_CRYSTAL_BLOCK);
    public static final RegistryObject<Item> BUDDING_REDSTONE = createItem(BlockRegistry.BUDDING_REDSTONE);
    public static final RegistryObject<Item> BUDDING_DEEPSLATE_REDSTONE = createItem(BlockRegistry.BUDDING_DEEPSLATE_REDSTONE);
    public static final RegistryObject<Item> BUDDING_SCULK_REDSTONE = createItem(BlockRegistry.BUDDING_SCULK_REDSTONE);
    public static final RegistryObject<Item> REDSTONE_CRYSTAL = createItem(BlockRegistry.REDSTONE_CRYSTAL);
    public static final RegistryObject<Item> LARGE_REDSTONE_BUD = createItem(BlockRegistry.LARGE_REDSTONE_BUD);
    public static final RegistryObject<Item> MEDIUM_REDSTONE_BUD = createItem(BlockRegistry.MEDIUM_REDSTONE_BUD);
    public static final RegistryObject<Item> SMALL_REDSTONE_BUD = createItem(BlockRegistry.SMALL_REDSTONE_BUD);

    public static final RegistryObject<Item> EMERALD_CLUSTER_BLOCK = createItem(BlockRegistry.EMERALD_CLUSTER_BLOCK);
    public static final RegistryObject<Item> BUDDING_EMERALD = createItem(BlockRegistry.BUDDING_EMERALD);
    public static final RegistryObject<Item> BUDDING_DEEPSLATE_EMERALD = createItem(BlockRegistry.BUDDING_DEEPSLATE_EMERALD);
    public static final RegistryObject<Item> BUDDING_SCULK_EMERALD = createItem(BlockRegistry.BUDDING_SCULK_EMERALD);
    public static final RegistryObject<Item> EMERALD_CLUSTER = createItem(BlockRegistry.EMERALD_CLUSTER);
    public static final RegistryObject<Item> LARGE_EMERALD_BUD = createItem(BlockRegistry.LARGE_EMERALD_BUD);
    public static final RegistryObject<Item> MEDIUM_EMERALD_BUD = createItem(BlockRegistry.MEDIUM_EMERALD_BUD);
    public static final RegistryObject<Item> SMALL_EMERALD_BUD = createItem(BlockRegistry.SMALL_EMERALD_BUD);

    public static final RegistryObject<Item> DIAMOND_CRYSTAL_BLOCK = createItem(BlockRegistry.DIAMOND_CRYSTAL_BLOCK);
    public static final RegistryObject<Item> BUDDING_DIAMOND = createItem(BlockRegistry.BUDDING_DIAMOND);
    public static final RegistryObject<Item> BUDDING_DEEPSLATE_DIAMOND = createItem(BlockRegistry.BUDDING_DEEPSLATE_DIAMOND);
    public static final RegistryObject<Item> BUDDING_SCULK_DIAMOND = createItem(BlockRegistry.BUDDING_SCULK_DIAMOND);
    public static final RegistryObject<Item> DIAMOND_CRYSTAL = createItem(BlockRegistry.DIAMOND_CRYSTAL);
    public static final RegistryObject<Item> LARGE_DIAMOND_BUD = createItem(BlockRegistry.LARGE_DIAMOND_BUD);
    public static final RegistryObject<Item> MEDIUM_DIAMOND_BUD = createItem(BlockRegistry.MEDIUM_DIAMOND_BUD);
    public static final RegistryObject<Item> SMALL_DIAMOND_BUD = createItem(BlockRegistry.SMALL_DIAMOND_BUD);

    public static final RegistryObject<Item> QUARTZ_CRYSTAL_BLOCK = createItem(BlockRegistry.QUARTZ_CRYSTAL_BLOCK);
    public static final RegistryObject<Item> BUDDING_NETHER_QUARTZ = createItem(BlockRegistry.BUDDING_NETHER_QUARTZ);
    public static final RegistryObject<Item> BUDDING_BASALT_QUARTZ = createItem(BlockRegistry.BUDDING_BASALT_QUARTZ);
    public static final RegistryObject<Item> BUDDING_BLACKSTONE_QUARTZ = createItem(BlockRegistry.BUDDING_BLACKSTONE_QUARTZ);
    public static final RegistryObject<Item> QUARTZ_CRYSTAL = createItem(BlockRegistry.QUARTZ_CRYSTAL);
    public static final RegistryObject<Item> LARGE_QUARTZ_BUD = createItem(BlockRegistry.LARGE_QUARTZ_BUD);
    public static final RegistryObject<Item> MEDIUM_QUARTZ_BUD = createItem(BlockRegistry.MEDIUM_QUARTZ_BUD);
    public static final RegistryObject<Item> SMALL_QUARTZ_BUD = createItem(BlockRegistry.SMALL_QUARTZ_BUD);

    public static final RegistryObject<Item> GOLD_NUGGET_CLUSTER_BLOCK = createItem(BlockRegistry.GOLD_NUGGET_CLUSTER_BLOCK);
    public static final RegistryObject<Item> BUDDING_GOLD_NUGGET = createItem(BlockRegistry.BUDDING_GOLD_NUGGET);
    public static final RegistryObject<Item> BUDDING_BASALT_GOLD_NUGGET = createItem(BlockRegistry.BUDDING_BASALT_GOLD_NUGGET);
    public static final RegistryObject<Item> BUDDING_BLACKSTONE_GOLD_NUGGET = createItem(BlockRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET);
    public static final RegistryObject<Item> GOLD_NUGGET_CLUSTER = createItem(BlockRegistry.GOLD_NUGGET_CLUSTER);
    public static final RegistryObject<Item> LARGE_GOLD_NUGGET_BUD = createItem(BlockRegistry.LARGE_GOLD_NUGGET_BUD);
    public static final RegistryObject<Item> MEDIUM_GOLD_NUGGET_BUD = createItem(BlockRegistry.MEDIUM_GOLD_NUGGET_BUD);
    public static final RegistryObject<Item> SMALL_GOLD_NUGGET_BUD = createItem(BlockRegistry.SMALL_GOLD_NUGGET_BUD);

    public static final RegistryObject<Item> GLOWSTONE_CLUSTER_BLOCK = createItem(BlockRegistry.GLOWSTONE_CLUSTER_BLOCK);
    public static final RegistryObject<Item> BUDDING_GLOWSTONE = createItem(BlockRegistry.BUDDING_GLOWSTONE);
    public static final RegistryObject<Item> BUDDING_BASALT_GLOWSTONE = createItem(BlockRegistry.BUDDING_BASALT_GLOWSTONE);
    public static final RegistryObject<Item> BUDDING_BLACKSTONE_GLOWSTONE = createItem(BlockRegistry.BUDDING_BLACKSTONE_GLOWSTONE);
    public static final RegistryObject<Item> GLOWSTONE_CLUSTER = createItem(BlockRegistry.GLOWSTONE_CLUSTER);
    public static final RegistryObject<Item> LARGE_GLOWSTONE_BUD = createItem(BlockRegistry.LARGE_GLOWSTONE_BUD);
    public static final RegistryObject<Item> MEDIUM_GLOWSTONE_BUD = createItem(BlockRegistry.MEDIUM_GLOWSTONE_BUD);
    public static final RegistryObject<Item> SMALL_GLOWSTONE_BUD = createItem(BlockRegistry.SMALL_GLOWSTONE_BUD);

    public static final RegistryObject<Item> ANCIENT_DEBRIS_CLUSTER_BLOCK = createItem(BlockRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK);
    public static final RegistryObject<Item> BUDDING_ANCIENT_DEBRIS = createItem(BlockRegistry.BUDDING_ANCIENT_DEBRIS);
    public static final RegistryObject<Item> BUDDING_BASALT_ANCIENT_DEBRIS = createItem(BlockRegistry.BUDDING_BASALT_ANCIENT_DEBRIS);
    public static final RegistryObject<Item> BUDDING_BLACKSTONE_ANCIENT_DEBRIS = createItem(BlockRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS);
    public static final RegistryObject<Item> ANCIENT_DEBRIS_CLUSTER = createItem(BlockRegistry.ANCIENT_DEBRIS_CLUSTER);
    public static final RegistryObject<Item> LARGE_ANCIENT_DEBRIS_BUD = createItem(BlockRegistry.LARGE_ANCIENT_DEBRIS_BUD);
    public static final RegistryObject<Item> MEDIUM_ANCIENT_DEBRIS_BUD = createItem(BlockRegistry.MEDIUM_ANCIENT_DEBRIS_BUD);
    public static final RegistryObject<Item> SMALL_ANCIENT_DEBRIS_BUD = createItem(BlockRegistry.SMALL_ANCIENT_DEBRIS_BUD);

    public static final RegistryObject<Item> SMOOTH_END_STONE = createItem(BlockRegistry.SMOOTH_END_STONE);
    public static final RegistryObject<Item> SMOOTH_END_STONE_STAIRS = createItem(BlockRegistry.SMOOTH_END_STONE_STAIRS);
    public static final RegistryObject<Item> SMOOTH_END_STONE_SLAB = createItem(BlockRegistry.SMOOTH_END_STONE_SLAB);
    public static final RegistryObject<Item> SMOOTH_END_STONE_WALL = createItem(BlockRegistry.SMOOTH_END_STONE_WALL);

    public static final RegistryObject<Item> GALCITE = createItem(BlockRegistry.GALCITE);
    public static final RegistryObject<Item> GALCITE_STAIRS = createItem(BlockRegistry.GALCITE_STAIRS);
    public static final RegistryObject<Item> GALCITE_SLAB = createItem(BlockRegistry.GALCITE_SLAB);
    public static final RegistryObject<Item> GALCITE_WALL = createItem(BlockRegistry.GALCITE_WALL);

    public static final RegistryObject<Item> ECHO_CRYSTAL_BLOCK = createItem(BlockRegistry.ECHO_CRYSTAL_BLOCK);
    public static final RegistryObject<Item> BUDDING_ECHO = createItem(BlockRegistry.BUDDING_ECHO);
    public static final RegistryObject<Item> ECHO_CRYSTAL = createItem(BlockRegistry.ECHO_CRYSTAL);
    public static final RegistryObject<Item> LARGE_ECHO_BUD = createItem(BlockRegistry.LARGE_ECHO_BUD);
    public static final RegistryObject<Item> MEDIUM_ECHO_BUD = createItem(BlockRegistry.MEDIUM_ECHO_BUD);
    public static final RegistryObject<Item> SMALL_ECHO_BUD = createItem(BlockRegistry.SMALL_ECHO_BUD);


    public static RegistryObject<Item> createItem(RegistryObject<? extends Block> block) {
        return block == null ? null : createItem(() -> new BlockItem(block.get(), new Item.Properties()), block);
    }

    public static <T extends Item> RegistryObject<T> createItem(Supplier<? extends T> item, RegistryObject<? extends Block> block) {
        return createItem(block.getId().getPath(), item);
    }

    public static <T extends Item> RegistryObject<T> createItem(String id, Supplier<? extends T> item) {
        return ITEM.register(id, item);
    }
    
    public static void init() {}
}
