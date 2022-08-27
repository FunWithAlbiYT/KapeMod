
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package me.funwithalbi.kapemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import me.funwithalbi.kapemod.fluid.PinkSauceWaterFluid;
import me.funwithalbi.kapemod.KapemodMod;

public class KapemodModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, KapemodMod.MODID);
	public static final RegistryObject<Fluid> PINK_SAUCE_WATER = REGISTRY.register("pink_sauce_water", () -> new PinkSauceWaterFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_PINK_SAUCE_WATER = REGISTRY.register("flowing_pink_sauce_water",
			() -> new PinkSauceWaterFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(PINK_SAUCE_WATER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_PINK_SAUCE_WATER.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
