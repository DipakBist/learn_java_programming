module com.example.byteshortlongint {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.byteshortlongint to javafx.fxml;
    exports com.example.byteshortlongint;
}