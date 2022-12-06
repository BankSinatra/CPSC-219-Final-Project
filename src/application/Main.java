package application;

import java.io.FileInputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		boolean welcome = true;
		try {
			if (welcome){
				FXMLLoader loader = new FXMLLoader();
				VBox root = loader.load(new FileInputStream("src/application/WelcomeScreen.fxml"));
				Scene scene = new Scene(root);
				primaryStage.setScene(scene);
				primaryStage.setTitle("Welcome Screen");
				primaryStage.show();
			}else{
				FXMLLoader loader = new FXMLLoader();
				VBox root = loader.load(new FileInputStream("src/application/HomeScreenView.fxml"));
				Scene scene = new Scene(root);
				primaryStage.setScene(scene);
				primaryStage.setTitle("Home Screen");
				primaryStage.show();
			}

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
