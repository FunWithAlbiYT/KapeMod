package me.funwithalbi.kapemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import me.funwithalbi.kapemod.init.KapemodModTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import me.funwithalbi.kapemod.item.PinkSauceWaterItem;
import me.funwithalbi.kapemod.item.KapeIngotItem;
import me.funwithalbi.kapemod.item.KapeArmorItem;
import me.funwithalbi.kapemod.KapemodMod;

public class KapemodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KapemodMod.MODID);
	public static final RegistryObject<Item> KAPE_ORE = block(KapemodModBlocks.KAPE_ORE, KapemodModTabs.TAB_KAPE_ITEMS);
	public static final RegistryObject<Item> KAPE_INGOT = REGISTRY.register("kape_ingot", () -> new KapeIngotItem());
	public static final RegistryObject<Item> KAPE_ARMOR_HELMET = REGISTRY.register("kape_armor_helmet", () -> new KapeArmorItem.Helmet());
	public static final RegistryObject<Item> KAPE_ARMOR_CHESTPLATE = REGISTRY.register("kape_armor_chestplate", () -> new KapeArmorItem.Chestplate());
	public static final RegistryObject<Item> KAPE_ARMOR_LEGGINGS = REGISTRY.register("kape_armor_leggings", () -> new KapeArmorItem.Leggings());
	public static final RegistryObject<Item> KAPE_ARMOR_BOOTS = REGISTRY.register("kape_armor_boots", () -> new KapeArmorItem.Boots());
	public static final RegistryObject<Item> PINK_SAUCE_WATER_BUCKET = REGISTRY.register("pink_sauce_water_bucket", () -> new PinkSauceWaterItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
