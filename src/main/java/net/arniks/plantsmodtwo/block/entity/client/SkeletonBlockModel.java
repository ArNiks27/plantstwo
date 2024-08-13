package net.arniks.plantsmodtwo.block.entity.client;

import net.arniks.plantsmodtwo.PlantsModtwo;
import net.arniks.plantsmodtwo.block.entity.SkeletonBlockEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class SkeletonBlockModel extends GeoModel<SkeletonBlockEntity> {
    @Override
    public Identifier getModelResource(SkeletonBlockEntity animatable) {
        return new Identifier(PlantsModtwo.MOD_ID, "geo/skeleton_head.geo.json");
    }

    @Override
    public Identifier getTextureResource(SkeletonBlockEntity animatable) {
        return new Identifier(PlantsModtwo.MOD_ID, "textures/skeleton.png");
    }

    @Override
    public Identifier getAnimationResource(SkeletonBlockEntity animatable) {
        return new Identifier(PlantsModtwo.MOD_ID, "animations/model.animation.json");
    }
}
