package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ClothingChoiceController {
	boolean tops = false;
	boolean bottoms = false;
	boolean hats = false;
	boolean shoes = false;

    @FXML
    public void switchToHomeScene (ActionEvent event) throws IOException {
   	 Parent root = FXMLLoader.load(getClass().getResource("HomeScreenView.fxml"));
   	 Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
   	 Scene scene = new Scene(root);
   	 stage.setScene(scene);
   	 stage.show();
    }
    
    @FXML
    void calculateHatSize(ActionEvent event) {
    	boolean hats = true;
    	
    }
    
    @FXML
    void calculateShoeSize (ActionEvent event) {
    	boolean shoes = true;
    	
    }
    
    @FXML
    void calculateTopsSize (ActionEvent event) {
    	boolean tops = true;
    	
    }
    
    @FXML 
    void calculateBottomsSize (ActionEvent event) {
    	boolean bottoms = true;
    	
    }
    
    @FXML
    void calculateSize (ActionEvent event) {
    	System.out.println("get size button clicked");
    }

}

