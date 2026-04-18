package org.projectplant.projectplant;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class loginController implements Initializable {

    @FXML
    private Button btnLogin;

    @FXML
    private Label labelTittle;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUsername;



    // Boton login, comprueba user y password
    @FXML
    void userLogin(ActionEvent event) {
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        if (username.equals("admin") || password.equals("1234")) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Login");
            alert.setHeaderText(null);
            alert.setContentText("Welcome Admin");
            alert.showAndWait();
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
