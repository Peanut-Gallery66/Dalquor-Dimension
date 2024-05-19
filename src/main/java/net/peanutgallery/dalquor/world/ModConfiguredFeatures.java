package net.peanutgallery.dalquor.world;

import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registerable;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.peanutgallery.dalquor.Dalquor;
import net.peanutgallery.dalquor.block.entity.ModBlocks;
import net.peanutgallery.dalquor.world.tree.custom.DreampalmTrunkPlacer;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.peanutgallery.dalquor.world.tree.custom.DreampalmFoliagePlacer;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> DREAMPALM_KEY = registerKey("dreampalm");
    
    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, DREAMPALM_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.DREAMPALM_LOG),
                new DreampalmTrunkPlacer(5, 4, 3),

                BlockStateProvider.of(ModBlocks.DREAMPALM_LEAVES),
                new DreampalmFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),

                new TwoLayersFeatureSize(1, 0, 2)).build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Dalquor.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
    
}