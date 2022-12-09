package application;

import application.clothingModel.Hip;
import application.clothingModel.InvalidSizeException;
import application.clothingModel.Waist;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BottomScreenWomenController {

    private Settings settings = SettingsHolder.getInstance().getSettings();
    private BodyMeasurements bodyMeasurements = settings.getMeasurements();
    private final MeasureUnit measureUnit = settings.getUnitMeasurement();

    public TextField tf_waist;
    public Label label_unit;
    public Label waist_errorLabel;
    public TextField tf_hips;
    public Label label_unit_2;
    public Label hips_errorLabel;
    public Label label_size_results;

    public void getWomensBottomSize(ActionEvent actionEvent) {
        Measurement m = new Measurement(measureUnit, Double.parseDouble(tf_waist.getText()));
        Waist myWaist = new Waist(false,m);
        Hip myHip = new Hip(m);

        int bottomSize = 0;
        label_size_results.setVisible(false);
        waist_errorLabel.setVisible(false);
        hips_errorLabel.setVisible(false);
        try{
            if(myWaist.getBottomsSize() > bottomSize){
                bottomSize = myWaist.getBottomsSize();
            }
            label_size_results.setVisible(true);
            waist_errorLabel.setVisible(false);
            bodyMeasurements.setWaist(Double.parseDouble(tf_waist.getText()));
        } catch (InvalidSizeException e) {
            waist_errorLabel.setText(e.getMessage());
            waist_errorLabel.setVisible(true);
        }
        try{
            if(myHip.getBottomsSize() > bottomSize){
                bottomSize = myHip.getBottomsSize();
            }
            hips_errorLabel.setVisible(false);
            bodyMeasurements.setWaist(Double.parseDouble(tf_waist.getText()));

            label_size_results.setText(String.valueOf(bottomSize));
            label_size_results.setVisible(true);
        } catch (InvalidSizeException e) {
            hips_errorLabel.setText(e.getMessage());
            hips_errorLabel.setVisible(true);
        }
    }

    public void initialize(){
        label_unit.setText(settings.getUnitString());
        String waistText = String.valueOf(bodyMeasurements.getWaist()) ;

        tf_waist.setText(waistText);

        label_unit_2.setText(settings.getUnitString());
        String hipsText = String.valueOf(bodyMeasurements.getHips());
        tf_hips.setText(hipsText);
    }
}
