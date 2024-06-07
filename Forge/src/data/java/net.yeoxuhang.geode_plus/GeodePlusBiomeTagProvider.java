package net.yeoxuhang.geode_plus;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.yeoxuhang.geode_plus.server.registry.TagRegistry;

import java.util.concurrent.CompletableFuture;

public class GeodePlusBiomeTagProvider extends BiomeTagsProvider {
    public GeodePlusBiomeTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, GeodePlus.MOD_ID, existingFileHelper);
    }

    protected void addTags(HolderLookup.Provider arg) {
        this.tag(TagRegistry.Biomes.BLACKLIST_BIOMES).addOptional(new ResourceLocation("alexscaves:abyssal_chasm"));
        this.tag(TagRegistry.Biomes.HAS_CELESTITE_GEODE).add(Biomes.SWAMP, Biomes.MANGROVE_SWAMP);
        this.tag(TagRegistry.Biomes.HAS_PINK_TOPAZ_GEODE).add(Biomes.CHERRY_GROVE);
        this.tag(TagRegistry.Biomes.HAS_PRISMARINE_GEODE).addTag(BiomeTags.IS_DEEP_OCEAN);
        this.tag(TagRegistry.Biomes.HAS_LAPIS_GEODE).addTag(BiomeTags.IS_OVERWORLD);
        this.tag(TagRegistry.Biomes.HAS_REDSTONE_GEODE).addTag(BiomeTags.IS_OVERWORLD);
        this.tag(TagRegistry.Biomes.HAS_EMERALD_GEODE).addTag(BiomeTags.IS_MOUNTAIN);
        this.tag(TagRegistry.Biomes.HAS_DIAMOND_GEODE).addTag(BiomeTags.IS_OVERWORLD);
        this.tag(TagRegistry.Biomes.HAS_ECHO_GEODE).add(Biomes.DEEP_DARK).addOptional(new ResourceLocation("deeperdarker:blooming_caverns")).addOptional(new ResourceLocation("deeperdarker:deeplands")).addOptional(new ResourceLocation("deeperdarker:echoing_forest")).addOptional(new ResourceLocation("deeperdarker:overcast_columns"));
        this.tag(TagRegistry.Biomes.HAS_NETHER_QUARTZ_GEODE).add(Biomes.NETHER_WASTES, Biomes.CRIMSON_FOREST, Biomes.WARPED_FOREST, Biomes.SOUL_SAND_VALLEY);
        this.tag(TagRegistry.Biomes.HAS_NETHER_GOLD_NUGGET_GEODE).add(Biomes.NETHER_WASTES, Biomes.CRIMSON_FOREST, Biomes.WARPED_FOREST, Biomes.SOUL_SAND_VALLEY);
        this.tag(TagRegistry.Biomes.HAS_NETHER_GLOWSTONE_GEODE).add(Biomes.NETHER_WASTES, Biomes.CRIMSON_FOREST, Biomes.WARPED_FOREST, Biomes.SOUL_SAND_VALLEY);
        this.tag(TagRegistry.Biomes.HAS_NETHER_ANCIENT_DEBRIS_GEODE).add(Biomes.NETHER_WASTES, Biomes.CRIMSON_FOREST, Biomes.WARPED_FOREST, Biomes.SOUL_SAND_VALLEY);
        this.tag(TagRegistry.Biomes.HAS_BASALT_QUARTZ_GEODE).add(Biomes.BASALT_DELTAS);
        this.tag(TagRegistry.Biomes.HAS_BASALT_GLOWSTONE_GEODE).add(Biomes.BASALT_DELTAS);
        this.tag(TagRegistry.Biomes.HAS_BASALT_GOLD_NUGGET_GEODE).add(Biomes.BASALT_DELTAS);
        this.tag(TagRegistry.Biomes.HAS_BASALT_ANCIENT_DEBRIS_GEODE).add(Biomes.BASALT_DELTAS);
        this.tag(TagRegistry.Biomes.HAS_WRAPPIST_GEODE).add(Biomes.END_HIGHLANDS, Biomes.END_MIDLANDS);

        //Crystals
        this.tag(TagRegistry.Biomes.HAS_ECHO_CRYSTAL).add(Biomes.DEEP_DARK).addOptional(new ResourceLocation("deeperdarker:blooming_caverns")).addOptional(new ResourceLocation("deeperdarker:deeplands")).addOptional(new ResourceLocation("deeperdarker:echoing_forest")).addOptional(new ResourceLocation("deeperdarker:overcast_columns"));
        this.tag(TagRegistry.Biomes.HAS_QUARTZ_CRYSTAL).add(Biomes.NETHER_WASTES, Biomes.CRIMSON_FOREST, Biomes.WARPED_FOREST, Biomes.SOUL_SAND_VALLEY);
        this.tag(TagRegistry.Biomes.HAS_GLOWSTONE_CRYSTAL).add(Biomes.NETHER_WASTES, Biomes.CRIMSON_FOREST, Biomes.WARPED_FOREST, Biomes.SOUL_SAND_VALLEY);
        this.tag(TagRegistry.Biomes.HAS_WRAPPIST_CRYSTAL).add(Biomes.END_HIGHLANDS, Biomes.END_MIDLANDS);
        this.tag(TagRegistry.Biomes.HAS_PRISMARINE_CRYSTAL).addTag(BiomeTags.IS_DEEP_OCEAN);
    }
}
