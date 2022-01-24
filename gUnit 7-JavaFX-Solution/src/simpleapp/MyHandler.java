package simpleapp;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
//TODO 13: create a handler class MyHandler (independent one) and make it implement EventHandler<ActionEvent>
public class MyHandler implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent arg0) {
		
		//TODO 14: make the handle method display "BUTTON PRESSED" every time the button is pressed.
		System.out.println("BUTTON PRESSED");
		
		//TODO 15: run the program. Does the button show the message now when pressed? Continue to Todo 16
	}


}
