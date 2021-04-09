package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class AddAnswer {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button onMenuOrAddProblemMove;

    @FXML
    private TextArea answer;

    @FXML
    private TextArea memo;

    @FXML
    private Label title;

    @FXML
    void onAnswerSave(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert onMenuOrAddProblemMove != null : "fx:id=\"onMenuOrAddProblemMove\" was not injected: check your FXML file 'addAnswer.fxml'.";
        assert answer != null : "fx:id=\"answer\" was not injected: check your FXML file 'addAnswer.fxml'.";
        assert memo != null : "fx:id=\"memo\" was not injected: check your FXML file 'addAnswer.fxml'.";
        assert title != null : "fx:id=\"title\" was not injected: check your FXML file 'addAnswer.fxml'.";

    }
}
