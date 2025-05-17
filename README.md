# 🧠 Flashcard Quiz App

A simple JavaFX desktop application that allows users to review flashcards one by one. Built as a final project for an Object-Oriented Programming course, this project demonstrates encapsulation, inheritance, modular class design, and JavaFX event-driven GUI development.

---

## 📋 Features

- View flashcards one at a time
- Click **“Next”** to load a new flashcard
- Click **“Show Answer”** to reveal the answer
- Flashcards loop back after the last card
- Clean and styled interface using JavaFX controls

---

## 🧱 Class Structure

| Class | Description |
|-------|-------------|
| `Flashcard` | Holds a question and its answer |
| `FlashcardSet` | Manages a list of flashcards and cycling logic |
| `CardLoader` | Interface to allow various flashcard loading methods |
| `HardcodedCardLoader` | Implements `CardLoader`, loads static flashcards |
| `FlashcardApp` | Main JavaFX application with GUI layout and logic |

---

## 🧠 OOP Concepts Demonstrated

- **Encapsulation**: All class fields are private with getters/setters
- **Inheritance**: Interface (`CardLoader`) implemented by `HardcodedCardLoader`
- **Polymorphism**: Can add other loader types (e.g., from file) by implementing `CardLoader`
- **Modularity**: Code is split cleanly across multiple responsibility-driven classes
- **Event Handling**: JavaFX buttons use `setOnAction` for user interaction
- **Loops & Logic**: For loop is used for card loading, logic is not inline

---

## 🧪 Technologies

- Java 17  
- JavaFX 17  
- IntelliJ IDEA  
- Maven (build system)

---

## 🚀 How to Run

### In IntelliJ IDEA:

1. Clone the repository:
   ```bash
   git clone https://github.com/yasirdar19/FlashcardApp.git
   cd FlashcardApp
