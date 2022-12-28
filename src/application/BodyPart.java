package application;

import application.clothingModel.InvalidSizeException;

public interface BodyPart {
    public int getMeasurement(ClothingType clothingType) throws InvalidSizeException;
}
