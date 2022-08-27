package me.funwithalbi.kapemod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class KapemodModTabs {
	public static CreativeModeTab TAB_KAPE_ITEMS;

	public static void load() {
		TAB_KAPE_ITEMS = new CreativeModeTab("tabkape_items") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(KapemodModBlocks.KAPE_ORE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
