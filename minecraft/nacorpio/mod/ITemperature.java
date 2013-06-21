package nacorpio.mod;

public interface ITemperature {

	/**
	 * Set the new temperature of the food.
	 * @param newTemp The new temperature of the food.
	 */
	void setTemperature(int newTemp);
	
	/**
	 * Occurs when the temperature of the food is changed.
	 * @param newTemp The new temperature of the food.
	 * @param oldTemp The temperature before the change.
	 */
	void onTemperatureChanged(int newTemp, int oldTemp);
	
	/**
	 * Occurs when the temperature is more or less than the normal.
	 */
	void onTemperatureCritical();
	
	/**
	 * Returns the potion effect that occurs once the food is<br>
	 * above or below the normal temperature.
	 * @return Returns the potion effect.
	 */
	String getPotionEffect();
	
	/**
	 * Returns the maximum temperature of the food.
	 * @return Returns the maximum temperature of the food.
	 */
	int getMaxDegree();
	
	/**
	 * Returns the minimum temperature of the food.
	 * @return Returns the minimum temperature of the food.
	 */
	int getMinDegree();
	
	/**
	 * Returns the temperature of the food.
	 * @return Returns the temperature of the food.
	 */
	int getTemperature();
	
	/**
	 * Returns whether the temperature is above the max allowed temperature.
	 * @return Returns whether the temperature is above the max allowed temperature.
	 */
	boolean isAbove();
	
	/**
	 * Returns whether the temperature is below the minimum allowed temperature.
	 * @return Returns whether the temperature is below the minimum allowed temperature.
	 */
	boolean isBelow();
	
}
