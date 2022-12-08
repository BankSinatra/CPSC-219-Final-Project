package application;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class OutfitController {


	@FXML
	private MenuButton tempUnitMenu;

	@FXML
	private TextField weatherTextfield;

	@FXML
	void switchToHomeScene(ActionEvent event) {
			Stage stage = (Stage) weatherTextfield.getScene().getWindow();
			stage.close();
	}

	@FXML
	void getOutfit(ActionEvent event) {
		double temp = 0.0;
		String text = weatherTextfield.getText();
		temp = Double.parseDouble(text);
		Outfit hat = new Outfit("hat", 10, 20);
		Outfit tShirt = new Outfit("t-shirt", 15, 50);
		Outfit shorts = new Outfit("shorts", 15, 50);
		Outfit jacket = new Outfit("jacket", 0, 10);
		Outfit sweater = new Outfit("sweater", 0, 10);
		Outfit jeans = new Outfit("jeans", -50, 15);
		Outfit coat = new Outfit("coat", -50, 0);


		ArrayList<Outfit> fits = new ArrayList<Outfit>();
		fits.add(hat);
		fits.add(tShirt);
		fits.add(shorts);
		fits.add(jacket);
		fits.add(sweater);
		fits.add(jeans);
		fits.add(coat);


		ArrayList<Outfit> recs = new ArrayList<Outfit>();

		for (Outfit o : fits) {
			if (o.tempcheck(Double.parseDouble(weatherTextfield.getText()))) {
				recs.add(o);
				System.out.println("hi");
			}
		}

		Scene mainScene = weatherTextfield.getScene();
		Stage applicationStage = new Stage();
		VBox container = new VBox();
		for (Outfit o : recs){
			Label outfitLabel = new Label(o.toString());
			container.getChildren().add(outfitLabel);
		}
		Scene newScene = new Scene(container); //Turning it into a scene

		applicationStage.setScene(newScene);

		//Open in new window
		applicationStage.initModality(Modality.APPLICATION_MODAL);
		applicationStage.show();

	}
}