package application;

public class Laundry {
    private final String instructions;
    private LaundryMethod laundryMethod;

    Laundry(String group, String instructions) throws Exception {
        this.laundryMethod = getLaundryMethod(group);
        this.instructions = instructions;
    }

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

    public LaundryMethod getLaundryMethod(){
        return laundryMethod;
    }

    public String getInstructions(){
        return instructions;
    }
}
