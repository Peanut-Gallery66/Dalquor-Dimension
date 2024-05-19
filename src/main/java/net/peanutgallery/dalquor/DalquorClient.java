package net.peanutgallery.dalquor;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.RenderLayer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.peanutgallery.dalquor.block.entity.ModBlocks;

public class DalquorClient implements ClientModInitializer{
    
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DREAMPALM_LEAVES, RenderLayer.getCutout());
    }
}
