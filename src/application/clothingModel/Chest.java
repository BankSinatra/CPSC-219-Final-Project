package application.clothingModel;

import application.Measurement;

public class Chest {
    Measurement measurement;
    private final double[] maleSizeKeys = {78, 80.5, 83, 88, 93, 98, 103, 110.5, 116, 123};
    private final int[] maleSizeValues =  {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};

    /**
     * Constructor that creates a chest object
     * @param measurement a measurement that will be used to calculate clothing sizes
     */
    public Chest(Measurement measurement) {
        this.measurement = measurement;
    }

    /**
     * Takes measurement and checks for which size range it fits into and then assigns size.
     * @return string stating the size of clothing
     */
    public int getTopSize() throws InvalidSizeException {
        double m = this.measurement.getCentimetersValue();
        if (m < 78) {
            throw new InvalidSizeException("This calculator does not support chest sizes this small");
        } else if (m > 123) {
            throw new InvalidSizeException("This calculator does not support chest sizes this large");
        }
        int i = 0;
        while(i < maleSizeKeys.length && m > maleSizeKeys[i]){
            i++;
        }
        return maleSizeValues[i];
    }
}