
package me.funwithalbi.kapemod.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import me.funwithalbi.kapemod.init.KapemodModFluids;

public class PinkSauceWaterBlock extends LiquidBlock {
	public PinkSauceWaterBlock() {
		super(() -> (FlowingFluid) KapemodModFluids.PINK_SAUCE_WATER.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}
}
