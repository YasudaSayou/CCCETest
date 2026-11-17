package cn.jawbreakers.candycraftce.init;

import cn.jawbreakers.candycraftce.CandyCraftCE;
import cn.jawbreakers.candycraftce.fluid.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CFluids {

	public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(Registries.FLUID, CandyCraftCE.MOD_ID);

	public static final Supplier<FlowingFluid> CARAMEL = FLUIDS.register("caramel", CaramelFluid.Source::new);
	public static final Supplier<FlowingFluid> FLOWING_CARAMEL = FLUIDS.register("flowing_caramel", CaramelFluid.Flowing::new);
	public static final Supplier<FlowingFluid> GRENADINE = FLUIDS.register("grenadine", GrenadineFluid.Source::new);
	public static final Supplier<FlowingFluid> FLOWING_GRENADINE = FLUIDS.register("flowing_grenadine", GrenadineFluid.Flowing::new);
}