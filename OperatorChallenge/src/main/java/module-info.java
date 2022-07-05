module com.example.operatorchallenge {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.operatorchallenge to javafx.fxml;
    exports com.example.operatorchallenge;
}