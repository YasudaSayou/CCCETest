package cn.jawbreakers.candycraftce.block;

import cn.jawbreakers.candycraftce.block.entity.LicoriceFurnaceBlockEntity;
import cn.jawbreakers.candycraftce.init.CBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.stats.Stats;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.FurnaceBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class LicoriceFurnaceBlock extends FurnaceBlock {
	public LicoriceFurnaceBlock(Properties properties) {
		super(properties);
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new LicoriceFurnaceBlockEntity(pos, state);
	}

	@Nullable
	@Override
	public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
		return createFurnaceTicker(level, type, CBlockEntities.LICORICE_FURNACE.get());
	}

	@Override
	protected void openContainer(Level level, BlockPos pos, Player player) {
		BlockEntity blockEntity = level.getBlockEntity(pos);
		if (blockEntity instanceof LicoriceFurnaceBlockEntity) {
			player.openMenu((MenuProvider)blockEntity);
			player.awardStat(Stats.INTERACT_WITH_FURNACE);
		}
	}
}