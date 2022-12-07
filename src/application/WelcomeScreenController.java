package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class WelcomeScreenController{

    @FXML
    private ChoiceBox<String> cb_sex;

    private SettingsHolder settingsHolder = SettingsHolder.getInstance();

    public void switchToHomeScene (ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("HomeScreenView.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        String sex = cb_sex.getValue();
        if(Objects.equals(sex, "Female")){
            settingsHolder.getSettings().setMale(false);
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}