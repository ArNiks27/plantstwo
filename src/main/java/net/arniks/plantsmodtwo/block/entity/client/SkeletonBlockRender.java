package net.arniks.plantsmodtwo.block.entity.client;

import net.arniks.plantsmodtwo.block.entity.SkeletonBlockEntity;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class SkeletonBlockRender extends GeoBlockRenderer<SkeletonBlockEntity> {
    public SkeletonBlockRender(BlockEntityRendererFactory.Context context) {
        super(new SkeletonBlockModel());
    }
}
