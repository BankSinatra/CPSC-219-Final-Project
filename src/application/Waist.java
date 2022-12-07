package application;

public class Waist {

	public Waist() {
		// TODO Auto-generated constructor stub
	}
	
	public String womensTops(double measurement) { // size xs - xxlarge, cm
		String size = "";
		if (60 <= measurement && measurement < 62.6) {
			size = "extra small";
		}
		else if (62.6 <= measurement && measurement < 65) {
			size = "small";
		}
		else if (65 <= measurement && measurement < 70) {
			size = "medium";
		}
		else if (70 <= measurement && measurement < 75) {
			size = "large";
		}
		else if (75 <= measurement && measurement < 80) {
			size = "extra large";
		}
		else if (80 <= measurement && measurement < 85) {
			size = "xxlarge";
		}
		return size;
	}

}
