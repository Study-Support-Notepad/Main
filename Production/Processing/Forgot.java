package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;

public class Forgot {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private StackPane window;

    @FXML
    private TextField email;

    @FXML
    void onSendResetPassword(ActionEvent event) {
    }

    @FXML
    void initialize() {
    }
}