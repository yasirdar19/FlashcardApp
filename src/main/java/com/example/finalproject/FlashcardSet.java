package com.example.finalproject;

import java.util.ArrayList;
import java.util.List;

public class FlashcardSet {
    private List<Flashcard> cards = new ArrayList<>();
    private int currentIndex = 0;

    public void addCard(Flashcard card) {
        cards.add(card);
    }

    public Flashcard getNextCard() {
        if (cards.isEmpty()) return null;
        Flashcard card = cards.get(currentIndex);
        currentIndex = (currentIndex + 1) % cards.size();
        return card;
    }
}
