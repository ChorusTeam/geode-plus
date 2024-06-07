package net.yeoxuhang.geode_plus;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = GeodePlus.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GeodePlusDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        BlockTagsProvider blocktags = new GeodePlusBlockTagProvider(event.getGenerator().getPackOutput(), event.getLookupProvider(), event.getExistingFileHelper());
        event.getGenerator().addProvider(event.includeServer(), blocktags);
        event.getGenerator().addProvider(event.includeServer(), new GeodePlusItemTagProvider(event.getGenerator().getPackOutput(), event.getLookupProvider(), blocktags, event.getExistingFileHelper()));

        generator.addProvider(true, new GeodePlusRecipeProvider(packOutput));
        generator.addProvider(true, GeodePlusLootTableProvider.create(packOutput));
        generator.addProvider(true, new GeodePlusBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(true, new GeodePlusItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(true, new GeodePlusLangProvider(packOutput, "en_us", false));
        generator.addProvider(event.includeServer(), new GeodePlusRegistryProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeServer() ,new GeodePlusBiomeTagProvider(packOutput, lookupProvider, existingFileHelper));
    }
}