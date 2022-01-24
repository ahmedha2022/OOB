package lab12.trip;

import java.net.URL;
import java.time.LocalDate;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TripViewController implements Initializable// to initialize our table
{
// -----------------------------------------------------------------------------------------------------------------
	// what will part do is going to get methods from trip class
	// declaring the properties with their data type
	// adding the return type of columns and from where they are coming
	// come from trip class and the return type is String or localDate
	@FXML
	private TableView<Trip> tripTable;

	@FXML
	private TableColumn<Trip, String> countryCol;

	@FXML
	private TableColumn<Trip, String> TripTypeCol;

	@FXML
	private TableColumn<Trip, LocalDate> fromDateCol;

	@FXML
	private TableColumn<Trip, LocalDate> toDateCol;

	@FXML
	private TableColumn<Trip, String> ratingCol;

// -----------------------------------------------------------------------------------------------------------------

	// The observable list is used to detect any new changes will happen to data,
	// and
	// it's usefuL for tables, and for updated data
	private ObservableList<Trip> tripLists = FXCollections.observableArrayList(TripRepository.getTrips());

// -----------------------------------------------------------------------------------------------------------------

	// automatically called by javafx
	// It runs before the app come alive, it used to link the columns with
	// properties
	// where should we get data from
	// we need to link the columns with properties and where should we put the data
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		tripTable.setItems(tripLists);
		countryCol.setCellValueFactory(new PropertyValueFactory<>("country"));
		TripTypeCol.setCellValueFactory(new PropertyValueFactory<>("type"));
		fromDateCol.setCellValueFactory(new PropertyValueFactory<>("fromDate"));
		toDateCol.setCellValueFactory(new PropertyValueFactory<>("toDate"));
		ratingCol.setCellValueFactory(new PropertyValueFactory<>("Rating"));
	}

// ------------------------------------------------------------------------------------------------------------------

	@FXML
	void handleDelete(ActionEvent event) {
		int index = tripTable.getSelectionModel().getSelectedIndex();
		Alert alert = new Alert(null);

		if (index >= 0) {
			alert.setAlertType(AlertType.CONFIRMATION); // confirmation message
			alert.setContentText("Are you sure you want to deltee the trip to " + tripLists.get(index).getCountry());

			 Optional<ButtonType> choice = alert.showAndWait(); // i will read the user's choice by waiting for his confirmation if it's
												// ok then remove or cancel deleting

			if (choice.get().getText().equals("ok"))
				tripLists.remove(index);
		} else {
			alert.setAlertType(AlertType.ERROR);
			alert.setContentText("you need to select a trip to delete");
			alert.show();
		}

	}

	@FXML
	void handleAdd(ActionEvent event) {

	}

	@FXML
	void handleSave(ActionEvent event) {

	}

	@FXML
	void handleUpdate(ActionEvent event) {

	}

}
