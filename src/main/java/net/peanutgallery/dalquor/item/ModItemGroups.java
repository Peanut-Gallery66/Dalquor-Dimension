package net.peanutgallery.dalquor.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.peanutgallery.dalquor.Dalquor;
import net.peanutgallery.dalquor.block.entity.ModBlocks;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.text.Text;
import net.minecraft.item.ItemStack;

public class ModItemGroups {

    public static final ItemGroup DALQUOR_ITEMS = Registry.register(Registries.ITEM_GROUP, 
        new Identifier(Dalquor.MOD_ID, "dalquor_items"), 
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.dalquor_items"))
        .icon(() -> new ItemStack(ModBlocks.DREAMPALM_LEAVES)).entries((displayContext, entries) -> {
            entries.add(ModBlocks.DREAMPALM_LOG);
            entries.add(ModBlocks.DREAMPALM_WOOD);
            entries.add(ModBlocks.STRIPPED_DREAMPALM_LOG);
            entries.add(ModBlocks.STRIPPED_DREAMPALM_WOOD);
            entries.add(ModBlocks.DREAMPALM_PLANKS);
            entries.add(ModBlocks.DREAMPALM_LEAVES);
    }).build());
    
    public static void registerItemGroups() {
        Dalquor.LOGGER.info("Registering item groups for " + Dalquor.MOD_ID);
    }
}
