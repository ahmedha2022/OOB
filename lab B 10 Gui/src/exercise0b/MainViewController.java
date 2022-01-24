package exercise0b;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainViewController {
@FXML
Label messagelabel;
	public void handle(ActionEvent event) {
messagelabel.setText("welcome to java fx");	}
	
	

}
