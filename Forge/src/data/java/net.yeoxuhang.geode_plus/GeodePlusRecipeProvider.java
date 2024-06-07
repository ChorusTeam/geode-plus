package net.yeoxuhang.geode_plus;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.yeoxuhang.geode_plus.server.registry.ItemRegistry;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GeodePlusRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public GeodePlusRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> save) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.GUNPOWDER, 4).requires(ItemRegistry.CELESTITE_SHARD.get()).unlockedBy("has_celestite", has(ItemRegistry.CELESTITE_SHARD.get())).save(save);
        crystalGlassFromGlassAndCrystal(save, ItemRegistry.WRAPPIST_GLASS.get(), ItemRegistry.WRAPPIST_SHARD.get());
        crystalGlassFromGlassAndCrystal(save, ItemRegistry.CELESTITE_GLASS.get(), ItemRegistry.CELESTITE_SHARD.get());
        crystalGlassFromGlassAndCrystal(save, ItemRegistry.PINK_TOPAZ_GLASS.get(), ItemRegistry.PINK_TOPAZ.get());

        crystalsFromCrystalsBlocks(save, ItemRegistry.WRAPPIST_SHARD.get(), ItemRegistry.WRAPPIST_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, ItemRegistry.PINK_TOPAZ.get(), ItemRegistry.PINK_TOPAZ_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, ItemRegistry.CELESTITE_SHARD.get(), ItemRegistry.CELESTITE_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, Items.DIAMOND, ItemRegistry.DIAMOND_CRYSTAL_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, Items.EMERALD, ItemRegistry.EMERALD_CLUSTER_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, Items.LAPIS_LAZULI, ItemRegistry.LAPIS_CLUSTER_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, Items.REDSTONE, ItemRegistry.REDSTONE_CRYSTAL_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, Items.GLOWSTONE_DUST, ItemRegistry.GLOWSTONE_CLUSTER_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, Items.PRISMARINE_SHARD, ItemRegistry.PRISMARINE_CLUSTER_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, Items.QUARTZ, ItemRegistry.QUARTZ_CRYSTAL_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, Items.NETHERITE_SCRAP, ItemRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, Items.GOLD_NUGGET, ItemRegistry.GOLD_NUGGET_CLUSTER_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, Items.ECHO_SHARD, ItemRegistry.ECHO_CRYSTAL_BLOCK.get(), 4);
        crystalsFromCrystalsBlocks(save, Items.AMETHYST_SHARD, Blocks.AMETHYST_BLOCK, 4);
        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, ItemRegistry.PINK_TOPAZ_BLOCK.get(), ItemRegistry.PINK_TOPAZ.get());
        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, ItemRegistry.CELESTITE_BLOCK.get(), ItemRegistry.CELESTITE_SHARD.get());
        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, ItemRegistry.ANCIENT_DEBRIS_CLUSTER_BLOCK.get(), ItemRegistry.ANCIENT_DEBRIS_CLUSTER.get());
        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, ItemRegistry.DIAMOND_CRYSTAL_BLOCK.get(), ItemRegistry.DIAMOND_CRYSTAL.get());
        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, ItemRegistry.EMERALD_CLUSTER_BLOCK.get(), ItemRegistry.EMERALD_CLUSTER.get());
        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, ItemRegistry.LAPIS_CLUSTER_BLOCK.get(), ItemRegistry.LAPIS_CLUSTER.get());
        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, ItemRegistry.REDSTONE_CRYSTAL_BLOCK.get(), ItemRegistry.REDSTONE_CRYSTAL.get());
        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, ItemRegistry.ECHO_CRYSTAL_BLOCK.get(), ItemRegistry.ECHO_CRYSTAL.get());

        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, ItemRegistry.WRAPPIST_BLOCK.get(), ItemRegistry.WRAPPIST_SHARD.get());
        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, ItemRegistry.GLOWSTONE_CLUSTER_BLOCK.get(), ItemRegistry.GLOWSTONE_CLUSTER.get());
        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, ItemRegistry.PRISMARINE_CLUSTER_BLOCK.get(), ItemRegistry.PRISMARINE_CLUSTER.get());
        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, ItemRegistry.GOLD_NUGGET_CLUSTER_BLOCK.get(), ItemRegistry.GOLD_NUGGET_CLUSTER.get());
        twoByTwoPacker(save, RecipeCategory.BUILDING_BLOCKS, ItemRegistry.QUARTZ_CRYSTAL_BLOCK.get(), ItemRegistry.QUARTZ_CRYSTAL.get());
        wall(save, RecipeCategory.BUILDING_BLOCKS, ItemRegistry.SMOOTH_END_STONE_WALL.get(), ItemRegistry.SMOOTH_END_STONE.get());
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.SMOOTH_END_STONE_SLAB.get(), Ingredient.of(ItemRegistry.SMOOTH_END_STONE.get())).unlockedBy("has_smooth_end_stone", has(ItemRegistry.SMOOTH_END_STONE.get())).save(save);
        stairBuilder(ItemRegistry.SMOOTH_END_STONE_STAIRS.get(), Ingredient.of(ItemRegistry.SMOOTH_END_STONE.get())).unlockedBy("has_smooth_end_stone", has(ItemRegistry.SMOOTH_END_STONE.get())).save(save);
        wall(save, RecipeCategory.BUILDING_BLOCKS, ItemRegistry.GALCITE_WALL.get(), ItemRegistry.GALCITE.get());
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.GALCITE_SLAB.get(), Ingredient.of(ItemRegistry.GALCITE.get())).unlockedBy("has_galcite", has(ItemRegistry.GALCITE.get())).save(save);
        stairBuilder(ItemRegistry.GALCITE_STAIRS.get(), Ingredient.of(ItemRegistry.GALCITE.get())).unlockedBy("has_galcite", has(ItemRegistry.SMOOTH_END_STONE.get())).save(save);

        stonecutterResultFromBase(save, RecipeCategory.BUILDING_BLOCKS, ItemRegistry.SMOOTH_END_STONE_STAIRS.get(), ItemRegistry.SMOOTH_END_STONE.get());
        stonecutterResultFromBase(save, RecipeCategory.BUILDING_BLOCKS, ItemRegistry.SMOOTH_END_STONE_SLAB.get(), ItemRegistry.SMOOTH_END_STONE.get(), 2);
        stonecutterResultFromBase(save, RecipeCategory.BUILDING_BLOCKS, ItemRegistry.SMOOTH_END_STONE_WALL.get(), ItemRegistry.SMOOTH_END_STONE.get());
        stonecutterResultFromBase(save, RecipeCategory.BUILDING_BLOCKS, ItemRegistry.GALCITE_STAIRS.get(), ItemRegistry.GALCITE.get());
        stonecutterResultFromBase(save, RecipeCategory.BUILDING_BLOCKS, ItemRegistry.GALCITE_SLAB.get(), ItemRegistry.GALCITE.get(), 2);
        stonecutterResultFromBase(save, RecipeCategory.BUILDING_BLOCKS, ItemRegistry.GALCITE_WALL.get(), ItemRegistry.GALCITE.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.END_STONE), RecipeCategory.BUILDING_BLOCKS , ItemRegistry.SMOOTH_END_STONE.get().asItem().asItem(), 0.1F, 200).unlockedBy("has_end_stone", has(Blocks.END_STONE)).save(save);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.WRAPPIST_PEDESTAL.get()).define('#', Blocks.END_STONE_BRICKS).define('O', Items.PRISMARINE_SHARD).define('W', ItemRegistry.WRAPPIST_SHARD.get()).pattern("W W").pattern("O#O").unlockedBy("has_wrappist_shard", has(ItemRegistry.WRAPPIST_SHARD.get())).save(save);

        copySmithingTemplate(save, ItemRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE.get(), ItemRegistry.WRAPPIST_BLOCK.get());
        copySmithingTemplate(save, ItemRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE.get(), ItemRegistry.CELESTITE_BLOCK.get());
        copySmithingTemplate(save, ItemRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE.get(), ItemRegistry.PINK_TOPAZ_BLOCK.get());

        smithingTrims().forEach((arg, arg2) -> {
            trimSmithing(save, arg, arg2);
        });
    }

    protected static void crystalsFromCrystalsBlocks(Consumer<FinishedRecipe> consumer, ItemLike arg, ItemLike arg2, int i) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, arg, i).requires(arg2).group("crystals").unlockedBy("has_crystal_block", has(arg2)).save(consumer, getItemName(arg2) + "_to_" + getItemName(arg));
    }

    protected static void crystalGlassFromGlassAndCrystal(Consumer<FinishedRecipe> consumer, ItemLike arg, ItemLike arg2) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, arg, 8).define('#', Blocks.GLASS).define('X', arg2).pattern("###").pattern("#X#").pattern("###").group("crystal_glass").unlockedBy("has_for_glass_crystal", has((ItemLike)Blocks.GLASS)).save(consumer);
    }

    public static Map<Item, ResourceLocation> smithingTrims() {
        return (Map) Stream.of(ItemRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE.get(), ItemRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE.get(), ItemRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE.get()).collect(Collectors.toMap(Function.identity(), (arg) -> {
            return new ResourceLocation(getItemName(arg) + "_smithing_trim");
        }));
    }
}
