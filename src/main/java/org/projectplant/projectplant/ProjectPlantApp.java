package org.projectplant.projectplant;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ProjectPlantApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(
                ProjectPlantApp.class.getResource("/fxml/login.fxml"));

        Scene scene = new Scene(loader.load());

        stage.setTitle("ProjectPlant");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}