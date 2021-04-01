package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class EditProblem {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField searchTitle;

    @FXML
    private ComboBox<String> selectTag;

    @FXML
    private ListView<String> problems;

    @FXML
    void onEdit(ActionEvent event) {

    }

    @FXML
    void onSearch(ActionEvent event) {
    }

    @FXML
    void initialize() {
        assert searchTitle != null : "fx:id=\"searchTitle\" was not injected: check your FXML file 'editProblem1.fxml'.";
        assert selectTag != null : "fx:id=\"selectTag\" was not injected: check your FXML file 'editProblem1.fxml'.";
        assert problems != null : "fx:id=\"problems\" was not injected: check your FXML file 'editProblem1.fxml'.";
    }
}
