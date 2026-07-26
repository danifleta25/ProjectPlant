package org.projectplant.projectplant.presentation.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.projectplant.projectplant.ProjectPlantApp;

import java.io.IOException;

public class DashboardController {


    @FXML
    private Button btnLogout;

    @FXML
    private void handleLogout(ActionEvent actionEvent) {

        try {
            Stage stage = (Stage) btnLogout.getScene().getWindow();

            FXMLLoader loader = new FXMLLoader(
                    ProjectPlantApp.class.getResource("/fxml/login.fxml"));

            Parent root = loader.load();

            Scene scene = new Scene(root);

            stage.setScene(scene);
        } catch (IOException e) {
            throw new RuntimeException("Error al cargar login.fxml", e);
        }
    }
}
