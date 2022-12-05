package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClothingChoiceController {

    @FXML
    public void switchToHomeScene (ActionEvent event) throws IOException {
   	 Parent root = FXMLLoader.load(getClass().getResource("HomeScreenView.fxml"));
   	 Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
   	 Scene scene = new Scene(root);
   	 stage.setScene(scene);
   	 stage.show();
    }

}

