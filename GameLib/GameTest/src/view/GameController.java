package view;

import java.net.URL;
import java.util.ResourceBundle;

import game.EuchreGame;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class GameController {

    private EuchreGame game;
    boolean hasDealt;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnDealHands;

    @FXML
    private Button btnHasKQJ;

    @FXML
    private Button btnPairTrumps;

    @FXML
    private Button btnQuit;

    @FXML
    private TextArea cardsTextArea;

    @FXML
    private Label pointsLabel;

    @FXML
    void btnDealHandsOnClick(ActionEvent event) {
        boolean hasCards = game.dealHand();
        hasDealt = true;

        if (hasCards) {
            cardsTextArea.setText(game.printCards());
            pointsLabel.setText("Точки: " + game.countHandStrength());
        } else {
            cardsTextArea.setText("");
            pointsLabel.setText("Точки: 0");

            Alert alert = new Alert(Alert.AlertType.ERROR, "Тестето свърши!", ButtonType.OK);
            alert.showAndWait();
        }
    }

    @FXML
    void btnHasKQJOnClick(ActionEvent event) {
        if (!hasDealt) {
            dealCardsAlert();
            return;
        }

        String cardInfo = game.printCards() + String.format("%n%nВ ръката %s тройка KING, QUEEN, Jack.",
                game.hasJackQueenKing() ? "има" : "няма");

        cardsTextArea.setText(cardInfo);
    }

    @FXML
    void btnPairTrumpsOnClick(ActionEvent event) {
        if (!hasDealt) {
            dealCardsAlert();
            return;
        }

        String cardInfo = game.printCards() + String.format("%n%nВ ръката %s двойка Козове.",
                game.hasJackQueenKing() ? "има" : "няма");

        cardsTextArea.setText(cardInfo);
    }

    @FXML
    void btnQuitOnClick(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void initialize() {
        assert btnDealHands != null : "fx:id=\"btnDealHands\" was not injected: check your FXML file 'GameScene.fxml'.";
        assert btnHasKQJ != null : "fx:id=\"btnHasKQJ\" was not injected: check your FXML file 'GameScene.fxml'.";
        assert btnPairTrumps != null : "fx:id=\"btnPairTrumps\" was not injected: check your FXML file 'GameScene.fxml'.";
        assert btnQuit != null : "fx:id=\"btnQuit\" was not injected: check your FXML file 'GameScene.fxml'.";
        assert cardsTextArea != null : "fx:id=\"cardsTextArea\" was not injected: check your FXML file 'GameScene.fxml'.";
        assert pointsLabel != null : "fx:id=\"pointsLabel\" was not injected: check your FXML file 'GameScene.fxml'.";

        game = new EuchreGame();
        game.shuffleCards();
        hasDealt = false;
    }

    private void dealCardsAlert() {
        Alert alert = new Alert(Alert.AlertType.WARNING, "Трябва първо да се раздадат карти!", ButtonType.OK);
        alert.showAndWait();
    }
}
