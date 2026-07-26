package org.projectplant.projectplant;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.projectplant.projectplant.domain.service.LoginService;
import org.projectplant.projectplant.presentation.controller.LoginController;

public class ProjectPlantApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        LoginService loginService = new LoginService();

        FXMLLoader loader = new FXMLLoader(
                ProjectPlantApp.class.getResource("/fxml/login.fxml"));

        loader.setControllerFactory(type -> {
            if (type == LoginController.class) {
                return new LoginController(loginService);
            }
            throw new IllegalStateException("Unexpected controller: " + type);
        });


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