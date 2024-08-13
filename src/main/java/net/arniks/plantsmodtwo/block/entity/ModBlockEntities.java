package net.arniks.plantsmodtwo.block.entity;

import net.arniks.plantsmodtwo.PlantsModtwo;
import net.arniks.plantsmodtwo.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.tutorial.TutorialManager;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static BlockEntityType<SkeletonBlockEntity> SKELETON_BLOCK_ENTITY;

            public static void registerAllBlockEntites() {
        SKELETON_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(PlantsModtwo.MOD_ID, "skeleton_head"),
                FabricBlockEntityTypeBuilder.create(SkeletonBlockEntity::new,
                        ModBlocks.SKELETON_BLOCK).build());
            }
}
