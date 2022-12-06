package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SettingsPageController {

    @FXML
    private Button btn_home;

    public void switchToHomeScene(ActionEvent actionEvent) {
        Stage stage = (Stage) btn_home.getScene().getWindow();
        stage.close();
    }

}
