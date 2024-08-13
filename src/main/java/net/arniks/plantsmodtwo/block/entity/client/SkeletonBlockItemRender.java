package net.arniks.plantsmodtwo.block.entity.client;

import net.arniks.plantsmodtwo.block.custom.SkeletonBlockItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class SkeletonBlockItemRender extends GeoItemRenderer<SkeletonBlockItem> {
    public SkeletonBlockItemRender(){
        super(new SkeletonBlockItemModel());
    }
}
