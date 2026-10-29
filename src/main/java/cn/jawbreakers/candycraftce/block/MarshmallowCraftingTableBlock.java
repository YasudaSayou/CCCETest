package cn.jawbreakers.candycraftce.block;

import cn.jawbreakers.candycraftce.init.CBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.world.level.block.state.BlockState;

public class MarshmallowCraftingTableBlock extends CraftingTableBlock {
	public MarshmallowCraftingTableBlock(Properties properties) {
		super(properties);
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
		return new SimpleMenuProvider((i, inventory, player) -> {
			ContainerLevelAccess access = ContainerLevelAccess.create(level, pos);
			return new CraftingMenu(i, inventory, access) {
				@Override
				public boolean stillValid(Player player) {
					return stillValid(access, player, CBlocks.MARSHMALLOW_CRAFTING_TABLE.get());
				}
			};
		}, Component.translatable("container.crafting"));
	}
}