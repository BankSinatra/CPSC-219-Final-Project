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
	
	public String womensPants(double measurement) { // sizes xs - xxl cm
		String size = "";
		if (55.5 <= measurement && measurement < 58) {
			size = "extra small";
		}
		else if (58 <= measurement && measurement < 60.5) {
			size = "small";
		}
		else if (60.5 <= measurement && measurement < 63) {
			size = "medium";
		}
		else if (63 <= measurement && measurement < 68) {
			size = "large";
		}
		else if (68 <= measurement && measurement < 73) {
			size = "extra large";
		}
		else if (73 <= measurement && measurement < 78) {
			size = "xx large";
		}
		return size;
	}

}
