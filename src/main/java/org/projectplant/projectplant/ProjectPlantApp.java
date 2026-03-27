package org.projectplant.projectplant;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ProjectPlantApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ProjectPlantApp.class.getResource("login-vista.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Project Plant");
        stage.setScene(scene);
        stage.show();
    }
}
