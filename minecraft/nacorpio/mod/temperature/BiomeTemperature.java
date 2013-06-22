package nacorpio.mod.temperature;

import java.util.Random;

public class BiomeTemperature {

	private double currentTemperature;
	
	private double maxTemperature;
	private double minTemperature;
	
	private double baseTemperature;
	
	public BiomeTemperature(double max, double min, double base){
		this.maxTemperature = max;
		this.minTemperature = min;
		this.baseTemperature = base;
		this.setRandomizedTemperature(0, false, false);
	}
	
	public final void setRandomizedTemperature(int time, boolean isRaining, boolean isThundering){
		if (isRaining || isThundering){
			this.setRainTemperature();
			return;
		}
		if (time >= 12000){
			this.setTemperature(this.currentTemperature - new Random().nextInt(10));
		} else if (time >= 0 && time < 12000){
			this.setTemperature(this.currentTemperature + new Random().nextInt(5));
		} else if (time >= 6000 && time < 12000){
			this.setTemperature(this.currentTemperature + new Random().nextInt(7));
		}
	}
	
	/**
	 * Set the temperature to something specific.
	 * <b>Note:</b> The value most be higher or equal to the minimum temperature and lower or equal to the maximum temperature.
	 * @param temp The new temperature to set.
	 */
	public final void setTemperature(double temp){
		if (temp >= this.minTemperature && temp <= this.maxTemperature){
			this.currentTemperature = temp;
		}
	}
	
	/**
	 * Set the temperature to rain.
	 */
	private final void setRainTemperature(){
		setTemperature(this.getRandomLower());
	}
	
	// -  {base}  +
	
	/**
	 * Returns a random double from the base temperature to the minimum temperature.
	 * @return Returns a random double from the base temperature to the minimum temperature.
	 */
	public final double getRandomLower(){
		Random rnd = new Random(System.currentTimeMillis());
		return this.currentTemperature + (rnd.nextInt((int)this.minTemperature) + rnd.nextDouble());
	}
	
	/**
	 * Returns a random double from the base temperature to the maximum temperature.
	 * @return Returns a random double from the base temperature to the maximum temperature.
	 */
	public final double getRandomHigher(){
		Random rnd = new Random(System.currentTimeMillis());
		return this.currentTemperature - (rnd.nextInt((int)this.maxTemperature) + rnd.nextDouble());
	}
	
	/**
	 * Returns the maximum temperature of the biome.
	 * @return Returns the maximum temperature of the biome.
	 */
	public final double getMaxTemperature(){
		return this.maxTemperature;
	}
	
	/**
	 * Returns the minimum temperature of the biome.
	 * @return
	 */
	public final double getMinTemperature(){
		return this.minTemperature;
	}
	
	/**
	 * Returns the 'middle' temperature of the biome.
	 * @return Returns the 'middle' temperature of the biome.
	 */
	public final double getBaseTemperature(){
		return this.baseTemperature;
	}
	
	/**
	 * Returns the current temperature of the biome.
	 * @return Returns the current temperature of the biome.
	 */
	public final double getCurrentTemperature(){
		return this.currentTemperature;
	}
	
}
