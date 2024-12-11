package org.example.poker;

public class Card {

    int number;
    String type;

    public Card(int number, String type) {
        this.number = number;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", type='" + type + '\'' +
                '}';
    }
}
