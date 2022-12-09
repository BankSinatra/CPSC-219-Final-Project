package application.clothingModel;

public class HeadCircumference {

	public HeadCircumference() {
		// TODO Auto-generated constructor stub
	}
	
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
