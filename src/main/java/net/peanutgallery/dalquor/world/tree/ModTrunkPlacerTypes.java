package net.peanutgallery.dalquor.world.tree;

import net.peanutgallery.dalquor.world.tree.custom.DreampalmTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;
import net.peanutgallery.dalquor.Dalquor;
import net.peanutgallery.dalquor.mixin.TrunkPlacerTypeInvoker;

public class ModTrunkPlacerTypes {
    public static final TrunkPlacerType<?> DREAMPALM_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("dreampalm_trunk_placer", DreampalmTrunkPlacer.CODEC);

    public static void register() {
        Dalquor.LOGGER.info("Registering Trunk Placers for " + Dalquor.MOD_ID);
    }
}