package net.peanutgallery.dalquor.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.peanutgallery.dalquor.Dalquor;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class ModItems {
    //Add items to be registered between here---
    public static final Item EXAMPLE_ITEM = registerItem("example_item_name", new Item(new FabricItemSettings()));

    //---and here
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier("dalquor", name), item);
    }

    public static void registerModItems() {
        Dalquor.LOGGER.info("Registering items for " + Dalquor.MOD_ID);
    }
}
