package com.temp.monitor.ui;

import com.temp.monitor.ui.controller.TempMonitorUIController;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;

public final class TempMonitorLauncher extends Application {
    private static final URL TEMP_MONITOR_FXML =
            TempMonitorUIController.class.getResource("/fxml/TempMonitorUI.fxml");

    private TempMonitorUIController uiController;

    public static void main(String[] args) {
        Application.launch();
    }


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TEMP_MONITOR_FXML);
        Scene scene = new Scene(fxmlLoader.load());
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("OK");
        stage.setScene(scene);
        stage.show();
        uiController = fxmlLoader.getController();
    }

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void stop() throws Exception {
        uiController.close();
        super.stop();
    }
}
