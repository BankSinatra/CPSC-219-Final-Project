package application;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class outfitcontroller {

	   @FXML
	    private TextField weatherTextfield;

	    @FXML
	    void switchToHomeScene(ActionEvent event) {

	    }
	    
	    @FXML
	    void getOutfit(ActionEvent event) {
	    	double temp = 0.0;
	    	String text= weatherTextfield.getText();
	    	temp = Double.parseDouble(text);
	    
	   	 if(temp >= 10 && temp <= 20) {
			 System.out.println("We reccomend wearing a hat in this weather");
			 
		 }
		 if(temp > 15) {
			 System.out.println("We reccomend wearing a tshirt in this weather");
			 
		 }
		 if(temp >= 15) {
			 System.out.println("We reccomend wearing shorts in this weather");
			 
		 }
		 if(temp >=0 && temp < 10) {
			 System.out.println("We reccomend wearing a jacket in this weather");
			 
		 }
		 if(temp >= 0 && temp < 10) {
			 System.out.println("We reccomend wearing a sweater in this weather");
			 
		 }
		 if(temp < 15) {
			 System.out.println("We reccomend wearing jeans in this weather");
			 
		 }
		 if(temp <= 0) {
			 System.out.println("We reccomend wearing a coat in this weather");
	    	

	    }
		 
		 Outfit hat = new Outfit("hat",10,20);
		 Outfit tshirt = new Outfit(,15,50);
		 Outfit shorts = new Outfit(15,50);
		 Outfit jacket = new Outfit(0,10);
		 Outfit sweater = new Outfit(0,10);
		 Outfit jeans = new Outfit(-50,15);
		 Outfit coat = new Outfit(-50,0);
		 
		 
		 
			ArrayList<Outfit> fits = new ArrayList<Outfit>();
			fits.add(hat);
			fits.add(tshirt);
			fits.add(shorts);
			fits.add(jacket);
			fits.add(sweater);
			fits.add(jeans);
			fits.add(coat);
			
			
			
			Arraylist<Outfit> recs = new ArrayList<Outfit>();
			
			for (Outfit o:fits) {
				if(o.tempcheck(TextField.getText) = true) {
					recs.add(o);
				}
		       
}

