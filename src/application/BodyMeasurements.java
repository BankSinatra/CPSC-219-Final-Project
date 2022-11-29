package application;

public class BodyMeasurements {
	
	private int headCircumference =0;

	public BodyMeasurements() {
		// TODO Auto-generated constructor stub
	}

	int getHeadCircumference() {
		return headCircumference;
	}

	void setHeadCircumference(int headCircumference) {
		if (headCircumference <= 65 && headCircumference >= 54){
			this.headCircumference = headCircumference;
		}
	}
	
	// need measurements for: US SIZING
	// hat - need head circumference. small: 54-55cm medium: 56-57cm large: 58-59cm extra large: 60-61cm xxlarge: 62-63cm xxxlarge: 64-65cm

	// sweaters
	// jacket
	// bottoms
	// tops 

}
