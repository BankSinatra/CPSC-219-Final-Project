package application.ClothingChoice;

import application.*;
import application.ClothingChoice.ClothingChoiceModel.BodyPart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.HashMap;

public abstract class SizeDialog extends VBox {
    private BodyPart[] bodyParts;
    private ClothingType clothingType;
    private MeasureUnit units;
    private final HashMap<BodyField, Measurement> bodyFields = new HashMap<BodyField, Measurement>();
    private Label resultsLabel = new Label();

    SizeDialog(ClothingType clothingType,MeasureUnit units, BodyPart[] bodyParts1){
        this.bodyParts = bodyParts1;
        this.clothingType = clothingType;
        this.units = units;
        setTextViews(bodyParts);

        getResultsLabel().setVisible(false);
        this.getChildren().add(getResultsLabel());

        Button calculateSizeButton = new Button("Get Size");
        calculateSizeButton.setOnAction(calculateEvent -> calculateSize());
        this.getChildren().add(calculateSizeButton);
    }

    public Label getResultsLabel() {
        return resultsLabel;
    }

    public ClothingType getClothingType() {
        return clothingType;
    }

    private void setTextViews(BodyPart[] bodyParts){
        for(BodyPart bodyPart : bodyParts){
            BodyField bf = new BodyField(bodyPart.toString(), units, bodyPart);
            getBodyFields().put(bf, new Measurement(units));
            this.getChildren().add(bf);
        }
    }

    abstract void calculateSize();

    public HashMap<BodyField, Measurement> getBodyFields() {
        return bodyFields;
    }
}
