package application;

public class Temperature {
	private double temperature;
	
	
	public Temperature(double temp){
		setTemperature(temp);
	}
	
	
	void converttofarenheit(double tempcelcius) {
		setTemperature(tempcelcius);
	}
	
	void converttocelcius(double tempfareinheit) {
		setTemperature(tempfareinheit);
	}
	
	public String toString() {
	return ("the temperature you have saved is:" + getTemperature() + "degrees");
	        
	}


	private double getTemperature() {
		return temperature;
	}


	private void setTemperature(double temperature) {
		
		this.temperature = temperature;
	}
}

