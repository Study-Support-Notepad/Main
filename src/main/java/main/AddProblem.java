package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AddProblem {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea problem;

    @FXML
    private TextField problemTitle;

    @FXML
    private TextArea memo;

    @FXML
    private ComboBox<?> setTag;

    @FXML
    void onProblemSave(ActionEvent event) {

    }

    @FXML
    void initialize() {
    }
}
