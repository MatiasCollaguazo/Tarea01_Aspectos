package ec.edu.espol.observer;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.control.Button;

/**
 *
 * @author matia
 */
public class ButtonSubject extends Button{
   
    public ButtonSubject(String txt) {
        super(txt);
        setOnAction((event) -> {
            click();
        });
    }
    
    public void click(){}
}
