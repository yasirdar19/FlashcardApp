package com.example.finalproject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FlashcardApp extends Application {

    private Label questionLabel;
    private Label answerLabel;
    private Button showAnswerButton;
    private Button nextButton;
    private FlashcardSet flashcardSet;
    private Flashcard currentCard;

    @Override
    public void start(Stage primaryStage) {
        questionLabel = new Label("Click 'Next' to start the quiz.");
        answerLabel = new Label("");

        questionLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");
        answerLabel.setStyle("-fx-font-size: 16px; -fx-text-fill: #3a3a3a;");

        showAnswerButton = new Button("Show Answer");
        nextButton = new Button("Next");

        showAnswerButton.setPrefWidth(120);
        nextButton.setPrefWidth(120);

        showAnswerButton.setStyle("-fx-background-color: #06a80d; -fx-text-fill: white;");
        nextButton.setStyle("-fx-background-color: #2196F3; -fx-text-fill: white;");

        showAnswerButton.setOnAction(e -> {
            if (currentCard != null) {
                answerLabel.setText(currentCard.getAnswer());
            }
        });

        nextButton.setOnAction(e -> {
            currentCard = flashcardSet.getNextCard();
            if (currentCard != null) {
                questionLabel.setText(currentCard.getQuestion());
                answerLabel.setText("");
            }
        });

        CardLoader loader = new HardcodedCardLoader();
        flashcardSet = new FlashcardSet();
        for (Flashcard card : loader.loadCards()) {
            flashcardSet.addCard(card);
        }

        VBox layout = new VBox(15, questionLabel, answerLabel, showAnswerButton, nextButton);
        layout.setStyle("-fx-padding: 20; -fx-alignment: center; -fx-background-color: #f0f0f0;");

        Scene scene = new Scene(layout, 450, 250);
        primaryStage.setTitle("  Flashcard Quiz App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
