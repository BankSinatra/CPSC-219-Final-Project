package application.OutfitCreator;

public class Temperature {
	private double temperature;
	private boolean celcius;
	
/**
 * Constructs and initializes a temperature if the measurement is
 * in celsius	
 * @param temp the temperature the user inputs as a double value
 */
	public Temperature(double temp){
		celcius = true;
		setTemperature(temp);
	}
/**
 * Constructs and initializes a temperature if the measurement is
 * @param temp temp the temperature the user inputs as a double value
 * @param c celcius saves c as either a true or false value
 */

	public Temperature(double temp, boolean c){
		celcius  = c;
		setTemperature(temp);
	}
/**
 * Given that the temperature unit is in celcius it will use a
 * formula to convert the value into fahrenheit units	
 */
	void convertToCelcius() {
		if(!celcius){
			setTemperature((Double)(temperature -32)*(5/9));
		}
	}
/**
 * returns a string statement to the user informing them what their 
 * saved temp value is	
 */
	public String toString() {
		return ("the temperature you have saved is:" + getTemperature() + "degrees");
	}
/**
 * temperature getter
 * @return saved temperature
 */

	double getTemperature() {
		return temperature;
	}

/**
 * temperature setter
 * @param temperature the temperature the user inputs as a double value
 */
	public void setTemperature(double temperature) {
		
		this.temperature = temperature;
	}
}

