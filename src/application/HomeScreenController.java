package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeScreenController {

    @FXML
    void switchToClothingChoiceScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ClothingChoiceView.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Settings");
        primaryStage.setScene(scene);

        //Open in new window
        primaryStage.initModality(Modality.APPLICATION_MODAL);
        primaryStage.show();
    }

    @FXML
    void switchToLaundryPalScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LaundryPalHome.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Settings");
        primaryStage.setScene(scene);

        //Open in new window
        primaryStage.initModality(Modality.APPLICATION_MODAL);
        primaryStage.show();
    }

    @FXML
    void switchToOutfitCreatorScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("OutfitCreatorView.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Size Calculator");
        primaryStage.setScene(scene);

        //Open in new window
        primaryStage.initModality(Modality.APPLICATION_MODAL);
        primaryStage.show();
    }

    @FXML
    public void switchToSettings(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SettingsPageUI.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Settings");
        primaryStage.setScene(scene);

        //Open in new window
        primaryStage.initModality(Modality.APPLICATION_MODAL);
        primaryStage.show();
    }
}
