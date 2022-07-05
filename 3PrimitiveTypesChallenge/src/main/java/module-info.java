module com.example.primitivetypeschallenge {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.primitivetypeschallenge to javafx.fxml;
    exports com.example.primitivetypeschallenge;
}