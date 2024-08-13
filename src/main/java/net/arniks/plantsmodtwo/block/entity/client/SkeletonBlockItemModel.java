package net.arniks.plantsmodtwo.block.entity.client;

import net.arniks.plantsmodtwo.PlantsModtwo;
import net.arniks.plantsmodtwo.block.custom.SkeletonBlockItem;
import net.arniks.plantsmodtwo.block.entity.SkeletonBlockEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class SkeletonBlockItemModel extends GeoModel<SkeletonBlockItem> {
    @Override
    public Identifier getModelResource(SkeletonBlockItem animatable) {
        return new Identifier(PlantsModtwo.MOD_ID, "geo/skeleton_head.geo.json");
    }

    @Override
    public Identifier getTextureResource(SkeletonBlockItem animatable) {
        return new Identifier(PlantsModtwo.MOD_ID, "textures/skeleton.png");
    }

    @Override
    public Identifier getAnimationResource(SkeletonBlockItem animatable) {
        return new Identifier(PlantsModtwo.MOD_ID, "animations/model.animation.json");
    }


}
