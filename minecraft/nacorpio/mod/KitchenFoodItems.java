package nacorpio.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Represents kitchen-food.
 */
public class KitchenFoodItems extends Item {

	public KitchenFoodItems(int par1) {
		super(par1);
		this.setCreativeTab(CreativeTabs.tabFood);
	}

}
