package application;

import application.clothingModel.HeadCircumference;
import application.clothingModel.InvalidSizeException;

public class HeadSizeDialog extends SizeDialog{
    HeadSizeDialog(ClothingType clothingType, MeasureUnit units, BodyPart[] bodyParts1) {
        super(clothingType, units, bodyParts1);
    }

    @Override
    void calculateSize() {
        String size = "";
        boolean problem = false;
        this.getResultsLabel().setVisible(false);
        for(BodyField bf : getBodyFields().keySet()){
            try {
                getBodyFields().get(bf).setValue(Double.parseDouble(bf.getTextField().getText()));
                bf.getBodyPart().setMeasurement(getBodyFields().get(bf));
                HeadCircumference bodyPart = (HeadCircumference) bf.getBodyPart();

                size = bodyPart.getHatSize(getBodyFields().get(bf));

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
            this.getResultsLabel().setText(String.valueOf(size));
            if(!problem){
                this.getResultsLabel().setVisible(true);
            }
        }
    }


}
