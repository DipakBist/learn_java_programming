module com.example.speedconverter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.speedconverter to javafx.fxml;
    exports com.example.speedconverter;
}