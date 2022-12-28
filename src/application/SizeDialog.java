package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class SizeDialog extends VBox {
    BodyPart[] bodyParts;
    ClothingType clothingType;
    boolean isMale;
    MeasureUnit units;
    ArrayList<BodyField> bodyFields;

    SizeDialog(ClothingType clothingType, boolean isMale, MeasureUnit units, BodyPart[] bodyParts1){
        this.bodyParts = bodyParts1;
        this.clothingType = clothingType;
        this.isMale = isMale;
        this.units = units;
        setTextViews(bodyParts);

        Label resultsLabel = new Label();
        resultsLabel.setVisible(false);
        this.getChildren().add(resultsLabel);

        Button calculateSizeButton = new Button("Get Size");
        calculateSizeButton.setOnAction(calculateEvent -> calculateSize());
        this.getChildren().add(calculateSizeButton);
    }

    private void setTextViews(BodyPart[] bodyParts){
        for(BodyPart bodyPart : bodyParts){
            BodyField bf = new BodyField(bodyPart.toString(), units, bodyPart);
            bodyFields.add(bf);
            this.getChildren().add(bf);
        }
    }

    private void calculateSize(){
        for(BodyField bf : bodyFields){
            Measurement measurement = new Measurement(units, Double.parseDouble(bf.getTextField().getText()));

        }
    }



}
