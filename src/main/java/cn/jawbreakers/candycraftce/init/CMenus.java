package cn.jawbreakers.candycraftce.init;

import cn.jawbreakers.candycraftce.CandyCraftCE;
import cn.jawbreakers.candycraftce.inventory.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CMenus {

	public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(Registries.MENU, CandyCraftCE.MOD_ID);

	public static final DeferredHolder<MenuType<?>, MenuType<LicoriceFurnaceMenu>> LICORICE_FURNACE = MENUS.register("licorice_furnace", () -> new MenuType<>(LicoriceFurnaceMenu::new, FeatureFlags.DEFAULT_FLAGS));
	public static final DeferredHolder<MenuType<?>, MenuType<ChocolateFurnaceMenu>> CHOCOLATE_FURNACE = MENUS.register("chocolate_furnace", () -> new MenuType<>(ChocolateFurnaceMenu::new, FeatureFlags.DEFAULT_FLAGS));
}