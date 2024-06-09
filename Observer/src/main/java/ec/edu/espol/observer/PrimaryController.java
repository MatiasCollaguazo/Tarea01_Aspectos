package ec.edu.espol.observer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class PrimaryController implements Initializable{
    @FXML
    private Pane MainPanel;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        GPaneObserver gpObserver = new GPaneObserver();
        gpObserver.setPrefSize(600, 400);
        //bp.setBackground(Background.fill(Color.GRAY));
        ButtonSubject button1 = new ButtonSubject("RED");
        //button1.setBackground(Background.fill(Color.RED));
        ButtonSubject button2 = new ButtonSubject("ORANGE");
        //button2.setBackground(Background.fill(Color.ORANGE));
        ButtonSubject button3 = new ButtonSubject("YELLOW");
        //button3.setBackground(Background.fill(Color.YELLOW));
        gpObserver.add(button1, 0, 0);
        gpObserver.add(button2, 1, 0);
        gpObserver.add(button3, 2, 0);
        button1.addObserver(gpObserver);
        button2.addObserver(gpObserver);
        button3.addObserver(gpObserver);
        
        MainPanel.getChildren().add(gpObserver);
        gpObserver.setAlignment(Pos.CENTER);
        
    }

}
