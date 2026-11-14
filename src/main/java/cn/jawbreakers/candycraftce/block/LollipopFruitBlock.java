package cn.jawbreakers.candycraftce.block;

import cn.jawbreakers.candycraftce.init.*;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.HitResult;

public class LollipopFruitBlock extends CandyPlantBlock {
	public LollipopFruitBlock(Properties properties) {
		super(properties);
	}

	@Override
	protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
		return state.is(CBlocks.LOLLIPOP_STEM.get());
	}

	@Override
	public ItemStack getCloneItemStack(BlockState state, HitResult target, LevelReader level, BlockPos pos, Player player) {
		return new ItemStack(CItems.LOLLIPOP_SEEDS.get());
	}
}