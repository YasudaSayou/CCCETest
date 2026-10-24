package cn.jawbreakers.candycraftce.inventory;

import cn.jawbreakers.candycraftce.init.*;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.RecipeBookType;

public class ChocolateFurnaceMenu extends LicoriceFurnaceMenu {
	public ChocolateFurnaceMenu(int id, Inventory inventory) {
		super(CMenus.CHOCOLATE_FURNACE.get(), CRecipes.SUGAR_SMELTING_RECIPE.get(), RecipeBookType.FURNACE, id, inventory);
	}

	public ChocolateFurnaceMenu(int id, Inventory inventory, Container container, ContainerData data) {
		super(CMenus.CHOCOLATE_FURNACE.get(), CRecipes.SUGAR_SMELTING_RECIPE.get(), RecipeBookType.FURNACE, id, inventory, container, data);
	}
}