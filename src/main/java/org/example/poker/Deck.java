package org.example.poker;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private static final String[] cardType = {"A", "B", "C", "D"};
    private static final int[] cardNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    List<Card> cardList = new ArrayList<>();

    public void shuffle() {
        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * 51 + 1);

            Card temp = cardList.getFirst();
            cardList.set(0, cardList.get(random));
            cardList.set(random, temp);
        }
//        Collections.shuffle(cardList);
    }

    public Deck() {
        initDeck();
    }

    private void initDeck() {
        cardList.clear();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                Card card = new Card(cardNumbers[j], cardType[i]);
                this.cardList.add(card);
            }
        }
    }

    public void drawCard() {
        Card first = cardList.getFirst();
        System.out.println(first);
        cardList.remove(first);
    }

    public void printCardList() {
        System.out.println(cardList);
    }

}
