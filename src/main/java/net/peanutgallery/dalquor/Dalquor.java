package net.peanutgallery.dalquor;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.peanutgallery.dalquor.block.entity.ModBlocks;
import net.peanutgallery.dalquor.item.ModItemGroups;
import net.peanutgallery.dalquor.item.ModItems;
import net.peanutgallery.dalquor.world.tree.ModFoliagePlacerTypes;
import net.peanutgallery.dalquor.world.tree.ModTrunkPlacerTypes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dalquor implements ModInitializer {
	
	public static final String MOD_ID = "dalquor";
	public static final String MOD_NAME = "Dalquor";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		//Registering items, blocks, etc.
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

		ModTrunkPlacerTypes.register();

		ModFoliagePlacerTypes.register();
		//Block registers for strippable
		StrippableBlockRegistry.register(ModBlocks.DREAMPALM_LOG, ModBlocks.STRIPPED_DREAMPALM_LOG);
		StrippableBlockRegistry.register(ModBlocks.DREAMPALM_WOOD, ModBlocks.STRIPPED_DREAMPALM_WOOD);
		//Block registers for flammability
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DREAMPALM_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DREAMPALM_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DREAMPALM_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_DREAMPALM_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_DREAMPALM_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DREAMPALM_LEAVES, 30, 60);

	}
}