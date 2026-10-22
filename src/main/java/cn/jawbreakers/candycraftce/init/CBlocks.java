package cn.jawbreakers.candycraftce.init;

import cn.jawbreakers.candycraftce.CandyCraftCE;
import cn.jawbreakers.candycraftce.block.*;
import cn.jawbreakers.candycraftce.util.CTreeGrower;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CBlocks {

	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(CandyCraftCE.MOD_ID);

	public static final DeferredBlock<Block> SWEET_GRASS_0 = register("sweet_grass_0", () -> new CandyPlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SHORT_GRASS).mapColor(DyeColor.PINK)));
	public static final DeferredBlock<Block> SWEET_GRASS_1 = register("sweet_grass_1", () -> new CandyPlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SHORT_GRASS).mapColor(MapColor.COLOR_PINK)));
	public static final DeferredBlock<Block> SWEET_GRASS_2 = register("sweet_grass_2", () -> new CandyPlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SHORT_GRASS).mapColor(MapColor.SAND)));
	public static final DeferredBlock<Block> SWEET_GRASS_3 = register("sweet_grass_3", () -> new CandyPlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SHORT_GRASS).mapColor(MapColor.TERRACOTTA_PINK)));
	public static final DeferredBlock<Block> MINT = register("mint", () -> new CandyWaterPlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SEAGRASS)));
	public static final DeferredBlock<Block> ROPE_RASPBERRY = register("rope_raspberry", () -> new CandyWaterPlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SEAGRASS).mapColor(MapColor.COLOR_PINK)));
	public static final DeferredBlock<Block> BANANA_SEAWEED = register("banana_seaweed", () -> new CandyWaterPlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SEAGRASS).mapColor(MapColor.COLOR_YELLOW)));
	public static final DeferredBlock<Block> FRAISE_TAGADA_FLOWER = register("fraise_tagada_flower", () -> new CandyPlantBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POPPY).mapColor(MapColor.COLOR_RED)));
	public static final DeferredBlock<Block> GOLDEN_SUGAR_FLOWER = register("golden_sugar_flower", () -> new GoldenSugarFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POPPY).mapColor(MapColor.GOLD)));
	public static final DeferredBlock<Block> ACID_MINT_FLOWER = register("acid_mint_flower", () -> new AcidMintFlowerBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POPPY)));
	public static final DeferredBlock<Block> DRAGIBUS_CROP = BLOCKS.register("dragibus_crop", () -> new CandyCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));
	public static final DeferredBlock<Block> LOLLIPOP_STEM = BLOCKS.register("lollipop_stem", () -> new LollipopStemBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).mapColor(MapColor.COLOR_PINK)));
	public static final DeferredBlock<Block> LOLLIPOP_FRUIT = BLOCKS.register("lollipop_fruit", () -> new LollipopFruitBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).mapColor(MapColor.COLOR_PINK)));
	public static final DeferredBlock<Block> SUGAR_BLOCK = register("sugar_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SAND).mapColor(MapColor.WOOL)));
	public static final DeferredBlock<Block> CARAMEL_BLOCK = register("caramel_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.COLOR_BROWN)));
	public static final DeferredBlock<Block> CARAMEL_BRICKS = register("caramel_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(CARAMEL_BLOCK.get())));
	public static final DeferredBlock<Block> CHOCOLATE_CARAMEL_BRICKS = register("chocolate_caramel_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(CARAMEL_BLOCK.get())));
	public static final DeferredBlock<Block> WHITE_CHOCOLATE_CARAMEL_BRICKS = register("white_chocolate_caramel_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(CARAMEL_BLOCK.get())));
	public static final DeferredBlock<Block> PUDDING = register("pudding", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).mapColor(MapColor.WOOL).sound(CSoundTypes.JELLY)));
	public static final DeferredBlock<Block> CUSTARD_PUDDING = register("custard_pudding", () -> new CustardPuddingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRASS_BLOCK).mapColor(MapColor.TERRACOTTA_PINK).sound(CSoundTypes.JELLY)));
	public static final DeferredBlock<Block> PUDDING_FARMLAND = register("pudding_farmland", () -> new PuddingFarmBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.FARMLAND).sound(CSoundTypes.JELLY)));
	public static final DeferredBlock<Block> ICE_CREAM = register("ice_cream", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SNOW_BLOCK)));
	public static final DeferredBlock<Block> MINT_ICE_CREAM = register("mint_ice_cream", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SNOW_BLOCK).mapColor(MapColor.GLOW_LICHEN)));
	public static final DeferredBlock<Block> STRAWBERRY_ICE_CREAM = register("strawberry_ice_cream", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SNOW_BLOCK).mapColor(MapColor.COLOR_PINK)));
	public static final DeferredBlock<Block> BLUEBERRY_ICE_CREAM = register("blueberry_ice_cream", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SNOW_BLOCK).mapColor(MapColor.COLOR_BLUE)));
	public static final DeferredBlock<Block> MINT_BLOCK = register("mint_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.HAY_BLOCK).mapColor(MapColor.COLOR_LIGHT_GREEN)));
	public static final DeferredBlock<Block> RASPBERRY_BLOCK = register("raspberry_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.HAY_BLOCK).mapColor(MapColor.COLOR_MAGENTA)));
	public static final DeferredBlock<Block> BANANA_SEAWEEDS_BLOCK = register("banana_seaweeds_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.HAY_BLOCK)));
	public static final DeferredBlock<Block> COTTON_CANDY_BLOCK = register("cotton_candy_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_WOOL)));
	public static final DeferredBlock<Block> CANDIED_CHERRY_SACK = register("candied_cherry_sack", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_WOOL)));
	public static final DeferredBlock<Block> CHEWING_GUM_BLOCK = register("chewing_gum_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SLIME_BLOCK).mapColor(MapColor.COLOR_PURPLE)));
	public static final DeferredBlock<Block> CHOCOLATE_SAPLING = register("chocolate_sapling", () -> new CandySaplingBlock(CTreeGrower.CHOCOLATE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
	public static final DeferredBlock<Block> WHITE_CHOCOLATE_SAPLING = register("white_chocolate_sapling", () -> new CandySaplingBlock(CTreeGrower.WHITE_CHOCOLATE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
	public static final DeferredBlock<Block> CARAMEL_SAPLING = register("caramel_sapling", () -> new CandySaplingBlock(CTreeGrower.CARAMEL, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
	public static final DeferredBlock<Block> CANDIED_CHERRY_SAPLING = register("candied_cherry_sapling", () -> new CandySaplingBlock(CTreeGrower.CANDIED_CHERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
	public static final DeferredBlock<Block> MARSHMALLOW_LOG = register("marshmallow_log", () -> new RotatedPillarBlock(logProperties(MapColor.COLOR_PINK, MapColor.TERRACOTTA_PINK)));
	public static final DeferredBlock<Block> DARK_MARSHMALLOW_LOG = register("dark_marshmallow_log", () -> new RotatedPillarBlock(logProperties(MapColor.COLOR_RED, MapColor.PODZOL)));
	public static final DeferredBlock<Block> LIGHT_MARSHMALLOW_LOG = register("light_marshmallow_log", () -> new RotatedPillarBlock(logProperties(MapColor.TERRACOTTA_WHITE, MapColor.TERRACOTTA_PINK)));
	public static final DeferredBlock<Block> STRIPPED_MARSHMALLOW_LOG = register("stripped_marshmallow_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PINK)));
	public static final DeferredBlock<Block> STRIPPED_DARK_MARSHMALLOW_LOG = register("stripped_dark_marshmallow_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_RED)));
	public static final DeferredBlock<Block> STRIPPED_LIGHT_MARSHMALLOW_LOG = register("stripped_light_marshmallow_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).mapColor(MapColor.TERRACOTTA_WHITE)));
	public static final DeferredBlock<Block> MARSHMALLOW_PLANKS = register("marshmallow_planks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.COLOR_PINK)));
	public static final DeferredBlock<Block> DARK_MARSHMALLOW_PLANKS = register("dark_marshmallow_planks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.COLOR_RED)));
	public static final DeferredBlock<Block> LIGHT_MARSHMALLOW_PLANKS = register("light_marshmallow_planks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.TERRACOTTA_WHITE)));
	public static final DeferredBlock<Block> CHOCOLATE_LEAVES = register("chocolate_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
	public static final DeferredBlock<Block> WHITE_CHOCOLATE_LEAVES = register("white_chocolate_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
	public static final DeferredBlock<Block> CARAMEL_LEAVES = register("caramel_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
	public static final DeferredBlock<Block> CANDIED_CHERRY_LEAVES = register("candied_cherry_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
	public static final DeferredBlock<Block> MAGICAL_LEAVES = register("magical_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
	public static final DeferredBlock<Block> CHOCOLATE_STONE = register("chocolate_stone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BROWN)));
	public static final DeferredBlock<Block> WHITE_CHOCOLATE_STONE = register("white_chocolate_stone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_WHITE)));
	public static final DeferredBlock<Block> CHOCOLATE_COBBLESTONE = register("chocolate_cobblestone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).mapColor(MapColor.TERRACOTTA_BROWN)));
	public static final DeferredBlock<Block> WHITE_CHOCOLATE_COBBLESTONE = register("white_chocolate_cobblestone", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).mapColor(MapColor.TERRACOTTA_WHITE)));
	public static final DeferredBlock<Block> CHOCOLATE_BRICKS = register("chocolate_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(CHOCOLATE_STONE.get())));
	public static final DeferredBlock<Block> WHITE_CHOCOLATE_BRICKS = register("white_chocolate_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(WHITE_CHOCOLATE_STONE.get())));
	public static final DeferredBlock<Block> CHOCOLATE_TILES = register("chocolate_tiles", () -> new Block(BlockBehaviour.Properties.ofFullCopy(CHOCOLATE_STONE.get())));
	public static final DeferredBlock<Block> WHITE_CHOCOLATE_TILES = register("white_chocolate_tiles", () -> new Block(BlockBehaviour.Properties.ofFullCopy(WHITE_CHOCOLATE_STONE.get())));
	public static final DeferredBlock<Block> JELLY_ORE = register("jelly_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).mapColor(MapColor.TERRACOTTA_BROWN)));
	public static final DeferredBlock<Block> WHITE_JELLY_ORE = register("white_jelly_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).mapColor(MapColor.TERRACOTTA_WHITE)));
	public static final DeferredBlock<Block> NOUGAT_ORE = register("nougat_ore", () -> new DropExperienceBlock(UniformInt.of(1, 5), BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_ORE).mapColor(MapColor.TERRACOTTA_BROWN)));
	public static final DeferredBlock<Block> WHITE_NOUGAT_ORE = register("white_nougat_ore", () -> new DropExperienceBlock(UniformInt.of(1, 5), BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_ORE).mapColor(MapColor.TERRACOTTA_WHITE)));
	public static final DeferredBlock<Block> LICORICE_ORE = register("licorice_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE).mapColor(MapColor.TERRACOTTA_BROWN)));
	public static final DeferredBlock<Block> WHITE_LICORICE_ORE = register("white_licorice_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE).mapColor(MapColor.TERRACOTTA_WHITE)));
	public static final DeferredBlock<Block> HONEYCOMB_ORE = register("honeycomb_ore", () -> new DropExperienceBlock(UniformInt.of(0, 3), BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).mapColor(MapColor.TERRACOTTA_BROWN)));
	public static final DeferredBlock<Block> WHITE_HONEYCOMB_ORE = register("white_honeycomb_ore", () -> new DropExperienceBlock(UniformInt.of(0, 3), BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).mapColor(MapColor.TERRACOTTA_WHITE)));
	public static final DeferredBlock<Block> PEZ_ORE = register("pez_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE).lightLevel(state -> 8).mapColor(MapColor.TERRACOTTA_BROWN)));
	public static final DeferredBlock<Block> WHITE_PEZ_ORE = register("white_pez_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE).lightLevel(state -> 8).mapColor(MapColor.TERRACOTTA_WHITE)));
	public static final DeferredBlock<Block> CANDY_CANE_BLOCK = register("candy_cane_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.COLOR_RED)));
	public static final DeferredBlock<Block> LICORICE_BLOCK = register("licorice_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK)));
	public static final DeferredBlock<Block> LICORICE_BRICKS = register("licorice_bricks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK)));
	public static final DeferredBlock<Block> NOUGAT_BLOCK = register("nougat_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK).mapColor(MapColor.COLOR_BROWN)));
	public static final DeferredBlock<Block> NOUGAT_HEAD = register("nougat_head", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK).mapColor(MapColor.COLOR_BROWN)));
	public static final DeferredBlock<Block> HONEYCOMB_BLOCK = register("honeycomb_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).mapColor(MapColor.COLOR_YELLOW)));
	public static final DeferredBlock<Block> HONEYCOMB_LAMP = register("honeycomb_lamp", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GLOWSTONE).mapColor(MapColor.COLOR_YELLOW)));
	public static final DeferredBlock<Block> PEZ_BLOCK = register("pez_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.METAL)));

	public static <T extends Block> DeferredBlock<T> register(String name, Supplier<T> block) {
		DeferredBlock<T> ret = BLOCKS.register(name, block);
		CItems.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties()));
		return ret;
	}

	private static BlockBehaviour.Properties logProperties(MapColor top, MapColor side) {
		return BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).mapColor(state -> state.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? top : side);
	}
}