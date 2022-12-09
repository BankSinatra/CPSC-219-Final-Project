package application;

/**
 * This application will take the head circumference measurement and find the hat size.
 * @author CS219-user
 *
 */
public class HeadCircumference {
	
	/**
	 * empty constructor
	 */
	public HeadCircumference() {
		// TODO Auto-generated constructor stub
	}

	// Hat size is gender neutral
	/**
	 *  Takes measurement and checks for which size range it fits into and then assigns size.
	 * @param measurement is the double value from user for head circumference
	 * @return string stating the hat size
	 */
	public String calculateHats(double measurement) {
		String size = "";
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
		else if (64 <= measurement && measurement <= 65) {
			size = "xxx large";
		}
		
		return size;
	}

}
