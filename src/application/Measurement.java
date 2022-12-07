package application;

public class Measurement {
    MeasureUnit unit;
    double value;
    Measurement(MeasureUnit unit, double value){
        this.unit = unit;
        this.value = value;
    }

    public double getCentimetersValue(){
        if(unit == MeasureUnit.INCHES){
            return value * 2.54;
        }else{
            return value;
        }
    }

    public double getInchesValue(){
        if(unit == MeasureUnit.CM){
            return value / 2.54;
        }else{
            return value;
        }
    }
}
