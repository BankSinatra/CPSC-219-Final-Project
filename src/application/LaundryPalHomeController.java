package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LaundryPalHomeController {

		Stage applicationStage;
	
		@FXML
		private Button btn_wash;

		@FXML
	    private Button btn_wash_30;

	    @FXML
	    private Button btn_wash_40;

	    @FXML
	    private Button btn_wash_50;
	    
	    @FXML
	    private Button btn_wash_60;
	    
	    @FXML
	    private Button btn_hand_wash;
	    
	    @FXML
	    private Button btn_do_not_wash;

		@FXML
		private Button btn_tumble_dry;

		@FXML
		private Button btn_tumble_dry_low;

		@FXML
		private Button btn_tumble_dry_normal;

		@FXML
		private Button btn_do_not_tumble_dry;

	    @FXML
	    private Button btn_hcs_gentle;

	    @FXML
	    private Button btn_dry;

	    @FXML
	    private Button btn_drip_dry_shade;

	    @FXML
	    private Button btn_no_chemical_clean;

	    @FXML
	    private Button btn_dry_shade;

	    @FXML
	    private Button btn_pce_only;

	    @FXML
	    private Button btn_line_dry;

	    @FXML
	    private Button btn_hcs_very_gentle;

	    @FXML
	    private Button btn_dry_flat_shade;

	    @FXML
	    private Button btn_pro_cleaning;

	    @FXML
	    private Button btn_no_wet_clean;

	    @FXML
	    private Button btn_do_not_bleach;

	    @FXML
	    private Button btn_pce_very_gentle;

	    @FXML
	    private Button btn_wet_clean_gentle;

	    @FXML
	    private Button btn_bleach;

	    @FXML
	    private Button btn_wet_clean;

	    @FXML
	    private Button btn_dry_flat;

	    @FXML
	    private Button btn_wet_clean_very_gentle;

	    @FXML
	    private Button btn_bleach_cl;



	    @FXML
	    private Button btn_iron;

	    @FXML
	    private Button btn_line_dry_shade;

	    @FXML
	    private Button btn_iron_high;

	    @FXML
	    private Button btn_drip_dry;

	    @FXML
	    private Button btn_hcs_only;

	    @FXML
	    private Button btn_pce_gentle;

	    @FXML
	    private Button btn_do_not_iron;

	    @FXML
	    private Button btn_iron_low;

	    @FXML
	    private Button btn_bleach_no_cl;

	    @FXML
	    private Button btn_iron_medium;

		@FXML
		public Button btn_return_to_home;

		private ArrayList<Laundry> iconList = new ArrayList<Laundry>();

		public void switchToHomeScene (ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("HomeScreenView.fxml"));
			Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		}
    
	    private void bindImage(String location, Button btn, String instructions) throws FileNotFoundException {
			FileInputStream file = new FileInputStream(location);
	        Image img = new Image(file);
	        ImageView imageView = new ImageView(img);
	        imageView.setPreserveRatio(true);
	        imageView.setFitWidth(50);
	        imageView.setFitHeight(50);
	        btn.setGraphic(imageView);
	        btn.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
			btn.setOnAction(event -> {
				Object node = event.getSource(); //returns the object that generated the event
				if (node instanceof Button) {
					Button b = (Button)node;
					if(b.getParent() instanceof HBox) {
						HBox parent = (HBox) b.getParent();
						for(Node child : parent.getChildren()){
							if(!child.equals(b)){
								//Disable
							}
						}
						try {
							iconList.add(new Laundry(parent.getId(), instructions));
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}

			});
	    }

		private void iconPress(){

		}
	    
	    public void initialize() {
	        try{
				//Washing
	            bindImage("Resources/LaundrySymbols/Washing/Wash.svg.png", btn_wash, "Wash your article of clothing in water");
	            bindImage("Resources/LaundrySymbols/Washing/Wash_30.svg.png", btn_wash_30, "Wash your clothing in water at or below 30 °C");
	            bindImage("Resources/LaundrySymbols/Washing/Wash_40.svg.png", btn_wash_40, "Wash your clothing in water at or below 40 °C");
	            bindImage("Resources/LaundrySymbols/Washing/Wash_50.svg.png", btn_wash_50, "Wash your clothing in water at or below 50 °C");
	            bindImage("Resources/LaundrySymbols/Washing/Wash_60.svg.png", btn_wash_60, "Wash your clothing in water at or below 60 °C");
	            bindImage("Resources/LaundrySymbols/Washing/Handwash.svg.png", btn_hand_wash, "Hand wash your clothing");
	            bindImage("Resources/LaundrySymbols/Washing/No_Wash.svg.png", btn_do_not_wash, "Do not wash your clothing in water");

				//Tumble Dry
				bindImage("Resources/LaundrySymbols/Drying/Tumble/Tumble_Dry.svg.png", btn_tumble_dry, "You can machine dry your clothing");
				bindImage("Resources/LaundrySymbols/Drying/Tumble/Tumble_Dry_Low.svg.png", btn_tumble_dry_low, "Machine dry your clothing at a low temperature");
				bindImage("Resources/LaundrySymbols/Drying/Tumble/Tumble_Dry_High.svg.png", btn_tumble_dry_normal, "Machine dry your clothing at a normal temperature");
				bindImage("Resources/LaundrySymbols/Drying/Tumble/No_Tumble_Dry.svg.png", btn_do_not_tumble_dry, "Do not machine dry your clothing");

				//Natural Dry
				bindImage("Resources/LaundrySymbols/Drying/Natural/Dry.svg.png", btn_dry, "You can dry your clothing");
				bindImage("Resources/LaundrySymbols/Drying/Natural/Line_Dry.svg.png", btn_line_dry, "Line dry your clothing");
				bindImage("Resources/LaundrySymbols/Drying/Natural/Dry_Flat.svg.png", btn_dry_flat, "Dry your clothing on a flat surface");
				bindImage("Resources/LaundrySymbols/Drying/Natural/Drip_Dry.svg.png", btn_drip_dry, "Drip dry your clothing");
				bindImage("Resources/LaundrySymbols/Drying/Natural/Dry_Shade.svg.png", btn_dry_shade, "Dry your clothing in the shade");
				bindImage("Resources/LaundrySymbols/Drying/Natural/Line_Dry_Shade.svg.png", btn_line_dry_shade, "Line dry your clothing in the shade");
				bindImage("Resources/LaundrySymbols/Drying/Natural/Dry_Flat_Shade.svg.png", btn_dry_flat_shade, "Dry your clothing on a flat surface in the shade");
				bindImage("Resources/LaundrySymbols/Drying/Natural/Drip_Dry_Shade.svg.png", btn_drip_dry_shade, "Drip dry your clothing in the shade");

				//Iron
				bindImage("Resources/LaundrySymbols/Ironing/Iron.svg.png", btn_iron, "You can iron your clothing");
				bindImage("Resources/LaundrySymbols/Ironing/Iron_Low.svg.png", btn_iron_low, "You can iron your clothing at the low setting");
				bindImage("Resources/LaundrySymbols/Ironing/Iron_Medium.svg.png", btn_iron_medium, "You can iron your clothing at the medium setting");
				bindImage("Resources/LaundrySymbols/Ironing/Iron_High.svg.png", btn_iron_high, "You can iron your clothing at the high setting");
				bindImage("Resources/LaundrySymbols/Ironing/No_Iron.svg.png", btn_do_not_iron, "Do not iron this clothing");

				//Dry Cleaning
				bindImage("Resources/LaundrySymbols/ProfessionalCleaning/DryCleaning/ProCleaning.svg.png", btn_pro_cleaning, "You can professionally clean your clothing");
				bindImage("Resources/LaundrySymbols/ProfessionalCleaning/DryCleaning/HCS.svg.png", btn_hcs_only, "When dry cleaning, use hydrocarbon solvents (HCS) only");
				bindImage("Resources/LaundrySymbols/ProfessionalCleaning/DryCleaning/HCS_Gentle.svg.png", btn_hcs_gentle, "When dry cleaning, use hydrocarbon solvents (HCS) only. Make sure you are cleaning gently");
				bindImage("Resources/LaundrySymbols/ProfessionalCleaning/DryCleaning/HCS_Very_Gentle.svg.png", btn_hcs_very_gentle, "When dry cleaning, use hydrocarbon solvents (HCS) only. Make sure you are cleaning very gently");
				bindImage("Resources/LaundrySymbols/ProfessionalCleaning/DryCleaning/PCE.svg.png", btn_pce_only,"When dry cleaning, use perchloroethylene(PCE) only");
				bindImage("Resources/LaundrySymbols/ProfessionalCleaning/DryCleaning/PCE_Gentle.svg.png", btn_pce_gentle,"When dry cleaning, use perchloroethylene(PCE) only. Make sure you are cleaning gently");
				bindImage("Resources/LaundrySymbols/ProfessionalCleaning/DryCleaning/PCE_Very_Gentle.svg.png", btn_pce_very_gentle, "When dry cleaning, use perchloroethylene(PCE) only. Make sure you are cleaning very gently");
				bindImage("Resources/LaundrySymbols/ProfessionalCleaning/DryCleaning/No_Chemical_Cleaning.svg.png", btn_no_chemical_clean, "Do not chemical clean this clothing");

				//Wet Cleaning
				bindImage("Resources/LaundrySymbols/ProfessionalCleaning/WetCleaning/Wet_Clean.svg.png", btn_wet_clean, "Wet clean your clothing");
				bindImage("Resources/LaundrySymbols/ProfessionalCleaning/WetCleaning/Wet_Clean_Gentle.svg.png", btn_wet_clean_gentle,"Wet clean your clothing gently");
				bindImage("Resources/LaundrySymbols/ProfessionalCleaning/WetCleaning/Wet_Clean_Very_Gentle.svg.png", btn_wet_clean_very_gentle, "Wet clean your clothing very gently");
				bindImage("Resources/LaundrySymbols/ProfessionalCleaning/WetCleaning/No_Wet_Clean.svg.png", btn_no_wet_clean, "Do not wet clean this clothing");

				//Bleach
				bindImage("Resources/LaundrySymbols/Bleaching/Bleaching.svg.png", btn_bleach, "You can bleach your clothing");
				bindImage("Resources/LaundrySymbols/Bleaching/Bleaching_Cl.svg.png", btn_bleach_cl, "Bleach your clothing with chlorine bleach");
				bindImage("Resources/LaundrySymbols/Bleaching/Bleaching_No_Cl.svg.png", btn_bleach_no_cl, "Bleach your clothing with non-chlorine bleach");
				bindImage("Resources/LaundrySymbols/Bleaching/No_Bleaching.svg.png", btn_do_not_bleach, "Do not bleach this clothing");

	        }catch(Exception e){
	            System.out.println("Oh no");
	        }
	    }

}
