package main;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MenuBar {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    private final String helpUrl = "https://github.com/Study-Support-Notepad";

    @FXML
    void onBackToMenu(ActionEvent event) {

    }

    @FXML
    void onHelp(ActionEvent event) throws IOException {
        java.awt.Desktop.getDesktop().browse(URI.create(helpUrl));
    }

    @FXML
    void onLogout(ActionEvent event) {

    }

    @FXML
    void onSettings(ActionEvent event) {
    }

    @FXML
    void initialize() {

    }
}
