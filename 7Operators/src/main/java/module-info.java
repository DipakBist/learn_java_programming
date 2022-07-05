module com.example.operators {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.operators to javafx.fxml;
    exports com.example.operators;
}