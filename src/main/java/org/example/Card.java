package org.example;

public class Card {
//    String[] suits = {"♥","♧","♦","♤"};
//    String[] cards = {2,3,4,5,6,7,8,9,10,J,Q,K,A};
    private String cardSuit;
    private String cardFace;
    private int cardValue;

    public Card(String cardSuit, String cardFace, int cardValue) {
        this.cardSuit = cardSuit;
        this.cardFace = cardFace;
        this.cardValue = cardValue;
    }

    public String getCardFace() {
        return cardFace;
    }
    public String getCardSuit() {
        return cardSuit;
    }
    public int getCardValue() {
        return cardValue;
    }

}
// each card