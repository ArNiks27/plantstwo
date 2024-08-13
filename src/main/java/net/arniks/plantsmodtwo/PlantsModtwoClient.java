package net.arniks.plantsmodtwo;

import net.arniks.plantsmodtwo.block.ModBlocks;
import net.arniks.plantsmodtwo.block.ModItems;
import net.arniks.plantsmodtwo.block.entity.ModBlockEntities;
import net.arniks.plantsmodtwo.block.entity.client.SkeletonBlockRender;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import software.bernie.geckolib.GeckoLib;

public class PlantsModtwoClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockEntityRendererFactories.register(ModBlockEntities.SKELETON_BLOCK_ENTITY, SkeletonBlockRender::new);

    }
}
