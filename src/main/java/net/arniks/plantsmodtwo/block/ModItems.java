package net.arniks.plantsmodtwo.block;

import net.arniks.plantsmodtwo.PlantsModtwo;
import net.arniks.plantsmodtwo.block.custom.SkeletonBlockItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public  static final Item SKELETON_BLOCKITEM = registerItem("skeleton_head",
            new SkeletonBlockItem(ModBlocks.SKELETON_BLOCK, new FabricItemSettings()));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PlantsModtwo.MOD_ID, name), item);
    }
    public static void registerModItems() {
        PlantsModtwo.LOGGER.info("register items " + PlantsModtwo.MOD_ID);
    }
}
