package main;

import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;
public class MainWindow {

    @FXML
    protected StackPane mainWindow;

    @FXML
    protected StackPane addParts;

    @FXML
    protected StackPane menuBar;

    @FXML
    void initialize() throws Exception {
        LoadParts.loadAll();
        new SOP().setMW(this);
        if (API.canLogin()) { // loginSessionが有効な場合
            SOP.SessionLogin();
        } else { // loginSessionが無効な場合
            SOP.notSessionLogin();
        }
    }
}
