package net.yeoxuhang.geode_plus.biome_modifiers.overworld;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ModifiableBiomeInfo;
import net.yeoxuhang.geode_plus.server.config.ServerConfigs;
import net.yeoxuhang.geode_plus.server.registry.TagRegistry;


public class LargePrismarineCrystalModifier implements BiomeModifier {
    private final Holder<PlacedFeature> features;

    public LargePrismarineCrystalModifier(Holder<PlacedFeature> features) {
        this.features = features;
    }
    public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
        if (phase == Phase.ADD) {
            biomeModificationAddPhase(biome, builder);
        }
    }

    private void biomeModificationAddPhase(Holder<Biome> biome, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
        if (biome.is(TagRegistry.Biomes.HAS_PRISMARINE_CRYSTAL) && !biome.is(TagRegistry.Biomes.BLACKLIST_BIOMES) && ServerConfigs.WORLDGEN.shouldGeneratePrismarineCrystal) {
            builder.getGenerationSettings().addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, features);
        }
    }
    @Override
    public Codec<? extends BiomeModifier> codec() {
        return LargePrismarineCrystalModifier.makeCodec();
    }

    public static Codec<LargePrismarineCrystalModifier> makeCodec() {
        return RecordCodecBuilder.create((config) -> config.group(PlacedFeature.CODEC.fieldOf("feature").forGetter((otherConfig) -> otherConfig.features)).apply(config, LargePrismarineCrystalModifier::new));
    }
}