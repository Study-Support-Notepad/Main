package main;

import animatefx.animation.FadeOutLeft;
import animatefx.animation.Shake;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class Animations {

    public static void atLoginSystem(StackPane node) {
        FadeOutLeft fo = new FadeOutLeft(node);
        fo.setOnFinished(event -> {
            SOP.closeLoginParts();
        });
        fo.play();
    }

    public static void startingRotate(StackPane node) {
        RotateTransition animation = new RotateTransition(Duration.seconds(2.25), node);
        animation.setByAngle(360);
        animation.setCycleCount(TranslateTransition.INDEFINITE);
        animation.setInterpolator(Interpolator.LINEAR);
        animation.play();
    }

    public static void failureLoginSystem(Button node) {
        Shake shake = new Shake(node);
        shake.play();
    }
}
