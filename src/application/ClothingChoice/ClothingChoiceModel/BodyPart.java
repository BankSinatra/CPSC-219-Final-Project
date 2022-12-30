package application.ClothingChoice.ClothingChoiceModel;

import application.Measurement;

public interface BodyPart {
    public String getMeasurement(ClothingType clothingType) throws InvalidSizeException;
    public void setMeasurement(Measurement measurement);
}
