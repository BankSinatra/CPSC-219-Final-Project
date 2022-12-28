package application;

import application.clothingModel.InvalidSizeException;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.HashMap;

public class SizeDialog extends VBox {
    private BodyPart[] bodyParts;
    private ClothingType clothingType;
    private boolean isMale;
    private MeasureUnit units;
    HashMap<BodyField, Measurement> bodyFields = new HashMap<BodyField, Measurement>();
    private Label resultsLabel = new Label();

    SizeDialog(ClothingType clothingType,MeasureUnit units, BodyPart[] bodyParts1){
        this.bodyParts = bodyParts1;
        this.clothingType = clothingType;
        this.units = units;
        setTextViews(bodyParts);

        resultsLabel.setVisible(false);
        this.getChildren().add(resultsLabel);

        Button calculateSizeButton = new Button("Get Size");
        calculateSizeButton.setOnAction(calculateEvent -> calculateSize());
        this.getChildren().add(calculateSizeButton);
    }

    private void setTextViews(BodyPart[] bodyParts){
        for(BodyPart bodyPart : bodyParts){
            BodyField bf = new BodyField(bodyPart.toString(), units, bodyPart);
            bodyFields.put(bf, new Measurement(units));
            this.getChildren().add(bf);
        }
    }

    private void calculateSize(){
        int size = 0;
        boolean problem = false;
        this.resultsLabel.setVisible(false);
        for(BodyField bf : bodyFields.keySet()){
            try {
                bodyFields.get(bf).setValue(Double.parseDouble(bf.getTextField().getText())); //Set the value of the value based on the text of the key
                bf.getBodyPart().setMeasurement(bodyFields.get(bf));
                BodyPart bodyPart = bf.getBodyPart();

                int bodyPartMeasurement = bodyPart.getMeasurement(clothingType);
                if(bodyPartMeasurement > size){
                    size = bodyPartMeasurement;
                }
                bf.getErrorLabel().setVisible(false);
            }catch (InvalidSizeException e) {
                bf.getErrorLabel().setText(e.getMessage());
                bf.getErrorLabel().setVisible(true);
                problem = true;
            }catch (NumberFormatException e){
                bf.getErrorLabel().setText("Please enter a number");
                bf.getErrorLabel().setVisible(true);
                problem = true;
            }

        }
        this.resultsLabel.setText(String.valueOf(size));
        if(!problem){
            this.resultsLabel.setVisible(true);
        }
    }

}
