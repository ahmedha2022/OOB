package strings;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import util.Util;

/**
 * This program looks for a word inside a String
 * If found, the program highlights in the text area where the word appears in String.
 * Practice and try to finish this program:
 * 
 * @author Abdulaziz Al-Ali
 *
 */
public class SearchController {

    @FXML
    private TextField searchField;

    @FXML
    private TextArea textArea;

    @FXML
    private Button searchButton;

    @FXML
    void initialize()
    {
    	String story = Util.readFile();
    	textArea.setText(story);
    }
    
    @FXML
    void search(ActionEvent event) {

    	//TODO 11 (EXTRA): make the search button highlight
    	// 		matching text in the text area (if found).
    	//      hint: you will need the selectRange(int,int) from the text area object.
    	//TODO 12 (EXTRA): what if you want it to look for the next occurrence every time you press "Search"?
    	//      hint: you will need the "getCaretPosition() method from the text area object.
    	
    	
    	
    	//do not remove the line below
    	textArea.requestFocus(); // you must have this line to show whatever is highlighted.
    }

}
