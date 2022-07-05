module com.example.keywordsandexpressions {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.keywordsandexpressions to javafx.fxml;
    exports com.example.keywordsandexpressions;
}