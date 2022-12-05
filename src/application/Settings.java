package application;

public class Settings {
	private BodyMeasurements;
	
	private double unitmeasurement;
	
	boolean man = true;
	
	//private double waist;
	//private double cm;
	//private double circumference;
	//private double shoe;
	//(inch, SEX, BODYMEASUREMENT should be constructor layout)
	
	public Settings(Settings toCopy) {
		unitmeasurement = toCopy.unitmeasurement;
		BodyMeasurements = toCopy.BodyMeasurements;
		man = toCopy.man;
	}
	
	public Settings(double unitmeasure,boolean trueifmale,double bodymeasurements) {
		unitmeasurement = unitmeasure;
		BodyMeasurements = bodymeasurements;
		man = trueifmale;
		
		
	}
	
	
	public String toString() {
		return ("Waist measurement:" + getWaist() ) + ("foot length:" + getfootLength()) +
				("Head Circumference:" + getheadCircumference()) +
				("inseam:" + getnseam());
		        
	}
	
	
	void converttocm(double inch) {
		unitmeasurement = inch*2.54;
	}
	void converttoinches(double centimetres) {
		unitmeasurement = centimetres/2.54;
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
