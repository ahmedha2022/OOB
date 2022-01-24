package test.add;

import java.io.IOException;
import java.time.LocalDate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class controll3 {

	@FXML private TextField upadateID;
	@FXML private TextField upadateName;
	@FXML private TextField upadateNational;
	@FXML private TextField upadateDriving;
	@FXML private TextField upadatePassport;
	@FXML private DatePicker upadateEntrydate;
	@FXML private DatePicker upadateExpiry;
	@FXML private TextField upadateAdress;
	@FXML private Button OKbutton;
	@FXML private Button CancelButtom;
	@FXML private TextField upadatePhone;

	@FXML
	void model(ActionEvent event) {

	}

	@FXML
	void type(ActionEvent event) {

	}

	@FXML
	void addPlateNo(ActionEvent event) {

	}

//-----------------------------------------------------------------------------------------------------------------------
	int index;
	private Customer selectedCostumer;
	ObservableList<Customer> list = FXCollections.observableArrayList(fileprossor.loadCustomer());
//-----------------------------------------------------------------------------------------------------------------------

	//MAKE AN ACTION FOR OK button
	/**
	 * This method represents the action the action that will be taken when the user press "OK" after he 
	 * update customers' data so it can be rewritten to CustomersList file.
	 * @param event
	 * @throws IOException
	 */
	@FXML
    void handle1(ActionEvent event)  throws IOException {
    	
    	Integer id = Integer.parseInt(upadateID.getText());
		String Name = upadateName.getText();
		String phone = upadatePhone.getText();
		String address = upadateAdress.getText();
		String nationality = upadateNational.getText();
		String drivingLicence = upadateDriving.getText();
		int passport = Integer.parseInt(upadatePassport.getText());
	    LocalDate entryDate= upadateEntrydate.getValue(); 
	    LocalDate visaExpiryDate= upadateExpiry.getValue(); 

		
	    Customer Customer = new Customer(id,Name,  phone, address,nationality,drivingLicence,
				passport, entryDate, visaExpiryDate);
	    
	    list.set(controll2.getIndex(), Customer);
		System.out.println("updateCustomer.");
		
		Customer[] CustomerList = list.toArray(new Customer[list.size()]);
		fileprossor.saveData(CustomerList);

		Alert message = new Alert(Alert.AlertType.INFORMATION, "Record updated successfully");
		message.show();
		
		
		Parent root = FXMLLoader.load(getClass().getResource("mainwindow.fxml"));
		Scene scene = new Scene(root);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
		
	    
    }
//-----------------------------------------------------------------------------------------------------------------------
	
	// Make an action for cancel
	/**
	 * This method represents the action the action that will be taken when the user press "Cancel" after he 
	 * update customers' data so it can be rewritten to CustomersList file.
	 * @param event
	 * @throws IOException
	 */
	@FXML
	void handle2(ActionEvent event) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("mainwindow.fxml"));
		Scene scene = new Scene(root);

		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}

	
	public void initData(Customer Customer) {
		selectedCostumer = Customer;
		upadateID.setText(Integer.toString(selectedCostumer.getCustomerId()));
		upadateName.setText((selectedCostumer.getName()));
		upadateAdress.setText((selectedCostumer.getAddress()));
		upadateDriving.setText((selectedCostumer.getDrivingLicence()));
		upadateNational.setText((selectedCostumer.getNationality()));
		upadatePhone.setText((selectedCostumer.getPhone()));
		upadateEntrydate.setPromptText((selectedCostumer.getEntryDate().toString()));
		upadatePassport.setText(Integer.toString(selectedCostumer.getPassportNo()));
		upadateExpiry.setPromptText((selectedCostumer.getVisaExpiryDate().toString()));

	}

}
