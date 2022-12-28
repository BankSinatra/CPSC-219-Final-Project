package application;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class BodyField extends VBox {
    String name = null;
    MeasureUnit unit = MeasureUnit.CM;
    String errorText = "";
    TextField textField = new TextField();
    Label unitLabel = new Label();
    private HBox hBox = new HBox();

    BodyField(String name, MeasureUnit unit, String errorText){
        TextField nameTF = new TextField(name);
        nameTF.setFont(Font.font("System Bold", 18));
        this.getChildren().add(nameTF);
        this.getChildren().add(hBox);
        hBox.getChildren().add(textField);
        hBox.getChildren().add(unitLabel);
    }

}
