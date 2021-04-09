package main;

import com.mysql.cj.util.StringUtils;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;

import java.io.File;
import java.io.FileWriter;
import java.sql.*;

public class MainWindow {

    @FXML
    protected StackPane mainWindow;

    @FXML
    protected StackPane addParts;

    @FXML
    protected StackPane menuBar;

    public static StackPane loginParts, createAccountParts,
                            forgotParts;                       // login系統Pane
    public static StackPane menuParts, addAnswerParts,
                            addProblemParts, editProblemParts; // menu系統Pane
    public static StackPane menuBarParts;                      // menuBar系統Pane
    public static StackPane afterAddProblemParts;              // その他Pane

    public static void allFalseVisible() {
        loginParts          .setVisible(false);
        createAccountParts  .setVisible(false);
        menuBarParts        .setVisible(false);
        menuParts           .setVisible(false);
        addAnswerParts      .setVisible(false);
        addProblemParts     .setVisible(false);
        afterAddProblemParts.setVisible(false);
        editProblemParts    .setVisible(false);
        forgotParts         .setVisible(false);
    }

    protected void loadParts() throws Exception  {
        // load fxml
        loginParts           = FXMLLoader.load(getClass().getResource("login/login.fxml"));
        createAccountParts   = FXMLLoader.load(getClass().getResource("createAccount/createAccount.fxml"));
        menuBarParts         = FXMLLoader.load(getClass().getResource("menuBar/menuBar.fxml"));
        menuParts            = FXMLLoader.load(getClass().getResource("mainMenu/mainMenu.fxml"));
        addAnswerParts       = FXMLLoader.load(getClass().getResource("addAnswer/addAnswer.fxml"));
        addProblemParts      = FXMLLoader.load(getClass().getResource("addProblem/addProblem.fxml"));
        afterAddProblemParts = FXMLLoader.load(getClass().getResource("afterAddProblem/afterAddProblem.fxml"));
        editProblemParts     = FXMLLoader.load(getClass().getResource("editProblem1/editProblem1.fxml"));
        forgotParts          = FXMLLoader.load(getClass().getResource("forgot/forgot.fxml"));

        // visible settings
        allFalseVisible();

        // add other parts
        mainWindow.getChildren().add(loginParts);
        mainWindow.getChildren().add(createAccountParts);
        mainWindow.getChildren().add(forgotParts);

        addParts.getChildren().add(menuParts);
        addParts.getChildren().add(addAnswerParts);
        addParts.getChildren().add(addProblemParts);
        addParts.getChildren().add(afterAddProblemParts);
        addParts.getChildren().add(editProblemParts);

        menuBar.getChildren().add(menuBarParts);

    }



    @FXML
    void initialize() throws Exception {
        System.out.println("mainwindow controller");
        loadParts();
        if (API.canLogin()) { // loginSessionが有効な場合
            MainWindow.menuBarParts.setVisible(true);
            MainWindow.menuParts.setVisible(true);
        } else { // loginSessionが無効な場合
            MainWindow.loginParts.setVisible(true);
        }
    }
}
