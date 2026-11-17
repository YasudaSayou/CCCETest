package cn.jawbreakers.candycraftce.event;

import cn.jawbreakers.candycraftce.CandyCraftCE;
import cn.jawbreakers.candycraftce.init.*;
import cn.jawbreakers.candycraftce.util.CTags;
import net.minecraft.core.BlockPos;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;
import net.minecraft.world.level.gameevent.GameEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.entity.player.UseItemOnBlockEvent;
import net.neoforged.neoforge.registries.datamaps.RegisterDataMapTypesEvent;

@EventBusSubscriber(modid = CandyCraftCE.MOD_ID)
public class ModEvents {

	@SubscribeEvent
	public static void onCommonSetup(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			FireBlock fireblock = (FireBlock) Blocks.FIRE;
			fireblock.setFlammable(CBlocks.MARSHMALLOW_LOG.get(), 5, 5);
			fireblock.setFlammable(CBlocks.DARK_MARSHMALLOW_LOG.get(), 5, 5);
			fireblock.setFlammable(CBlocks.LIGHT_MARSHMALLOW_LOG.get(), 5, 5);
			fireblock.setFlammable(CBlocks.STRIPPED_MARSHMALLOW_LOG.get(), 5, 5);
			fireblock.setFlammable(CBlocks.STRIPPED_DARK_MARSHMALLOW_LOG.get(), 5, 5);
			fireblock.setFlammable(CBlocks.STRIPPED_LIGHT_MARSHMALLOW_LOG.get(), 5, 5);
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

	@SubscribeEvent
	public static void onUseItemOnBlock(UseItemOnBlockEvent event) {
		if (event.getUsePhase() != UseItemOnBlockEvent.UsePhase.ITEM_AFTER_BLOCK) return;
		Player player = event.getPlayer();
		if (player == null) return;
		ItemStack stack = event.getItemStack();
		BlockPos pos = event.getPos();
		Level level = event.getLevel();

		if (stack.is(Items.SUGAR) && level.getBlockState(pos).is(CTags.SUGAR_GROWABLES) && BoneMealItem.applyBonemeal(stack, level, pos, player)) {
			if (!level.isClientSide) {
				player.gameEvent(GameEvent.ITEM_INTERACT_FINISH);
				level.levelEvent(1505, pos, 15);
			}
			event.cancelWithResult(ItemInteractionResult.sidedSuccess(level.isClientSide));
		}
	}

	@SubscribeEvent
	public static void onDataMapTypes(RegisterDataMapTypesEvent event) {
		event.register(CDataMaps.SUGAR_FURNACE_FUELS);
	}
}