package cn.jawbreakers.candycraftce.block;

import cn.jawbreakers.candycraftce.init.CItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ChewingGumPuddleBlock extends Block {
	private static final VoxelShape SHAPE = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 0.25D, 15.0D);

	public ChewingGumPuddleBlock(Properties properties) {
		super(properties);
	}

	@Override
	protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
		return SHAPE;
	}

	@Override
	protected BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
		return !state.canSurvive(level, pos) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, direction, neighborState, level, pos, neighborPos);
	}

	@Override
	protected boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
		return canSupportCenter(level, pos.below(), Direction.UP);
	}

	@Override
	protected void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
		if (entity instanceof Player player && player.getInventory().contains(stack -> stack.is(CItems.CHEWING_GUM_EMBLEM.get()))) {
			entity.resetFallDistance();
			return;
		}
		if (entity.getY() <= pos.getY() + 0.25D) entity.makeStuckInBlock(state, new Vec3(0.6D, 0.2D, 0.6D));
	}
}