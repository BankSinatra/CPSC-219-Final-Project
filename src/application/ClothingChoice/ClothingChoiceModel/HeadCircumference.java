package application.ClothingChoice.ClothingChoiceModel;

import application.Measurement;

/**
 * This class will take the head circumference measurement and find the hat size.
 * @author CS219-user
 *
 */
public class HeadCircumference implements BodyPart {
	Measurement measurement;

	public HeadCircumference() {}

	/**
	 *  Takes measurement and checks for which size range it fits into and then assigns size.
	 * @param m is the Measurement value from user for head circumference
	 * @return string stating the hat size
	 */
	public String getHatSize(Measurement m) throws InvalidSizeException{
		String size = "";
		double measurement = m.getCentimetersValue();
		if (measurement < 54){
			throw new InvalidSizeException("This calculator does not support head sizes this small");
		}else if(measurement > 65){
			throw new InvalidSizeException("This calculator does not support head sizes this large");
		}
		if (54 <= measurement && measurement < 56) {
			size = "small";
		}
		else if (56 <= measurement && measurement < 58) {
			size = "medium";
		}
		else if (58 <= measurement && measurement < 60) {
			size = "large";
		}
		else if (60 <= measurement && measurement < 62) {
			size = "extra large";
		}
		else if (62 <= measurement && measurement < 64) {
			size = "xx large";
		}
		else if (64 <= measurement && measurement < 65) {
			size = "xxx large";
		}
		return size;
	}

	public String getMeasurement(ClothingType clothingType) throws InvalidSizeException {
		if(clothingType == ClothingType.HAT){
			return getHatSize(measurement);
		}
		throw new InvalidSizeException("Something went wrong");
	}

	public void setMeasurement(Measurement measurement) {
		this.measurement = measurement;
	}

	public String toString() {
		return "Head Circumference";
	}
}
