package cn.jawbreakers.candycraftce.fluid;

import cn.jawbreakers.candycraftce.init.*;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;

public abstract class GrenadineFluid extends BaseFlowingFluid {
	public GrenadineFluid() {
		super(new Properties(CFluidTypes.GRENADINE_TYPE, CFluids.GRENADINE, CFluids.FLOWING_GRENADINE).block(CBlocks.GRENADINE).bucket(CItems.GRENADINE_BUCKET));
	}

	public static class Source extends GrenadineFluid {
		@Override
		public boolean isSource(FluidState state) {
			return true;
		}

		@Override
		public int getAmount(FluidState state) {
			return 8;
		}
	}

	public static class Flowing extends GrenadineFluid{
		@Override
		public boolean isSource(FluidState state) {
			return false;
		}

		@Override
		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		@Override
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}
	}
}