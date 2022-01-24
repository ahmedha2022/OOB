package test.car;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import module.Car;
import module.CarType;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;

import javafx.scene.control.ComboBox;

import javafx.scene.control.RadioButton;

public class addCarWindowController implements Initializable {

	@FXML private Label mainLabel;
	@FXML private TextField PlateNoField;
	@FXML private TextField ModelField;
	@FXML private RadioButton YesRadioButton;
	@FXML private ToggleGroup radiogroupe;
	@FXML private Button AddBtton;
	@FXML private Button CancelButton;
	@FXML private RadioButton NoRadioButton;
	
	
	@FXML
	private ComboBox<String> TypeCB;

	private Interaction interaction;
	private int index;


	/**
	 * Allows the carsViewController and the addCarWindowController to interact.
	 * @param interaction
	 * @param index
	 */
	public void setInteraction(Interaction interaction, int index) {
		this.interaction = interaction;
		this.index = index;
	}

	/**
	 * This method adds or updates the car depending on the value of the boolean update variable.
	 * It takes the data from the fields.
	 * @param event
	 */
	// Event Listener on Button[#AddBtton].onAction
	@FXML
	public void AddCarFinal(ActionEvent event) {

		Alert alert = new Alert(null);
		String plateno = "";
		String model = "";
		Boolean Available = false;

		if (!(PlateNoField.getText().equals("") || ModelField.getText().equals(""))) {
			plateno = PlateNoField.getText();
			model = ModelField.getText();

		} else {

			alert.setAlertType(AlertType.INFORMATION);
			alert.setContentText("Check your data !");
			alert.show();
			return;
		}
		if (YesRadioButton.isSelected()) {
			Available = true;
		} else if (NoRadioButton.isSelected()) {
			Available = false;
		} else {
			alert.setAlertType(AlertType.INFORMATION);
			alert.setContentText("select either Available or Not Available !");
			alert.show();
			return;
		}
		Car car = new Car(plateno, model, CarType.valueOf(TypeCB.getValue()), Available);

		if (carsViewController.update == false) {
			interaction.addCar(car);
			Stage stage = (Stage) mainLabel.getScene().getWindow();
			stage.close();

		}
		if (carsViewController.update == true) {

			interaction.updateCar(car, index);
			Stage stage = (Stage) mainLabel.getScene().getWindow();
			stage.close();
		}

	}
	
	// Event Listener on Button[#CancelButton].onAction
	/**
	 * This method closes the add window
	 * @param event
	 */
	
	@FXML
	public void CancelAddingCar(ActionEvent event) {
		Stage stage = (Stage) mainLabel.getScene().getWindow();
		stage.close();
	}

	public interface Interaction {
		public void addCar(Car car);

		public void updateCar(Car car, int index);
	}
	
	/**
	 * This method changes the window depending on if the user is updating or adding a car.
	 * It also sets the item to CarType combo box.
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		TypeCB.getItems().addAll("SEDAN", "SUV", "VAN", "TRUCK");
		TypeCB.getSelectionModel().select("SEDAN");
		if (carsViewController.update) {
			mainLabel.setText("Update Car");
			AddBtton.setText("update");

		}
	}
}