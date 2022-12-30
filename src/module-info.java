module FinalProject {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
    opens application.LaundryPal to javafx.fxml, javafx.graphics;
	opens application.ClothingChoice to javafx.fxml, javafx.graphics;
	opens application.ClothingChoice.ClothingChoiceModel to javafx.fxml, javafx.graphics;
	opens application.OutfitCreator to javafx.fxml, javafx.graphics;
}