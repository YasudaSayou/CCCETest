package cn.jawbreakers.candycraftce.init;

import cn.jawbreakers.candycraftce.CandyCraftCE;
import cn.jawbreakers.candycraftce.block.entity.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CBlockEntities {

	public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, CandyCraftCE.MOD_ID);

	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<LicoriceFurnaceBlockEntity>> LICORICE_FURNACE = BLOCK_ENTITIES.register("licorice_furnace", () -> BlockEntityType.Builder.of(LicoriceFurnaceBlockEntity::new, CBlocks.LICORICE_FURNACE.get()).build(null));
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ChocolateFurnaceBlockEntity>> CHOCOLATE_FURNACE = BLOCK_ENTITIES.register("chocolate_furnace", () -> BlockEntityType.Builder.of(ChocolateFurnaceBlockEntity::new, CBlocks.CHOCOLATE_FURNACE.get(), CBlocks.WHITE_CHOCOLATE_FURNACE.get()).build(null));
}