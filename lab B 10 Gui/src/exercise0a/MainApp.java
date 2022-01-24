package exercise0a;

import java.time.LocalDateTime;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

	/*
	 * the process to make app is :- 1- create the items 2- put them inside the pane
	 * 3- the pane inside the scene 4- put the scene inside stage
	 * 
	 */

	// create stage , it'll create auto by op
	@Override
	public void start(Stage stage) throws Exception {

		// create a layout to put ui compnents
		BorderPane rootPane = new BorderPane(); // rootpane to tell the main pane

		// create a button and naming it
		Button greetBtn = new Button("Greet"); // ---> greetbtn the name of button

		// create a label
		Label messageLabel = new Label("same label text");

		// adding the button and label and we choose where should put them because the
		// borderpane has 5 pos
		rootPane.setCenter(messageLabel); // put the label inside center
		rootPane.setBottom(greetBtn); // put the btn in btm

		// change the positons
		rootPane.setAlignment(messageLabel, Pos.CENTER);
		rootPane.setAlignment(greetBtn, Pos.BOTTOM_CENTER);

		// this step to make put an action on the button
		greetBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				messageLabel.setText("welcome to java fx the time is " + LocalDateTime.now());
			}
		});
		
		
		// after creating the pane we should put them inside the scene and pass the pane
		// iside of it, and we need to put width and height to change the size of scene
		// Scence
		Scene scene = new Scene(rootPane, 600, 600); // the pain injected in scene

		// then pass the scene iside the satge
		// stage
		stage.setScene(scene);
		stage.show();

	}

	public static void main(String[] args) {
		launch(args); // static method called launch come from the superclass
	}
}
