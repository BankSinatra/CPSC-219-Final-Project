package application;

public class BodyMeasurements {
	//These sizes are based on the sizes used on ASOS: https://www.asos.com/us/discover/size-charts/
	private double headCircumference; //Hats
	private double footLength; //Shoes
	private double bust; //Women's tops, Jacket, Sweaters
	private double waist; //Bottoms, Women's tops, Jacket, Sweaters
	private double chest; //t-shirt and sweater
	private double hips; //Women's tops, Jacket, Sweaters


	BodyMeasurements(double headCircumference, double footLength, double waist, double bust, double chest, double hips) {
		setHeadCircumference(headCircumference);
		setFootLength(footLength);
		setWaist(waist);
		setBust(bust);
		setChest(chest);
		setHips(hips);
	}

	BodyMeasurements(BodyMeasurements bodyMeasurements){
		this.headCircumference = bodyMeasurements.getHeadCircumference();
		this.footLength = bodyMeasurements.getHeadCircumference();
		this.bust = bodyMeasurements.getBust();
		this.waist = bodyMeasurements.getWaist();
		this.chest = bodyMeasurements.getChest();
		this.hips = bodyMeasurements.getHips();
	}
	
	// need measurements for: US SIZING

	// hat - need head circumference. small: 54-55cm medium: 56-57cm large: 58-59cm extra large: 60-61cm xxlarge: 62-63cm xxxlarge: 64-65cm
	double getHeadCircumference() {
		return headCircumference;
	}

	void setHeadCircumference(double headCircumference) {
			this.headCircumference = headCircumference;
	}

	// shoes - need foot length. mens: size 6-12 range: 23.5cm - 28.6cm
	// woman: size 4-10 range: 20.8 - 25.9cm
	double getFootLength() {
		return footLength;
	}

	void setFootLength(double footLength) {
		this.footLength = footLength;
	}
	
	// bottoms waist and inseam. mens: xsmall: 76 - 80 small: 80-84  medium: 84-88 large: 88-93 xlarge: 93-98cm
	//                           mens: short: 76 - 80 regular: 80 - 84 long: 84 - 88
	// womens: xsmall: 64-68 small: 68-72 medium: 72-76 large: 76-81 xlarge: 81-86
	// short: 74-78 regular: 78-82 long: 82 - 86

	double getWaist() {
		return waist;
	}

	void setWaist(double waist) {
		this.waist = waist;
	}

	public double getChest() {
		return chest;
	}

	public void setChest(double chest) {
		this.chest = chest;
	}

	public double getHips() {
		return hips;
	}

	public void setHips(double hips) {
		this.hips = hips;
	}

	public double getBust() {
		return bust;
	}

	public void setBust(double bust) {
		this.bust = bust;
	}
}
