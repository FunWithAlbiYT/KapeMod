
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.funwithalbi.kapemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import me.funwithalbi.kapemod.block.PinkSauceWaterBlock;
import me.funwithalbi.kapemod.block.KapeOreBlock;
import me.funwithalbi.kapemod.KapemodMod;

public class KapemodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, KapemodMod.MODID);
	public static final RegistryObject<Block> KAPE_ORE = REGISTRY.register("kape_ore", () -> new KapeOreBlock());
	public static final RegistryObject<Block> PINK_SAUCE_WATER = REGISTRY.register("pink_sauce_water", () -> new PinkSauceWaterBlock());
}
