package application;

import application.MeasureUnit;
import application.Measurement;
import application.SettingsHolder;
import application.clothingModel.InvalidSizeException;
import application.clothingModel.Waist;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BottomScreenMenController {

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


    public void getMensBottomSize(ActionEvent actionEvent) {
        Measurement m = new Measurement(measureUnit, Double.parseDouble(tf_waist.getText()));
        Waist myWaist = new Waist(male,m);
        try{
            label_size_results.setText(String.valueOf(myWaist.getBottomsSize()));
            label_size_results.setVisible(true);
            errorLabel.setVisible(false);
        } catch (InvalidSizeException e) {
            errorLabel.setText(e.getMessage());
            errorLabel.setVisible(true);
        }
    }

    public void initialize(){
        label_unit.setText(settingsHolder.getSettings().getUnitString());
        String text = String.valueOf(settingsHolder.getSettings().getMeasurements().getHips()) ;
        tf_waist.setText(text);
    }
}
