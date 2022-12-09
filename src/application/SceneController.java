package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {

 private Stage stage;
 private Scene scene;
 private Parent root;
 
 /**
  * part of controller that switches the scene to the welcome
  * screen
  * @param event
  * @throws IOException
  */
 public void switchToScene1(ActionEvent event) throws IOException {
  root = FXMLLoader.load(getClass().getResource("WelcomeScreen.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
 /**
  * part of controller that switches the scene to the settings
  * scene
  * @param event
  * @throws IOException
  */
 public void switchToScene2(ActionEvent event) throws IOException {
  Parent root = FXMLLoader.load(getClass().getResource("SettingsPageUISwitch.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
 /**
  * part of controller that switches the scene to the HomeScreenView
  * scene
  * @param event
  * @throws IOException
  */
 public void switchToHomeScene (ActionEvent event) throws IOException {
	 Parent root = FXMLLoader.load(getClass().getResource("HomeScreenView.fxml"));
	 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	 scene = new Scene(root);
	 stage.setScene(scene);
	 stage.show();
 }
 /**
  * part of controller that switches the scene to the ClothingChoiceView
  * scene
  * @param event
  * @throws IOException
  */
 public void switchToClothingChoiceScene (ActionEvent event) throws IOException {
	 Parent root = FXMLLoader.load(getClass().getResource("ClothingChoiceView.fxml"));
	 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	 scene = new Scene(root);
	 stage.setScene(scene);
	 stage.show();
 }
 /**
  * part of controller that switches the scene to the LaundryPalHome
  * scene
  * @param event
  * @throws IOException
  */
 public void switchToLaundryPalScene (ActionEvent event) throws IOException {
	 Parent root = FXMLLoader.load(getClass().getResource("LaundryPalHome.fxml"));
	 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	 scene = new Scene(root);
	 stage.setScene(scene);
	 stage.show();
 }
 /**
  * part of controller that switches the scene to the OutfitCreatorView
  * scene
  * @param event
  * @throws IOException
  */
 public void switchToOutfitCreatorScene (ActionEvent event) throws IOException {
	 Parent root = FXMLLoader.load(getClass().getResource("OutfitCreatorView.fxml"));
	 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	 scene = new Scene(root);
	 stage.setScene(scene);
	 stage.show();
 }
 
 
}
