package org.example.poker;

public class PokerRunner {

    public static void main(String[] args) {

        Deck deck = new Deck();

        deck.printCardList();
        deck.shuffle();
        deck.printCardList();
        deck.drawCard();
        deck.printCardList();


    }

}
