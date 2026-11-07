package cn.jawbreakers.candycraftce.client;

import cn.jawbreakers.candycraftce.CandyCraftCE;
import cn.jawbreakers.candycraftce.init.*;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;

@EventBusSubscriber(modid = CandyCraftCE.MOD_ID, value = Dist.CLIENT)
public class ClientEvents {

	@SubscribeEvent
	public static void registerScreens(RegisterMenuScreensEvent event) {
		event.register(CMenus.LICORICE_FURNACE.get(), LicoriceFurnaceScreen::new);
		event.register(CMenus.CHOCOLATE_FURNACE.get(), ChocolateFurnaceScreen::new);
	}

	@SubscribeEvent
	public static void onClientSetup(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemBlockRenderTypes.setRenderLayer(CFluids.GRENADINE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(CFluids.FLOWING_GRENADINE.get(), RenderType.translucent());
		});
	}

	@SubscribeEvent
	public static void onClientExtensions(RegisterClientExtensionsEvent event) {
		event.registerFluidType(CFluidTypes.CARAMEL_TYPE.get().getClientExtensions(), CFluidTypes.CARAMEL_TYPE.get());
		event.registerFluidType(CFluidTypes.GRENADINE_TYPE.get().getClientExtensions(), CFluidTypes.GRENADINE_TYPE.get());
	}
}