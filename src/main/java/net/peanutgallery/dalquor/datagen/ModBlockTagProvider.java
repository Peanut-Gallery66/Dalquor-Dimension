package net.peanutgallery.dalquor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.peanutgallery.dalquor.block.entity.ModBlocks;
import net.minecraft.registry.tag.BlockTags;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup args) {
        getOrCreateTagBuilder(BlockTags.PLANKS)
            .add(ModBlocks.DREAMPALM_PLANKS);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
            .add(ModBlocks.DREAMPALM_LOG)
            .add(ModBlocks.DREAMPALM_WOOD)
            .add(ModBlocks.STRIPPED_DREAMPALM_LOG)
            .add(ModBlocks.STRIPPED_DREAMPALM_WOOD);
    }
    
}