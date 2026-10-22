package cn.jawbreakers.candycraftce.init;

import cn.jawbreakers.candycraftce.CandyCraftCE;
import cn.jawbreakers.candycraftce.block.*;
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

	public static <T extends Block> DeferredBlock<T> register(String name, Supplier<T> block) {
		DeferredBlock<T> ret = BLOCKS.register(name, block);
		CItems.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties()));
		return ret;
	}
}