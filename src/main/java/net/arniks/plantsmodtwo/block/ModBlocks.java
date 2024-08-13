package net.arniks.plantsmodtwo.block;

import net.arniks.plantsmodtwo.PlantsModtwo;
import net.arniks.plantsmodtwo.block.custom.SkeletonBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class ModBlocks {
    public static final Block SKELETON_BLOCK = Registry.register(Registries.BLOCK, new Identifier(PlantsModtwo.MOD_ID, "skeleton_head"),
            new SkeletonBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(1.0f).nonOpaque()));
    private static Block registerBlock (String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(PlantsModtwo.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(PlantsModtwo.MOD_ID, name),
        new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        PlantsModtwo.LOGGER.info("register blocks " + PlantsModtwo.MOD_ID);
    }
}
