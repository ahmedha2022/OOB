package guimethod;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MyController {

    @FXML
    private TextField qarTextField;

    @FXML
    private Label usdLabel;

    /*
	 * Copy the following Todos in your Controller Class
	 * 
	 * //TODO 32 in your handle or (convert) method do the following:
	 * //		a. read the input from the text field
	 * //		b. convert the input to a double
	 * //       c. convert the currency to usd
	 * //       d. put the converted value inside the label  
	 *
	 */
    @FXML
    void convertNow(ActionEvent event) {

    	String input = qarTextField.getText();
    	//Integer.parseInt("232");
    	double qarAmount = Double.parseDouble(input);
    	double usdAmount = qarAmount/3.65;
    	usdLabel.setText("Currency in USD: $" +String.format("%.2f", usdAmount)); //alternatively (and "more appropriately") convert the double back to a string using String.valueOf(usdAmount)
    	
    }

}
