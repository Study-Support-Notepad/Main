package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    public static Stage primaryStage;
    public static Stage primaryStage2;

    public static void main(String[] args) throws Exception{
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)  throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("starting/starting.fxml"));
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root, 500, 300));
        Image icon = new Image( "main/images/logo.png" );
        primaryStage.getIcons().add(icon);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();
        this.primaryStage = primaryStage;


        FXMLLoader loader2 = new FXMLLoader(getClass().getResource("mainWindow/mainWindow.fxml"));
        Parent root2 = loader2.load();
        Stage primaryStage2 = new Stage();
        primaryStage2.setScene(new Scene(root2, 740, 458));
        primaryStage2.setResizable(true);
        Image icon2 = new Image("main/images/logo.png");
        primaryStage2.getIcons().add(icon2);
        primaryStage2.setMinHeight(400);
        primaryStage2.setMinWidth(600);
        this.primaryStage2 = primaryStage2;
        new FirstRun().start();
    }
}
