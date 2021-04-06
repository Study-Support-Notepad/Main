package main;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class Starting {

    @FXML
    private StackPane window;

    @FXML
    private StackPane ring;

    @FXML
    void initialize() throws Exception {
        RotateTransition animation = new RotateTransition(Duration.seconds(2.25), ring);
        animation.setByAngle(360);
        animation.setCycleCount(TranslateTransition.INDEFINITE);
        animation.setInterpolator(Interpolator.LINEAR);
        animation.play();



    }
}
