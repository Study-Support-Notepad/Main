package main;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;


public class Starting {

    @FXML
    private StackPane window;

    @FXML
    private StackPane ring;

    public static FadeTransition ft;

    public static void runFade() {
        ft.play();
    }

    @FXML
    public void initialize() {
        RotateTransition animation = new RotateTransition(Duration.seconds(2.25), ring);
        animation.setByAngle(360);
        animation.setCycleCount(TranslateTransition.INDEFINITE);
        animation.setInterpolator(Interpolator.LINEAR);
        animation.play();

        ft = new FadeTransition(Duration.seconds(2), window);
        ft.setFromValue(1);
        ft.setToValue(0);
        ft.onFinishedProperty().set(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                window.getScene().getWindow().setOpacity(0);
                Main.primaryStage2.show();
                Main.primaryStage.close();
            }
        });
    }
}
