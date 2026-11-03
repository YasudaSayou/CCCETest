package cn.jawbreakers.candycraftce.block;

import cn.jawbreakers.candycraftce.init.CItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.neoforge.common.util.TriState;

public class CandyCropBlock extends CropBlock {
	private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{
		Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
		Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
		Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
		Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
		Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
		Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D),
		Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D),
		Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D)
	};

	public CandyCropBlock(Properties properties) {
		super(properties);
	}

	@Override
	protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
		return SHAPE_BY_AGE[this.getAge(state)];
	}

	@Override
	protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
		return state.getBlock() instanceof PuddingFarmBlock;
	}

	protected static float getGrowthSpeed(BlockState blockState, BlockGetter level, BlockPos pos) {
		Block block = blockState.getBlock();
		float f = 1.0F;
		BlockPos blockpos = pos.below();
		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				float g = 0.0F;
				BlockState blockstate = level.getBlockState(blockpos.offset(i, 0, j));
				TriState soilDecision = blockstate.canSustainPlant(level, blockpos.offset(i, 0, j), Direction.UP, blockState);
				if (soilDecision.isDefault() ? blockstate.getBlock() instanceof PuddingFarmBlock : soilDecision.isTrue()) {
					g = 1.0F;
					if (blockstate.isFertile(level, pos.offset(i, 0, j))) {
						g = 3.0F;
					}
				}
				if (i != 0 || j != 0) {
					g /= 4.0F;
				}
				f += g;
			}
		}
		BlockPos blockpos1 = pos.north();
		BlockPos blockpos2 = pos.south();
		BlockPos blockpos3 = pos.west();
		BlockPos blockpos4 = pos.east();
		boolean flag = level.getBlockState(blockpos3).is(block) || level.getBlockState(blockpos4).is(block);
		boolean flag1 = level.getBlockState(blockpos1).is(block) || level.getBlockState(blockpos2).is(block);
		if (flag && flag1) {
			f /= 2.0F;
		} else {
			boolean flag2 = level.getBlockState(blockpos3.north()).is(block) || level.getBlockState(blockpos4.north()).is(block) || level.getBlockState(blockpos4.south()).is(block) || level.getBlockState(blockpos3.south()).is(block);
			if (flag2) {
				f /= 2.0F;
			}
		}
		return f;
	}

	@Override
	protected ItemLike getBaseSeedId() {
		return CItems.DRAGIBUS.get();
	}
}