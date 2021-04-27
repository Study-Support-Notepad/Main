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
        if (Regexes.checkEmail(email.getText())) {
            if (Regexes.checkPassword(password.getText())) {
                if (API.accountExists(email.getText(), password.getText())) { // アカウントの確認
                    Animations.atLoginSystem(SOP.loginParts);
                    if (saveLogin.isSelected()) {
                        API.setSession();
                    }
                } else { // アカウントが存在しなければエラー表示
                    warningTxt.setText("アカウントが存在しません");
                    Animations.failureLoginSystem(loginButton);
                }
            } else {
                warningTxt.setText("パスワードが間違っています");
                Animations.failureLoginSystem(loginButton);
            }
        } else {
            warningTxt.setText("EmailAddressが間違っています");
            Animations.failureLoginSystem(loginButton);
        }
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
