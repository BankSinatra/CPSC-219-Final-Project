package application;

/**
 * This application will take the bust measurement and find the clothing size based on the 
 * relevant clothing options for the measurement.
 * @author CS219-user
 *
 */
public class Bust {

	/**
	 * empty constructor
	 */
	public Bust() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Takes measurement and checks for which range size range it fits into and then assigns size.
	 * @param measurement is the double value from user for bust size
	 * @return string stating the size of clothing
	 */
	public String womensTops(double measurement) { // sizes xs - xxlarge, cm
		String size = "";
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
