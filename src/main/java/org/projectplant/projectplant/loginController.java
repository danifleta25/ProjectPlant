package org.projectplant.projectplant;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.projectplant.projectplant.User.User;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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

    @FXML
    private Button btnNewUser;

    private List<User> users = new ArrayList<>();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        // label Style
        labelTittle.setStyle(
                "-fx-text-fill: green;" +
                        "-fx-font-weight: bold;"
        );
        labelTittle.setAlignment(Pos.CENTER);
    }

    // Boton login, comprueba user y password
    @FXML
    void userLogin(ActionEvent event) {
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        boolean found = false;
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                found = true;
                break;
            }
        }
        if (found) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText("Success");
            alert.setContentText("You are logged in");
            alert.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Invalid username or password");
            alert.setContentText("Invalid username or password");
            alert.showAndWait();
        }
    }


    @FXML
    void newUser(ActionEvent event) {
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        users.add(new User(username, password));

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("User created");
        alert.setHeaderText(null);
        alert.setContentText("User created successfully");
        alert.showAndWait();
    }



}
