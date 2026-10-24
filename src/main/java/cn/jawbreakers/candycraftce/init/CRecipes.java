package cn.jawbreakers.candycraftce.init;

import cn.jawbreakers.candycraftce.CandyCraftCE;
import cn.jawbreakers.candycraftce.recipe.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SimpleCookingSerializer;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CRecipes {

	public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(Registries.RECIPE_SERIALIZER, CandyCraftCE.MOD_ID);
	public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(Registries.RECIPE_TYPE, CandyCraftCE.MOD_ID);

	public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<SugarSmeltingRecipe>> SUGAR_SMELTING_SERIALIZER = RECIPE_SERIALIZERS.register("sugar_smelting", new SimpleCookingSerializer<>(SugarSmeltingRecipe::new, 200));

	public static final DeferredHolder<RecipeType<?>, RecipeType<SugarSmeltingRecipe>> SUGAR_SMELTING_RECIPE = RECIPE_TYPES.register("sugar_smelting", () -> RecipeType.simple(CandyCraftCE.prefix("sugar_smelting")));
}