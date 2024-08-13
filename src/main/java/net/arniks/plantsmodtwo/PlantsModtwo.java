package net.arniks.plantsmodtwo;

import net.arniks.plantsmodtwo.block.ModBlocks;
import net.arniks.plantsmodtwo.block.ModItems;
import net.arniks.plantsmodtwo.block.entity.ModBlockEntities;
import net.arniks.plantsmodtwo.block.entity.client.SkeletonBlockRender;
import net.fabricmc.api.ModInitializer;

import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class PlantsModtwo implements ModInitializer {
	public static final String MOD_ID = "plantsmodtwo";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		GeckoLib.initialize();
		ModBlockEntities.registerAllBlockEntites();
		BlockEntityRendererFactories.register(ModBlockEntities.SKELETON_BLOCK_ENTITY, SkeletonBlockRender::new);
		ModItems.registerModItems();
	}
}