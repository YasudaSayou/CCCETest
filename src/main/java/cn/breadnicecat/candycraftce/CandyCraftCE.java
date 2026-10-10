package cn.breadnicecat.candycraftce;

import cn.breadnicecat.candycraftce.init.*;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import org.slf4j.Logger;

import java.util.Locale;

@Mod(CandyCraftCE.MOD_ID)
public class CandyCraftCE {
	public static final String MOD_ID = "candycraftce";
	public static final Logger LOGGER = LogUtils.getLogger();

	public CandyCraftCE(IEventBus bus, ModContainer modContainer) {
		CItems.ITEMS.register(bus);
		CSounds.SOUNDS.register(bus);
		CCTab.TABS.register(bus);
	}

	public static ResourceLocation prefix(String name) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, name.toLowerCase(Locale.ROOT));
	}
}