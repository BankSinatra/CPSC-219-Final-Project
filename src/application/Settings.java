package application;

import java.util.Locale;

public class Settings {
	private BodyMeasurements measurements;
	private MeasureUnit measurementUnit;
	private boolean male;
	private boolean welcome;

	public Settings(MeasureUnit unitMeasure, boolean male, BodyMeasurements body, boolean welcome) {
		setUnitmeasurement(unitMeasure);
		setMeasurements(body);
		this.setMale(male);
		this.setWelcome(welcome);
	}

	Settings(boolean male, boolean welcome){
		this.setWelcome(welcome);
		this.setMale(male);
	}

	Settings(){
		this.setWelcome(false);
	}


	public BodyMeasurements getMeasurements() {
		return new BodyMeasurements(measurements);
	}

	public void setMeasurements(BodyMeasurements measurements) {
		this.measurements = measurements;
	}


	public String getUnitmeasurement() {
		return measurementUnit.toString().toLowerCase(Locale.ROOT);
	}


	public void setUnitmeasurement(MeasureUnit unitmeasurement) {
		this.measurementUnit = unitmeasurement;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public boolean isWelcome() {
		return welcome;
	}

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