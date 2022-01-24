package test;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;

public class FCarAppViewController {
	
	@FXML private Button carButton;
	@FXML private Button customersButton;
	@FXML private Button rentalsButton;

	// Event Listener on Button[#carButton].onAction
	/**
	 * This method displays Car window
	 * @param event
	 */
	@FXML
	public void carWindow(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/test/car/carsView.fxml"));
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
			stage.setTitle("Cars");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * This method displays customer window 
	 * @param event
	 */
	// Event Listener on Button[#customersButton].onAction
	@FXML
	public void customersWindow(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/test/add/mainwindow.fxml"));
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
			stage.setTitle("Customers");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * This method displays Rental window
	 * @param event
	 */
	// Event Listener on Button[#rentalsButton].onAction
	@FXML
	public void rentalsWindow(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/test/add/mainwindow.fxml"));
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
			stage.setTitle("Rentals");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
