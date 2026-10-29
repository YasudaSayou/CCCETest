package cn.jawbreakers.candycraftce.inventory;

import cn.jawbreakers.candycraftce.init.*;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class LicoriceFurnaceMenu extends AbstractFurnaceMenu {
	public LicoriceFurnaceMenu(int id, Inventory inventory) {
		super(CMenus.LICORICE_FURNACE.get(), CRecipes.SUGAR_SMELTING_RECIPE.get(), RecipeBookType.FURNACE, id, inventory);
	}

	public LicoriceFurnaceMenu(int id, Inventory inventory, Container container, ContainerData data) {
		super(CMenus.LICORICE_FURNACE.get(), CRecipes.SUGAR_SMELTING_RECIPE.get(), RecipeBookType.FURNACE, id, inventory, container, data);
	}

	@Override
	protected boolean isFuel(ItemStack stack) {
		return stack.is(Items.SUGAR);
	}
}