package main;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class MenuBar {

    @FXML
    private ResourceBundle resources;

    @FXML
    private StackPane icon;

    @FXML
    private URL location;

    @FXML
    private Button tooltipSettings;

    @FXML
    private Button tooltipLogout;

    @FXML
    private Button tooltipHelp;

    @FXML
    private Pane contact;

    private final String helpUrl = "https://github.com/Study-Support-Notepad"; // 今後Help文が記載されたサイトへのURLに変更する

    @FXML
    void onBackToMenu(ActionEvent event) {
        /*if (!MainWindow.menuParts.isVisible()) {
            //MainWindow.allFalseVisible();
            MainWindow.menuBarParts.setVisible(true);
            MainWindow.menuParts.setVisible(true);
        }*/
    }

    // Help文記載のサイトに飛ぶ
    @FXML
    void onHelp(ActionEvent event) throws IOException {
        java.awt.Desktop.getDesktop().browse(URI.create(helpUrl));
    }

    // ログアウト処理
    @FXML
    void onLogout(ActionEvent event) {
        //MainWindow.allFalseVisible();
        //MainWindow.loginParts.setVisible(true);
    }

    // アカウント設定画面に飛ぶ
    @FXML
    void onSettings(ActionEvent event) {
    }

    // tooltip(カーソルを合わせると浮き出てくる文字)設定用
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
