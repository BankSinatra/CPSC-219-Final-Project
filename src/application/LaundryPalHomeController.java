package application;

import java.io.FileInputStream;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class LaundryPalHomeController {
	
	Stage applicationStage;

    @FXML
    private Button btn_wash_30;

    @FXML
    private Button btn_wash_50;

    @FXML
    private Button btn_hcs_gentle;

    @FXML
    private Button btn_tumble_dry_low;

    @FXML
    private Button btn_dry;

    @FXML
    private Button btn_drip_dryshade;

    @FXML
    private Button btn_wash;

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
    private Button btn_hand_wash;

    @FXML
    private Button btn_no_wet_clean;

    @FXML
    private Button btn_do_not_wash;

    @FXML
    private Button btn_do_not_bleach;

    @FXML
    private Button btn_wash_40;

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
    private Button btn_bleach_ch;

    @FXML
    private Button btn_wash_60;

    @FXML
    private Button btn_do_not_tumble_dry;

    @FXML
    private Button btn_iron;

    @FXML
    private Button btn_line_dry_shade;

    @FXML
    private Button btn_tumble_dry;

    @FXML
    private Button btn_iron_high;

    @FXML
    private Button btn_drip_dry;

    @FXML
    private Button btn_hcs_only;

    @FXML
    private Button btn_pce_gentle;

    @FXML
    private Button btn_tumble_dry_normal;

    @FXML
    private Button btn_do_not_iron;

    @FXML
    private Button btn_iron_low;

    @FXML
    private Button btn_bleach_no_ch;

    @FXML
    private Button btn_iron_medium;
    
    public void initialize() {
        try{
        	
            Image image1 = new Image(new FileInputStream("Resources/LaundrySymbols/Washing/Wash.svg.png"));
            ImageView imageView = new ImageView(image1);
            btn_wash.setGraphic(imageView);
            btn_wash.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        }catch(Exception e){
            System.out.println("Oh no");
        }
    }

}
