package application.clothingModel;

import application.Measurement;

public class Waist{
    Boolean male;
    Measurement measurement;


    private final double[] femalesTopsSizeKeys = {60, 62.5, 65, 70, 75, 80, 85, 92.5, 98, 105};
    private final int[] femalesTopsSizeValues =  {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};


    public Waist(Boolean male, Measurement measurement){
        this.male = male;
        this.measurement = measurement;
    }


    /**
     * Gets a bottom size for a person based on waist measurements. Is a unisex measurement according to ASOS
     * @author Eyram Ekpe
     */
    public int getBottomsSize() throws InvalidSizeException {
        double m = measurement.getInchesValue();
        if (m < 24){
            throw new InvalidSizeException("This calculator does not support sizes this small");
        }else if(m > 52){
            throw new InvalidSizeException("This calculator does not support sizes this large");
        }

        return (int) Math.ceil(m);
    }

    /**
     * Gets a top size for a person based on the waist measurements.
     * @author Eyram Ekpe
     */
    public int getFemaleTopSize() throws InvalidSizeException {
        double m = measurement.getCentimetersValue();
        if (m < 60){
            throw new InvalidSizeException("This calculator does not support sizes this small");
        }else if(m > 105){
            throw new InvalidSizeException("This calculator does not support sizes this large");
        }
        int i = 0;
        while(i < femalesTopsSizeKeys.length && m > femalesTopsSizeKeys[i]){
            i++;
        }
        return femalesTopsSizeValues[i];
    }

}
