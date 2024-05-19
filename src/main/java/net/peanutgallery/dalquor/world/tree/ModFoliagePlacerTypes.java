package net.peanutgallery.dalquor.world.tree;

import net.peanutgallery.dalquor.Dalquor;
import net.minecraft.world.gen.foliage.FoliagePlacerType;
import net.peanutgallery.dalquor.mixin.FoliagePlacerTypeInvoker;
import net.peanutgallery.dalquor.world.tree.custom.DreampalmFoliagePlacer;

public class ModFoliagePlacerTypes {
    public static final FoliagePlacerType<?> DREAMPALM_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("dreampalm_foliage_placer", DreampalmFoliagePlacer.CODEC);

    public static void register() {
        Dalquor.LOGGER.info("Registering Foliage Placer for " + Dalquor.MOD_ID);
    }
}