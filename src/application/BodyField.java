package application;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import java.util.Locale;

public class BodyField extends VBox{
    MeasureUnit unit;
    Label errorLabel = new Label();
    TextField textField = new TextField();
    Label unitLabel = new Label();
    private HBox hBox = new HBox();
    private BodyPart bodyPart;

    BodyField(String name, MeasureUnit unit, BodyPart bodyPart){
        this.unit = unit;
        this.bodyPart = bodyPart;

        Label nameLabel = new Label(name);
        nameLabel.setFont(Font.font("System Bold", 18));
        this.getChildren().add(nameLabel);
        this.getChildren().add(hBox);
        hBox.getChildren().add(textField);

        unitLabel.setText(unit.toString().toLowerCase(Locale.ROOT));
        hBox.getChildren().add(unitLabel);

        errorLabel.setStyle("-fx-text-fill: red;");
        errorLabel.setVisible(false);
        this.getChildren().add(errorLabel);
    }

    public BodyPart getBodyPart(){
        return bodyPart;
    }

    public Label getErrorLabel() {
        return errorLabel;
    }

    public TextField getTextField(){
        return textField;
    }
}
