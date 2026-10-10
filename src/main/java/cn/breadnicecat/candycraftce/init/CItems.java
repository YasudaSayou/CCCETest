package cn.breadnicecat.candycraftce.init;

import cn.breadnicecat.candycraftce.CandyCraftCE;
import cn.breadnicecat.candycraftce.item.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CandyCraftCE.MOD_ID);

	public static final DeferredItem<Item> LICORICE = ITEMS.register("licorice", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationModifier(0.35F).build())));
	public static final DeferredItem<Item> HONEYCOMB = ITEMS.register("honeycomb", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationModifier(0.25F).build())));
	public static final DeferredItem<Item> HONEYCOMB_SHARD = ITEMS.register("honeycomb_shard", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.17F).build())));
	public static final DeferredItem<Item> PEZ = ITEMS.register("pez", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationModifier(0.5F).effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 1200), 1.0F).build())));
	public static final DeferredItem<Item> MARSHMALLOW_STICK = ITEMS.register("marshmallow_stick", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.5F).build())));
	public static final DeferredItem<Item> SUGAR_CRYSTAL = ITEMS.register("sugar_crystal", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationModifier(0.25F).build())));
	public static final DeferredItem<Item> CARAMEL_BRICK = ITEMS.register("caramel_brick", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.25F).build())));
	public static final DeferredItem<Item> CHOCOLATE_BRICK = ITEMS.register("chocolate_brick", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.25F).build())));
	public static final DeferredItem<Item> WHITE_CHOCOLATE_BRICK = ITEMS.register("white_chocolate_brick", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.25F).build())));
	public static final DeferredItem<Item> COTTON_CANDY = ITEMS.register("cotton_candy", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.5F).build())));
	public static final DeferredItem<Item> GUMMY = ITEMS.register("gummy", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.5F).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200), 0.8F).build())));
	//public static final DeferredItem<Item> GUMMY_BALL = ITEMS.register("gummy_ball", () -> new GummyBallItem(new Item.Properties()));
	public static final DeferredItem<Item> HOT_GUMMY = ITEMS.register("hot_gummy", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.5F).build())));
	public static final DeferredItem<Item> CHOCOLATE_COIN = ITEMS.register("chocolate_coin", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationModifier(1.0F).effect(() -> new MobEffectInstance(MobEffects.GLOWING, 100), 1.0F).build())));
	public static final DeferredItem<Item> NOUGAT_POWDER = ITEMS.register("nougat_powder", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> PEZ_DUST = ITEMS.register("pez_dust", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationModifier(0.4F).effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 1200), 1.0F).fast().alwaysEdible().build())));
	public static final DeferredItem<Item> WAFFLE = ITEMS.register("waffle", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationModifier(0.25F).build())));
	public static final DeferredItem<Item> WAFFLE_NUGGET = ITEMS.register("waffle_nugget", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.5F).build())));
	public static final DeferredItem<Item> CANDIED_CHERRY = ITEMS.register("candied_cherry", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.5F).build())));
	public static final DeferredItem<Item> CANDY_CANE = ITEMS.register("candy_cane", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.5F).build())));
	public static final DeferredItem<Item> CHEWING_GUM = ITEMS.register("chewing_gum", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0F).build())));
	public static final DeferredItem<Item> LOLLIPOP = ITEMS.register("lollipop", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.5F).build())));
	public static final DeferredItem<Item> CHOCOLATE_LEAF = ITEMS.register("chocolate_leaf", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.5F).build())));
	public static final DeferredItem<Item> WHITE_CHOCOLATE_LEAF = ITEMS.register("white_chocolate_leaf", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.5F).build())));
	public static final DeferredItem<Item> CARAMEL_LEAF = ITEMS.register("caramel_leaf", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.5F).build())));
	public static final DeferredItem<Item> CANDIED_CHERRY_LEAF = ITEMS.register("candied_cherry_leaf", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.5F).build())));
	public static final DeferredItem<Item> MAGICAL_LEAF = ITEMS.register("magical_leaf", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.5F).build())));
	public static final DeferredItem<Item> CRANFISH = ITEMS.register("cranfish", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.25F).effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 1200), 1.0F).build())));
	public static final DeferredItem<Item> CRANFISH_COOKED = ITEMS.register("cranfish_cooked", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationModifier(0.5F).build())));
	public static final DeferredItem<Item> CRANFISH_SCALE = ITEMS.register("cranfish_scale", () -> new Item(new Item.Properties()));
	//public static final DeferredItem<Item> DRAGIBUS = ITEMS.register("dragibus", () -> new ItemNameBlockItem(CBlocks.DRAGIBUS_CROPS.get(), new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.5F).build())));
	//public static final DeferredItem<Item> LOLLIPOP_SEEDS = ITEMS.register("lollipop_seeds", () -> new ItemNameBlockItem(CBlocks.LOLLIPOP_STEM.get(), new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0F).build())));
	public static final DeferredItem<Item> JELLY_SENTRY_KEY = ITEMS.register("jelly_sentry_key", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON)));
	public static final DeferredItem<Item> JELLY_BOSS_KEY = ITEMS.register("jelly_boss_key", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON)));
	//public static final DeferredItem<DungeonsKeyItem> JELLY_DUNGEON_KEY = ITEMS.register("jelly_dungeon_key", () -> new DungeonsKeyItem(JELLY_DUNGEON_TELEPORTER.get(), new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON)));
	public static final DeferredItem<Item> RECORD_o = ITEMS.register("record_o", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC).jukeboxPlayable(CJukeboxSongs.CD_o)));
	public static final DeferredItem<Item> RECORD_1 = ITEMS.register("record_1", () -> new Item(new Item.Properties().stacksTo(1).jukeboxPlayable(CJukeboxSongs.CD_1)));
	public static final DeferredItem<Item> RECORD_2 = ITEMS.register("record_2", () -> new Item(new Item.Properties().stacksTo(1).jukeboxPlayable(CJukeboxSongs.CD_2)));
	public static final DeferredItem<Item> RECORD_3 = ITEMS.register("record_3", () -> new Item(new Item.Properties().stacksTo(1).jukeboxPlayable(CJukeboxSongs.CD_3)));
	public static final DeferredItem<Item> RECORD_4 = ITEMS.register("record_4", () -> new Item(new Item.Properties().stacksTo(1).jukeboxPlayable(CJukeboxSongs.CD_4)));
	public static final DeferredItem<Item> GINGERBREAD_EMBLEM = ITEMS.register("gingerbread_emblem", () -> new EmblemItem("gingerbread_emblem", new Item.Properties()));
	public static final DeferredItem<Item> JELLY_EMBLEM = ITEMS.register("jelly_emblem", () -> new EmblemItem("jelly_emblem", new Item.Properties()));
	public static final DeferredItem<Item> SKY_EMBLEM = ITEMS.register("sky_emblem", () -> new EmblemItem("sky_emblem", new Item.Properties()));
	public static final DeferredItem<Item> CHEWING_GUM_EMBLEM = ITEMS.register("chewing_gum_emblem", () -> new EmblemItem("chewing_gum_emblem", new Item.Properties()));
	public static final DeferredItem<Item> HONEYCOMB_EMBLEM = ITEMS.register("honeycomb_emblem", () -> new EmblemItem("honeycomb_emblem", new Item.Properties()));
	public static final DeferredItem<Item> CRANBERRY_EMBLEM = ITEMS.register("cranberry_emblem", () -> new EmblemItem("cranberry_emblem", new Item.Properties()));
	public static final DeferredItem<Item> NESSIE_EMBLEM = ITEMS.register("nessie_emblem", () -> new EmblemItem("nessie_emblem", new Item.Properties()));
	public static final DeferredItem<Item> SUGUARD_EMBLEM = ITEMS.register("suguard_emblem", () -> new EmblemItem("suguard_emblem", new Item.Properties()));
}