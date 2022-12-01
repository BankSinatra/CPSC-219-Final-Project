package application;

import java.io.FileInputStream;
import java.io.IOException;

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

	private Stage stage;
	private Scene scene;

		public void switchToHomeScene (ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("HomeScreenView.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		}
    
	    private void bindImage(FileInputStream file, Button btn){
	        Image img = new Image(file);
	        ImageView imageView = new ImageView(img);
	        imageView.setPreserveRatio(true);
	        imageView.setFitWidth(50);
	        imageView.setFitHeight(50);
	        btn.setGraphic(imageView);
	        btn.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
	    }

		private void iconPress(){

		}
	    
	    public void initialize() {
	        try{
				//Washing
	            bindImage(new FileInputStream("Resources/LaundrySymbols/Washing/Wash.svg.png"), btn_wash);
	            bindImage(new FileInputStream("Resources/LaundrySymbols/Washing/Wash_30.svg.png"), btn_wash_30);
	            bindImage(new FileInputStream("Resources/LaundrySymbols/Washing/Wash_40.svg.png"), btn_wash_40);
	            bindImage(new FileInputStream("Resources/LaundrySymbols/Washing/Wash_50.svg.png"), btn_wash_50);
	            bindImage(new FileInputStream("Resources/LaundrySymbols/Washing/Wash_60.svg.png"), btn_wash_60);
	            bindImage(new FileInputStream("Resources/LaundrySymbols/Washing/Handwash.svg.png"), btn_hand_wash);
	            bindImage(new FileInputStream("Resources/LaundrySymbols/Washing/No_Wash.svg.png"), btn_do_not_wash);

				//Tumble Dry
				bindImage(new FileInputStream("Resources/LaundrySymbols/Drying/Tumble/Tumble_Dry.svg.png"), btn_tumble_dry);
				bindImage(new FileInputStream("Resources/LaundrySymbols/Drying/Tumble/Tumble_Dry_Low.svg.png"), btn_tumble_dry_low);
				bindImage(new FileInputStream("Resources/LaundrySymbols/Drying/Tumble/Tumble_Dry_High.svg.png"), btn_tumble_dry_normal);
				bindImage(new FileInputStream("Resources/LaundrySymbols/Drying/Tumble/No_Tumble_Dry.svg.png"), btn_do_not_tumble_dry);

				//Natural Dry
				bindImage(new FileInputStream("Resources/LaundrySymbols/Drying/Natural/Dry.svg.png"), btn_dry);
				bindImage(new FileInputStream("Resources/LaundrySymbols/Drying/Natural/Line_Dry.svg.png"), btn_line_dry);
				bindImage(new FileInputStream("Resources/LaundrySymbols/Drying/Natural/Dry_Flat.svg.png"), btn_dry_flat);
				bindImage(new FileInputStream("Resources/LaundrySymbols/Drying/Natural/Drip_Dry.svg.png"), btn_drip_dry);
				bindImage(new FileInputStream("Resources/LaundrySymbols/Drying/Natural/Dry_Shade.svg.png"), btn_dry_shade);
				bindImage(new FileInputStream("Resources/LaundrySymbols/Drying/Natural/Line_Dry_Shade.svg.png"), btn_line_dry_shade);
				bindImage(new FileInputStream("Resources/LaundrySymbols/Drying/Natural/Dry_Flat_Shade.svg.png"), btn_dry_flat_shade);
				bindImage(new FileInputStream("Resources/LaundrySymbols/Drying/Natural/Drip_Dry_Shade.svg.png"), btn_drip_dry_shade);

				//Iron
				bindImage(new FileInputStream("Resources/LaundrySymbols/Ironing/Iron.svg.png"), btn_iron);
				bindImage(new FileInputStream("Resources/LaundrySymbols/Ironing/Iron_Low.svg.png"), btn_iron_low);
				bindImage(new FileInputStream("Resources/LaundrySymbols/Ironing/Iron_Medium.svg.png"), btn_iron_medium);
				bindImage(new FileInputStream("Resources/LaundrySymbols/Ironing/Iron_High.svg.png"), btn_iron_high);
				bindImage(new FileInputStream("Resources/LaundrySymbols/Ironing/No_Iron.svg.png"), btn_do_not_iron);

				//Dry Cleaning
				bindImage(new FileInputStream("Resources/LaundrySymbols/ProfessionalCleaning/DryCleaning/ProCleaning.svg.png"), btn_pro_cleaning);
				bindImage(new FileInputStream("Resources/LaundrySymbols/ProfessionalCleaning/DryCleaning/HCS.svg.png"), btn_hcs_only);
				bindImage(new FileInputStream("Resources/LaundrySymbols/ProfessionalCleaning/DryCleaning/HCS_Gentle.svg.png"), btn_hcs_gentle);
				bindImage(new FileInputStream("Resources/LaundrySymbols/ProfessionalCleaning/DryCleaning/HCS_Very_Gentle.svg.png"), btn_hcs_very_gentle);
				bindImage(new FileInputStream("Resources/LaundrySymbols/ProfessionalCleaning/DryCleaning/PCE.svg.png"), btn_pce_only);
				bindImage(new FileInputStream("Resources/LaundrySymbols/ProfessionalCleaning/DryCleaning/PCE_Gentle.svg.png"), btn_pce_gentle);
				bindImage(new FileInputStream("Resources/LaundrySymbols/ProfessionalCleaning/DryCleaning/PCE_Very_Gentle.svg.png"), btn_pce_very_gentle);
				bindImage(new FileInputStream("Resources/LaundrySymbols/ProfessionalCleaning/DryCleaning/No_Chemical_Cleaning.svg.png"), btn_no_chemical_clean);

				//Wet Cleaning
				bindImage(new FileInputStream("Resources/LaundrySymbols/ProfessionalCleaning/WetCleaning/Wet_Clean.svg.png"), btn_wet_clean);
				bindImage(new FileInputStream("Resources/LaundrySymbols/ProfessionalCleaning/WetCleaning/Wet_Clean_Gentle.svg.png"), btn_wet_clean_gentle);
				bindImage(new FileInputStream("Resources/LaundrySymbols/ProfessionalCleaning/WetCleaning/Wet_Clean_Very_Gentle.svg.png"), btn_wet_clean_very_gentle);
				bindImage(new FileInputStream("Resources/LaundrySymbols/ProfessionalCleaning/WetCleaning/No_Wet_Clean.svg.png"), btn_no_wet_clean);

				//Bleach
				bindImage(new FileInputStream("Resources/LaundrySymbols/Bleaching/Bleaching.svg.png"), btn_bleach);
				bindImage(new FileInputStream("Resources/LaundrySymbols/Bleaching/Bleaching_Cl.svg.png"), btn_bleach_cl);
				bindImage(new FileInputStream("Resources/LaundrySymbols/Bleaching/Bleaching_No_Cl.svg.png"), btn_bleach_no_cl);
				bindImage(new FileInputStream("Resources/LaundrySymbols/Bleaching/No_Bleaching.svg.png"), btn_do_not_bleach);
	            
	        }catch(Exception e){
	            System.out.println("Oh no");
	        }
	    }

}
