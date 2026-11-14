package cn.jawbreakers.candycraftce.event;

import cn.jawbreakers.candycraftce.CandyCraftCE;
import cn.jawbreakers.candycraftce.init.CBlocks;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@EventBusSubscriber(modid = CandyCraftCE.MOD_ID)
public class ModEvents {

	@SubscribeEvent
	public static void onCommonSetup(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			FireBlock fireblock = (FireBlock) Blocks.FIRE;
			fireblock.setFlammable(CBlocks.MARSHMALLOW_PLANKS.get(), 5, 20);
			fireblock.setFlammable(CBlocks.DARK_MARSHMALLOW_PLANKS.get(), 5, 20);
			fireblock.setFlammable(CBlocks.LIGHT_MARSHMALLOW_PLANKS.get(), 5, 20);
			fireblock.setFlammable(CBlocks.CHOCOLATE_LEAVES.get(), 30, 60);
			fireblock.setFlammable(CBlocks.WHITE_CHOCOLATE_LEAVES.get(), 30, 60);
			fireblock.setFlammable(CBlocks.CARAMEL_LEAVES.get(), 30, 60);
			fireblock.setFlammable(CBlocks.CANDIED_CHERRY_LEAVES.get(), 30, 60);
			fireblock.setFlammable(CBlocks.MAGICAL_LEAVES.get(), 30, 60);
			fireblock.setFlammable(CBlocks.MARSHMALLOW_FENCE.get(), 5, 20);
			fireblock.setFlammable(CBlocks.DARK_MARSHMALLOW_FENCE.get(), 5, 20);
			fireblock.setFlammable(CBlocks.LIGHT_MARSHMALLOW_FENCE.get(), 5, 20);
			fireblock.setFlammable(CBlocks.MARSHMALLOW_SLAB.get(), 5, 20);
			fireblock.setFlammable(CBlocks.DARK_MARSHMALLOW_SLAB.get(), 5, 20);
			fireblock.setFlammable(CBlocks.LIGHT_MARSHMALLOW_SLAB.get(), 5, 20);
			fireblock.setFlammable(CBlocks.MARSHMALLOW_STAIRS.get(), 5, 20);
			fireblock.setFlammable(CBlocks.DARK_MARSHMALLOW_STAIRS.get(), 5, 20);
			fireblock.setFlammable(CBlocks.LIGHT_MARSHMALLOW_STAIRS.get(), 5, 20);
			fireblock.setFlammable(CBlocks.MARSHMALLOW_FENCE_GATE.get(), 5, 20);
			fireblock.setFlammable(CBlocks.DARK_MARSHMALLOW_FENCE_GATE.get(), 5, 20);
			fireblock.setFlammable(CBlocks.LIGHT_MARSHMALLOW_FENCE_GATE.get(), 5, 20);
		});
	}
}