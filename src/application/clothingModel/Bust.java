package application.clothingModel;

import application.Measurement;

/**
 * This application will take the bust measurement and find the clothing size based on the 
 * relevant clothing options for the measurement.
 * @author CS219-user
 *
 */
public class Bust {
	Measurement measurement;
	private final double[] femaleSizeKeys = {78, 80.5, 83, 88, 93, 98, 103, 110.5, 116, 123};
	private final int[] femaleSizeValues =  {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};

	/**
	 * empty constructor
	 */
	public Bust(Measurement measurement) {
		this.measurement = measurement;
	}

	/**
	 * Takes measurement and checks for which size range it fits into and then assigns size.
	 * @return string stating the size of clothing
	 */
	public int getWomenTops() throws InvalidSizeException {
		double m = this.measurement.getCentimetersValue();
		if (m < 78) {
			throw new InvalidSizeException("This calculator does not support bust sizes this small");
		} else if (m > 123) {
			throw new InvalidSizeException("This calculator does not support bust sizes this large");
		}
		int i = 0;
		while(i < femaleSizeKeys.length && m > femaleSizeKeys[i]){
			i++;
		}
		return femaleSizeValues[i];
	}
	

}
