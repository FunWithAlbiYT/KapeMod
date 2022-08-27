
package me.funwithalbi.kapemod.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import me.funwithalbi.kapemod.init.KapemodModItems;
import me.funwithalbi.kapemod.init.KapemodModFluids;
import me.funwithalbi.kapemod.init.KapemodModBlocks;

public abstract class PinkSauceWaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(KapemodModFluids.PINK_SAUCE_WATER,
			KapemodModFluids.FLOWING_PINK_SAUCE_WATER,
			FluidAttributes.builder(new ResourceLocation("kapemod:blocks/stillpinksauce"), new ResourceLocation("kapemod:blocks/movingpinksauce"))

	).explosionResistance(100f)

			.bucket(KapemodModItems.PINK_SAUCE_WATER_BUCKET).block(() -> (LiquidBlock) KapemodModBlocks.PINK_SAUCE_WATER.get());

	private PinkSauceWaterFluid() {
		super(PROPERTIES);
	}

	public static class Source extends PinkSauceWaterFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends PinkSauceWaterFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
