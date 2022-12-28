package application;

import application.clothingModel.InvalidSizeException;

public interface BodyPart {
    public double getMeasurement(ClothingType clothingType) throws InvalidSizeException;
    public void setMeasurement(Measurement measurement);
}
