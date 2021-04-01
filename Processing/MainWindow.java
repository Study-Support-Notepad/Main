package main;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;

public class MainWindow {

    @FXML
    protected StackPane mainWindow;

    @FXML
    protected StackPane addParts;

    @FXML
    protected StackPane menuBar;

    public static StackPane loginParts, createAccountParts;    // login系統Pane
    public static StackPane menuParts, addAnswerParts,
                            addProblemParts, editProblemParts; // menu系統Pane
    public static StackPane menuBarParts;                      // menuBar系統Pane
    public static StackPane afterAddProblemParts;              // その他Pane

    protected void loadParts() throws Exception  {
        // load fxml
        loginParts           = (StackPane) FXMLLoader.load(getClass().getResource("login/login.fxml"));
        createAccountParts   = (StackPane) FXMLLoader.load(getClass().getResource("createAccount/createAccount.fxml"));
        menuBarParts         = (StackPane) FXMLLoader.load(getClass().getResource("menuBar/menuBar.fxml"));
        menuParts            = (StackPane) FXMLLoader.load(getClass().getResource("mainMenu/mainMenu.fxml"));
        addAnswerParts       = (StackPane) FXMLLoader.load(getClass().getResource("addAnswer/addAnswer.fxml"));
        addProblemParts      = (StackPane) FXMLLoader.load(getClass().getResource("addProblem/addProblem.fxml"));
        afterAddProblemParts = (StackPane) FXMLLoader.load(getClass().getResource("afterAddProblem/afterAddProblem.fxml"));
        editProblemParts     = (StackPane) FXMLLoader.load(getClass().getResource("editProblem1/editProblem1.fxml"));

        // visible settings
        loginParts          .setVisible(true);
        createAccountParts  .setVisible(false);
        menuBarParts        .setVisible(false);
        menuParts           .setVisible(false);
        addAnswerParts      .setVisible(false);
        addProblemParts     .setVisible(false);
        afterAddProblemParts.setVisible(false);
        editProblemParts    .setVisible(false);

        // add other parts
        mainWindow.getChildren().add(loginParts);
        mainWindow.getChildren().add(createAccountParts);

        addParts.getChildren().add(menuParts);
        addParts.getChildren().add(addAnswerParts);
        addParts.getChildren().add(addProblemParts);
        addParts.getChildren().add(afterAddProblemParts);
        addParts.getChildren().add(editProblemParts);

        menuBar.getChildren().add(menuBarParts);

    }

    @FXML
    void initialize() throws Exception {
        new Login().setMW(this);
        loadParts();
    }

}
