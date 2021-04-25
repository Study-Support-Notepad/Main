package main;

import java.io.IOException;
import java.net.URI;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;

public class CreateAccount {

    @FXML
    private StackPane window;

    @FXML
    private TextField email;

    @FXML
    private TextField userName;

    @FXML
    private PasswordField password;

    @FXML
    private PasswordField passwordCheck;

    @FXML
    private CheckBox termsCheck;

    @FXML
    private Label warningTxt;

    @FXML
    private Button createButton;

    private final String termsURL = "https://github.com/Study-Support-Notepad"; // 利用規約先URL

    @FXML
    void onCreateAccount(ActionEvent event) throws Exception { // 空白がないかどうか パスワードの文字列 既に存在しているアカウントかどうか
        if (Regexes.checkEmail(email.getText())) {
            if (Regexes.checkName(userName.getText())) {
                if (Regexes.checkPassword(password.getText())) {
                    if (password.getText().equals(passwordCheck.getText())) {
                        if (termsCheck.isSelected()) {
                            /* if (アカウントがあるかどうか) {
                                なければアカウントの作成
                                Animations.atLoginSystem(SOP.createAccountParts);
                            } else {
                                warningTxt.setText("既にアカウントが存在しています");
                                Animations.failureLoginSystem(createButton);
                            }
                             */
                        } else {
                            warningTxt.setText("利用規約に同意してください");
                            Animations.failureLoginSystem(createButton);
                        }
                    } else {
                        warningTxt.setText("passwordが一致しません");
                        Animations.failureLoginSystem(createButton);
                    }
                } else {
                    warningTxt.setText("passwordを正しく入力してください");
                    Animations.failureLoginSystem(createButton);
                }
            } else {
                warningTxt.setText("名前を正しく入力してください");
                Animations.failureLoginSystem(createButton);
            }
        } else {
            warningTxt.setText("EmailAddressを正しく入力してください");
            Animations.failureLoginSystem(createButton);
        }
    }

    @FXML
    void onExistingAccountLogin(ActionEvent event) {
        SOP.viewLoginParts();
    }

    @FXML
    void onLink(ActionEvent event) throws IOException {
        java.awt.Desktop.getDesktop().browse(URI.create(termsURL));
    }

    @FXML
    void initialize() {
    }
}