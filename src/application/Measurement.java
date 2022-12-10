package application;

public class Measurement {
    MeasureUnit unit;
    double value;
/**
 * intializes and constructs the instance variables in measurement
 * @param unit becomes the class variables unit
 * @param value becomes the class variables value
 */
    public Measurement(MeasureUnit unit, double value){
        this.unit = unit;
        this.value = value;
    }
/**
 * Converts the unit value to centremeters
 * @return returns the value after converting to centremeters only if
 * the value inputed was in inches.
 */
    public double getCentimetersValue(){
        if(unit == MeasureUnit.INCHES){
            return value * 2.54;
        }else{
            return value;
        }
    }
/**
 * Converts the unit value to inches
 * @return returns the value after converting to centremeters only if
 * the value inputed was in centremeters
 */
    public double getInchesValue(){
        if(unit == MeasureUnit.CM){
            return value / 2.54;
        }else{
            return value;
        }
    }
}
