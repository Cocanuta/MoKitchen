package nacorpio.mod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * This represents a block that is a kitchen-machine.
 */
public class KitchenMachineBlocks extends Block {

	public KitchenMachineBlocks(int par1) {
		super(par1, Material.rock);
		this.setCreativeTab(CreativeTabs.tabKitchen);
	}
	
}
