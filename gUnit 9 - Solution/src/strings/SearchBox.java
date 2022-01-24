package strings;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Extra Practice Problem
 * This is a Search box program which displays the troy story inside of it.
 * Your job is to implement the Search function of the Search button.
 * 
 *  Make the button look for the occurrence of the match (case not sensitive),
 *  then highlight the place that the word appears.
 *  
 *  @author Abdulaziz Al-Ali
 */
public class SearchBox extends Application{

	@Override
	public void start(Stage stage) throws Exception {

		stage.setTitle("Search App v1");
		
		Parent root = FXMLLoader.load(getClass().getResource("SearchBox.fxml"));
		
		stage.setScene(new Scene(root));
		
		stage.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);

	}
	


	

}
