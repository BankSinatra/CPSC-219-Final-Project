package application.LaundryPal;

/** The class for Laundry objects
 * @author Eyram Ekpe
 */
public class Laundry {
    private final String instructions;
    private LaundryMethod laundryMethod;

    /**
     *
     * @param group A string to be passed into the getLaundryMethod method
     * @param instructions A set of instructions for taking care of the laundry
     * @throws Exception thrown by the getLaundryMethod() method
     */
    Laundry(String group, String instructions) throws Exception {
        this.laundryMethod = getLaundryMethod(group);
        this.instructions = instructions;
    }

    /**
     *
     * @param group A string for finding which laundry method it belongs to
     * @return
     * @throws Exception There are a limited set of groups you can choose so if you don't pick any, an exception will be thrown
     */
    private LaundryMethod getLaundryMethod(String group) throws Exception {
        return switch (group) {
            case "washing" -> LaundryMethod.WASHING;
            case "tumble_drying" -> LaundryMethod.TUMBLE_DRYING;
            case "natural_drying" -> LaundryMethod.NATURAL_DRYING;
            case "ironing" -> LaundryMethod.IRONING;
            case "dry_cleaning" -> LaundryMethod.DRY_CLEANING;
            case "wet_cleaning" -> LaundryMethod.WET_CLEANING;
            case "bleaching" -> LaundryMethod.BLEACHING;
            default -> throw new Exception("Something went wrong");
        };
    }

    /**
     *
     * @return the laundry method of the class
     */
    public LaundryMethod getLaundryMethod(){
        return laundryMethod;
    }

    /**
     *
     * @return Gets the laundry instructions for this class
     */
    public String getInstructions(){
        return instructions;
    }
}
