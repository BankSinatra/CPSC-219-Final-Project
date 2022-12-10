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
	/**
	 * empty constructor
	 */
	public Bust(Measurement measurement) {
		this.measurement = measurement;
	}

	/**
	 * Takes measurement and checks for which size range it fits into and then assigns size.
	 * @param measurement is the double value from user for bust size
	 * @return string stating the size of clothing
	 */
	public String getWomenTops(Measurement m) throws InvalidSizeException {
		String size = "";
		double measurement = m.getCentimetersValue();
		if (measurement < 78) {
			throw new InvalidSizeException("This calculator does not support foot sizes this small");
		} else if (measurement > 103) {
			throw new InvalidSizeException("This calculator does not support foot sizes this large");
		}
		if (78 <= measurement && measurement < 80.5) {
			size = "extra small";
		}
		else if (80.5 <= measurement && measurement < 83) {
			size = "small";
		}
		else if (83 <= measurement && measurement < 88) {
			size = "medium";
		}
		else if (88 <= measurement && measurement < 93) {
			size = "large";
		}
		else if (93 <= measurement && measurement < 98) {
			size = "extra large";
		}
		else if (98 <= measurement && measurement < 103) {
			size = "xx large";
		}
		return size;
	}
	

}
