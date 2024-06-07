package net.yeoxuhang.geode_plus;

import com.mojang.serialization.Codec;
import net.yeoxuhang.geode_plus.biome_modifiers.end.LargeWrappistCrystalModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.end.WrappistGeodeModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.nether.LargeGlowstoneCrystalModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.nether.LargeQuartzCrystalModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.nether.basalt.BasaltAncientDebrisGeodeModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.nether.basalt.BasaltGlowstoneGeodeModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.nether.basalt.BasaltGoldNuggetGeodeModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.nether.basalt.BasaltQuartzGeodeModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.nether.blackstone.BlackstoneAncientDebrisGeodeModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.nether.blackstone.BlackstoneGlowstoneGeodeModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.nether.blackstone.BlackstoneGoldNuggetGeodeModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.nether.blackstone.BlackstoneQuartzGeodeModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.nether.netherrack.AncientDebrisGeodeModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.nether.netherrack.GlowstoneGeodeModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.nether.netherrack.GoldNuggetGeodeModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.nether.netherrack.QuartzGeodeModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.overworld.CelestiteGeodeModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.overworld.LargePrismarineCrystalModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.overworld.PinkTopazGeodeModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.overworld.PrismarineGeodeModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.overworld.deepdark.*;
import net.yeoxuhang.geode_plus.biome_modifiers.overworld.deepslate.DeepslateDiamondGeodeModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.overworld.deepslate.DeepslateEmeraldGeodeModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.overworld.deepslate.DeepslateLapisGeodeModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.overworld.deepslate.DeepslateRedstoneGeodeModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.overworld.stone.DiamondGeodeModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.overworld.stone.EmeraldGeodeModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.overworld.stone.LapisGeodeModifier;
import net.yeoxuhang.geode_plus.biome_modifiers.overworld.stone.RedstoneGeodeModifier;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BiomeModifierRegistry {
    public static final DeferredRegister<Codec<? extends BiomeModifier>> MODIFIER =
            DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, GeodePlus.MOD_ID);

    public static RegistryObject<Codec<PrismarineGeodeModifier>> prismarineGeode = MODIFIER.register("prismarine_geode", PrismarineGeodeModifier::makeCodec);
    public static RegistryObject<Codec<DiamondGeodeModifier>> diamondGeode = MODIFIER.register("diamond_geode", DiamondGeodeModifier::makeCodec);
    public static RegistryObject<Codec<EmeraldGeodeModifier>> emeraldGeode = MODIFIER.register("emerald_geode", EmeraldGeodeModifier::makeCodec);
    public static RegistryObject<Codec<LapisGeodeModifier>> lapisGeode = MODIFIER.register("lapis_geode", LapisGeodeModifier::makeCodec);
    public static RegistryObject<Codec<RedstoneGeodeModifier>> redstoneGeode = MODIFIER.register("redstone_geode", RedstoneGeodeModifier::makeCodec);
    public static RegistryObject<Codec<DeepslateDiamondGeodeModifier>> deepslateDiamondGeode = MODIFIER.register("deepslate_diamond_geode", DeepslateDiamondGeodeModifier::makeCodec);
    public static RegistryObject<Codec<DeepslateEmeraldGeodeModifier>> deepslateEmeraldGeode = MODIFIER.register("deepslate_emerald_geode", DeepslateEmeraldGeodeModifier::makeCodec);
    public static RegistryObject<Codec<DeepslateLapisGeodeModifier>> deepslateLapisGeode = MODIFIER.register("deepslate_lapis_geode", DeepslateLapisGeodeModifier::makeCodec);
    public static RegistryObject<Codec<DeepslateRedstoneGeodeModifier>> deepslateRedstoneGeode = MODIFIER.register("deepslate_redstone_geode", DeepslateRedstoneGeodeModifier::makeCodec);
    public static RegistryObject<Codec<SculkDiamondGeodeModifier>> sculkDiamondGeode = MODIFIER.register("sculk_diamond_geode", SculkDiamondGeodeModifier::makeCodec);
    public static RegistryObject<Codec<SculkEmeraldGeodeModifier>> sculkEmeraldGeode = MODIFIER.register("sculk_emerald_geode", SculkEmeraldGeodeModifier::makeCodec);
    public static RegistryObject<Codec<SculkLapisGeodeModifier>> sculkLapisGeode = MODIFIER.register("sculk_lapis_geode", SculkLapisGeodeModifier::makeCodec);
    public static RegistryObject<Codec<SculkRedstoneGeodeModifier>> sculkRedstoneGeode = MODIFIER.register("sculk_redstone_geode", SculkRedstoneGeodeModifier::makeCodec);
    public static RegistryObject<Codec<EchoGeodeModifier>> echoGeode = MODIFIER.register("echo_geode", EchoGeodeModifier::makeCodec);
    public static RegistryObject<Codec<AncientDebrisGeodeModifier>> ancientDebrisGeode = MODIFIER.register("ancient_debris_geode", AncientDebrisGeodeModifier::makeCodec);
    public static RegistryObject<Codec<GlowstoneGeodeModifier>> glowstoneGeode = MODIFIER.register("glowstone_geode", GlowstoneGeodeModifier::makeCodec);
    public static RegistryObject<Codec<GoldNuggetGeodeModifier>> goldNuggetGeode = MODIFIER.register("gold_nugget_geode", GoldNuggetGeodeModifier::makeCodec);
    public static RegistryObject<Codec<QuartzGeodeModifier>> quartzGeode = MODIFIER.register("quartz_geode", QuartzGeodeModifier::makeCodec);
    public static RegistryObject<Codec<BasaltAncientDebrisGeodeModifier>> basaltAncientDebrisGeode = MODIFIER.register("basalt_ancient_debris_geode", BasaltAncientDebrisGeodeModifier::makeCodec);
    public static RegistryObject<Codec<BasaltGlowstoneGeodeModifier>> basaltGlowstoneGeode = MODIFIER.register("basalt_glowstone_geode", BasaltGlowstoneGeodeModifier::makeCodec);
    public static RegistryObject<Codec<BasaltGoldNuggetGeodeModifier>> basaltGoldNuggetGeode = MODIFIER.register("basalt_gold_nugget_geode", BasaltGoldNuggetGeodeModifier::makeCodec);
    public static RegistryObject<Codec<BasaltQuartzGeodeModifier>> basaltQuartzGeode = MODIFIER.register("basalt_quartz_geode", BasaltQuartzGeodeModifier::makeCodec);
    public static RegistryObject<Codec<BlackstoneAncientDebrisGeodeModifier>> blackstoneAncientDebrisGeode = MODIFIER.register("blackstone_ancient_debris_geode", BlackstoneAncientDebrisGeodeModifier::makeCodec);
    public static RegistryObject<Codec<BlackstoneGlowstoneGeodeModifier>> blackstoneGlowstoneGeode = MODIFIER.register("blackstone_glowstone_geode", BlackstoneGlowstoneGeodeModifier::makeCodec);
    public static RegistryObject<Codec<BlackstoneGoldNuggetGeodeModifier>> blackstoneGoldNuggetGeode = MODIFIER.register("blackstone_gold_nugget_geode", BlackstoneGoldNuggetGeodeModifier::makeCodec);
    public static RegistryObject<Codec<BlackstoneQuartzGeodeModifier>> blackstoneQuartzGeode = MODIFIER.register("blackstone_quartz_geode", BlackstoneQuartzGeodeModifier::makeCodec);

    public static RegistryObject<Codec<WrappistGeodeModifier>> wrappistGeode = MODIFIER.register("wrappist_geode", WrappistGeodeModifier::makeCodec);
    public static RegistryObject<Codec<CelestiteGeodeModifier>> celestiteGeode = MODIFIER.register("celestite_geode", CelestiteGeodeModifier::makeCodec);
    public static RegistryObject<Codec<PinkTopazGeodeModifier>> pinkTopazGeode = MODIFIER.register("pink_topaz_geode", PinkTopazGeodeModifier::makeCodec);


    public static RegistryObject<Codec<LargeEchoCrystalModifier>> echoCrystalSpike = MODIFIER.register("echo_crystal_spike", LargeEchoCrystalModifier::makeCodec);
    public static RegistryObject<Codec<LargePrismarineCrystalModifier>> prismarineCrystalSpike = MODIFIER.register("prismarine_crystal_spike", LargePrismarineCrystalModifier::makeCodec);

    public static RegistryObject<Codec<LargeQuartzCrystalModifier>> quartzCrystalSpike = MODIFIER.register("quartz_crystal_spike", LargeQuartzCrystalModifier::makeCodec);
    public static RegistryObject<Codec<LargeGlowstoneCrystalModifier>> glowstoneCrystalSpike = MODIFIER.register("glowstone_crystal_spike", LargeGlowstoneCrystalModifier::makeCodec);
    public static RegistryObject<Codec<LargeWrappistCrystalModifier>> wrppistCrystalSpike = MODIFIER.register("wrappist_crystal_spike", LargeWrappistCrystalModifier::makeCodec);


    public static void register(IEventBus eventBus) {
        MODIFIER.register(eventBus);
    }
}