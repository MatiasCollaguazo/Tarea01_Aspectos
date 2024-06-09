package ec.edu.espol.observer;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
/**
 *
 * @author matia
 */
public class GPaneObserver extends GridPane{
	//Implementación de clase y metodo para que observe, 
	//recepte y se actualice de acuerdo al sujeto
    public void changeColor(String bgcolor) {
    	setBackground(Background.fill(Color.valueOf(bgcolor)));
    }
}
