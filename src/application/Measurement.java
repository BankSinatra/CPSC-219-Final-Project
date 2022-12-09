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
/**
 * value setter
 * @param value if measurements are originally in inches the value gets
 * set as centremeters
 * @param unit is used to validate the input before setting it as value
 */
    public void setValue(double value, MeasureUnit unit){
        if(unit == MeasureUnit.INCHES){
            this.value = value * 2.54;
        }else{
            this.value = value;
        }
    }
}
