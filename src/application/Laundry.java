package application;

public class Laundry {
    private final String instructions;

    Laundry(String group, String instructions) throws Exception {
        LaundryMethod laundryMethod = getLaundryMethod(group);
        this.instructions = instructions;
    }

    public LaundryMethod getLaundryMethod(String group) throws Exception {
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
    public String getInstructions(){
        return instructions;
    }
}
