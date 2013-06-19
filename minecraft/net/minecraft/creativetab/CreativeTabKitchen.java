package net.minecraft.creativetab;

import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import cpw.mods.fml.relauncher.Side;

final class CreativeTabKitchen extends CreativeTabs {

	CreativeTabKitchen(int par1, String par2Str) {
		super(par1, par2Str);
		this.
	}

	@SideOnly(Side.CLIENT)
	
	/**
     * the itemID for the item to be displayed on the tab
     */
    public int getTabIconItemIndex()
    {
        return Item.carrot.itemID;
    }
	
}
