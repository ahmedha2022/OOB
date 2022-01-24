package test.rentalPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.Scanner;

import com.google.gson.Gson;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import module.Car;
import module.Invoice;
import module.Payment;
import module.Rental;
import test.add.Customer;
import test.add.fileprossor;

public class rentalsViewController implements Initializable {
	@FXML private TableView<Rental> tableView;
	@FXML private TableColumn<Rental, LocalDate> startDateColumn;
	@FXML private TableColumn<Rental, LocalDate> endDateColumn;
	@FXML private TableColumn<Rental, Double> depositColumn;
	@FXML private TableColumn<Rental, Integer> invoiceNoColumn;
	@FXML private TableColumn<Rental, LocalDate> invoiceDateColumn;
	@FXML private TableColumn<Rental, Double> totalColumn;
	@FXML private ComboBox<String> customerId;
	@FXML private ComboBox<String> carId;
	@FXML private DatePicker startDatePicker;
	@FXML private DatePicker endDatePicker;

	ObservableList<Rental> rentals;
	ObservableList<Customer> customerList = FXCollections.observableArrayList(fileprossor.loadCustomer());
	ObservableList<Car> carlist; 

	/**
	 * This method represents the action that will be taken when we click on "Rent" button.
	 * It adds a new rental to the Rentals file.
	 * @param event
	 */
	@FXML
	public void handleRent(ActionEvent event) {
		Payment payment = new Payment(" Intiale deposite ", 1, 2000, LocalDate.now());
		ArrayList<Payment> paymentlist = new ArrayList<>();
		paymentlist.add(payment);
		Invoice invoice = new Invoice(1, LocalDate.now(), paymentlist);
		Customer customer=null;
		Car car=null;
		for (int i = 0; i < customerList.size(); i++) {
			if (customerList.get(i).getCustomerId() == Integer.valueOf(customerId.getValue())) {
				customer = customerList.get(i);
			}

		}

		for (int i = 0; i < carlist.size(); i++) {
			if (carlist.get(i).getPlateNo().equals(carId.getValue())) {
				car = carlist.get(i);
			}

		}

		Rental rental1 = new Rental(rentals.size() + 1, customer, car, 2000, startDatePicker.getValue(),
				endDatePicker.getValue(), invoice);
		
		rentals.add(rental1);

		String jsonData = new Gson().toJson(rentals);
		try {
			FileWriter fw = new FileWriter(new File("rentals.json"));
			fw.write(jsonData);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method sets the data that should appear in every column.
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		File file = new File("Cars.json");
		String k = "";
		Gson json = new Gson();
		ArrayList<Car> list = new ArrayList<>();

		try {

			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {

				k += scanner.nextLine();

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		Car[] cararray = json.fromJson(k, Car[].class);

		if (cararray != null) {
			list = new ArrayList<>(Arrays.asList(cararray));
		}

		carlist = FXCollections.observableList(list);
		
		File file1 = new File("Rentals.json");
		String k1 = "";
		Gson json1 = new Gson();
		ArrayList<Rental> list1 = new ArrayList<>();

		try {

			Scanner scanner1 = new Scanner(file1);
			while (scanner1.hasNext()) {

				k1 += scanner1.nextLine();

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		Rental[] rentalarray = json1.fromJson(k1, Rental[].class);

		if (rentalarray != null) {
			list1 = new ArrayList<>(Arrays.asList(rentalarray));
		}

		rentals = FXCollections.observableList(list1);

		startDateColumn.setCellValueFactory(new PropertyValueFactory<>("startDate"));
		endDateColumn.setCellValueFactory(new PropertyValueFactory<>("endDate"));
		depositColumn.setCellValueFactory(new PropertyValueFactory<>("deposit"));
		invoiceNoColumn.setCellValueFactory(new PropertyValueFactory<>("rentalNo"));
		invoiceDateColumn.setCellValueFactory(new PropertyValueFactory<>("InvoiceDate"));
		totalColumn.setCellValueFactory(new PropertyValueFactory<>("Total"));
		tableView.setItems(rentals);
		
		
		ArrayList<String> ids = new ArrayList<>();

		for (int i = 0; i < customerList.size(); i++) {
			String k11 = String.valueOf(customerList.get(i).getCustomerId());
			ids.add(k11	);
		}
		customerId.getItems().addAll(ids);
		ArrayList<String> CarsId = new ArrayList<>();

		for (int i = 0; i < carlist.size(); i++) {
			String c = String.valueOf(carlist.get(i).getPlateNo());
			CarsId.add(c);

		}
		System.out.println(CarsId);
		carId.getItems().addAll(CarsId);

	}

}
