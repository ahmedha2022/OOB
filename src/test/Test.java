package test;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

/**
 * 
 * @author Ahmed Alhato, Mohamed Yeslem, Amir Adalbi
 *
 */

public class Test extends Application {
	@Override
	public void start(Stage primaryStage) {

		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("FCarAppView.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Car Rental System");
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}
