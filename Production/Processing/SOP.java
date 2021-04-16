// ScreenOperation Class
package main;

import javafx.scene.layout.StackPane;

public class SOP {

    public static MainWindow mw;

    public static StackPane loginParts, createAccountParts,
                            forgotParts;                       // login系統Pane
    public static StackPane menuParts, addAnswerParts,
                            addProblemParts, editProblemParts; // menu系統Pane
    public static StackPane menuBarParts;                      // menuBar系統Pane
    public static StackPane afterAddProblemParts;              // その他Pane

    public void setMW(MainWindow mw) {
        this.mw = mw;
    }

    public static void viewMenu() {
        mw.menuBar.getChildren().add(menuBarParts);
        mw.addParts.getChildren().add(menuParts);
    }

    public static void viewLoginParts() {
        mw.mainWindow.getChildren().add(loginParts);
    }


}