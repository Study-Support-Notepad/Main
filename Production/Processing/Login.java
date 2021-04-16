package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Cursor;
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

    // login処理
    @FXML
    void onLoginClick(ActionEvent event) throws Exception {
        if (!hasBlank(email.getText()) && !hasBlank(password.getText()) && !email.getText().equals("") && !password.getText().equals("")) { // 空白が入っていない and 文字が1文字以上入っているか
            if (API.accountExists(email.getText(), password.getText())) { // アカウントの確認
                Animations.atLogin(SOP.loginParts);
                if (saveLogin.isSelected()) {
                    API.setSession();
                }
            } else { // アカウントが存在しなければエラー表示
                warningTxt.setText("アカウントが存在しません");
                Animations.failureLogin(loginButton);
            }
        } else { // 空白が入っていたらエラー表示
            warningTxt.setText("空白を入力することは出来ません");
            Animations.failureLogin(loginButton);
        }
    }

    // 文字列に空白が含まれるか確認
    // 空白有 true, 無 false
    private boolean hasBlank(String str) {
        return str.contains(" ") || str.contains("　");
    }

    @FXML
    void createAccount(ActionEvent event) {
        SOP.viewCreateAccountParts();
    }

    @FXML
    void forgotPassword(ActionEvent event) {
        SOP.viewForgotParts();
    }

    @FXML
    void initialize() {
        loginButton.setCursor(Cursor.HAND);
    }

}
