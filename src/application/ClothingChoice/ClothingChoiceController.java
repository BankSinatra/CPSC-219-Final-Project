package application.ClothingChoice;

import java.io.IOException;

import application.*;
import application.ClothingChoice.ClothingChoiceModel.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
        BodyPart[] BPlist;
        SizeDialog SD;
        BPlist = new BodyPart[]{new HeadCircumference()};

        SD = new HeadSizeDialog(ClothingType.HAT, settings.getUnitMeasurement(), BPlist);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Hat");
        Scene quizGradesScene = new Scene(SD);
        primaryStage.setScene(quizGradesScene);

        //Open in new window
        primaryStage.show();
    }

    /**
     * When shoe button is clicked application will know that shoe size needs to be calculated.
     * @param event triggered when button is clicked
     */
    @FXML
    void calculateShoeSize (ActionEvent event){
        BodyPart[] BPlist;
        SizeDialog SD;
        BPlist = new BodyPart[]{new FootLength(settings.isMale())};

        SD = new NumberSizeDialog(ClothingType.SHOES, settings.getUnitMeasurement(), BPlist);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Shoes");
        Scene quizGradesScene = new Scene(SD);
        primaryStage.setScene(quizGradesScene);

        //Open in new window
        primaryStage.show();
    }
    
    /**
     * When tops button is clicked application will know that tops size need to be calculated.
     * @param event triggered when button is clicked
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

        SD = new NumberSizeDialog(ClothingType.TOP, settings.getUnitMeasurement(), BPlist);
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

        SD = new NumberSizeDialog(ClothingType.BOTTOM, settings.getUnitMeasurement(), BPlist);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Bottoms");
        Scene quizGradesScene = new Scene(SD);
        primaryStage.setScene(quizGradesScene);

        //Open in new window
        primaryStage.show();
    }
}

