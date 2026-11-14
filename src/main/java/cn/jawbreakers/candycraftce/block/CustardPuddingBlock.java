package cn.jawbreakers.candycraftce.block;

import cn.jawbreakers.candycraftce.init.CBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.lighting.LightEngine;

public class CustardPuddingBlock extends Block {
	public CustardPuddingBlock(Properties properties) {
		super(properties);
	}

	private static boolean canBeGrass(BlockState state, LevelReader level, BlockPos pos) {
		BlockPos blockPos = pos.above();
		BlockState blockState = level.getBlockState(blockPos);
		if (blockState.getFluidState().getAmount() == 8) {
			return false;
		}
		int i = LightEngine.getLightBlockInto(level, state, pos, blockState, blockPos, Direction.UP, blockState.getLightBlock(level, blockPos));
		return i < level.getMaxLightLevel();
	}

	private static boolean canPropagate(BlockState state, LevelReader level, BlockPos pos) {
		BlockPos blockPos = pos.above();
		return canBeGrass(state, level, pos) && !level.getFluidState(blockPos).is(FluidTags.WATER);
	}

	@Override
	protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
		if (!canBeGrass(state, level, pos)) {
			if (!level.isAreaLoaded(pos, 1)) return;
			level.setBlockAndUpdate(pos, CBlocks.PUDDING.get().defaultBlockState());
		} else {
			if (!level.isAreaLoaded(pos, 3)) return;
			if (level.getMaxLocalRawBrightness(pos.above()) >= 9) {
				BlockState blockState = this.defaultBlockState();
				for (int i = 0; i < 4; i++) {
					BlockPos blockPos = pos.offset(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
					if (level.getBlockState(blockPos).is(CBlocks.PUDDING.get()) && canPropagate(blockState, level, blockPos)) {
						level.setBlockAndUpdate(blockPos, blockState);
					}
				}
			}
		}
	}
}