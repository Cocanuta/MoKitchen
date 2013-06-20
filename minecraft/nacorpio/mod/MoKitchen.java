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
	
	// Drinks like beer, wine and other drinks.
	public static ItemFood drinkJuiceApple;
	public static ItemFood drinkJuiceRaspberry;
	public static ItemFood drinkJuiceOrange;
	public static ItemFood drinkRedWine;
	public static ItemFood drinkWhiteWine;
	
	
	// Different foods.
	public static ItemFood foodPieApple;
	public static ItemFood foodPieRhubarb;
	public static ItemFood foodDonut;
	public static ItemFood foodOatPorridge;
	public static ItemFood foodWheatPorridge;
	
	
	// Different berries and eat-able things found in the nature.
	// Sandwiches can also be found in here.
	public static ItemFood eatableStrawberry; // TODO: Can be used to make drinks and more.
	public static ItemFood eatableRaspberry; // TODO: Can be used to make drinks and more.
	public static ItemFood eatableOrange; // TODO: This can be used to spice the food up and make drinks.
	public static ItemFood eatableLemon; // TODO: This can be used to spice the food up and make drinks.
	public static ItemFood eatableGrape; // TODO: You are going to be able to create wines out of this.
	
	public static ItemFood eatableSandwich;
	public static ItemFood eatableButteredSandwich; // TODO: The sandwich needs to be 
	public static ItemFood eatableMeatSandwich;
	public static ItemFood eatableMeatAndCheeseSandwich;
	public static ItemFood eatableFishSandwich;
	
	public static ItemFood eatableFishSalmon, eatableCookedFishSalmon;
	public static ItemFood eatableFishMackerel, eatableCookedFishMackerel;
	public static ItemFood eatableFishHerring, eatableCookedFishHerring;
	
	
	// Different ingredients needed to create the foods.
	public static Item itemCheese; // TODO: Can be used on sandwiches.
	public static Item itemFlour; // TODO: This is an ingredient in a lot of recipes.
	public static Item itemOat; // TODO: Used for porridge.
	public static Item itemSalt; // TODO: Used for most of the meals.
	
	
	// Accessories (Spices: Can be used on different meals) 
	public static Item accessoryChiliSpice;
	public static Item accessoryOnionSpice;
	public static Item accessoryBeefSpice;
	
@Init
	public void load(FMLInitializationEvent event){

	foodDonut = (ItemFood) new ItemFood(3337, 3, false).setUnlocalizedName("food_donut");
	
	itemCheese = new Item(3338).setUnlocalizedName("item_cheese");
	
	drinkRedWine = (ItemFood) new ItemFood(3339, 1, false).setUnlocalizedName("drink_redWine");
	drinkWhiteWine = (ItemFood) new ItemFood(3340, 1, false).setUnlocalizedName("drink_whiteWine");
	//	LanguageRegistry.addName(???, "???");
		
	}

}