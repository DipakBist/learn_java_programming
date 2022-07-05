module com.example.statementswhitespacingandindenting {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.statementswhitespacingandindenting to javafx.fxml;
    exports com.example.statementswhitespacingandindenting;
}