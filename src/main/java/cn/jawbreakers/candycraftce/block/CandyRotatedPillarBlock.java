package cn.jawbreakers.candycraftce.block;

import cn.jawbreakers.candycraftce.init.CBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.function.Supplier;

public class CandyRotatedPillarBlock extends RotatedPillarBlock {
	private static final Map<Supplier<Block>, Supplier<Block>> STRIP_MAP = Map.of(
		CBlocks.MARSHMALLOW_LOG, CBlocks.STRIPPED_MARSHMALLOW_LOG,
		CBlocks.DARK_MARSHMALLOW_LOG, CBlocks.STRIPPED_DARK_MARSHMALLOW_LOG,
		CBlocks.LIGHT_MARSHMALLOW_LOG, CBlocks.STRIPPED_LIGHT_MARSHMALLOW_LOG
	);

	public CandyRotatedPillarBlock(Properties properties) {
		super(properties);
	}

	@Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

	@Override
	public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ItemAbility itemAbility, boolean simulate) {
		if (itemAbility == ItemAbilities.AXE_STRIP) {
			for (var entry : STRIP_MAP.entrySet()) {
				if (entry.getKey().get() == state.getBlock()) {
					return entry.getValue().get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
				}
			}
		}
		return super.getToolModifiedState(state, context, itemAbility, simulate);
	}
}