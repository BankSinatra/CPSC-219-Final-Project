package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.util.Objects;

public class SettingsPageController {

    @FXML
    private ChoiceBox<String> cb_sex;

    @FXML
    private ChoiceBox<String> cb_measure;

    private SettingsHolder settingsHolder = SettingsHolder.getInstance();

    @FXML
    private Button btn_home;
/**
 * When the user switches the scene it will keep the information that
 * they have already entered
 * @param actionEvent Event that unfolds after user pressed the button
 */
    public void switchToHomeScene(ActionEvent actionEvent) {
        Stage stage = (Stage) btn_home.getScene().getWindow();
        String sex = cb_sex.getValue();
        String unit = cb_measure.getValue();

        settingsHolder.getSettings().setMale(Objects.equals(sex, "Male"));

        if(sex.equals("Male")){
            settingsHolder.getSettings().setMale(true);
        }else if(sex.equals("Female")){
            settingsHolder.getSettings().setMale(false);
        }


        if(unit.equals("Centimeters")){
            settingsHolder.getSettings().setUnitMeasurement(MeasureUnit.CM);
        }else if(unit.equals("Inches")){
            settingsHolder.getSettings().setUnitMeasurement(MeasureUnit.INCHES);
        }

        stage.close();
    }
/**
 * Initializes values based off information that has already
 * been entered by the user
 */
    public void initialize(){
        if (settingsHolder.getSettings().isMale()){
            cb_sex.setValue("Male");
        }else{
            cb_sex.setValue("Female");
        }


        if(settingsHolder.getSettings().getUnitString().equals("inches")){
            cb_measure.setValue("Inches");
        }else{
            cb_measure.setValue("Centimeters");
        }
    }
}
