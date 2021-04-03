package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.sql.Connection;

public class Main extends Application {

    public static void main(String[] args) throws Exception{
        Connection con = DataBase.getConnection();
        con.close();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)  throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("mainWindow/mainWindow.fxml"));
        Parent root = (Parent)loader.load();
        primaryStage.setScene(new Scene(root, 740, 458));
        Image icon = new Image( "main/images/logo.png" );
        primaryStage.getIcons().add(icon);
        primaryStage.setResizable(true);
        primaryStage.setMinHeight(400);
        primaryStage.setMinWidth(600);
        primaryStage.show();
    }
}
