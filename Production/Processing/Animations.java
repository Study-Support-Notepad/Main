package main;

import animatefx.animation.FadeOutLeft;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class Animations {



    public static void startingRotate(StackPane node) {
        RotateTransition animation = new RotateTransition(Duration.seconds(2.25), node);
        animation.setByAngle(360);
        animation.setCycleCount(TranslateTransition.INDEFINITE);
        animation.setInterpolator(Interpolator.LINEAR);
        animation.play();
    }
}
