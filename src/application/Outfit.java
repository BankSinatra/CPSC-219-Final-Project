package application;

import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Outfit {

 

	private Temperature uppertemperature;
	
	private Temperature lowertemperature;
	
	private String name;

/**
 * Constructs and intializes an outfit with set associated temperatures
 * @param name this is the name of the outfit that the instance
 * variables will be associated with.
 * @param ltemperature the l temperature is the set lower temperature
 * bound
 * @param utemperature the u temperature is the set upper temperature
 * bound
 */
	public Outfit(String name, double ltemperature, double utemperature) {
		this.name = name;
		this.uppertemperature = new Temperature(utemperature);
		this.lowertemperature = new Temperature(ltemperature);
	}
/**
 * This method ensures that the temperature entered meets the validity
 * requirement of being in between the lower and upper temperature bounds.
 * @param temp the temperature of type double entered by the user
 * @return returns a true of false statement in regards to whether the
 * temp is between the bounds or not.
 */
	
	 boolean tempcheck(double temp) {
		 return temp >= lowertemperature.getTemperature() && temp <= uppertemperature.getTemperature();
	 }

/**
 * This toString method is meant to return the reccomendation of what
 * the user should wear given the temperature bounds.
 */
	 public String toString() {
		 return "We reccomend wearing a," + this.name + " in this weather";
	 }


	
	 

	 
}
