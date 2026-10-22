package cn.jawbreakers.candycraftce.block;

import cn.jawbreakers.candycraftce.util.CTags;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockState;

public class CandySaplingBlock extends SaplingBlock {
	public CandySaplingBlock(TreeGrower treeGrower, Properties properties) {
		super(treeGrower, properties);
	}

	@Override
	protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
		return state.is(CTags.PUDDING);
	}
}