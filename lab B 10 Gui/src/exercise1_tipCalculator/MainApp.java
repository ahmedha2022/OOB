package exercise1_tipCalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		String viewFileName = "tipCalView.fxml";
		String windowTite = "Main App";
		Parent root = FXMLLoader.load(getClass().getResource(viewFileName));
		stage.setTitle(windowTite);
		stage.setScene(new Scene(root, 280, 200));
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}