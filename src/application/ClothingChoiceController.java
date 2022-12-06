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
	@FXML
	private Button shoesButton;

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
    	System.out.println("HATSSS");
    	boolean hats = true;
    	
    }
    
    @FXML
    void calculateShoeSize (ActionEvent event) {
    	System.out.println("SHOEEES");
    	
    }
    
    @FXML
    void calculateTopsSize (ActionEvent event) {
    	System.out.println("TOPSSS");
    	
    }
    
    @FXML 
    void calculateBottomsSize (ActionEvent event) {
    	System.out.println("BOTTOMSS");
    	
    }

}

