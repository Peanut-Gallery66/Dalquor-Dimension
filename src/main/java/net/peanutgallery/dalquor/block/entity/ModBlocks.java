package net.peanutgallery.dalquor.block.entity;

import net.peanutgallery.dalquor.Dalquor;
import net.peanutgallery.dalquor.world.tree.ModSaplingGenerators;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.registry.Registries;

public class ModBlocks {
    public static final Block DREAMPALM_LOG = registerBlock("dreampalm_log", 
        new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block DREAMPALM_WOOD = registerBlock("dreampalm_wood", 
        new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_DREAMPALM_LOG = registerBlock("stripped_dreampalm_log", 
        new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_DREAMPALM_WOOD = registerBlock("stripped_dreampalm_wood", 
        new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block DREAMPALM_PLANKS = registerBlock("dreampalm_planks", 
        new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block DREAMPALM_LEAVES = registerBlock("dreampalm_leaves", 
        new Block(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));

    public static final Block DREAMPALM_SAPLING = registerBlock("dreampalm_sapling", 
        new SaplingBlock(ModSaplingGenerators.DREAMPALM, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
        
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Dalquor.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Dalquor.MOD_ID, name), 
            new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Dalquor.LOGGER.info("Registering Blocks for " + Dalquor.MOD_ID);
    }
}
