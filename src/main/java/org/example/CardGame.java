package org.example;

import java.util.ArrayList;

public class CardGame {
    static String[] suits = {"♥","♧","♦","♤"};
    static String[] cards = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

    static ArrayList<Card> deckOfCards = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++){
            for (int i2 = 0; i2 < 13; i2++) {
                Card card = new Card(suits[i],cards[i2],(i2+2));
                deckOfCards.add(card);
            }
        }
        System.out.println(deckOfCards.toString());
    }
}
