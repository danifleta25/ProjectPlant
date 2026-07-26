package org.projectplant.projectplant.presentation.navigation;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NavigationManager {


    private final Stage stage;


    public NavigationManager(Stage stage) {
        this.stage = stage;
    }

    public void navigateTo(String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    NavigationManager.class.getResource(fxmlPath));

            Parent root = loader.load();

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            throw new RuntimeException("Error loading view: " + fxmlPath, e);
        }
    }
}
