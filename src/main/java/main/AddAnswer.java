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
    }
}
