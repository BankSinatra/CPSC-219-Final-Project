package application;

import java.io.IOException;

import application.clothingModel.Bust;
import application.clothingModel.Chest;
import application.clothingModel.Hip;
import application.clothingModel.Waist;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Buttons clicked within clothing choice scene will be controlled here to ensure correct
 *  clothing options are called for sizing.
 * @author CS219-user
 *
 */
public class ClothingChoiceController{

    SettingsHolder settingsHolder = SettingsHolder.getInstance();
    Settings settings = settingsHolder.getSettings();

    @FXML
    private Button btn_hat_size;

    /**
     * Allows the clothing choice scene to switch back to home scene.
     * @param event triggered when button is clicked
     * @throws IOException
     */
    @FXML
    public void switchToHomeScene (ActionEvent event) throws IOException {
        Stage stage = (Stage) btn_hat_size.getScene().getWindow();
        stage.close();
    }

    /**
     * When hat button is clicked application will know that hats need to be calculated.
     * @param event triggered when button is clicked
     * @throws IOException
     */
    @FXML
    void calculateHatSize(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HatScreen.fxml"));
        VBox root = loader.load();
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Hats");
        primaryStage.setScene(scene);
        //Open in new window
        primaryStage.show();
    }

    /**
     * When shoe button is clicked application will know that shoe size needs to be calculated.
     * @param event triggered when button is clicked
     * @throws IOException
     */
    @FXML
    void calculateShoeSize (ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ShoeScreen.fxml"));
        VBox root = loader.load();
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Shoes");
        primaryStage.setScene(scene);
        //Open in new window
        primaryStage.show();
    }
    
    /**
     * When tops button is clicked application will know that tops size need to be calculated.
     * @param event triggered when button is clicked
     * @throws IOException
     */
    @FXML
    void calculateTopsSize (ActionEvent event){
        BodyPart[] BPlist;
        SizeDialog SD;
        if (settings.isMale()){
            BPlist = new BodyPart[]{new Chest()};
        }else{
            BPlist = new BodyPart[]{new Bust(), new Hip(), new Waist(settings.isMale())};
        }

        SD = new SizeDialog(ClothingType.TOP, settings.getUnitMeasurement(), BPlist);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Tops");
        Scene quizGradesScene = new Scene(SD);
        primaryStage.setScene(quizGradesScene);

        //Open in new window
        primaryStage.show();
    }
    
   /**
    * When bottoms button is clicked new scene will open prompting user for correlating sizes
    * @param event triggered once bottoms button is clicked.
    * @throws IOException
    */
    @FXML
    void calculateBottomsSize (ActionEvent event){
        BodyPart[] BPlist;
        SizeDialog SD;
        if (settings.isMale()){
            BPlist = new BodyPart[]{new Waist(settings.isMale())};
        }else{
            BPlist = new BodyPart[]{new Waist(settings.isMale()), new Hip()};
        }

        SD = new SizeDialog(ClothingType.BOTTOM, settings.getUnitMeasurement(), BPlist);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Bottoms");
        Scene quizGradesScene = new Scene(SD);
        primaryStage.setScene(quizGradesScene);

        //Open in new window
        primaryStage.show();
    }
}

