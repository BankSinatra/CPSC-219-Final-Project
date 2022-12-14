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
	SettingsHolder settingsHolder = SettingsHolder.getInstance();
	@Override
	public void start(Stage primaryStage) {
		settingsHolder.setSettings(settingsSetup());
		boolean welcome = settingsHolder.getSettings().isWelcome();
		try {
			FXMLLoader loader = new FXMLLoader();
			VBox root;
			if (welcome){
				root = loader.load(new FileInputStream("src/application/WelcomeScreen.fxml"));
				Scene scene = new Scene(root);
				primaryStage.setScene(scene);
				primaryStage.setTitle("Welcome Screen");
			}else{
				root = loader.load(new FileInputStream("src/application/HomeScreenView.fxml"));
				Scene scene = new Scene(root);
				primaryStage.setScene(scene);
				primaryStage.setTitle("Home Screen");
			}
			primaryStage.show();
			settingsHolder.getSettings().setWelcome(false);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void stop(){
		endingSetup(settingsHolder.getSettings());
	}

	/**
	 * Helper function to get body measurements from properties file
	 * @param properties A properties class we want to read from
	 * @return A bodyMeasurements class created from the properties file
	 */
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

	/**
	 * Tries to read from the settings.properties file (If it exists) to generate a settings configuration when the program opens. If it doesn't exist, it creates one
	 * Learned file reading from: https://mkyong.com/java/java-properties-file-examples/ and https://www.w3schools.com/java/java_files_create.asp
	 * @return a settings file to use
	 */
	private Settings settingsSetup() {
		File myObj = new File("settings.properties");
		try {
			if (myObj.createNewFile()) {
				//Brand-new file created!
				Settings s = new Settings();
				s.setWelcome(true);
				return s;
			} else {
				//File exist already. Read from it
				Properties settings = new Properties();
				settings.load(new FileInputStream("settings.properties"));
				BodyMeasurements bodyMeasurements = measureSetup(settings);
				boolean welcome = Boolean.parseBoolean(settings.getProperty("settings.welcome"));
				boolean male = Boolean.parseBoolean(settings.getProperty("settings.male"));
				MeasureUnit measureUnit;
				if (settings.getProperty("settings.unitMeasure") != null) {
					if (Objects.equals(settings.getProperty("settings.unitMeasure"), "cm")) {
						measureUnit = MeasureUnit.CM;
					} else {
						measureUnit = MeasureUnit.INCHES;
					}
				}else{
					measureUnit = MeasureUnit.CM;
				}
				return new Settings(measureUnit, male, bodyMeasurements, welcome);
			}
		} catch (IOException ignored) {
			System.out.println("Something bad happened");
		}
		return new Settings();
	}

	/**
	 * Reads the settings file to edit the settings.properties file and save settings
	 * @param settings the settings file that is being read
	 */
	private void endingSetup(Settings settings){
		try(OutputStream output = new FileOutputStream("settings.properties")){
			Properties prop = new Properties();

			prop.setProperty("settings.welcome", String.valueOf(settings.isWelcome()));
			prop.setProperty("settings.male",  String.valueOf(settings.isMale()));
			prop.setProperty("settings.unitMeasure", settings.getUnitString());

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
