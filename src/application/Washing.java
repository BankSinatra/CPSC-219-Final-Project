package application;

public class Washing extends Laundry{
    private LaundryMethod laundryMethod;

    Washing(){
        super(LaundryMethod.WASHING);
        this.setLaundryMethod(LaundryMethod.WASHING);
    }

    public String getInstructions() {
       return super.getInstructions();
    }
}
