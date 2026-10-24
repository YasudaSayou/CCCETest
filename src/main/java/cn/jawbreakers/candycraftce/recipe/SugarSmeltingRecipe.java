package cn.jawbreakers.candycraftce.recipe;

import cn.jawbreakers.candycraftce.init.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;

public class SugarSmeltingRecipe extends AbstractCookingRecipe {
	public SugarSmeltingRecipe(String group, CookingBookCategory category, Ingredient ingredient, ItemStack result, float experience, int cookingTime) {
		super(CRecipes.SUGAR_SMELTING_RECIPE.get(), group, category, ingredient, result, experience, cookingTime);
	}

	@Override
	public ItemStack getToastSymbol() {
		return new ItemStack(CBlocks.LICORICE_FURNACE.get());
	}

	@Override
	public RecipeSerializer<?> getSerializer() {
		return CRecipes.SUGAR_SMELTING_SERIALIZER.get();
	}
}