package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;

public class CreateAccount {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private StackPane window;

    @FXML
    private TextField email;

    @FXML
    private TextField userName;

    @FXML
    private TextField password;

    @FXML
    private PasswordField passwordCheck;

    @FXML
    private Hyperlink termsCheck;

    @FXML
    private Label warningMessage;

    @FXML
    void onCreateAccount(ActionEvent event) {

    }

    @FXML
    void onExistingAccountLogin(ActionEvent event) {

    }

    @FXML
    void onLink(ActionEvent event) {
    }

    @FXML
    void initialize() {
        assert window != null : "fx:id=\"window\" was not injected: check your FXML file 'createAccount.fxml'.";
        assert email != null : "fx:id=\"email\" was not injected: check your FXML file 'createAccount.fxml'.";
        assert userName != null : "fx:id=\"userName\" was not injected: check your FXML file 'createAccount.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'createAccount.fxml'.";
        assert passwordCheck != null : "fx:id=\"passwordCheck\" was not injected: check your FXML file 'createAccount.fxml'.";
        assert termsCheck != null : "fx:id=\"termsCheck\" was not injected: check your FXML file 'createAccount.fxml'.";
        assert warningMessage != null : "fx:id=\"warningMessage\" was not injected: check your FXML file 'createAccount.fxml'.";

    }
}
