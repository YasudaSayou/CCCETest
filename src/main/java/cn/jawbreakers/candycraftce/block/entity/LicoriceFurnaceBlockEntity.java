package cn.jawbreakers.candycraftce.block.entity;

import cn.jawbreakers.candycraftce.init.*;
import cn.jawbreakers.candycraftce.inventory.LicoriceFurnaceMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class LicoriceFurnaceBlockEntity extends AbstractFurnaceBlockEntity {
	public LicoriceFurnaceBlockEntity(BlockPos pos, BlockState state) {
		super(CBlockEntities.LICORICE_FURNACE.get(), pos, state, CRecipes.SUGAR_SMELTING_RECIPE.get());
	}

	@Override
	protected Component getDefaultName() {
		return Component.translatable("block.candycraftce.licorice_furnace");
	}

	@Override
	protected int getBurnDuration(ItemStack fuel) {
		return fuel.is(Items.SUGAR) ? 300 : super.getBurnDuration(fuel);
	}

	@Override
	public boolean canPlaceItem(int index, ItemStack stack) {
		return index != 2 && (index != 1 || stack.is(Items.SUGAR));
	}

	@Override
	protected AbstractContainerMenu createMenu(int id, Inventory player) {
		return new LicoriceFurnaceMenu(id, player, this, this.dataAccess);
	}
}