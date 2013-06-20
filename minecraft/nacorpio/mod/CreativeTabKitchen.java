package nacorpio.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public final class CreativeTabKitchen extends CreativeTabs {

	public CreativeTabKitchen(String par2Str) {
		super(par2Str);
	}

	public ItemStack getIconItemStack(){
		return new ItemStack(MoKitchen.drinkWhiteWine);
	}
	
}
