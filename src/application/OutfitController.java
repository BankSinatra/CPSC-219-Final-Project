package application;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class OutfitController {


	@FXML
	private Label label_error;

	@FXML
	private ChoiceBox<String> tempUnitMenu;

	@FXML
	private TextField temperatureTextfield;

	private Temperature t;

	/**
	 * closes and goes back to main scene
	 * @param event
	 */
	@FXML
	void switchToHomeScene(ActionEvent event) {
			Stage stage = (Stage) temperatureTextfield.getScene().getWindow();
			stage.close();
	}

	/**
	 *
	 * @param unit gets the unit string value
	 * @param temp gets a temperature value
	 * @throws OutfitCreatorException if the temperature aren't real
	 */
	private void validateInput(String unit, String temp) throws OutfitCreatorException{
		if(unit == null && temp.equals("")){
			throw new OutfitCreatorException("Please pick a unit and a temperature");
		}
		if (unit == null){
			throw new OutfitCreatorException("Pick between Celsius and Fahrenheit");
		}else if (temp.equals("")){
			throw new OutfitCreatorException("Type a temperature");
		}else{
			try {
				double t = Double.parseDouble(temp);
			}catch (Exception e){
				throw new OutfitCreatorException("Please choose a number for a temperture");
			}

		}
	}
/**
 * The getOutfit method is meant to match the information from the temperature
 * the user inputed and match it with outfits that have appropriate
 * set bounds
 * 
 * @param event takes the value inputed in the temperature unit menu
 * validates its value if the units are in celcius. Create set outfits with
 * a name, lower bound, and upperbound. There is a creation of two different lists,
 * one that contains all the outfits, and the crucial one that adds outfits
 * under the condition that the outfit passes the tempcheck test that has
 * the users stored bounds.
 */
	@FXML
	void getOutfit(ActionEvent event) {
		try {
			validateInput(tempUnitMenu.getValue(), temperatureTextfield.getText());
			if (tempUnitMenu.getValue().equals("Celsius")){
				t = new Temperature(Double.parseDouble(temperatureTextfield.getText()), true);
			}else{
				t = new Temperature(Double.parseDouble(temperatureTextfield.getText()), false); //Fahrenheit
			}

			label_error.setVisible(false);

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


			t.convertToCelcius();
			for (Outfit o : fits) {
				if (o.tempcheck(t.getTemperature())) {
					recs.add(o);
				}
			}

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

		} catch (OutfitCreatorException e) {
			label_error.setText(e.getMessage());
			label_error.setVisible(true);
		}
	}
}