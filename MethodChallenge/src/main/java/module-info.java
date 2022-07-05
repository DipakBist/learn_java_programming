module com.example.methodchallenge {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.methodchallenge to javafx.fxml;
    exports com.example.methodchallenge;
}