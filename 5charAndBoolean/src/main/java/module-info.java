module com.example.charandboolean {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.charandboolean to javafx.fxml;
    exports com.example.charandboolean;
}