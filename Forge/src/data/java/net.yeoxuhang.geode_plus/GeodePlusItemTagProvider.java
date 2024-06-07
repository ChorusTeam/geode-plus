package net.yeoxuhang.geode_plus;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.yeoxuhang.geode_plus.server.registry.BlockRegistry;
import net.yeoxuhang.geode_plus.server.registry.ItemRegistry;

import java.util.concurrent.CompletableFuture;

public class GeodePlusItemTagProvider extends ItemTagsProvider {
    public GeodePlusItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, BlockTagsProvider provider, ExistingFileHelper exFileHelper) {
        super(output, lookupProvider, provider.contentsGetter(), GeodePlus.MOD_ID, exFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider p_256380_) {
        this.tag(Tags.Items.GLASS).add(
                BlockRegistry.WRAPPIST_GLASS.get().asItem(),
                BlockRegistry.CELESTITE_GLASS.get().asItem(),
                BlockRegistry.PINK_TOPAZ_GLASS.get().asItem()
        );
        this.tag(ItemTags.TRIM_MATERIALS).add(
                ItemRegistry.WRAPPIST_SHARD.get(),
                ItemRegistry.CELESTITE_SHARD.get(),
                ItemRegistry.PINK_TOPAZ.get()
        );
        this.tag(ItemTags.TRIM_TEMPLATES).add(
                ItemRegistry.WRAP_ARMOR_TRIM_SMITHING_TEMPLATE.get(),
                ItemRegistry.CELESTE_ARMOR_TRIM_SMITHING_TEMPLATE.get(),
                ItemRegistry.HEART_ARMOR_TRIM_SMITHING_TEMPLATE.get()
        );
    }
}