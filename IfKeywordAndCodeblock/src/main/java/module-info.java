module com.example.ifkeywordandcodeblock {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ifkeywordandcodeblock to javafx.fxml;
    exports com.example.ifkeywordandcodeblock;
}