package application;

import application.clothingModel.HeadCircumference;
import application.clothingModel.InvalidSizeException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
/**
 * Controller for the hat screen
 * @author CS219-user
 *
 */

public class HatScreenController {

    private final SettingsHolder settingsHolder = SettingsHolder.getInstance();

    private final MeasureUnit measureUnit = settingsHolder.getSettings().getUnitMeasurement();

    @FXML
    private Label label_size_results;

    @FXML
    private Label errorLabel;

    @FXML
    private Label label_unit;

    @FXML
    private TextField tf_circumference;

    /**
     * Displays the hat size for men and women to it's window
     * @param actionEvent Javafx's parameter for getting event details
     */
    public void getHatSize(ActionEvent actionEvent) {
        Measurement m = new Measurement(measureUnit, Double.parseDouble(tf_circumference.getText()));
        HeadCircumference myHead = new HeadCircumference(m);
        try{
            label_size_results.setText(String.valueOf(myHead.getHatSize(m)));
            label_size_results.setVisible(true);
            errorLabel.setVisible(false);
            System.out.println(tf_circumference.getText());
            settingsHolder.getSettings().getMeasurements().setHeadCircumference(Double.parseDouble(tf_circumference.getText()));
            System.out.println(settingsHolder.getSettings().getMeasurements().getHeadCircumference());
        } catch (InvalidSizeException e) {
            errorLabel.setText(e.getMessage());
            errorLabel.setVisible(true);
        }
    }
    /**
     * Setting up units and text for the text field
     */
    public void initialize(){
        label_unit.setText(settingsHolder.getSettings().getUnitString());
        String text = String.valueOf(settingsHolder.getSettings().getMeasurements().getFootLength()) ;
        tf_circumference.setText(text);
    }
}
