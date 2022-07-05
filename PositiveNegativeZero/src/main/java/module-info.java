module com.example.positivenegativezero {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.positivenegativezero to javafx.fxml;
    exports com.example.positivenegativezero;
}