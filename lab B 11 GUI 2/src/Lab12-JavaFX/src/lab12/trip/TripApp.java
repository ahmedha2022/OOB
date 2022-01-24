package lab12.trip;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TripApp extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Pane root = FXMLLoader.load(getClass().getResource("TripsView.fxml"));
        stage.setScene(new Scene(root, 600, 400));
        stage.setTitle("Trips App");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
