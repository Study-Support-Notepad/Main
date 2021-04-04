package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;

public class Login {
    @FXML
    private TextField email;

    @FXML
    private PasswordField password;

    @FXML
    private StackPane window;

    @FXML
    private Button loginButton;

    @FXML
    private CheckBox saveLogin;

    @FXML
    private Label warningTxt;

    public static MainWindow mw;

    public void setMW(MainWindow mw) {
        this.mw = mw;
    }

    // login処理
    @FXML
    void onLoginClick(ActionEvent event) throws Exception {
        if (!hasBlank(email.getText()) && !hasBlank(password.getText()) && !email.getText().equals("")) { // 空白が入っていない and 文字が1文字以上入っているか
            if (API.accountExists(email.getText(), password.getText())) { // アカウントの確認
                // login完了したら
                MainWindow.loginParts.setVisible(false);
                MainWindow.menuBarParts.setVisible(true);
                MainWindow.menuParts.setVisible(true);
                if (saveLogin.isSelected()) {
                    API.setSession();
                }
            } else { // アカウントが存在しなければエラー表示
                warningTxt.setText("アカウントが存在しません");
            }
        } else { // 空白が入っていたらエラー表示
            warningTxt.setText("空白を入力することは出来ません");
        }
    }

    // 文字列に空白が含まれるか確認
    // 空白有 true, 無 false
    private boolean hasBlank(String str) {
        return str.contains(" ") || str.contains("　");
    }

    @FXML
    void createAccount(ActionEvent event) {
        MainWindow.loginParts.setVisible(false);
        MainWindow.createAccountParts.setVisible(true);
    }

    @FXML
    void forgotPassword(ActionEvent event) {

    }

    @FXML
    void initialize() {
    }

}
