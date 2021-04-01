package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.net.URI;


public class Login {
    @FXML
    private TextField email;

    @FXML
    private PasswordField password;

    @FXML
    private StackPane window;

    @FXML
    private Button loginButton;

    public static MainWindow mw;

    public void setMW(MainWindow mw) {
        this.mw = mw;
    }

    // login処理
    @FXML
    void onLoginClick(ActionEvent event) throws Exception {
        // login完了したら
        if (true) {
            MainWindow.loginParts.setVisible(false);
            MainWindow.menuBarParts.setVisible(true);
            MainWindow.menuParts.setVisible(true);
        }
    }

    @FXML
    void createAccount(ActionEvent event) {
    }

    @FXML
    void forgotPassword(ActionEvent event) {

    }

    @FXML
    void initialize() {}
}
