package application;

public class BodyMeasurements {
	
	private double headCircumference = 0;
	private double footLength = 0;
	private double waist = 0;
	private double inseam = 0;
	boolean man = true;


	public BodyMeasurements() {
		// TODO Auto-generated constructor stub
	}
	
	// need measurements for: US SIZING

	// hat - need head circumference. small: 54-55cm medium: 56-57cm large: 58-59cm extra large: 60-61cm xxlarge: 62-63cm xxxlarge: 64-65cm
	double getHeadCircumference() {
		return headCircumference;
	}

	void setHeadCircumference(double headCircumference) {
		if (headCircumference <= 65 && headCircumference >= 54){
			this.headCircumference = headCircumference;
		}
	}

	// shoes - need foot length. mens: size 6-12 range: 23.5cm - 28.6cm
	// woman: size 4-10 range: 20.8 - 25.9cm
	double getFootLength() {
		return footLength;
	}

	void setFootLength(double footLength) {
		if (man = true && footLength >= 23.5 && footLength <= 28.6) {
		this.footLength = footLength;
		}
		
		else if (man = false && footLength >= 20.8 && footLength <= 25.9) {
			this.footLength = footLength;
		}
		
	}
	
	// bottoms waist and inseam. mens: xsmall: 76 - 80 small: 80-84  medium: 84-88 large: 88-93 xlarge: 93-98cm
	//                           mens: short: 76 - 80 regular: 80 - 84 long: 84 - 88
	// womens: xsmall: 64-68 small: 68-72 medium: 72-76 large: 76-81 xlarge: 81-86
	// short: 74-78 regular: 78-82 long: 82 - 86

	double getWaist() {
		return waist;
	}

	void setWaist(double waist) {
		if (man = true && waist >= 76 && waist <= 98) {
			this.waist = waist;
		}
		
		else if (man = false && waist >= 64 && waist <= 86) {
			this.waist = waist;
		}
	}

	double getInseam() {
		return inseam;
	}

	void setInseam(double inseam) {
		if (man = true && inseam >= 76 && inseam <= 88) {
			this.inseam = inseam;
		}
		if (man = false && inseam >= 74 && inseam <= 86) {
			this.inseam = inseam;
		}
	}	
	
	// sweaters
	// jacket
	// tops - chest, waist
	
	
	

}
