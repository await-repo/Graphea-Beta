module com.graphea.graphea1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.graphea.graphea1 to javafx.fxml;
    exports com.graphea.graphea1;
    exports com.graphea.graphea1.Interfaces;
    opens com.graphea.graphea1.Interfaces to javafx.fxml;
}