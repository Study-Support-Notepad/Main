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
        if (checkEmail(email.getText())) {
            if (checkName(userName.getText())) {
                if (checkPassword(password.getText())) {
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

    private boolean checkEmail(String txt) {
        String pattern = "[a-zA-Z0-9.!#$%&’*+\\/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*";
        Pattern p = Pattern.compile(pattern);
        return p.matcher(txt).matches();
    }

    private boolean checkPassword(String txt) {
        String pattern = "[0-9a-zA-Z!?]{8,50}+";
        Pattern p = Pattern.compile(pattern);
        return p.matcher(txt).matches();
    }

    private boolean checkName(String txt)  {
        String pattern = "[0-9a-zA-Z]{3,20}+";
        Pattern p = Pattern.compile(pattern);
        return p.matcher(txt).matches();
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