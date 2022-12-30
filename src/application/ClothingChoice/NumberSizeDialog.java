package application.ClothingChoice;

import application.ClothingChoice.ClothingChoiceModel.BodyPart;
import application.ClothingType;
import application.MeasureUnit;
import application.ClothingChoice.ClothingChoiceModel.InvalidSizeException;

public class NumberSizeDialog extends SizeDialog {
    NumberSizeDialog(ClothingType clothingType, MeasureUnit units, BodyPart[] bodyParts1) {
        super(clothingType, units, bodyParts1);
    }

    @Override
    void calculateSize() {
        double size = 0;
        boolean problem = false;
        this.getResultsLabel().setVisible(false);
        for(BodyField bf : getBodyFields().keySet()){
            try {
                getBodyFields().get(bf).setValue(Double.parseDouble(bf.getTextField().getText())); //Set the value of the value based on the text of the key
                bf.getBodyPart().setMeasurement(getBodyFields().get(bf));
                BodyPart bodyPart = bf.getBodyPart();

                String bodyPartMeasurement = bodyPart.getMeasurement(getClothingType());
                if(Double.parseDouble(bodyPartMeasurement) > size){
                    size = Double.parseDouble(bodyPartMeasurement);
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
        this.getResultsLabel().setText(String.valueOf(size));
        if(!problem){
            this.getResultsLabel().setVisible(true);
        }
    }


}
