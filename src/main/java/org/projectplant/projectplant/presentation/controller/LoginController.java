package org.projectplant.projectplant.presentation.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.projectplant.projectplant.ProjectPlantApp;
import org.projectplant.projectplant.domain.service.LoginService;

import java.io.IOException;

public class LoginController {

    private final LoginService loginService;


    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    private Button btnLogin;

    public LoginController() {
        loginService = new LoginService();
    }

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @FXML
    void handleLogin(ActionEvent event) {

        String username = txtUsername.getText();
        String password = txtPassword.getText();

        boolean authenticated = loginService.login(username, password);

        if (authenticated) {
            try {
                Stage stage = (Stage) btnLogin.getScene().getWindow();

                FXMLLoader loader = new FXMLLoader(
                        ProjectPlantApp.class.getResource("/fxml/dashboard.fxml"));

                Parent root = loader.load();

                Scene scene = new Scene(root);

                stage.setScene(scene);
            } catch (IOException e) {
                throw new RuntimeException("Error al cargar dashboard.fxml", e);
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Fallido");
            alert.setContentText("Nombre de usuario o contraseña incorrectos");
            alert.showAndWait();
        }


    }

}
