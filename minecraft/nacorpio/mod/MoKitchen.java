package nacorpio.mod; //Package directory

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="MoKitchen",name="Mo'Kitchen",version="v1")
@NetworkMod(clientSideRequired=true,serverSideRequired=false)

public class MoKitchen {

@Init
	public void load(FMLInitializationEvent event){
	
	//	LanguageRegistry.addName(???, "???");
		
	}

}