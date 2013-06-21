package nacorpio.mod;

import java.util.Random;

public final class Temperature implements ITemperature {

	private static String potionEffect;
	
	private static int maxDegree = 60;
	private static int minDegree = 4;
	
	private static int temperature;
	
	private static boolean isAbove = false;
	private static boolean isBelow = false;
		
	@Override
	public final String getPotionEffect() {
		return this.potionEffect;
	}

	@Override
	public final int getMaxDegree() {
		return this.maxDegree;
	}

	@Override
	public final int getMinDegree() {
		return this.minDegree;
	}

	@Override
	public final void setTemperature(int newTemp) {
		int oldTemp = this.temperature;
		this.temperature = newTemp;
		if (this.temperature > this.getMaxDegree() || this.temperature < this.getMinDegree()){
			this.onTemperatureCritical();
		}
		this.onTemperatureChanged(newTemp, oldTemp);
	}

	@Override
	public void onTemperatureChanged(int newTemp, int oldTemp) {}

	@Override
	public void onTemperatureCritical() {}

	@Override
	public final int getTemperature() {
		return this.temperature;
	}

	@Override
	public final boolean isAbove() {
		return this.temperature > this.getMaxDegree() ? true : false;
	}

	@Override
	public final boolean isBelow() {
		return this.temperature < this.getMinDegree() ? true : false;
	}

}
