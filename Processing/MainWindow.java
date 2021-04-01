package main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.StackPane;

public class MainWindow {

    @FXML
    private StackPane mainWindow;

    @FXML
    private StackPane addParts;

    @FXML
    private StackPane menuBar;

    private StackPane loginParts;   // login系統Pane
    private StackPane menuParts;    // menu系統Pane
    private StackPane menuBarParts; // menuBar系統Pane

    public void loginCompleted() throws Exception {
        mainWindow.getChildren().remove(loginParts);
        menuBarParts.setVisible(true);
        menuParts.setVisible(true);
    }

    private void loadParts() throws Exception  {
        // load fxml
        loginParts = (StackPane) FXMLLoader.load(getClass().getResource("createAccount/createAccount.fxml"));
        menuBarParts = (StackPane) FXMLLoader.load(getClass().getResource("menuBar/menuBar.fxml"));
        menuParts = (StackPane) FXMLLoader.load(getClass().getResource("mainMenu/mainMenu.fxml"));

        // add login parts
        mainWindow.getChildren().add(loginParts);

        // visible settings
        menuBarParts.setVisible(false);
        menuParts.setVisible(false);

        // add other parts
        menuBar.getChildren().add(menuBarParts);
        addParts.getChildren().add(menuParts);
    }

    @FXML
    void initialize() throws Exception {
        new Login().setMW(this);
        loadParts();
    }

}
