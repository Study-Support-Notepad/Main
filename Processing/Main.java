package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.stage.StageStyle;

public class Main extends Application {

    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage)  throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("mainWindow/mainWindow.fxml"));
        Parent root = (Parent)loader.load();
        primaryStage.setScene(new Scene(root, 800, 500));
        Image icon = new Image( "main/images/logo.png" );
        primaryStage.getIcons().add(icon);
        primaryStage.setResizable(true);
        primaryStage.setMinHeight(400);
        primaryStage.setMinWidth(600);
        primaryStage.show();
    }
}
