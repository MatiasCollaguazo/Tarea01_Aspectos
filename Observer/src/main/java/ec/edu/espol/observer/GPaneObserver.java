package ec.edu.espol.observer;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
/**
 *
 * @author matia
 */
public class GPaneObserver extends GridPane{
    public void changeColor(String bgcolor) {
    	setBackground(Background.fill(Color.valueOf(bgcolor)));
    }
}
