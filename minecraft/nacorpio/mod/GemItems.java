package nacorpio.mod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.*;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.IMob;

public class GemItems extends Item {
	
	public GemItems(int par1) {
		super(par1);
		setCreativeTab(CreativeTabs.tabMaterials); //Tells the game what creative mode tab it goes in
	}
	
}