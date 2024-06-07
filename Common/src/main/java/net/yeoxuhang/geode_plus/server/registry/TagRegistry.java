package net.yeoxuhang.geode_plus.server.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.yeoxuhang.geode_plus.GeodePlus;

public class TagRegistry {
    public static class Biomes {
        public static final TagKey<Biome> BLACKLIST_BIOMES
                = biomeTag("blacklist_biomes");
        //Geodes
        public static final TagKey<Biome> HAS_PRISMARINE_GEODE
                = biomeTag("has_prismarine_geode");
        public static final TagKey<Biome> HAS_LAPIS_GEODE
                = biomeTag("has_lapis_geode");
        public static final TagKey<Biome> HAS_REDSTONE_GEODE
                = biomeTag("has_redstone_geode");
        public static final TagKey<Biome> HAS_EMERALD_GEODE
                = biomeTag("has_emerald_geode");
        public static final TagKey<Biome> HAS_DIAMOND_GEODE
                = biomeTag("has_diamond_geode");
        public static final TagKey<Biome> HAS_ECHO_GEODE
                = biomeTag("has_echo_geode");
        public static final TagKey<Biome> HAS_NETHER_QUARTZ_GEODE
                = biomeTag("has_nether_quartz_geode");
        public static final TagKey<Biome> HAS_NETHER_GLOWSTONE_GEODE
                = biomeTag("has_nether_glowstone_geode");
        public static final TagKey<Biome> HAS_BASALT_QUARTZ_GEODE
                = biomeTag("has_basalt_quartz_geode");
        public static final TagKey<Biome> HAS_BASALT_GLOWSTONE_GEODE
                = biomeTag("has_basalt_glowstone_geode");

        public static final TagKey<Biome> HAS_BLACKSTONE_GLOWSTONE_GEODE
                = biomeTag("has_blackstone_glowstone_geode");

        public static final TagKey<Biome> HAS_BLACKSTONE_QUARTZ_GEODE
                = biomeTag("has_blackstone_quartz_geode");

        public static final TagKey<Biome> HAS_BASALT_GOLD_NUGGET_GEODE
                = biomeTag("has_basalt_gold_nugget_geode");

        public static final TagKey<Biome> HAS_BLACKSTONE_GOLD_NUGGET_GEODE
                = biomeTag("has_blackstone_gold_nugget_geode");
        public static final TagKey<Biome> HAS_WRAPPIST_GEODE
                = biomeTag("has_wrappist_geode");
        public static final TagKey<Biome> HAS_NETHER_GOLD_NUGGET_GEODE
                = biomeTag("has_nether_gold_nugget_geode");
        public static final TagKey<Biome> HAS_NETHER_ANCIENT_DEBRIS_GEODE
                = biomeTag("has_nether_ancient_debris_geode");

        public static final TagKey<Biome> HAS_BASALT_ANCIENT_DEBRIS_GEODE
                = biomeTag("has_basalt_ancient_debris_geode");
        public static final TagKey<Biome> HAS_BLACKSTONE_ANCIENT_DEBRIS_GEODE
                = biomeTag("has_blackstone_ancient_debris_geode");
        public static final TagKey<Biome> HAS_CELESTITE_GEODE
                = biomeTag("has_celestite_geode");

        public static final TagKey<Biome> HAS_PINK_TOPAZ_GEODE
                = biomeTag("has_pink_topaz_geode");

        //Crystals
        public static final TagKey<Biome> HAS_ECHO_CRYSTAL
                = biomeTag("has_echo_crystal");
        public static final TagKey<Biome> HAS_QUARTZ_CRYSTAL
                = biomeTag("has_quartz_crystal");
        public static final TagKey<Biome> HAS_GLOWSTONE_CRYSTAL
                = biomeTag("has_glowstone_crystal");
        public static final TagKey<Biome> HAS_WRAPPIST_CRYSTAL
                = biomeTag("has_warppist_crystal");

        public static final TagKey<Biome> HAS_PRISMARINE_CRYSTAL
                = biomeTag("has_prismarine_crystal");
        private static TagKey<Biome> biomeTag(String name) {
            return TagKey.create(Registries.BIOME, new ResourceLocation(GeodePlus.MOD_ID, name));
        }

    }

    public static class Blocks {
        public static final TagKey<Block> WRAPPIST_PEDESTAL_CANNOT_PLACE_ON
                = blockTag("wrappist_pedestal_cannot_place_on");

        public static final TagKey<Block> CAN_LARGE_ECHO_CRYSTAL_PLACE
                = blockTag("can_large_echo_crystal_place");

        public static final TagKey<Block> CAN_LARGE_WRAPPIST_CRYSTAL_PLACE
                = blockTag("can_large_wrappist_crystal_place");

        public static final TagKey<Block> CAN_LARGE_PRISMARINE_CRYSTAL_PLACE
                = blockTag("can_large_prismarine_crystal_place");

        public static final TagKey<Block> GEODE_INVALID_BLOCKS
                = blockTag("geode_invalid_blocks");

        public static final TagKey<Block> GEODES_CANNOT_REPLACE
                = blockTag("geodes_cannot_replace");


        private static TagKey<Block> blockTag(String name) {
            return TagKey.create(Registries.BLOCK, new ResourceLocation(GeodePlus.MOD_ID, name));
        }
    }
    public static class Items {
        private static TagKey<Item> itemTag(String name) {
            return TagKey.create(Registries.ITEM, new ResourceLocation(GeodePlus.MOD_ID, name));
        }
    }
}
