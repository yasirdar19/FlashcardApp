package com.example.finalproject;

public class HardcodedCardLoader implements CardLoader {
    @Override
    public Flashcard[] loadCards() {
        return new Flashcard[] {
                new Flashcard("What is the capital of France?", "Paris"),
                new Flashcard("What is 2 + 2?", "4"),
                new Flashcard("What color is the sky on a clear day?", "Blue"),
                new Flashcard("Who wrote 'Romeo and Juliet'?", "William Shakespeare")
                new Flashcard("Where is NCF located? ", "Sarasota, Fl"),
        };
    }
}
