package test.add;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class controll2 implements Initializable {

	@FXML private Button addbuttom;
	@FXML private Button update;
	@FXML private Button delet;
	@FXML private Button save;

	@FXML private TableView<Customer> Colum;
	@FXML private TableColumn<Customer, Integer> IDColum;
	@FXML private TableColumn<Customer, String> nameColum;
	@FXML private TableColumn<Customer, String> phoneColum;
	@FXML private TableColumn<Customer, String> AddressColum;
	@FXML private TableColumn<Customer, String> NATIColum;
	@FXML private TableColumn<Customer, String> passportColum;
	@FXML private TableColumn<Customer, String> DrivingColum;
	@FXML private TableColumn<Customer, String> beginColum;
	@FXML private TableColumn<Customer, String> ExpiryColum;

	/**
	 * This method works when the user select a customer from the list of customer if he 
	 * want to delete that customer or update his information.
	 * @param event
	 */
	@FXML
	void handleSelect(MouseEvent event) {	
	index = Colum.getSelectionModel().getSelectedIndex();

	}


	static int index;
    
	public static int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	
//-----------------------------------------------------------------------------------------------------------------------

	ObservableList<Customer> list = FXCollections.observableArrayList(fileprossor.loadCustomer()); // to update
																									// customer's data

//-----------------------------------------------------------------------------------------------------------------------
	/**
	 * This method represents the action that will be taken when the user clicks on "Delete"
	 * button.
	 * It deletes a specific customer that was selected from the user. 
	 * @param event
	 */
	@FXML
    void handeldelet(ActionEvent event) {
    	
    	int index = Colum.getSelectionModel().getSelectedIndex();
		Alert alert = new Alert(null);

		if (index >= 0) {
			alert.setAlertType(AlertType.CONFIRMATION); // confirmation message
			alert.setContentText("Are you sure you want to deltee the trip to " + list.get(index));

			 Optional<ButtonType> choice = alert.showAndWait(); // i will read the user's choice by waiting for his confirmation if it's
												// ok then remove or cancel deleting

			if (choice.get().getText().equalsIgnoreCase("ok"))
				list.remove(index);
			Customer[] CustomersList = list.toArray(new Customer[list.size()]);
			fileprossor.saveData(CustomersList);
		} else {
			alert.setAlertType(AlertType.ERROR);
			alert.setContentText("you need to select a trip to delete");
			alert.show();
		}
    }

	/**
	 * This method represents the action that will be taken when we click on "Save" button.
	 * It saves the data of the customer when it is updated or deleted or when we add a new 
	 * one.
	 * @param event
	 */
    @FXML
    void handelsave(ActionEvent event) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("test\\FCarAppView.fxml"));
		Scene scene = new Scene(root);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();

    }

//-----------------------------------------------------------------------------------------------------------------------

	// make an action for add customer button

	/**
	 * This method represents the action that will be taken when the user clicks on "Add" button.
	 * Once it is clicked, it shows the user a window asks for the new customer information.
	 * @param event
	 * @throws Exception
	 */
	@FXML
	void handel(ActionEvent event) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("addCustomer.fxml"));
		Scene scene = new Scene(root);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}

//-----------------------------------------------------------------------------------------------------------------------
	// make an action for update customer button
	/**
	 * This method represents the action that will be taken when the user clicks on "Update" button.
	 * Once it is clicked, it shows the user a window with the selected customer information so he can update 
	 * it.
	 * @param event
	 * @throws IOException
	 */
	@FXML
	void handeupdate(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("UpdateC.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);

		controll3 controll = loader.getController();
		controll.initData(Colum.getSelectionModel().getSelectedItem());

		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}

//-----------------------------------------------------------------------------------------------------------------------

	// taking from dr's class
	/**
	 * This method sets the data that should appear in every column. 
	 */
	public void initialize(URL arg0, ResourceBundle arg1) {

		IDColum.setCellValueFactory(new PropertyValueFactory<Customer, Integer>("customerId"));
		nameColum.setCellValueFactory(new PropertyValueFactory<Customer, String>("name"));
		phoneColum.setCellValueFactory(new PropertyValueFactory<Customer, String>("phone"));
		AddressColum.setCellValueFactory(new PropertyValueFactory<Customer, String>("address"));
		NATIColum.setCellValueFactory(new PropertyValueFactory<Customer, String>("nationality"));
		passportColum.setCellValueFactory(new PropertyValueFactory<Customer, String>("PassportNo"));
		DrivingColum.setCellValueFactory(new PropertyValueFactory<Customer, String>("drivingLicence"));
		beginColum.setCellValueFactory(new PropertyValueFactory<Customer, String>("entryDate"));
		ExpiryColum.setCellValueFactory(new PropertyValueFactory<Customer, String>("visaExpiryDate"));

		Colum.setItems(list); // collect items and show it

	}

}
