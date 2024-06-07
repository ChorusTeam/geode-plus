package net.yeoxuhang.geode_plus.server.registry;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.yeoxuhang.geode_plus.GeodePlus;
import net.yeoxuhang.geode_plus.server.world.feature.*;
import net.yeoxuhang.geode_plus.server.world.feature.config.GeodeCrystalSpikeConfig;
import net.yeoxuhang.geode_plus.reg.RegistrationProvider;
import net.yeoxuhang.geode_plus.reg.RegistryObject;

import java.util.function.Supplier;

public class FeatureRegistry {
    private static final RegistrationProvider<Feature<?>> FEATURE = RegistrationProvider.get(BuiltInRegistries.FEATURE, GeodePlus.MOD_ID);

    public static final Supplier<CrystalSpikeFeature> CRYSTAL_SPIKE = createFeature("crystal_spike",
            () -> new CrystalSpikeFeature(GeodeCrystalSpikeConfig.CODEC));

    public static final Supplier<OceanCrystalSpikeFeature> OCEAN_CRYSTAL_SPIKE = createFeature("ocean_crystal_spike",
            () -> new OceanCrystalSpikeFeature(GeodeCrystalSpikeConfig.CODEC));

    public static final Supplier<EchoCrystalSpikeFeature> ECHO_CRYSTAL_SPIKE = createFeature("echo_crystal_spike",
            () -> new EchoCrystalSpikeFeature(GeodeCrystalSpikeConfig.CODEC));

    public static final Supplier<WrappistCrystalSpikeFeature> WRAPPIST_CRYSTAL_SPIKE = createFeature("wrappist_crystal_spike",
            () -> new WrappistCrystalSpikeFeature(GeodeCrystalSpikeConfig.CODEC));

    public static final Supplier<GeodeFeature> GEODE = createFeature("geode",
            () -> new GeodeFeature(GeodeConfiguration.CODEC));

    public static final Supplier<OceanGeodeFeature> OCEAN_GEODE = createFeature("ocean_geode",
            () -> new OceanGeodeFeature(GeodeConfiguration.CODEC));
    public static <C extends FeatureConfiguration, F extends Feature<C>> RegistryObject<F> createFeature(String id, Supplier<? extends F> feature) {
        return FEATURE.register(id, feature);
    }
    public static void init() {};
}
