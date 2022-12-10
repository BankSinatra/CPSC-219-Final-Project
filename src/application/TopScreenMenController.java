package application;

import application.clothingModel.Chest;
import application.clothingModel.InvalidSizeException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TopScreenMenController {
    private final SettingsHolder settingsHolder = SettingsHolder.getInstance();

    private final MeasureUnit measureUnit = settingsHolder.getSettings().getUnitMeasurement();

    private final boolean male = settingsHolder.getSettings().isMale();

    @FXML
    private Label label_size_results;
    @FXML
    private Label errorLabel;
    @FXML
    private Label label_unit;
    @FXML
    private TextField tf_chest;

    /**
     * Displays the top size for men to its window. Uses chest measurements to calculate
     * @param actionEvent Javafx's parameter for getting event details
     */
    public void getMensTopSize(ActionEvent actionEvent) {
        Measurement m = new Measurement(measureUnit, Double.parseDouble(tf_chest.getText()));
        Chest myChest = new Chest(m);
        try{
            label_size_results.setText(String.valueOf(myChest.getTopSize()));
            label_size_results.setVisible(true);
            errorLabel.setVisible(false);
            settingsHolder.getSettings().getMeasurements().setChest(Double.parseDouble(tf_chest.getText()));
        } catch (InvalidSizeException e) {
            errorLabel.setText(e.getMessage());
            errorLabel.setVisible(true);
        }
    }

    /**
     * Setting up units and text for the text field
     */
    public void initialize() {
        label_unit.setText(settingsHolder.getSettings().getUnitString());
        String text = String.valueOf(settingsHolder.getSettings().getMeasurements().getChest());
        tf_chest.setText(text);

    }
}
