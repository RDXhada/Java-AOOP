package vue;

import java.net.URL;
import java.util.ResourceBundle;

import blogic.Animal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller {
    private AnimalInstance[] neshtosi;
    private Animal[] samples;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnDistribution;

    @FXML
    private Button btnQuit;

    @FXML
    private Button btnShowByAge;

    @FXML
    private Button btnShowEndangered;

    @FXML
    private Button btnShuffle;

    @FXML
    private TextArea textResults;

    @FXML
    void btnDistributionOnClick(ActionEvent event) {

    }

    @FXML
    void btnQuitOnClick(ActionEvent event) {

    }

    @FXML
    void btnShowEndangered(ActionEvent event) {

    }

    @FXML
    void btnShuffleOnClick(ActionEvent event) {

    }

    @FXML
    void btwShowByAgeOnClick(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnDistribution != null : "fx:id=\"btnDistribution\" was not injected: check your FXML file 'Untitled'.";
        assert btnQuit != null : "fx:id=\"btnQuit\" was not injected: check your FXML file 'Untitled'.";
        assert btnShowByAge != null : "fx:id=\"btnShowByAge\" was not injected: check your FXML file 'Untitled'.";
        assert btnShowEndangered != null : "fx:id=\"btnShowEndangered\" was not injected: check your FXML file 'Untitled'.";
        assert btnShuffle != null : "fx:id=\"btnShuffle\" was not injected: check your FXML file 'Untitled'.";
        assert textResults != null : "fx:id=\"textResults\" was not injected: check your FXML file 'Untitled'.";

    }
    Random
}
