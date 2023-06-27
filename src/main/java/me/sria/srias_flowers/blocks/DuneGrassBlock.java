package me.sria.srias_flowers.blocks;

import net.minecraft.block.*;
import net.minecraft.tag.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;

public class DuneGrassBlock extends PlantBlock {
	
	public DuneGrassBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
		return floor.isIn(BlockTags.SAND) || floor.isOf(Blocks.GRAVEL);
	}
	
}
