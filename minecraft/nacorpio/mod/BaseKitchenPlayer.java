package nacorpio.mod;

import nacorpio.mod.temperature.Temperature;
import net.minecraft.entity.player.EntityPlayer;

public final class BaseKitchenPlayer {

	private EntityPlayer player;
	private Temperature temperature;
	
	public BaseKitchenPlayer(EntityPlayer player){
		this.player = player;
		this.temperature = new Temperature();
	}
	
	public EntityPlayer getPlayer(){
		return this.player;
	}
	
	public Temperature getTemperature(){
		return this.temperature;
	}
	
}
