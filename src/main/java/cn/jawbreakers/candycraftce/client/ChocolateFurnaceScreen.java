package cn.jawbreakers.candycraftce.client;

import cn.jawbreakers.candycraftce.CandyCraftCE;
import cn.jawbreakers.candycraftce.inventory.ChocolateFurnaceMenu;
import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.client.gui.screens.recipebook.AbstractFurnaceRecipeBookComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class ChocolateFurnaceScreen extends AbstractFurnaceScreen<ChocolateFurnaceMenu> {
	private static final ResourceLocation TEXTURE = CandyCraftCE.prefix("textures/gui/chocolate_furnace.png");
	private static final ResourceLocation LIT_PROGRESS_SPRITE = CandyCraftCE.prefix("chocolate_lit_progress");
	private static final ResourceLocation BURN_PROGRESS_SPRITE = CandyCraftCE.prefix("chocolate_burn_progress");

	public ChocolateFurnaceScreen(ChocolateFurnaceMenu menu, Inventory inventory, Component title) {
		super(menu, new AbstractFurnaceRecipeBookComponent(), inventory, title, TEXTURE, LIT_PROGRESS_SPRITE, BURN_PROGRESS_SPRITE);
	}
}