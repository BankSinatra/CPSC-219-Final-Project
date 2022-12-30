package application;

import application.clothingModel.InvalidSizeException;

public interface BodyPart {
    public String getMeasurement(ClothingType clothingType) throws InvalidSizeException;
    public void setMeasurement(Measurement measurement);
}
