module com.example.floatanddouble {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.floatanddouble to javafx.fxml;
    exports com.example.floatanddouble;
}