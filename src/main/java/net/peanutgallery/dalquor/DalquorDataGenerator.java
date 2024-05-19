package net.peanutgallery.dalquor;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.peanutgallery.dalquor.datagen.ModBlockTagProvider;
import net.peanutgallery.dalquor.datagen.ModItemTagProvider;
import net.peanutgallery.dalquor.datagen.ModLootTableProvider;
import net.peanutgallery.dalquor.datagen.ModModelProvider;
import net.peanutgallery.dalquor.datagen.ModWorldGenerator;
import net.peanutgallery.dalquor.datagen.ModRecipeProvider;
import net.peanutgallery.dalquor.world.ModPlacedFeatures;
import net.peanutgallery.dalquor.world.ModConfiguredFeatures;

public class DalquorDataGenerator implements DataGeneratorEntrypoint {	
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModWorldGenerator::new);

	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
	}
}
