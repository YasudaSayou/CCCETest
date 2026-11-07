package cn.jawbreakers.candycraftce.init;

import cn.jawbreakers.candycraftce.CandyCraftCE;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class CFluidTypes {

	public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, CandyCraftCE.MOD_ID);

	public static final Supplier<CFluidType> CARAMEL_TYPE = FLUID_TYPES.register("caramel", () -> new CFluidType(
		FluidType.Properties.create().motionScale(0.007D).fallDistanceModifier(0F).canExtinguish(true).supportsBoating(true)
		.sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA),
		CandyCraftCE.prefix("block/caramel"), CandyCraftCE.prefix("block/caramel")
	));
	public static final Supplier<CFluidType> GRENADINE_TYPE = FLUID_TYPES.register("grenadine", () -> new CFluidType(
		FluidType.Properties.create().fallDistanceModifier(0F).canExtinguish(true).canConvertToSource(true).supportsBoating(true).canHydrate(true)
		.sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
		CandyCraftCE.prefix("block/grenadine_static"), CandyCraftCE.prefix("block/grenadine_flowing")
	));
}