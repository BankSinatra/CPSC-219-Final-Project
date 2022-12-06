package application;

public class Measurement {
    MeasureUnit unit;
    double value;
    Measurement(MeasureUnit unit, double value){
        this.unit = unit;
        this.value = value;
    }

    //returns in centimeters. We won't ever really need to convert from inches to cm ever
    public double getValue(){
        if(unit == MeasureUnit.INCHES){
            return value * 2.54;
        }else{
            return value;
        }
    }
}
