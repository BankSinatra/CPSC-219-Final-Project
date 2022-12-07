package application.clothingModel;

import application.Measurement;

public class Waist {
    Boolean male;
    Measurement measurement;


    private final double[] femalesTopsSizeKeys = {60, 62.5, 65, 70, 75, 80, 85, 92.5, 98, 105};
    private final int[] femalesTopsSizeValues =  {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};


    Waist(Boolean male, Measurement measurement){
        this.male = male;
        this.measurement = measurement;
    }

    //When considering pant size, waist circumference in inches is the only important thing
    public int getBottomsSize(){
        double m = measurement.getInchesValue();
        return (int) Math.ceil(m);
    }

    public int getWomensTopSize(){
        double m = measurement.getCentimetersValue();
        int i = 0;
        while(i < femalesTopsSizeKeys.length && m > femalesTopsSizeKeys[i]){
            i++;
        }
        return femalesTopsSizeValues[i];
    }

}
