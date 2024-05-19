package net.peanutgallery.dalquor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.peanutgallery.dalquor.block.entity.ModBlocks;
import net.minecraft.registry.tag.ItemTags;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup args) {
        getOrCreateTagBuilder(ItemTags.PLANKS)
            .add(ModBlocks.DREAMPALM_PLANKS.asItem());
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
            .add(ModBlocks.DREAMPALM_LOG.asItem())
            .add(ModBlocks.DREAMPALM_WOOD.asItem())
            .add(ModBlocks.STRIPPED_DREAMPALM_LOG.asItem())
            .add(ModBlocks.STRIPPED_DREAMPALM_WOOD.asItem());
    }
    
}
