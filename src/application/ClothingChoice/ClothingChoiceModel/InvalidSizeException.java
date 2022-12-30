package application.ClothingChoice.ClothingChoiceModel;

/**
 * This class handles when a size is invalid.
 * @author Eyram Ekpe
 */
public class InvalidSizeException extends Exception{
    public InvalidSizeException(String msg){
        super(msg);
    }
}
