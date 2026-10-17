package cn.jawbreakers.candycraftce.block;

import cn.jawbreakers.candycraftce.init.CBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.neoforged.neoforge.common.CommonHooks;
import net.neoforged.neoforge.common.FarmlandWaterManager;
import org.jetbrains.annotations.Nullable;

public class PuddingFarmBlock extends FarmBlock {
	public PuddingFarmBlock(Properties properties) {
		super(properties);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return !this.defaultBlockState().canSurvive(context.getLevel(), context.getClickedPos()) ? CBlocks.PUDDING.get().defaultBlockState() : this.defaultBlockState();
	}

	@Override
	protected void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
		if (!state.canSurvive(level, pos)) {
			turnToPudding(null, state, level, pos);
		}
	}

	@Override
	protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
		int i = state.getValue(MOISTURE);
		if (!isNearWater(level, pos) && !level.isRainingAt(pos.above())) {
			if (i > 0) {
				level.setBlock(pos, state.setValue(MOISTURE, Integer.valueOf(i - 1)), 2);
			} else if (!shouldMaintainFarmland(level, pos)) {
				turnToPudding(null, state, level, pos);
			}
		} else if (i < 7) {
			level.setBlock(pos, state.setValue(MOISTURE, Integer.valueOf(7)), 2);
		}
	}

	@Override
	public void fallOn(Level level, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
		if (!level.isClientSide && CommonHooks.onFarmlandTrample(level, pos, CBlocks.PUDDING.get().defaultBlockState(), fallDistance, entity)) {
			turnToPudding(entity, state, level, pos);
		}
		entity.causeFallDamage(fallDistance, 1.0F, entity.damageSources().fall());
	}

	public static void turnToPudding(@Nullable Entity entity, BlockState state, Level level, BlockPos pos) {
		BlockState blockstate = pushEntitiesUp(state, CBlocks.PUDDING.get().defaultBlockState(), level, pos);
		level.setBlockAndUpdate(pos, blockstate);
		level.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(entity, blockstate));
	}

	private static boolean shouldMaintainFarmland(BlockGetter level, BlockPos pos) {
		return level.getBlockState(pos.above()).is(BlockTags.MAINTAINS_FARMLAND);
	}

	private static boolean isNearWater(LevelReader level, BlockPos pos) {
		for (BlockPos blockpos : BlockPos.betweenClosed(pos.offset(-4, 0, -4), pos.offset(4, 1, 4))) {
			if (level.getBlockState(pos).canBeHydrated(level, pos, level.getFluidState(blockpos), blockpos)) {
				return true;
			}
		}
		return FarmlandWaterManager.hasBlockWaterTicket(level, pos);
	}
}