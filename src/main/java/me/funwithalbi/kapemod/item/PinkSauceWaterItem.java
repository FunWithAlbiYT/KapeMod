
package me.funwithalbi.kapemod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import me.funwithalbi.kapemod.init.KapemodModTabs;
import net.minecraft.world.item.BucketItem;

import me.funwithalbi.kapemod.init.KapemodModFluids;

public class PinkSauceWaterItem extends BucketItem {
	public PinkSauceWaterItem() {
		super(KapemodModFluids.PINK_SAUCE_WATER,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(KapemodModTabs.TAB_KAPE_ITEMS));
	}
}
