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

public class Controller1 {

	@FXML private TextField IDtext;
    @FXML private TextField nametext;
    @FXML private TextField nationtext;
    @FXML private TextField drivingtext;
    @FXML private TextField passporttext;
    
    @FXML private DatePicker enddatetext;
    @FXML private DatePicker vasiexirytext;
    
    @FXML private TextField addresstext;
    @FXML private Button OKbutton;
    @FXML private Button cancelbannom;
    @FXML private TextField phonetext;

    @FXML
    void addPlateNo(ActionEvent event) {

    }


    @FXML
    void model(ActionEvent event) {

    }

    @FXML
    void type(ActionEvent event) {

    }
    
    int index;
	ObservableList<Customer> list = FXCollections.observableArrayList(fileprossor.loadCustomer());
	
	/**
	 * This method represents the action the action that will be taken when the user press on "Close" button.
	 * It closes the opened window.
	 * @param event
	 * @throws Exception
	 */
    @FXML
    void handelClose(ActionEvent event)  throws Exception{
    		Parent root = FXMLLoader.load(getClass().getResource("mainwindow.fxml"));
    		Scene scene = new Scene(root);
    		
    		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    		window.setScene(scene);
    		window.show();
    	}

    

    /**
     * This method represents the action the action that will be taken when the user press "OK" after he 
	 * writes the new customer data so it can be added to the CustomersList file.
     * @param event
     * @throws IOException
     */
    @FXML
    void handelOK(ActionEvent event) throws IOException {
    	
    	Integer customerId = Integer.parseInt(IDtext.getText());
		String Name = nametext.getText();
		String phone = phonetext.getText();
		String address = addresstext.getText();
		String nationality = nationtext.getText();
		String drivingLicence = drivingtext.getText();
		int passport = Integer.parseInt(passporttext.getText());
	    LocalDate entryDate= enddatetext.getValue(); 
	    LocalDate visaExpiryDate= vasiexirytext.getValue(); 

		
	    Customer Customer = new Customer( customerId,Name, phone, address,nationality,drivingLicence,
				passport, entryDate, visaExpiryDate);
		list.add(Customer);
		
		Customer[] CustomersList = list.toArray(new Customer[list.size()]);
		fileprossor.saveData(CustomersList);

		Alert message = new Alert(Alert.AlertType.INFORMATION, "Record added successfully");
		message.show();
		
		
		Parent root = FXMLLoader.load(getClass().getResource("mainwindow.fxml"));
		Scene scene = new Scene(root);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();

    }
	

}
