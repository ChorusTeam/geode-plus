package net.yeoxuhang.geode_plus;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.*;
import net.minecraft.world.level.storage.loot.predicates.*;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.yeoxuhang.geode_plus.server.registry.BlockRegistry;
import net.yeoxuhang.geode_plus.server.registry.ItemRegistry;
import net.yeoxuhang.geode_plus.reg.RegistryObject;

import java.util.Set;

public class GeodePlusBlockLootTableProvider extends BlockLootSubProvider {

    public GeodePlusBlockLootTableProvider() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(BlockRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK.get());
        dropSelf(BlockRegistry.DIAMOND_CRYSTAL_BLOCK.get());
        dropSelf(BlockRegistry.EMERALD_CLUSTER_BLOCK.get());
        dropSelf(BlockRegistry.LAPIS_CLUSTER_BLOCK.get());
        dropSelf(BlockRegistry.REDSTONE_CRYSTAL_BLOCK.get());
        dropSelf(BlockRegistry.CELESTITE_BLOCK.get());
        dropSelf(BlockRegistry.PINK_TOPAZ_BLOCK.get());
        dropSelf(BlockRegistry.GALCITE.get());
        dropSelf(BlockRegistry.WRAPPIST_BLOCK.get());
        dropSelf(BlockRegistry.WRAPPIST_PEDESTAL.get());
        dropSelf(BlockRegistry.QUARTZ_CRYSTAL_BLOCK.get());
        dropSelf(BlockRegistry.GOLD_NUGGET_CLUSTER_BLOCK.get());
        dropSelf(BlockRegistry.GLOWSTONE_CLUSTER_BLOCK.get());
        dropSelf(BlockRegistry.PRISMARINE_CLUSTER_BLOCK.get());
        dropSelf(BlockRegistry.ECHO_CRYSTAL_BLOCK.get());
        add(BlockRegistry.SMOOTH_END_STONE.get(), (arg) -> createSingleItemTableWithSilkTouch(arg, Blocks.END_STONE));
        dropSelf(BlockRegistry.SMOOTH_END_STONE_STAIRS.get());
        dropSelf(BlockRegistry.SMOOTH_END_STONE_WALL.get());
        dropSelf(BlockRegistry.GALCITE_STAIRS.get());
        dropSelf(BlockRegistry.GALCITE_WALL.get());
        add(BlockRegistry.ECHO_CRYSTAL.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.ECHO_SHARD)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.ECHO_SHARD)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
        add(BlockRegistry.GOLD_NUGGET_CLUSTER.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.GOLD_NUGGET)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.GOLD_NUGGET)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
        add(BlockRegistry.QUARTZ_CRYSTAL.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.QUARTZ)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.QUARTZ)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(3.0F)))))));
        add(BlockRegistry.WRAPPIST_CLUSTER.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(ItemRegistry.WRAPPIST_SHARD.get())
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(ItemRegistry.WRAPPIST_SHARD.get())
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))))));
        add(BlockRegistry.GLOWSTONE_CLUSTER.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.GLOWSTONE_DUST)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(3F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.GLOWSTONE_DUST)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
        add(BlockRegistry.LAPIS_CLUSTER.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.LAPIS_LAZULI)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(3F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.LAPIS_LAZULI)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))))));
        add(BlockRegistry.REDSTONE_CRYSTAL.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.REDSTONE)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(6F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.REDSTONE)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(3.0F)))))));
        add(BlockRegistry.EMERALD_CLUSTER.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.EMERALD)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.EMERALD)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))))));
        add(BlockRegistry.DIAMOND_CRYSTAL.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.DIAMOND)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.DIAMOND)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))))));

        add(BlockRegistry.ANCIENT_DEBRIS_CLUSTER.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.NETHERITE_SCRAP)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.NETHERITE_SCRAP)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))))));
        add(BlockRegistry.PRISMARINE_CLUSTER.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(Items.PRISMARINE_SHARD)
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(Items.PRISMARINE_SHARD)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))))));
        add(BlockRegistry.CELESTITE_CLUSTER.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(ItemRegistry.CELESTITE_SHARD.get())
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(ItemRegistry.CELESTITE_SHARD.get())
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));
        add(BlockRegistry.PINK_TOPAZ_CRYSTAL.get(),
                (arg) -> createSilkTouchDispatchTable(arg,
                        LootItem.lootTableItem(ItemRegistry.PINK_TOPAZ.get())
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                                .when(MatchTool.toolMatches(net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                                        .of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                                .otherwise(applyExplosionDecay(arg, LootItem.lootTableItem(ItemRegistry.PINK_TOPAZ.get())
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F)))))));


        dropWhenSilkTouch(BlockRegistry.LARGE_QUARTZ_BUD.get());
        dropWhenSilkTouch(BlockRegistry.LARGE_ECHO_BUD.get());
        dropWhenSilkTouch(BlockRegistry.LARGE_GLOWSTONE_BUD.get());
        dropWhenSilkTouch(BlockRegistry.LARGE_WRAPPIST_BUD.get());
        dropWhenSilkTouch(BlockRegistry.LARGE_GOLD_NUGGET_BUD.get());
        dropWhenSilkTouch(BlockRegistry.LARGE_LAPIS_BUD.get());
        dropWhenSilkTouch(BlockRegistry.LARGE_REDSTONE_BUD.get());
        dropWhenSilkTouch(BlockRegistry.LARGE_EMERALD_BUD.get());
        dropWhenSilkTouch(BlockRegistry.LARGE_DIAMOND_BUD.get());
        dropWhenSilkTouch(BlockRegistry.LARGE_ANCIENT_DEBRIS_BUD.get());
        dropWhenSilkTouch(BlockRegistry.LARGE_PRISMARINE_BUD.get());
        dropWhenSilkTouch(BlockRegistry.LARGE_CELESTITE_BUD.get());
        dropWhenSilkTouch(BlockRegistry.LARGE_PINK_TOPAZ_BUD.get());

        dropWhenSilkTouch(BlockRegistry.MEDIUM_QUARTZ_BUD.get());
        dropWhenSilkTouch(BlockRegistry.MEDIUM_ECHO_BUD.get());
        dropWhenSilkTouch(BlockRegistry.MEDIUM_GLOWSTONE_BUD.get());
        dropWhenSilkTouch(BlockRegistry.MEDIUM_WRAPPIST_BUD.get());
        dropWhenSilkTouch(BlockRegistry.MEDIUM_GOLD_NUGGET_BUD.get());
        dropWhenSilkTouch(BlockRegistry.MEDIUM_LAPIS_BUD.get());
        dropWhenSilkTouch(BlockRegistry.MEDIUM_REDSTONE_BUD.get());
        dropWhenSilkTouch(BlockRegistry.MEDIUM_EMERALD_BUD.get());
        dropWhenSilkTouch(BlockRegistry.MEDIUM_DIAMOND_BUD.get());
        dropWhenSilkTouch(BlockRegistry.MEDIUM_ANCIENT_DEBRIS_BUD.get());
        dropWhenSilkTouch(BlockRegistry.MEDIUM_PRISMARINE_BUD.get());
        dropWhenSilkTouch(BlockRegistry.MEDIUM_CELESTITE_BUD.get());
        dropWhenSilkTouch(BlockRegistry.MEDIUM_PINK_TOPAZ_BUD.get());

        dropWhenSilkTouch(BlockRegistry.SMALL_QUARTZ_BUD.get());
        dropWhenSilkTouch(BlockRegistry.SMALL_ECHO_BUD.get());
        dropWhenSilkTouch(BlockRegistry.SMALL_GLOWSTONE_BUD.get());
        dropWhenSilkTouch(BlockRegistry.SMALL_WRAPPIST_BUD.get());
        dropWhenSilkTouch(BlockRegistry.SMALL_GOLD_NUGGET_BUD.get());
        dropWhenSilkTouch(BlockRegistry.SMALL_LAPIS_BUD.get());
        dropWhenSilkTouch(BlockRegistry.SMALL_REDSTONE_BUD.get());
        dropWhenSilkTouch(BlockRegistry.SMALL_EMERALD_BUD.get());
        dropWhenSilkTouch(BlockRegistry.SMALL_DIAMOND_BUD.get());
        dropWhenSilkTouch(BlockRegistry.SMALL_ANCIENT_DEBRIS_BUD.get());
        dropWhenSilkTouch(BlockRegistry.SMALL_PRISMARINE_BUD.get());
        dropWhenSilkTouch(BlockRegistry.SMALL_CELESTITE_BUD.get());
        dropWhenSilkTouch(BlockRegistry.SMALL_PINK_TOPAZ_BUD.get());

        add(BlockRegistry.BUDDING_BASALT_QUARTZ.get(), noDrop());
        add(BlockRegistry.BUDDING_BLACKSTONE_QUARTZ.get(), noDrop());
        add(BlockRegistry.BUDDING_BLACKSTONE_GLOWSTONE.get(), noDrop());
        add(BlockRegistry.BUDDING_ECHO.get(), noDrop());
        add(BlockRegistry.BUDDING_BASALT_GLOWSTONE.get(), noDrop());
        add(BlockRegistry.BUDDING_GLOWSTONE.get(), noDrop());
        add(BlockRegistry.BUDDING_NETHER_QUARTZ.get(), noDrop());
        add(BlockRegistry.BUDDING_WRAPPIST.get(), noDrop());
        add(BlockRegistry.BUDDING_GOLD_NUGGET.get(), noDrop());
        add(BlockRegistry.BUDDING_BASALT_GOLD_NUGGET.get(), noDrop());
        add(BlockRegistry.BUDDING_BLACKSTONE_GOLD_NUGGET.get(), noDrop());
        add(BlockRegistry.BUDDING_LAPIS.get(), noDrop());
        add(BlockRegistry.BUDDING_REDSTONE.get(), noDrop());
        add(BlockRegistry.BUDDING_EMERALD.get(), noDrop());
        add(BlockRegistry.BUDDING_DIAMOND.get(), noDrop());
        add(BlockRegistry.BUDDING_DEEPSLATE_LAPIS.get(), noDrop());
        add(BlockRegistry.BUDDING_DEEPSLATE_REDSTONE.get(), noDrop());
        add(BlockRegistry.BUDDING_DEEPSLATE_EMERALD.get(), noDrop());
        add(BlockRegistry.BUDDING_DEEPSLATE_DIAMOND.get(), noDrop());
        add(BlockRegistry.BUDDING_SCULK_LAPIS.get(), noDrop());
        add(BlockRegistry.BUDDING_SCULK_REDSTONE.get(), noDrop());
        add(BlockRegistry.BUDDING_SCULK_EMERALD.get(), noDrop());
        add(BlockRegistry.BUDDING_SCULK_DIAMOND.get(), noDrop());
        add(BlockRegistry.BUDDING_ANCIENT_DEBRIS.get(), noDrop());
        add(BlockRegistry.BUDDING_BASALT_ANCIENT_DEBRIS.get(), noDrop());
        add(BlockRegistry.BUDDING_BLACKSTONE_ANCIENT_DEBRIS.get(), noDrop());
        add(BlockRegistry.BUDDING_PRISMARINE.get(), noDrop());
        add(BlockRegistry.BUDDING_CELESTITE.get(), noDrop());
        add(BlockRegistry.BUDDING_PINK_TOPAZ.get(), noDrop());
        registerSlab(BlockRegistry.SMOOTH_END_STONE_SLAB.get());
        registerSlab(BlockRegistry.GALCITE_SLAB.get());

        dropWhenSilkTouch(BlockRegistry.WRAPPIST_GLASS.get());
        dropWhenSilkTouch(BlockRegistry.CELESTITE_GLASS.get());
        dropWhenSilkTouch(BlockRegistry.PINK_TOPAZ_GLASS.get());
    }

    private void registerSlab(Block b) {
        add(b, createSlabItemTable(b));
    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockRegistry.BLOCK.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}


