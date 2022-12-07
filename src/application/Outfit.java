package application;

import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Outfit {

 

	private Temperature uppertemperature;
	
	private Temperature lowertemperature;
	
	private String name;



	public Outfit(String name, double ltemperature, double utemperature) {
		this.name = name;
		this.uppertemperature = new Temperature(utemperature);
		this.lowertemperature = new Temperature(ltemperature);
	}
	
	 boolean tempcheck(double temp) {
		 return temp >= lowertemperature.getTemperature() && temp <= uppertemperature.getTemperature();
	 }
	 
	 public String toString() {
		 return "We reccomend wearing a," + this.name + " in this weather";
	 }


	
	 

	 
}
