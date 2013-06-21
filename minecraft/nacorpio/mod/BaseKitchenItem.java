package nacorpio.mod;

import net.minecraft.item.Item;

public class BaseKitchenItem {

	private Item item;
	private Temperature temperature;
	
	public BaseKitchenItem(Item item){
		this.item = item;
	}
	
	public final Item getItem(){
		return this.item;
	}
	
	public final Temperature getTemperature(){
		return this.temperature;
	}
	
}
