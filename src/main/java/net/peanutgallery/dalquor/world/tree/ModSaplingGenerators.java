package net.peanutgallery.dalquor.world.tree;

import java.util.Optional;

import net.minecraft.block.SaplingGenerator;
import net.peanutgallery.dalquor.world.ModConfiguredFeatures;

public class ModSaplingGenerators {
    public static final SaplingGenerator DREAMPALM = new SaplingGenerator("dreampalm", 0f, 
    Optional.empty(),
    Optional.empty(),
    Optional.of(ModConfiguredFeatures.DREAMPALM_KEY),
    Optional.empty(),
    Optional.empty(),
    Optional.empty());
}