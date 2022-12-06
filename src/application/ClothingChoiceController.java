package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ClothingChoiceController {

    boolean tops = false;
	boolean bottoms = false;
	boolean hats = false;
	boolean shoes = false;

    @FXML
    private Button btn_hat_size;

    @FXML
    public void switchToHomeScene (ActionEvent event) throws IOException {
        Stage stage = (Stage) btn_hat_size.getScene().getWindow();
        stage.close();
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

