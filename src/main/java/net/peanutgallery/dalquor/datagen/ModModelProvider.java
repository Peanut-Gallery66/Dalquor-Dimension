package net.peanutgallery.dalquor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.ItemModelGenerator;
import net.peanutgallery.dalquor.block.entity.ModBlocks;
import net.minecraft.data.client.BlockStateModelGenerator;

public class ModModelProvider extends FabricModelProvider{
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(ModBlocks.DREAMPALM_LOG).log(ModBlocks.DREAMPALM_LOG).wood(ModBlocks.DREAMPALM_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_DREAMPALM_LOG).log(ModBlocks.STRIPPED_DREAMPALM_LOG).wood(ModBlocks.STRIPPED_DREAMPALM_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DREAMPALM_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DREAMPALM_LEAVES);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
