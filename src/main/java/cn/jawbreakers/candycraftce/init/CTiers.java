package cn.jawbreakers.candycraftce.init;

import cn.jawbreakers.candycraftce.util.CTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class CTiers {
	public static final Tier MARSHMALLOW = new SimpleTier(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 59, 2.0F, 0.0F, 15, () -> Ingredient.of(CTags.MARSHMALLOW_PLANKS));
	public static final Tier LICORICE = new SimpleTier(BlockTags.INCORRECT_FOR_STONE_TOOL, 131, 4.0F, 1.0F, 5, () -> Ingredient.of(CItems.LICORICE));
	public static final Tier HONEY = new SimpleTier(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 6.0F, 2.0F, 14, () -> Ingredient.of(CItems.HONEYCOMB));
	public static final Tier PEZ = new SimpleTier(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 8.0F, 3.0F, 10, () -> Ingredient.of(CItems.PEZ));
}