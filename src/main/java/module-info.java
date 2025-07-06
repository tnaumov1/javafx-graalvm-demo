module dev.tnaumov.javafxgraalvmdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.tnaumov.javafxgraalvmdemo to javafx.fxml;
    exports dev.tnaumov.javafxgraalvmdemo;
}