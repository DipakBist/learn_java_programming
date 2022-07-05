module com.example.string {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.string to javafx.fxml;
    exports com.example.string;
}