package nacorpio.mod;

import net.minecraft.item.ItemFood;

public interface KitchenTemperatureBase {

	ItemFood getBaseItem();
	
	String getWrongTemperaturePoison();
	
	int getMaxDegrees();
	
	int getMinDegrees();
	
}
