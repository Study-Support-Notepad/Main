package main;

import animatefx.animation.FadeOut;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;


public class Starting {

    public static FadeOut fo;

    @FXML
    private StackPane window;

    @FXML
    private StackPane ring;


    public static void runFade() {
        fo.play();
    }

    @FXML
    public void initialize() {
        Animations.startingRotate(ring);
        fo = new FadeOut(window);
        fo.setDelay(Duration.seconds(2));
        fo.setOnFinished(event -> {
            window.getScene().getWindow().setOpacity(0);
            Main.primaryStage2.show();
            Main.primaryStage.close();
        });
    }
}
