package application;

import application.clothingModel.InvalidSizeException;
import application.clothingModel.Waist;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Controller for men's pants. Definitely could be optimized but ran out of time sorry
 * @author Eyram Ekpe
 */
public class BottomScreenMenController{

    private final SettingsHolder settingsHolder = SettingsHolder.getInstance();

    private final MeasureUnit measureUnit = settingsHolder.getSettings().getUnitMeasurement();

    private final boolean male = settingsHolder.getSettings().isMale();

    @FXML
    private TextField tf_waist;

    @FXML
    private Label label_unit;

    @FXML
    private Label errorLabel;

    @FXML
    private Label label_size_results;

    /**
     * Returns the bottom size for men
     * @param actionEvent Javafx's parameter for getting event details
     */
    public void getMensBottomSize(ActionEvent actionEvent) {
        Measurement m = new Measurement(measureUnit, Double.parseDouble(tf_waist.getText()));
        Waist myWaist = new Waist(male,m);
        try{
            label_size_results.setText(String.valueOf(myWaist.getBottomsSize()));
            label_size_results.setVisible(true);
            errorLabel.setVisible(false);
            settingsHolder.getSettings().getMeasurements().setWaist(Double.parseDouble(tf_waist.getText()));
        } catch (InvalidSizeException e) {
            errorLabel.setText(e.getMessage());
            errorLabel.setVisible(true);
        } catch (NumberFormatException e) {
            errorLabel.setText("Please enter a number");
            errorLabel.setVisible(true);
        }
    }

    /**
     * Setting up units and text for the text field
     */
    public void initialize(){
        label_unit.setText(settingsHolder.getSettings().getUnitString());
        String text = String.valueOf(settingsHolder.getSettings().getMeasurements().getWaist()) ;
        tf_waist.setText(text);
    }
}
