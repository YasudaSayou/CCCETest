package cn.jawbreakers.candycraftce.block;

import cn.jawbreakers.candycraftce.util.CTags;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;

public class CandyPlantBlock extends BushBlock {
	public static final MapCodec<CandyPlantBlock> CODEC = simpleCodec(CandyPlantBlock::new);

	public CandyPlantBlock(Properties properties) {
		super(properties);
	}

	@Override
	public MapCodec<? extends BushBlock> codec() {
		return CODEC;
	}

	@Override
	protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
		return state.is(CTags.CANDY_PLANT_SUITABLE);
	}
}