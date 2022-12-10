package application;

import application.clothingModel.Bust;
import application.clothingModel.Hip;
import application.clothingModel.InvalidSizeException;
import application.clothingModel.Waist;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TopScreenWomenController {

    private Settings settings = SettingsHolder.getInstance().getSettings();
    private BodyMeasurements bodyMeasurements = settings.getMeasurements();
    private final MeasureUnit measureUnit = settings.getUnitMeasurement();

    @FXML
    private Label label_size_results;
    @FXML
    private Label hips_errorLabel;
    @FXML
    private Label label_unit_2;
    @FXML
    private TextField tf_hips;
    @FXML
    private Label waist_errorLabel;
    @FXML
    private Label label_unit;
    @FXML
    private TextField tf_waist;
    @FXML
    private Label bust_errorLabel;
    @FXML
    private Label label_unit_3;
    @FXML
    private TextField tf_bust;

    /**
     * Displays the top size for women to it's window. It checks waist, bust, and hip measurements
     * @param actionEvent Javafx's parameter for getting event details
     */

    public void getWomenTopSize(ActionEvent actionEvent) {
        Measurement w = new Measurement(measureUnit, Double.parseDouble(tf_waist.getText()));
        Measurement h = new Measurement(measureUnit, Double.parseDouble(tf_waist.getText()));
        Measurement b = new Measurement(measureUnit, Double.parseDouble(tf_bust.getText()));
        Waist myWaist = new Waist(false,w);
        Hip myHip = new Hip(h);
        Bust myBust = new Bust(b);

        int bottomSize = 0;
        label_size_results.setVisible(false);
        waist_errorLabel.setVisible(false);
        hips_errorLabel.setVisible(false);
        bust_errorLabel.setVisible(false);
        try{
            if(myWaist.getFemaleTopSize() > bottomSize){
                bottomSize = myWaist.getFemaleTopSize();
            }
            waist_errorLabel.setVisible(false);
            bodyMeasurements.setWaist(Double.parseDouble(tf_waist.getText()));
        } catch (InvalidSizeException e) {
            waist_errorLabel.setText(e.getMessage());
            waist_errorLabel.setVisible(true);
        }
        try{
            if(myHip.getHipSize() > bottomSize){
                bottomSize = myHip.getHipSize();
            }
            hips_errorLabel.setVisible(false);
            bodyMeasurements.setHips(Double.parseDouble(tf_hips.getText()));
        } catch (InvalidSizeException e) {
            hips_errorLabel.setText(e.getMessage());
            hips_errorLabel.setVisible(true);
        }
        try{
            if(myBust.getWomenTops() > bottomSize){
                bottomSize = myBust.getWomenTops();
            }
            bust_errorLabel.setVisible(false);
            bodyMeasurements.setBust(Double.parseDouble(tf_bust.getText()));

            label_size_results.setText(String.valueOf(bottomSize));
            label_size_results.setVisible(true);
        } catch (InvalidSizeException e) {
            bust_errorLabel.setText(e.getMessage());
            bust_errorLabel.setVisible(true);
        }
    }

    /**
     * Setting up units and text for the text field
     */
    public void initialize(){
        label_unit.setText(settings.getUnitString());
        String waistText = String.valueOf(bodyMeasurements.getWaist()) ;
        tf_waist.setText(waistText);

        label_unit_2.setText(settings.getUnitString());
        String hipsText = String.valueOf(bodyMeasurements.getHips());
        tf_hips.setText(hipsText);

        label_unit_3.setText(settings.getUnitString());
        String bustText = String.valueOf(bodyMeasurements.getBust());
        tf_hips.setText(bustText);
    }
}
