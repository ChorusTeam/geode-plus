package net.yeoxuhang.geode_plus;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;

import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.yeoxuhang.geode_plus.server.config.ServerConfigs;
import net.yeoxuhang.geode_plus.server.registry.TagRegistry;

public class FabricBiomeModifier {

    public void init() {
        var modifications = BiomeModifications.create(GeodePlus.createResource("biome_modifications"));
        modifications.add(ModificationPhase.ADDITIONS, biomeSelectionContext -> true, (biomeSelectionContext, builder) -> {
            Holder<Biome> biome = biomeSelectionContext.getBiomeRegistryEntry();

            if (biome.is(TagRegistry.Biomes.HAS_PRISMARINE_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES) && ServerConfigs.WORLDGEN.shouldGeneratePrismarineGeodes) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("prismarine_geode"));
            }
            if (biome.is(TagRegistry.Biomes.HAS_CELESTITE_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES) && ServerConfigs.WORLDGEN.shouldGenerateCelestiteGeodes) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("celestite_geode"));
            }
            if (biome.is(TagRegistry.Biomes.HAS_PINK_TOPAZ_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES) && ServerConfigs.WORLDGEN.shouldGeneratePinkTopazGeodes) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("pink_topaz_geode"));
            }

            if (ServerConfigs.WORLDGEN.shouldGenerateDiamondGeodes){
                if (biome.is(TagRegistry.Biomes.HAS_DIAMOND_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES)) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("diamond_geode"));
                }
                if (biome.is(TagRegistry.Biomes.HAS_DIAMOND_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES)) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("deepslate_diamond_geode"));
                }
                if (biome.is(TagRegistry.Biomes.HAS_ECHO_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES)) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("sculk_diamond_geode"));
                }
            }

            if (ServerConfigs.WORLDGEN.shouldGenerateEmeraldGeodes){
                if (biome.is(TagRegistry.Biomes.HAS_EMERALD_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES)) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("emerald_geode"));
                }
                if (biome.is(TagRegistry.Biomes.HAS_EMERALD_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES)) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("deepslate_emerald_geode"));
                }
                if (biome.is(TagRegistry.Biomes.HAS_ECHO_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES)) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("sculk_emerald_geode"));
                }
            }
            if (ServerConfigs.WORLDGEN.shouldGenerateLapisGeodes){
                if (biome.is(TagRegistry.Biomes.HAS_LAPIS_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES)) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("lapis_geode"));
                }
                if (biome.is(TagRegistry.Biomes.HAS_LAPIS_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES)) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("deepslate_lapis_geode"));
                }
                if (biome.is(TagRegistry.Biomes.HAS_ECHO_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES)) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("sculk_lapis_geode"));
                }
            }
            if (ServerConfigs.WORLDGEN.shouldGenerateRedstoneGeodes){
                if (biome.is(TagRegistry.Biomes.HAS_REDSTONE_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES)) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("redstone_geode"));
                }
                if (biome.is(TagRegistry.Biomes.HAS_REDSTONE_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES)) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("deepslate_redstone_geode"));
                }
                if (biome.is(TagRegistry.Biomes.HAS_ECHO_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES)) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("sculk_redstone_geode"));
                }
            }
            if (ServerConfigs.WORLDGEN.shouldGenerateEchoGeodes){
                if (biome.is(TagRegistry.Biomes.HAS_ECHO_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES)) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("echo_geode"));
                }
            }

            if (ServerConfigs.WORLDGEN.shouldGenerateNetherDebrisGeodes){
                if (biome.is(TagRegistry.Biomes.HAS_NETHER_ANCIENT_DEBRIS_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES)) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("ancient_debris_geode"));
                }
                if (biome.is(TagRegistry.Biomes.HAS_BASALT_ANCIENT_DEBRIS_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES)) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("basalt_ancient_debris_geode"));
                }
                if (biome.is(TagRegistry.Biomes.HAS_BLACKSTONE_ANCIENT_DEBRIS_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES)) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("blackstone_ancient_debris_geode"));
                }
            }

            if (ServerConfigs.WORLDGEN.shouldGenerateNetherGlowstoneGeodes){
                if (biome.is(TagRegistry.Biomes.HAS_NETHER_GLOWSTONE_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES)) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("glowstone_geode"));
                }
                if (biome.is(TagRegistry.Biomes.HAS_BASALT_GLOWSTONE_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES)) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("basalt_glowstone_geode"));
                }
                if (biome.is(TagRegistry.Biomes.HAS_BLACKSTONE_GLOWSTONE_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES) ) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("blackstone_glowstone_geode"));
                }
            }

            if (ServerConfigs.WORLDGEN.shouldGenerateNetherGoldNuggetGeodes){
                if (biome.is(TagRegistry.Biomes.HAS_NETHER_GOLD_NUGGET_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES)) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("gold_nugget_geode"));
                }
                if (biome.is(TagRegistry.Biomes.HAS_BASALT_GOLD_NUGGET_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES)) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("basalt_gold_nugget_geode"));
                }
                if (biome.is(TagRegistry.Biomes.HAS_BLACKSTONE_GOLD_NUGGET_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES) ) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("blackstone_gold_nugget_geode"));
                }
            }

            if (ServerConfigs.WORLDGEN.shouldGenerateNetherQuartzGeodes){
                if (biome.is(TagRegistry.Biomes.HAS_NETHER_QUARTZ_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES)) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("quartz_geode"));
                }
                if (biome.is(TagRegistry.Biomes.HAS_BASALT_QUARTZ_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES)) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("basalt_quartz_geode"));
                }
                if (biome.is(TagRegistry.Biomes.HAS_BLACKSTONE_QUARTZ_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES)) {
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("blackstone_quartz_geode"));
                }
            }

            if (biome.is(TagRegistry.Biomes.HAS_WRAPPIST_GEODE) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES) && ServerConfigs.WORLDGEN.shouldGenerateWrappistGeodes) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("wrappist_geode"));
            }

            if (biome.is(TagRegistry.Biomes.HAS_PRISMARINE_CRYSTAL) && ServerConfigs.WORLDGEN.shouldGeneratePrismarineCrystal) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, getPlacedFeatureKey("prismarine_crystal_spike"));
            }
            if (biome.is(TagRegistry.Biomes.HAS_ECHO_CRYSTAL) && ServerConfigs.WORLDGEN.shouldGenerateEchoCrystal){
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("echo_crystal_spike"));
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("echo_crystal_spike_floor"));
            }
            if (biome.is(TagRegistry.Biomes.HAS_QUARTZ_CRYSTAL) && ServerConfigs.WORLDGEN.shouldGenerateQuartzCrystal) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("quartz_crystal_spike"));
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("quartz_crystal_spike_floor"));
            }
            if (biome.is(TagRegistry.Biomes.HAS_GLOWSTONE_CRYSTAL) && ServerConfigs.WORLDGEN.shouldGenerateGlowstoneCrystal) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("glowstone_crystal_spike"));
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("glowstone_crystal_spike_floor"));
            }
            if (biome.is(TagRegistry.Biomes.HAS_WRAPPIST_CRYSTAL) && ServerConfigs.WORLDGEN.shouldGenerateWrappistCrystal) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, getPlacedFeatureKey("wrappist_crystal_spike"));
            }
        });
    }
    private ResourceKey<PlacedFeature> getPlacedFeatureKey(String key) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(GeodePlus.MOD_ID, key));
    }
}

