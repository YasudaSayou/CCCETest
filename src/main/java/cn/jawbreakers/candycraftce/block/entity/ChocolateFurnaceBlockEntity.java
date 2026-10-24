package cn.jawbreakers.candycraftce.block.entity;

import cn.jawbreakers.candycraftce.init.*;
import cn.jawbreakers.candycraftce.inventory.ChocolateFurnaceMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.block.state.BlockState;

public class ChocolateFurnaceBlockEntity extends LicoriceFurnaceBlockEntity {
	public ChocolateFurnaceBlockEntity(BlockPos pos, BlockState state) {
		super(CBlockEntities.CHOCOLATE_FURNACE.get(), pos, state, CRecipes.SUGAR_SMELTING_RECIPE.get());
	}

	@Override
	protected Component getDefaultName() {
		return Component.translatable(this.getBlockState().getBlock().getDescriptionId());
	}

	@Override
	protected AbstractContainerMenu createMenu(int id, Inventory player) {
		return new ChocolateFurnaceMenu(id, player, this, this.dataAccess);
	}
}