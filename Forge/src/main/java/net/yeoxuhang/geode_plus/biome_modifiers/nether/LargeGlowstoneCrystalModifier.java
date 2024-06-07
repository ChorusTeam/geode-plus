package net.yeoxuhang.geode_plus.biome_modifiers.nether;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ModifiableBiomeInfo;
import net.yeoxuhang.geode_plus.server.config.ServerConfigs;
import net.yeoxuhang.geode_plus.server.registry.TagRegistry;


public class LargeGlowstoneCrystalModifier implements BiomeModifier {
    private final HolderSet<PlacedFeature> features;

    public LargeGlowstoneCrystalModifier(HolderSet<PlacedFeature> features) {
        this.features = features;
    }
    public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
        if (phase == Phase.ADD) {
            biomeModificationAddPhase(biome, builder);
        }
    }

    private void biomeModificationAddPhase(Holder<Biome> biome, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
        if (biome.is(TagRegistry.Biomes.HAS_GLOWSTONE_CRYSTAL) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES) && ServerConfigs.WORLDGEN.shouldGenerateGlowstoneCrystal) {
            this.features.forEach((holder) -> {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, holder);
            });
        }
    }
    @Override
    public Codec<? extends BiomeModifier> codec() {
        return LargeGlowstoneCrystalModifier.makeCodec();
    }

    public static Codec<LargeGlowstoneCrystalModifier> makeCodec() {
        return RecordCodecBuilder.create((config) -> {
            return config.group(PlacedFeature.LIST_CODEC.fieldOf("feature").forGetter((otherConfig) -> {
                return otherConfig.features;
            })).apply(config, LargeGlowstoneCrystalModifier::new);
        });
    }
}