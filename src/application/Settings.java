package application;

import java.util.Locale;

public class Settings {
	private BodyMeasurements measurements;
	private MeasureUnit measurementUnit;
	private boolean male;
	private boolean welcome;
/**
 * constructs and initializes the settings
 * @param unitMeasure stored in measurementUnit value
 * @param male stored as true or false in reference to user sex
 * @param body stored as a measurement of type BodyMeasurements
 * @param welcome stored as true or false in reference to the
 * welcome screen
 */
	public Settings(MeasureUnit unitMeasure, boolean male, BodyMeasurements body, boolean welcome) {
		setUnitMeasurement(unitMeasure);
		setMeasurements(body);
		this.setMale(male);
		this.setWelcome(welcome);
	}
/**
 * setter method
 * @param male stores the boolean value inside the male variable
 * @param welcome stores the boolean value inside the welcome variable
 */
	Settings(boolean male, boolean welcome){
		this.setWelcome(welcome);
		this.setMale(male);
	}

	Settings(){
		this.setWelcome(true);
		this.setUnitMeasurement(MeasureUnit.CM);
		this.setMeasurements(new BodyMeasurements());
		this.setMale(true);
	}

/**
 * BodyMeasurement setter
 * @return the measurements of type BodyMeasurements stored
 */
	public BodyMeasurements getMeasurements() {
		return new BodyMeasurements(measurements);
	}
/**
 * BodyMeasurement getter
 * @param measurements stored as the measurement in the instance 
 * variable
 */
	public void setMeasurements(BodyMeasurements measurements) {
		this.measurements = measurements;
	}

/**
 * String to return the unit in a string
 * @return measurementUnit value stored in lower case letters
 */
	public String getUnitString() {
		return measurementUnit.toString().toLowerCase(Locale.ROOT);
	}
/**
 * returns unit measurement as value
 * @return measurement unit
 */
	public MeasureUnit getUnitMeasurement() {
		return measurementUnit;
	}


/**
 * Unit Measurement setter
 * @param unitmeasurement stores this value as the classes 
 * measurementUnit
 */
	public void setUnitMeasurement(MeasureUnit unitmeasurement) {
		this.measurementUnit = unitmeasurement;
	}
/**
 * find value of Male
 * @return the state of which male is true or false
 */
	public boolean isMale() {
		return male;
	}
/**
 * Male setter
 * @param male boolean value is stored in this classes male variable
 */
	public void setMale(boolean male) {
		this.male = male;
		this.setWelcome(false);
	}
/**
 * find value of welcome variable
 * @return the state of which welcome is true or false
 */
	public boolean isWelcome() {
		return welcome;
	}
/**
 * Welcome setter
 * @param welcome boolean value is stored in this classes welcome 
 * variable
 */
	public void setWelcome(boolean welcome) {
		this.welcome = welcome;
	}
}
	
	/*void increaseWaist(double amount) {
		BodyMeasurements + amount);
	}
	
	void increaseHip(double amount) {
		BodyMeasurements + amount);
	}
		
	void increaseCircumference(double amount) {
		setCircumference(getCircumference() + amount);
		
	}
	
	void increaseShoe(double amount) {
		setShoe(getShoe() + amount);
		
	}
	
	void decreaseWaist(double amount) {
		setWaist(getWaist() - amount);
	}
	
	void decreaseHip(double amount) {
		setHip(getHip() - amount);
	}
		
	void decreaseCircumference(double amount) {
		setCircumference(getCircumference() - amount);
		
	}
	
	void decreaseShoe(double amount) {
		setShoe(getShoe() - amount);
		
	}
	
	void convertwaisttoUK(double uswaist) {
		setWaist(uswaist) ;
	}
	
	void converthiptoUK(double uship) {
		setHip(uship) ;
	}
	
	void convertcircumtoUK(double uscircum) {
		setCircumference(uscircum) ;
	}
	
	void convertshoetowomanUK(double usshoe) {
		setShoe(usshoe - 2);
	}
	
	void convertshoetomanUK(double usshoe){
		setShoe(usshoe -1);
	}


	private double getWaist() {
		return waist;
	}

	private void setWaist(double waist) {
		if (waist >= 0)this.waist = waist;
	}

	private double getHip() {
		return hip;
	}

	private void setHip(double hip) {
		if (hip >= 0)this.hip = hip;
	}

	private double getCircumference() {
		return headCircumference;
	}

	private void setCircumference(double circumference) {
		if (circumference >= 0)this.circumference = headCircumference;
	}

	private double getfootLength() {
		return footLength;
	}

	private void setfootLength(double length) {
		if (footLength>= 0) this.footLength = footLength;
	}
	
}
*/