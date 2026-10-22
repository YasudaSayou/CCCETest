package cn.jawbreakers.candycraftce.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class GoldenSugarFlowerBlock extends CandyPlantBlock {
	public GoldenSugarFlowerBlock(Properties properties) {
		super(properties);
	}

	@Override
	public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
		if (!level.isClientSide && entity instanceof LivingEntity living && level.random.nextFloat() < 0.005F) {
			living.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 40));
			living.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40));
		}
	}
}