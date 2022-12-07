package application;

import java.util.ArrayList;
package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Outfit {

 

	private Temperature uppertemperature;
	
	private Temperature lowertemperature;
	
	private String name;



	public Outfit(String name,double utemperature, double ltemperature) {
		this.name = name;
		this.uppertemperature = new Temperature(utemperature);
		this.lowertemperature = new Temperature(ltemperature);
	}
	
	 boolean tempcheck(double temp) {
		 if(temp >= lowertemperature.getTemperature() && temp <= uppertemperature.getTemperature() ) {
		return true;
		 }
		 else {
	     return false;
	     }
		 
	 }
	 
	 public String toString() {
		 return "we reccomend wearing a," + this.name + "in this weather";
	 }


	
	 

	 
}
