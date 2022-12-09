package application.clothingModel;

import application.Measurement;

public class HeadCircumference {
	Measurement measurement;

	public HeadCircumference(Measurement measurement) {
		this.measurement = measurement;
	}
	
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
		else if (64 <= measurement && measurement <= 65) {
			size = "xxx large";
		}
		return size;
	}

}
