package cn.jawbreakers.candycraftce.client;

import cn.jawbreakers.candycraftce.CandyCraftCE;
import cn.jawbreakers.candycraftce.inventory.LicoriceFurnaceMenu;
import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.client.gui.screens.recipebook.AbstractFurnaceRecipeBookComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class LicoriceFurnaceScreen extends AbstractFurnaceScreen<LicoriceFurnaceMenu> {
	private static final ResourceLocation TEXTURE = CandyCraftCE.prefix("textures/gui/licorice_furnace.png");
	private static final ResourceLocation LIT_PROGRESS_SPRITE = CandyCraftCE.prefix("licorice_lit_progress");
	private static final ResourceLocation BURN_PROGRESS_SPRITE = CandyCraftCE.prefix("licorice_burn_progress");

	public LicoriceFurnaceScreen(LicoriceFurnaceMenu menu, Inventory inventory, Component title) {
		super(menu, new AbstractFurnaceRecipeBookComponent(), inventory, title, TEXTURE, LIT_PROGRESS_SPRITE, BURN_PROGRESS_SPRITE);
	}
}