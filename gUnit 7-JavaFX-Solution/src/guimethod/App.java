package guimethod;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		
		//TODO 26: create an FXML file to define the layout for a currency conversion application (read value as QAR and convert to USD)
		//         Use a TextField, a Label, and a Button to accomplish this task.
		
		 //TODO 27:  Create a "new" Parent object and load the settings from the FXML file into it
		 //          Hint: parent will be your root pane (main UI manager)
		 //			You will need the static method "load" from the FXMLLoader class
		 //			Use: getClass().getResource( YOUR_FILE_NAME ) as an argument for the load method.
		 Parent root = FXMLLoader.load( getClass().getResource("MyLayout.fxml") );
		 //TODO 28 create a Scene object and give it your "root" layout pane
		Scene myScene = new Scene(root);
		//TODO 29 set the scene inside the stage of your application
		stage.setScene(myScene);
		//TODO 30 set a nice title for your program
		stage.setTitle("My humble converter");
		//TODO 31 don't forget to show your application
		stage.show();

    	/*
		 * Copy the following Todos in your Controller Class
		 * 
		 * //TODO 32 in your handle or (convert) method do the following:
		 */

	}

	public static void main(String [] args)
	{
		launch(args);
	}
}
