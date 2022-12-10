package application.clothingModel;

import application.Measurement;

/**
 * This application will take the hip measurement and find the complementary clothing size for the hips
 * Size conversions taken from: https://www.asos.com/us/discover/size-charts/
 * @author Shannon Pett
 * @author Eyram Ekpe
 *
 */

public class Hip {
    Measurement measurement;

    private final double[] femaleSizeKeys = {83.5, 86, 88.5, 93.5, 98.5, 103.5, 108.5, 116, 116.5, 123.5};
    private final int[] femaleSizeValues =  {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};

    public Hip(Measurement measurement){
        this.measurement = measurement;
    }

    /**
     * This function gets the clothing size for the hips size
     * @throws InvalidSizeException Sends message if the message isn't good enough
     *
     */
    public int getHipSize() throws InvalidSizeException {
        double m = measurement.getCentimetersValue();
        if (m < 83.5){
            throw new InvalidSizeException("This calculator does not support sizes this small");
        }else if(m > 123.5){
            throw new InvalidSizeException("This calculator does not support sizes this large");
        }
        int i = 0;
        while(i < femaleSizeKeys.length && m > femaleSizeKeys[i]){
            i++;
        }
        return femaleSizeValues[i];
    }

}
