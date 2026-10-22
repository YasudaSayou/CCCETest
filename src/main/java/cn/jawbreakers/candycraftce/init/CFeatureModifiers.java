package cn.jawbreakers.candycraftce.init;

import cn.jawbreakers.candycraftce.CandyCraftCE;
import cn.jawbreakers.candycraftce.world.feature.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class CFeatureModifiers {

	public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS = DeferredRegister.create(Registries.FOLIAGE_PLACER_TYPE, CandyCraftCE.MOD_ID);

	public static final DeferredHolder<FoliagePlacerType<?>, FoliagePlacerType<CandiedCherryFoliagePlacer>> CANDIED_CHERRY = FOLIAGE_PLACERS.register("candied_cherry", () -> new FoliagePlacerType<>(CandiedCherryFoliagePlacer.CODEC));
	public static final DeferredHolder<FoliagePlacerType<?>, FoliagePlacerType<FancyCaramelFoliagePlacer>> FANCY_CARAMEL = FOLIAGE_PLACERS.register("fancy_caramel", () -> new FoliagePlacerType<>(FancyCaramelFoliagePlacer.CODEC));
}