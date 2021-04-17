package main;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
public class MainWindow {

    @FXML
    StackPane mainWindow;

    @FXML
    StackPane addParts;

    @FXML
    StackPane menuBar;

    @FXML
    void initialize() throws Exception {
        LoadParts.loadAll();
        new SOP().setMW(this);
        SOP.viewMenu();
        if (!API.canLogin()) { // loginSessionが無効な場合
            SOP.viewLoginParts();
        }
    }
}
