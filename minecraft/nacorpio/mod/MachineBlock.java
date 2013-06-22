package nacorpio.mod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class MachineBlock extends Block {

	public MachineBlock(int par1) {
		super(par1, Material.rock);
		this.setHardness(50);
	}
	
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9){
		par5EntityPlayer.sendChatToPlayer("Temperature: ¤70¡C");
		return true;
	}

}
