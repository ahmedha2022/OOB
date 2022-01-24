package exercise1_tipCalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TipCalculatorController {
	@FXML
	private Label tipLabel;

	@FXML
	private ComboBox<String> serviceQualityComboBox;

	@FXML
	private TextField amountTextField;

	@FXML
	private Label totalLabel;

	@FXML
	void handleComputeTip(ActionEvent event) {
		double billAmount = Double.parseDouble(amountTextField.getText());
		String serviceQuality = serviceQualityComboBox.getSelectionModel().getSelectedItem();
		double tip = billAmount * ServiceQuality.getTip(serviceQuality);
		tipLabel.setText(String.format("%7.2f", tip));
		totalLabel.setText(String.format("%7.2f", billAmount + tip));
	}

	@FXML
	public void initialize() {
		tipLabel.setText("");
		totalLabel.setText("");
		serviceQualityComboBox.getItems().addAll("Excellent", "Good", "Poor");
		serviceQualityComboBox.getSelectionModel().select("Good");
	}

}
