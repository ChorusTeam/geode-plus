package net.yeoxuhang.geode_plus;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.yeoxuhang.geode_plus.server.registry.ConfiguredFeatureRegistry;
import net.yeoxuhang.geode_plus.server.registry.PlacedFeatureRegistry;
import net.yeoxuhang.geode_plus.server.registry.TrimMaterialsAndPatternsRegistry;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class GeodePlusRegistryProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ConfiguredFeatureRegistry::bootstrap)
            .add(Registries.PLACED_FEATURE, PlacedFeatureRegistry::bootstrap)
            .add(Registries.TRIM_MATERIAL, TrimMaterialsAndPatternsRegistry::createMaterials)
            .add(Registries.TRIM_PATTERN, TrimMaterialsAndPatternsRegistry::createPatterns);

    public GeodePlusRegistryProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(GeodePlus.MOD_ID));
    }
}
