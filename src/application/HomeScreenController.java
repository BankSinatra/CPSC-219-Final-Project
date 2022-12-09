package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The home screen controller controls the separate scenes associated with the home screen 
 * and allows them to switch between each other.
 * @author CS219-user
 *
 */
public class HomeScreenController{
	
	
	/**
	 * Allows for scene to be swapped to clothing choice scene.
	 * @param event is started when button is clicked and will switch scene
	 * @throws IOException
	 */
    @FXML
    void switchToClothingChoiceScene(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ClothingChoiceView.fxml"));
        VBox root = loader.load();
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Settings");
        primaryStage.setScene(scene);

        //Open in new window
        primaryStage.initModality(Modality.APPLICATION_MODAL);
        primaryStage.show();
    }
    
    /**
	 * Allows for scene to be swapped to laundry pal scene.
	 * @param event is started when button is clicked and will switch scene
	 * @throws IOException
	 */
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

    /**
	 * Allows for scene to be swapped to outfit creator scene.
	 * @param event is started when button is clicked and will switch scene
	 * @throws IOException
	 */
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

    /**
	 * Allows for scene to be swapped to settings scene.
	 * @param event is started when button is clicked and will switch scene
	 * @throws IOException
	 */
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
