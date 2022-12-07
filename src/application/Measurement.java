package application;

public class Measurement {
    MeasureUnit unit;
    double value;
    public Measurement(MeasureUnit unit, double value){
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

    public void setValue(double value, MeasureUnit unit){
        if(unit == MeasureUnit.INCHES){
            this.value = value * 2.54;
        }else{
            this.value = value;
        }
    }
}
