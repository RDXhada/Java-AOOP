package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button AceAndKingbtn;

    @FXML
    private TextArea fieldHand;

    @FXML
    private Button handBtn;

    @FXML
    private Button hassix10btn;

    @FXML
    private Button quitBtn;

    @FXML
    void AceAndKingbtnOnClick(ActionEvent event) {

    }

    @FXML
    void handBtnOnClick(ActionEvent event) {

    }

    @FXML
    void hassix10btnOnClick(ActionEvent event) {

    }

    @FXML
    void quitBtnOnClick(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert AceAndKingbtn != null : "fx:id=\"AceAndKingbtn\" was not injected: check your FXML file 'GameScene.fxml'.";
        assert fieldHand != null : "fx:id=\"fieldHand\" was not injected: check your FXML file 'GameScene.fxml'.";
        assert handBtn != null : "fx:id=\"handBtn\" was not injected: check your FXML file 'GameScene.fxml'.";
        assert hassix10btn != null : "fx:id=\"hassix10btn\" was not injected: check your FXML file 'GameScene.fxml'.";
        assert quitBtn != null : "fx:id=\"quitBtn\" was not injected: check your FXML file 'GameScene.fxml'.";

    }

}
