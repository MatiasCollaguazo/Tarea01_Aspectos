module Observer2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens ec.edu.espol.observer to javafx.fxml;
    exports observer;
}
