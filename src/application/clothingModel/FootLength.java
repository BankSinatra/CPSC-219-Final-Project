package application.clothingModel;

import application.Measurement;

/**
 * This application will take the foot length measurement and find the shoe size.
 * @author Shannon Pett
 * @author Eyram Ekpe
 *
 */
public class FootLength {
	Measurement measurement;


	public FootLength(Measurement measurement) {
		this.measurement = measurement;
	}

	// shoes sizes from https://www.zappos.com/c/shoe-size-conversion

	/**
	 * Takes measurement and checks for which men's size range it fits into and then assigns size.
	 *
	 * @param m is the Measurement value from user for foot length
	 * @return string stating the shoe size
	 */
	public String calculateShoesMen(Measurement m) throws InvalidSizeException { // size 6 - 12 range in cm
		String size = "";
		double measurement = m.getCentimetersValue();
		if (measurement < 23.5) {
			throw new InvalidSizeException("This calculator does not support foot sizes this small");
		} else if (measurement > 29.4) {
			throw new InvalidSizeException("This calculator does not support foot sizes this large");
		}
		if (23.5 <= measurement && measurement < 24.1) {
			size = "6";
		} else if (24.1 <= measurement && measurement < 24.4) {
			size = "6.5";
		} else if (24.4 <= measurement && measurement < 24.8) {
			size = "7";
		} else if (24.8 <= measurement && measurement < 25.4) {
			size = "7.5";
		} else if (25.4 <= measurement && measurement < 25.7) {
			size = "8";
		} else if (25.7 <= measurement && measurement < 26) {
			size = "8.5";
		} else if (26 <= measurement && measurement < 26.7) {
			size = "9";
		} else if (26.7 <= measurement && measurement < 27) {
			size = "9.5";
		} else if (27 <= measurement && measurement < 27.3) {
			size = "10";
		} else if (27.3 <= measurement && measurement < 27.9) {
			size = "10.5";
		} else if (27.9 <= measurement && measurement < 28.3) {
			size = "11";
		} else if (28.3 <= measurement && measurement < 28.6) {
			size = "11.5";
		} else if (28.6 <= measurement && measurement < 29.4) {
			size = "12";
		}
		return size;
	}

	/**
	 * Function that gets a shoe measurement depending on the sex of the user.
	 * @param male the sex of the user
	 * @param m the foot measurement of the user
	 */
	public String getShoes(boolean male, Measurement m) throws InvalidSizeException {
		if (male) {
			return calculateShoesMen(m);
		} else {
			return calculateShoesWomen(m);
		}
	}

	/**
	 * Takes measurement and checks for which woman's size range it fits into and then assigns size.
	 *
	 * @param m is the Measurement value from user for foot length
	 * @return string stating the shoe size
	 * @throws InvalidSizeException useful for error messages
	 */
	private String calculateShoesWomen(Measurement m) throws InvalidSizeException { // size 4-10// size 4-10 cm
			String size = "";
			double measurement = m.getCentimetersValue();
			if (measurement < 20.8) {
				throw new InvalidSizeException("This calculator does not support foot sizes this small");
			} else if (measurement > 26.2) {
				throw new InvalidSizeException("This calculator does not support foot sizes this large");
			}
			if (20.8 <= measurement && measurement < 21.3) {
				size = "4";
			} else if (21.3 <= measurement && measurement < 21.6) {
				size = "4.5";
			} else if (21.6 <= measurement && measurement < 22.2) {
				size = "5";
			} else if (22.2 <= measurement && measurement < 22.5) {
				size = "5.5";
			} else if (22.5 <= measurement && measurement < 23) {
				size = "6";
			} else if (23 <= measurement && measurement < 23.5) {
				size = "6.5";
			} else if (23.5 <= measurement && measurement < 23.8) {
				size = "7";
			} else if (23.8 <= measurement && measurement < 24.1) {
				size = "7.5";
			} else if (24.1 <= measurement && measurement < 24.6) {
				size = "8";
			} else if (24.6 <= measurement && measurement < 25.1) {
				size = "8.5";
			} else if (25.1 <= measurement && measurement < 25.4) {
				size = "9";
			} else if (25.4 <= measurement && measurement < 25.9) {
				size = "9.5";
			} else if (25.9 <= measurement && measurement < 26.2) {
				size = "10";
			}
			return size;
		}

}
