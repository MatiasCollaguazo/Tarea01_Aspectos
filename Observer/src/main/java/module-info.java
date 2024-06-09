module ec.edu.espol.observer {
    requires javafx.controls;
    requires javafx.fxml;

    opens ec.edu.espol.observer to javafx.fxml;
    exports ec.edu.espol.observer;
}
