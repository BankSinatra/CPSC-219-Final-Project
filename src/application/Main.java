package application;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader();
			VBox root = loader.load(new FileInputStream("src/application/LaundryPalHome.fxml"));
			LaundryPalHomeController controller = (LaundryPalHomeController)loader.getController();
			controller.applicationStage = primaryStage;

			Scene scene = new Scene(root, 700, 300);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Laundry Pal");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
