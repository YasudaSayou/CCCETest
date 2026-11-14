package cn.jawbreakers.candycraftce.block;

import cn.jawbreakers.candycraftce.init.CBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.HalfTransparentBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class JellyBlock extends HalfTransparentBlock {
	private final double jump;

	public JellyBlock(double jump, Properties properties) {
		super(properties);
		this.jump = jump;
	}

	@Override
	protected VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
		return jump == -1.0D ? super.getCollisionShape(state, level, pos, context) : box(0.0D, 0.0D, 0.0D, 16.0D, 15.92D, 16.0D);
	}

	@Override
	protected VoxelShape getBlockSupportShape(BlockState state, BlockGetter reader, BlockPos pos) {
		return Shapes.block();
	}

	@Override
	protected VoxelShape getVisualShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context) {
		return Shapes.block();
	}

	@Override
	public void fallOn(Level level, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
		if (jump == -1.0D || state.is(CBlocks.SOFT_TRAMPOJELLY.get())) {
			entity.resetFallDistance();
		} else {
			super.fallOn(level, state, pos, entity, fallDistance);
		}
	}

	@Override
	protected void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
		if (jump != -1.0D && entity instanceof LivingEntity && !entity.isShiftKeyDown()) {
			Vec3 movement = entity.getDeltaMovement();
			if (movement.y <= 0.0D) {
				entity.setDeltaMovement(movement.x, movement.y + jump, movement.z);
				entity.resetFallDistance();
				entity.hasImpulse = true;
			}
		}
	}
}