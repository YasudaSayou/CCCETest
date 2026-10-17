package cn.jawbreakers.candycraftce.util;

import cn.jawbreakers.candycraftce.CandyCraftCE;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class CTags {
	public static final TagKey<Block> CANDY_PLANT_SUITABLE = blockTag("candy_plant_suitable");

	public static TagKey<Block> blockTag(String name) {
		return TagKey.create(Registries.BLOCK, CandyCraftCE.prefix(name));
	}
}