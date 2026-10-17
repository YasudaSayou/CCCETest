package cn.jawbreakers.candycraftce.init;

import cn.jawbreakers.candycraftce.CandyCraftCE;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CCTab {

	public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CandyCraftCE.MOD_ID);

	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TAB = TABS.register("tab", () -> CreativeModeTab.builder()
		.title(Component.translatable("mod.candycraftce"))
		.icon(() -> new ItemStack(CItems.DRAGIBUS.get()))
		.displayItems((parameters, output) -> {
			output.accept(Items.SUGAR);
			output.accept(CItems.LICORICE);
			output.accept(CItems.HONEYCOMB);
			output.accept(CItems.HONEYCOMB_SHARD);
			output.accept(CItems.PEZ);
			output.accept(CItems.MARSHMALLOW_STICK);
			output.accept(CItems.SUGAR_CRYSTAL);
			output.accept(CItems.CARAMEL_BRICK);
			output.accept(CItems.CHOCOLATE_BRICK);
			output.accept(CItems.WHITE_CHOCOLATE_BRICK);
			output.accept(CItems.COTTON_CANDY);
			output.accept(CItems.GUMMY);
			//output.accept(CItems.GUMMY_BALL);
			output.accept(CItems.HOT_GUMMY);
			output.accept(CItems.CHOCOLATE_COIN);
			output.accept(CItems.NOUGAT_POWDER);
			output.accept(CItems.PEZ_DUST);
			output.accept(CItems.WAFFLE);
			output.accept(CItems.WAFFLE_NUGGET);
			output.accept(CItems.CANDIED_CHERRY);
			output.accept(CItems.CANDY_CANE);
			output.accept(CItems.CHEWING_GUM);
			output.accept(CItems.LOLLIPOP);
			output.accept(CItems.CHOCOLATE_LEAF);
			output.accept(CItems.WHITE_CHOCOLATE_LEAF);
			output.accept(CItems.CARAMEL_LEAF);
			output.accept(CItems.CANDIED_CHERRY_LEAF);
			output.accept(CItems.MAGICAL_LEAF);
			output.accept(CItems.CRANFISH);
			output.accept(CItems.CRANFISH_COOKED);
			output.accept(CItems.CRANFISH_SCALE);
			output.accept(CItems.DRAGIBUS);
			output.accept(CItems.LOLLIPOP_SEEDS);
			output.accept(CItems.JELLY_SENTRY_KEY);
			output.accept(CItems.JELLY_BOSS_KEY);
			output.accept(CItems.RECORD_1);
			output.accept(CItems.RECORD_2);
			output.accept(CItems.RECORD_3);
			output.accept(CItems.RECORD_4);
			output.accept(CItems.GINGERBREAD_EMBLEM);
			output.accept(CItems.JELLY_EMBLEM);
			output.accept(CItems.SKY_EMBLEM);
			output.accept(CItems.CHEWING_GUM_EMBLEM);
			output.accept(CItems.HONEYCOMB_EMBLEM);
			output.accept(CItems.CRANBERRY_EMBLEM);
			output.accept(CItems.NESSIE_EMBLEM);
			output.accept(CItems.SUGUARD_EMBLEM);

			output.accept(CBlocks.SWEET_GRASS_0);
			output.accept(CBlocks.SWEET_GRASS_1);
			output.accept(CBlocks.SWEET_GRASS_2);
			output.accept(CBlocks.SWEET_GRASS_3);
			output.accept(CBlocks.MINT);
			output.accept(CBlocks.ROPE_RASPBERRY);
			output.accept(CBlocks.BANANA_SEAWEED);
			output.accept(CBlocks.FRAISE_TAGADA_FLOWER);
			output.accept(CBlocks.GOLDEN_SUGAR_FLOWER);
			output.accept(CBlocks.ACID_MINT_FLOWER);
			output.accept(CBlocks.SUGAR_BLOCK);
			output.accept(CBlocks.CARAMEL_BLOCK);
			output.accept(CBlocks.CARAMEL_BRICKS);
			output.accept(CBlocks.CHOCOLATE_CARAMEL_BRICKS);
			output.accept(CBlocks.WHITE_CHOCOLATE_CARAMEL_BRICKS);
			output.accept(CBlocks.PUDDING);
			output.accept(CBlocks.CUSTARD_PUDDING);
			output.accept(CBlocks.PUDDING_FARMLAND);
		}).build());
}