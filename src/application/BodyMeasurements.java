package application;

/**
 * The Body Measurements application assigns the body measurement's specific measurements to 
 * their corresponding instance variables.
 * @author CS219-user
 *
 */
public class BodyMeasurements {
	//These sizes are based on the sizes used on ASOS: https://www.asos.com/us/discover/size-charts/
	private double headCircumference; //Hats
	private double footLength; //Shoes
	private double bust; //Women's tops, Jacket, Sweaters
	private double waist; //Bottoms, Women's tops, Jacket, Sweaters
	private double chest; //t-shirt and sweater
	private double hips; //Women's tops, Jacket, Sweaters

	/***
	 * Takes all size measurement inputs and sets them.
	 * @param headCircumference first parameter, used for hat sizes
	 * @param footLength second parameter, used for shoe sizes
	 * @param bust third parameter, used for women's tops, jackets and sweaters
	 * @param waist fourth parameter, used for bottoms, women's tops, jackets and sweaters
	 * @param chest fifth parameter, used for tshirt and sweaters
	 * @param hips sixth parameter, used for women's tops, jackets and sweaters
	 */
	BodyMeasurements(double headCircumference, double footLength, double bust, double waist,  double chest, double hips) {
		setHeadCircumference(headCircumference);
		setFootLength(footLength);
		setWaist(waist);
		setBust(bust);
		setChest(chest);
		setHips(hips);
	}
	
	/**
	 * Empty constructor
	 */
	BodyMeasurements() {
	}

	/**
	 * Takes body measurements and gets the specific measurements within to set the instance variables.
	 * @param bodyMeasurements all the measurements passed in of body measurement class
	 */
	BodyMeasurements(BodyMeasurements bodyMeasurements){
		this.headCircumference = bodyMeasurements.getHeadCircumference();
		this.footLength = bodyMeasurements.getHeadCircumference();
		this.bust = bodyMeasurements.getBust();
		this.waist = bodyMeasurements.getWaist();
		this.chest = bodyMeasurements.getChest();
		this.hips = bodyMeasurements.getHips();
	}
	
	/***
	 * Getter for head circumference measurement
	 * @return value of head circumference
	 */
	double getHeadCircumference() {
		return headCircumference;
	}
	
	/**
	 * Sets the head circumference.
	 * @param headCircumference as a double is used to set the instance variable.
	 */
	void setHeadCircumference(double headCircumference) {
			this.headCircumference = headCircumference;
	}

	/**
	 * Getter for foot length measurement
	 * @return value of foot length
	 */
	double getFootLength() {
		return footLength;
	}
	
	/**
	 * Sets the foot length.
	 * @param footLength as a double is used to set the instance variable.
	 */
	void setFootLength(double footLength) {
		this.footLength = footLength;
	}
	
	/**
	 * Getter for waist measurement
	 * @return value of waist measurement
	 */
	double getWaist() {
		return waist;
	}

	/**
	 * Sets the waist measurement.
	 * @param waist as a double is used to set the instance variable.
	 */
	void setWaist(double waist) {
		this.waist = waist;
	}
	
	/**
	 * Getter for chest measurement
	 * @return value of chest measurement
	 */
	public double getChest() {
		return chest;
	}

	/**
	 * Sets the chest measurement.
	 * @param chest as a double is used to set the instance variable.
	 */
	public void setChest(double chest) {
		this.chest = chest;
	}

	/**
	 * Getter for hips measurement
	 * @return value of hips measurement
	 */
	public double getHips() {
		return hips;
	}

	/**
	 * Sets the hips measurement.
	 * @param hips as a double is used to set the instance variable.
	 */
	public void setHips(double hips) {
		this.hips = hips;
	}

	/**
	 * Getter for bust measurement
	 * @return value of bust measurement
	 */
	public double getBust() {
		return bust;
	}

	/**
	 * Sets the bust measurement.
	 * @param bust as a double is used to set the instance variable.
	 */
	public void setBust(double bust) {
		this.bust = bust;
	}
}
