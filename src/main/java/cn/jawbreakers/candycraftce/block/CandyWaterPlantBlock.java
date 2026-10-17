package cn.jawbreakers.candycraftce.block;

import cn.jawbreakers.candycraftce.init.CBlocks;
import cn.jawbreakers.candycraftce.util.CTags;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.SeagrassBlock;
import net.minecraft.world.level.block.state.BlockState;

public class CandyWaterPlantBlock extends SeagrassBlock {
	public CandyWaterPlantBlock(Properties properties) {
		super(properties);
	}

	@Override
	protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
		return state.is(CTags.CANDY_PLANT_SUITABLE) || (this == CBlocks.ROPE_RASPBERRY.get() && state.is(CBlocks.ROPE_RASPBERRY.get()));
	}

	@Override
	public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state) {
		return false;
	}
}