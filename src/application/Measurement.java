package application;

public class Measurement {
    private MeasureUnit unit;
    private double value;
/**
 * intializes and constructs the instance variables in measurement
 * @param unit becomes the class variables unit
 * @param value becomes the class variables value
 */
    public Measurement(MeasureUnit unit, double value){
        this.unit = unit;
        this.setValue(value);
    }

    public Measurement(MeasureUnit unit){
        this.unit = unit;
    }

/**
 * Converts the unit value to centremeters
 * @return returns the value after converting to centremeters only if
 * the value inputed was in inches.
 */
    public double getCentimetersValue(){
        if(unit == MeasureUnit.INCHES){
            return getValue() * 2.54;
        }else{
            return getValue();
        }
    }
/**
 * Converts the unit value to inches
 * @return returns the value after converting to centremeters only if
 * the value inputed was in centremeters
 */
    public double getInchesValue(){
        if(unit == MeasureUnit.CM){
            return getValue() / 2.54;
        }else{
            return getValue();
        }
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
