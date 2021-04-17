package main;

import javafx.fxml.FXMLLoader;

public class LoadParts {

    // アプリケーション起動時に全て読み込まれる
    // リセットしたい場合は単体でメソッドを呼ぶ
    public static void loadAll() throws Exception {
        loadLogin();
        loadCreateAccount();
        loadForgot();
        loadMenuBar();
        loadMenu();
        loadAddAnswer();
        loadAddProblem();
        loadAfterAddProblem();
        loadEditProblem();
    }

    public static void loadLogin() throws Exception {
        SOP.loginParts = FXMLLoader.load(LoadParts.class.getResource("login/login.fxml"));
    }

    public static void loadCreateAccount() throws Exception {
        SOP.createAccountParts = FXMLLoader.load(LoadParts.class.getResource("createAccount/createAccount.fxml"));
    }

    public static void loadForgot() throws Exception {
        SOP.forgotParts = FXMLLoader.load(LoadParts.class.getResource("forgot/forgot.fxml"));
    }

    public static void loadMenuBar() throws Exception {
        SOP.menuBarParts = FXMLLoader.load(LoadParts.class.getResource("menuBar/menuBar.fxml"));
    }

    public static void loadMenu() throws Exception {
        SOP.menuParts = FXMLLoader.load(LoadParts.class.getResource("mainMenu/mainMenu.fxml"));
    }

    public static void loadAddAnswer() throws Exception {
        SOP.addAnswerParts = FXMLLoader.load(LoadParts.class.getResource("addAnswer/addAnswer.fxml"));
    }

    public static void loadAddProblem() throws Exception {
        SOP.addProblemParts = FXMLLoader.load(LoadParts.class.getResource("addProblem/addProblem.fxml"));
    }

    public static void loadAfterAddProblem() throws Exception {
        SOP.afterAddProblemParts = FXMLLoader.load(LoadParts.class.getResource("afterAddProblem/afterAddProblem.fxml"));
    }

    public static void loadEditProblem() throws Exception {
        SOP.editProblemParts = FXMLLoader.load(LoadParts.class.getResource("editProblem1/editProblem1.fxml"));
    }
}
