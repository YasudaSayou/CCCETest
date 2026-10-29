package cn.jawbreakers.candycraftce.client;

import cn.jawbreakers.candycraftce.CandyCraftCE;
import cn.jawbreakers.candycraftce.init.CMenus;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;

@EventBusSubscriber(modid = CandyCraftCE.MOD_ID, value = Dist.CLIENT)
public class ClientEvents {

	@SubscribeEvent
	public static void registerScreens(RegisterMenuScreensEvent event) {
		event.register(CMenus.LICORICE_FURNACE.get(), LicoriceFurnaceScreen::new);
		event.register(CMenus.CHOCOLATE_FURNACE.get(), ChocolateFurnaceScreen::new);
	}
}