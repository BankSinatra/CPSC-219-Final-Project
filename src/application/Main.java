package application;

import java.io.*;
import java.util.Objects;
import java.util.Properties;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;


public class Main extends Application {
	Settings settings = settingsSetup();
	@Override
	public void start(Stage primaryStage) {
		boolean welcome = settings.isWelcome();
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

	@Override
	public void stop(){
		endingSetup(settings);
	}

	//Helper function to get body measurements from properties file
	private BodyMeasurements measureSetup(Properties properties){
		try {
			double head = Double.parseDouble(properties.getProperty("bodyMeasurement.headCircumference"));
			double foot = Double.parseDouble(properties.getProperty("bodyMeasurement.footLength"));
			double bust = Double.parseDouble(properties.getProperty("bodyMeasurement.bust"));
			double waist = Double.parseDouble(properties.getProperty("bodyMeasurement.waist"));
			double chest = Double.parseDouble(properties.getProperty("bodyMeasurement.chest"));
			double hips = Double.parseDouble(properties.getProperty("bodyMeasurement.hips"));
			return new BodyMeasurements(head, foot, bust, waist, chest, hips);
		}catch (Exception ignored){
			return new BodyMeasurements();
		}
	}

	//Try to read from file
	private Settings settingsSetup() {
		File myObj = new File("settings.properties");
		try {
			if (myObj.createNewFile()) {
				//Brand new file created!
				return new Settings();
			} else {
				//File exist already. Read from it
				Properties settings = new Properties();
				settings.load(new FileInputStream("settings.properties"));
				BodyMeasurements bodyMeasurements = measureSetup(settings);
				boolean welcome = Boolean.parseBoolean(settings.getProperty("settings.welcome"));
				boolean male = Boolean.parseBoolean(settings.getProperty("settings.male"));
				MeasureUnit measureUnit;
				if (settings.getProperty("settings.male").equals("cm") ){
					measureUnit = MeasureUnit.CM;
				}else{
					measureUnit = MeasureUnit.INCHES;
				}
				return new Settings(measureUnit, male, bodyMeasurements, welcome);
			}
		} catch (IOException ignored) {
			System.out.println("Something bad happened");
		}
		return new Settings();
	}


	private void endingSetup(Settings settings){
		try(OutputStream output = new FileOutputStream("settings.properties")){
			Properties prop = new Properties();

			prop.setProperty("settings.welcome", String.valueOf(settings.isWelcome()));
			prop.setProperty("settings.male",  String.valueOf(settings.isMale()));
			prop.setProperty("settings.unitMeasure", settings.getUnitMeasurement());

			prop.setProperty("bodyMeasurement.headCircumference", String.valueOf(settings.getMeasurements().getHeadCircumference()));
			prop.setProperty("bodyMeasurement.footLength", String.valueOf(settings.getMeasurements().getFootLength()));
			prop.setProperty("bodyMeasurement.bust", String.valueOf(settings.getMeasurements().getBust()));
			prop.setProperty("bodyMeasurement.waist", String.valueOf(settings.getMeasurements().getWaist()));
			prop.setProperty("bodyMeasurement.chest", String.valueOf(settings.getMeasurements().getChest()));
			prop.setProperty("bodyMeasurement.hips", String.valueOf(settings.getMeasurements().getHips()));

			prop.store(output, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
