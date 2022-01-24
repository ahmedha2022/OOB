package test.car;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Scanner;

import com.google.gson.Gson;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import module.Car;
import test.car.addCarWindowController.Interaction;

public class carsViewController implements Initializable, Interaction {
	
	@FXML private Button addbuttoncar;
	@FXML private Button UpdateButooncar;
	@FXML private Button DeleteButtonCar;
	@FXML private Button SaveButtonCar;
	@FXML private TableView<Car> TableView;
	@FXML private TableColumn<Car, String> plateNoColumn;
	@FXML private TableColumn<Car, String> modelColumn;
	@FXML private TableColumn<Car, String> typeColumn;
	@FXML private TableColumn<Car, String> availabilityColumn;
	
	public static boolean update;

	ObservableList<Car> carList;

	/**
	 * This method displays the add car window and sets the interaction so the user can add the new 
	 * car information.
	 * @param event
	 */
	@FXML
	public void AddCar(ActionEvent event) {

		try {
			update = false;
			FXMLLoader loader = new FXMLLoader(getClass().getResource("addCarWindow.fxml"));
			Parent root = loader.load();
			addCarWindowController cont = loader.getController();
			cont.setInteraction(this, -2);
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
			stage.setTitle("Customers");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method displays the update car window and sets the interaction so the user can update any 
	 * car information.
	 * @param event
	 */
	@FXML
	public void UpdateCar(ActionEvent event) {
		Alert alert = new Alert(null);
		FXMLLoader loader = new FXMLLoader(getClass().getResource("addCarWindow.fxml"));
		int index = TableView.getSelectionModel().getSelectedIndex();
		try {
			if (index >= 0) {
				update = true;
				Parent root = loader.load();
				addCarWindowController cont = loader.getController();
				cont.setInteraction(this, index);
				Stage stage = new Stage();
				stage.setScene(new Scene(root));
				stage.show();
				stage.setTitle("Customers");
			} else {
				alert.setAlertType(AlertType.INFORMATION);
				alert.setContentText("Please select a car !");
				alert.show();

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method checks if the car is selected then it asks for confirmation to delete it. 
	 * @param event
	 */
	@FXML
	public void DeleteCar(ActionEvent event) {
		Alert alert = new Alert(null);
		int index = TableView.getSelectionModel().getSelectedIndex();
		if (index >= 0) {
			alert.setAlertType(AlertType.CONFIRMATION);
			alert.setContentText("Sure you want to delete?");
			Optional<ButtonType> confirmation = alert.showAndWait();
			if (confirmation.get().getText().equalsIgnoreCase("ok")) {
				carList.remove(index);
			}
		} else {
			alert.setAlertType(AlertType.INFORMATION);
			alert.setContentText("Please Select a Car to Delete");
			alert.show();
		}

	}

	/**
	 * This method saves the created car to the Cars file.
	 * @param event
	 */
	@FXML
	public void SaveCars(ActionEvent event) {
		String jsonData = new Gson().toJson(carList);
		try {
			FileWriter fw = new FileWriter(new File("Cars.json"));
			fw.write(jsonData);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method reads data from Cars file and adds it to the observable list and then displays 
	 * the data in the table view.
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		File file = new File("Cars.json");
		String k = "";
		Gson json = new Gson();
		ArrayList<Car> list = new ArrayList<>();

		try {

			Scanner s = new Scanner(file);
			while (s.hasNext()) {

				k += s.nextLine();

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		Car[] cararray = json.fromJson(k, Car[].class);

		if (cararray != null) {
			list = new ArrayList<>(Arrays.asList(cararray));
		}

		carList = FXCollections.observableList(list);

		TableView.setItems(carList);
		modelColumn.setCellValueFactory(new PropertyValueFactory<>("model"));
		plateNoColumn.setCellValueFactory(new PropertyValueFactory<>("plateNo"));
		typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
		availabilityColumn.setCellValueFactory(new PropertyValueFactory<>("isAvilabile"));

	}

	/**
	 * This method adds the new car to the Cars file after the user writes the information of
	 * this car.
	 */
	@Override
	public void addCar(Car car) {
		Alert alert = new Alert(null);
		boolean flag = false;
		for (Car c : carList) {
			if (car.getPlateNo().equals(c.getPlateNo())) {
				flag = true;
			}

		}

		if (flag == false) {
			carList.add(car);
		}

		else {
			alert.setAlertType(AlertType.INFORMATION);
			alert.setContentText("Car with same plate number exists !");
			alert.show();
			return;
		}

	}

	/**
	 * This method updates the selected car information.
	 */
	@Override
	public void updateCar(Car car, int index) {
		System.out.println("method initiated");
		carList.set(index, car);

	}

}
