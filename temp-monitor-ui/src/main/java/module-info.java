module com.temp.monitor.ui {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.temp.monitor.ui to javafx.fxml;
    exports  com.temp.monitor.ui;

    opens  com.temp.monitor.ui.controller to javafx.fxml;
    exports  com.temp.monitor.ui.controller;
}