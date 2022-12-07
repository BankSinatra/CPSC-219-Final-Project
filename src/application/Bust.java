package application;

public class Bust {

	public Bust() {
		// TODO Auto-generated constructor stub
	}
	
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
