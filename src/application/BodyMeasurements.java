package application;

public class BodyMeasurements {
	
	private int headCircumference = 0;
	private int footLength = 0;
	boolean man = true;


	public BodyMeasurements() {
		// TODO Auto-generated constructor stub
	}
	
	// need measurements for: US SIZING

	// hat - need head circumference. small: 54-55cm medium: 56-57cm large: 58-59cm extra large: 60-61cm xxlarge: 62-63cm xxxlarge: 64-65cm
	int getHeadCircumference() {
		return headCircumference;
	}

	void setHeadCircumference(int headCircumference) {
		if (headCircumference <= 65 && headCircumference >= 54){
			this.headCircumference = headCircumference;
		}
	}

	// shoes - need foot length. mens: size 6-12 range: 23.5cm - 28.6cm
	// woman: size 4-10 range: 20.8 - 25.9cm
	int getFootLength() {
		return footLength;
	}

	void setFootLength(int footLength) {
		if (man = true && footLength >= 23.5 && footLength <= 28.6) {
		this.footLength = footLength;
		}
		
		else if (man = false && footLength >= 20.8 && footLength <= 25.9) {
			this.footLength = footLength;
		}
		
	}
	

	// sweaters
	// jacket
	// bottoms
	// tops 

}
