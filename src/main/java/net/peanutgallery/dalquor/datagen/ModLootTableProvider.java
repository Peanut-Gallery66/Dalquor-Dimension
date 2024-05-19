package net.peanutgallery.dalquor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.peanutgallery.dalquor.block.entity.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
   
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.DREAMPALM_LOG);
        addDrop(ModBlocks.DREAMPALM_PLANKS);
        addDrop(ModBlocks.DREAMPALM_WOOD);
        addDrop(ModBlocks.STRIPPED_DREAMPALM_LOG);
        addDrop(ModBlocks.STRIPPED_DREAMPALM_WOOD);
        addDrop(ModBlocks.DREAMPALM_SAPLING);

        addDrop(ModBlocks.DREAMPALM_LEAVES, leavesDrops(ModBlocks.DREAMPALM_LEAVES, ModBlocks.DREAMPALM_SAPLING, 0.0025f)); 
    }
}
