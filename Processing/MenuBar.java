package main;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;

public class MenuBar {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button tooltipSettings;

    @FXML
    private Button tooltipLogout;

    @FXML
    private Button tooltipHelp;

    private final String helpUrl = "https://github.com/Study-Support-Notepad";

    @FXML
    void onBackToMenu(ActionEvent event) {
        if (!MainWindow.menuParts.isVisible()) {
            MainWindow.allFalseVisible();
            MainWindow.menuBarParts.setVisible(true);
            MainWindow.menuParts.setVisible(true);
        }
    }

    @FXML
    void onHelp(ActionEvent event) throws IOException {
        java.awt.Desktop.getDesktop().browse(URI.create(helpUrl));
    }

    @FXML
    void onLogout(ActionEvent event) {
        MainWindow.allFalseVisible();
        MainWindow.loginParts.setVisible(true);

    }

    @FXML
    void onSettings(ActionEvent event) {
    }

    private void setTooltip() {
        Tooltip tpSettings = new Tooltip("設定");
        Tooltip tpLogout = new Tooltip("ログアウト");
        Tooltip tpHelp = new Tooltip("ヘルプ");
        tooltipSettings.setTooltip(tpSettings);
        tooltipLogout.setTooltip(tpLogout);
        tooltipHelp.setTooltip(tpHelp);
    }

    @FXML
    void initialize() {
        setTooltip();

    }
}
