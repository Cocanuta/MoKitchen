package nacorpio.mod; //Package directory

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucketMilk;
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
	public static ItemFood drinkBeer;
	public static ItemFood drinkVodka;
	
	
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
	public static ItemFood eatableCheeseSandwich;
	public static ItemFood eatableMeatSandwich;
	public static ItemFood eatableMeatAndCheeseSandwich;
	public static ItemFood eatableFishSandwich;
	
	public static ItemFood eatableFishSalmon, eatableCookedFishSalmon;
	public static ItemFood eatableFishMackerel, eatableCookedFishMackerel;
	public static ItemFood eatableFishHerring, eatableCookedFishHerring;
	
	
	// Different ingredients needed to create the foods.
	public static Item itemMeat;
	public static Item itemCheese; // TODO: Can be used on sandwiches.
	public static Item itemFlour; // TODO: This is an ingredient in a lot of recipes.
	public static Item itemOat; // TODO: Used for porridge.
	public static Item itemSalt; // TODO: Used for most of the meals.
	
	
	// Accessories (Spices: Can be used on different meals) 
	public static Item accessoryPlate;
	public static Item accessoryWineGlass;
	public static Item accessoryGlass;
	
	public static Item accessoryChiliSpice;
	public static Item accessoryOnionSpice;
	public static Item accessoryBeefSpice;
	
	public static Item accessoryCheeseSlice;
	public static Item accessoryButter; // TODO: This is used on sandwiches.
	
@Init
	public void load(FMLInitializationEvent event){

	eatableStrawberry = (ItemFood) new ItemFood(3349, 1, false).setUnlocalizedName("strawberry");
	eatableRaspberry = (ItemFood) new ItemFood(3354, 1, false).setUnlocalizedName("raspberry");
	eatableOrange = (ItemFood) new ItemFood(3355, 1, false).setUnlocalizedName("orange");
	eatableLemon = (ItemFood) new ItemFood(3356, 1, false).setUnlocalizedName("lemon");
	eatableGrape = (ItemFood) new ItemFood(3357, 1, false).setUnlocalizedName("grape");
	
	foodDonut = (ItemFood) new ItemFood(3337, 3, false).setUnlocalizedName("donut").setCreativeTab(CreativeTabs.tabKitchen);
	foodPieApple = (ItemFood) new ItemFood(3345, 12, false).setUnlocalizedName("apple_pie").setCreativeTab(CreativeTabs.tabKitchen);
	foodPieRhubarb = (ItemFood) new ItemFood(3346, 12, false).setUnlocalizedName("rhubarb_pie").setCreativeTab(CreativeTabs.tabKitchen);
	foodOatPorridge = (ItemFood) new ItemFood(3347, 6, false).setUnlocalizedName("oat_porridge").setCreativeTab(CreativeTabs.tabKitchen);
	foodWheatPorridge = (ItemFood) new ItemFood(3348, 6, false).setUnlocalizedName("wheat_porridge").setCreativeTab(CreativeTabs.tabKitchen);
	
	itemCheese = new Item(3338).setUnlocalizedName("cheese_full").setCreativeTab(CreativeTabs.tabKitchen);
	itemMeat = new Item(3341).setUnlocalizedName("meat").setCreativeTab(CreativeTabs.tabKitchen);
	itemFlour = new Item(3342).setUnlocalizedName("flour").setCreativeTab(CreativeTabs.tabKitchen);
	itemOat = new Item(3343).setUnlocalizedName("oat").setCreativeTab(CreativeTabs.tabKitchen);
	itemSalt = new Item(3344).setUnlocalizedName("salt").setCreativeTab(CreativeTabs.tabKitchen);
	
	accessoryChiliSpice = new Item(3349).setUnlocalizedName("chili_spice").setCreativeTab(CreativeTabs.tabKitchen);
	accessoryOnionSpice = new Item(3350).setUnlocalizedName("onion_spice").setCreativeTab(CreativeTabs.tabKitchen);
	accessoryBeefSpice = new Item(3351).setUnlocalizedName("beef_spice").setCreativeTab(CreativeTabs.tabKitchen);
	accessoryCheeseSlice = new Item(3352).setUnlocalizedName("cheese_slice").setCreativeTab(CreativeTabs.tabKitchen);
	accessoryButter = new Item(3353).setUnlocalizedName("butter").setCreativeTab(CreativeTabs.tabKitchen);
	
	drinkRedWine = (ItemFood) new ItemFood(3339, 1, false).setUnlocalizedName("red_wine").setCreativeTab(CreativeTabs.tabKitchen);
	drinkWhiteWine = (ItemFood) new ItemFood(3340, 1, false).setUnlocalizedName("white_wine").setCreativeTab(CreativeTabs.tabKitchen);
	
	LanguageRegistry.addName(eatableStrawberry, "Strawberry");
	
	LanguageRegistry.addName(foodDonut, "Donut");
	LanguageRegistry.addName(foodPieApple, "Apple Pie");
	LanguageRegistry.addName(foodPieRhubarb, "Rhubarb Pie");
	LanguageRegistry.addName(foodOatPorridge, "Oat Porridge");
	LanguageRegistry.addName(foodWheatPorridge, "Wheat Porridge");
	
	LanguageRegistry.addName(itemCheese, "Cheese");
	LanguageRegistry.addName(itemMeat, "Meat");
	LanguageRegistry.addName(itemFlour, "Flour");
	LanguageRegistry.addName(itemOat, "Oat");
	LanguageRegistry.addName(itemSalt, "Salt");
	
	LanguageRegistry.addName(accessoryChiliSpice, "Chili Spice");
	LanguageRegistry.addName(accessoryOnionSpice, "Onion Spice");
	LanguageRegistry.addName(accessoryBeefSpice, "Beef Spice");
	LanguageRegistry.addName(accessoryCheeseSlice, "Cheese Slice");
	LanguageRegistry.addName(accessoryButter, "Butter");
	
	LanguageRegistry.addName(drinkRedWine, "Red Wine");
	LanguageRegistry.addName(drinkWhiteWine, "White Wine");
	
	// TODO: Cooking the milk so that cheese is created.
	GameRegistry.addSmelting(3338, new ItemStack(Item.bucketMilk), 0.1f);
	
	// TODO: Create a sandwich.
	GameRegistry.addRecipe(new ItemStack(eatableSandwich), "xxx", "yyy", "zzz",
	'x', new ItemStack(accessoryButter), 'y', new ItemStack(itemFlour), 'z', new ItemStack(Item.wheat));
	
	// TODO: Create a buttered sandwich.
	GameRegistry.addShapelessRecipe(new ItemStack(eatableButteredSandwich), new ItemStack(eatableSandwich), new ItemStack(accessoryButter));
	
	// TODO: Create a sandwich with cheese on it.
	GameRegistry.addShapelessRecipe(new ItemStack(eatableCheeseSandwich), new ItemStack(eatableButteredSandwich), new ItemStack(accessoryCheeseSlice));
	
	// TODO: Create a sandwich with cheese and meat on it.
	GameRegistry.addShapelessRecipe(new ItemStack(eatableMeatAndCheeseSandwich), new ItemStack(eatableCheeseSandwich), new ItemStack(itemMeat));
	
	// TODO: Create a sandwich with meat on it.
	GameRegistry.addShapelessRecipe(new ItemStack(eatableMeatSandwich), new ItemStack(eatableButteredSandwich), new ItemStack(itemMeat));
	
	
	}

}