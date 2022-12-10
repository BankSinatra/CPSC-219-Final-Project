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