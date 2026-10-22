package cn.jawbreakers.candycraftce.block;

import cn.jawbreakers.candycraftce.init.*;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.neoforge.common.CommonHooks;

public class LollipopStemBlock extends CandyPlantBlock implements BonemealableBlock {
	public static final IntegerProperty AGE = BlockStateProperties.AGE_7;
	private static final VoxelShape[] SHAPE = {
		Block.box(6.0D, 0.0D, 6.0D, 10.0D, 2.0D, 10.0D),
		Block.box(6.0D, 0.0D, 6.0D, 10.0D, 4.0D, 10.0D),
		Block.box(6.0D, 0.0D, 6.0D, 10.0D, 6.0D, 10.0D),
		Block.box(6.0D, 0.0D, 6.0D, 10.0D, 8.0D, 10.0D),
		Block.box(6.0D, 0.0D, 6.0D, 10.0D, 10.0D, 10.0D),
		Block.box(6.0D, 0.0D, 6.0D, 10.0D, 12.0D, 10.0D),
		Block.box(6.0D, 0.0D, 6.0D, 10.0D, 14.0D, 10.0D),
		Block.box(6.0D, 0.0D, 6.0D, 10.0D, 16.0D, 10.0D)
	};

	public LollipopStemBlock(Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(AGE, Integer.valueOf(0)));
	}

	@Override
	protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
		return SHAPE[state.getValue(AGE)];
	}

	@Override
	protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
		return state.getBlock() instanceof PuddingFarmBlock;
	}

	@Override
	protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
		if (!level.isAreaLoaded(pos, 1)) return;
		if (level.getRawBrightness(pos, 0) >= 9) {
			if (CommonHooks.canCropGrow(level, pos, state, random.nextInt((int)(25.0F / CandyCropBlock.getGrowthSpeed(state, level, pos)) + 1) == 0)) {
				int i = state.getValue(AGE);
				if (i < 7) {
					level.setBlock(pos, state.setValue(AGE, Integer.valueOf(i + 1)), 2);
				} else {
					BlockPos above = pos.above();
					if (level.getBlockState(above).isAir()) {
						level.setBlockAndUpdate(above, CBlocks.LOLLIPOP_FRUIT.get().defaultBlockState());
					}
				}
				CommonHooks.fireCropGrowPost(level, pos, state);
			}
		}
	}

	@Override
	public ItemStack getCloneItemStack(BlockState state, HitResult target, LevelReader level, BlockPos pos, Player player) {
		return new ItemStack(CItems.LOLLIPOP_SEEDS.get());
	}

	@Override
	public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state) {
		return state.getValue(AGE) != 7;
	}

	@Override
	public boolean isBonemealSuccess(Level level, RandomSource random, BlockPos pos, BlockState state) {
		return true;
	}

	@Override
	public void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState state) {
		int i = Math.min(7, state.getValue(AGE) + Mth.nextInt(level.random, 2, 5));
		BlockState blockstate = state.setValue(AGE, Integer.valueOf(i));
		level.setBlock(pos, blockstate, 2);
		if (i == 7) {
			blockstate.randomTick(level, pos, level.random);
		}
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(AGE);
	}
}