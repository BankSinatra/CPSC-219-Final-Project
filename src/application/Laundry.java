package application;

import java.util.ArrayList;

public abstract class Laundry {
    private LaundryMethod laundryMethod;
    private String instructions;

    Laundry(LaundryMethod laundryMethod){
        this.laundryMethod = laundryMethod;
    }

    public LaundryMethod getLaundryMethod() {
        return laundryMethod;
    }
    public void setLaundryMethod(LaundryMethod laundryMethod){
        this.laundryMethod = laundryMethod;
    }
    public String getInstructions(){
        return instructions;
    }

    public void setInstructions(String instructions){
        this.instructions = instructions;
    }
}
