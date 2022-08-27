
package me.funwithalbi.kapemod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import me.funwithalbi.kapemod.init.KapemodModTabs;

public class KapeIngotItem extends Item {
	public KapeIngotItem() {
		super(new Item.Properties().tab(KapemodModTabs.TAB_KAPE_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
