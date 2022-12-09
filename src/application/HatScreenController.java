package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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

    public void getHatSize(ActionEvent actionEvent) {
    }

    public void initialize(){
        label_unit.setText(settingsHolder.getSettings().getUnitString());
        String text = String.valueOf(settingsHolder.getSettings().getMeasurements().getWaist()) ;
        tf_circumference.setText(text);
    }
}
