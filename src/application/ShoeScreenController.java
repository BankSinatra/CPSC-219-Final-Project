package application;

import application.clothingModel.FootLength;
import application.clothingModel.InvalidSizeException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ShoeScreenController {

    private final SettingsHolder settingsHolder = SettingsHolder.getInstance();

    private final MeasureUnit measureUnit = settingsHolder.getSettings().getUnitMeasurement();

    private final boolean male = settingsHolder.getSettings().isMale();

    @FXML
    private TextField tf_foot;

    @FXML
    private Label label_unit;

    @FXML
    private Label errorLabel;

    @FXML
    private Label label_size_results;

    public void getShoeSize(ActionEvent actionEvent) {
        Measurement m = new Measurement(measureUnit, Double.parseDouble(tf_foot.getText()));
        FootLength myFoot = new FootLength(m);
        try{
            label_size_results.setText(String.valueOf(myFoot.getShoes(male,m)));
            label_size_results.setVisible(true);
            errorLabel.setVisible(false);
            settingsHolder.getSettings().getMeasurements().setWaist(Double.parseDouble(tf_foot.getText()));
        } catch (InvalidSizeException e) {
            errorLabel.setText(e.getMessage());
            errorLabel.setVisible(true);
        }
    }

    public void initialize(){
        label_unit.setText(settingsHolder.getSettings().getUnitString());
        String text = String.valueOf(settingsHolder.getSettings().getMeasurements().getWaist()) ;
        tf_foot.setText(text);
    }
}
