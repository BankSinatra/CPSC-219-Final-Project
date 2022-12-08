package application;

public class Temperature {
	private double temperature;
	private boolean celcius;
	
	
	public Temperature(double temp){
		celcius = true;
		setTemperature(temp);
	}

	public Temperature(double temp, boolean c){
		celcius  = c;
		setTemperature(temp);
	}
	
	void convertToCelcius() {
		if(!celcius){
			setTemperature((Double)(temperature -32)*(5/9));
		}
	}
	
	public String toString() {
		return ("the temperature you have saved is:" + getTemperature() + "degrees");
	}


	double getTemperature() {
		return temperature;
	}


	public void setTemperature(double temperature) {
		
		this.temperature = temperature;
	}
}

